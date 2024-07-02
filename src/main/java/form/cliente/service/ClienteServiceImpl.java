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

    @Override
    public ResponseDTO readId(Long id){
        Optional<Cliente> clienteReturn = clienteRepository.findById(id);
        return ClienteMapper.INSTANCE.clienteToResponse(clienteReturn.get());
    };

    @Override
    public ResponseDTO update(Long id, RequestDTO requestDTO){
        Optional<Cliente> clienteReturn = clienteRepository.findById(id);
        if(clienteReturn.isEmpty()){
            
        }
        Cliente cliente = ClienteMapper.INSTANCE.dtoToCliente(requestDTO);

        clienteReturn.get().setNome(cliente.getNome());
        clienteReturn.get().setNascimento(cliente.getNascimento());
        clienteReturn.get().setEmail(cliente.getEmail());
        clienteReturn.get().setTelefone(cliente.getTelefone());
        clienteReturn.get().setEscolaridade(cliente.getEscolaridade());
        clienteReturn.get().setEstCivil(cliente.getEstCivil());
        clienteReturn.get().setFilhos(cliente.getFilhos());
        clienteReturn.get().setDescricao(cliente.getDescricao());


        clienteRepository.save(clienteReturn.get());
        return ClienteMapper.INSTANCE.clienteToResponse(clienteReturn.get());
    };

    @Override
    public void delete(Long id){
        Optional<Cliente> clienteReturn = clienteRepository.findById(id);
        if(clienteReturn.isEmpty()){
            
        }
        clienteRepository.delete(clienteReturn.get());
    };
}