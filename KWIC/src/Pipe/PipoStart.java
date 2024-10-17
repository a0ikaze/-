package Pipe;

import java.io.File;

public class PipoStart {
    public static void pipoStart(String inputUrl, String outputUrl) {
        File inFile = new File(inputUrl);
        File outFile = new File(outputUrl);
        Pipe pipe1 = new Pipe();
        Pipe pipe2 = new Pipe();
        Pipe pipe3 = new Pipe();
        Input input = new Input(inFile, pipe1);
        Shift shift = new Shift(pipe1, pipe2);
        Alphabetizer alphabetizer = new Alphabetizer(pipe2, pipe3);
        Output output = new Output(outFile, pipe3);
        try {
            input.transform();
            shift.transform();
            alphabetizer.transform();
            output.transform();
            System.out.println("该体系结构将程序设计为一系列的处理步骤（过滤器），数据通过管道在这些步骤之间传递。\n" +
                    "每个过滤器接收输入、处理数据并输出给下一个过滤器，过滤器之间相互独立。");
            System.out.println("管道-过滤软件体系结构执行完毕");
        } catch (Exception e) {
            System.out.print("发送异常: ");
            System.out.println(e.getMessage());
        }
    }
}
