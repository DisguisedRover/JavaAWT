package Form_AWT;
import java.awt.*;
import java.awt.event.*;

public class ImpForm {

	//Frame_Construction--
	public static void main(String[]args) {
	Frame f = new Frame("Paper Submission");
		f.setSize(1280,720);
		f.setLayout(null);
		f.setVisible(true);
	
	//Menu_Construction--
	MenuBar b= new MenuBar();
		Menu b1= new Menu("File");
		Menu b2= new Menu("Edit");
		Menu b3= new Menu("Home");
			f.setMenuBar(b);
			b.add(b1);
			b.add(b2);
			b.add(b3);
			//Menu_Items--
		MenuItem bi1= new MenuItem("New");
		MenuItem bi2= new MenuItem("Open New File");
			b1.add(bi1);
			b1.add(bi2);
	
		MenuItem bi3= new MenuItem("Cut");
		MenuItem bi4= new MenuItem("Copy");
		MenuItem bi5= new MenuItem("Paste");
			b2.add(bi3);
			b2.add(bi4);
			b2.add(bi5);
	
		MenuItem bi6= new MenuItem("New Form");
		MenuItem bi7= new MenuItem("File");
		MenuItem bi8= new MenuItem("Edit");
			b3.add(bi6);
			b3.add(bi7);
			b3.add(bi8);
	
	//Header_Construction--
	Label l = new Label("Paper Submission Form");
		l.setBounds(640,70,380,50); //lbt.setBackground(Color.red);
		l.setFont(new Font("Arial",Font.BOLD,30));

		f.add(l);
	
	//Name--
	Label lb= new Label("First Name:");
		lb.setBounds(500,150,203,30);
		lb.setFont(new Font("Arial",Font.BOLD,16));
		TextField t= new TextField();
		t.setBounds(500,180,340,30);
	
	Label lb1= new Label("Last Name:");
		lb1.setBounds(850,150,203,30);
		lb1.setFont(new Font("Arial",Font.BOLD,16));
		TextField t1= new TextField();
		t1.setBounds(850,180,340,30);
	
			f.add(lb);
			f.add(t);
			f.add(lb1);
			f.add(t1);
	//Date--
	Label ld= new Label("Date:");
		ld.setBounds(500,230,203,30);
		ld.setFont(new Font("Arial",Font.BOLD,16));
		TextField d= new TextField();
		d.setBounds(500,260,340,30);

			f.add(d);
			f.add(ld);
	
	//Email--
	Label le= new Label("Student e-mail:");
		le.setBounds(850,230,203,30);
		le.setFont(new Font("Arial",Font.BOLD,16));
		TextField e= new TextField();
		e.setBounds(850,260,340,30);

			f.add(le);
			f.add(e);
	
	//Student_ID--
	Label lid= new Label("Student ID:");
		lid.setBounds(500,290,203,30);
		lid.setFont(new Font("Arial",Font.BOLD,16));
		TextField id= new TextField();
		id.setBounds(500,320,692,30);

			f.add(lid);
			f.add(id);
	
	//Paper_Title--
	Label lp= new Label("Paper Title:");
		lp.setBounds(500,350,203,30);
		lp.setFont(new Font("Arial",Font.BOLD,16));
		TextField p= new TextField();
		p.setBounds(500,380,692,30);

			f.add(lp);
			f.add(p);
	
	//Description--
	Label lde= new Label("Deacription:");
		lde.setBounds(500,420,203,30);
		lde.setFont(new Font("Arial",Font.BOLD,16));
		TextField de= new TextField();
		de.setBounds(500,450,692,120);

			f.add(lde);
			f.add(de);
	
	//Faculty--
	Label lbg = new Label("Faculty: ");
		lbg.setFont(new Font("Arial",Font.BOLD,16));
		lbg.setBounds(500,570,203,30); 
		
		//Checkbox_Construction--
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox cbg1 = new Checkbox("BIM",false,cbg);
		cbg1.setBounds(500,600,50,25);
		Checkbox cbg2 = new Checkbox("BHM",false,cbg);
		cbg2.setBounds(500,625,60,25);
		Checkbox cbg3 = new Checkbox("BBS",false,cbg);
		cbg3.setBounds(500,650,60,25);
		Checkbox cbg4 = new Checkbox("BEd",false,cbg);
		cbg4.setBounds(500,675,60,25);
	
			f.add(lbg);
			f.add(cbg1);
			f.add(cbg2); 
			f.add(cbg3);
			f.add(cbg4);
	//Paper_Uploader--
	Label lbp= new Label("Upload Paper File:");
		lbp.setFont(new Font("Arial",Font.BOLD,16));
		lbp.setBounds(500,700,203,30); 
	
	      //Action_For_Button--
	Button bt= new Button("Upload");
		bt.setBounds(500,730,100,30);
		bt.addActionListener((ActionListener) new ActionListener() {
	  public void actionPerformed(ActionEvent e) {
	        FileDialog fd = new FileDialog(f, "Choose a File", FileDialog.LOAD);
	        fd.setDirectory("D:\\");
	        fd.setFile("*.pdf;*.doc;*.zip;*.docx");
	        fd.setVisible(true);
	        }});
			f.add(lbp);
			f.add(bt);
	
	//submission--
	Label lbs= new Label("Submit Here:");
		lbs.setFont(new Font("Arial",Font.BOLD,16));
		lbs.setBounds(850,700,203,30); 
		//Button_Construction--
	Button btn = new Button("Submit");
	 	btn.setBounds(850,730,100,30);
	 
	 	btn.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent ae) {
			 
			 //Dialog_Box--
			 Dialog di = new Dialog(f,"Submit:");
			 di.add(new Label("Are You Sure To Submit?"));
			 Button btd = new Button("Yes");
			 
			 di.add(btd);
			 di.setSize(300,150);
			 di.setLayout(new FlowLayout());
			 di.setVisible(true);
			 
			 //Closing_DialogBox--
			 di.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent d) {
						di.dispose();
					}
				});
			 
			 //Action_for_"Yes"_BUtton--
			 btd.addActionListener(new ActionListener() {
				 public void actionPerformed(ActionEvent be) {
						di.dispose();
					}
				});
		 }
	 });
	 
			f.add(btn);
			f.add(lbs);
	
	//WindowCloser--
	f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	});
}
}
