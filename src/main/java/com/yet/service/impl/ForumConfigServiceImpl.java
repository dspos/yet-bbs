package com.yet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yet.pojo.ForumConfig;
import com.yet.service.ForumConfigService;
import com.yet.mapper.ForumConfigMapper;
import org.springframework.stereotype.Service;

/**
* @author YETAO
* @description 针对表【forum_config(配置表)】的数据库操作Service实现
* @createDate 2022-07-02 01:14:16
*/
@Service
public class ForumConfigServiceImpl extends ServiceImpl<ForumConfigMapper, ForumConfig>
    implements ForumConfigService{

}




