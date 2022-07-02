package com.yet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yet.pojo.ForumTagPostsMapping;
import com.yet.service.ForumTagPostsMappingService;
import com.yet.mapper.ForumTagPostsMappingMapper;
import org.springframework.stereotype.Service;

/**
* @author YETAO
* @description 针对表【forum_tag_posts_mapping(标签-帖子关系表)】的数据库操作Service实现
* @createDate 2022-07-02 01:14:16
*/
@Service
public class ForumTagPostsMappingServiceImpl extends ServiceImpl<ForumTagPostsMappingMapper, ForumTagPostsMapping>
    implements ForumTagPostsMappingService {

}




