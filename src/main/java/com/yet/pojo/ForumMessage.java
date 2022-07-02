package com.yet.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 消息表
 * @TableName forum_message
 */
@TableName(value ="forum_message")
@Data
public class ForumMessage implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 发送渠道
     */
    @TableField(value = "channel")
    private String channel;

    /**
     * 消息类型
     */
    @TableField(value = "type")
    private String type;

    /**
     * 是否已读
     */
    @TableField(value = "read")
    private String read;

    /**
     * 发送人类型
     */
    @TableField(value = "sender_type")
    private String senderType;

    /**
     * 发送人
     */
    @TableField(value = "sender")
    private String sender;

    /**
     * 接收人类型
     */
    @TableField(value = "receiver_type")
    private String receiverType;

    /**
     * 接收人
     */
    @TableField(value = "receiver")
    private String receiver;

    /**
     * 标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 发送内容类型
     */
    @TableField(value = "content_type")
    private String contentType;

    /**
     * 发送内容
     */
    @TableField(value = "content")
    private String content;

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