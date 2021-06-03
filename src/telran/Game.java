package telran;

import java.util.ArrayList;
import java.util.List;

public class Game implements Runnable{
    int loopNumber;
    Auto auto;
    List<Long> list;
    long timeOfGame;
    private List<ResultInfo> resultInfoList;



    public Game(int loopNumber, Auto auto, List<ResultInfo> resultInfo) {
        this.loopNumber = loopNumber;
        this.auto = auto;
        this.resultInfoList = resultInfo;
        list = new ArrayList<>();
        timeOfGame = 0;
    }

    public List<Long> getList() {
        return list;
    }

    public int getLoopNumber() {
        return loopNumber;
    }

    @Override
    public void run() {

        long countOfLoops = 0;
        long countOfPitStops = 0;
        int countAllLoops = 0;

        for (int i = 1; i <=loopNumber; i++) {

            if (i % 2 == 0) {
                long time = (long)(auto.getMinPitStopTime() + Math.random() * (auto.getMaxPitStopTime()
                        + 1 - auto.getMinPitStopTime()));
                countOfPitStops += time;

                System.out.println("Auto: "+auto.getName()+" loop nr: " + i+" pitstop time: "+time);

                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

            long timeOfLoop = (long)(auto.getMinLoopTime() + Math.random() * (auto.getMaxLoopTime()
                    + 1 - auto.getMinLoopTime()));

            countOfLoops += timeOfLoop;
            countAllLoops += i;

            list.add(timeOfLoop);

            System.out.println("Auto: "+auto.getName()+" loop nr: " + i+" loop time: "+timeOfLoop);
        }
        timeOfGame = countOfPitStops + countOfLoops;
        ResultInfo resultInfo = new ResultInfo(auto.getName(), loopNumber,timeOfGame);
        resultInfoList.add(resultInfo);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++");


    }
}
