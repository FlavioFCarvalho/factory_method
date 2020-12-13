package com.reobotnet.designer.pattern.factory;

import com.reobotnet.designer.pattern.factory.vehicles.Car;
import com.reobotnet.designer.pattern.factory.vehicles.IVehicle;

public class CarTransport extends Transport{

	@Override
    protected IVehicle createTransport() {
        return new Car();
    }

}
