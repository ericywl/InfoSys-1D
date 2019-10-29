package profchoper._config;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

public class Constant {
    public static final int SLOT_TIME = 30;
    public static final LocalTime DAY_FIRST_START_TIME = LocalTime.of(9, 0);
    public static final LocalTime DAY_END_TIME = LocalTime.of(17, 0);
    public static final LocalTime DAY_LAST_START_TIME = DAY_END_TIME.minus(30, ChronoUnit.MINUTES);

    // Calendar size
    public static final int WEEK_CAL_COL = 5;
    public static final int WEEK_CAL_ROW = 16;

    public static final String TERM = "TERM";
    public static final String MONTH = "MONTH";
    public static final String DATE = "DATE";
    public static final String WEEK = "WEEK";
    public static final String SCHOOL_WEEK = "SCHOOL_WEEK";

    // Booking statuses
    public static final String AVAIL = "AVAILABLE";
    public static final String PENDING = "PENDING";
    public static final String BOOKED = "BOOKED";
    public static final String REJECTED = "REJECTED";
    public static final String CANCELLED = "CANCELLED";

    // Domain names for SUTD email
    public static final String STUDENT_EMAIL_DOMAIN = "@mymail.sutd.edu.sg";
    public static final String PROF_EMAIL_DOMAIN = "@sutd.edu.sg";

    // For authentication
    public static final String STUDENT = "STUDENT";
    public static final String PROF = "PROFESSOR";

    // For comparing with DB
    public static final String ROLE_STUDENT = "ROLE_STUDENT";
    public static final String ROLE_PROF = "ROLE_PROFESSOR";

    // Converting row number in calendar table to time
    public static final Map<Integer, LocalTime> ROW_TO_TIME = new HashMap<>();
    static {
        ROW_TO_TIME.put(0, LocalTime.of(9, 0, 0));
        ROW_TO_TIME.put(1, LocalTime.of(9, 30, 0));
        ROW_TO_TIME.put(2, LocalTime.of(10, 0, 0));
        ROW_TO_TIME.put(3, LocalTime.of(10, 30, 0));
        ROW_TO_TIME.put(4, LocalTime.of(11, 0, 0));
        ROW_TO_TIME.put(5, LocalTime.of(11, 30, 0));
        ROW_TO_TIME.put(6, LocalTime.of(12, 0, 0));
        ROW_TO_TIME.put(7, LocalTime.of(12, 30, 0));
        ROW_TO_TIME.put(8, LocalTime.of(13, 0, 0));
        ROW_TO_TIME.put(9, LocalTime.of(13, 30, 0));
        ROW_TO_TIME.put(10, LocalTime.of(14, 0, 0));
        ROW_TO_TIME.put(11, LocalTime.of(14, 30, 0));
        ROW_TO_TIME.put(12, LocalTime.of(15, 0, 0));
        ROW_TO_TIME.put(13, LocalTime.of(15, 30, 0));
        ROW_TO_TIME.put(14, LocalTime.of(16, 0, 0));
        ROW_TO_TIME.put(15, LocalTime.of(16, 30, 0));
    }
}
