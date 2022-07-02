package com.yet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yet.pojo.ForumArticleType;
import com.yet.service.ForumArticleTypeService;
import com.yet.mapper.ForumArticleTypeMapper;
import org.springframework.stereotype.Service;

/**
 * @author YETAO
 * @description 针对表【forum_article_type(文章类别表)】的数据库操作Service实现
 * @createDate 2022-07-02 01:14:16
 */
@Service
public class ForumArticleTypeServiceImpl extends ServiceImpl<ForumArticleTypeMapper, ForumArticleType>
        implements ForumArticleTypeService {

}




