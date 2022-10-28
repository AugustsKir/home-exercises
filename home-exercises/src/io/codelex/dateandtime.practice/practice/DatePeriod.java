package io.codelex.dateandtime.practice.practice;

import java.time.LocalDate;

public class DatePeriod {
    private final LocalDate start;
    private final LocalDate end;


    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return
                start +
                        " --- " + end;

    }

    public DatePeriod intersection(DatePeriod period) {
        LocalDate start;
        LocalDate end;
        if (this.start.isAfter(period.start) && this.end.isAfter(period.end)) {
            start = this.start;
            end = this.end;
        } else if (period.start.isAfter(this.start) && period.end.isAfter(this.end)) {
            start = period.start;
            end = period.end;
        } else if (this.start.isBefore(period.start) && this.end.isBefore(period.end)) {
            start = period.start;
            end = this.end;
        } else if (period.start.isBefore(this.start) && period.end.isBefore(this.end)) {
            start = this.start;
            end = period.end;
        } else if (this.start.isAfter(period.start) && this.end.isBefore(period.end)) {
            start = this.start;
            end = this.end;
        } else if (period.start.isAfter(this.start) && period.end.isBefore(this.end)) {
            start = period.start;
            end = period.end;
        } else if (period.start == this.start && period.end == this.end) {
            start = period.start;
            end = period.end;
        } else return null;
        return new DatePeriod(start, end);
    }
}
