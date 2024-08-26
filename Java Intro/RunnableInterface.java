class AAA1 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<50;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class BBB1 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<50;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
public class RunnableInterface {
    public static void main(String[] args) {
        Runnable r1 = new AAA1();
        Runnable r2 = new BBB1();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.start();
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        
        //anonymous class
        System.out.println("anonymous class");
        Runnable rr1 = ()->{
            for(int i=0;i<10;i++){
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable rr2 = ()->{
            for(int i=0;i<10;i++){
                System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread tt1 = new Thread(rr1);
        Thread tt2 = new Thread(rr2);

        tt1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tt2.start();
    }
}
