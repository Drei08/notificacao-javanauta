package com.notificacao.controller;

import com.notificacao.business.EmailService;
import com.notificacao.business.dto.TarefasDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/email")
public class EmailController {

    private final EmailService emailService;

    @PostMapping
    public ResponseEntity<Void> emailEnviado(@RequestBody TarefasDTO dto){
        emailService.enviaEmail(dto);
        return ResponseEntity.ok().build();
    }
}
