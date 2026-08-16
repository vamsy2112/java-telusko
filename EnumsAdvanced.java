
//NOTES: enums is a class. But it cannot have variables and methods and constructors just like any other class. But it cannot have inheritance and others.
// NEED OF ENUMS: to keep the property and its data binded together.  if we dont use enums, the if we reorder the constant or add new constant, then it will be RED can last upto 60 seconds. so for the data to be binded together, we use enums.
enum TrafficLights {
    RED(50), YELLOW(30), GREEN(50);

    private final int durationInSeconds;

    TrafficLights(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public int getDuration() {
        return durationInSeconds;
    }
}

public class EnumsAdvanced {
    public static void main(String[] args) {
        TrafficLights obj = TrafficLights.RED;
        System.out.println(TrafficLights.RED + " lasts for " + obj.getDuration() + " seconds");

        TrafficLights[] obj1 = TrafficLights.values();

        for (TrafficLights i : obj1) {
            System.out.println(i + " lasts for " + i.getDuration() + " seconds");
        }
    }
}
