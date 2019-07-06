package Summery;

import java.sql.ResultSet;

public class GetSummerydetails  {



    public int showDetails(ResultSet rs){

        int total =0;

        try{
            while(rs.next()){
                total += rs.getInt("Runs");
            }
        }catch(Exception e){
            //do
        }
        return total;
    }
    public int showMostRuns(ResultSet rs){

        int mostRuns=0;
        int playerR;
        try{
            while(rs.next()){
                playerR=rs.getInt("Runs");
                if(mostRuns<playerR){
                    mostRuns=playerR;
                }

            }

        }catch(Exception e){

        }
        return mostRuns;
    }



}
