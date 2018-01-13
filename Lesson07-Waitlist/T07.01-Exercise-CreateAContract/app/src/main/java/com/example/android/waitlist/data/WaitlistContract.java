package com.example.android.waitlist.data;

import android.provider.BaseColumns;

public final class WaitlistContract {
    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private WaitlistContract() {}

    // completed (1) Create an inner class named WaitlistEntry class that implements the BaseColumns interface
    public static class WaitlistEntry implements BaseColumns {

        // TODO (2) Inside create a static final members for the table name and each of the db columns
        // TABLE_NAME -> waitlist;
        // COLUMN_GUEST_NAME -> guestName
        // COLUMN_PARTY_SIZE -> partySize
        // COLUMN_TIMESTAMP -> timestamp

    }

}
