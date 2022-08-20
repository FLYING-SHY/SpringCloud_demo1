package com.hua.study;

import java.time.ZonedDateTime;

/**
 * @author hyl
 * @version 2022.1
 * @date 2022/8/10 21:36
 */

public class T2 {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);

        //2022-08-10T21:37:47.613+08:00[Asia/Shanghai]
    }
}
