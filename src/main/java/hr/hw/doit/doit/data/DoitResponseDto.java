package hr.hw.doit.doit.data;

import hr.hw.doit.common.YN;
import hr.hw.doit.doit.data.doitType.DateType;
import hr.hw.doit.doit.data.doitType.DoitType;
import hr.hw.doit.doit.data.doitType.ProcessType;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class DoitResponseDto {
    private long id;
    private String title;               //제목
    private String executorId;          //실천해야 하는 사람
    private DoitType doitType;          //하기 OR 말기
    private DateType dateType;          //일간 OR 주간 OR 월간
    private ProcessType processType;    //성공 OR 실패 OR 진행중
    private int count;                  //횟수
    private int price;                  //벌금
    private YN settleYn;               //정산 여부

    private LocalDateTime registryTime;
    private LocalDateTime updateTime;

    @Builder
    public DoitResponseDto(long id, String title, String executorId, DoitType doitType, DateType dateType, ProcessType processType,
                      int count, int price, YN settleYn, LocalDateTime registryTime, LocalDateTime updateTime) {
        this.id = id;
        this.title = title;
        this.executorId = executorId;
        this.doitType = doitType;
        this.dateType = dateType;
        this.processType = processType;
        this.count = count;
        this.settleYn = settleYn;
        this.registryTime = registryTime;
        this.updateTime = updateTime;
    }
}
