public class Train {

    private String trainId;
    private String trainName;
    private String Type;

    public Train(String trainId, String trainName, String type) {
        this.trainId = trainId;
        this.trainName = trainName;
        Type = type;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainId='" + trainId + '\'' +
                ", trainName='" + trainName + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }
}
