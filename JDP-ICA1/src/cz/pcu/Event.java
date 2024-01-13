package cz.pcu;
import java.time.LocalDateTime;

public class Event{
  private int id;
  private LocalDateTime timestamp;
  private Device targetDevice; 
  private Command command;
  private Packet packet;
}
