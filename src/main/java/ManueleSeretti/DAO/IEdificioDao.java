package ManueleSeretti.DAO;

import ManueleSeretti.Entities.Edificio;

import java.util.List;

public interface IEdificioDao {
    public void save(Edificio edificio);

    public void findByIdAndUpdate(long id, Edificio edificio);

    public void findByIdAndDelete(long id);

    public Edificio findById(long id) throws Throwable;

    public List<Edificio> findAll();
}
