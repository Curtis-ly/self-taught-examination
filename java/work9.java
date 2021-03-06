//选择框应用程序
package experiment;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class work9 extends JFrame implements ActionListener{

	private static final long serialVersionUID  = 1L;
	private JPanel panel1,panel2;
	private Goods goods1,goods2,goods3,goods4;
	private JTextField showNameText;//显示商品名字
	private JTextField showCostText;//显示单价
	private JTextField showPlaceText;//显示产地
	private JTextField showWeightText;//显示重量
	private ButtonGroup group;
	
	public work9() {
		super("选择框应用程序");
		panel1 = new JPanel();
		panel2 = new JPanel();
		group = new ButtonGroup();
		goods1 = new Goods("高露洁牙膏", 10.45, "广州", 850);
		goods2 = new Goods("飘柔洗发露", 16.90, "天津", 1530.5);
		goods3 = new Goods("老干妈豆豉", 6.50, "贵阳", 210);
		goods4 = new Goods("可比克薯片", 8.50, "吉林", 45);
		
		showNameText = new JTextField(10);
		showCostText = new JTextField(10);
		showPlaceText = new JTextField(10);
		showWeightText = new JTextField(10);
		
		addGoods(goods1);
		addGoods(goods2);
		addGoods(goods3);
		addGoods(goods4);
		
		panel2.setLayout(new GridLayout(4, 2));
		panel2.add(new JLabel("商品名称: "));
		panel2.add(showNameText);
		panel2.add(new JLabel("商品单价: "));
		panel2.add(showCostText);
		panel2.add(new JLabel("商品产地: "));
		panel2.add(showPlaceText);
		panel2.add(new JLabel("商品重量: "));
		panel2.add(showWeightText);
		
		this.setLayout(new FlowLayout());
		this.add(panel1);
		this.add(panel2);
		this.setBounds(200,100,400,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand();
		if(name.equals(goods1.getName())) {
			setGoodsText(goods1);
		}else if(name.equals(goods2.getName())) {
			setGoodsText(goods2);
		}else if(name.equals(goods3.getName())) {
			setGoodsText(goods3);
		}else if(name.equals(goods4.getName())) {
			setGoodsText(goods4);
		}
	}
	
	public void setGoodsText(Goods goods) {
		showNameText.setText(goods.getName());
		showPlaceText.setText(goods.getPlace());
		showCostText.setText(""+goods.getCost());
		showWeightText.setText(""+goods.getWeight());
	}
	
	public void addGoods(Goods goods) {
		JCheckBox box = new JCheckBox(goods.getName());
		group.add(box);
		box.addActionListener(this);
		panel1.add(box);
	}
	
	public static void main(String[] args) {
		new work9();

	}

}
