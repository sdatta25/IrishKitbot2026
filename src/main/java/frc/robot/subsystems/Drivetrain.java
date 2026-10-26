
package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
    private final SparkMax leftMotor =
            new SparkMax(Constants.Drive.LEFT_MOTOR_CAN_ID, MotorType.kBrushed);

    private final SparkMax rightMotor =
            new SparkMax(Constants.Drive.RIGHT_MOTOR_CAN_ID, MotorType.kBrushed);

    public Drivetrain() {
        rightMotor.setInverted(Constants.Drive.RIGHT_MOTOR_INVERTED);
    }

    public void drive(double leftSpeed, double rightSpeed) {
        leftMotor.set(leftSpeed);
        rightMotor.set(rightSpeed);
    }

    public void stop() {
        drive(0.0, 0.0);
    }
}
