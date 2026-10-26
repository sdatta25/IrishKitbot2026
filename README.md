# Irish KitBot 2026 🤖

Java robot code for the 2026 IRISH (Innovation Robotics Inter-School Happenstance) offseason event. The public game-reveal post describes 2v2 alliance matches; verify scoring and robot constraints against the official event manual before implementing game-specific behavior.

## Current software
- WPILib 2026 Java command-based project
- REVLib 2026
- Xbox controller tank drive
- Drivetrain configuration is being centralized in `Constants.java`
- No autonomous movement or scoring mechanism enabled yet

## Hardware assumptions
- AndyMark 12 V CIM brushed DC motors
- REV Robotics SPARK MAX controllers
- Current code uses one controller per side and example CAN IDs 1 and 2. Confirm actual IDs and motor count before testing; these values are placeholders.

## Safe testing
- Secure the robot on blocks so wheels are clear of the floor.
- Have an experienced mentor supervise initial motor tests.
- Verify each side's direction and the disable/stop behavior before floor testing.
- Keep output limits low until stopping and steering behavior are confirmed.

## Planned work
- [ ] Confirm official IRISH manual and scoring rules
- [ ] Verify CAN IDs, motor inversion, and drivetrain motor count
- [ ] Test driver controls safely
- [ ] Add autonomous routines only after sensor and drivetrain behavior are validated
- [ ] Implement game mechanisms after robot design and rules are confirmed

This repository is a work in progress and has not been validated on a physical robot.
