package magellan.plugin.statistics.torque;


import java.math.BigDecimal;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.ObjectUtils;
import org.apache.torque.TorqueException;
import org.apache.torque.map.TableMap;
import org.apache.torque.om.BaseObject;
import org.apache.torque.om.ComboKey;
import org.apache.torque.om.DateKey;
import org.apache.torque.om.NumberKey;
import org.apache.torque.om.ObjectKey;
import org.apache.torque.om.SimpleKey;
import org.apache.torque.om.StringKey;
import org.apache.torque.om.Persistent;
import org.apache.torque.util.Criteria;
import org.apache.torque.util.Transaction;





/**
 * Contains informations about turn specific building data
 *
 * This class was autogenerated by Torque on:
 *
 * [Fri May 23 08:09:17 CEST 2008]
 *
 * You should not use this class directly.  It should not even be
 * extended all references should be to BuildingStatisticsData
 */
public abstract class BaseBuildingStatisticsData extends BaseObject
{
    /** Serial version */
    private static final long serialVersionUID = 1211522957714L;

    /** The Peer class */
    private static final BuildingStatisticsDataPeer peer =
        new BuildingStatisticsDataPeer();


    /** The value for the iD field */
    private long iD;

    /** The value for the buildingId field */
    private long buildingId;

    /** The value for the turn field */
    private int turn;

    /** The value for the name field */
    private String name;

    /** The value for the description field */
    private String description;

    /** The value for the size field */
    private int size;

    /** The value for the owner field */
    private String owner;

    /** The value for the inmates field */
    private int inmates;


    /**
     * Get the ID
     *
     * @return long
     */
    public long getID()
    {
        return iD;
    }


    /**
     * Set the value of ID
     *
     * @param v new value
     */
    public void setID(long v) 
    {

        if (this.iD != v)
        {
            this.iD = v;
            setModified(true);
        }


    }

    /**
     * Get the BuildingId
     *
     * @return long
     */
    public long getBuildingId()
    {
        return buildingId;
    }


    /**
     * Set the value of BuildingId
     *
     * @param v new value
     */
    public void setBuildingId(long v) throws TorqueException
    {

        if (this.buildingId != v)
        {
            this.buildingId = v;
            setModified(true);
        }


        if (aBuildingStatistics != null && !(aBuildingStatistics.getID() == v))
        {
            aBuildingStatistics = null;
        }

    }

    /**
     * Get the Turn
     *
     * @return int
     */
    public int getTurn()
    {
        return turn;
    }


    /**
     * Set the value of Turn
     *
     * @param v new value
     */
    public void setTurn(int v) 
    {

        if (this.turn != v)
        {
            this.turn = v;
            setModified(true);
        }


    }

    /**
     * Get the Name
     *
     * @return String
     */
    public String getName()
    {
        return name;
    }


    /**
     * Set the value of Name
     *
     * @param v new value
     */
    public void setName(String v) 
    {

        if (!ObjectUtils.equals(this.name, v))
        {
            this.name = v;
            setModified(true);
        }


    }

    /**
     * Get the Description
     *
     * @return String
     */
    public String getDescription()
    {
        return description;
    }


    /**
     * Set the value of Description
     *
     * @param v new value
     */
    public void setDescription(String v) 
    {

        if (!ObjectUtils.equals(this.description, v))
        {
            this.description = v;
            setModified(true);
        }


    }

    /**
     * Get the Size
     *
     * @return int
     */
    public int getSize()
    {
        return size;
    }


    /**
     * Set the value of Size
     *
     * @param v new value
     */
    public void setSize(int v) 
    {

        if (this.size != v)
        {
            this.size = v;
            setModified(true);
        }


    }

    /**
     * Get the Owner
     *
     * @return String
     */
    public String getOwner()
    {
        return owner;
    }


    /**
     * Set the value of Owner
     *
     * @param v new value
     */
    public void setOwner(String v) 
    {

        if (!ObjectUtils.equals(this.owner, v))
        {
            this.owner = v;
            setModified(true);
        }


    }

