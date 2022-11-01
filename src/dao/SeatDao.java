/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Seat;

public interface SeatDao {
    boolean insert(Seat seat);
    boolean update(Seat seat);
    boolean delete(Seat seat);
    Seat getByID(int seatId);
    List<Seat> getAll();

}
