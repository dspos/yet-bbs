package com.yet.exception;

import com.yet.response.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Objects;

import static com.yet.response.ResponseStatus.PARAMS_IS_INVALID;
import static com.yet.response.ResponseStatus.SYSTEM_ERROR;

/**
 * @author Ekko
 * @description GlobalExceptionHandler
 * @datetime 2022 07 01
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(Exception.class)
  public ResponseResult<?> handleException(Exception e) {
    log.error(e.getMessage());
    return ResponseResult.fail(SYSTEM_ERROR.getCode(), SYSTEM_ERROR.getMessage());
  }

  @ExceptionHandler(BusinessException.class)
  public ResponseResult<?> handleException(BusinessException e) {
    log.error(e.getMessage());
    return ResponseResult.fail(e.getCode(), e.getMessage());
  }

  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseResult<?> handleException(MethodArgumentNotValidException e) {
    log.error(e.getMessage());
    return ResponseResult.fail(
        PARAMS_IS_INVALID.getCode(),
        Objects.requireNonNull(e.getBindingResult().getFieldError()).getDefaultMessage());
  }
}
