package xyz.samsonovs.TemplateJSP.simplecode.Interface.readers;

/**
 * Created by Костя on 15.07.2017.
 */
public class PreDefinedReader implements IReader {
    private final String str;

    public PreDefinedReader(String str) {
        this.str = str;
    }

    @Override
    public String read() {
        return str;
    }
}


