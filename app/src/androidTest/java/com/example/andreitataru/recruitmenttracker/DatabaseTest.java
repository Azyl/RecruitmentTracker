package com.example.andreitataru.recruitmenttracker;

import android.test.AndroidTestCase;
import android.test.RenamingDelegatingContext;

import com.andreitataru.recruitmenttracker.database.DatabaseHelper;

/**
 * Created by andreitataru on 22/07/2017.
 */

public class DatabaseTest extends AndroidTestCase {
    private DatabaseHelper db;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        RenamingDelegatingContext context = new RenamingDelegatingContext(getContext(), "test_");
        db = new DatabaseHelper(context);
    }

    @Override
    public void tearDown() throws Exception {
        db.close();
        super.tearDown();
    }

    //According to Zainodis annotation only for legacy and not valid with gradle>1.1:
    //@Test
    public void testAddEntry(){
        // Here i have my new database wich is not connected to the standard database of the App
    }
}

