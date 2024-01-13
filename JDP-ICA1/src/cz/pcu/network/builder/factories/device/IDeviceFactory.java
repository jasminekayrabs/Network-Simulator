package cz.pcu.network.builder.factories.device;

import cz.pcu.devices.Device;
import cz.pcu.network.builder.factories.interfaces.IInterfaceFactory;
import cz.pcu.network.builder.factories.protocol.IProtocolFactory;

import java.util.List;

public interface IDeviceFactory {
    List<IProtocolFactory> getProtocolFactories();
    void setProtocolFactories(List<IProtocolFactory> protocolFactories);
    List<IInterfaceFactory> getInterfaceFactories();
    void setInterfaceFactories(List<IInterfaceFactory> interfaceFactories);

    Device createDevice();
}




