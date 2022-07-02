package com.yet.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yet.dto.ForumUserDto;
import com.yet.exception.BusinessException;
import com.yet.pojo.ForumUser;
import com.yet.response.ResponseStatus;
import com.yet.service.ForumUserService;
import com.yet.mapper.ForumUserMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author YETAO
 * @description 针对表【forum_user(用户表)】的数据库操作Service实现
 * @createDate 2022-07-02 01:14:16
 */
@Service
public class ForumUserServiceImpl extends ServiceImpl<ForumUserMapper, ForumUser>
    implements ForumUserService {

  private final ForumUserMapper forumUserMapper;

  public ForumUserServiceImpl(ForumUserMapper forumUserMapper) {
    this.forumUserMapper = forumUserMapper;
  }

  @Override
  public void register(ForumUserDto forumUserDto) {
    var forumUser = new ForumUser();
    ForumUser existUser =
        forumUserMapper.selectOne(
            new LambdaQueryWrapper<ForumUser>().eq(ForumUser::getEmail, forumUserDto.getEmail()));
    if (Objects.nonNull(existUser)) {
      throw new BusinessException(ResponseStatus.FAIL.getCode(), "email already exists");
    }
    BeanUtils.copyProperties(forumUserDto, forumUser);
    forumUserMapper.insert(forumUser);
  }
}
