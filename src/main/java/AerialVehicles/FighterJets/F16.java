package AerialVehicles.FighterJets;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import Missions.Mission;

public class F16 extends AerialVehicle implements AerialAttackVehicle, AerialBdaVehicle, FighterJet {
    private int rocketAmount;
    private String rocketType, cameraType;

    public F16(String cameraType, int rocketAmount, String rocketType,
               String pilotName, Mission mission, int hoursFromLastRepair,
               Boolean isReadyForFlight){
        super(pilotName, mission, hoursFromLastRepair, isReadyForFlight);
        this.rocketAmount = rocketAmount;
        this. rocketType = rocketType;
        this.cameraType = cameraType;
    }

    public int getRocketAmount() {
        return rocketAmount;
    }

    public void setRocketAmount(int rocketAmount) {
        this.rocketAmount = rocketAmount;
    }

    public String getRocketType() {
        return rocketType;
    }

    public void setRocketType(String rocketType) {
        this.rocketType = rocketType;
    }

    public String getCameraType() {
        return cameraType;
    }

    public void setCameraType(String cameraType) {
        this.cameraType = cameraType;
    }

    public int getMaxHoursToFlyWithoutRepair() {
        return MAX_HOURS_TO_FLY_WITHOUT_REPAIR;
    }
}
