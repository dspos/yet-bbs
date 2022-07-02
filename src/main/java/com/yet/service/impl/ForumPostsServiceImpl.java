package com.yet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yet.pojo.ForumPosts;
import com.yet.service.ForumPostsService;
import com.yet.mapper.ForumPostsMapper;
import org.springframework.stereotype.Service;

/**
* @author YETAO
* @description 针对表【forum_posts(帖子表)】的数据库操作Service实现
* @createDate 2022-07-02 01:14:16
*/
@Service
public class ForumPostsServiceImpl extends ServiceImpl<ForumPostsMapper, ForumPosts>
    implements ForumPostsService{

}




