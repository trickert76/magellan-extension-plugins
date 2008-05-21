package magellan.plugin.statistics.torque.map;

import java.util.Date;
import java.math.BigDecimal;

import org.apache.torque.Torque;
import org.apache.torque.TorqueException;
import org.apache.torque.map.MapBuilder;
import org.apache.torque.map.DatabaseMap;
import org.apache.torque.map.TableMap;
import org.apache.torque.map.ColumnMap;
import org.apache.torque.map.InheritanceMap;

/**
 * Contains informations about regions
 *
  *  This class was autogenerated by Torque on:
  *
  * [Wed May 21 18:19:59 CEST 2008]
  *
  */
public class RegionStatisticsMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "magellan.plugin.statistics.torque.map.RegionStatisticsMapBuilder";

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

        dbMap.addTable("region_statistics");
        TableMap tMap = dbMap.getTable("region_statistics");
        tMap.setJavaName("RegionStatistics");
        tMap.setOMClass( magellan.plugin.statistics.torque.RegionStatistics.class );
        tMap.setPeerClass( magellan.plugin.statistics.torque.RegionStatisticsPeer.class );
        tMap.setDescription("Contains informations about regions");
        tMap.setPrimaryKeyMethod("none");

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
  // ------------- Column: report_id --------------------
        cMap = new ColumnMap( "report_id", tMap);
        cMap.setType( new Long(0) );
        cMap.setTorqueType( "BIGINT" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(true);
        cMap.setJavaName( "ReportId" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("This is the report");
        cMap.setInheritance("false");
        cMap.setForeignKey("report", "id");
        cMap.setPosition(2);
        tMap.addColumn(cMap);
  // ------------- Column: region_number --------------------
        cMap = new ColumnMap( "region_number", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(true);
        cMap.setJavaName( "RegionNumber" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The unique id of the region");
        cMap.setInheritance("false");
        cMap.setSize( 20 );
        cMap.setPosition(3);
        tMap.addColumn(cMap);
        tMap.setUseInheritance(false);
    }
}
