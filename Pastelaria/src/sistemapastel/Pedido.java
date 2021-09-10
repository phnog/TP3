package sistemapastel;

public class Pedido {

	private String nomeCliente;
	private String escPastel; 
	private String escBebida; 
	private int valorPedido;
	private String timeCompra;
	private int numPedido;
	private String nomeGarcom; 
	private int qntPastel; 
	private int qntBebida;
	
	public Pedido(String nc, String escolhaPastel, String escolhaBebida, int preco, String hora, int numero, String nomeFuncionario, int quantidadePastel, int quantidadeBebida) {
		
		nomeCliente = nc;
		escPastel = escolhaPastel;
		escBebida = escolhaBebida;
		valorPedido = preco; 
		timeCompra = hora; 
		numPedido = numero; 
		nomeGarcom = nomeFuncionario; 
		qntPastel = quantidadePastel;
		qntBebida = quantidadeBebida;
		
		
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public String getEscPastel() {
		return escPastel;
	}

	public void setEscPastel(String escPastel) {
		this.escPastel = escPastel;
	}

	public String getEscBebida() {
		return escBebida;
	}

	public void setEscBebida(String escBebida) {
		this.escBebida = escBebida;
	}

	public int getValorPedido() {
		return valorPedido;
	}

	public void setValorPedido(int valorPedido) {
		this.valorPedido = valorPedido;
	}

	
	public String getTimeCompra() {
		return timeCompra;
	}

	public void setTimeCompra(String timeCompra) {
		this.timeCompra = timeCompra;
	}

	public int getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}

	public String getNomeGarcom() {
		return nomeGarcom;
	}

	public void setNomeGarcom(String nomeGarcom) {
		this.nomeGarcom = nomeGarcom;
	}

	public int getQntPastel() {
		return qntPastel;
	}

	public void setQntPastel(int qntPastel) {
		this.qntPastel = qntPastel;
	}

	public int getQntBebida() {
		return qntBebida;
	}

	public void setQntBebida(int qntBebida) {
		this.qntBebida = qntBebida;
	}
	
	

}
