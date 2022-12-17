package hr.hw.doit.doit.service;

import hr.hw.doit.doit.data.DoitResponseDto;

import java.util.List;

public interface DoitService {

    List<DoitResponseDto> findByUserExecutorId(String executorId);

}
