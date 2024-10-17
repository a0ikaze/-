package transaction;

public class TransactionStart {
    public static void start(String inputUrl,String outputUrl){
        //创建主题
        KWICSubject kwicSubject = new KWICSubject();
        //创建观察者
        Input input = new Input(inputUrl);
        Shift shift = new Shift(input.getLineTxt());
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        Output output = new Output(alphabetizer.getKwicList(), outputUrl);

        // 将观察者加入主题
        kwicSubject.addObserver(input);
        kwicSubject.addObserver(shift);
        kwicSubject.addObserver(alphabetizer);
        kwicSubject.addObserver(output);
        // 逐步调用各个观察者
        kwicSubject.startKWIC();

        System.out.println("事件驱动的体系结构基于事件的产生和处理，程序的执行由外部或内部事件触发。\n" +
                "事件处理器在事件发生时被激活，执行相应的逻辑。常用于用户界面、网络编程等领域。");

        System.out.println("事件系统软件体系结构执行完毕");
    }
}
