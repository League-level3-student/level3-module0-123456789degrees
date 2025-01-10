package _05_Pixel_Art;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PixelArtMaker implements MouseListener, ActionListener{
	private static final String DATA_FILE = "src/_05_Pixel_Art/saved.data";
    private JFrame window;
    private GridInputPanel gip;
    private GridPanel gp;
    ColorSelectionPanel csp;
    private JButton save;

    public void start() {
        gip = new GridInputPanel(this);	
        window = new JFrame("Pixel Art");
        window.setLayout(new FlowLayout());
        window.setResizable(false);
        save = new JButton("Save");
        window.add(save);
        
        window.add(gip);
        window.pack();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == save) {
			try (FileOutputStream fos = new FileOutputStream(new File(DATA_FILE)); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(gp);
				oos.close();
				fos.close();
			} catch (IOException error) {
				error.printStackTrace();
			}
		}
	}
    public void submitGridData(int w, int h, int r, int c) {
        gp = new GridPanel(w, h, r, c);
        csp = new ColorSelectionPanel();
        window.remove(gip);
        window.add(gp);
        window.add(csp);
        gp.repaint();
        gp.addMouseListener(this);
        window.pack();
    }

    public static void main(String[] args) {
        new PixelArtMaker().start();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        gp.setColor(csp.getSelectedColor());
        System.out.println(csp.getSelectedColor());
        gp.clickPixel(e.getX(), e.getY());
        gp.repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
