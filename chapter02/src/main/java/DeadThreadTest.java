/**
 * @author shkstart
 * @create 2020 上午 11:23
 */
public class DeadThreadTest {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println(Thread.currentThread().getName() + "开始");
            DeadThread dead = new DeadThread();
            System.out.println(Thread.currentThread().getName() + "结束");
        };

        Thread t1 = new Thread(r,"线程1");
        Thread t2 = new Thread(r,"线程2");

        t1.start();
        t2.start();
        // 不加while的情况下，类只加载一次
        // 线程1开始
        // 线程2开始
        // 线程1初始化当前类
        // 线程1结束
        // 线程2结束

        // 加了while之后，由于<clink>是加锁的，则此时一个线程占有锁，while死循环，另一个线程永远获得不了锁
        // 线程1开始
        // 线程2开始
        // 线程2初始化当前类

    }
}

class DeadThread{
    static{
        if(true){
            System.out.println(Thread.currentThread().getName() + "初始化当前类");
            while(true){

            }
        }
    }
}