package com.yet.pojo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/** 用户表 @TableName forum_user */
@TableName(value = "forum_user")
@Data
public class ForumUser implements Serializable {
  /** 主键 */
  @TableId(value = "id", type = IdType.AUTO)
  private Long id;

  /** 邮箱 */
  @TableField(value = "email")
  private String email;

  /** 昵称 */
  @TableField(value = "nickname")
  private String nickname;

  /** 密码 */
  @TableField(value = "password")
  private String password;

  /** 角色 */
  @TableField(value = "role", fill = FieldFill.INSERT)
  private String role;

  /** 状态 */
  @TableField(value = "state", fill = FieldFill.INSERT)
  private String state;

  /** 性别 */
  @TableField(value = "sex", fill = FieldFill.INSERT)
  private String sex;

  /** 来源 */
  @TableField(value = "source")
  private String source;

  /** 头像 */
  @TableField(value = "avatar")
  private String avatar;

  /** 个人简介 */
  @TableField(value = "signature")
  private String signature;

  /** 最后登录时间 */
  @TableField(value = "last_login_time", fill = FieldFill.INSERT_UPDATE)
  private LocalDateTime lastLoginTime;

  /** 删除标识（0:未删除、1:已删除） */
  @TableLogic
  @TableField(value = "is_delete")
  private Integer isDelete;

  /** 记录创建时间 */
  @TableField(value = "create_at", fill = FieldFill.INSERT)
  private LocalDateTime createAt;

  /** 记录修改时间 */
  @TableField(value = "update_at", fill = FieldFill.INSERT_UPDATE)
  private LocalDateTime updateAt;

  /** 扩展信息 */
  @TableField(value = "ext")
  private byte[] ext;

  @TableField(exist = false)
  private static final long serialVersionUID = 1L;
}
