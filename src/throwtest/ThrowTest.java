package throwtest;

public class ThrowTest {
    public static void main(String[] args) {
        //测试volatile字段
        RunnableDemo rd = new RunnableDemo();
        AutoRunnAuto autoRunnAuto = new AutoRunnAuto();
//        int count = 0;
//        new Thread(rd).start();
//        while (true) {
//                if (rd.isFalg()) {
//                    System.out.println("-----------------" + "flag为真");
//                    break;
//                }
//                count++;
//                System.out.println("现在的falg=" + rd.isFalg() + "----" + count);
//        }
//
        for (int i = 0; i < 10; i++) {
            new Thread(autoRunnAuto).start();
        }


    }
}
