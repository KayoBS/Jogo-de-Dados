package entities;

public class Dice
{
    private int faceValue;

    public int getFaceValue()
    {
        return this.faceValue;
    }
    public void setFaceValue()
    {
        this.faceValue = (int)(1 + Math.random()*6);
    }
}
