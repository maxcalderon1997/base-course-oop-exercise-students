package AerialVehicles;

import Entities.Coordinates;
import Missions.Mission;

public interface AerialVehicleService {
    String getPilotName();
    void setPilotName(String pilotName);
    Mission getMission();
    void setMission(Mission mission);
    int getHoursOfFlightSinceLastRepair();
    void setHoursOfFlightSinceLastRepair(int hoursFromLastRepair);
    Boolean isReadyForFlight();
    void setIsreadyForFlight(Boolean isreadyForFlight);
    void flyTo(Coordinates whereToFly);
    void land();
    void check();
    void repair();
    int getMaxHoursToFlyWithoutRepair();
}
