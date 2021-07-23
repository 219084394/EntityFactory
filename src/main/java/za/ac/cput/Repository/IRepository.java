/*
    Liam Stewart
    219084394
 */
package za.ac.cput.Repository;
/*
    --------------
    Instructions:
    --------------
    Hello team, I have created repository classes for your entities. Please use the IRepository interface
    and implement the create, read, update, and delete methods in your entity repositories and not the
    IRepository interface. Once you've implemented them you can test them in your test repository classes.
    Good luck!
 */

public interface IRepository<T, ID> {
/*
    T = Type parameter
    ID = Type parameter for specific string types which are identifiers such as id numbers etc
    t & id are parameters
 */

    public T create(T t);

    public T read (ID id);

    public T update(T t);

    public void delete(ID id);
}


