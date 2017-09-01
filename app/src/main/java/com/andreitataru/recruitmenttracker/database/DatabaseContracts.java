package com.andreitataru.recruitmenttracker.database;

import android.provider.BaseColumns;

/**
 * Created by andreitataru on 19/07/2017.
 */

public class DatabaseContracts {


    private DatabaseContracts() {

    }



    public static class Project implements BaseColumns {
        public static final String TABLE_NAME = "project";
        public static final String COLUMN_NAME_PROJECT = "project_name";
        public static final String COLUMN_NAME_PROJECT_DESCRIPTION = "project_description";
        public static final String COLUMN_NAME_START_DATE = "start_date";
        public static final String COLUMN_NAME_DUE_DATE = "due_date";
        public static final String COLUMN_NAME_END_DATE = "end_date";
        public static final String COLUMN_NAME_AKTIV = "aktiv";
    }

}
