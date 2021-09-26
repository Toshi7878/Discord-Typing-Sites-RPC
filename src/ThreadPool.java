package net.typingsites.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
  private static ExecutorService executorService = Executors.newFixedThreadPool(64);
  
  public static void run(Runnable runnable) {
    runAsync(runnable);
  }
  
  public static void runAsync(Runnable runnable) {
    executorService.execute(runnable);
  }
}
