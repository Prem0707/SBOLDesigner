package edu.utah.ece.async.sboldesigner.boost;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.KeyStroke;

import edu.utah.ece.async.sboldesigner.sbol.editor.dialog.DialogUtils;

public class AvailableOperationsDialog extends JDialog implements ActionListener{

	private Component parent;
	private String filePath;
	
	private JRadioButton codonJugglingBtn = new JRadioButton("Codon-Juggling of protein coding DNA sequences");
	private JRadioButton dnaVerificationBtn = new JRadioButton("Verification of DNA Sequences against synthesis constraints");
	private JRadioButton sequenceModificationBtn = new JRadioButton("Modification of protein coding sequences (\"CDS\") for efficient synthesis");
	private JRadioButton sequencePartitionBtn = new JRadioButton("Partition of large DNA sequences into synthesizable building blocks");
	private JButton submitButton = new JButton("Submit");
	private JButton cancelButton = new JButton("Cancel");
	
	
	public AvailableOperationsDialog(Component parent, String filePath) {
		super(JOptionPane.getFrameForComponent(parent), "Available BOOST Tasks ", true);
		this.parent = parent;
		this.filePath = filePath;
		
		cancelButton.registerKeyboardAction(this, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
				JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		codonJugglingBtn.addActionListener(this);
		dnaVerificationBtn.addActionListener(this);
		sequenceModificationBtn.addActionListener(this);
		sequencePartitionBtn.addActionListener(this);
		submitButton.addActionListener(this);
		cancelButton.addActionListener(this);
		getRootPane().setDefaultButton(submitButton);
		
		ButtonGroup taskGroup = new ButtonGroup();
		taskGroup.add(codonJugglingBtn);
		taskGroup.add(dnaVerificationBtn);
		taskGroup.add(sequenceModificationBtn);
		taskGroup.add(sequencePartitionBtn);
		
		JPanel buttonPane = DialogUtils.buildDecisionArea(0); // 0 for LINE_AXIS alignment
		buttonPane.add(cancelButton);
		buttonPane.add(submitButton);
		
		JPanel taskPanel = DialogUtils.buildDecisionArea(1); // 1 for Y_AXIS alignment
		taskPanel.add(codonJugglingBtn);
		taskPanel.add(dnaVerificationBtn);
		taskPanel.add(sequenceModificationBtn);
		taskPanel.add(sequencePartitionBtn);
		taskPanel.setAlignmentX(LEFT_ALIGNMENT);
		

		JLabel infoLabel = new JLabel("Please select the operaton(s) you want to perform with your genatic constructs");

		Container contentPane = getContentPane();
		DialogUtils.setUI(contentPane, infoLabel, taskPanel, buttonPane);
		pack();
		setLocationRelativeTo(parent);
		setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cancelButton) {
			setVisible(false);
			return;
		} else if (e.getSource() == submitButton) {
			//TODO: Handle Submit Button
		} else if (e.getSource() == codonJugglingBtn) {
			new CodonJugglingDialog(parent, filePath);
		} else if (e.getSource() == dnaVerificationBtn) {
			new DNAVerificationDialog(parent, filePath);
		} else if (e.getSource() == sequenceModificationBtn) {
			new DNAPolishingDialog(parent, filePath);
		} else if (e.getSource() == sequencePartitionBtn) {

		}
	}
}