package br.com.cadUser;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;


@Named("pessoa")
@RequestScoped
public class Pessoa implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
    private List<String> nomes = new ArrayList<>();

    public void salvar() {
        nomes.add(nome);
        nome = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getNomes() {
        return nomes;
    }

    public void setNomes(List<String> nomes) {
        this.nomes = nomes;
    }
}