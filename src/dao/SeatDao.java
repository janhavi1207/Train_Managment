/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Coach;

public interface SeatDao {
    void insert(Coach coach);
    void update(Coach coach);
    void delete(Coach coach);
    Coach getByID(int coachId);
    List<Coach> getAll();

}
