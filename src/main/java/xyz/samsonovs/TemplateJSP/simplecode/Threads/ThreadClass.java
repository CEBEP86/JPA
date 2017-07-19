package xyz.samsonovs.TemplateJSP.simplecode.Threads;

/**
 * Created by Костя on 17.07.2017.
 */
public class ThreadClass extends Thread {
    boolean a=true;
    public void run(){
        while(!a)		//Пока в очереди нет сообщений
        {
            Thread.yield();		//Передать управление другим потокам
        }
        System.out.println("Some potok running");

    }
}
