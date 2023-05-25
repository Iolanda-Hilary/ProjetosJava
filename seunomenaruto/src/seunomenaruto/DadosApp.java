package seunomenaruto;


import javax.swing.JOptionPane;

public class DadosApp extends Naruto{
	
private	String nome;
private	int idade;
private	double numeros;
int alternativa;




DadosApp() {    
	
	 JOptionPane.showMessageDialog(null, "DESCUBRA SEU NOME NARUTO!!!!!!!!!!!!!!");
	 setNome(JOptionPane.showInputDialog(null, "Digite seu nome: "));
	 JOptionPane.showInputDialog(null, nome + ", agora, digite a cor do seu carro:");
	 JOptionPane.showInputDialog(null, nome + ", agora os números de validade do cartao da sua mãe:");
	alternativa = Integer.parseInt(JOptionPane.showInputDialog(null, nome + ", por ultimo, digite um número de 1 à 3"));
	if( alternativa == 1){
			JOptionPane.showMessageDialog(null, " Parabéns, voce é o SASUKE " + this.getSasuke());
	}
	if ( alternativa == 2){
			JOptionPane.showMessageDialog(null, " Parabéns, voce é o NARUTO " + this.getNaruto());
	}
	if ( alternativa == 3){
			JOptionPane.showMessageDialog(null, " Parabéns, voce é o ITACHI " + this.getItachi());
	}
	JOptionPane.showMessageDialog(null, "⣿⣿⡿⢋⠍⠄⠃⠌⠉⡀⠌⠛⠿⠿⣿⣿⣿⣿⣿⣿⣿⣷⠂⠀⠀⠠⠀⠀⠄⠀⠀⠠⠀⠄⡀⢂⠱⠈⠆⡍⢎⠳⡹⢏⡿⣿⣿⣿⣿⣿\r\n"
			+ "⡿⢏⠰⣁⠊⡐⠉⠄⠡⢀⠠⠀⠄⠀⠀⠀⠁⠉⠉⠋⠛⠉⠀⠠⠀⠁⠐⠈⠀⠀⠂⠔⣠⣀⠐⠀⠄⠡⠘⡐⢌⢡⢃⠏⡜⢧⡻⢿⣿⣿\r\n"
			+ "⠱⢈⠒⠠⠁⠄⡉⠄⡁⠂⠀⠡⠈⠐⠀⠂⢀⠀⠠⠀⠀⠀⠐⠀⠀⠐⠀⠀⠀⠀⠀⣾⣿⣿⢿⣷⣮⣄⡡⠐⢈⠰⢈⠚⣌⠣⣝⠻⣞⣿\r\n"
			+ "⢂⠡⢈⠐⡁⠂⠄⡐⢀⠐⠠⠐⢈⠀⠄⠁⠀⠀⠂⠀⠈⠀⠠⠀⠂⠀⠀⠀⠀⠀⠀⠘⢻⣿⣿⣾⣹⣟⡿⣷⣦⣐⢈⠰⣀⠓⣌⢳⡹⢞\r\n"
			+ "⠠⠁⠌⡐⠠⢁⠰⣰⠌⠂⠁⠌⠠⠈⠐⠠⠀⠀⠀⠁⠀⠀⠀⠐⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⢿⣷⣯⣟⡷⣽⢯⣿⣶⡀⠱⡀⠧⡘⢭\r\n"
			+ "⠀⡁⢂⠐⢠⣦⠓⣀⠀⠀⠀⠀⠀⠀⠨⠐⢀⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠻⣿⣿⣯⣿⣿⣿⣿⣧⡐⢡⠉⠖\r\n"
			+ "⠀⠐⠠⣘⣾⡷⠿⠛⠛⠿⢶⣤⡀⠀⠀⠀⠂⡜⢠⠀⠀⠀⠀⠐⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡉⠿⣿⣿⣿⡿⠏⡐⢂⠩⡘\r\n"
			+ "⠀⢁⢘⣿⡟⠈⡄⠀⠀⠀⠀⠘⣻⣦⣀⡀⠀⡐⢣⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠀⠀⠈⠐⠠⢀⠀⡀⠐⠀⠉⡉⠠⠐⢀⠂⡁⠆\r\n"
			+ "⠀⠀⣾⣿⠆⠀⠍⠀⠀⢀⢤⣿⣿⠟⢻⣷⡀⢌⡷⠀⠀⠠⠀⠀⠀⠁⠀⠀⠄⠀⠂⠡⠐⣈⠐⡈⠀⠄⠂⠄⡀⢂⠀⠄⡐⠀⠆⡐⠠⠌\r\n"
			+ "⠀⠈⣿⣿⡁⠀⠀⡀⠀⢊⣾⣿⣿⣿⣿⣿⣷⣺⡇⠀⠀⠀⠀⣀⣀⣀⠀⠀⠀⠀⠀⢁⠐⡀⠎⡰⢁⠌⡀⠐⡀⠂⠌⡀⠄⡁⠂⠄⡁⠂\r\n"
			+ "⠀⡀⣿⣿⡅⠀⠐⠀⠀⠱⢸⣿⣿⣿⣿⣿⣿⡷⢀⢠⣴⣾⠿⠟⠛⠻⢿⣶⣦⣤⡀⠀⢂⠐⠤⠑⢎⡒⠤⠁⠄⡁⢂⠐⠠⢀⠁⠂⠄⡁\r\n"
			+ "⠀⠠⢹⢿⣷⠀⡈⠄⠀⠀⠀⠛⠿⢿⡿⠿⠟⣻⣼⣿⠋⠀⠀⠀⠀⡄⣴⣿⠿⢿⣿⣷⣤⣀⠂⡉⢆⡹⢸⡑⢂⠐⠠⢈⠐⠠⢈⠐⠠⠀\r\n"
			+ "⠀⢂⢸⡚⣿⣦⠐⠡⢈⠂⠄⡀⠀⠀⠀⠀⠐⢻⣿⠁⠀⠀⠀⠀⠠⣿⣿⣷⣤⣿⣿⣿⣿⡟⢷⣬⠒⣌⢧⡙⢦⠉⡐⠠⢈⠐⠠⠈⡀⠁\r\n"
			+ "⠀⠀⠌⣷⠘⣿⣿⣄⠣⢌⠒⡠⢁⠎⡰⢠⣾⣿⡗⠀⠀⡀⠀⠀⠁⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠹⣿⣔⢮⣝⣮⢒⠠⢁⠂⠌⡐⠀⠄⠁\r\n"
			+ "⣶⡀⠀⠸⣷⡌⠻⣿⣷⣮⡱⣥⢋⣼⣱⣿⠏⣿⣇⠀⠀⠡⠀⠀⠀⠘⢿⣿⣿⣿⣿⣿⠿⠀⢀⠢⡘⢿⣿⢾⣟⡧⠌⠠⢈⠐⡀⠐⡈⠀\r\n"
			+ "⠀⠙⡀⠀⠈⠻⠆⠈⠙⠻⠿⠿⠿⠛⠋⠁⠀⢹⣿⣄⠈⡐⠀⠄⠠⠀⠀⠉⠉⠉⠁⠀⠀⢄⠢⣡⢝⡺⣿⣿⣿⡳⠌⡐⢀⠂⠄⡁⠀⠂\r\n"
			+ "⠀⡀⠘⡀⠀⠀⠈⠁⠂⠔⠀⠀⠀⠀⠀⠀⠀⠀⠻⣿⣦⠄⡡⢈⡐⠄⡡⢀⠂⠄⡀⢠⣈⢆⢧⣓⣮⣟⣿⣿⡿⣛⠔⠀⠂⠌⠀⠄⠁⠄\r\n"
			+ "⠂⡄⠀⠑⡀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠁⠐⠀⠀⠀⠘⢿⣿⣔⣣⠘⣤⠱⡌⢎⡲⣡⢧⣹⣚⣮⢷⣻⣾⣿⠟⡁⢏⠠⠈⠐⠈⡐⠈⠀⠄\r\n"
			+ "⠐⡸⢄⠀⠈⢄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠘⠻⢿⣿⣶⣹⣞⡵⣳⣝⣮⣷⣻⣾⣿⡿⠟⢁⡰⠈⠄⠂⠈⠄⠁⠠⢈⠀⠂\r\n"
			+ "⠈⡔⢫⠄⠀⠈⢳⣦⡀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠁⠀⠐⠀⠄⡀⠉⠙⠻⠿⢿⠿⡿⠿⠿⠟⠛⠉⠠⠐⡈⠄⡁⢈⠀⢁⠈⠠⠁⠠⠀⠂\r\n"
			+ "⠐⠌⠲⢭⡀⠀⠀⠙⠿⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠄⠹⢶⣧⣶⣤⡶⡐⢢⠒⡈⢄⠃⡄⢡⠐⠠⠐⢀⠈⡀⠠⠁⠠⢁⠠⠁\r\n"
			+ "⠈⠌⡑⢪⢵⣂⠄⠀⠀⠈⠻⢷⣦⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠙⠛⠋⠛⠉⠎⠑⠈⠄⠈⠄⠂⢀⠂⠄⠐⠀⡁⠠⢀⠂\r\n"
			+ "⠈⡔⢡⠃⢎⡽⣲⡄⣀⠀⠀⠀⠈⠙⠛⠿⣷⣶⣦⣤⣤⣤⣄⣠⣀⣀⣀⣀⣀⣄⣀⣄⣠⣄⣠⣀⠀⡀⠐⡀⠀⢂⠠⢀⠈⡀⠄⠡⢀⠂\r\n"
			+ "⠱⣈⠆⣉⠆⡜⡱⢻⣶⣧⣤⡀⡄⠀⠀⠀⠀⠈⠉⠉⠛⠙⠛⠛⠛⠛⠟⠻⠟⠻⠛⠟⠛⠛⠛⠛⠷⣆⢡⠀⡐⢀⠂⡄⠐⢠⢈⠒⡠⣉\r\n"
			+ "⠳⣌⢊⠔⡨⢐⠡⣋⢜⡻⣿⣿⣿⣿⣶⣧⣦⣤⣄⡠⣀⠄⣠⢀⢄⣂⢐⠠⡐⢀⠂⡐⠈⠄⢂⠀⠂⠩⠷⣎⡴⢃⣜⡄⣋⠦⣨⡗⡱⢬");
		
	
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public double getNumeros() {
	return numeros;
}
public void setNumeros(double numeros) {
	this.numeros = numeros;
}
public int getAlternativa() {
	return alternativa;
}
public void setAlternativa(int alternativa) {
	this.alternativa = alternativa;
}}