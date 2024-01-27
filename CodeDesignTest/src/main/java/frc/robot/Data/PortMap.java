package frc.robot.Data;
//Port map for Simulated Robot

public enum PortMap {
    XBOX_CONTROLER_DRIVER(0),
    XBOX_CONTROLER_OPERATOR(1);
    DRIVE_MOTOR_LEFT(4);
    public int portNumber; 
    private PortMap(int portValue) //constructor
    {
        this.portNumber = portValue;
    }
}
