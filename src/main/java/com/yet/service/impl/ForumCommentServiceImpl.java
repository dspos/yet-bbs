package com.yet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yet.pojo.ForumComment;
import com.yet.service.ForumCommentService;
import com.yet.mapper.ForumCommentMapper;
import org.springframework.stereotype.Service;

/**
* @author YETAO
* @description 针对表【forum_comment(帖子评论表)】的数据库操作Service实现
* @createDate 2022-07-02 01:14:16
*/
@Service
public class ForumCommentServiceImpl extends ServiceImpl<ForumCommentMapper, ForumComment>
    implements ForumCommentService{

}




