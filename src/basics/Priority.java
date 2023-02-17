package basics;

class P extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("setting and geetting priorities");
        }
    }

}
class P1 extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hi!! i m setting and geetting priorities");
        }
    }

}
 class Priority {
     public static void main(String[] args) {
         P first = new P();
         first.start();

         first.setPriority(5);
         System.out.println(first);

         P1 second = new P1();
         second.start();
         second .setPriority(1);
         System.out.println(second);

     }
 }
