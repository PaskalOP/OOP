import javax.xml.crypto.Data;

public class Doctor {
   private String name;
    private int experienceYears;
    private Data workTime;

    public Doctor(String name, int experienceYears, Data workTime ){
        this.name = name;
        this.experienceYears = experienceYears;
        this.workTime = workTime;
    }
    public String getName(){
        return this.name;
    }
    public int getExperience(){
        return this.experienceYears;
    }
    public Data getworkTime(){
        return this.workTime;
    }

}
