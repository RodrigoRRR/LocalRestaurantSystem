package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import model.Bauru;
import model.CarrinhoI;
import model.Hamburguer;
import model.PCalabresa;
import model.PFrango;
import model.PQqueijos;
import model.XTudo;
import javafx.fxml.Initializable;
import javax.swing.JOptionPane;

public class MainController implements Initializable, CarrinhoI {

	@FXML private Label pizzaPedidoLabel;
	@FXML private CheckBox calabresaCheckBox;
	@FXML private CheckBox frangoCheckBox;
	@FXML private CheckBox qqueijosCheckBox;
	
	@FXML private RadioButton semBorda;
	@FXML private RadioButton cheddarBorda;
	@FXML private RadioButton catupiryBorda;
	@FXML private RadioButton chocolateBorda;
	@FXML private Label RadioButtonLabel; 
	
	@FXML private RadioButton pequena;
	@FXML private RadioButton media;
	@FXML private RadioButton grande;
	
	@FXML private Label sanduichePedidoLabel;
	@FXML private CheckBox hamburguerCheckBox;
	@FXML private CheckBox xTudoCheckBox;
	@FXML private CheckBox bauruCheckBox;
	
	@FXML private RadioButton semAdd;
	@FXML private RadioButton addQueijo;
	@FXML private RadioButton addBacon;
	@FXML private RadioButton addPicles;
	
	@FXML private TextField obs;
	
	PFrango frango = new PFrango();
	PCalabresa calabresa = new PCalabresa();
	PQqueijos qqueijos = new PQqueijos();
	
	Hamburguer hamburguer = new Hamburguer();
	XTudo xtudo = new XTudo();
	Bauru bauru = new Bauru();
	
	public void pizzaPedidoBotao()
	{
		String order = "Pizzas";
		
		if (frangoCheckBox.isSelected())
		{
			int contador = 1;
			frango.Sabor();
			order += "\n" + frango.getSabor();
			frango.setContador(frango.getContador() + contador);
			
			if (semBorda.isSelected())
			{
				frango.setB("sem borda");
				frango.Borda();
				order += " " + frango.getBorda();
			}
			
			if (cheddarBorda.isSelected())
			{
				frango.setB("cheddar");
				frango.Borda();
				order += " com borda de " + frango.getBorda();
			}
			
			if (catupiryBorda.isSelected())
			{
				frango.setB("catupiry");
				frango.Borda();
				order += " com borda de " + frango.getBorda();
			}
			
			if (chocolateBorda.isSelected())
			{
				frango.setB("chocolate");
				frango.Borda();
				order += " com borda de " + frango.getBorda();
			}
			
			//---------------------------------------------------
			
			if (pequena.isSelected())
			{
				frango.setT("pequena");
				frango.Tamanho();
				order += " " + frango.getTamanho();
			}
			
			if (media.isSelected())
			{
				frango.setT("media");
				frango.Tamanho();
				order += " " + frango.getTamanho();
			}
			
			if (grande.isSelected())
			{
				frango.setT("grande");
				frango.Tamanho();
				order += " " + frango.getTamanho();
			}
		
			frango.preco();
			order += " " + frango.getContador();
		}
		
		if (calabresaCheckBox.isSelected())
		{
			int contador = 1;
			calabresa.Sabor();
			order += "\n" + calabresa.getSabor();
			calabresa.setContador(calabresa.getContador() + contador);
			
			if (semBorda.isSelected())
			{
				calabresa.setB("sem borda");
				calabresa.Borda();
				order += " " + calabresa.getBorda();
			}
			
			if (cheddarBorda.isSelected())
			{
				calabresa.setB("cheddar");
				calabresa.Borda();
				order += " com borda de " + calabresa.getBorda();
			}
			
			if (catupiryBorda.isSelected())
			{
				calabresa.setB("catupiry");
				calabresa.Borda();
				order += " com borda de " + calabresa.getBorda();
			}
			
			if (chocolateBorda.isSelected())
			{
				calabresa.setB("chocolate");
				calabresa.Borda();
				order += " com borda de " + calabresa.getBorda();
			}
			
			//---------------------------------------------------
			
			if (pequena.isSelected())
			{
				calabresa.setT("pequena");
				calabresa.Tamanho();
				order += " " + calabresa.getTamanho();
			}
			
			if (media.isSelected())
			{
				calabresa.setT("media");
				calabresa.Tamanho();
				order += " " + calabresa.getTamanho();
			}
			
			if (grande.isSelected())
			{
				calabresa.setT("grande");
				calabresa.Tamanho();
				order += " " + calabresa.getTamanho();
			}
			
			calabresa.preco();
			order += " " + calabresa.getContador();
		}
		
		if (qqueijosCheckBox.isSelected())
		{
			int contador = 1;
			qqueijos.Sabor();
			order += "\n" + qqueijos.getSabor();
			qqueijos.setContador(qqueijos.getContador() + contador);
			
			if (semBorda.isSelected())
			{
				qqueijos.setB("sem borda");
				qqueijos.Borda();
				order += " " + qqueijos.getBorda();
			}
			
			if (cheddarBorda.isSelected())
			{
				qqueijos.setB("cheddar");
				qqueijos.Borda();
				order += " com borda de " + qqueijos.getBorda();
			}
			
			if (catupiryBorda.isSelected())
			{
				qqueijos.setB("catupiry");
				qqueijos.Borda();
				order += " com borda de " + qqueijos.getBorda();
			}
			
			if (chocolateBorda.isSelected())
			{
				qqueijos.setB("chocolate");
				qqueijos.Borda();
				order += " com borda de " + qqueijos.getBorda();
			}
			
			//--------------------------------------------------------
			
			if (pequena.isSelected())
			{
				qqueijos.setT("pequena");
				qqueijos.Tamanho();
				order += " " + qqueijos.getTamanho();
			}
			
			if (media.isSelected())
			{
				qqueijos.setT("media");
				qqueijos.Tamanho();
				order += " " + qqueijos.getTamanho();
			}
			
			if (grande.isSelected())
			{
				qqueijos.setT("grande");
				qqueijos.Tamanho();
				order += " " + qqueijos.getTamanho();
			}
			
			qqueijos.preco();
			order += " " + qqueijos.getContador();
		}
			
		this.pizzaPedidoLabel.setText(order);
	}
	
