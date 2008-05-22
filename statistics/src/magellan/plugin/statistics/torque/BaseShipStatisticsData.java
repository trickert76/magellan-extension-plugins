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
 * Contains informations about turn specific ship data
 *
 * This class was autogenerated by Torque on:
 *
 * [Wed May 21 18:19:59 CEST 2008]
 *
 * You should not use this class directly.  It should not even be
 * extended all references should be to ShipStatisticsData
 */
public abstract class BaseShipStatisticsData extends BaseObject
{
    /** Serial version */
    private static final long serialVersionUID = 1211386799175L;

    /** The Peer class */
    private static final ShipStatisticsDataPeer peer =
        new ShipStatisticsDataPeer();


    /** The value for the iD field */
    private long iD;

    /** The value for the shipId field */
    private long shipId;

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

    /** The value for the region field */
    private String region;

    /** The value for the passengers field */
    private int passengers;

    /** The value for the maxCargo field */
    private int maxCargo;

    /** The value for the cargo field */
    private int cargo;

    /** The value for the capacity field */
    private int capacity;

    /** The value for the damageRatio field */
    private int damageRatio;


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
     * Get the ShipId
     *
     * @return long
     */
    public long getShipId()
    {
        return shipId;
    }


    /**
     * Set the value of ShipId
     *
     * @param v new value
     */
    public void setShipId(long v) throws TorqueException
    {

        if (this.shipId != v)
        {
            this.shipId = v;
            setModified(true);
        }


        if (aShipStatistics != null && !(aShipStatistics.getID() == v))
        {
            aShipStatistics = null;
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
     * Get the Region
     *
     * @return String
     */
    public String getRegion()
    {
        return region;
    }


    /**
     * Set the value of Region
     *
     * @param v new value
     */
    public void setRegion(String v) 
    {

        if (!ObjectUtils.equals(this.region, v))
        {
            this.region = v;
            setModified(true);
        }


    }

    /**
     * Get the Passengers
     *
     * @return int
     */
    public int getPassengers()
    {
        return passengers;
    }


    /**
     * Set the value of Passengers
     *
     * @param v new value
     */
    public void setPassengers(int v) 
    {

        if (this.passengers != v)
        {
            this.passengers = v;
            setModified(true);
        }


    }

    /**
     * Get the MaxCargo
     *
     * @return int
     */
    public int getMaxCargo()
    {
        return maxCargo;
    }


    /**
     * Set the value of MaxCargo
     *
     * @param v new value
     */
    public void setMaxCargo(int v) 
    {

        if (this.maxCargo != v)
        {
            this.maxCargo = v;
            setModified(true);
        }


    }

    /**
     * Get the Cargo
     *
     * @return int
     */
    public int getCargo()
    {
        return cargo;
    }


    /**
     * Set the value of Cargo
     *
     * @param v new value
     */
    public void setCargo(int v) 
    {

        if (this.cargo != v)
        {
            this.cargo = v;
            setModified(true);
        }


    }

    /**
     * Get the Capacity
     *
     * @return int
     */
    public int getCapacity()
    {
        return capacity;
    }


    /**
     * Set the value of Capacity
     *
     * @param v new value
     */
    public void setCapacity(int v) 
    {

        if (this.capacity != v)
        {
            this.capacity = v;
            setModified(true);
        }


    }

    /**
     * Get the DamageRatio
     *
     * @return int
     */
    public int getDamageRatio()
    {
        return damageRatio;
    }


    /**
     * Set the value of DamageRatio
     *
     * @param v new value
     */
    public void setDamageRatio(int v) 
    {

        if (this.damageRatio != v)
        {
            this.damageRatio = v;
            setModified(true);
        }


    }

    



    private ShipStatistics aShipStatistics;

    /**
     * Declares an association between this object and a ShipStatistics object
     *
     * @param v ShipStatistics
     * @throws TorqueException
     */
    public void setShipStatistics(ShipStatistics v) throws TorqueException
    {
        if (v == null)
        {
            setShipId( 0);
        }
        else
        {
            setShipId(v.getID());
        }
        aShipStatistics = v;
    }


    /**
     * Returns the associated ShipStatistics object.
     * If it was not retrieved before, the object is retrieved from
     * the database
     *
     * @return the associated ShipStatistics object
     * @throws TorqueException
     */
    public ShipStatistics getShipStatistics()
        throws TorqueException
    {
        if (aShipStatistics == null && (this.shipId != 0))
        {
            aShipStatistics = ShipStatisticsPeer.retrieveByPK(SimpleKey.keyFor(this.shipId));
        }
        return aShipStatistics;
    }

    /**
     * Return the associated ShipStatistics object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated ShipStatistics object
     * @throws TorqueException
     */
    public ShipStatistics getShipStatistics(Connection connection)
        throws TorqueException
    {
        if (aShipStatistics == null && (this.shipId != 0))
        {
            aShipStatistics = ShipStatisticsPeer.retrieveByPK(SimpleKey.keyFor(this.shipId), connection);
        }
        return aShipStatistics;
    }

    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
     */
    public void setShipStatisticsKey(ObjectKey key) throws TorqueException
    {

        setShipId(((NumberKey) key).longValue());
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
            fieldNames.add("ShipId");
            fieldNames.add("Turn");
            fieldNames.add("Name");
            fieldNames.add("Description");
            fieldNames.add("Size");
            fieldNames.add("Owner");
            fieldNames.add("Region");
            fieldNames.add("Passengers");
            fieldNames.add("MaxCargo");
            fieldNames.add("Cargo");
            fieldNames.add("Capacity");
            fieldNames.add("DamageRatio");
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
        if (name.equals("ShipId"))
        {
            return new Long(getShipId());
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
        if (name.equals("Region"))
        {
            return getRegion();
        }
        if (name.equals("Passengers"))
        {
            return new Integer(getPassengers());
        }
        if (name.equals("MaxCargo"))
        {
            return new Integer(getMaxCargo());
        }
        if (name.equals("Cargo"))
        {
            return new Integer(getCargo());
        }
        if (name.equals("Capacity"))
        {
            return new Integer(getCapacity());
        }
        if (name.equals("DamageRatio"))
        {
            return new Integer(getDamageRatio());
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
        if (name.equals("ShipId"))
        {
            if (value == null || ! (Long.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not a Long object.");
            }
            setShipId(((Long) value).longValue());
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
        if (name.equals("Region"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setRegion((String) value);
            return true;
        }
        if (name.equals("Passengers"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setPassengers(((Integer) value).intValue());
            return true;
        }
        if (name.equals("MaxCargo"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setMaxCargo(((Integer) value).intValue());
            return true;
        }
        if (name.equals("Cargo"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setCargo(((Integer) value).intValue());
            return true;
        }
        if (name.equals("Capacity"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setCapacity(((Integer) value).intValue());
            return true;
        }
        if (name.equals("DamageRatio"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setDamageRatio(((Integer) value).intValue());
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
        if (name.equals(ShipStatisticsDataPeer.ID))
        {
            return new Long(getID());
        }
        if (name.equals(ShipStatisticsDataPeer.SHIP_ID))
        {
            return new Long(getShipId());
        }
        if (name.equals(ShipStatisticsDataPeer.TURN))
        {
            return new Integer(getTurn());
        }
        if (name.equals(ShipStatisticsDataPeer.NAME))
        {
            return getName();
        }
        if (name.equals(ShipStatisticsDataPeer.DESCRIPTION))
        {
            return getDescription();
        }
        if (name.equals(ShipStatisticsDataPeer.SIZE))
        {
            return new Integer(getSize());
        }
        if (name.equals(ShipStatisticsDataPeer.OWNER))
        {
            return getOwner();
        }
        if (name.equals(ShipStatisticsDataPeer.REGION))
        {
            return getRegion();
        }
        if (name.equals(ShipStatisticsDataPeer.PASSENGERS))
        {
            return new Integer(getPassengers());
        }
        if (name.equals(ShipStatisticsDataPeer.MAX_CARGO))
        {
            return new Integer(getMaxCargo());
        }
        if (name.equals(ShipStatisticsDataPeer.CARGO))
        {
            return new Integer(getCargo());
        }
        if (name.equals(ShipStatisticsDataPeer.CAPACITY))
        {
            return new Integer(getCapacity());
        }
        if (name.equals(ShipStatisticsDataPeer.DAMAGE_RATIO))
        {
            return new Integer(getDamageRatio());
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
      if (ShipStatisticsDataPeer.ID.equals(name))
        {
            return setByName("ID", value);
        }
      if (ShipStatisticsDataPeer.SHIP_ID.equals(name))
        {
            return setByName("ShipId", value);
        }
      if (ShipStatisticsDataPeer.TURN.equals(name))
        {
            return setByName("Turn", value);
        }
      if (ShipStatisticsDataPeer.NAME.equals(name))
        {
            return setByName("Name", value);
        }
      if (ShipStatisticsDataPeer.DESCRIPTION.equals(name))
        {
            return setByName("Description", value);
        }
      if (ShipStatisticsDataPeer.SIZE.equals(name))
        {
            return setByName("Size", value);
        }
      if (ShipStatisticsDataPeer.OWNER.equals(name))
        {
            return setByName("Owner", value);
        }
      if (ShipStatisticsDataPeer.REGION.equals(name))
        {
            return setByName("Region", value);
        }
      if (ShipStatisticsDataPeer.PASSENGERS.equals(name))
        {
            return setByName("Passengers", value);
        }
      if (ShipStatisticsDataPeer.MAX_CARGO.equals(name))
        {
            return setByName("MaxCargo", value);
        }
      if (ShipStatisticsDataPeer.CARGO.equals(name))
        {
            return setByName("Cargo", value);
        }
      if (ShipStatisticsDataPeer.CAPACITY.equals(name))
        {
            return setByName("Capacity", value);
        }
      if (ShipStatisticsDataPeer.DAMAGE_RATIO.equals(name))
        {
            return setByName("DamageRatio", value);
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
            return new Long(getShipId());
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
            return getRegion();
        }
        if (pos == 8)
        {
            return new Integer(getPassengers());
        }
        if (pos == 9)
        {
            return new Integer(getMaxCargo());
        }
        if (pos == 10)
        {
            return new Integer(getCargo());
        }
        if (pos == 11)
        {
            return new Integer(getCapacity());
        }
        if (pos == 12)
        {
            return new Integer(getDamageRatio());
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
            return setByName("ShipId", value);
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
            return setByName("Region", value);
        }
    if (position == 8)
        {
            return setByName("Passengers", value);
        }
    if (position == 9)
        {
            return setByName("MaxCargo", value);
        }
    if (position == 10)
        {
            return setByName("Cargo", value);
        }
    if (position == 11)
        {
            return setByName("Capacity", value);
        }
    if (position == 12)
        {
            return setByName("DamageRatio", value);
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
        save(ShipStatisticsDataPeer.DATABASE_NAME);
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
                    ShipStatisticsDataPeer.doInsert((ShipStatisticsData) this, con);
                    setNew(false);
                }
                else
                {
                    ShipStatisticsDataPeer.doUpdate((ShipStatisticsData) this, con);
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
    public ShipStatisticsData copy() throws TorqueException
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
    public ShipStatisticsData copy(Connection con) throws TorqueException
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
    public ShipStatisticsData copy(boolean deepcopy) throws TorqueException
    {
        return copyInto(new ShipStatisticsData(), deepcopy);
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
    public ShipStatisticsData copy(boolean deepcopy, Connection con) throws TorqueException
    {
        return copyInto(new ShipStatisticsData(), deepcopy, con);
    }
  
    /**
     * Fills the copyObj with the contents of this object.
     * The associated objects are also copied and treated as new objects.
     *
     * @param copyObj the object to fill.
     */
    protected ShipStatisticsData copyInto(ShipStatisticsData copyObj) throws TorqueException
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
    protected ShipStatisticsData copyInto(ShipStatisticsData copyObj, Connection con) throws TorqueException
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
    protected ShipStatisticsData copyInto(ShipStatisticsData copyObj, boolean deepcopy) throws TorqueException
    {
        copyObj.setID(iD);
        copyObj.setShipId(shipId);
        copyObj.setTurn(turn);
        copyObj.setName(name);
        copyObj.setDescription(description);
        copyObj.setSize(size);
        copyObj.setOwner(owner);
        copyObj.setRegion(region);
        copyObj.setPassengers(passengers);
        copyObj.setMaxCargo(maxCargo);
        copyObj.setCargo(cargo);
        copyObj.setCapacity(capacity);
        copyObj.setDamageRatio(damageRatio);

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
    protected ShipStatisticsData copyInto(ShipStatisticsData copyObj, boolean deepcopy, Connection con) throws TorqueException
    {
        copyObj.setID(iD);
        copyObj.setShipId(shipId);
        copyObj.setTurn(turn);
        copyObj.setName(name);
        copyObj.setDescription(description);
        copyObj.setSize(size);
        copyObj.setOwner(owner);
        copyObj.setRegion(region);
        copyObj.setPassengers(passengers);
        copyObj.setMaxCargo(maxCargo);
        copyObj.setCargo(cargo);
        copyObj.setCapacity(capacity);
        copyObj.setDamageRatio(damageRatio);

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
    public ShipStatisticsDataPeer getPeer()
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
        return ShipStatisticsDataPeer.getTableMap();
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("ShipStatisticsData:\n");
        str.append("ID = ")
           .append(getID())
           .append("\n");
        str.append("ShipId = ")
           .append(getShipId())
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
        str.append("Region = ")
           .append(getRegion())
           .append("\n");
        str.append("Passengers = ")
           .append(getPassengers())
           .append("\n");
        str.append("MaxCargo = ")
           .append(getMaxCargo())
           .append("\n");
        str.append("Cargo = ")
           .append(getCargo())
           .append("\n");
        str.append("Capacity = ")
           .append(getCapacity())
           .append("\n");
        str.append("DamageRatio = ")
           .append(getDamageRatio())
           .append("\n");
        return(str.toString());
    }
}