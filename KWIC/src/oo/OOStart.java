package oo;

public class OOStart {
    public static void start(String inputUrl, String outputUrl) {
        Input input = new Input();
        input.input(inputUrl);
        Shift shift = new Shift(input.getLineTxt());
        shift.shift();
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        alphabetizer.sort();
        Output output = new Output(alphabetizer.getKwicList());
        output.output(outputUrl);
        System.out.println("这种体系结构以对象为核心，程序中的实体被封装成对象，" +
                "每个对象包含数据（属性）和行为（方法）。\n" +
                "对象之间通过消息传递来交互，程序通过对象的组合和继承机制来实现复杂功能。");
        System.out.println("面向对象软件体系结构执行完毕");
    }
}
