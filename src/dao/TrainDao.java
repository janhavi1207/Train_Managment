
package dao;

import java.util.List;
import model.Train;

public interface TrainDao {
    void insert(Train train);
    void update(Train train);
    void delete(Train train);
    Train getByID(int trainId);
    List<Train> getAll();

}
