package AerialVehicles;

import Entities.Coordinates;
import Missions.Mission;


public abstract class AerialVehicle implements AerialVehicleService{
    private String pilotName;
    private Mission mission;
    private int hoursOfFlightSinceLastRepair;
    private Boolean isreadyForFlight;

    public AerialVehicle(String pilotName, Mission mission, int hoursFromLastRepair, Boolean isReadyForFlight){
        this.pilotName = pilotName;
        this.mission = mission;
        this.hoursOfFlightSinceLastRepair = hoursFromLastRepair;
        this.isreadyForFlight = isReadyForFlight;
    }

    public String getPilotName() {
        return pilotName;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public Mission getMission() {
        return mission;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
    }

    public int getHoursOfFlightSinceLastRepair() {
        return hoursOfFlightSinceLastRepair;
    }

    public void setHoursOfFlightSinceLastRepair(int hoursFromLastRepair) {
        this.hoursOfFlightSinceLastRepair = hoursFromLastRepair;
    }

    public Boolean isReadyForFlight() {
        return isreadyForFlight;
    }

    public void setIsreadyForFlight(Boolean isreadyForFlight) {
        this.isreadyForFlight = isreadyForFlight;
    }

    public void flyTo(Coordinates whereToFly) {
        System.out.println("flying to: " + whereToFly.getLongitude() + ", " + whereToFly.getLatitude());
    }

    public void land() {
        System.out.println("Landing");
    }

    public void check() {
        if(getHoursOfFlightSinceLastRepair() > getMaxHoursToFlyWithoutRepair()){
            repair();
        }
    }

    public void repair(){
        setIsreadyForFlight(true);
        setHoursOfFlightSinceLastRepair(0);
    }
}