    /**
     * Get the Inmates
     *
     * @return int
     */
    public int getInmates()
    {
        return inmates;
    }


    /**
     * Set the value of Inmates
     *
     * @param v new value
     */
    public void setInmates(int v) 
    {

        if (this.inmates != v)
        {
            this.inmates = v;
            setModified(true);
        }


    }

    



    private BuildingStatistics aBuildingStatistics;

    /**
     * Declares an association between this object and a BuildingStatistics object
     *
     * @param v BuildingStatistics
     * @throws TorqueException
     */
    public void setBuildingStatistics(BuildingStatistics v) throws TorqueException
    {
        if (v == null)
        {
            setBuildingId( 0);
        }
        else
        {
            setBuildingId(v.getID());
        }
        aBuildingStatistics = v;
    }


    /**
     * Returns the associated BuildingStatistics object.
     * If it was not retrieved before, the object is retrieved from
     * the database
     *
     * @return the associated BuildingStatistics object
     * @throws TorqueException
     */
    public BuildingStatistics getBuildingStatistics()
        throws TorqueException
    {
        if (aBuildingStatistics == null && (this.buildingId != 0))
        {
            aBuildingStatistics = BuildingStatisticsPeer.retrieveByPK(SimpleKey.keyFor(this.buildingId));
        }
        return aBuildingStatistics;
    }

    /**
     * Return the associated BuildingStatistics object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated BuildingStatistics object
     * @throws TorqueException
     */
    public BuildingStatistics getBuildingStatistics(Connection connection)
        throws TorqueException
    {
        if (aBuildingStatistics == null && (this.buildingId != 0))
        {
            aBuildingStatistics = BuildingStatisticsPeer.retrieveByPK(SimpleKey.keyFor(this.buildingId), connection);
        }
        return aBuildingStatistics;
    }

    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
     */
    public void setBuildingStatisticsKey(ObjectKey key) throws TorqueException
    {

        setBuildingId(((NumberKey) key).longValue());
    }
   
        
    private static List<String> fieldNames = null;

    /**
     * Generate a list of field names.
     *
     * @return a list of field names
     */
    public static synchronized List<String> getFieldNames()
    {
        if (fieldNames == null)
        {
            fieldNames = new ArrayList<String>();
            fieldNames.add("ID");
            fieldNames.add("BuildingId");
            fieldNames.add("Turn");
            fieldNames.add("Name");
            fieldNames.add("Description");
            fieldNames.add("Size");
            fieldNames.add("Owner");
            fieldNames.add("Inmates");
            fieldNames = Collections.unmodifiableList(fieldNames);
        }
        return fieldNames;
    }

    /**
     * Retrieves a field from the object by field (Java) name passed in as a String.
     *
     * @param name field name
     * @return value
     */
    public Object getByName(String name)
    {
        if (name.equals("ID"))
        {
            return new Long(getID());
        }
        if (name.equals("BuildingId"))
        {
            return new Long(getBuildingId());
        }
        if (name.equals("Turn"))
        {
            return new Integer(getTurn());
        }
        if (name.equals("Name"))
        {
            return getName();
        }
        if (name.equals("Description"))
        {
            return getDescription();
        }
        if (name.equals("Size"))
        {
            return new Integer(getSize());
        }
        if (name.equals("Owner"))
        {
            return getOwner();
        }
        if (name.equals("Inmates"))
        {
            return new Integer(getInmates());
        }
        return null;
    }

