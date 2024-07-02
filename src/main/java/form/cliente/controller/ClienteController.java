package form.cliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;
import form.cliente.dto.RequestDTO;
import form.cliente.dto.ResponseDTO;
import form.cliente.service.ClienteService;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    ClienteService clienteService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> create(@RequestBody @Valid RequestDTO requestDTO ){
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.create(requestDTO));
    }

    @GetMapping()
    public ResponseEntity<List<ResponseDTO>> read(){
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.read());
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseDTO> readId(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.readId(id));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO> update(@PathVariable Long id, @RequestBody @Valid RequestDTO requestDTO ){
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.update(id, requestDTO));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        clienteService.delete(id);
        return ResponseEntity.noContent().build();
    }

}