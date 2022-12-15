package hr.hw.doit.doit.controller;

import hr.hw.doit.doit.data.DoitResponseDto;
import hr.hw.doit.doit.service.DoitService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/doit")
public class DoitRestController {

    private final DoitService doitService;

    @GetMapping
    public ResponseEntity<DoitResponseDto> selectDoitList() {

        return ResponseEntity.ok().body(null);
    }
}
