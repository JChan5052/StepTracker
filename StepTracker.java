public class StepTracker{
    private int active=0;
    private int limit=0;
    private int steps=0;
    private int days=0;
     public StepTracker(int lim){
        limit=lim;
     }
    
    public int activeDays()
    {
    return active;
    }
    public void addDailySteps(int steps){
        if (steps>limit){
            active++;
        }
        this.steps+=steps;
        days++;
    }
    public double averageSteps(){
        if (active>0){
            return steps/days;
        }
        return 0;
    }
    }