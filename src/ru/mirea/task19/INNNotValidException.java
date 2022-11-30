package ru.mirea.task19;

import java.math.BigInteger;

public class INNNotValidException extends Exception
{
    private BigInteger INNcode;

    public INNNotValidException(BigInteger inn)
    {
        super("INN code " + inn + " is invalid!");
        INNcode = inn;
    }

    public BigInteger getINNcode()
    {
        return INNcode;
    }
}
