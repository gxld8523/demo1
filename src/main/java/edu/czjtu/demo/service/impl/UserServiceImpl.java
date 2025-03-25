package edu.czjtu.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.czjtu.demo.entity.User;
import edu.czjtu.demo.mapper.UserMapper;
import edu.czjtu.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
} 