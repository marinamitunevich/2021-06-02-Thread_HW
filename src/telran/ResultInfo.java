package telran;

public class ResultInfo {
    private String Name;
    private int loopsAmount;
    private long resultTime;

    public ResultInfo(String name, int loopsAmount, long resultTime) {
        Name = name;
        this.loopsAmount = loopsAmount;
        this.resultTime = resultTime;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getLoopsAmount() {
        return loopsAmount;
    }

    public void setLoopsAmount(int loopsAmount) {
        this.loopsAmount = loopsAmount;
    }

    public long getResultTime() {
        return resultTime;
    }

    public void setResultTime(int resultTime) {
        this.resultTime = resultTime;
    }

    @Override
    public String toString() {
        return "ResultInfo{" +
                "Name='" + Name + '\'' +
                ", loopsAmount=" + loopsAmount +
                ", resultTime=" + resultTime +
                '}';
    }
}
