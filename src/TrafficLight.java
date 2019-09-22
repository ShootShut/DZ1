public class TrafficLight {
    private String[] color = {"Green", "Yellow", "Red"};
    private int[] time = new int[color.length];

    public String[] getColor() {
        return color;
    }

    public String getColor2(int x) {
        return color[x];
    }

    public int getTime(int x) {
        return time[x];
    }

    void initTime(int id, int time) {
        this.time[id] = time;
    }

    void pause(int x) {
        try {
            Thread.sleep(x * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
