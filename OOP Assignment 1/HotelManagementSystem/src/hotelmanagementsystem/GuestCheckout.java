/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementsystem;

/**
 *
 * @author Gael
 */
public class GuestCheckout extends HotelService {

    public GuestCheckout(GuestInfo guestInfo) {
        super(guestInfo);
    }

    @Override
    public void checkoutGuest() {
        if (guestInfo.getRoomStatus().equals("AVAILABLE")) {
            System.out.println("Error: Room is already available. No guest to checkout.");
            return;
        }
        guestInfo.setRoomStatus("AVAILABLE");
        System.out.println("Guest " + guestInfo.getGuestName() + " (" + guestInfo.getGuestId()
                + ") has been checked out. Room is now AVAILABLE.");
    }

    @Override
    public void bookRoom() {
    }

    @Override
    public void generateBill() {
    }
}
