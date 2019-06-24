/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hashika maduranga
 */
public class User3 {
      private String name;
     private int overs,maidens,run,wickets,economy,id1;
     
      public User3(int id1,int overs,int run,int maidens,int economy,int wickets,String name){
          
       this.id1=id1;
       this.wickets=wickets;
       this.maidens=maidens;
       this.name=name;
       this.run=run;
       this.overs=overs;
       this.economy=economy;
        
        
    }

    User3(int aInt, int aInt0, int aInt1, int aInt2, int aInt3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the overs
     */
    public int getOvers() {
        return overs;
    }

    /**
     * @param overs the overs to set
     */
    public void setOvers(int overs) {
        this.overs = overs;
    }

    /**
     * @return the maidens
     */
    public int getMaidens() {
        return maidens;
    }

    /**
     * @param maidens the maidens to set
     */
    public void setMaidens(int maidens) {
        this.maidens = maidens;
    }

    /**
     * @return the run
     */
    public int getRun() {
        return run;
    }

    /**
     * @param run the run to set
     */
    public void setRun(int run) {
        this.run = run;
    }

    /**
     * @return the wickets
     */
    public int getWickets() {
        return wickets;
    }

    /**
     * @param wickets the wickets to set
     */
    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    /**
     * @return the economy
     */
    public int getEconomy() {
        return economy;
    }

    /**
     * @param economy the economy to set
     */
    public void setEconomy(int economy) {
        this.economy = economy;
    }

    /**
     * @return the id1
     */
    public int getId1() {
        return id1;
    }

    /**
     * @param id1 the id1 to set
     */
    public void setId1(int id1) {
        this.id1 = id1;
    }
}
