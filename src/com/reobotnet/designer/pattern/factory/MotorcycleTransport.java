package com.reobotnet.designer.pattern.factory;

import com.reobotnet.designer.pattern.factory.vehicles.IVehicle;
import com.reobotnet.designer.pattern.factory.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport{

    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
