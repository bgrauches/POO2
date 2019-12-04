
public class ClasseA {
	
	int valorPrimari;
	int valorSecundari;
	
	public ClasseA() {
		this.valorPrimari = 5;
		this.valorSecundari = 10;
	}
	
	public ClasseA( int vp) {
		this.valorPrimari = vp;
		this.valorSecundari = 10;
	}
	
	public ClasseA(int vp, int vs) {
		this.valorPrimari = vp;
		this.valorSecundari = vs;
	}
	
	
	
	public int getValorPrimari() {
		return valorPrimari;
	}
	
	public int getValorSecundari() {
		return valorSecundari;
	}
	
	public static void main(String[] args) {
		ClasseA obj1 = new ClasseA();
		System.out.println(obj1);
	}

}
