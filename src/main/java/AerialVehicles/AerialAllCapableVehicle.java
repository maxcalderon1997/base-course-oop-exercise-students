package AerialVehicles;

import Missions.Mission;

public abstract class AerialAllCapableVehicle extends AerialVehicle implements AerialAttackVehicle, AerialIntelligenceVehicle, AerialBdaVehicle{
    private int rocketAmount;
    private String rocketType, sensorType, cameraType;

    public AerialAllCapableVehicle(String cameraType, int rocketAmount, String rocketType, String sensorType,
                                   String pilotName, Mission mission, int hoursFromLastRepair,
                                   Boolean isReadyForFlight){
        super(pilotName, mission, hoursFromLastRepair, isReadyForFlight);
        this.rocketAmount = rocketAmount;
        this.rocketType = rocketType;
        this.sensorType = sensorType;
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

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }
}
