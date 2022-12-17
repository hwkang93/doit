package hr.hw.doit.doit.controller;

import hr.hw.doit.doit.data.DoitResponseDto;
import hr.hw.doit.doit.service.DoitService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/doits")
public class DoitRestController {

    private final DoitService doitService;

    @GetMapping("/{userId}")
    public ResponseEntity<List<DoitResponseDto>> selectDoitList(@PathVariable String userId) {

        List<DoitResponseDto> doitList = doitService.findByUserExecutorId(userId);

        return ResponseEntity.ok().body(doitList);
    }
}
