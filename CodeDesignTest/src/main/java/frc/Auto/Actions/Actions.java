package frc.Auto.Actions;

public interface Actions {
    /**
     * Run code once when the action is started, for setup
     */
    void start();

    /**
     * Called by runAction in AutoModeBase iteratively until isFinished returns true. Iterative logic lives in this
     * method
     */
    void update();

    /**
     * Returns whether or not the code has finished execution. When implementing this interface, this method is used by
     * the runAction method every cycle to know when to stop running the action
     *
     * @return boolean
     */
    boolean isFinished();

    /**
     * Run code once when the action finishes, usually for clean up
     */
    void done();
}