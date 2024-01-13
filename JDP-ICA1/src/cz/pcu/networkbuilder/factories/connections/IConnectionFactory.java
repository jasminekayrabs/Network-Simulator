package cz.pcu.networkbuilder.factories.connections;

import cz.pcu.simulation.connection.IConnection;

public interface IConnectionFactory {
    public IConnection CreateConnection();
}
