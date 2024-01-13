package cz.pcu.simulation.event;
import cz.pcu.devices.Device;

import java.time.LocalDateTime;

public class Event{
  private int id;
  private LocalDateTime timestamp;
  private Device targetDevice;
  private Command command;
  private Packet packet;

public Event(int id, LocalDateTime timestamp, Device targetDevice, Command command, Packet packet){
    this.id = id;
    this.timestamp = timestamp;
    this.targetDevice = targetDevice;
    this.command = command;
    this.packet = packet;
}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Device getTargetDevice() {
        return targetDevice;
    }

    public void setTargetDevice(Device targetDevice) {
        this.targetDevice = targetDevice;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public Packet getPacket() {
        return packet;
    }

    public void setPacket(Packet packet) {
        this.packet = packet;
    }
}
