package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialAllCapableVehicle;
import Missions.Mission;

public class Shoval extends AerialAllCapableVehicle implements Haron {
    public Shoval(String cameraType, int rocketAmount, String rocketType, String sensorType,
                  String pilotName, Mission mission, int hoursFromLastRepair,
                  Boolean isReadyForFlight){
        super(cameraType, rocketAmount, rocketType, sensorType, pilotName, mission, hoursFromLastRepair,
                isReadyForFlight);
    }
    public int getMaxHoursToFlyWithoutRepair() {
        return MAX_HOURS_TO_FLY_WITHOUT_REPAIR;
    }
}

