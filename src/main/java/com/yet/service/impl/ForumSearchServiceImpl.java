package com.yet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yet.pojo.ForumSearch;
import com.yet.service.ForumSearchService;
import com.yet.mapper.ForumSearchMapper;
import org.springframework.stereotype.Service;

/**
* @author YETAO
* @description 针对表【forum_search(搜索内容表)】的数据库操作Service实现
* @createDate 2022-07-02 01:14:16
*/
@Service
public class ForumSearchServiceImpl extends ServiceImpl<ForumSearchMapper, ForumSearch>
    implements ForumSearchService{

}




