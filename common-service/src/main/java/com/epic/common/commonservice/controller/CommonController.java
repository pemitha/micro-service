package com.epic.common.commonservice.controller;

import com.epic.common.commonservice.bean.CommonConfig;
import com.epic.common.commonservice.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This class contains
 *
 * @author : Shashika Kalatuwawa
 */
@RestController
public class CommonController {
    
    @Autowired
    private Config config;
    
    @GetMapping("/common-config")
    public CommonConfig getCommonConfig(){
        return new CommonConfig(config.getMinimum(), config.getMaximum());
    }
    
}
