package xyz.samsonovs.TemplateJSP.simplecode.Interface.printers;

/**
 * Created by Костя on 15.07.2017.
 */

public class ConsolePrinter implements IPrinter {
    @Override
    public void print(final String text) {
        System.out.print(text);
    }
}
