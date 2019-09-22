import javax.swing.*;

public class Work {
    TrafficLight trafficLight;

    void init() {
        trafficLight = new TrafficLight();
        for (int i = 0; i < trafficLight.getColor().length; i++) {
            trafficLight.initTime(i, myPane());
        }
    }

    void start() {
        for (int i = 0; i < trafficLight.getColor().length; i++) {
            System.out.println(trafficLight.getColor2(i));
            trafficLight.pause(trafficLight.getTime(i));
        }
    }

    public int myPane() {
        String in = JOptionPane.showInputDialog("Введите количество минут");
        int out;

        try {
            out = Integer.parseInt(in);
//            return out;
        } catch (Exception e) {
            System.out.println(e);
            out = -1;
        }
        return out;
    }
}
