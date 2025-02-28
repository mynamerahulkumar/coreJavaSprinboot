package com.corejava.corejavasprinboot.threads;

import java.util.concurrent.CompletableFuture;

/**
 * CompletableFuture is a more flexible alternative to Future, allowing non-blocking asynchronous computation with chaining.
 *
 * Unlike Future, it does not block the main thread and allows chaining operations.
 */
public class CompletableFuture10 {
    public static void main(String[] args) {
        // Run task asynchronously
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try { Thread.sleep(2000); } catch (InterruptedException e) {}
            System.out.println("CompletableFuture");
            return "Hello from CompletableFuture!";
        });

        System.out.println("Doing other work while the task runs...");

        // Non-blocking: Chain a task to transform the result
        future.thenApply(result -> "Processed: " + result)
                .thenAccept(System.out::println);
        System.out.println("Doint other task 2");
        // Prevent main thread from exiting immediately
        future.join();
    }
}
