package AerialVehicles;

import Missions.BdaMission;

public interface AerialBdaVehicle extends AerialVehicleService{
    default String preformBda(){
        return getPilotName() + ": " + getClass().getSimpleName() + " taking pictures of " +
                ((BdaMission)getMission()).getObjective() + " with: " + getCameraType() + " camera";
    }

    String getCameraType();
    void setCameraType(String cameraType);
}
