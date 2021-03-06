import java.awt.*;
import java.awt.event.*;

public class Main extends Frame {

	private static final Long serialVersionUID = 1L;

	public Main(){
		this.setSize(350,400);
		this.setTitle("Ejercicio_1");
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Main ventana = new Main();
		ventana.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
}