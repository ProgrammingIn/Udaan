package Deals;

//Functions
/*
1.Create a deal with price and number of items to be sold as part of the deal
2.End a deal
3.Update a deal to increase the number of items or end time
4.Claim a deal
*/

//validations
/*
Users cannot buy the deal if the deal time is over
Users cannot buy if the maximum allowed deal has already been bought by other users.
One user cannot buy more than one item as part of the deal.

 */

import java.sql.Time;

//Deal
//-> deal_Id,item_id,deal_price,deal_quantity,end_time
public class Deals {

    private int dealId;
    private int item_id;
    private int deal_quatity;
    private int deal_price;
    private Time time;


    @Override
    public String toString() {
        return "Deals{" +
                "dealId=" + dealId +
                ", item_id=" + item_id +
                ", deal_quatity=" + deal_quatity +
                ", deal_price=" + deal_price +
                ", time=" + time +
                '}';
    }

    public int getDeal_price() {
        return deal_price;
    }

    public void setDeal_price(int deal_price) {
        this.deal_price = deal_price;
    }

    public Deals() {
    }

    public Deals(int dealId, int item_id, int deal_quatity, int deal_price, Time time) {
        this.dealId = dealId;
        this.item_id = item_id;
        this.deal_quatity = deal_quatity;
        this.deal_price = deal_price;
        this.time = time;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public int getDeal_quatity() {
        return deal_quatity;
    }

    public void setDeal_quatity(int deal_quatity) {
        this.deal_quatity = deal_quatity;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getDealId() {
        return dealId;
    }

    public void setDealId(int dealId) {
        this.dealId = dealId;
    }


}


