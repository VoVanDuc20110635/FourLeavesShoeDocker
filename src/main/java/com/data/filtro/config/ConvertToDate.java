package com.data.filtro.config;

import java.time.LocalDateTime;
import java.util.Date;

public class ConvertToDate {
    public static Date convertToDateViaSqlTimestamp(LocalDateTime dateToConvert) {
        return java.sql.Timestamp.valueOf(dateToConvert);
    }
}
