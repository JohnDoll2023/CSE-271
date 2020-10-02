import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.*;

public class AddressBook extends JFrame implements ActionListener {
	
	JLabel nameLabel, addressLabel, phoneLabel, emailLabel;
	JTextField nameTF, addressTF, phoneTF, emailTF;
	JButton addButton, saveButton;
    JTextArea contactTA;
	
    //Creates new interaction panel to add information about a contact
	public AddressBook() {
		super("Address Book");
		nameLabel = new JLabel("Name:    ");
		addressLabel = new JLabel("Address: ");
		phoneLabel = new JLabel("Phone:   ");
		emailLabel = new JLabel("Email:   ");
		
		nameTF = new JTextField(50);
		addressTF = new JTextField(50);
		phoneTF = new JTextField(50);
		emailTF = new JTextField(50);
		
		addButton = new JButton("Add Contact");
		addButton.addActionListener(this);
		saveButton = new JButton("Save to File");
		saveButton.addActionListener(this);
		
		contactTA = new JTextArea(20, 50);
		contactTA.setEditable(false);
		this.setSize(680, 550);
		JScrollPane scrollPaneTA = new JScrollPane(contactTA);
		
		JPanel panel = new JPanel();
		panel.add(nameLabel);
		panel.add(nameTF);
		panel.add(addressLabel);
		panel.add(addressTF);
		panel.add(phoneLabel);
		panel.add(phoneTF);
		panel.add(emailLabel);
		panel.add(emailTF);
		
		panel.add(addButton);
		panel.add(saveButton);
		panel.add(scrollPaneTA);
		this.add(panel);
	}
	
	//Main method
	public static void main(String [] args) {
		AddressBook a1 = new AddressBook();
		a1.setVisible(true);
		a1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	//Manages operations when either button is clicked
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Add Contact")) {
			if(nameTF.getText().equals("") && addressTF.getText().equals("") && phoneTF.getText().equals("") && emailTF.getText().equals("")) {
				
			}
			else {
			contactTA.append(nameTF.getText() + ", " + addressTF.getText() + ", " + phoneTF.getText() + ", " + emailTF.getText() + "\n");
			nameTF.setText("");
			addressTF.setText("");
			phoneTF.setText("");
			emailTF.setText("");
			}
		}
		
		else if(e.getActionCommand().equals("Save to File")) {
			String c1 = contactTA.getText();
			writeContactsToFile(readContactsFromFile(), c1);
		}
	}

	//Reads the contact information from the text file.
	public static String readContactsFromFile() {
		String address = "";
		Scanner in = null;
		try {
			in = new Scanner(new File("contacts.txt"));
		}
		catch(Exception e) {
			System.out.println("Problem reading from file.");
		}
		
		while(in.hasNextLine()) {
			String str = in.nextLine();
			address = address + str;
			if(in.hasNextLine()) {
				address  = address + "\n";
			}
		}
		in.close();
		return address;
	}
	
	//Writes the old contact information to the file and then adds the new contacts from the interaction panel.
	public void writeContactsToFile(String prev_contacts, String c1) {
		PrintWriter out = null;
		try {
			out = new PrintWriter("contacts.txt");
		}
		catch(Exception e) {
			System.out.println("Problem writing to file.");
		}
		out.println(prev_contacts);
		out.print(c1);
		out.close();
	}
}
