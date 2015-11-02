package projec;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class AdForm extends JFrame{
	
	JMenuBar mb;
	JMenu mu3,mu2,mu1;
	JMenuItem subM3_1,subM3_2,subM3_3;
	JMenuItem subM2_1,subM2_2,subM2_3,subM2_4;
	JMenuItem subM1_1,subM1_2,subM1_3;
	JPanel panel;
	JButton btn1, btn2, btn3, btn4, btn5;
	
	
	public AdForm(){
		mb = new JMenuBar();
		mu1 = new JMenu("시작");
		mu2 = new JMenu("빠른실행");
		mu3 = new JMenu("시스템 관련");
		
		subM2_1 = new JMenuItem("메모장");
		subM2_1.addActionListener(new MyListener());
		subM2_2 = new JMenuItem("계산기");
		subM2_2.addActionListener(new MyListener());
		subM2_3 = new JMenuItem("그림판");
		subM2_3.addActionListener(new MyListener());
		subM2_4 = new JMenuItem("명령 프롬프트");
		subM2_4.addActionListener(new MyListener());
		
		
		subM3_1 = new JMenuItem("컴퓨터 종료");
		subM3_1.addActionListener(new MyListener());
		subM3_2 = new JMenuItem("컴퓨터 재시작");
		subM3_2.addActionListener(new MyListener());
		subM3_3 = new JMenuItem("컴퓨터 로그오프");
		subM3_3.addActionListener(new MyListener());
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setSize(500,500);
		panel.setVisible(true);
		
		btn1 = new JButton("1");
		btn1.setVisible(true);
		btn1.setBounds(15,10,200,50);
		
		btn2 = new JButton("2");
		btn2.setVisible(true);
		btn2.setBounds(15, 65, 200, 50);
		
		btn3 = new JButton("3");
		btn3.setVisible(true);
		btn3.setBounds(15, 120, 200, 50);
		
		btn4 = new JButton("4");
		btn4.setVisible(true);
		btn4.setBounds(15, 175, 200, 50);
		
		btn5 = new JButton("5");
		btn5.setVisible(true);
		btn5.setBounds(15, 230, 200, 50);
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		
		this.setLayout(null);
		this.setSize(500, 500);
		
		mu2.add(subM2_1);
		mu2.add(subM2_2);
		mu2.add(subM2_3);
		mu2.add(subM2_4);
		
		mu3.add(subM3_1);
		mu3.add(subM3_2);
		mu3.add(subM3_3);

		mb.add(mu1);
		mb.add(mu2);
		mb.add(mu3);
		
		this.setJMenuBar(mb);
		this.add(panel);
		this.setVisible(true);
	}

	private class MyListener implements ActionListener{
		administration ad = new administration();
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==subM3_1)
				ad.shutDown();
			else if(e.getSource()==subM3_2)
				ad.reStart();
			else if(e.getSource()==subM3_3)
				ad.logOff();
			else if(e.getSource()==subM2_1)
				ad.notePad();
			else if(e.getSource()==subM2_2)
				ad.calc();
			else if(e.getSource()==subM2_3)
				ad.aPaint();
			else if(e.getSource()==subM2_4)
				ad.cmd();
		}
	}
}
