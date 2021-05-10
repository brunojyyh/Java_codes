
public class TesteContas {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111,222);
		cc.deposita(100.00);
		
		ContaPoupanca cp = new ContaPoupanca(222,222);
		cp.deposita(200.00);
		
		cc.transfere(10.00,cp);

		ContaCorrente cc2 = new ContaCorrente(333, 333);
		cc2.deposita(600);
		System.out.println("valor do deposito" + cc2.getSaldo()); 
		cc2.transfere(599.80, cc);
		System.out.println(cc.getSaldo());
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
	}
}
