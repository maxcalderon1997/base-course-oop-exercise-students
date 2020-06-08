package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialAllCapableVehicle;
import Missions.Mission;

public class Kochav extends AerialAllCapableVehicle implements Hermes {
    public Kochav( int rocketAmount, String rocketType, String cameraType, String sensorType,
                  String pilotName, Mission mission, int hoursFromLastRepair,
                  Boolean isReadyForFlight){
        super(cameraType, rocketAmount, rocketType, sensorType, pilotName, mission, hoursFromLastRepair,
                isReadyForFlight);
    }

    public int getMaxHoursToFlyWithoutRepair() {
        return MAX_HOURS_TO_FLY_WITHOUT_REPAIR;
    }
}
