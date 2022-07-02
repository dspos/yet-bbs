package com.yet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yet.pojo.ForumTag;
import com.yet.service.ForumTagService;
import com.yet.mapper.ForumTagMapper;
import org.springframework.stereotype.Service;

/**
* @author YETAO
* @description 针对表【forum_tag(标签表)】的数据库操作Service实现
* @createDate 2022-07-02 01:14:16
*/
@Service
public class ForumTagServiceImpl extends ServiceImpl<ForumTagMapper, ForumTag>
    implements ForumTagService{

}




