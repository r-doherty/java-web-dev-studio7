package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public DVD(String aName, int someCapacity, String aType, int usedStorage)
    {
        super(aName, someCapacity, aType, usedStorage);
    }

    @Override
    public void spinDisc(){
        System.out.println("A DVD spins at a rate of 570-1600 rpm");
    }

    @Override
    public void readData(){
        System.out.println("May the Force be with you.");
    }

}
