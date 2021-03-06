package com.ibm.assignment;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class TimeoutThread extends Thread{

  @Override
   public void run() {
       try {
           Thread.sleep(TimeUnit.SECONDS.toMillis(2000));
           Robot robot = new Robot();
           robot.keyPress(KeyEvent.VK_ENTER);
           robot.keyRelease(KeyEvent.VK_ENTER);
       } catch(Exception e) {
           e.printStackTrace();
       }
   }

}

