package hr.hw.doit.doit.repository;

import hr.hw.doit.common.YN;
import hr.hw.doit.doit.data.DoitEntity;
import hr.hw.doit.doit.data.DoitResponseDto;
import hr.hw.doit.doit.data.doitType.DateType;
import hr.hw.doit.doit.data.doitType.DoitType;
import hr.hw.doit.doit.data.doitType.ProcessType;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/*
공통
1.곗돈 한달에 5만원
2.다리꼬면 천원

현우
 1.일주일에 면 2번 => 만원
 2.영양제 안먹으면 => 천원
 3.탄산 일주일에 355ml 두개 이상 먹으면 => 만원

희라
 1.빡센 야식(은행,껌,단백질) => 만원
 2.간식 하루에 두개 이상 먹으면 => 개당 천원
 3.일주일에 세번 운동 => 세번 못하면 만원
 */
@Repository
public class DoitMemoryRepository {

    List<DoitEntity> doitEntityList = new ArrayList<>();

    @PostConstruct
    public void init() {
        DoitEntity.builder().id(1L)
                .title("일주일에 면 2번 이상 먹으면 만원")
                .executorId("khw")
                .doitType(DoitType.DONT)
                .dateType(DateType.WEEK)
                .count(0)

                .processType(ProcessType.ING)
                .settleYn(YN.N)
                .registryTime(LocalDateTime.now())
                .build();
    }
}