	public void sanduichePedidoButao() 
	{
		String sOrder = "Sanduiches são";
		
		if(hamburguerCheckBox.isSelected())
		{
			int contador = 1;
			hamburguer.tipoH();
			sOrder += "\n " + hamburguer.getTipo();
			hamburguer.setContador(hamburguer.getContador() + contador);
			
			if (semAdd.isSelected())
			{
				hamburguer.setA("sem adicional");
				hamburguer.adcional();
				sOrder += " " + hamburguer.getAdcional();
			}
			
			if (addQueijo.isSelected())
			{
				hamburguer.setA("queijo");
				hamburguer.adcional();
				sOrder += " adicional de " + hamburguer.getAdcional();
			}
			
			if (addBacon.isSelected())
			{
				hamburguer.setA("bacon");
				hamburguer.adcional();
				sOrder += " adicional de " + hamburguer.getAdcional();
			}
			
			if (addPicles.isSelected())
			{
				hamburguer.setA("picles");
				hamburguer.adcional();
				sOrder += " adicional de " + hamburguer.getAdcional();
			}
			
			hamburguer.preco();
			sOrder += " " + hamburguer.getContador();
		}
		
		if(xTudoCheckBox.isSelected())
		{
			int contador = 1;
			xtudo.tipoH();
			sOrder += "\n" + xtudo.getTipo();
			xtudo.setContador(xtudo.getContador() + contador);
			
			if (semAdd.isSelected())
			{
				xtudo.setA("sem adicional");
				xtudo.adcional();
				sOrder += " " + xtudo.getAdcional();
			}
			
			if (addQueijo.isSelected())
			{
				xtudo.setA("queijo");
				xtudo.adcional();
				sOrder += " adicional de " + xtudo.getAdcional();
			}
			
			if (addBacon.isSelected())
			{
				xtudo.setA("bacon");
				xtudo.adcional();
				sOrder += " adicional de " + xtudo.getAdcional();
			}
			
			if (addPicles.isSelected())
			{
				xtudo.setA("picles");
				xtudo.adcional();
				sOrder += " adicional de " + xtudo.getAdcional();
			}
				
			xtudo.preco();
			sOrder += " " + xtudo.getContador();
		}
		
		if(bauruCheckBox.isSelected())
		{
			int contador = 1;
			bauru.tipoH();
			sOrder += "\n" + bauru.getTipo();
			bauru.setContador(bauru.getContador() + contador);
			
			if (semAdd.isSelected())
			{
				bauru.setA("sem adicional");
				bauru.adcional();
				sOrder += " " + bauru.getAdcional();
			}
			
			if (addQueijo.isSelected())
			{
				bauru.setA("queijo");
				bauru.adcional();
				sOrder += " adicional de " + bauru.getAdcional();
			}
			
			if (addBacon.isSelected())
			{
				bauru.setA("bacon");
				bauru.adcional();
				sOrder += " adicional de " + bauru.getAdcional();
			}
			
			if (addPicles.isSelected())
			{
				bauru.setA("picles");
				bauru.adcional();
				sOrder += " adicional de " + bauru.getAdcional();
			}
			
			bauru.preco();
			sOrder += " " + bauru.getContador();
		}
		
		this.sanduichePedidoLabel.setText(sOrder);
	
	}
	
