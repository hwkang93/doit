package hr.hw.doit.doit.repository;

import hr.hw.doit.common.YN;
import hr.hw.doit.doit.data.DoitEntity;
import hr.hw.doit.doit.data.doitType.DateType;
import hr.hw.doit.doit.data.doitType.DoitType;
import hr.hw.doit.doit.data.doitType.ProcessType;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
public class DoitMemoryRepository implements DoitRepository {

    List<DoitEntity> doitEntityList = new ArrayList<>();

    @PostConstruct
    public void init() {
        DoitEntity entity1 = DoitEntity.builder().id(1L)
                .title("일주일에 면 2번 이상 먹으면 만원")
                .executorId("khw")
                .doitType(DoitType.DONT)
                .dateType(DateType.WEEK)
                .count(2)
                .processType(ProcessType.ING)
                .settleYn(YN.N)
                .registryTime(LocalDateTime.now())
                .build();

        DoitEntity entity2 = DoitEntity.builder().id(1L)
                .title("하루에 영양제 1번 이상 안먹으면 천원")
                .executorId("khw")
                .doitType(DoitType.DO)
                .dateType(DateType.DATE)
                .count(1)
                .processType(ProcessType.ING)
                .settleYn(YN.N)
                .registryTime(LocalDateTime.now())
                .build();

        DoitEntity entity3 = DoitEntity.builder().id(1L)
                .title("하루에 빡센 야식 먹으면 만원")
                .executorId("khw")
                .doitType(DoitType.DONT)
                .dateType(DateType.DATE)
                .count(0)
                .processType(ProcessType.ING)
                .settleYn(YN.N)
                .registryTime(LocalDateTime.now())
                .build();

        DoitEntity entity4 = DoitEntity.builder().id(1L)
                .title("간식 하루에 두개 이상 먹으면 천원")
                .executorId("chr")
                .doitType(DoitType.DONT)
                .dateType(DateType.DATE)
                .count(2)
                .processType(ProcessType.ING)
                .settleYn(YN.N)
                .registryTime(LocalDateTime.now())
                .build();

        DoitEntity entity5 = DoitEntity.builder().id(1L)
                .title("일주일에 면 2번 이상 먹으면 만원")
                .executorId("chr")
                .doitType(DoitType.DONT)
                .dateType(DateType.WEEK)
                .count(2)
                .processType(ProcessType.ING)
                .settleYn(YN.N)
                .registryTime(LocalDateTime.now())
                .build();

        DoitEntity entity6 = DoitEntity.builder().id(1L)
                .title("일주일에 운동 3번 이상 못하면 만원")
                .executorId("chr")
                .doitType(DoitType.DO)
                .dateType(DateType.WEEK)
                .count(3)
                .processType(ProcessType.ING)
                .settleYn(YN.N)
                .registryTime(LocalDateTime.now())
                .build();

        doitEntityList.add(entity1);
        doitEntityList.add(entity2);
        doitEntityList.add(entity3);
        doitEntityList.add(entity4);
        doitEntityList.add(entity5);
        doitEntityList.add(entity6);
    }

    @Override
    public List<DoitEntity> findByExecutorId(String executorId) {
        return doitEntityList.stream()
                .filter(doitEntity -> executorId.equals(doitEntity.getExecutorId()))
                .collect(Collectors.toList());
    }
}
