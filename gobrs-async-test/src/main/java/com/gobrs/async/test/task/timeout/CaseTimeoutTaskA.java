package com.gobrs.async.test.task.timeout;

import com.gobrs.async.core.TaskSupport;
import com.gobrs.async.core.anno.Task;
import com.gobrs.async.core.task.AsyncTask;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

/**
 * The type A service.
 *
 * @program: gobrs -async-starter
 * @description:
 * @author: sizegang
 * @create: 2022 -03-20
 */
@Slf4j
@Task(failSubExec = true, timeoutInMilliseconds = 300)
public class CaseTimeoutTaskA extends AsyncTask {

    /**
     * The .
     */
    int i = 10000;

    @Override
    public void prepare(Object o) {
        log.info(this.getName() + " 使用线程---" + Thread.currentThread().getName());
    }

    @SneakyThrows
    @Override
    public String task(Object o, TaskSupport support) {

        System.out.println("CaseTimeoutTaskA Begin");
        Thread.sleep(400);
        for (int i1 = 0; i1 < i; i1++) {
            i1 += i1;
        }
        System.out.println("CaseTimeoutTaskA Finish");
        return "result";
    }

    @Override
    public boolean necessary(Object o, TaskSupport support) {
        return true;
    }


    @Override
    public void onSuccess(TaskSupport support) {

    }

}
