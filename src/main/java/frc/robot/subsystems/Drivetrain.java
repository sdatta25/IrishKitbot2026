package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {

    // Placeholder CAN IDs
    private final SparkMax leftMotor =
            new SparkMax(1, MotorType.kBrushed);

    private final SparkMax rightMotor =
            new SparkMax(2, MotorType.kBrushed);

    public Drivetrain() {
        rightMotor.setInverted(true);
    }

    public void drive(double leftSpeed, double rightSpeed) {
        leftMotor.set(leftSpeed);
        rightMotor.set(rightSpeed);
    }

    public void stop() {
        drive(0, 0);
    }
}