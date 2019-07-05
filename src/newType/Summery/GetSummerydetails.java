package Summery;

import java.sql.ResultSet;

public class GetSummerydetails {



    public int showDetails(ResultSet rs){

        int total =0;
        int total2=0;
        try{
            while(rs.next()){
                total += rs.getInt("Runs");
                total2 += rs.getInt("Runs");
            }
        }catch(Exception e){
            //do
        }
        return total;
    }



}
