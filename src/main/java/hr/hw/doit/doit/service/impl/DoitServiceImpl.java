package hr.hw.doit.doit.service.impl;

import hr.hw.doit.doit.data.DoitEntity;
import hr.hw.doit.doit.data.DoitResponseDto;
import hr.hw.doit.doit.repository.DoitMemoryRepository;
import hr.hw.doit.doit.repository.DoitRepository;
import hr.hw.doit.doit.service.DoitService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class DoitServiceImpl implements DoitService {

    private final DoitRepository doitRepository;

    @Override
    public List<DoitResponseDto> findByUserExecutorId(String executorId) {
        return doitRepository.findByExecutorId(executorId)
                .stream()
                .map(DoitEntity::toResponseDto)
                .collect(Collectors.toList());
    }

}
