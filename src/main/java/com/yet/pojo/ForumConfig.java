package com.yet.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 配置表
 * @TableName forum_config
 */
@TableName(value ="forum_config")
@Data
public class ForumConfig implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 状态
     */
    @TableField(value = "state")
    private String state;

    /**
     * 类型
     */
    @TableField(value = "type")
    private String type;

    /**
     * 名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 内容
     */
    @TableField(value = "content")
    private String content;

    /**
     * 开始时间
     */
    @TableField(value = "start_at")
    private LocalDateTime startAt;

    /**
     * 结束时间
     */
    @TableField(value = "end_at")
    private LocalDateTime endAt;

    /**
     * 创建人ID
     */
    @TableField(value = "creator")
    private Long creator;

    /**
     * 删除标识（0:未删除、1:已删除）
     */
    @TableField(value = "is_delete")
    private Integer isDelete;

    /**
     * 记录创建时间
     */
    @TableField(value = "create_at")
    private LocalDateTime createAt;

    /**
     * 记录修改时间
     */
    @TableField(value = "update_at")
    private LocalDateTime updateAt;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}