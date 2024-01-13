package cz.pcu.networkbuilder.factories.devices;

import cz.pcu.devices.Device;
import cz.pcu.networkbuilder.factories.interfaces.IInterfaceFactory;
import cz.pcu.networkbuilder.factories.protocols.IProtocolFactory;

import java.util.List;

public interface IDeviceFactory {
    List<IProtocolFactory> getProtocolFactories();
    void setProtocolFactories(List<IProtocolFactory> protocolFactories);
    List<IInterfaceFactory> getInterfaceFactories();
    void setInterfaceFactories(List<IInterfaceFactory> interfaceFactories);

    Device createDevice();
}




