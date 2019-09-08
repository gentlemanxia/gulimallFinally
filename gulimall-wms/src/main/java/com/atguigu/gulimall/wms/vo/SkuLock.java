package com.atguigu.gulimall.wms.vo;

import io.swagger.models.auth.In;
import lombok.Data;

@Data
public class SkuLock {


        private Long skuId;
        private Long wareId;
        private Integer locked;
        private Boolean success;
        private String orderToken;
}
