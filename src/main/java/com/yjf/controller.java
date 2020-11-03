package com.yjf;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: controller
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/11/3 10:32
 */
@RestController
public class controller {

    @GetMapping("/go")
    public String go() {
        return "gogogo!!!";
    }

}
