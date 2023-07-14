package course.course05;

public class Truck implements Car, Engine{
    //tb puse toate metodele din interfata, chiar cu empty body
    @Override
    public void start() {
    }
    @Override
    public void stop() {
    }
    @Override
    public void engineOn() {
        System.out.println("Start max capacity " + Engine.MAX_CAPACITY);
    }
    @Override
    public void engineOff() {
    }
}
