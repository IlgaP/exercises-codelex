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
        DatePeriod overlap3 = oneIncludeOther(date);
        DatePeriod overlap4 = oneIncludeOther2(date);
        DatePeriod overlap5 = notOverlap(date);
        if (overlap1 != null) {
            return overlap1;
        } else if (overlap2 != null) {
            return overlap2;
        } else if (overlap3 != null) {
            return overlap3;
        } else if (overlap4 != null) {
            return overlap4;
        } else return overlap5;
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

    private DatePeriod oneIncludeOther(DatePeriod date) {
        if ((date.start.isBefore(start) || date.start.equals(start)) && ((end.isBefore(date.end)) || (end.equals(date.end)))) {
            return new DatePeriod(start, end);
        }
        return null;
    }

    private DatePeriod oneIncludeOther2(DatePeriod date) {
        if (start.isBefore(date.start) && date.end.isBefore(end)) {
            return new DatePeriod(date.start, date.end);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Start = " + start +
                ", end = " + end;
    }
}
