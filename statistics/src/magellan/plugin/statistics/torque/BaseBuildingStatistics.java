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
 * Contains informations about buildings
 *
 * This class was autogenerated by Torque on:
 *
 * [Wed May 21 18:19:59 CEST 2008]
 *
 * You should not use this class directly.  It should not even be
 * extended all references should be to BuildingStatistics
 */
public abstract class BaseBuildingStatistics extends BaseObject
{
    /** Serial version */
    private static final long serialVersionUID = 1211386799175L;

    /** The Peer class */
    private static final BuildingStatisticsPeer peer =
        new BuildingStatisticsPeer();


    /** The value for the iD field */
    private long iD;

    /** The value for the reportId field */
    private long reportId;

    /** The value for the buildingNumber field */
    private String buildingNumber;

    /** The value for the type field */
    private String type;


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
    public void setID(long v) throws TorqueException
    {

        if (this.iD != v)
        {
            this.iD = v;
            setModified(true);
        }



        // update associated BuildingStatisticsData
        if (collBuildingStatisticsDatas != null)
        {
            for (int i = 0; i < collBuildingStatisticsDatas.size(); i++)
            {
                ((BuildingStatisticsData) collBuildingStatisticsDatas.get(i))
                        .setBuildingId(v);
            }
        }
    }

    /**
     * Get the ReportId
     *
     * @return long
     */
    public long getReportId()
    {
        return reportId;
    }


    /**
     * Set the value of ReportId
     *
     * @param v new value
     */
    public void setReportId(long v) throws TorqueException
    {

        if (this.reportId != v)
        {
            this.reportId = v;
            setModified(true);
        }


        if (aReport != null && !(aReport.getID() == v))
        {
            aReport = null;
        }

    }

    /**
     * Get the BuildingNumber
     *
     * @return String
     */
    public String getBuildingNumber()
    {
        return buildingNumber;
    }


    /**
     * Set the value of BuildingNumber
     *
     * @param v new value
     */
    public void setBuildingNumber(String v) 
    {

        if (!ObjectUtils.equals(this.buildingNumber, v))
        {
            this.buildingNumber = v;
            setModified(true);
        }


    }

    /**
     * Get the Type
     *
     * @return String
     */
    public String getType()
    {
        return type;
    }


    /**
     * Set the value of Type
     *
     * @param v new value
     */
    public void setType(String v) 
    {

        if (!ObjectUtils.equals(this.type, v))
        {
            this.type = v;
            setModified(true);
        }


    }

    



    private Report aReport;

    /**
     * Declares an association between this object and a Report object
     *
     * @param v Report
     * @throws TorqueException
     */
    public void setReport(Report v) throws TorqueException
    {
        if (v == null)
        {
            setReportId( 0);
        }
        else
        {
            setReportId(v.getID());
        }
        aReport = v;
    }


    /**
     * Returns the associated Report object.
     * If it was not retrieved before, the object is retrieved from
     * the database
     *
     * @return the associated Report object
     * @throws TorqueException
     */
    public Report getReport()
        throws TorqueException
    {
        if (aReport == null && (this.reportId != 0))
        {
            aReport = ReportPeer.retrieveByPK(SimpleKey.keyFor(this.reportId));
        }
        return aReport;
    }

    /**
     * Return the associated Report object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated Report object
     * @throws TorqueException
     */
    public Report getReport(Connection connection)
        throws TorqueException
    {
        if (aReport == null && (this.reportId != 0))
        {
            aReport = ReportPeer.retrieveByPK(SimpleKey.keyFor(this.reportId), connection);
        }
        return aReport;
    }

    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
     */
    public void setReportKey(ObjectKey key) throws TorqueException
    {

        setReportId(((NumberKey) key).longValue());
    }
   


    /**
     * Collection to store aggregation of collBuildingStatisticsDatas
     */
    protected List<BuildingStatisticsData> collBuildingStatisticsDatas;

