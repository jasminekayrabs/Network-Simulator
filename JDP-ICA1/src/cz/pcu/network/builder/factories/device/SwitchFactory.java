package cz.pcu.network.builder.factories.device;

import cz.pcu.devices.Device;
import cz.pcu.network.builder.factories.interfaces.IInterfaceFactory;
import cz.pcu.network.builder.factories.protocol.IProtocolFactory;

import java.util.List;

public class SwitchFactory implements IDeviceFactory{
    private List<IProtocolFactory> protocolFactories;
    private List<IInterfaceFactory> interfaceFactories;
    public List<IProtocolFactory> getProtocolFactories() {
        return null;
    }
    public void setProtocolFactories(List<IProtocolFactory> protocolFactories) {

    }
    public List<IInterfaceFactory> getInterfaceFactories() {
        return null;
    }
    public void setInterfaceFactories(List<IInterfaceFactory> interfaceFactories) {

    }
    public Device createDevice() {
        return null;
    }
}
