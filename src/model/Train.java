package model;

import java.util.List;

public class Train {
   private int id;
   private String name;
   private List<Coach> coaches;
   private String Boarding;
   private String Destination;

    @Override
    public String toString() {
        return "Train{" + "id=" + id + ", name=" + name + ", coaches=" + coaches + ", Boarding=" + Boarding + ", Destination=" + Destination + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Coach> getCoaches() {
        return coaches;
    }

    public void setCoaches(List<Coach> coaches) {
        this.coaches = coaches;
    }

    public String getBoarding() {
        return Boarding;
    }

    public void setBoarding(String Boarding) {
        this.Boarding = Boarding;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

}
 
