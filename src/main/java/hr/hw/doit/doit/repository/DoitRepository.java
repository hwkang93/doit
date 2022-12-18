package hr.hw.doit.doit.repository;


import hr.hw.doit.doit.data.DoitEntity;

import java.util.List;

public interface DoitRepository {

    List<DoitEntity> findByExecutorId(String executorId);
}
