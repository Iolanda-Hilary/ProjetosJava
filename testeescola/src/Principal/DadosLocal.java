package Principal;
import javax.swing.JOptionPane;

public class DadosLocal {
		String nome;
		String ensino = "Do fundamental ao Medio";
		String endereco = "rua dos bobos";
				
		String altntv1 = "1";
		String altntv2 = "2";
		String altntv3 = "3";
		
DadosLocal(){
		
		
		setNome(JOptionPane.showInputDialog("bota o nome bença"));
			//this.setEndereco(JOptionPane.showInputDialog(this.getNome() + ", escolhe bença"));

		//-----------------------------------------------------------------------------------
			
	setAltntv1(JOptionPane.showInputDialog(this.getNome() + "Escolha a alternativa a = endereco / b = ensino"));
	
		if (getAltntv1() == "1"); { 
			JOptionPane.showMessageDialog(null, endereco);
			if((getAltntv1() != "1"));{
				JOptionPane.showMessageDialog(null, "escolha uma valida");
				
			}}
		//do (JOptionPane.showMessageDialog(null, "Escolha uma valida"));

		
			
		}
		
			

			



public String getAltntv1() {
		return altntv1;
	}

	public void setAltntv1(String altntv1) {
		this.altntv1 = altntv1;
	}

	public String getAltntv2() {
		return altntv2;
	}

	public void setAltntv2(String altntv2) {
		this.altntv2 = altntv2;
	}

	public String getAltntv3() {
		return altntv3;
	}

	public void setAltntv3(String altntv3) {
		this.altntv3 = altntv3;
	}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public String getEnsino() {
	return ensino;
}

public void setEnsino(String ensino) {
	this.ensino = ensino;
}}
			
	
	
	
	


