package modul4.homework.less3.ex1;

public class VisibilytiProblem {
    private static boolean threadiTohtagan = false;

    public boolean isThreadiTohtagan() {
        return threadiTohtagan;
    }

    public void setThreadiTohtagan(boolean threadiTohtagan) {
        this.threadiTohtagan = threadiTohtagan;
    }



    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {

            while (!threadiTohtagan) {
                //Opshiy pamitka otib ketkan, ishini tohtatkande korinvoti lekt tepada stop bomagan
            }
            System.out.println("Thread 1 tohtagan");
        });
        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
                threadiTohtagan = true;
                System.out.println("Thread 2 uchun true qiymat berilgan");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.start();
        thread2.start();

    }



}
