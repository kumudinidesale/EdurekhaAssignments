package com.spicemoney.module4.Exception;

public class InterfaceUsecase {
    public static void main(String[] args) {
        Iface obj = new Iface();
        obj.insert();
        obj.delete();
    }
}

class Iface extends QueueInterface {

    @Override
    public void delete() {
        System.out.println("Delete Method Override");
    }

}
