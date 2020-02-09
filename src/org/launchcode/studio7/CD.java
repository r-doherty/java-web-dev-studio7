package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public CD(String aName, int someCapacity, String aType, int usedStorage)
    {
        super(aName, someCapacity, aType, usedStorage);
    }

    @Override
    public void spinDisc(){
        System.out.println("A CD spins at a rate of 200-500 rpm");
    }

    @Override
    public void readData(){
        System.out.println("I'm Commander Shepard, and this is my favorite store on the Citadel!");
    }

}
