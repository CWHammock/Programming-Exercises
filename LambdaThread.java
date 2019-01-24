

public class LambdaThread{

    public static void main(String[] args) {
        Runnable runnable1 = () -> {
                for(int i = 0;i < 5;i++){
                    System.out.println("hello");
                    try{Thread.sleep(200);}catch(Exception e){}
                }
        };

        Runnable runnable2 = () -> {
                for(int i = 0;i < 5;i++){
                    System.out.println("hi");
                    try{Thread.sleep(200);}catch(Exception e){}
                }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        try{Thread.sleep(20);}catch(Exception e){}
        thread2.start();

        

        
    }
}