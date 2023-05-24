package Main;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
			Pedido ord = new Pedido(1233, new Date(),StatusDoPedido.PagamentoPendente);
			 System.out.println(ord);
			 
			 
			 StatusDoPedido Sdp1 = StatusDoPedido.Transporte;
			 StatusDoPedido SdP = StatusDoPedido.valueOf("Transporte");
			
			 System.out.println(SdP);
			 System.out.println(Sdp1);
	}

}
