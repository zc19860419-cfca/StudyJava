package com.test.demo.staticDemo.entry;

/**
 * @author zhangchong
 * @CodeReviewer zhangqingan
 * @Description
 */
public class StaticTest {

    static {
        int i = 0;
        System.out.println("StaticTest:" + i++);
    }
}
