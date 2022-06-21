public class BMLampadaE4 {
	
	private int voltagem = 9;
	private double preco = 27.78;
	private String marca = "Philips";
	private String tipo = "Incandescente";
	private boolean queimada = false;
	private boolean ligada = false;
		
	public int getVoltagem() {
		return voltagem;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public boolean ligou() {
		return ligada;
	}
	
	public boolean estaQueimada() {
		return queimada;
	}
		
	public void ligarLampada(boolean temp) {
		temp = true;
		ligada = temp;
	}
	
	public void desligarLampada(boolean temp) {
		temp = false;
		ligada = temp;
	}
	
	
}
