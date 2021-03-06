package org.biacode.escommons.core.model.document;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Created by Arthur Asatryan.
 * Date: 7/10/17
 * Time: 6:11 PM
 */
public final class DocumentConstants {

    //region Constants
    public static final String DATE_TIME_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";

    public static final String DATE_PATTERN = "yyyy-MM-dd";

    public static final String TIME_ZONE_GMT = "GMT";

    public static final String TIME_ZONE_UTC = "UTC";

    public static final int FETCH_MAX_SIZE = 10;

    public static final DateFormat DATE_FORMAT = new SimpleDateFormat(DATE_PATTERN);

    public static final DateFormat DATE_TIME_FORMAT = new SimpleDateFormat(DATE_TIME_PATTERN);
    //endregion

    //region Constructors
    private DocumentConstants() {
    }
    //endregion
}
