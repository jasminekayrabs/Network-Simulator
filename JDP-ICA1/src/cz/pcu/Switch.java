class Switch extends Device {
    private CAMTable camTable;

    public Switch(int id, String name, String macAddress, List<NetworkInterface> interfaces, NetworkProtocol protocol, CAMTable camTable) {
        super(id, name, macAddress, interfaces, protocol);
        this.camTable = camTable;
    }

}
