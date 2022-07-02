package com.yet.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Ekko
 * @description BusinessException
 * @datetime 2022 07 01
 */
@Getter
@AllArgsConstructor
public class BusinessException extends RuntimeException {

  private Integer code;

  private String message;
}
