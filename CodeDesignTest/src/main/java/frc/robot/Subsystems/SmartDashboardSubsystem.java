package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class SmartDashboardSubsystem implements Subsystem{

    private static SmartDashboardSubsystem instance = null;
  
    public static SmartDashboardSubsystem getInstance() {
        if (instance == null) {
            instance = new SmartDashboardSubsystem();
        }
        return instance;
    }
    
    public SmartDashboardSubsystem(){
        
    }

    public void startup(){

    }

   private static final String kDefaultAuto = "Default";
   private static final String kCustomAuto = "My Auto";
   private String m_autoSelected;
   private final SendableChooser<String> m_chooser = new SendableChooser<>();
    
    public void autoChooser(){
        m_chooser.setDefaultOption("Default Auto", kDefaultAuto);
        m_chooser.addOption("My Auto", kCustomAuto);
        SmartDashboard.putData("Auto choices", m_chooser);
    }

    public void update(){
        
    }

}
