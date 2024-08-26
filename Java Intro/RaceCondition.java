class Counter{
    int count = 0;
    //synchronized key make the thread synchronize
    //equal units sharing within threads
    public synchronized void increment(){
        count++;
    }
}

/*
 * Thread States:
 * - New State   
- Runnable State  ->  start() method
- Running State     -> a thead is running with run() method 
- Waiting State	    -> sleep(),  wait() method
- Dead State

Through notify(), you will go to waiting state to runnable state.
From Running, Runnable state to dead state through stop() method.
 */

public class RaceCondition {
    public static void main(String[] args) {
        Counter c = new Counter();

        Runnable rrr1 = new Runnable() {

            @Override
            public void run() {
               for(int i=0;i<1000;i++){
                    c.increment();
                    //System.out.println("Thread 1");
                    System.out.println("The current thread name is: " + Thread.currentThread().getName()); 
               }
            }
            
        };

        Runnable rrr2 = new Runnable() {
            @Override
            public void run() {
               for(int i=0;i<1000;i++){
                    c.increment();
                    //System.out.println("Thread 2");
                    System.out.println("The current thread name is: " + Thread.currentThread().getName());  
                }
            }
        };

        Thread ttt1 = new Thread(rrr1);
        Thread ttt2 = new Thread(rrr2);

        ttt1.start();
        ttt2.start();

        
        try {
            ttt1.join();
        } catch (InterruptedException e) { 
            e.printStackTrace();
        }
        
        try {
            ttt2.join(); //waits till the thread terminates
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
               
        System.out.println(c.count);

    }    
}
