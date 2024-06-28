package form.cliente.dto;

import java.time.LocalDate;

import form.cliente.entity.Cliente;

public record ResponseDTO(
    String nome,

    LocalDate nascimento,

    String email,

    String telefone,

    String escolaridade,

    String estCivil,

    Boolean filhos,

    String descricao
){
    public ResponseDTO(Cliente cliente){
        this(cliente.getNome(), cliente.getNascimento(), cliente.getEmail(), cliente.getTelefone(), cliente.getEscolaridade(), cliente.getEstCivil(), cliente.getFilhos(), cliente.getDescricao());
    }
}