    /**
     * Temporary storage of collBuildingStatisticsDatas to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initBuildingStatisticsDatas()
    {
        if (collBuildingStatisticsDatas == null)
        {
            collBuildingStatisticsDatas = new ArrayList<BuildingStatisticsData>();
        }
    }


    /**
     * Method called to associate a BuildingStatisticsData object to this object
     * through the BuildingStatisticsData foreign key attribute
     *
     * @param l BuildingStatisticsData
     * @throws TorqueException
     */
    public void addBuildingStatisticsData(BuildingStatisticsData l) throws TorqueException
    {
        getBuildingStatisticsDatas().add(l);
        l.setBuildingStatistics((BuildingStatistics) this);
    }

    /**
     * Method called to associate a BuildingStatisticsData object to this object
     * through the BuildingStatisticsData foreign key attribute using connection.
     *
     * @param l BuildingStatisticsData
     * @throws TorqueException
     */
    public void addBuildingStatisticsData(BuildingStatisticsData l, Connection con) throws TorqueException
    {
        getBuildingStatisticsDatas(con).add(l);
        l.setBuildingStatistics((BuildingStatistics) this);
    }

    /**
     * The criteria used to select the current contents of collBuildingStatisticsDatas
     */
    private Criteria lastBuildingStatisticsDatasCriteria = null;

    /**
     * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getBuildingStatisticsDatas(new Criteria())
     *
     * @return the collection of associated objects
     * @throws TorqueException
     */
    public List<BuildingStatisticsData> getBuildingStatisticsDatas()
        throws TorqueException
    {
        if (collBuildingStatisticsDatas == null)
        {
            collBuildingStatisticsDatas = getBuildingStatisticsDatas(new Criteria(10));
        }
        return collBuildingStatisticsDatas;
    }

    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this BuildingStatistics has previously
     * been saved, it will retrieve related BuildingStatisticsDatas from storage.
     * If this BuildingStatistics is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List<BuildingStatisticsData> getBuildingStatisticsDatas(Criteria criteria) throws TorqueException
    {
        if (collBuildingStatisticsDatas == null)
        {
            if (isNew())
            {
               collBuildingStatisticsDatas = new ArrayList<BuildingStatisticsData>();
            }
            else
            {
                criteria.add(BuildingStatisticsDataPeer.BUILDING_ID, getID() );
                collBuildingStatisticsDatas = BuildingStatisticsDataPeer.doSelect(criteria);
            }
        }
        else
        {
            // criteria has no effect for a new object
            if (!isNew())
            {
                // the following code is to determine if a new query is
                // called for.  If the criteria is the same as the last
                // one, just return the collection.
                criteria.add(BuildingStatisticsDataPeer.BUILDING_ID, getID());
                if (!lastBuildingStatisticsDatasCriteria.equals(criteria))
                {
                    collBuildingStatisticsDatas = BuildingStatisticsDataPeer.doSelect(criteria);
                }
            }
        }
        lastBuildingStatisticsDatasCriteria = criteria;

        return collBuildingStatisticsDatas;
    }

