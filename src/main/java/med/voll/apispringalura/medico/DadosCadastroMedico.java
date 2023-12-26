package med.voll.apispringalura.medico;

import med.voll.apispringalura.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
