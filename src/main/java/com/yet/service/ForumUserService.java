package com.yet.service;

import com.yet.dto.ForumUserDto;
import com.yet.pojo.ForumUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author YETAO
 * @description 针对表【forum_user(用户表)】的数据库操作Service
 * @createDate 2022-07-02 01:14:16
 */
public interface ForumUserService extends IService<ForumUser> {

  void register(ForumUserDto forumUserDto);
}
