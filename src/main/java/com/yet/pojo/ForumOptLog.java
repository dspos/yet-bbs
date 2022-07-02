package com.yet.pojo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/** 操作日志表 @TableName forum_opt_log */
@TableName(value = "forum_opt_log")
@Data
public class ForumOptLog implements Serializable {
  /** 主键 */
  @TableId(value = "id", type = IdType.AUTO)
  private Long id;

  /** 操作人ID */
  @TableField(value = "operator_id")
  private Long operatorId;

  /** 操作模块 */
  @TableField(value = "module")
  private String module;

  /** 操作类型 */
  @TableField(value = "type")
  private String type;

  /** 操作描述 */
  @TableField(value = "description")
  private String description;

  /** 请求参数 */
  @TableField(value = "request_param")
  private String requestParam;

  /** 响应参数 */
  @TableField(value = "response_param")
  private String responseParam;

  /** 操作方法 */
  @TableField(value = "method")
  private String method;

  /** 请求uri */
  @TableField(value = "uri")
  private String uri;

  /** 请求ip */
  @TableField(value = "ip")
  private String ip;

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

  @TableField(exist = false)
  private static final long serialVersionUID = 1L;
}
