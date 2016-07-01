/**
 * Created by fzp on 2016/7/1.
 */
public class Print implements Runnable{

    char name;
    Object self;
    Object prev;

    public Print(char name,Object self,Object prev) {
        this.name=name;
        this.self=self;
        this.prev=prev;
    }

    @Override
    public void run() {
        int count = 10;
        while(count > 0) {
            synchronized (prev) {
                synchronized (self) {
                    System.out.println(name);
                    count--;
                    self.notify();
                }
                try {
                    prev.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

