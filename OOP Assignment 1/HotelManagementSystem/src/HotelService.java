/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Gael
 */

public abstract class HotelService {

    protected GuestInfo guestInfo;

    public HotelService(GuestInfo guestInfo) {
        this.guestInfo = guestInfo;
    }

    public abstract void bookRoom();
    public abstract void checkoutGuest();
    public abstract void generateBill();

}
