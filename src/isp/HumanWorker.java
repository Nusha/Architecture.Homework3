package isp;
// Человек - работник имплементирует оба интерфейса, может есть и работать
public class HumanWorker implements Worker, Eater{
    @Override
    public void eat() {
        System.out.println("Человек ест");
    }

    @Override
    public void work() {
        System.out.println("Человек работает");

    }
}
