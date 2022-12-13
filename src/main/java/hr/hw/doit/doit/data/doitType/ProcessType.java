package hr.hw.doit.doit.data.doitType;

public enum ProcessType {
    SUCCESS("성공"),
    FAIL("실패"),
    ING("진행중");

    private String name;

    ProcessType(String name) {
        this.name = name;
    }
}
