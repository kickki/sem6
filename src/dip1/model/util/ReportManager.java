package dip1.model.util;

import dip1.model.ReportItem;

import java.util.List;

public class ReportManager {
    Reportable reportable;

    public ReportManager(Reportable reportable) {
        this.reportable = reportable;
    }

    public void output(List<ReportItem> items){
        reportable.output(items);
    }
}
