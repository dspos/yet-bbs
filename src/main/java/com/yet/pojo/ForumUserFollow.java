package com.yet.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 用户关注表
 * @TableName forum_user_follow
 */
@TableName(value ="forum_user_follow")
@Data
public class ForumUserFollow implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 被关注主体
     */
    @TableField(value = "followed")
    private Long followed;

    /**
     * 被关注主体类型
     */
    @TableField(value = "followed_type")
    private String followedType;

    /**
     * 关注人
     */
    @TableField(value = "follower")
    private Long follower;

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