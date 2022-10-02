package gcu.rsoemo.cst391.milestone.dataaccesslayer;

import java.util.List;

/**
 * The interface that is used to communicate with a specified database table
 * @author Rhese
 */
public interface DatabaseTableInterface<T>
{
    /**
     * Creates an object in a Database Table
     * @param createdObject Object Model to be translated into the database table
     */
    public void createObject(T createdObject);

    /**
     * Reads all the objects out of a Database Table
     * @return Returns the list of data from the table
     */
    public List<T> readObjects();

    /**
     * Reads an object out of a Database Table
     * @return Returns the list of data from the table
     */
    public T readObject(int id);

    /**
     * Updates a specified object in a Database Table
     * @param updatedObject Object Model that is being used to update
     */
    public void updateObject(T updatedObject);

    /**
     * Deletes a specified object in a Database Table
     * @param deleteObject Object Model that is being deleted
     */
    public void deleteObject(T deleteObject);
}