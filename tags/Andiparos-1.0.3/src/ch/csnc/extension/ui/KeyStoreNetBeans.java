/*
 * Copyright (C) 2010, Compass Security AG
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see http://www.gnu.org/copyleft/
 * 
 */


package ch.csnc.extension.ui;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Insets;
import java.awt.Component;
import java.awt.EventQueue;

public class KeyStoreNetBeans extends JDialog {
    
	private static final long serialVersionUID = -4343760839615493845L;
	
    private JButton addPkcs11Button;
    private JButton addPkcs12Button;
    private JScrollPane aliasScrollPane;
    private JTable aliasTable;
    private JButton browseButton;
    private JLabel certificateLabel;
    private JPanel certificatePanel;
    private JTextField certificateTextField;
    private JTabbedPane certificatejTabbedPane;
    private JPanel cryptoApiPanel;
    private JButton deleteButton;
    private JButton driverButton;
    private JComboBox driverComboBox;
    private JLabel driverLabel;
    private JLabel fileLabel;
    private JTextField fileTextField;
    private JList keyStoreList;
    private JPanel keyStorePanel;
    private JScrollPane keyStoreScrollPane;
    private JLabel passwordPkcs11Label;
    private JLabel passwordPkcs12Label;
    private JPanel pkcs11Panel;
    private JPasswordField pkcs11PasswordField;
    private JPanel pkcs12Panel;
    private JPasswordField pkcs12PasswordField;
    private JButton setActiveButton;
    private JButton showActiveCertificateButton;
    private JButton showAliasButton;
    private JLabel textLabel;
    private JCheckBox useClientCertificateCheckBox;

	private DefaultListModel keyStoreListModel;
	private AliasTableModel aliasTableModel;
	
