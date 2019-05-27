package fr.univtln.lmamane731.DAO;

public interface daointerface<T> {
    public T create(T t);
    public T find(Class type,Object id);
    public T update(T t);
    public void delete(Class type,Object id);

}
