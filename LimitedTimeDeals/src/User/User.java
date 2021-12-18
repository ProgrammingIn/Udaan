package User;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

/*
Users cannot buy the deal if the deal time is over
Users cannot buy if the maximum allowed deal has already been bought by other users.
One user cannot buy more than one item as part of the deal.

 */
public class User {

    Integer DealId;
    Timestamp time;


    public User() {
    }



    public String buy(Integer DealId,Time time);
    {

    }



}
