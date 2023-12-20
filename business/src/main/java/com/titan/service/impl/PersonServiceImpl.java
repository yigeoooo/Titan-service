package com.titan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.titan.mapper.PersonMapper;
import com.titan.pojo.entity.PersonEntity;
import com.titan.pojo.vo.BaseVo;
import com.titan.service.PersonIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 患者登录信息服务层
 * @author yigeoooo
 * @since date 2023/12/20
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, PersonEntity> implements PersonIService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public void register(BaseVo baseVo) {
        //构建对象
        PersonEntity personEntity = new PersonEntity();
        personEntity.setPersonId(baseVo.getId());
        personEntity.setPassword(baseVo.getPassword());
        personMapper.insert(personEntity);
    }

    @Override
    public boolean verify(BaseVo baseVo) {
        String pwd = baseVo.getPassword();
        String password = baseVo.getOldPassword();
        if (pwd.equals(password)) {
            return true;
        }
        return false;
    }
}
