package com.yet.response;

import lombok.Data;

import static com.yet.response.ResponseStatus.FAIL;
import static com.yet.response.ResponseStatus.SUCCESS;

/**
 * @author Ekko
 * @description ResponseResponseResult
 * @datetime 2022 07 01
 */
@Data
public class ResponseResult<T> {
  /** 返回状态 */
  private Boolean flag;
  /** 返回码 */
  private Integer code;
  /** 返回信息 */
  private String message;
  /** 返回数据 */
  private T data;

  public static <T> ResponseResult<T> ok() {
    return restResponseResult(true, null, SUCCESS.getCode(), SUCCESS.getMessage());
  }

  public static <T> ResponseResult<T> ok(T data) {
    return restResponseResult(true, data, SUCCESS.getCode(), SUCCESS.getMessage());
  }

  public static <T> ResponseResult<T> ok(T data, String message) {
    return restResponseResult(true, data, SUCCESS.getCode(), message);
  }

  public static <T> ResponseResult<T> fail() {
    return restResponseResult(false, null, FAIL.getCode(), FAIL.getMessage());
  }

  public static <T> ResponseResult<T> fail(ResponseStatus responseStatus) {
    return restResponseResult(false, null, responseStatus.getCode(), responseStatus.getMessage());
  }

  public static <T> ResponseResult<T> fail(String message) {
    return restResponseResult(false, message);
  }

  public static <T> ResponseResult<T> fail(T data) {
    return restResponseResult(false, data, FAIL.getCode(), FAIL.getMessage());
  }

  public static <T> ResponseResult<T> fail(T data, String message) {
    return restResponseResult(false, data, FAIL.getCode(), message);
  }

  public static <T> ResponseResult<T> fail(Integer code, String message) {
    return restResponseResult(false, null, code, message);
  }

  private static <T> ResponseResult<T> restResponseResult(Boolean flag, String message) {
    ResponseResult<T> responseResult = new ResponseResult<>();
    responseResult.setFlag(flag);
    responseResult.setCode(flag ? SUCCESS.getCode() : FAIL.getCode());
    responseResult.setMessage(message);
    return responseResult;
  }

  private static <T> ResponseResult<T> restResponseResult(
      Boolean flag, T data, Integer code, String message) {
    ResponseResult<T> responseResult = new ResponseResult<>();
    responseResult.setFlag(flag);
    responseResult.setData(data);
    responseResult.setCode(code);
    responseResult.setMessage(message);
    return responseResult;
  }
}
