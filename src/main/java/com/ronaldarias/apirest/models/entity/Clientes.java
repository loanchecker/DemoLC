package com.ronaldarias.apirest.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Clientes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="edad")
	private int edad;
	
	@Column(name="celular")
	private String celular;
	
	@Column(name="dni")
	private int dni;
	
	@Column(name="telfijo")
	private String telFijo;
	
	@Column(name="domcobro")
	private String domCobro;
	
	@Column(name="domsec")
	private String domicilioSecundario;
	
	@Column(name="barrio")
	private String barrio;
	
	public Clientes() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setFirstName(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setLastName(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEmail(int edad) {
		this.edad = edad;
	}
	
	
	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getTelFijo() {
		return telFijo;
	}

	public void setTelFijo(String telFijo) {
		this.telFijo = telFijo;
	}

	public String getDomicilioCobro() {
		return domCobro;
	}

	public void setDomicilioCobro(String domicilioCobro) {
		this.domCobro = domicilioCobro;
	}

	public String getDomicilioSecundario() {
		return domicilioSecundario;
	}

	public void setDomicilioSecundario(String domicilioSecundario) {
		this.domicilioSecundario = domicilioSecundario;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", celular="
				+ celular + ", dni=" + dni + ", telFijo=" + telFijo + ", domicilioCobro=" + domCobro
				+ ", domicilioSecundario=" + domicilioSecundario + ", barrio=" + barrio + "]";
	}

}

	@Entity
	@Table(name="prestamos")
	class Prestamos {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private Integer id;
		
		@Column(name="idcliente")
		private Integer idcliente;
		
		@Column(name="idpagos")
		private Integer idpagos;
		
		@Column(name="monto")
		private Integer monto;
		
		@Column(name="tasa")
		private float tasa;
		
		@Column(name="montosaldado")
		private int montosaldado;
		
		@Column(name="cantidadpagos")
		private int cantidadpagos;
		
		@Column(name="diaspagados")
		private int diaspagados;
		
		@Column(name="diasnopagados")
		private int diasnopagados;
		
		@Column(name="fechainicio")
		private String fechainicio; // YYYY-MM-DD
		
		@Column(name="estado")
		private boolean estado;
		
		@Column(name="pagos")
		private int pagos;
		
		
		public Prestamos() {
			
		}
		

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Integer getIdcliente() {
			return idcliente;
		}

		public void setIdcliente(Integer idcliente) {
			this.idcliente = idcliente;
		}

		public Integer getIdpagos() {
			return idpagos;
		}

		public void setIdpagos(Integer idpagos) {
			this.idpagos = idpagos;
		}

		public Integer getMonto() {
			return monto;
		}

		public void setMonto(Integer monto) {
			this.monto = monto;
		}

		public float getTasa() {
			return tasa;
		}

		public void setTasa(float tasa) {
			this.tasa = tasa;
		}

		public int getMontosaldado() {
			return montosaldado;
		}

		public void setMontosaldado(int montosaldado) {
			this.montosaldado = montosaldado;
		}

		public int getCantidadpagos() {
			return cantidadpagos;
		}

		public void setCantidadpagos(int cantidadpagos) {
			this.cantidadpagos = cantidadpagos;
		}

		public int getDiaspagados() {
			return diaspagados;
		}

		public void setDiaspagados(int diaspagados) {
			this.diaspagados = diaspagados;
		}

		public int getDiasnopagados() {
			return diasnopagados;
		}

		public void setDiasnopagados(int diasnopagados) {
			this.diasnopagados = diasnopagados;
		}

		public String getFechainicio() {
			return fechainicio;
		}

		public void setFechainicio(String fechainicio) {
			this.fechainicio = fechainicio;
		}

		public boolean isEstado() {
			return estado;
		}

		public void setEstado(boolean estado) {
			this.estado = estado;
		}

		public int getPagos() {
			return pagos;
		}

		public void setPagos(int pagos) {
			this.pagos = pagos;
		}

		@Override
		public String toString() {
			return "Prestamos [id=" + id + ", idcliente=" + idcliente + ", idpagos=" + idpagos + ", monto=" + monto
					+ ", tasa=" + tasa + ", montosaldado=" + montosaldado + ", cantidadpagos=" + cantidadpagos
					+ ", diaspagados=" + diaspagados + ", diasnopagados=" + diasnopagados + ", fechainicio="
					+ fechainicio + ", estado=" + estado + ", pagos=" + pagos + "]";
		}
		
		
}