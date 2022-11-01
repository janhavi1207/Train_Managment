package model;

import model.enums.SeatType;

public class Seat {
    private int id;
    private boolean availability;
    private SeatType type;

    @Override
    public String toString() {
        return "Seat{" + "id=" + id + ", availability=" + availability + ", type=" + type + '}';
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public SeatType getType() {
        return type;
    }

    public void setType(SeatType type) {
        this.type = type;
    }
}