    /**
     * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getBuildingStatisticsDatas(new Criteria(),Connection)
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List<BuildingStatisticsData> getBuildingStatisticsDatas(Connection con) throws TorqueException
    {
        if (collBuildingStatisticsDatas == null)
        {
            collBuildingStatisticsDatas = getBuildingStatisticsDatas(new Criteria(10), con);
        }
        return collBuildingStatisticsDatas;
    }

    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this BuildingStatistics has previously
     * been saved, it will retrieve related BuildingStatisticsDatas from storage.
     * If this BuildingStatistics is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List<BuildingStatisticsData> getBuildingStatisticsDatas(Criteria criteria, Connection con)
            throws TorqueException
    {
        if (collBuildingStatisticsDatas == null)
        {
            if (isNew())
            {
               collBuildingStatisticsDatas = new ArrayList<BuildingStatisticsData>();
            }
            else
            {
                 criteria.add(BuildingStatisticsDataPeer.BUILDING_ID, getID());
                 collBuildingStatisticsDatas = BuildingStatisticsDataPeer.doSelect(criteria, con);
             }
         }
         else
         {
             // criteria has no effect for a new object
             if (!isNew())
             {
                 // the following code is to determine if a new query is
                 // called for.  If the criteria is the same as the last
                 // one, just return the collection.
                 criteria.add(BuildingStatisticsDataPeer.BUILDING_ID, getID());
                 if (!lastBuildingStatisticsDatasCriteria.equals(criteria))
                 {
                     collBuildingStatisticsDatas = BuildingStatisticsDataPeer.doSelect(criteria, con);
                 }
             }
         }
         lastBuildingStatisticsDatasCriteria = criteria;

         return collBuildingStatisticsDatas;
     }











    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this BuildingStatistics is new, it will return
     * an empty collection; or if this BuildingStatistics has previously
     * been saved, it will retrieve related BuildingStatisticsDatas from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in BuildingStatistics.
     */
    protected List<BuildingStatisticsData> getBuildingStatisticsDatasJoinBuildingStatistics(Criteria criteria)
        throws TorqueException
    {
        if (collBuildingStatisticsDatas == null)
        {
            if (isNew())
            {
               collBuildingStatisticsDatas = new ArrayList<BuildingStatisticsData>();
            }
            else
            {
                criteria.add(BuildingStatisticsDataPeer.BUILDING_ID, getID());
                collBuildingStatisticsDatas = BuildingStatisticsDataPeer.doSelectJoinBuildingStatistics(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
            criteria.add(BuildingStatisticsDataPeer.BUILDING_ID, getID());
            if (!lastBuildingStatisticsDatasCriteria.equals(criteria))
            {
                collBuildingStatisticsDatas = BuildingStatisticsDataPeer.doSelectJoinBuildingStatistics(criteria);
            }
        }
        lastBuildingStatisticsDatasCriteria = criteria;

        return collBuildingStatisticsDatas;
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
            fieldNames.add("ReportId");
            fieldNames.add("BuildingNumber");
            fieldNames.add("Type");
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
        if (name.equals("ReportId"))
        {
            return new Long(getReportId());
        }
        if (name.equals("BuildingNumber"))
        {
            return getBuildingNumber();
        }
        if (name.equals("Type"))
        {
            return getType();
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
        if (name.equals("ReportId"))
        {
            if (value == null || ! (Long.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not a Long object.");
            }
            setReportId(((Long) value).longValue());
            return true;
        }
        if (name.equals("BuildingNumber"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setBuildingNumber((String) value);
            return true;
        }
        if (name.equals("Type"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setType((String) value);
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
        if (name.equals(BuildingStatisticsPeer.ID))
        {
            return new Long(getID());
        }
        if (name.equals(BuildingStatisticsPeer.REPORT_ID))
        {
            return new Long(getReportId());
        }
        if (name.equals(BuildingStatisticsPeer.BUILDING_NUMBER))
        {
            return getBuildingNumber();
        }
        if (name.equals(BuildingStatisticsPeer.TYPE))
        {
            return getType();
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
      if (BuildingStatisticsPeer.ID.equals(name))
        {
            return setByName("ID", value);
        }
      if (BuildingStatisticsPeer.REPORT_ID.equals(name))
        {
            return setByName("ReportId", value);
        }
      if (BuildingStatisticsPeer.BUILDING_NUMBER.equals(name))
        {
            return setByName("BuildingNumber", value);
        }
      if (BuildingStatisticsPeer.TYPE.equals(name))
        {
            return setByName("Type", value);
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
            return new Long(getReportId());
        }
        if (pos == 2)
        {
            return getBuildingNumber();
        }
        if (pos == 3)
        {
            return getType();
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
            return setByName("ReportId", value);
        }
    if (position == 2)
        {
            return setByName("BuildingNumber", value);
        }
    if (position == 3)
        {
            return setByName("Type", value);
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
        save(BuildingStatisticsPeer.DATABASE_NAME);
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
                    BuildingStatisticsPeer.doInsert((BuildingStatistics) this, con);
                    setNew(false);
                }
                else
                {
                    BuildingStatisticsPeer.doUpdate((BuildingStatistics) this, con);
                }
            }


            if (collBuildingStatisticsDatas != null)
            {
                for (int i = 0; i < collBuildingStatisticsDatas.size(); i++)
                {
                    ((BuildingStatisticsData) collBuildingStatisticsDatas.get(i)).save(con);
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
        throws TorqueException
    {
        setID(((NumberKey) key).longValue());
    }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) throws TorqueException
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
    public BuildingStatistics copy() throws TorqueException
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
    public BuildingStatistics copy(Connection con) throws TorqueException
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
    public BuildingStatistics copy(boolean deepcopy) throws TorqueException
    {
        return copyInto(new BuildingStatistics(), deepcopy);
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
    public BuildingStatistics copy(boolean deepcopy, Connection con) throws TorqueException
    {
        return copyInto(new BuildingStatistics(), deepcopy, con);
    }
  
    /**
     * Fills the copyObj with the contents of this object.
     * The associated objects are also copied and treated as new objects.
     *
     * @param copyObj the object to fill.
     */
    protected BuildingStatistics copyInto(BuildingStatistics copyObj) throws TorqueException
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
    protected BuildingStatistics copyInto(BuildingStatistics copyObj, Connection con) throws TorqueException
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
    protected BuildingStatistics copyInto(BuildingStatistics copyObj, boolean deepcopy) throws TorqueException
    {
        copyObj.setID(iD);
        copyObj.setReportId(reportId);
        copyObj.setBuildingNumber(buildingNumber);
        copyObj.setType(type);

        copyObj.setID( 0);

        if (deepcopy)
        {


        List<BuildingStatisticsData> vBuildingStatisticsDatas = getBuildingStatisticsDatas();
        if (vBuildingStatisticsDatas != null)
        {
            for (int i = 0; i < vBuildingStatisticsDatas.size(); i++)
            {
                BuildingStatisticsData obj =  vBuildingStatisticsDatas.get(i);
                copyObj.addBuildingStatisticsData(obj.copy());
            }
        }
        else
        {
            copyObj.collBuildingStatisticsDatas = null;
        }
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
    protected BuildingStatistics copyInto(BuildingStatistics copyObj, boolean deepcopy, Connection con) throws TorqueException
    {
        copyObj.setID(iD);
        copyObj.setReportId(reportId);
        copyObj.setBuildingNumber(buildingNumber);
        copyObj.setType(type);

        copyObj.setID( 0);

        if (deepcopy)
        {


        List<BuildingStatisticsData> vBuildingStatisticsDatas = getBuildingStatisticsDatas(con);
        if (vBuildingStatisticsDatas != null)
        {
            for (int i = 0; i < vBuildingStatisticsDatas.size(); i++)
            {
                BuildingStatisticsData obj =  vBuildingStatisticsDatas.get(i);
                copyObj.addBuildingStatisticsData(obj.copy(con), con);
            }
        }
        else
        {
            copyObj.collBuildingStatisticsDatas = null;
        }
        }
        return copyObj;
    }
    
    

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public BuildingStatisticsPeer getPeer()
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
        return BuildingStatisticsPeer.getTableMap();
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("BuildingStatistics:\n");
        str.append("ID = ")
           .append(getID())
           .append("\n");
        str.append("ReportId = ")
           .append(getReportId())
           .append("\n");
        str.append("BuildingNumber = ")
           .append(getBuildingNumber())
           .append("\n");
        str.append("Type = ")
           .append(getType())
           .append("\n");
        return(str.toString());
    }
}