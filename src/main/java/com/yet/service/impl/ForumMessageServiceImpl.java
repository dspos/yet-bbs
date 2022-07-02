package com.yet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yet.pojo.ForumMessage;
import com.yet.service.ForumMessageService;
import com.yet.mapper.ForumMessageMapper;
import org.springframework.stereotype.Service;

/**
* @author YETAO
* @description 针对表【forum_message(消息表)】的数据库操作Service实现
* @createDate 2022-07-02 01:14:16
*/
@Service
public class ForumMessageServiceImpl extends ServiceImpl<ForumMessageMapper, ForumMessage>
    implements ForumMessageService {

}




