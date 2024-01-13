package cz.pcu.devices;
import cz.pcu.devices.CAMTable;
import cz.pcu.devices.Device;
import cz.pcu.devices.NetworkInterface;
import cz.pcu.devices.NetworkProtocol;

import java.util.List;

class Switch extends Device {
    private CAMTable camTable;

    public Switch(int id, String name, String macAddress, List<NetworkInterface> interfaces, NetworkProtocol protocol, CAMTable camTable) {
        super(id, name, macAddress, interfaces, protocol);
        this.camTable = camTable;
    }

}
