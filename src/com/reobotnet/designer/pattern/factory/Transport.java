package com.reobotnet.designer.pattern.factory;

import com.reobotnet.designer.pattern.factory.vehicles.IVehicle;

public abstract class Transport {

    void startTransport(){
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}