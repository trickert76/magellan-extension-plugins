package magellan.plugin.statistics.torque;

import java.util.List;

import magellan.library.utils.logging.Logger;

import org.apache.torque.util.Criteria;

/**
 * Contains informations about units
 *
 * The skeleton for this class was autogenerated by Torque on:
 *
 * [Wed May 21 18:19:59 CEST 2008]
 *
 *  You should add additional methods to this class to meet the
 *  application requirements.  This class will only be generated as
 *  long as it does not already exist in the output directory.
 */
public class UnitStatisticsPeer extends BaseUnitStatisticsPeer {
  /** Log instance */
  private static Logger log = Logger.getInstance(FactionStatisticsPeer.class);
  
  /**
   * Search for a Unit.
   */
  public static UnitStatistics get(Report report, String unitId, boolean create) {
    try {
      Criteria criteria = new Criteria();
      criteria.add(REPORT_ID,report.getID());
      criteria.add(UNIT_NUMBER,unitId);
      criteria.setLimit(1);
      List<UnitStatistics> statistics = doSelect(criteria);
      
      if (statistics != null && statistics.size() > 0) return statistics.get(0); 
      
      if (create) {
        UnitStatistics statistic = new UnitStatistics();
        statistic.setReport(report);
        statistic.setUnitNumber(unitId);
        statistic.save();
        return statistic;
      }

    } catch (Exception exception) {
      log.error(exception);
    }
    return null;
  }
}