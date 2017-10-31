package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "hospedagem")
public class Hospedagem {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id_hospedagem;
	private int qtd_hospede;
	private String checkin;
	private String checkout;
	private int qtd_noites;
	private String tipo_uh;
	private double valor_uh;
	private double gasto_extra;
	private String mes_checkin;
	private String mes_checkout;

	public int getId_hospedagem() {
		return id_hospedagem;
	}

	public void setId_hospedagem(int id_hospedagem) {
		this.id_hospedagem = id_hospedagem;
	}

	public int getQtd_hospede() {
		return qtd_hospede;
	}

	public void setQtd_hospede(int qtd_hospede) {
		this.qtd_hospede = qtd_hospede;
	}

	public String getCheckin() {
		return checkin;
	}

	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}

	public String getCheckout() {
		return checkout;
	}

	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}

	public int getQtd_noites() {
		return qtd_noites;
	}

	public void setQtd_noites(int qtd_noites) {
		this.qtd_noites = qtd_noites;
	}

	public String getTipo_uh() {
		return tipo_uh;
	}

	public void setTipo_uh(String tipo_uh) {
		this.tipo_uh = tipo_uh;
	}

	public double getValor_uh() {
		return valor_uh;
	}

	public void setValor_uh(double valor_uh) {
		this.valor_uh = valor_uh;
	}

	public double getGasto_extra() {
		return gasto_extra;
	}

	public void setGasto_extra(double gasto_extra) {
		this.gasto_extra = gasto_extra;
	}

	public String getMes_checkin() {
		return mes_checkin;
	}

	public void setMes_checkin(String mes_checkin) {
		this.mes_checkin = mes_checkin;
	}

	public String getMes_checkout() {
		return mes_checkout;
	}

	public void setMes_checkout(String mes_checkout) {
		this.mes_checkout = mes_checkout;
	}

}
