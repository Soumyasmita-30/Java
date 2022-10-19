package Enum;

public class EnumExample {
    enum TrafficSignal {
        YELLOW, RED, GREEN
    }

    public static void main(String[] args) {
        TrafficSignal v1 = TrafficSignal.GREEN;
        TrafficSignal v2 = TrafficSignal.RED;
        TrafficSignal v3 = TrafficSignal.YELLOW;
        System.out.println("The signal is ;  " + v3);
        for (TrafficSignal colour : TrafficSignal.values()) {
            System.out.println(colour);
        }
    }
}
