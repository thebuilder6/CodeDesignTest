package frc.robot.Subsystems;

import java.util.ArrayList;
import java.util.List;

public class ErrorLog implements Subsystem{
    private List <String> robotLog = new ArrayList<>();
    private List <String> cycleLog = new ArrayList<>();

    private static ErrorLog instance = null;
  
    public static ErrorLog getInstance() {
        if (instance == null) {
            instance = new ErrorLog();
        }
        return instance;
    }

    public ErrorLog(){

    }

    public void log(String message){
        cycleLog.add(message);
    }
    

    public void update(){
        System.out.println(cycleLog);
        robotLog.addAll(cycleLog);
        cycleLog.clear();
    }

}
