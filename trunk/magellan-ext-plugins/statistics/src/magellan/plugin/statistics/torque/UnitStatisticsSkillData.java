package magellan.plugin.statistics.torque;


import java.io.PrintWriter;

import org.apache.torque.om.Persistent;

/**
 * Contains informations about turn specific unit skills
 *
 * The skeleton for this class was autogenerated by Torque on:
 *
 * [Wed May 21 18:19:59 CEST 2008]
 *
 * You should add additional methods to this class to meet the
 * application requirements.  This class will only be generated as
 * long as it does not already exist in the output directory.
 */
public  class UnitStatisticsSkillData extends BaseUnitStatisticsSkillData implements Persistent {
  public void save(PrintWriter pw) throws Exception {
    pw.println("<skill type=\""+getSkill()+"\" level=\""+getLevel()+"\"/>");
  }
}
