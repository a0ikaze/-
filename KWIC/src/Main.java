import transaction.TransactionStart;
import Pipe.PipoStart;
import oo.OOStart;
import main_son.demo1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("经典软件体系结构教学软件");
        Scanner sc = new Scanner(System.in);
        String inputUrl,outUrl;
        Integer choice = 0;

        System.out.print("请输入input链接: ");
        inputUrl = sc.next();
        System.out.print("请输入output链接: ");
        outUrl = sc.next();

        System.out.println("请选择你要执行的软件体系结构: ");
        System.out.println("1.主程序-子程序软件体系结构, 2.面向对象软件体系结构, 3.事件系统软件体系结构, 4.管道-过滤软件体系结构:");
        choice = sc.nextInt();


        if(choice == 1){
            demo1.start(inputUrl,outUrl);
        } else if (choice == 2) {
            OOStart.start(inputUrl, outUrl);
        }else if (choice == 3){
            TransactionStart.start(inputUrl, outUrl);
        } else if (choice == 4) {
            PipoStart.pipoStart(inputUrl, outUrl);
        }else{
            System.out.println("选择了错误的选项");
        }

        System.out.println("执行结果, " + outUrl+": ");

        try (BufferedReader br = new BufferedReader(new FileReader(outUrl))) {
            String line;
            // 按行读取文件内容
            while ((line = br.readLine()) != null) {
                System.out.println(line);  // 打印每一行内容
            }
        } catch (IOException e) {
            e.printStackTrace();  // 处理读取文件时的异常
        }

    }
}