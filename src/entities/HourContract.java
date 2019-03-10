package entities;

import java.util.Date;

public class HourContract {
	
	private Date date;
	private Double valuePorHora;
	private Integer horas;
	
	
	
	//Construtores
	public HourContract() {
		
	}

	public HourContract(Date date, Double valuePorHora, Integer horas) {
		this.date = date;
		this.valuePorHora = valuePorHora;
		this.horas = horas;
	}
	
	
	//Getters and Setters
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePorHora() {
		return valuePorHora;
	}

	public void setValuePorHora(Double valuePorHora) {
		this.valuePorHora = valuePorHora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	public double totalValue() {
		return valuePorHora * horas;
		
	}
	
	
}
