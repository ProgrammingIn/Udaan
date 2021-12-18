import Deals.Deals;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Locale;

/*
Limited Time Deals
        A limited time deal implies that a seller will put up an item on sale for a limited time period, say,
        2 hours and will keep a maximum limit on the number of items that would be sold as part of that deal.
        Users cannot buy the deal if the deal time is over
        Users cannot buy if the maximum allowed deal has already been bought by other users.
        One user cannot buy more than one item as part of the deal.

        Task is to create APIs to enable following operations
        Create a deal with price and number of items to be sold as part of the deal
       //createDeal(price,item_name,number of items,end_time)
       //Item -> item_id,item_name,item_quantity,item_price
       //Seller-> seller_id
        End a deal
        //Deal
        //-> deal_Id,item_id,deal_quantity,end_time,seller_id
        //All items are sold
        //  -->
        Update a deal to increase the number of items or end time
        Claim a deal
*/
public class Main {

    public static void main(String[] args)
    {

        Time t= new Time(new Date().getTime());

         //createDeal(1,2,3,Time.valueOf("2:00:00"),t);

        // System.out.println(""+s);

    }
}
