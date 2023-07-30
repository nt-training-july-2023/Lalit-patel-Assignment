package src.ThreadPriorities;


class xyz implements Runnable{
    @Override
    public void run() {

    }
}

public class Priorities {

    public static void main(String[] args) {
        xyz xyz=new xyz();
        Thread th=new Thread(xyz);
        Thread th2=new Thread(xyz);
        Thread th3=new Thread(xyz);

        th.setPriority(2);
        th2.setPriority(9);
        th3.setPriority(3);


        System.out.println("Priority of  thread th is :"+ th.getPriority());
        System.out.println("Priority of  thread th2 is :"+ th2.getPriority());
        System.out.println("Priority of  thread th3 is :"+ th3.getPriority());

    }
}
