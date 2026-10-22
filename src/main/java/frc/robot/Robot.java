package frc.robot;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.math.MathUtil;

public class Robot extends TimedRobot {

    // EXAMPLE CAN IDs — change these to match your actual SPARK MAX IDs.
    private final SparkMax leftMotor = new SparkMax(1, MotorType.kBrushed);
    private final SparkMax rightMotor = new SparkMax(2, MotorType.kBrushed);

    // USB port 0 is the usual starting point for the driver controller.
    private final XboxController controller = new XboxController(0);

    // Start with limited power for initial testing.
    private static final double MAX_OUTPUT = 0.35;
    private static final double DEADBAND = 0.08;

    public Robot() {
        // Right-side inversion is a common starting point.
        // Verify direction with the wheels safely off the ground.
        rightMotor.setInverted(true);
    }

    @Override
    public void teleopPeriodic() {
        // Tank drive: left stick controls left side, right stick controls right.
        double leftInput = -controller.getLeftY();
        double rightInput = -controller.getRightY();

        leftInput = MathUtil.applyDeadband(leftInput, DEADBAND);
        rightInput = MathUtil.applyDeadband(rightInput, DEADBAND);

        leftMotor.set(leftInput * MAX_OUTPUT);
        rightMotor.set(rightInput * MAX_OUTPUT);
    }

    @Override
    public void disabledInit() {
        leftMotor.set(0);
        rightMotor.set(0);
    }

    @Override
    public void autonomousInit() {
        // Safe starter: do not move automatically yet.
        leftMotor.set(0);
        rightMotor.set(0);
    }

    @Override
    public void autonomousPeriodic() {
        // No autonomous movement configured yet.
    }
}