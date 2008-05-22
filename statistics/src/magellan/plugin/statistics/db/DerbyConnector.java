// class magellan.plugin.statistics.db.DerbyConnector
// created on 20.05.2008
//
// Copyright 2003-2008 by Thoralf Rickert
//
// Author : $Author: $
// $Id: $
//
// This program is free software; you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation; either version 2 of the License, or
// (at your option) any later version.
// 
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
// 
// You should have received a copy of the GNU General Public License
// along with this program (see doc/LICENCE.txt); if not, write to the
// Free Software Foundation, Inc., 
// 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
// 
package magellan.plugin.statistics.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.Properties;

import magellan.plugin.statistics.torque.Report;
import magellan.plugin.statistics.torque.ReportPeer;

import org.apache.torque.Torque;
import org.apache.torque.util.Criteria;

public class DerbyConnector {
  protected static final String DATABASE_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
  protected static final String DATABASE_NAME = "statistics";
  protected static final String DATABASE_USER = "statistics";
  protected static final String DATABASE_PWD  = "statistics";
  protected static final String protocol = "jdbc:derby:";
  
  protected static DerbyConnector _instance = null;
  protected boolean initialized = false;
  
  /**
   * Creates the singleton of this class.
   */
  protected DerbyConnector() {
    _instance = this;
    Connection connection = null;
    
    try {
      Properties properties = new Properties();
      properties.put("user", DATABASE_USER);
      properties.put("password", DATABASE_PWD);
      //properties.put("derby.system.home", value);
      
      // create database
      System.out.println("Create database");
      Class.forName(DATABASE_DRIVER).newInstance();
      connection = DriverManager.getConnection(protocol + DATABASE_NAME + ";create=true", properties);
      connection.close();
      
      // initialize torque
      System.out.println("Initializing persistance layer");
      Torque.init("torque.properties");
      connection = Torque.getConnection();
      if (connection != null) {
        System.out.println("Database connection established");
        connection.close();
      } else {
        System.out.println("ERROR: no database connection availabe");
        return;
      }
      
      
      List<Report> reports = ReportPeer.doSelect(new Criteria());
      System.out.println(reports);
      
      Report report = new Report();
      report.setFilename("Test");
      report.save();
      
      initialized = true;
    } catch (Exception exception) {
      exception.printStackTrace(System.err);
    }
  }
  
  /**
   * Returns the singleton of this Connector.
   */
  public static DerbyConnector getInstance() {
    if (_instance == null) _instance = new DerbyConnector();
    return _instance;
  }
  
  public void shutdown() {
    try {
      System.out.println("Shutting down database connections");
      if (Torque.isInit()) Torque.shutdown();
      DriverManager.getConnection("jdbc:derby:;shutdown=true");
    } catch (Exception exception) {
      exception.printStackTrace(System.err);
    }
  }
  
  
  public static void main(String[] args) {
    DerbyConnector connector = DerbyConnector.getInstance();
    connector.shutdown();
  }
}