package cn.will.message;

import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

/**
 * Desc:
 * Author: will
 * Date: 16:00 2017/11/7
 */
@Component
public class Receiver {

    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message){
        System.out.println("Received<" + message + ">");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }
}
