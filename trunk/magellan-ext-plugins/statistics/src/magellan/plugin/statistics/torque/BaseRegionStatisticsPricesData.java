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
 * Contains informations about turn specific region prices
 *
 * This class was autogenerated by Torque on:
 *
 * [Mon May 26 20:45:18 CEST 2008]
 *
 * You should not use this class directly.  It should not even be
 * extended all references should be to RegionStatisticsPricesData
 */
public abstract class BaseRegionStatisticsPricesData extends BaseObject
{
    /** Serial version */
    private static final long serialVersionUID = 1211827518107L;

    /** The Peer class */
    private static final RegionStatisticsPricesDataPeer peer =
        new RegionStatisticsPricesDataPeer();


    /** The value for the iD field */
    private long iD;

    /** The value for the turnId field */
    private long turnId;

    /** The value for the regionId field */
    private long regionId;

    /** The value for the luxuryItem field */
    private String luxuryItem;

    /** The value for the price field */
    private int price;


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
     * Get the TurnId
     *
     * @return long
     */
    public long getTurnId()
    {
        return turnId;
    }


    /**
     * Set the value of TurnId
     *
     * @param v new value
     */
    public void setTurnId(long v) throws TorqueException
    {

        if (this.turnId != v)
        {
            this.turnId = v;
            setModified(true);
        }


        if (aRegionStatisticsData != null && !(aRegionStatisticsData.getID() == v))
        {
            aRegionStatisticsData = null;
        }

    }

    /**
     * Get the RegionId
     *
     * @return long
     */
    public long getRegionId()
    {
        return regionId;
    }


    /**
     * Set the value of RegionId
     *
     * @param v new value
     */
    public void setRegionId(long v) throws TorqueException
    {

        if (this.regionId != v)
        {
            this.regionId = v;
            setModified(true);
        }


        if (aRegionStatistics != null && !(aRegionStatistics.getID() == v))
        {
            aRegionStatistics = null;
        }

    }

    /**
     * Get the LuxuryItem
     *
     * @return String
     */
    public String getLuxuryItem()
    {
        return luxuryItem;
    }


    /**
     * Set the value of LuxuryItem
     *
     * @param v new value
     */
    public void setLuxuryItem(String v) 
    {

        if (!ObjectUtils.equals(this.luxuryItem, v))
        {
            this.luxuryItem = v;
            setModified(true);
        }


    }

    /**
     * Get the Price
     *
     * @return int
     */
    public int getPrice()
    {
        return price;
    }


    /**
     * Set the value of Price
     *
     * @param v new value
     */
    public void setPrice(int v) 
    {

        if (this.price != v)
        {
            this.price = v;
            setModified(true);
        }


    }

    



    private RegionStatisticsData aRegionStatisticsData;

    /**
     * Declares an association between this object and a RegionStatisticsData object
     *
     * @param v RegionStatisticsData
     * @throws TorqueException
     */
    public void setRegionStatisticsData(RegionStatisticsData v) throws TorqueException
    {
        if (v == null)
        {
            setTurnId( 0);
        }
        else
        {
            setTurnId(v.getID());
        }
        aRegionStatisticsData = v;
    }


    /**
     * Returns the associated RegionStatisticsData object.
     * If it was not retrieved before, the object is retrieved from
     * the database
     *
     * @return the associated RegionStatisticsData object
     * @throws TorqueException
     */
    public RegionStatisticsData getRegionStatisticsData()
        throws TorqueException
    {
        if (aRegionStatisticsData == null && (this.turnId != 0))
        {
            aRegionStatisticsData = RegionStatisticsDataPeer.retrieveByPK(SimpleKey.keyFor(this.turnId));
        }
        return aRegionStatisticsData;
    }

    /**
     * Return the associated RegionStatisticsData object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated RegionStatisticsData object
     * @throws TorqueException
     */
    public RegionStatisticsData getRegionStatisticsData(Connection connection)
        throws TorqueException
    {
        if (aRegionStatisticsData == null && (this.turnId != 0))
        {
            aRegionStatisticsData = RegionStatisticsDataPeer.retrieveByPK(SimpleKey.keyFor(this.turnId), connection);
        }
        return aRegionStatisticsData;
    }

    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
     */
    public void setRegionStatisticsDataKey(ObjectKey key) throws TorqueException
    {

        setTurnId(((NumberKey) key).longValue());
    }




    private RegionStatistics aRegionStatistics;

    /**
     * Declares an association between this object and a RegionStatistics object
     *
     * @param v RegionStatistics
     * @throws TorqueException
     */
    public void setRegionStatistics(RegionStatistics v) throws TorqueException
    {
        if (v == null)
        {
            setRegionId( 0);
        }
        else
        {
            setRegionId(v.getID());
        }
        aRegionStatistics = v;
    }


    /**
     * Returns the associated RegionStatistics object.
     * If it was not retrieved before, the object is retrieved from
     * the database
     *
     * @return the associated RegionStatistics object
     * @throws TorqueException
     */
    public RegionStatistics getRegionStatistics()
        throws TorqueException
    {
        if (aRegionStatistics == null && (this.regionId != 0))
        {
            aRegionStatistics = RegionStatisticsPeer.retrieveByPK(SimpleKey.keyFor(this.regionId));
        }
        return aRegionStatistics;
    }

