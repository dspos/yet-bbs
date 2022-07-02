package com.yet.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Ekko
 * @description ResponseStatus
 * @datetime 2022 07 01
 */
@Getter
@AllArgsConstructor
public enum ResponseStatus {
  SUCCESS(200, "success"),
  FAIL(500, "failed"),

  HTTP_STATUS_200(200, "ok"),
  HTTP_STATUS_400(400, "request error"),
  HTTP_STATUS_401(401, "no authentication"),
  HTTP_STATUS_403(403, "no authorities"),
  HTTP_STATUS_500(500, "server error"),

  PARAMS_IS_INVALID(1001, "params is invalid"),
  PARAMS_IS_BLANK(1002, "params is blank"),

  SYSTEM_ERROR(5000, "system error");

  private final Integer code;

  private final String message;
}
