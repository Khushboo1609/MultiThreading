package basics;
class J extends Thread{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Its time to join");
        }
    }

}
class Join {
    public static void main(String[] args) throws InterruptedException {
        J t = new J();
        t.start();
        t.join();
        for (int i = 0; i < 5; i++) {
            System.out.println("i m main thread");
        }

    }
}
