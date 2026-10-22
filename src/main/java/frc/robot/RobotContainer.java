package frc.robot;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.RunCommand;

import frc.robot.subsystems.Drivetrain;

public class RobotContainer {

    private static final double MAX_OUTPUT = 0.35;
    private static final double DEADBAND = 0.08;

    private final Drivetrain drivetrain = new Drivetrain();
    private final XboxController controller = new XboxController(0);

    public RobotContainer() {
        configureDefaultCommands();
    }

    private void configureDefaultCommands() {
        drivetrain.setDefaultCommand(
            new RunCommand(() -> {
                double left = -controller.getLeftY();
                double right = -controller.getRightY();

                left = MathUtil.applyDeadband(left, DEADBAND);
                right = MathUtil.applyDeadband(right, DEADBAND);

                drivetrain.drive(
                    left * MAX_OUTPUT,
                    right * MAX_OUTPUT
                );
            }, drivetrain)
        );
    }

    public Command getAutonomousCommand() {
        // No autonomous movement configured yet.
        return Commands.none();
    }
}