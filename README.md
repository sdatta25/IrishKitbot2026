# Irish KitBot 2026 🤖

Java robot code for the 2026 FRC season, developed for Irish Robotics at Innovation Robotics, hosted at Alpharetta High School.

## Overview

This repository contains the WPILib project for our FRC 2026 KitBot. The initial focus is establishing a reliable tank-drive drivetrain and building a foundation for future autonomous routines.

## Hardware

- **Drivetrain:** Tank drive
- **Drive motors:** AndyMark 12V CIM brushed DC motors
- **Motor controllers:** REV Robotics SPARK MAX
- **Programming language:** Java
- **Robot framework:** WPILib 2026

## Software

- WPILib 2026
- Java
- REVLib 2026
- Visual Studio Code with WPILib extensions

## Project Structure

```text
IrishKitbot2026/
├── src/
│   └── main/
│       ├── java/frc/robot/
│       │   ├── Main.java
│       │   └── Robot.java
│       └── deploy/
├── vendordeps/
│   └── REVLib.json
├── build.gradle
├── settings.gradle
└── README.md
```

## Current Development

- [x] Initialize WPILib Java project
- [x] Add REVLib dependency
- [x] Build the initial robot code
- [ ] Implement and test tank-drive controls
- [ ] Verify motor directions and controller configuration
- [ ] Develop autonomous routines
- [ ] Test and validate on the robot

## Build

Open the project using WPILib VS Code 2026 and run:

**Command Palette → `WPILib: Build Robot Code`**

## Safety

Motor-control code must be tested with the robot securely supported, wheels clear of the floor, and an experienced mentor supervising initial tests.

## Maintainers

Irish Robotics — FRC 2026

---

*Built with Java and WPILib.*
