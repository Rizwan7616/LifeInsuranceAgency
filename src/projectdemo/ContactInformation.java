package projectdemo;

import java.io.Serializable;
import java.time.LocalDate;

public class ContactInformation implements Serializable {

    private String newCoverage;
    private LocalDate startDate;
    private LocalDate endDate;

    public ContactInformation(String newCoverage, LocalDate startDate, LocalDate endDate) {
        this.newCoverage = newCoverage;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getNewCoverage() {
        return newCoverage;
    }

    public void setNewCoverage(String newCoverage) {
        this.newCoverage = newCoverage;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "ContactInformation{" +
                "newCoverage='" + newCoverage + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
