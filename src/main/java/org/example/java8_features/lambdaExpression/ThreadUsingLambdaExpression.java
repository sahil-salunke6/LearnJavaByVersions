package org.example.java8_features.lambdaExpression;

public class ThreadUsingLambdaExpression {

    public static void main(String[] args) {

        /**
         * Normal implementation
         */

        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running using Normal Implementation");
            }
        };

        Thread normalThread = new Thread(run);
        normalThread.start();


        /**
         * Using Lambda Expression
         */
        Thread thread = new Thread(() -> {
            System.out.println("Thread is running using Lambda Expression");
        });

        thread.start();
    }

}
