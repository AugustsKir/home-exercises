package io.codelex.dateandtime.practice.practice;

import java.time.LocalDate;

public class DatePeriod {
    private LocalDate start;
    private LocalDate end;


    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }
    /*public DatePeriod intersection(DatePeriod period) {

        if (this.start.isBefore(period.end) && period.start.isBefore(this.end)) {

        }
    }*/
}
