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
 * Contains informations about turn specific ship data
 *
  *  This class was autogenerated by Torque on:
  *
  * [Fri May 23 08:09:17 CEST 2008]
  *
  */
public class ShipStatisticsDataMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "magellan.plugin.statistics.torque.map.ShipStatisticsDataMapBuilder";

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

        dbMap.addTable("ship_statistics_data");
        TableMap tMap = dbMap.getTable("ship_statistics_data");
        tMap.setJavaName("ShipStatisticsData");
        tMap.setOMClass( magellan.plugin.statistics.torque.ShipStatisticsData.class );
        tMap.setPeerClass( magellan.plugin.statistics.torque.ShipStatisticsDataPeer.class );
        tMap.setDescription("Contains informations about turn specific ship data");
        tMap.setPrimaryKeyMethod(TableMap.NATIVE);
        DB dbAdapter = Torque.getDB("statistics");
        if (dbAdapter.getIDMethodType().equals(DB.SEQUENCE))
        {
            tMap.setPrimaryKeyMethodInfo("ship_statistics_data_SEQ");
        }
        else if (dbAdapter.getIDMethodType().equals(DB.AUTO_INCREMENT))
        {
            tMap.setPrimaryKeyMethodInfo("ship_statistics_data");
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
  // ------------- Column: ship_id --------------------
        cMap = new ColumnMap( "ship_id", tMap);
        cMap.setType( new Long(0) );
        cMap.setTorqueType( "BIGINT" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(true);
        cMap.setJavaName( "ShipId" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("This is the ship");
        cMap.setInheritance("false");
        cMap.setForeignKey("ship_statistics", "id");
        cMap.setPosition(2);
        tMap.addColumn(cMap);
  // ------------- Column: turn --------------------
        cMap = new ColumnMap( "turn", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(true);
        cMap.setJavaName( "Turn" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The unique turn data of the ship");
        cMap.setInheritance("false");
        cMap.setPosition(3);
        tMap.addColumn(cMap);
  // ------------- Column: name --------------------
        cMap = new ColumnMap( "name", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Name" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The turn bases name of the ship");
        cMap.setInheritance("false");
        cMap.setSize( 50 );
        cMap.setPosition(4);
        tMap.addColumn(cMap);
  // ------------- Column: description --------------------
        cMap = new ColumnMap( "description", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Description" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The turn bases description of the ship");
        cMap.setInheritance("false");
        cMap.setSize( 255 );
        cMap.setPosition(5);
        tMap.addColumn(cMap);
  // ------------- Column: size --------------------
        cMap = new ColumnMap( "size", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Size" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The turn bases size of the ship");
        cMap.setInheritance("false");
        cMap.setPosition(6);
        tMap.addColumn(cMap);
  // ------------- Column: owner --------------------
        cMap = new ColumnMap( "owner", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Owner" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The turn bases owner of the ship");
        cMap.setInheritance("false");
        cMap.setSize( 20 );
        cMap.setPosition(7);
        tMap.addColumn(cMap);
  // ------------- Column: region --------------------
        cMap = new ColumnMap( "region", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Region" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The turn bases position of the ship");
        cMap.setInheritance("false");
        cMap.setSize( 20 );
        cMap.setPosition(8);
        tMap.addColumn(cMap);
  // ------------- Column: passengers --------------------
        cMap = new ColumnMap( "passengers", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Passengers" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The turn bases number of passengers of the ship");
        cMap.setInheritance("false");
        cMap.setPosition(9);
        tMap.addColumn(cMap);
  // ------------- Column: max_cargo --------------------
        cMap = new ColumnMap( "max_cargo", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "MaxCargo" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The turn bases max cargo of the ship");
        cMap.setInheritance("false");
        cMap.setPosition(10);
        tMap.addColumn(cMap);
  // ------------- Column: cargo --------------------
        cMap = new ColumnMap( "cargo", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Cargo" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The turn bases cargo of the ship");
        cMap.setInheritance("false");
        cMap.setPosition(11);
        tMap.addColumn(cMap);
  // ------------- Column: capacity --------------------
        cMap = new ColumnMap( "capacity", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Capacity" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The turn bases capacity of the ship");
        cMap.setInheritance("false");
        cMap.setPosition(12);
        tMap.addColumn(cMap);
  // ------------- Column: damage_ratio --------------------
        cMap = new ColumnMap( "damage_ratio", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "DamageRatio" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The turn bases damage ratio of the ship");
        cMap.setInheritance("false");
        cMap.setPosition(13);
        tMap.addColumn(cMap);
        tMap.setUseInheritance(false);
    }
}
