package asignacionascientos;

import java.util.ArrayList;

public class Avion {
	
	
	private Integer id;
	private String Matricula;
	private ArrayList <String> listaAscientos;
	public Avion(Integer id, String matricula, ArrayList<String> listaAscientos) {
		
		this.id = id;
		Matricula = matricula;
		this.listaAscientos = listaAscientos;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	public ArrayList<String> getListaAscientos() {
		return listaAscientos;
	}
	public void setListaAscientos(ArrayList<String> listaAscientos) {
		this.listaAscientos = listaAscientos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avion other = (Avion) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	public void crearAscientos() {
		for (int i = 0; i < 50; i++) {
			listaAscientos.add(String.valueOf(i));
		}
	}

}
