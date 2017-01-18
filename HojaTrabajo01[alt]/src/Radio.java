
public class Radio implements iRadio {
	
	private float numerito = 530;
	private boolean estado = true;
	private boolean frecuencia = false;
	private float[] lista = new float[12];

	@Override
	public void estado() {
		if(estado == true){
			estado = false;
		}else if(estado == false){
			estado = true;
		}
	}

	@Override
	public void frecuencia() {
		if(frecuencia == true){
			frecuencia = false;
			numerito = 530;
		}else if(frecuencia == false){
			frecuencia = true;
			numerito = 89.7F;
		}
	}

	@Override
	public void cambiar(boolean subir) {
		if(subir == true){
			numerito = numerito + 10;
		}else{
			numerito = numerito - 10;
		}
	}

	@Override
	public void guardar(int indx) {
		lista[indx] = numerito;
	}

	@Override
	public void seleccionar(int indx) {
		numerito = lista[indx];
	}

	@Override
	public boolean getEstado() {

		return estado;
	}

	@Override
	public boolean getFrecuencia() {

		return frecuencia;
	}

	@Override
	public float getEmisora() {

		return numerito;
	}

}
