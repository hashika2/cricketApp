/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hashika maduranga
 */
public class M2User {
    
     private int runs1,runs2,wicket1,wicket2,id;
     private String name1,name2,name3,name4;
     
     public void M2User(int runs1,int id,int runs2,int wicket2,int wicket1,String name1,String name2,String name3,String name4){
         this.id=id;
        this.name1=name1;
        this.name1=name2;
        this.name1=name3;
        this.name1=name4;
        this.runs1=runs1;
        this.runs2=runs2;
        this.wicket1=wicket1;
        this.wicket2=wicket2;
     }
      M2User(int aInt, int aInt0, int aInt1, int aInt2, String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
     
      public int getId(){
       return id;
   }
   public void setId(){
       this.id=id;
   }
    /**
     * @return the runs1
     */
    public int getRuns1() {
        return runs1;
    }

    /**
     * @param runs1 the runs1 to set
     */
    public void setRuns1(int runs1) {
        this.runs1 = runs1;
    }

    /**
     * @return the runs2
     */
    public int getRuns2() {
        return runs2;
    }

    /**
     * @param runs2 the runs2 to set
     */
    public void setRuns2(int runs2) {
        this.runs2 = runs2;
    }

    /**
     * @return the wicket1
     */
    public int getWicket1() {
        return wicket1;
    }

    /**
     * @param wicket1 the wicket1 to set
     */
    public void setWicket1(int wicket1) {
        this.wicket1 = wicket1;
    }

    /**
     * @return the wicket2
     */
    public int getWicket2() {
        return wicket2;
    }

    /**
     * @param wicket2 the wicket2 to set
     */
    public void setWicket2(int wicket2) {
        this.wicket2 = wicket2;
    }

    /**
     * @return the name1
     */
    public String getName1() {
        return name1;
    }

    /**
     * @param name1 the name1 to set
     */
    public void setName1(String name1) {
        this.name1 = name1;
    }

    /**
     * @return the name2
     */
    public String getName2() {
        return name2;
    }

    /**
     * @param name2 the name2 to set
     */
    public void setName2(String name2) {
        this.name2 = name2;
    }

    /**
     * @return the name3
     */
    public String getName3() {
        return name3;
    }

    /**
     * @param name3 the name3 to set
     */
    public void setName3(String name3) {
        this.name3 = name3;
    }

    /**
     * @return the name4
     */
    public String getName4() {
        return name4;
    }

    /**
     * @param name4 the name4 to set
     */
    public void setName4(String name4) {
        this.name4 = name4;
    }
}
