package telran;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<ResultInfo> resultInfo = new ArrayList();
        Auto auto1 = new Auto("Auto 1",300,400,2000,3000);
        Auto auto2 = new Auto("Auto 2",300,500,3000,4000);
        Game game1 = new Game(5,auto1, resultInfo);
        Game game2 = new Game(5,auto2, resultInfo);
        Thread th1 = new Thread(game1);
        Thread th2 = new Thread(game2);

        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.println(resultInfo);

//        while (true) {
//            if (!th1.isAlive() && !th2.isAlive()) {
//                System.out.print("Auto " + auto1.getName() + " loops : " + game1.getLoopNumber() + " times: " + game1.getList());
//                System.out.println();
//                System.out.print("Auto " + auto2.getName() + " loops : " + game2.getLoopNumber() + " times: " + game2.getList());
//                System.out.println();
//                System.out.println("Total time for Auto number : "+auto1.getName()+" : "+ game1.timeOfGame);
//                System.out.println("Total time for Auto number : "+auto2.getName()+" : "+ game2.timeOfGame);
//                break;
//            }
//        }


    }

}

