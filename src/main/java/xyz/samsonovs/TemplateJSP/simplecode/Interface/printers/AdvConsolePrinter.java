package xyz.samsonovs.TemplateJSP.simplecode.Interface.printers;

/**
 * Created by Костя on 15.07.2017.
 */
public class AdvConsolePrinter implements IPrinter{
@Override
    public void print(String text){
    System.out.println(text);
    System.out.println(text.length());

}
}
