package lotto2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LottoBallUI extends JFrame implements ActionListener {
	LottoBallService service;
	JButton btn;
	JPanel panNorth,panSouth;
	ImageIcon icon;
	List<JButton> btns;
	public LottoBallUI() {
		this.service = new LottoBallServiceImpl();
		this.btn = new JButton("로또볼 추첨");
		this.panNorth = new JPanel();
		this.panSouth = new JPanel();
		this.btns = new ArrayList<JButton>();
		this.btn.addActionListener(this);
		this.panNorth.add(btn);
		this.add(panNorth, BorderLayout.NORTH);
		this.add(panSouth, BorderLayout.SOUTH);
		this.setBounds(300, 400, 1200, 300);
		// 300,400은 x,y 좌표 1200 300은 width height
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(btns.size()==0){
			JButton btn = null;
			for (int i = 0; i < 6; i++) {
				btn = new JButton();
				btns.add(btn);
				panSouth.add(btn);
			}
		}
		service.setLottoball();
		int[] lotto = service.getLottoball();
		for (int i = 0; i < lotto.length; i++) {
			btns.get(i).setIcon(this.getIcon(lotto[i]));
		}
		
	}
	public Icon getIcon(int index){
		return new ImageIcon("src/images/"+ index + ".gif");
	}
}
