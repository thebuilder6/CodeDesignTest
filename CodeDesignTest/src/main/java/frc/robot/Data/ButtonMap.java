package frc.robot.Data;

public enum ButtonMap {
    LeftBumper(5),
    RightBumper(6),
    LeftStick(9),
    RightStick(10),
    A(1),
    B(2),
    X(3),
    Y(4),
    Back(7),
    Start(8),
    START(8),
    L_STICK(9),
    R_STICK(10),
    LEFT_STICK_X(0),
    LEFT_STICK_Y(1),
    RIGHT_STICK_X(4),
    RIGHT_STICK_Y(5);
    
    public int value;
    private ButtonMap(int buttonValue)
    {
        this.value = buttonValue;
    }
}