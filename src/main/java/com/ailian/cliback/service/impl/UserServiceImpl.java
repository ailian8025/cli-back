package com.ailian.cliback.service.impl;

import com.ailian.cliback.mapper.UmsAdminMapper;
import com.ailian.cliback.model.UmsAdmin;
import com.ailian.cliback.model.UmsAdminExample;
import com.ailian.cliback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UmsAdminMapper umsAdminMapper;


    @Override
    public List<UmsAdmin> getAllUser() {
        return umsAdminMapper.selectByExample(new UmsAdminExample());
    }
}
