package com.reobotnet.designer.pattern.factory;

import com.reobotnet.designer.pattern.factory.vehicles.Bike;
import com.reobotnet.designer.pattern.factory.vehicles.IVehicle;

public class BikeTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
