package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class DatePeriod {
    LocalDate start;
    LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public DatePeriod intersection(DatePeriod date) {
        DatePeriod overlap1 = partiallyOverlap(date);
        DatePeriod overlap2 = completelyOverlap(date);
        DatePeriod overlap3 = notOverlap(date);
        if (overlap1 != null) {
            return overlap1;
        } else if (overlap2 != null) {
            return overlap2;
        } else return overlap3;
    }

    private DatePeriod partiallyOverlap(DatePeriod date) {
        if (start.isBefore(date.start) && end.isBefore(date.end) && date.start.isBefore(end)) {
            return new DatePeriod(date.start, end);
        }
        return null;
    }

    private DatePeriod completelyOverlap(DatePeriod date) {
        if (start.equals(date.start) && end.equals(date.end)) {
            return new DatePeriod(start, end);
        }
        return null;
    }

    private DatePeriod notOverlap(DatePeriod date) {
        if (start.isBefore(end) && end.isBefore(date.start)) {
            date.start.isBefore(date.end);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Start = " + start +
                ", end = " + end;
    }
}
