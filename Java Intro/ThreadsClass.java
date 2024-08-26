class AA1 extends Thread{
    public void run(){
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

class BB1 extends Thread{
    public void run(){
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

public class ThreadsClass {

    public static void main(String[] args) {
        AA1 a1 = new AA1();
        BB1 b1 = new BB1();
        
        a1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(a1.getPriority());
        System.out.println(b1.getPriority());
        
        a1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        b1.start();
    }
}
