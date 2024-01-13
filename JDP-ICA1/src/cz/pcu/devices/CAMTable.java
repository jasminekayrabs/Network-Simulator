package cz.pcu.devices;

import java.util.ArrayList;
import java.util.List;

class CAMTable {
    private List<CAMTableRecord> records;

    public CAMTable() {
        this.records = new ArrayList<>();
    }

    public NetworkInterface lookup(String macAddr) {
        for (CAMTableRecord record : records) {
            if (record.getMacAddress().equals(macAddr)) {
                return record.getPort();
            }
        }
        return null; 
    }

    public void add(String macAddr, NetworkInterface port) {
        for (CAMTableRecord record : records) {
            if (record.getMacAddress().equals(macAddr)) {
                record.setPort(port);
                return;
            }
        }

        CAMTableRecord newRecord = new CAMTableRecord(macAddr, port);
        records.add(newRecord);
    }
}
