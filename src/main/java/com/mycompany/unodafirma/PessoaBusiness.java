/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unodafirma;

/**
 *
 * @author Pedro
 */
public class PessoaBusiness {

    private PessoaDataAccess _pessoaDA = new PessoaDataAccess();
    private Pessoa pessoaLogada;

    public Pessoa getPessoaLogada() {
        return pessoaLogada;
    }

    private void setPessoaLogada(Pessoa pessoaLogada) {
        this.pessoaLogada = pessoaLogada;
    }

    public boolean cadastrarPessoa(String nome, String username, String email, String senha, String validaSenha, String telefone, String cargo) {
        if (senha.equals(validaSenha)) {
            Pessoa pessoa = new Pessoa(nome, username, email, senha, telefone, cargo);
            boolean response = _pessoaDA.Adicionar(pessoa);
            return response;
        } else {
            return false;
        }
    }

    public boolean realizarLogin(String username, String password) {
        boolean response = _pessoaDA.Consultar(username);

        if (response) {
            Pessoa pessoa = _pessoaDA.getPessoa();
            String senhaCadastrada = pessoa.getSenha();
            if (!password.equals(senhaCadastrada)) {
                return false; // Senha Invalida.
            }

            setPessoaLogada(pessoa);
        }
        
        return true;
    }
}
