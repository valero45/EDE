package persona;
/**
 * 
 * @author 1dam
 *
 */
public class Persona {
	/**
	 * Nombre completo de la persona
	 */
	String nombre;
	/**
	 * Edad de la persona
	 */
	int edad;
	/**
	 * sexo de la persona <b>M</b> si es hombre o <b>F</b> si es mujer.
	 */
	char sexo;
	/**
	 * origen de la persona Valores posibles: <b>N</b> norte, <b>S</b> sur; <b>E</b> este, <b>O</b> oeste.
	 */
	char origen;
	/**
	 * peso de la persona en kilagramos
	 */
	float peso;
	/**
	 * altura de la persona en centrimetros
	 */
	int altura;
	/**
	 * pareja de la persona
	 */
	Persona pareja;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public char getOrigen() {
		return origen;
	}
	public void setOrigen(char origen) {
		this.origen = origen;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public Persona getPareja() {
		return pareja;
	}
	public void setPareja(Persona pareja) {
		this.pareja = pareja;
	}
	public Persona(String nombre, int edad, char sexo, char origen, float peso, int altura, Persona pareja) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.origen = origen;
		this.peso = peso;
		this.altura = altura;
		this.pareja = pareja;
	}
	public Persona() {
		super();
	}
	public boolean esMasJovenQue(Persona p) {
		if(edad < p.getEdad())
			return true;
		else return false;
	}
	
	
	public boolean esMasJovenQueSuPareja() {
		if(edad < pareja.getEdad())
			return true;
		else return false;
	}
	
	
	public String getOrigenFormatoLargo() {
		String origenLargo = new String();
		switch (origen){
		case 'N': origenLargo = "norte"; break;
		case 'S': origenLargo = "sur"; break;
		case 'E': origenLargo = "este"; break;
		case 'O': origenLargo = "oeste"; break;
		}
		return origenLargo;		
	}
	
	

	public void mostrarDatos(){
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " +  edad);
		if (sexo == 'M')
			System.out.println("Sexo: hombre");
		else
			System.out.println("Sexo: mujer");
	}
	
	

	public float calcularIMC(){
		float alturaMetros = altura / 100;
		return peso/((alturaMetros*alturaMetros));
	}
	
	

	public boolean tieneSobrepeso(){
		float imc = calcularIMC();
		if(imc > 25)
			return true;
		else 
			return false;
	}	


}
