package com.titan.controller.doctor;

import com.titan.pojo.entity.DoctorInfoEntity;
import com.titan.service.doctor.DoctorInfoIService;
import com.titan.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 醫生信息交互層
 * @author yigeoooo
 * @since date 2023/12/16
 */
@RestController
@RequestMapping("/api/doctorInfo")
public class DoctorInfoController {

    @Autowired
    private DoctorInfoIService doctorInfoIService;

    /**
     * 增加醫生信息
     * @param doctorInfoEntity
     * @return Result
     */
    @PostMapping("/add")
    public Result addDoctor(@RequestBody DoctorInfoEntity doctorInfoEntity){
        try {
            doctorInfoIService.add(doctorInfoEntity);
            return Result.build(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.build(500, "500", "出現異常", false);
    }

}
