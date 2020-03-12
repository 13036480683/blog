package com.xx.blog.util;


import com.xx.blog.util.constant.RespCode;
import com.xx.blog.vo.ResponseVo;
import org.springframework.stereotype.Component;


/**
 * 封装数据
 */
@Component
public class ControllerUtil {
    public static <T> ResponseVo getSuccessData(T data) {
        ResponseVo responseVo = new ResponseVo();
        if (null != data) {
            responseVo.success(data);
        }else {
            responseVo.error(RespCode.FAILURE_CODE,"获得数据为空",null);
        }

        return responseVo;
    }

    public static <T> ResponseVo getFalseData() {
        ResponseVo responseVo = new ResponseVo();
        responseVo.error(RespCode.FAILURE_CODE, "获得数据为空", null);
        return responseVo;
    }

//    public static <T> ResponseVo
}
