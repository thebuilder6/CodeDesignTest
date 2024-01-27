package frc.robot.Subsystems;

import java.util.HashMap;
import java.util.Map;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.Data.ButtonMap;

public class XController implements Subsystem {
    
    private double  leftstickX;
    private double  leftstickY;
    private double rightstickX;
    private double rightstickY;

    private ErrorLog errorLog = ErrorLog.getInstance();
    
    private XboxController xboxControllerWPI; 

    private static Map<Integer, XController> xboxControllers = new HashMap<>();
 
    public static XController getControllerInstance(int port){
        XController controller = xboxControllers.get(port);
        if (controller == null) {
            controller = new XController(port);
        }
        return controller;
    }

    public XController(int port){
        try{
            xboxControllerWPI = new XboxController(port);
            errorLog.log("Created new controller "  + port);
        }
        catch(Exception xboxControllerNotAssigned){
            xboxControllerWPI = null;
            errorLog.log("failed to  new controller "  + port);
        }    
    }

    public double getLeftStickX(){
        return leftstickX;
    }
    
    public double getLeftStickY(){
        return leftstickY;
    }

    public double getRightStickX(){
        return rightstickX;
    }
    public double getRightStickY(){
        return rightstickY;
    }

    // public double getButtonDown(){
    //     //with out debounce
    // }
    
    // public double getButtonPressed(){
    //     //with debounce
    // }
    
    public void update(){
        leftstickX  = xboxControllerWPI.getRawAxis(ButtonMap.LEFT_STICK_X.value); 
        leftstickY  = xboxControllerWPI.getRawAxis(ButtonMap.LEFT_STICK_Y.value); 
        rightstickX = xboxControllerWPI.getRawAxis(ButtonMap.RIGHT_STICK_X.value); 
        rightstickY = xboxControllerWPI.getRawAxis(ButtonMap.RIGHT_STICK_Y.value); 

    }

}

