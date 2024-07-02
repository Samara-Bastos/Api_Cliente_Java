package form.cliente.service;

import form.cliente.dto.RequestDTO;
import form.cliente.dto.ResponseDTO;
import java.util.List;

public interface ClienteService {
    ResponseDTO create(RequestDTO requestDTO);
    List<ResponseDTO> read();
    ResponseDTO readId(Long id);
    ResponseDTO update(Long id, RequestDTO requestDTO);
    void delete(Long id);
}
