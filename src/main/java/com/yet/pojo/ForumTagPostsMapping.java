package com.yet.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 标签-帖子关系表
 * @TableName forum_tag_posts_mapping
 */
@TableName(value ="forum_tag_posts_mapping")
@Data
public class ForumTagPostsMapping implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 标签ID
     */
    @TableField(value = "tag_id")
    private Long tagId;

    /**
     * 帖子ID
     */
    @TableField(value = "posts_id")
    private Long postsId;

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