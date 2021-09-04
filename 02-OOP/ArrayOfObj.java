import java.lang.*;
import java.util.*;

class Subject{
    private String subId;
    private String name;
    private float maxMarks;
    private float marksObtained;

    public Subject(String subId, String name, float maxMarks){
        this.subId = subId;
        this.name = name;
        this.maxMarks = maxMarks;
    }
    
    public String getName(){
        return name;
    }
    public String getSubId(){
        return subId;
    }
    public float getMaxMarks(){
        return maxMarks;
    }
    public float getMarksObtained(){
        return marksObtained;
    }
    public void setMarksObtained(float marksObtained){
        this.marksObtained = marksObtained;
    }
    public double percentage(){
        return marksObtained/maxMarks *100;
    }
    boolean isQualified(){
        return marksObtained>=maxMarks/100*40;
    }
    public String toString(){
        return "\nSubject ID: "+subId+"\nName: "+name+"\nMarks Obtained: "+marksObtained;
    }
}

class ArrayOfObj{
    public static void main(String[] args) {
        Subject subs[] = new Subject[3];
        subs[0] = new Subject("s01","DS",100);
        subs[1] = new Subject("s02","Algorithms",100);
        subs[2] = new Subject("s03","Operating System",100);
        
        subs[0].setMarksObtained(93);
        subs[1].setMarksObtained(84);
        subs[2].setMarksObtained(78);
        
        for(Subject s : subs){
            System.out.println(s);
            System.out.println("Percentage: "+s.percentage());
        }
        
    }
}