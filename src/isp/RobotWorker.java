package isp;
// Робот, как механизм, имплементирует только один интерфейс (Но мы могли бы создать еще один интерфейс, например,
// Chargeable, и робот мог бы заряжаться в отличие от человека, и имплементировать таковой, наряду, например с условным классом
// ElectroTransporter)
public class RobotWorker implements Worker{
    @Override
    public void work() {
        System.out.println("Робот работает");
    }
}
