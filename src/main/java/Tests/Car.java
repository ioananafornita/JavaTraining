package Tests;

public class Car
{
    // obiectul = instantierea unei clase
    // o clasa = blue printul unui obiect
    // un obiect va avea aceleasi functii si proprietati preluate de la clasa

    final String Left = "Left";
    final String Right = "Right";
    // Properties
    int NumberOfDoors;
    String Color = "Red";
    String Make;
    String Model;
    Boolean IsStarted = false;
    Boolean IsSignalingRight = false;
    Boolean IsSignalingLeft = false;


    public String getLeft() {
        return Left;
    }

    public String getRight() {
        return Right;
    }

    public int getNumberOfDoors() {
        return NumberOfDoors;
    }

    public String getColor() {
        return Color;
    }

    public String getMake() {
        return Make;
    }

    public String getModel() {
        return Model;
    }

    public Boolean getStarted() {
        return IsStarted;
    }

    public Boolean getSignalingRight() {
        return IsSignalingRight;
    }

    public Boolean getSignalingLeft() {
        return IsSignalingLeft;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        NumberOfDoors = numberOfDoors;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setMake(String make) {
        Make = make;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setStarted(Boolean started) {
        IsStarted = started;
    }

    public void setSignalingRight(Boolean signalingRight) {
        IsSignalingRight = signalingRight;
    }

    public void setSignalingLeft(Boolean signalingLeft) {
        IsSignalingLeft = signalingLeft;
    }

    public void Start()
    {
        IsStarted = true;
    }

    public void Stop()
    {
        IsStarted = false;
    }

    public void Signal(String direction)
    {
        if (direction == Left)
        {
            IsSignalingLeft = true;
            IsSignalingRight = false;
        } else
            if (direction == Right)
            {
                IsSignalingRight = true;
                IsSignalingLeft = false;
            }
    }


    /*void DoSomething()
    {
        randomNumber = 10;
        int anotherNumber = 15;
        System.out.println(randomNumber);
    }

    void DoSomethingElse()
    {
        randomNumber = 20;
        System.out.println(randomNumber);
    }
*/

}

