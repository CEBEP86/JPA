package xyz.samsonovs.TemplateJSP.simplecode.exeptions;

/**
 * Created by Костя on 17.07.2017.
 */
public class Excep {
    int a=2;

    public void go(){
        try{
            test(a);
        }
        catch(MyNewExeption e ){/////пробрасывается дочерний но принимаем общие
          System.out.println("Bad argument");
           /// throw e; - если не можешь обработать - прокидывай дальше.
        }
        finally{
        //выполняется в любом случае ( блок finnaly не обязателен)
        }

    }

    public void test(int a) throws MyNewSubException {
        if(a==2)throw new MyNewSubException("ACAC");
    }
}
