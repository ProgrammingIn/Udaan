package Deals;
/*
1.Create a deal with price and number of items to be sold as part of the deal
2.End a deal
3.Update a deal to increase the number of items or end time
4.Claim a deal
*/

import java.sql.Driver;
import java.sql.Time;
import java.sql.*;
//validations
/*
Users cannot buy the deal if the deal time is over
Users cannot buy if the maximum allowed deal has already been bought by other users.
One user cannot buy more than one item as part of the deal.

 */
public class DealTask {

    private final Deals deals;
    public static int i=0;
    public DealTask(Deals deals) {
        this.deals = deals;
    }

//(int dealId, int item_id, int deal_quatity, int deal_price, Time time)
    public String createDeal(Integer price, Integer item_id, Integer no_of_items, Time end_time, Time currentTime) throws SQLException {
        //Insert to db

        Deals deals = new Deals(i++,item_id,no_of_items,price,end_time);

       Connection conn=new
        PreparedStatement preparedStatement= conn.connection();

        preparedStatement.execute("Insert into Deals("+i+","+item_id+","+no_of_items+","+price+","+end_time+")");


        return "Created Successfully";
    }




}
