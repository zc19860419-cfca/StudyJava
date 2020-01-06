package com.test.demo.staticDemo;


import com.test.demo.staticDemo.entry.StaticTest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class StaticDemo {

    private static final int MAX_THREAD_NUM = 5;

    public static void main(String[] args) {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(MAX_THREAD_NUM, MAX_THREAD_NUM, 8000L,
                TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>());
        List<Future> all = new ArrayList<>();
        for (int i = 0; i < MAX_THREAD_NUM; i++) {
            all.add(executor.submit(() -> new StaticTest()));

        }

        for (int i = 0; i < all.size(); i++) {
            try {
                all.get(i).get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        if (!executor.isShutdown()) {
            executor.shutdownNow();
        }
    }
}
