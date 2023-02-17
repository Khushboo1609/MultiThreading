package basics;
class A extends Thread{
     @Override
     public void run(){
         System.out.println("I m first thread");
     }

}



class CreatThread {
    public static void main(String[] args)
    {
        A t1=new A();
        t1.start();
    }

}
