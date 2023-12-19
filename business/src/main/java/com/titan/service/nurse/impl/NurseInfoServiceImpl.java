package com.titan.service.nurse.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.titan.constant.CommonConstant;
import com.titan.mapper.nurse.NurseInfoMapper;
import com.titan.pojo.entity.NurseInfoEntity;
import com.titan.pojo.vo.NurseInfoVo;
import com.titan.service.nurse.NurseInfoIService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * 護士服務層實現類
 * @author yigeoooo
 * @since date 2023/12/16
 */
@Service
public class NurseInfoServiceImpl extends ServiceImpl<NurseInfoMapper, NurseInfoEntity> implements NurseInfoIService {

    @Autowired
    private NurseInfoMapper nurseInfoMapper;

    @Override
    public Page<NurseInfoEntity> page(NurseInfoVo nurseInfoVo) {
        //构建分页信息
        Page<NurseInfoEntity> page = new Page<>(nurseInfoVo.getPage(), nurseInfoVo.getSize());
        //构建条件构造器
        String nurseName = nurseInfoVo.getNurseName();
        String department = nurseInfoVo.getDepartment();
        QueryWrapper<NurseInfoEntity> query = new QueryWrapper<>();
        if (!StringUtils.isBlank(nurseName)) {
            query.eq(CommonConstant.Nurse.NURSE_NAME, nurseName);
        }
        if (!StringUtils.isBlank(department)) {
            query.eq(CommonConstant.Nurse.DEPARTMENT, department);
        }
        Page<NurseInfoEntity> nursePage = nurseInfoMapper.selectPage(page, query);
        return nursePage;
    }

    @Override
    public void insert(NurseInfoEntity nurseInfoDo) {
        //uuid僧成护士id
        UUID uuid = UUID.randomUUID();
        String nurseId = uuid.toString();
        nurseInfoDo.setNurseId(nurseId);
        nurseInfoMapper.insert(nurseInfoDo);
    }
}