    /**
     * Set a field in the object by field (Java) name.
     *
     * @param name field name
     * @param value field value
     * @return True if value was set, false if not (invalid name / protected field).
     * @throws IllegalArgumentException if object type of value does not match field object type.
     * @throws TorqueException If a problem occurs with the set[Field] method.
     */
    public boolean setByName(String name, Object value )
        throws TorqueException, IllegalArgumentException
    {
        if (name.equals("ID"))
        {
            if (value == null || ! (Long.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not a Long object.");
            }
            setID(((Long) value).longValue());
            return true;
        }
        if (name.equals("BuildingId"))
        {
            if (value == null || ! (Long.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not a Long object.");
            }
            setBuildingId(((Long) value).longValue());
            return true;
        }
        if (name.equals("Turn"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setTurn(((Integer) value).intValue());
            return true;
        }
        if (name.equals("Name"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setName((String) value);
            return true;
        }
        if (name.equals("Description"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setDescription((String) value);
            return true;
        }
        if (name.equals("Size"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setSize(((Integer) value).intValue());
            return true;
        }
        if (name.equals("Owner"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setOwner((String) value);
            return true;
        }
        if (name.equals("Inmates"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setInmates(((Integer) value).intValue());
            return true;
        }
        return false;
    }

    /**
     * Retrieves a field from the object by name passed in
     * as a String.  The String must be one of the static
     * Strings defined in this Class' Peer.
     *
     * @param name peer name
     * @return value
     */
    public Object getByPeerName(String name)
    {
        if (name.equals(BuildingStatisticsDataPeer.ID))
        {
            return new Long(getID());
        }
        if (name.equals(BuildingStatisticsDataPeer.BUILDING_ID))
        {
            return new Long(getBuildingId());
        }
        if (name.equals(BuildingStatisticsDataPeer.TURN))
        {
            return new Integer(getTurn());
        }
        if (name.equals(BuildingStatisticsDataPeer.NAME))
        {
            return getName();
        }
        if (name.equals(BuildingStatisticsDataPeer.DESCRIPTION))
        {
            return getDescription();
        }
        if (name.equals(BuildingStatisticsDataPeer.SIZE))
        {
            return new Integer(getSize());
        }
        if (name.equals(BuildingStatisticsDataPeer.OWNER))
        {
            return getOwner();
        }
        if (name.equals(BuildingStatisticsDataPeer.INMATES))
        {
            return new Integer(getInmates());
        }
        return null;
    }

    /**
     * Set field values by Peer Field Name
     *
     * @param name field name
     * @param value field value
     * @return True if value was set, false if not (invalid name / protected field).
     * @throws IllegalArgumentException if object type of value does not match field object type.
     * @throws TorqueException If a problem occurs with the set[Field] method.
     */
    public boolean setByPeerName(String name, Object value)
        throws TorqueException, IllegalArgumentException
    {
      if (BuildingStatisticsDataPeer.ID.equals(name))
        {
            return setByName("ID", value);
        }
      if (BuildingStatisticsDataPeer.BUILDING_ID.equals(name))
        {
            return setByName("BuildingId", value);
        }
      if (BuildingStatisticsDataPeer.TURN.equals(name))
        {
            return setByName("Turn", value);
        }
      if (BuildingStatisticsDataPeer.NAME.equals(name))
        {
            return setByName("Name", value);
        }
      if (BuildingStatisticsDataPeer.DESCRIPTION.equals(name))
        {
            return setByName("Description", value);
        }
      if (BuildingStatisticsDataPeer.SIZE.equals(name))
        {
            return setByName("Size", value);
        }
      if (BuildingStatisticsDataPeer.OWNER.equals(name))
        {
            return setByName("Owner", value);
        }
      if (BuildingStatisticsDataPeer.INMATES.equals(name))
        {
            return setByName("Inmates", value);
        }
        return false;
    }

    /**
     * Retrieves a field from the object by Position as specified
     * in the xml schema.  Zero-based.
     *
     * @param pos position in xml schema
     * @return value
     */
    public Object getByPosition(int pos)
    {
        if (pos == 0)
        {
            return new Long(getID());
        }
        if (pos == 1)
        {
            return new Long(getBuildingId());
        }
        if (pos == 2)
        {
            return new Integer(getTurn());
        }
        if (pos == 3)
        {
            return getName();
        }
        if (pos == 4)
        {
            return getDescription();
        }
        if (pos == 5)
        {
            return new Integer(getSize());
        }
        if (pos == 6)
        {
            return getOwner();
        }
        if (pos == 7)
        {
            return new Integer(getInmates());
        }
        return null;
    }

    /**
     * Set field values by its position (zero based) in the XML schema.
     *
     * @param position The field position
     * @param value field value
     * @return True if value was set, false if not (invalid position / protected field).
     * @throws IllegalArgumentException if object type of value does not match field object type.
     * @throws TorqueException If a problem occurs with the set[Field] method.
     */
    public boolean setByPosition(int position, Object value)
        throws TorqueException, IllegalArgumentException
    {
    if (position == 0)
        {
            return setByName("ID", value);
        }
    if (position == 1)
        {
            return setByName("BuildingId", value);
        }
    if (position == 2)
        {
            return setByName("Turn", value);
        }
    if (position == 3)
        {
            return setByName("Name", value);
        }
    if (position == 4)
        {
            return setByName("Description", value);
        }
    if (position == 5)
        {
            return setByName("Size", value);
        }
    if (position == 6)
        {
            return setByName("Owner", value);
        }
    if (position == 7)
        {
            return setByName("Inmates", value);
        }
        return false;
    }
     
    /**
     * Stores the object in the database.  If the object is new,
     * it inserts it; otherwise an update is performed.
     *
     * @throws Exception
     */
    public void save() throws Exception
    {
        save(BuildingStatisticsDataPeer.DATABASE_NAME);
    }

    /**
     * Stores the object in the database.  If the object is new,
     * it inserts it; otherwise an update is performed.
     * Note: this code is here because the method body is
     * auto-generated conditionally and therefore needs to be
     * in this file instead of in the super class, BaseObject.
     *
     * @param dbName
     * @throws TorqueException
     */
    public void save(String dbName) throws TorqueException
    {
        Connection con = null;
        try
        {
            con = Transaction.begin(dbName);
            save(con);
            Transaction.commit(con);
        }
        catch(TorqueException e)
        {
            Transaction.safeRollback(con);
            throw e;
        }
    }

    /** flag to prevent endless save loop, if this object is referenced
        by another object which falls in this transaction. */
    private boolean alreadyInSave = false;
    /**
     * Stores the object in the database.  If the object is new,
     * it inserts it; otherwise an update is performed.  This method
     * is meant to be used as part of a transaction, otherwise use
     * the save() method and the connection details will be handled
     * internally
     *
     * @param con
     * @throws TorqueException
     */
    public void save(Connection con) throws TorqueException
    {
        if (!alreadyInSave)
        {
            alreadyInSave = true;



            // If this object has been modified, then save it to the database.
            if (isModified())
            {
                if (isNew())
                {
                    BuildingStatisticsDataPeer.doInsert((BuildingStatisticsData) this, con);
                    setNew(false);
                }
                else
                {
                    BuildingStatisticsDataPeer.doUpdate((BuildingStatisticsData) this, con);
                }
            }

            alreadyInSave = false;
        }
    }


    /**
     * Set the PrimaryKey using ObjectKey.
     *
     * @param key iD ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        
    {
        setID(((NumberKey) key).longValue());
    }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) 
    {
        setID(Long.parseLong(key));
    }


    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
        return SimpleKey.keyFor(getID());
    }
 

    /**
     * Makes a copy of this object.
     * It creates a new object filling in the simple attributes.
     * It then fills all the association collections and sets the
     * related objects to isNew=true.
     */
    public BuildingStatisticsData copy() throws TorqueException
    {
        return copy(true);
    }

    /**
     * Makes a copy of this object using connection.
     * It creates a new object filling in the simple attributes.
     * It then fills all the association collections and sets the
     * related objects to isNew=true.
     *
     * @param con the database connection to read associated objects.
     */
    public BuildingStatisticsData copy(Connection con) throws TorqueException
    {
        return copy(true, con);
    }

    /**
     * Makes a copy of this object.
     * It creates a new object filling in the simple attributes.
     * If the parameter deepcopy is true, it then fills all the
     * association collections and sets the related objects to
     * isNew=true.
     *
     * @param deepcopy whether to copy the associated objects.
     */
    public BuildingStatisticsData copy(boolean deepcopy) throws TorqueException
    {
        return copyInto(new BuildingStatisticsData(), deepcopy);
    }

    /**
     * Makes a copy of this object using connection.
     * It creates a new object filling in the simple attributes.
     * If the parameter deepcopy is true, it then fills all the
     * association collections and sets the related objects to
     * isNew=true.
     *
     * @param deepcopy whether to copy the associated objects.
     * @param con the database connection to read associated objects.
     */
    public BuildingStatisticsData copy(boolean deepcopy, Connection con) throws TorqueException
    {
        return copyInto(new BuildingStatisticsData(), deepcopy, con);
    }
  
    /**
     * Fills the copyObj with the contents of this object.
     * The associated objects are also copied and treated as new objects.
     *
     * @param copyObj the object to fill.
     */
    protected BuildingStatisticsData copyInto(BuildingStatisticsData copyObj) throws TorqueException
    {
        return copyInto(copyObj, true);
    }

  
    /**
     * Fills the copyObj with the contents of this object using connection.
     * The associated objects are also copied and treated as new objects.
     *
     * @param copyObj the object to fill.
     * @param con the database connection to read associated objects.
     */
    protected BuildingStatisticsData copyInto(BuildingStatisticsData copyObj, Connection con) throws TorqueException
    {
        return copyInto(copyObj, true, con);
    }
  
    /**
     * Fills the copyObj with the contents of this object.
     * If deepcopy is true, The associated objects are also copied
     * and treated as new objects.
     *
     * @param copyObj the object to fill.
     * @param deepcopy whether the associated objects should be copied.
     */
    protected BuildingStatisticsData copyInto(BuildingStatisticsData copyObj, boolean deepcopy) throws TorqueException
    {
        copyObj.setID(iD);
        copyObj.setBuildingId(buildingId);
        copyObj.setTurn(turn);
        copyObj.setName(name);
        copyObj.setDescription(description);
        copyObj.setSize(size);
        copyObj.setOwner(owner);
        copyObj.setInmates(inmates);

        copyObj.setID( 0);

        if (deepcopy)
        {
        }
        return copyObj;
    }
        
    
    /**
     * Fills the copyObj with the contents of this object using connection.
     * If deepcopy is true, The associated objects are also copied
     * and treated as new objects.
     *
     * @param copyObj the object to fill.
     * @param deepcopy whether the associated objects should be copied.
     * @param con the database connection to read associated objects.
     */
    protected BuildingStatisticsData copyInto(BuildingStatisticsData copyObj, boolean deepcopy, Connection con) throws TorqueException
    {
        copyObj.setID(iD);
        copyObj.setBuildingId(buildingId);
        copyObj.setTurn(turn);
        copyObj.setName(name);
        copyObj.setDescription(description);
        copyObj.setSize(size);
        copyObj.setOwner(owner);
        copyObj.setInmates(inmates);

        copyObj.setID( 0);

        if (deepcopy)
        {
        }
        return copyObj;
    }
    
    

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public BuildingStatisticsDataPeer getPeer()
    {
        return peer;
    }

    /**
     * Retrieves the TableMap object related to this Table data without
     * compiler warnings of using getPeer().getTableMap().
     *
     * @return The associated TableMap object.
     */
    public TableMap getTableMap() throws TorqueException
    {
        return BuildingStatisticsDataPeer.getTableMap();
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("BuildingStatisticsData:\n");
        str.append("ID = ")
           .append(getID())
           .append("\n");
        str.append("BuildingId = ")
           .append(getBuildingId())
           .append("\n");
        str.append("Turn = ")
           .append(getTurn())
           .append("\n");
        str.append("Name = ")
           .append(getName())
           .append("\n");
        str.append("Description = ")
           .append(getDescription())
           .append("\n");
        str.append("Size = ")
           .append(getSize())
           .append("\n");
        str.append("Owner = ")
           .append(getOwner())
           .append("\n");
        str.append("Inmates = ")
           .append(getInmates())
           .append("\n");
        return(str.toString());
    }
}