	public void confirmarObs()
	{
		final String op;
		op = obs.getText();
		
		hamburguer.setO(op);
		xtudo.setO(op);
		bauru.setO(op);	
		
		hamburguer.opcao();
		xtudo.opcao();
		bauru.opcao();
	}
	
	public void confirmarPedido()
	{
		String teste = "\n";
		double conta = 0;
		int resposta;
		
		if (frango.getContador() >= 1)
		{
			teste = (teste + "\n" + frango.getSabor() + " x" + frango.getContador() + " | "+ frango.getBorda() + " | " + frango.getTamanho() + " | " + frango.getPreco());
			
			conta = conta + (frango.getPreco() * frango.getContador());
		}
		
		if (calabresa.getContador() >= 1)
		{
			teste = (teste + "\n" + calabresa.getSabor() + " x" + calabresa.getContador() + " | "+ calabresa.getBorda() + " | " + calabresa.getTamanho() + " | " + calabresa.getPreco());
			
			conta = conta + (calabresa.getPreco() * calabresa.getContador());
		}
		
		if (qqueijos.getContador() >= 1)
		{
			teste = (teste + "\n" + qqueijos.getSabor() + " x" + qqueijos.getContador() + " | "+ qqueijos.getBorda() + " | " + qqueijos.getTamanho() + " | " + qqueijos.getPreco());
			
			conta = conta + (qqueijos.getPreco() * qqueijos.getContador());
		}
		
		if (hamburguer.getContador() >= 1)
		{
			teste = (teste + "\n" + hamburguer.getTipo() + " x" + hamburguer.getContador() + " | "+ hamburguer.getAdcional() + " | " + hamburguer.getPreco());
			
			conta = conta + (hamburguer.getPreco() * hamburguer.getContador());
		}
		
		if (xtudo.getContador() >= 1)
		{
			teste = (teste + "\n" + xtudo.getTipo() + " x" + xtudo.getContador() + " | "+ xtudo.getAdcional() + " | " + xtudo.getPreco());
			
			conta = conta + (xtudo.getPreco() * xtudo.getContador());
		}
		
		if (bauru.getContador() >= 1)
		{
			teste = (teste + "\n" + bauru.getTipo() + " x" + bauru.getContador() + " | "+ bauru.getAdcional() + " | " + bauru.getPreco());
			
			conta = conta + (bauru.getPreco() * bauru.getContador());
		}
		
		teste = (teste + "\n TOTAL: R$ " + conta + "\n Obeservações: " + hamburguer.getOpcao());
			
		
		resposta = JOptionPane.showConfirmDialog(null, teste);
		
		if (resposta == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null, "PEDIDO CONFIRMADO");
			JOptionPane.showMessageDialog(null, "Seu pedido está sendo preperado e logo ira sair para entrega");
			Platform.exit();
	        System.exit(0);
		} else {
			JOptionPane.showMessageDialog(null, "PEDIDO CANCELADO");
			int reset = 0;
			frango.setContador(reset);
			calabresa.setContador(reset);
			qqueijos.setContador(reset);
			hamburguer.setContador(reset);
			xtudo.setContador(reset);
			bauru.setContador(reset);
			pizzaPedidoLabel.setText("");
			sanduichePedidoLabel.setText("");	
		}
		
	}
	
	@Override	
	public void initialize(URL url, ResourceBundle rb) {
		pizzaPedidoLabel.setText("");
		sanduichePedidoLabel.setText("");	
	}
	
}
