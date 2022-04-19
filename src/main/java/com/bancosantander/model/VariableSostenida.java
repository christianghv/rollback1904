package com.bancosantander.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class VariableSostenida implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("TC Domiciliada")
	private java.lang.String tcDomiciliada;
	@org.kie.api.definition.type.Label("Pago Recurrente")
	private java.lang.String pagoRecurrente;
	@org.kie.api.definition.type.Label("Nómina")
	private java.lang.String nomina;
	@org.kie.api.definition.type.Label("Asistent. Contratada")
	private java.lang.String asistentContratada;

	/**
	 * Constructor por defecto
	 */
	public VariableSostenida() {
	}

	/**
	 * @return
	 */
	public java.lang.String getTcDomiciliada() {
		return this.tcDomiciliada;
	}

	/**
	 * @param string
	 */
	public void setTcDomiciliada(java.lang.String tcDomiciliada) {
		this.tcDomiciliada = tcDomiciliada;
	}
	/**
	 * @return
	 */
	public java.lang.String getPagoRecurrente() {
		return this.pagoRecurrente;
	}
	/**
	 * @param string
	 */
	public void setPagoRecurrente(java.lang.String pagoRecurrente) {
		this.pagoRecurrente = pagoRecurrente;
	}
	/**
	 * @return
	 */
	public java.lang.String getNomina() {
		return this.nomina;
	}
	/**
	 * @param string
	 */
	public void setNomina(java.lang.String nomina) {
		this.nomina = nomina;
	}
	/**
	 * @return
	 */
	public java.lang.String getAsistentContratada() {
		return this.asistentContratada;
	}

	/**
	 * @param string
	 */
	public void setAsistentContratada(java.lang.String asistentContratada) {
		this.asistentContratada = asistentContratada;
	}
	public VariableSostenida(java.lang.String tcDomiciliada,
			java.lang.String pagoRecurrente, java.lang.String nomina,
			java.lang.String asistentContratada) {
		this.tcDomiciliada = tcDomiciliada;
		this.pagoRecurrente = pagoRecurrente;
		this.nomina = nomina;
		this.asistentContratada = asistentContratada;
	}

}