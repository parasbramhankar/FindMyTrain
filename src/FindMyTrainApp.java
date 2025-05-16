import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMyTrainApp {

    public static void main(String[] args) {

        TrainSystem system=new TrainSystem();

        //Adding Train
        Train train1=new Train("12345","Duronto Express","SF Express");
        Train train2=new Train("34251","Intercity ","Passenger Train");

        //Adding Station
        Station station1=new Station("S001","Delhi");
        Station station2=new Station("S002","Agra");

        //Adding Platform
        Platform platform1=new Platform(01);
        Platform platform2=new Platform(02);

        //Add Train to the Platform
        platform1.setTrain(train1);
        platform2.setTrain(train2);

        //Platform List
        List<Platform>platformList=new ArrayList<>();
        platformList.add(platform1);
        platformList.add(platform2);


        /// Creating Schedule
        Schedule schedule1=new Schedule(train1,station1,"9.00AM","9.05AM",platform1);

        Schedule schedule2=new Schedule(train2,station2,"10.00AM","10.05AM",platform1);

        system.addTrain(train1);
        system.addTrain(train2);

        system.addStation(station1);
        system.addStation(station2);

        system.addSchedule(schedule1);
        system.addSchedule(schedule2);

        Scanner scanner=new Scanner(System.in);
        //Find the train

        System.out.println("Enter the source Name: ");
        String source=scanner.nextLine();

        System.out.println("Enter the destination Name");
        String destination=scanner.nextLine();


        List<Schedule>myTrain=system.findMyTrain(source,destination);

        System.out.println("Available trains: ");
        System.out.println(myTrain);
        }
}
