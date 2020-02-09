package org.launchcode.studio7;

public abstract class BaseDisc {

    private String name;
    private int dataCapacity;
    private int remainingStorage;
    private int storageUsed;

    public BaseDisc(String aName, int maxCapacity, String aType, int usedStorage)
    {
        name = aName;
        dataCapacity = maxCapacity;
        storageUsed = checkCapacity(usedStorage);
        remainingStorage = spaceLeft();
    }

    private int checkCapacity(int dataStored)
    {
        if (dataCapacity < dataStored)
            return dataCapacity;
        else
            return dataStored;
    }

    private int spaceLeft() {
        return dataCapacity - storageUsed;
    }

    public String diskInfo() {
        String output = String.format(
                "\nDisk name: %s\nMax capacity: %d" + "\nSpace used: %d" + "\nAvailable space: %d\n", name,
                dataCapacity, storageUsed, remainingStorage);
        return output;
    }

    public String writeData(int dataToWrite)
    {
        if(dataToWrite > remainingStorage)
        {
            return "Not enough disc space!";
        }
        storageUsed += dataToWrite;
        remainingStorage -= dataToWrite;

        return "Data written to disc. Remaining space = " + remainingStorage;
    }
}
