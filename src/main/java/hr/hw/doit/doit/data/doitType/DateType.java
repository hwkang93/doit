package hr.hw.doit.doit.data.doitType;

public enum DateType {
    DATE("일간"),
    WEEK("주간"),
    MONTH("주간");

    private String name;

    DateType(String name) {
        this.name = name;
    }
}
