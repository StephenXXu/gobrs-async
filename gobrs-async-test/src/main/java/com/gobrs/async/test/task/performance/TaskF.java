package com.gobrs.async.test.task.performance;

import com.gobrs.async.core.TaskSupport;
import com.gobrs.async.core.anno.Task;
import com.gobrs.async.core.task.AsyncTask;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

/**
 * @program: performance-compare
 * @ClassName TaskA
 * @description:
 * @author: sizegang
 * @create: 2022-12-09
 **/
@Task
@Slf4j
public class TaskF extends AsyncTask {

    @SneakyThrows
    @Override
    public Object task(Object o, TaskSupport support) {
        log.info(this.getName() + " 使用线程---" + Thread.currentThread().getName());
        System.out.println("使用" + Thread.currentThread().getName());
        Thread.sleep(100);
        System.out.println("TaskF  使用线程---"+ Thread.currentThread().getName());
        return null;
    }
}
