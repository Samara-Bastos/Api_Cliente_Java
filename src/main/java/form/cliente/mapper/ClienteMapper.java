package form.cliente.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import form.cliente.dto.RequestDTO;
import form.cliente.dto.ResponseDTO;
import form.cliente.entity.Cliente;

@Mapper(componentModel = "spring")
public interface ClienteMapper {
    ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);
    Cliente dtoToCliente(RequestDTO requestDTO);
    ResponseDTO clienteToResponse(Cliente cliente);
}