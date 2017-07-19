package xyz.samsonovs.TemplateJSP.simplecode.Interface;

import xyz.samsonovs.TemplateJSP.simplecode.Interface.printers.IPrinter;
import xyz.samsonovs.TemplateJSP.simplecode.Interface.readers.IReader;

/**
 * Created by Костя on 15.07.2017.
 */

///реализован класс замены оо на АА...хотя другие программисты еще не реализовали методы ридер и принтер
public class ClassForInterface {
    private final IPrinter printer;
    private final IReader reader;


    public ClassForInterface(final IPrinter printer, final IReader reader) {
        this.printer = printer;
        this.reader = reader;
    }

    public void work(){
        final String text=reader.read();
        final String workText=text.replace("oo","AA");
        printer.print(workText);
    }

}

