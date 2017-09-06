package mx.com.gapsi.simplerest.modelos;

public class Objeto01 {
	private String id;
	private String propiedadString;
	private String propiedadInt;
	private SubObjeto01 subObjeto01;

	public Objeto01() {
	}
	
	public Objeto01(String id, String propiedadString, String propiedadInt) {
		super();
		this.id = id;
		this.propiedadString = propiedadString;
		this.propiedadInt = propiedadInt;
	}

	public Objeto01(String id, String propiedadString, String propiedadInt, SubObjeto01 subObjeto01) {
		super();
		this.id = id;
		this.propiedadString = propiedadString;
		this.propiedadInt = propiedadInt;
		this.subObjeto01 = subObjeto01;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPropiedadString() {
		return propiedadString;
	}

	public void setPropiedadString(String propiedadString) {
		this.propiedadString = propiedadString;
	}

	public String getPropiedadInt() {
		return propiedadInt;
	}

	public void setPropiedadInt(String propiedadInt) {
		this.propiedadInt = propiedadInt;
	}

	public SubObjeto01 getSubObjeto01() {
		return subObjeto01;
	}

	public void setSubObjeto01(SubObjeto01 subObjeto01) {
		this.subObjeto01 = subObjeto01;
	}

}
