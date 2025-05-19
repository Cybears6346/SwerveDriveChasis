// Software Libraries
package frc.robot;
import frc.robot.Constants.OperatorConstants;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

// Device Libraries
import com.ctre.phoenix6.hardware.Pigeon2;


public class RobotContainer {
  //Subsystems
  private final Pigeon2 s_pigeon2 = new Pigeon2(0,"rio");



  private final CommandXboxController m_driverController = new CommandXboxController(OperatorConstants.kDriverControllerPort);

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {

  }

//  Add later on (Go into Robot.java and also uncomment the getAutonomousCommand method line 31)
  // public Command getAutonomousCommand() {
  
  // }
}
