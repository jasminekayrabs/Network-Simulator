package cz.pcu.simulation.event;

public class Packet {
    private int id;
    private byte[] data;
    private String source;
    private String destination;
    public Packet(int id, byte[] data, String source, String destination) {
        this.id = id;
        this.data = data;
        this.source = source;
        this.destination = destination;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    //Other methods...
}


