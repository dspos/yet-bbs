package com.yet.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 帖子评论表
 * @TableName forum_comment
 */
@TableName(value ="forum_comment")
@Data
public class ForumComment implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 评论人ID
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 被评论ID
     */
    @TableField(value = "reply_id")
    private Long replyId;

    /**
     * 二次被评论ID
     */
    @TableField(value = "reply_reply_id")
    private Long replyReplyId;

    /**
     * 帖子ID
     */
    @TableField(value = "posts_id")
    private Long postsId;

    /**
     * 内容
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