    /**
     * Return the associated RegionStatistics object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated RegionStatistics object
     * @throws TorqueException
     */
    public RegionStatistics getRegionStatistics(Connection connection)
        throws TorqueException
    {
        if (aRegionStatistics == null && (this.regionId != 0))
        {
            aRegionStatistics = RegionStatisticsPeer.retrieveByPK(SimpleKey.keyFor(this.regionId), connection);
        }
        return aRegionStatistics;
    }

    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
     */
    public void setRegionStatisticsKey(ObjectKey key) throws TorqueException
    {

        setRegionId(((NumberKey) key).longValue());
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
            fieldNames.add("TurnId");
            fieldNames.add("RegionId");
            fieldNames.add("LuxuryItem");
            fieldNames.add("Price");
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
        if (name.equals("TurnId"))
        {
            return new Long(getTurnId());
        }
        if (name.equals("RegionId"))
        {
            return new Long(getRegionId());
        }
        if (name.equals("LuxuryItem"))
        {
            return getLuxuryItem();
        }
        if (name.equals("Price"))
        {
            return new Integer(getPrice());
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
        if (name.equals("TurnId"))
        {
            if (value == null || ! (Long.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not a Long object.");
            }
            setTurnId(((Long) value).longValue());
            return true;
        }
        if (name.equals("RegionId"))
        {
            if (value == null || ! (Long.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not a Long object.");
            }
            setRegionId(((Long) value).longValue());
            return true;
        }
        if (name.equals("LuxuryItem"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setLuxuryItem((String) value);
            return true;
        }
        if (name.equals("Price"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setPrice(((Integer) value).intValue());
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
        if (name.equals(RegionStatisticsPricesDataPeer.ID))
        {
            return new Long(getID());
        }
        if (name.equals(RegionStatisticsPricesDataPeer.TURN_ID))
        {
            return new Long(getTurnId());
        }
        if (name.equals(RegionStatisticsPricesDataPeer.REGION_ID))
        {
            return new Long(getRegionId());
        }
        if (name.equals(RegionStatisticsPricesDataPeer.LUXURY_ITEM))
        {
            return getLuxuryItem();
        }
        if (name.equals(RegionStatisticsPricesDataPeer.PRICE))
        {
            return new Integer(getPrice());
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
      if (RegionStatisticsPricesDataPeer.ID.equals(name))
        {
            return setByName("ID", value);
        }
      if (RegionStatisticsPricesDataPeer.TURN_ID.equals(name))
        {
            return setByName("TurnId", value);
        }
      if (RegionStatisticsPricesDataPeer.REGION_ID.equals(name))
        {
            return setByName("RegionId", value);
        }
      if (RegionStatisticsPricesDataPeer.LUXURY_ITEM.equals(name))
        {
            return setByName("LuxuryItem", value);
        }
      if (RegionStatisticsPricesDataPeer.PRICE.equals(name))
        {
            return setByName("Price", value);
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
            return new Long(getTurnId());
        }
        if (pos == 2)
        {
            return new Long(getRegionId());
        }
        if (pos == 3)
        {
            return getLuxuryItem();
        }
        if (pos == 4)
        {
            return new Integer(getPrice());
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
            return setByName("TurnId", value);
        }
    if (position == 2)
        {
            return setByName("RegionId", value);
        }
    if (position == 3)
        {
            return setByName("LuxuryItem", value);
        }
    if (position == 4)
        {
            return setByName("Price", value);
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
        save(RegionStatisticsPricesDataPeer.DATABASE_NAME);
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
                    RegionStatisticsPricesDataPeer.doInsert((RegionStatisticsPricesData) this, con);
                    setNew(false);
                }
                else
                {
                    RegionStatisticsPricesDataPeer.doUpdate((RegionStatisticsPricesData) this, con);
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
    public RegionStatisticsPricesData copy() throws TorqueException
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
    public RegionStatisticsPricesData copy(Connection con) throws TorqueException
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
    public RegionStatisticsPricesData copy(boolean deepcopy) throws TorqueException
    {
        return copyInto(new RegionStatisticsPricesData(), deepcopy);
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
    public RegionStatisticsPricesData copy(boolean deepcopy, Connection con) throws TorqueException
    {
        return copyInto(new RegionStatisticsPricesData(), deepcopy, con);
    }
  
    /**
     * Fills the copyObj with the contents of this object.
     * The associated objects are also copied and treated as new objects.
     *
     * @param copyObj the object to fill.
     */
    protected RegionStatisticsPricesData copyInto(RegionStatisticsPricesData copyObj) throws TorqueException
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
    protected RegionStatisticsPricesData copyInto(RegionStatisticsPricesData copyObj, Connection con) throws TorqueException
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
    protected RegionStatisticsPricesData copyInto(RegionStatisticsPricesData copyObj, boolean deepcopy) throws TorqueException
    {
        copyObj.setID(iD);
        copyObj.setTurnId(turnId);
        copyObj.setRegionId(regionId);
        copyObj.setLuxuryItem(luxuryItem);
        copyObj.setPrice(price);

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
    protected RegionStatisticsPricesData copyInto(RegionStatisticsPricesData copyObj, boolean deepcopy, Connection con) throws TorqueException
    {
        copyObj.setID(iD);
        copyObj.setTurnId(turnId);
        copyObj.setRegionId(regionId);
        copyObj.setLuxuryItem(luxuryItem);
        copyObj.setPrice(price);

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
    public RegionStatisticsPricesDataPeer getPeer()
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
        return RegionStatisticsPricesDataPeer.getTableMap();
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("RegionStatisticsPricesData:\n");
        str.append("ID = ")
           .append(getID())
           .append("\n");
        str.append("TurnId = ")
           .append(getTurnId())
           .append("\n");
        str.append("RegionId = ")
           .append(getRegionId())
           .append("\n");
        str.append("LuxuryItem = ")
           .append(getLuxuryItem())
           .append("\n");
        str.append("Price = ")
           .append(getPrice())
           .append("\n");
        return(str.toString());
    }
}