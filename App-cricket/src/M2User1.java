/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hashika maduranga
 */
public class M2User1 {
      private int id,runs,balls,minutes,fours,sixes,SR;
      private String player,wicket;
       
        public M2User1(int id,String wicket,int runs,int balls,int minutes,int fours,int sixes,int SR,String player){
        //this.id=id;
        this.wicket=wicket;
        this.balls=balls;
        this.fours=fours;
        this.minutes=minutes;
        this.player=player;
        this.sixes=sixes;
        this.runs=runs;
        this.SR=SR;
        
        
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the runs
     */
    public int getRuns() {
        return runs;
    }

    /**
     * @param runs the runs to set
     */
    public void setRuns(int runs) {
        this.runs = runs;
    }

    /**
     * @return the balls
     */
    public int getBalls() {
        return balls;
    }

    /**
     * @param balls the balls to set
     */
    public void setBalls(int balls) {
        this.balls = balls;
    }

    /**
     * @return the minutes
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * @param minutes the minutes to set
     */
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    /**
     * @return the fours
     */
    public int getFours() {
        return fours;
    }

    /**
     * @param fours the fours to set
     */
    public void setFours(int fours) {
        this.fours = fours;
    }

    /**
     * @return the sixes
     */
    public int getSixes() {
        return sixes;
    }

    /**
     * @param sixes the sixes to set
     */
    public void setSixes(int sixes) {
        this.sixes = sixes;
    }

    /**
     * @return the SR
     */
    public int getSR() {
        return SR;
    }

    /**
     * @param SR the SR to set
     */
    public void setSR(int SR) {
        this.SR = SR;
    }

    /**
     * @return the player
     */
    public String getPlayer() {
        return player;
    }

    /**
     * @param player the player to set
     */
    public void setPlayer(String player) {
        this.player = player;
    }

    /**
     * @return the wicket
     */
    public String getWicket() {
        return wicket;
    }

    /**
     * @param wicket the wicket to set
     */
    public void setWicket(String wicket) {
        this.wicket = wicket;
    }
    
    Object getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getWickets() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getRun() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getMaidens() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getOvers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getEconomy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
