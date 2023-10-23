package objects;
public class product {
	private String ID_product;
	private float price;
	private float peso;
	private int stock;
	private String color;
	private float dimension;
	private String f_compra;
	private String f_entrega;
	private int n_dias_entrega;
	private String f_devolucion;
	private String f_recogida;
	private int n_dias_recogida;
	private int n_dias_devolucion;
	public product(String iD_product, float price, float peso, int stock, String color, float dimension,
			String f_compra, String f_entrega, int n_dias_entrega, String f_devolucion, String f_recogida,
			int n_dias_recogida, int n_dias_devolucion) {
		super();
		this.ID_product = iD_product;
		this.price = price;
		this.peso = peso;
		this.stock = stock;
		this.color = color;
		this.dimension = dimension;
		this.f_compra = f_compra;
		this.f_entrega = f_entrega;
		this.n_dias_entrega = n_dias_entrega;
		this.f_devolucion = f_devolucion;
		this.f_recogida = f_recogida;
		this.n_dias_recogida = n_dias_recogida;
		this.n_dias_devolucion = n_dias_devolucion;
	}
	public String getID_product() {
		return ID_product;
	}
	public void setID_product(String iD_product) {
		ID_product = iD_product;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getDimension() {
		return dimension;
	}
	public void setDimension(float dimension) {
		this.dimension = dimension;
	}
	public String getF_compra() {
		return f_compra;
	}
	public void setF_compra(String f_compra) {
		this.f_compra = f_compra;
	}
	public String getF_entrega() {
		return f_entrega;
	}
	public void setF_entrega(String f_entrega) {
		this.f_entrega = f_entrega;
	}
	public int getN_dias_entrega() {
		return n_dias_entrega;
	}
	public void setN_dias_entrega(int n_dias_entrega) {
		this.n_dias_entrega = n_dias_entrega;
	}
	public String getF_devolucion() {
		return f_devolucion;
	}
	public void setF_devolucion(String f_devolucion) {
		this.f_devolucion = f_devolucion;
	}
	public String getF_recogida() {
		return f_recogida;
	}
	public void setF_recogida(String f_recogida) {
		this.f_recogida = f_recogida;
	}
	public int getN_dias_recogida() {
		return n_dias_recogida;
	}
	public void setN_dias_recogida(int n_dias_recogida) {
		this.n_dias_recogida = n_dias_recogida;
	}
	public int getN_dias_devolucion() {
		return n_dias_devolucion;
	}
	public void setN_dias_devolucion(int n_dias_devolucion) {
		this.n_dias_devolucion = n_dias_devolucion;
	}
	@Override
	public String toString() {
		String str="";
        str=str+"ID del producto: " + this.getID_product() + "\n";
        str=str+"Precio del producto : " + this.getPrice() + "\n";
        str=str+"Peso del producto : " + this.getPeso() + "\n";
        str=str+"Stock del producto: " + this.getStock() + "\n";
        str=str+"Color del producto: " + this.getColor() + "\n";
        str=str+"Dimensiones del producto : " + this.getDimension() + "\n";
        str=str+"Fecha de compra del producto : " + this.getF_compra() + "\n";
        str=str+"Fecha de entrega del producto : " + this.getF_entrega() + "\n";
        str=str+"Número de días de entrega : " + this.getN_dias_entrega() + "\n";
        str=str+"Fecha de devolución : " + this.getF_devolucion() + "\n";
        str=str+"Fecha de recogida del producto : " + this.getF_recogida() + "\n";
        str=str+"Número de días de recogida del producto: " + this.getN_dias_recogida() + "\n";
        str=str+"Número de días de devolución: " + this.getN_dias_devolucion();
    return str;
	}


	
}