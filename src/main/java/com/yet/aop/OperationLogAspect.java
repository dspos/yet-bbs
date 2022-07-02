package com.yet.aop;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yet.annotation.OperationLog;
import com.yet.mapper.ForumOptLogMapper;
import com.yet.pojo.ForumOptLog;
import com.yet.util.IPUtil;
import lombok.SneakyThrows;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Optional;

/**
 * @author Ekko
 * @description OperationLogAspect
 * @datetime 2022 07 03
 */
@Aspect
@Component
public class OperationLogAspect {

  private final ForumOptLogMapper forumOptLogMapper;

  public OperationLogAspect(ForumOptLogMapper forumOptLogMapper) {
    this.forumOptLogMapper = forumOptLogMapper;
  }

  @Pointcut("@annotation(com.yet.annotation.OperationLog)")
  public void operationLogPointCut() {}

  @SneakyThrows
  @AfterReturning(value = "operationLogPointCut()", returning = "keys")
  public void saveOperationLog(JoinPoint joinPoint, Object keys) {
    RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
    HttpServletRequest httpServletRequest =
        (HttpServletRequest)
            Objects.requireNonNull(requestAttributes)
                .resolveReference(RequestAttributes.REFERENCE_REQUEST);

    ForumOptLog forumOptLog = new ForumOptLog();
    MethodSignature signature = (MethodSignature) joinPoint.getSignature();
    Method method = signature.getMethod();
    OperationLog operationLog = method.getAnnotation(OperationLog.class);
    Optional.ofNullable(operationLog)
        .map(
            log -> {
              forumOptLog.setType(log.optType());
              forumOptLog.setModule(log.optMod());
              forumOptLog.setDescription(log.optDesc());
              return forumOptLog;
            });
    String className = joinPoint.getTarget().getClass().getName();
    String methodName = method.getName();
    methodName = className + "." + methodName;
    forumOptLog.setOperatorId(1L);
    forumOptLog.setMethod(methodName);
    forumOptLog.setRequestParam(new ObjectMapper().writeValueAsString(joinPoint.getArgs()));
    forumOptLog.setResponseParam(new ObjectMapper().writeValueAsString(keys));
    forumOptLog.setUri(Objects.requireNonNull(httpServletRequest).getRequestURI());
    forumOptLog.setIp(IPUtil.getIpAddress(httpServletRequest));
    forumOptLogMapper.insert(forumOptLog);
  }
}
