package xyz.samsonovs.TemplateJSP.simplecode.classes;

/**
 * Created by Костя on 15.07.2017.
 */
public class Corolla extends Car {
    public Corolla(){
        this.setModel("Corolla");
    }

    @Override
    public void driveToMSK() {
        this.setDistance(this.getDistance()+50);
    }
}
