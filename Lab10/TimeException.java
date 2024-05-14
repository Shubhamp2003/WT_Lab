package WT_Lab.Lab10;

class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}
class Time
 {
    private int hours;
    private int minutes;
    private int seconds;
    public Time(int hours, int minutes, int seconds) throws HrsException, MinException, SecException 
    {
        if (hours > 24 || hours < 0) 
        {
            throw new HrsException("Invalid value for hours");
        }
        if (minutes > 60 || minutes < 0) 
        {
            throw new MinException("Invalid value for minutes");
        }
        if (seconds > 60 || seconds < 0) 
        {
            throw new SecException("Invalid value for seconds");
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public int getHours()
    {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() 
    {
        return minutes;
    }
    public void setMinutes(int minutes) 
    {
        this.minutes = minutes;
    }

    public int getSeconds() 
    {
        return seconds;
    }

    public void setSeconds(int seconds) 
    {
        this.seconds = seconds;
    }
}
public class TimeExceptionExample 
{
    public static void main(String[] args) 
    {
        try 
        {
            Time t = new Time(25, 70, 50); // Throws HrsException, MinException, and SecException
        } catch (HrsException e) 
        {
            System.out.println("Caught HrsException: " + e.getMessage());
        } catch (MinException e) 
        {
            System.out.println("Caught MinException: " + e.getMessage());
        } catch (SecException e) {
            System.out.println("Caught SecException: " + e.getMessage());
        }
    }
}