package com.designpatterns.structural.facadepattern;

import com.designpatterns.structural.facadepattern.phones.Blackberry;
import com.designpatterns.structural.facadepattern.phones.Iphone;
import com.designpatterns.structural.facadepattern.phones.MobileShop;
import com.designpatterns.structural.facadepattern.phones.Samsung;

public class ShopKeeper {

    private final MobileShop iphone;
    private final MobileShop samsung;
    private final MobileShop blackberry;

    public ShopKeeper() {
        this.iphone = new Iphone();
        this.samsung = new Samsung();
        this.blackberry = new Blackberry();
    }

    public void iphoneSale() {
        iphone.modelNumber();
        iphone.price();
    }

    public void samsungSale() {
        samsung.modelNumber();
        samsung.price();
    }

    public void blackberrySale() {
        blackberry.modelNumber();
        blackberry.price();
    }
}
