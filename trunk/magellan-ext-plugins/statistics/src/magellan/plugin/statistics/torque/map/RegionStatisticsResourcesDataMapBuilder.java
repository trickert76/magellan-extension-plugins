package magellan.plugin.statistics.torque.map;

import java.util.Date;
import java.math.BigDecimal;

import org.apache.torque.Torque;
import org.apache.torque.TorqueException;
import org.apache.torque.adapter.DB;
import org.apache.torque.map.MapBuilder;
import org.apache.torque.map.DatabaseMap;
import org.apache.torque.map.TableMap;
import org.apache.torque.map.ColumnMap;
import org.apache.torque.map.InheritanceMap;

/**
 * Contains informations about turn specific region resources
 *
  *  This class was autogenerated by Torque on:
  *
  * [Fri May 23 08:09:17 CEST 2008]
  *
  */
public class RegionStatisticsResourcesDataMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "magellan.plugin.statistics.torque.map.RegionStatisticsResourcesDataMapBuilder";

    /**
     * The database map.
     */
    private DatabaseMap dbMap = null;

    /**
     * Tells us if this DatabaseMapBuilder is built so that we
     * don't have to re-build it every time.
     *
     * @return true if this DatabaseMapBuilder is built
     */
    public boolean isBuilt()
    {
        return (dbMap != null);
    }

    /**
     * Gets the databasemap this map builder built.
     *
     * @return the databasemap
     */
    public DatabaseMap getDatabaseMap()
    {
        return this.dbMap;
    }

    /**
     * The doBuild() method builds the DatabaseMap
     *
     * @throws TorqueException
     */
    public synchronized void doBuild() throws TorqueException
    {
        if ( isBuilt() ) {
            return;
        }
        dbMap = Torque.getDatabaseMap("statistics");

        dbMap.addTable("region_statistics_resources_data");
        TableMap tMap = dbMap.getTable("region_statistics_resources_data");
        tMap.setJavaName("RegionStatisticsResourcesData");
        tMap.setOMClass( magellan.plugin.statistics.torque.RegionStatisticsResourcesData.class );
        tMap.setPeerClass( magellan.plugin.statistics.torque.RegionStatisticsResourcesDataPeer.class );
        tMap.setDescription("Contains informations about turn specific region resources");
        tMap.setPrimaryKeyMethod(TableMap.NATIVE);
        DB dbAdapter = Torque.getDB("statistics");
        if (dbAdapter.getIDMethodType().equals(DB.SEQUENCE))
        {
            tMap.setPrimaryKeyMethodInfo("region_statistics_resources_data_SEQ");
        }
        else if (dbAdapter.getIDMethodType().equals(DB.AUTO_INCREMENT))
        {
            tMap.setPrimaryKeyMethodInfo("region_statistics_resources_data");
        }

        ColumnMap cMap = null;


  // ------------- Column: id --------------------
        cMap = new ColumnMap( "id", tMap);
        cMap.setType( new Long(0) );
        cMap.setTorqueType( "BIGINT" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(true);
        cMap.setNotNull(true);
        cMap.setJavaName( "ID" );
        cMap.setAutoIncrement(true);
        cMap.setProtected(false);
        cMap.setInheritance("false");
        cMap.setPosition(1);
        tMap.addColumn(cMap);
  // ------------- Column: turn_id --------------------
        cMap = new ColumnMap( "turn_id", tMap);
        cMap.setType( new Long(0) );
        cMap.setTorqueType( "BIGINT" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(true);
        cMap.setJavaName( "TurnId" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The statistic id");
        cMap.setInheritance("false");
        cMap.setForeignKey("region_statistics_data", "id");
        cMap.setPosition(2);
        tMap.addColumn(cMap);
  // ------------- Column: region_id --------------------
        cMap = new ColumnMap( "region_id", tMap);
        cMap.setType( new Long(0) );
        cMap.setTorqueType( "BIGINT" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(true);
        cMap.setJavaName( "RegionId" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("This is the region");
        cMap.setInheritance("false");
        cMap.setForeignKey("region_statistics", "id");
        cMap.setPosition(3);
        tMap.addColumn(cMap);
  // ------------- Column: item_type --------------------
        cMap = new ColumnMap( "item_type", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(true);
        cMap.setJavaName( "ItemType" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The name of the item type");
        cMap.setInheritance("false");
        cMap.setSize( 50 );
        cMap.setPosition(4);
        tMap.addColumn(cMap);
  // ------------- Column: skill_level --------------------
        cMap = new ColumnMap( "skill_level", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(true);
        cMap.setJavaName( "SkillLevel" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The turn bases skill level of the item in the region");
        cMap.setInheritance("false");
        cMap.setPosition(5);
        tMap.addColumn(cMap);
  // ------------- Column: amount --------------------
        cMap = new ColumnMap( "amount", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(true);
        cMap.setJavaName( "Amount" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The turn bases amount of the item in the region");
        cMap.setInheritance("false");
        cMap.setPosition(6);
        tMap.addColumn(cMap);
        tMap.setUseInheritance(false);
    }
}
