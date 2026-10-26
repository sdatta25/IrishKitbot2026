
package frc.robot;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.RunCommand;

import frc.robot.subsystems.Drivetrain;

public class RobotContainer {
    private final Drivetrain drivetrain = new Drivetrain();

    private final XboxController controller =
            new XboxController(Constants.Operator.DRIVER_CONTROLLER_USB_PORT);

    public RobotContainer() {
        configureDefaultCommands();
    }

    private void configureDefaultCommands() {
        drivetrain.setDefaultCommand(
            new RunCommand(() -> {
                double left = -controller.getLeftY();
                double right = -controller.getRightY();

                left = MathUtil.applyDeadband(
                        left, Constants.Drive.JOYSTICK_DEADBAND);
                right = MathUtil.applyDeadband(
                        right, Constants.Drive.JOYSTICK_DEADBAND);

                drivetrain.drive(
                        left * Constants.Drive.MAX_OUTPUT,
                        right * Constants.Drive.MAX_OUTPUT);
            }, drivetrain)
        );
    }

    public Command getAutonomousCommand() {
        // Autonomous movement will be added after robot design is confirmed.
        return Commands.none();
    }
}
