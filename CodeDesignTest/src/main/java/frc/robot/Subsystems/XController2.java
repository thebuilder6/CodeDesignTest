
package frc.robot.Subsystems;
import edu.wpi.first.wpilibj.XboxController;

import frc.robot.Data.PortMap;

public class XController2 extends XboxController implements Subsystem{

    private static XController2 instance = null;

    public static XController2 getInstance() {
        if (instance == null) {
            instance = new XController2();
        }
        return instance;
    }
    
    public XController2(){
        super(PortMap.XBOX_CONTROLER_DRIVER.portNumber);
    }
    
    public void update(){
    
    }
   

}
