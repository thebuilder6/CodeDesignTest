package frc.robot.Subsystems;

import frc.robot.Data.PortMap;

public class Control implements Subsystem{

    DriveBase driveBase;
    XController driverControl;
    ErrorLog errorLog;

    private static Control instance = null;
  
    public static Control getInstance() {
        if (instance == null) {
            instance = new Control();
        }
        return instance;
    }

    public Control(){
        driveBase = DriveBase.getInstance();
        driverControl = XController.getControllerInstance(PortMap.XBOX_CONTROLER_DRIVER.portNumber);
        errorLog = ErrorLog.getInstance();
    }
    
    public void teliopControl(){
        
    
    }   
    
    public void update(){

    
    
    }



}
