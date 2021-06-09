package br.com.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.modelo.Usuario;
/*
 * DAO (Data Access Object) é um Pattern que aponta como boa prática
 * que todos os comandos DML (select, insert, update, delete) devem
 * estar em uma camada isolada (dao)
 * Por isso todo DAO contém um CRUD (Create - Read - Update - Delete)
 */
public interface UsuarioDAO extends CrudRepository<Usuario,Integer>{

	public Usuario findByEmailAndSenha(String email, String senha);
	
/*
 * save () => salva um objeto (serve para atualizar tb)
 * findById() => pesquisa um objeto pela chave primária
 * findAll() => retorna todos as linhas da tabela
 * deleteAll() => apaga tudo
 * deleteById() => apaga um usuário pela chave primária
 */
	
}
