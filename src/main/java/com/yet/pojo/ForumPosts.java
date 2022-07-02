package com.yet.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 帖子表
 * @TableName forum_posts
 */
@TableName(value ="forum_posts")
@Data
public class ForumPosts implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 审核状态
     */
    @TableField(value = "audit_state")
    private String auditState;

    /**
     * 类别
     */
    @TableField(value = "category")
    private String category;

    /**
     * 作者ID
     */
    @TableField(value = "author_id")
    private Long authorId;

    /**
     * 标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 内容类型
     */
    @TableField(value = "content_type")
    private String contentType;

    /**
     * markdown内容
     */
    @TableField(value = "markdown_content")
    private String markdownContent;

    /**
     * html内容
     */
    @TableField(value = "html_content")
    private String htmlContent;

    /**
     * 浏览量
     */
    @TableField(value = "views")
    private Long views;

    /**
     * 点赞量/收藏量
     */
    @TableField(value = "approvals")
    private Long approvals;

    /**
     * 评论量
     */
    @TableField(value = "comments")
    private Long comments;

    /**
     * 文章类型ID
     */
    @TableField(value = "type_id")
    private Long typeId;

    /**
     * 文章头图
     */
    @TableField(value = "head_img")
    private String headImg;

    /**
     * 官方
     */
    @TableField(value = "official")
    private Integer official;

    /**
     * 置顶
     */
    @TableField(value = "top")
    private Integer top;

    /**
     * 排序
     */
    @TableField(value = "sort")
    private Integer sort;

    /**
     * 精华
     */
    @TableField(value = "marrow")
    private Integer marrow;

    /**
     * 问答最佳答案ID
     */
    @TableField(value = "comment_id")
    private Long commentId;

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