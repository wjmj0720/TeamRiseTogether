package com.metaverse.risetogether.z_activity.LJH.Module06Mission;

public class Application {
    public static void main(String[] args) {
        LogManager logManager = new LogManager();
        Member mem1 = new Member("LM001","NIYA");
        Member mem2 = new Member("LM002","HOYA");
        Book[] books = new Book[]{new Book("hary","niya",300.0),new Book("hary","niya",300.0)};
        RentalManager rentalManager = new RentalManager();

        logManager.logTransaction(rentalManager.rentBook("LM001",books[0]),"transaction.log");
        logManager.logTransaction(rentalManager.rentBook("LM001",books[1]),"transaction.log");
        logManager.logTransaction(rentalManager.returnBook("LM001",books[0]),"transaction.log");


    }
}
