package xyz.samsonovs.TemplateJSP.simplecode;

import xyz.samsonovs.TemplateJSP.simplecode.Interface.ClassForInterface;
import xyz.samsonovs.TemplateJSP.simplecode.Interface.printers.AdvConsolePrinter;
import xyz.samsonovs.TemplateJSP.simplecode.Interface.printers.ConsolePrinter;
import xyz.samsonovs.TemplateJSP.simplecode.Interface.printers.IPrinter;
import xyz.samsonovs.TemplateJSP.simplecode.Interface.readers.IReader;
import xyz.samsonovs.TemplateJSP.simplecode.Interface.readers.PreDefinedReader;
import xyz.samsonovs.TemplateJSP.simplecode.Threads.ThreadClass;
import xyz.samsonovs.TemplateJSP.simplecode.classes.Car;
import xyz.samsonovs.TemplateJSP.simplecode.classes.Corolla;
import xyz.samsonovs.TemplateJSP.simplecode.classes.Sto;
import xyz.samsonovs.TemplateJSP.simplecode.collections.Collect;
import xyz.samsonovs.TemplateJSP.simplecode.exeptions.Excep;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Костя on 15.07.2017.
 */
public class FirstClass {
    public static void go (){
        for(int i=0;i<101;i++) {
            System.out.println(i);
            if(i==100)System.out.println((int)Math.floor(Math.random()*100));//превращаем в int. округляем. берем рандом
        }

        Car car1=new Car("Camry");
        Car car2=new Corolla();
        System.out.println(car1.getModel());
        car1.driveToMSK();
        car1.driveToMSK();
        System.out.println(car1.getDistance());

        System.out.println(car2.getModel());
        car2.driveToMSK();
        car2.driveToMSK();
        System.out.println(car2.getDistance());

        Car[] cars=new Car[2];
        cars[0]=car1;
        Sto sto=new Sto();
        sto.decrementDistance(cars[0]);
        System.out.println(cars[0].getDistance());

        //Интрефейсы
        final IReader reader=new PreDefinedReader("asdooasdqw oo oowqd@!oo");
        final IPrinter printer=new ConsolePrinter();
        final IPrinter advPrinter=new AdvConsolePrinter();
        final ClassForInterface classForInterface=new ClassForInterface(printer,reader);
        final ClassForInterface advClassForInterface=new ClassForInterface(advPrinter,reader);
        classForInterface.work();
        advClassForInterface.work();

        ///блок с коллекициями
        Collect col=new Collect();
        col.printCollect();


        ////exceptions
        Excep excep=new Excep();
        excep.go();

        ///Threads v1
        new ThreadClass().start();

        ///Threads v2
        Thread myThready = new Thread(new Runnable()
        {
            public void run() //Этот метод будет выполняться в побочном потоке
            {
                System.out.println("Привет из побочного потока!");
            }
        });
        myThready.start();	//Запуск потока

        WorkWithInt workWithInt=new WorkWithInt();workWithInt.start();
        WorkWithStr workWithStr=new WorkWithStr();workWithStr.start();

        ////hardCode
        boolean condition=false;
        int result = (condition)? 0: 1;
        int result2 = 3;

        ///(АРГУМЕНТЫ)->{ТЕЛО МЕТОДА}
        List<Integer> numbers=new ArrayList<Integer>();
        numbers.add(2);numbers.add(3);
        numbers.forEach(value -> System.out.print(value));
        numbers.forEach(System.out::print);///одно  и тоже
        /*
        int sum = widgets.stream()
                      .filter(b -> b.getColor() == RED)
                      .mapToInt(b -> b.getWeight())
                      .sum();

         int sumOfWeights = widgets.parallelStream()
                               .filter(b -> b.getColor() == RED)
                               .mapToInt(b -> b.getWeight())
                               .sum();
         */

}
}
