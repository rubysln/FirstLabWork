public class SwitchCase {
    private ChangeRegistry changeRegistry;
    public void select(String line, int change){
        switch (change){
            case(1):
                this.changeRegistry = new FirstStrategy();
                changeRegistry.change(line);
                break;
            case(2):
                this.changeRegistry = new SecondStrategy();
                changeRegistry.change(line);
                break;
            case(3):
                this.changeRegistry = new ThirdStrategy();
                changeRegistry.change(line);
            case(4):
                this.changeRegistry = new FourthStrategy();
                changeRegistry.change(line);
                break;
            case(5):
                this.changeRegistry = new FifthStrategy();
                changeRegistry.change(line);
                break;
            default:
                System.out.println("Выберите вариант из списка!");
                break;
        }
    }
}
