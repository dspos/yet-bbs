package com.yet.controller;

import com.yet.annotation.OperationLog;
import com.yet.dto.ForumUserDto;
import com.yet.response.ResponseResult;
import com.yet.service.ForumUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author Ekko
 * @description ForumUserController
 * @datetime 2022 07 02
 */
@RestController
@RequestMapping("api/forum/user")
public class ForumUserController {

  private final ForumUserService forumUserService;

  public ForumUserController(ForumUserService forumUserService) {
    this.forumUserService = forumUserService;
  }

  // todo 用户登录
  @PostMapping("login")
  public ResponseResult<String> login(@RequestBody ForumUserDto forumUserDto) {
    return ResponseResult.ok();
  }

  // todo 用户注册
  @OperationLog(optMod = "用户模块",optType = "add", optDesc = "用户注册")
  @PostMapping("register")
  public ResponseResult<String> register(@Valid @RequestBody ForumUserDto forumUserDto) {
    forumUserService.register(forumUserDto);
    return ResponseResult.ok();
  }

  @PostMapping("github/login")
  public ResponseResult<String> githubLogin() {
    return ResponseResult.ok();
  }
}
