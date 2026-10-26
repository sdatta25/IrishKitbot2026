package frc.robot;

/** Central location for robot-wide configuration. */
public final class Constants {
    private Constants() {}

    public static final class Operator {
        public static final int DRIVER_CONTROLLER_USB_PORT = 0;
        private Operator() {}
    }

    public static final class Drive {
        /** Example CAN IDs only; verify against the actual robot before testing. */
        public static final int LEFT_MOTOR_CAN_ID = 1;
        public static final int RIGHT_MOTOR_CAN_ID = 2;
        public static final double MAX_OUTPUT = 0.35;
        public static final double JOYSTICK_DEADBAND = 0.08;
        public static final boolean RIGHT_MOTOR_INVERTED = true;
        private Drive() {}
    }
}
