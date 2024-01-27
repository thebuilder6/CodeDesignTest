package frc.robot.Subsystems;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj.Encoder;


public class DriveBase implements Subsystem{
    
    private final PWMSparkMax m_leftLeader;
    private final PWMSparkMax m_leftFollower;
    private final PWMSparkMax m_rightLeader;
    private final PWMSparkMax m_rightFollower;  
    private final Encoder m_leftEncoder;
    private final Encoder m_rightEncoder;
    
    private final PIDController m_leftPIDController;
    private final PIDController m_rightPIDController;



    private double  leftMotorPower;
    private double rightMotorPower;
    private double  leftEncoderValue;
    private double rightEncoderValue;

    private static DriveBase instance = null;

    public static DriveBase getInstance() {
        if (instance == null) {
            instance = new DriveBase();
        }
        return instance;
    }

    public DriveBase(){
        m_leftLeader = new PWMSparkMax(1);
        m_leftFollower = new PWMSparkMax(2);
        m_rightLeader = new PWMSparkMax(3);
        m_rightFollower = new PWMSparkMax(4);  
        m_leftEncoder = new Encoder(0, 1);
        m_rightEncoder = new Encoder(2, 3);
        
        m_leftPIDController = new PIDController(8.5, 0, 0);
        m_rightPIDController = new PIDController(8.5, 0, 0);
    
        m_leftFollower.setInverted(true);
        m_leftLeader.setInverted(false);
      
        m_leftEncoder.reset();
        m_rightEncoder.reset();
    }

    public void driveArcade(double straightPower, double rotationalPower){
        leftMotorPower = straightPower + rotationalPower;
        rightMotorPower = straightPower - rotationalPower;
    }

    public void setLeftMotorPower(double power){
        this.leftMotorPower = power;
    }

    public void setRightMotorPower(double power){
        this.rightMotorPower = power;
    }

    public double getLeftEncoder(){
        return this.leftEncoderValue;
    }

    public double getRightEncoder(){
        return this.rightEncoderValue;
    }

    public void update(){
        
    }
}

