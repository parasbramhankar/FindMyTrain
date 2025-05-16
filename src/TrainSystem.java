import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainSystem {

    Map<String,Train>trainMap=new HashMap<>();

    Map<String,Station>stationMap=new HashMap<>();

    List<Schedule>scheduleList=new ArrayList<>();

    void addStation(Station station){
        stationMap.put(station.getStationId(),station);
    }

    void addTrain(Train train){
        trainMap.put(train.getTrainId(), train);
    }

    public void addSchedule(Schedule schedule){
        scheduleList.add(schedule);
    }

    public List<Schedule>findMyTrain(String startStationName,String endStationName){
        List<Schedule>res=new ArrayList<>();
        for(Schedule schedule:scheduleList){
            if(schedule.getStation().getStationName().equals(startStationName) || schedule.getStation().getStationName().equals(endStationName)){
                res.add(schedule);
            }
        }

        return res;
    }


}
