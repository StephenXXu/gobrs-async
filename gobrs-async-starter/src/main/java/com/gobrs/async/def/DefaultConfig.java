package com.gobrs.async.def;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @program: gobrs-async-core
 * @ClassName DefaultConfig
 * @description:
 * @author: sizegang
 * @create: 2022-03-26
 **/
public class DefaultConfig {
    public static final Integer THREADPOOLQUEUESIZE = 10000;
    public static final Long KEEPALIVETIME = 30000L;
    public static final Long EXECUTETIMEOUT = 10000L;
}