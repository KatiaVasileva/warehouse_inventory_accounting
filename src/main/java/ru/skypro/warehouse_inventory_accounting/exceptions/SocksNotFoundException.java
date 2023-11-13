package ru.skypro.warehouse_inventory_accounting.exceptions;

public class SocksNotFoundException extends RuntimeException{

    public static final String DEFAULT_MESSAGE = "Socks are not found";

    public SocksNotFoundException() {
        super(DEFAULT_MESSAGE);
    }
}
