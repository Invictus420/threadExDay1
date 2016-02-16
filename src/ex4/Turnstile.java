package ex4;

import java.util.concurrent.locks.ReentrantLock;


public class Turnstile implements Runnable{
  private final TurnstileCounter counter;
  private int count;
  private final ReentrantLock lock = new ReentrantLock();

  final int COUNT_MAX = 1000;

  Turnstile(TurnstileCounter c) {
    counter = c;
  }

  public int getCount() {
    return count;
  }

  @Override
  public void run() {
    for (int i = 0; i < COUNT_MAX; i++) {
      counter.incr();
      count++;
    }
  }
  
}
