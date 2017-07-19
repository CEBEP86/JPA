package xyz.samsonovs.TemplateJSP.simplecode;

/**
 * Created by Костя on 18.07.2017.
 */
public class WorkWithStr {
    String a="Java";
    String b="Craft";
    String c=a+b;
    public void start(){
        System.out.println(a+" "+b);
        System.out.println(a.substring(1,3));
        System.out.println("№ cимволов af в слове Craft:"+ b.indexOf("af") );
        System.out.println(c.replace("Craft","Love"));

    }
}
