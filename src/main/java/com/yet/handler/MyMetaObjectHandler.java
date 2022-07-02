package com.yet.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author Ekko
 * @description MyMetaObjectHandler
 * @datetime 2022 07 02
 */
@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

  @Override
  public void insertFill(MetaObject metaObject) {
    log.info("start insert fill ...");
    this.strictInsertFill(metaObject, "role", String.class, "USER");
    this.strictInsertFill(metaObject, "state", String.class, "DISABLE");
    this.strictInsertFill(metaObject, "sex", String.class, "UNKNOWN");
    this.strictInsertFill(metaObject, "createAt", LocalDateTime.class, LocalDateTime.now());
    this.strictInsertFill(metaObject, "updateAt", LocalDateTime.class, LocalDateTime.now());
    this.strictInsertFill(metaObject, "lastLoginTime", LocalDateTime.class, LocalDateTime.now());
  }

  @Override
  public void updateFill(MetaObject metaObject) {
    log.info("start update fill ...");
    this.strictUpdateFill(metaObject, "updateAt", LocalDateTime.class, LocalDateTime.now());
    this.strictUpdateFill(metaObject, "lastLoginTime", LocalDateTime.class, LocalDateTime.now());
  }
}
