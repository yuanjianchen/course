package tech.stack.demo;

/**
 * @author jianyuan.chen@advance.ai
 * @date 2021/3/14 20:54
 */
public class StringLockDemo {

    static class StringLock implements Runnable {

        String lock_s;

        public StringLock(String lock_s) {
            this.lock_s = lock_s;
        }

        @Override
        public void run() {
            synchronized (getLock()) {
                System.out.println(Thread.currentThread() + " 锁住了 " + lock_s + ".");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        String getLock(){
            return "abc";
        }
    }

    public static void main(String[] args) {
        StringLock lock = new StringLock("abc");
        new Thread(lock, "线程一").start();
        new Thread(lock, "线程二").start();
        new Thread(lock, "线程三").start();
        new Thread(lock, "线程四").start();
        new Thread(lock, "线程五").start();
    }

}
