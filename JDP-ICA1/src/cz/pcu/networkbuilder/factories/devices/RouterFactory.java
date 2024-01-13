package cz.pcu.networkbuilder.factories.devices;

import cz.pcu.devices.Device;
import cz.pcu.networkbuilder.factories.interfaces.IInterfaceFactory;
import cz.pcu.networkbuilder.factories.protocols.IProtocolFactory;

import java.util.List;

public class RouterFactory implements IDeviceFactory{
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
