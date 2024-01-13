package cz.pcu.network.builder.factories.connection;

import cz.pcu.simulation.connection.IConnection;

public interface IConnectionFactory {
    public IConnection CreateConnection();
}
