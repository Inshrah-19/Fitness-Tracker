package fitnesstrackerproject;

public class User {
     private String username;
    private int currentWeight;
    private int targetWeight;

    public User(String username, int currentWeight, int targetWeight) {
        this.username = username;
        this.currentWeight = currentWeight;
        this.targetWeight = targetWeight;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    public int getTargetWeight() {
        return targetWeight;
    }

    public void setTargetWeight(int targetWeight) {
        this.targetWeight = targetWeight;
    }
}
