package daysevenhomework;

public class Monitor {

    Resolution resolution;
    //long will not accept HP24m so changing into string
   String modelNumber;

    String manufacturerName;


    public void drawPixel(int x, int y, String color){

        System.out.println("Drawing pixel at " + x + "," + y + " in color " + color);
    }

    // string representation-- maybe what he means?
    // There should be an existing method that takes a piece of dat and converts it *to* a *String*


    @Override
    public String toString() {

        return "Monitor{" + "resolution=" + resolution + ","+ "modelNumber=" + "'" + modelNumber+ "'," + "manufacturerName=" + "'" +manufacturerName+ "'}";

    }

    public Monitor(Resolution resolution, String modelNumber, String manufacturerName) {
        this.resolution = resolution;
        this.modelNumber = modelNumber;
        this.manufacturerName = manufacturerName;
    }
}

