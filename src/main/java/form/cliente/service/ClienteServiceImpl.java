package form.cliente.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import form.cliente.dto.RequestDTO;
import form.cliente.dto.ResponseDTO;
import form.cliente.entity.Cliente;
import form.cliente.mapper.ClienteMapper;
import form.cliente.repository.ClienteRepository;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public ResponseDTO create(RequestDTO requestDTO){
        Optional<Cliente> clienteReturn = clienteRepository.findByEmail(requestDTO.email());
        if(clienteReturn.isPresent()){
            
        }
        Cliente cliente = ClienteMapper.INSTANCE.dtoToCliente(requestDTO);
        clienteRepository.save(cliente);
        return ClienteMapper.INSTANCE.clienteToResponse(cliente);
    };

    @Override
    public List<ResponseDTO> read(){
        return clienteRepository.findAll().stream().map(ResponseDTO::new).toList();
    };
}
