package com.yet.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @author Ekko
 * @description ForumUserDto
 * @datetime 2022 07 02
 */
@Data
public class ForumUserDto {

  /** 邮箱 */
  @NotBlank(message = "email is can not null")
  @Pattern(
      regexp = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*",
      message = "please enter the correct email address")
  @TableField(value = "email")
  private String email;

  /** 昵称 */
  @NotBlank(message = "nickname is can not null")
  @TableField(value = "nickname")
  private String nickname;

  /** 密码 */
  @NotBlank(message = "password is can not null")
  @TableField(value = "password")
  private String password;
}
