package hr.hw.doit.doit.service.impl;

import hr.hw.doit.doit.data.DoitResponseDto;
import hr.hw.doit.doit.service.DoitService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoitServiceImpl implements DoitService {

    @Override
    public List<DoitResponseDto> findByUserId() {
        return null;
    }

}
