package basics;

import java.sql.SQLOutput;

class B implements Runnable
        {
            public void run() {
                for (int i = 0; i < 20; i++)
                {
                    System.out.println("hi! i m B thread");
                 }

            }


        }
class C implements Runnable
{
    public void run()
    {
        for(int i=0;i<20;i++) {
            System.out.println("hi! i m C thread");
        }
    }


}

 class CreatbyInterface {
    public static void main(String[] args)
    {
        Runnable  b=new B();
        Thread t=new Thread(b);
        t.start();
        System.out.println(t.isAlive());
        Runnable c=new C();
        Thread t1=new Thread(c);
        t1.start();
        System.out.println(t1.isAlive());
        System.out.println(t);
        System.out.println(t1);
        System.out.println(Thread.activeCount());


    }



}