	/** Creates new form KeyStore */
    public KeyStoreNetBeans() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {

        certificatePanel = new JPanel();
        certificatejTabbedPane = new JTabbedPane();
        keyStorePanel = new JPanel();
        setActiveButton = new JButton();
        showAliasButton = new JButton();
        aliasScrollPane = new JScrollPane();
        aliasTable = new JTable();
        deleteButton = new JButton();
        keyStoreScrollPane = new JScrollPane();
        keyStoreList = new JList();
        pkcs12Panel = new JPanel();
        fileLabel = new JLabel();
        fileTextField = new JTextField();
        browseButton = new JButton();
        passwordPkcs12Label = new JLabel();
        addPkcs12Button = new JButton();
        pkcs12PasswordField = new JPasswordField();
        pkcs11Panel = new JPanel();
        driverLabel = new JLabel();
        driverComboBox = new JComboBox();
        driverButton = new JButton();
        passwordPkcs11Label = new JLabel();
        addPkcs11Button = new JButton();
        pkcs11PasswordField = new JPasswordField();
        cryptoApiPanel = new JPanel();
        useClientCertificateCheckBox = new JCheckBox();
        textLabel = new JLabel();
        certificateLabel = new JLabel();
        certificateTextField = new JTextField();
        showActiveCertificateButton = new JButton();

        certificatejTabbedPane.setEnabled(false);

        setActiveButton.setText("Set Active");
        setActiveButton.setEnabled(false);
        setActiveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setActiveButtonActionPerformed(evt);
            }
        });

        showAliasButton.setText("->");
        showAliasButton.setEnabled(false);
        showAliasButton.setMargin(new Insets(2, 2, 2, 2));
        showAliasButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                showAliasButtonActionPerformed(evt);
            }
        });

        aliasTable.setModel(aliasTableModel);
        aliasTable.setTableHeader(null);
        aliasScrollPane.setViewportView(aliasTable);

        deleteButton.setText("Delete");
        deleteButton.setEnabled(false);
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        keyStoreList.setModel(keyStoreListModel);
        keyStoreList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                keyStoreListMouseClicked(evt);
            }
        });
        keyStoreScrollPane.setViewportView(keyStoreList);

        GroupLayout keyStorePanelLayout = new GroupLayout(keyStorePanel);
        keyStorePanel.setLayout(keyStorePanelLayout);
        keyStorePanelLayout.setHorizontalGroup(
            keyStorePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, keyStorePanelLayout.createSequentialGroup()
                .addGroup(keyStorePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(deleteButton)
                    .addComponent(keyStoreScrollPane, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(keyStorePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(keyStorePanelLayout.createSequentialGroup()
                        .addComponent(setActiveButton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addComponent(showAliasButton))
                    .addComponent(aliasScrollPane, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)))
        );
        keyStorePanelLayout.setVerticalGroup(
            keyStorePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, keyStorePanelLayout.createSequentialGroup()
                .addGroup(keyStorePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(aliasScrollPane, 0, 0, Short.MAX_VALUE)
                    .addComponent(keyStoreScrollPane, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(keyStorePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(setActiveButton, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                    .addComponent(showAliasButton)))
        );

        keyStorePanelLayout.linkSize(SwingConstants.VERTICAL, new Component[] {deleteButton, setActiveButton, showAliasButton});

        certificatejTabbedPane.addTab("KeyStore", keyStorePanel);

        fileLabel.setText("File");

        browseButton.setText("Browse");
        browseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        passwordPkcs12Label.setText("Password");

        addPkcs12Button.setText("Add to keystore");
        addPkcs12Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addPkcs12ButtonActionPerformed(evt);
            }
        });

        GroupLayout pkcs12PanelLayout = new GroupLayout(pkcs12Panel);
        pkcs12Panel.setLayout(pkcs12PanelLayout);
        pkcs12PanelLayout.setHorizontalGroup(
            pkcs12PanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pkcs12PanelLayout.createSequentialGroup()
                .addGroup(pkcs12PanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, pkcs12PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fileTextField, GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(browseButton))
                    .addGroup(pkcs12PanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(fileLabel))
                    .addGroup(pkcs12PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(passwordPkcs12Label))
                    .addGroup(GroupLayout.Alignment.TRAILING, pkcs12PanelLayout.createSequentialGroup()
                        .addContainerGap(270, Short.MAX_VALUE)
                        .addComponent(addPkcs12Button))
                    .addGroup(pkcs12PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pkcs12PasswordField, GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pkcs12PanelLayout.setVerticalGroup(
            pkcs12PanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, pkcs12PanelLayout.createSequentialGroup()
                .addComponent(fileLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pkcs12PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(browseButton)
                    .addComponent(fileTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordPkcs12Label)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pkcs12PasswordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addPkcs12Button)
                .addGap(70, 70, 70))
        );

        pkcs12PanelLayout.linkSize(SwingConstants.VERTICAL, new Component[] {addPkcs12Button, browseButton, fileTextField, pkcs12PasswordField});

        certificatejTabbedPane.addTab("PKCS#12", pkcs12Panel);

        driverLabel.setText("Driver");

        driverButton.setText("...");
        driverButton.setMargin(new Insets(2, 5, 2, 5));
        driverButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                driverButtonActionPerformed(evt);
            }
        });

        passwordPkcs11Label.setText("PIN Code");

        addPkcs11Button.setText("Add to keystore");
        addPkcs11Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addPkcs11ButtonActionPerformed(evt);
            }
        });

        GroupLayout pkcs11PanelLayout = new GroupLayout(pkcs11Panel);
        pkcs11Panel.setLayout(pkcs11PanelLayout);
        pkcs11PanelLayout.setHorizontalGroup(
            pkcs11PanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pkcs11PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pkcs11PanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(pkcs11PasswordField, GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                    .addComponent(driverLabel)
                    .addComponent(passwordPkcs11Label)
                    .addGroup(pkcs11PanelLayout.createSequentialGroup()
                        .addComponent(driverComboBox, 0, 336, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(driverButton))
                    .addComponent(addPkcs11Button, GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pkcs11PanelLayout.setVerticalGroup(
            pkcs11PanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pkcs11PanelLayout.createSequentialGroup()
                .addComponent(driverLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pkcs11PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(driverButton)
                    .addComponent(driverComboBox, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordPkcs11Label)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pkcs11PasswordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addPkcs11Button)
                .addGap(58, 58, 58))
        );

        pkcs11PanelLayout.linkSize(SwingConstants.VERTICAL, new Component[] {addPkcs11Button, driverButton, driverComboBox, pkcs11PasswordField});

        certificatejTabbedPane.addTab("PKCS#11", pkcs11Panel);

        GroupLayout cryptoApiPanelLayout = new GroupLayout(cryptoApiPanel);
        cryptoApiPanel.setLayout(cryptoApiPanelLayout);
        cryptoApiPanelLayout.setHorizontalGroup(
            cryptoApiPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );
        cryptoApiPanelLayout.setVerticalGroup(
            cryptoApiPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        certificatejTabbedPane.addTab("CrytoAPI", cryptoApiPanel);

        useClientCertificateCheckBox.setText("Use client certificate");
        useClientCertificateCheckBox.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        useClientCertificateCheckBox.setMargin(new Insets(0, 0, 0, 0));
        useClientCertificateCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                useClientCertificateCheckBoxActionPerformed(evt);
            }
        });

        textLabel.setText("<html><body><p> Add your keystore and select the desired certificate.</p>"
        	+ "<p>Certificate setting will not be stored in options and you will need to enable "
        	+ "certificate next time you restart Paros.</p></body></html>");

        certificateLabel.setText("Active certificate");

        certificateTextField.setEnabled(false);

        showActiveCertificateButton.setText("->");
        showActiveCertificateButton.setActionCommand(">");
        showActiveCertificateButton.setEnabled(false);
        showActiveCertificateButton.setMargin(new Insets(2, 2, 2, 2));
        showActiveCertificateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                showActiveCertificateButtonActionPerformed(evt);
            }
        });

        GroupLayout certificatePanelLayout = new GroupLayout(certificatePanel);
        certificatePanel.setLayout(certificatePanelLayout);
        certificatePanelLayout.setHorizontalGroup(
            certificatePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(certificatePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(certificatePanelLayout.createSequentialGroup()
                    .addComponent(textLabel, 0, 0, Short.MAX_VALUE)
                    .addContainerGap())
                .addGroup(certificatePanelLayout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addGroup(certificatePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(certificatejTabbedPane, GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                        .addGroup(certificatePanelLayout.createSequentialGroup()
                            .addGroup(certificatePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(useClientCertificateCheckBox)
                                .addComponent(certificateLabel)
                                .addGroup(GroupLayout.Alignment.TRAILING, certificatePanelLayout.createSequentialGroup()
                                    .addComponent(certificateTextField, GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(showActiveCertificateButton)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                            .addContainerGap()))))
        );
        certificatePanelLayout.setVerticalGroup(
            certificatePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(certificatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(useClientCertificateCheckBox)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(certificatejTabbedPane, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(certificateLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(certificatePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(certificateTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(showActiveCertificateButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        certificatePanelLayout.linkSize(SwingConstants.VERTICAL, new Component[] {certificateTextField, showActiveCertificateButton});

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(certificatePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(certificatePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }
    
    private void keyStoreListMouseClicked(MouseEvent evt) {
    	// TODO add your handling code here:
    }
    
    private void showActiveCertificateButtonActionPerformed(ActionEvent evt) {
    	// TODO add your handling code here:
    }

    private void addPkcs11ButtonActionPerformed(ActionEvent evt) {
    	// TODO add your handling code here:
    }

    private void driverButtonActionPerformed(ActionEvent evt) {
    	// TODO add your handling code here:
    }

    private void addPkcs12ButtonActionPerformed(ActionEvent evt) {
    	// TODO add your handling code here:
    }

    private void browseButtonActionPerformed(ActionEvent evt) {
    	// TODO add your handling code here:
    }

    private void showAliasButtonActionPerformed(ActionEvent evt) {
    	// TODO add your handling code here:
    }

    private void setActiveButtonActionPerformed(ActionEvent evt) {
    	// TODO add your handling code here:
    }

    private void deleteButtonActionPerformed(ActionEvent evt) {
    	// TODO add your handling code here:
    }

    private void useClientCertificateCheckBoxActionPerformed(ActionEvent evt) {
    	// TODO add your handling code here:
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KeyStoreNetBeans().setVisible(true);
            }
        });
    }    
}
