/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientapp;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;

import controlleurs.CtrUser;
import localhost.axis.services.Chatroom.*;
 /*
 * @author Chris
 */
public class Client1 extends javax.swing.JFrame {

	static ChatRoom image_locale;
	static ChatRoomServiceLocator service;

	
	
    public static ChatRoom getImage_locale() {
		return image_locale;
	}



	public static ChatRoomServiceLocator getService() {
		return service;
	}



	public static javax.swing.JTextField getTxtLog() {
		return txtLog;
	}

    

	public static javax.swing.JPasswordField getTxtMDP() {
		return txtMDP;
	}



	/**
     * Creates new form Client1
     */
    public Client1() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")                        
    private void initComponents() {

        panCon = new javax.swing.JPanel();
        labLog = new javax.swing.JLabel();
        labMDP = new javax.swing.JLabel();
        txtLog = new javax.swing.JTextField();
        txtMDP = new javax.swing.JPasswordField();
        btAnnuler = new javax.swing.JButton();
        btYes = new javax.swing.JButton();
        lb_url = new javax.swing.JLabel();
        lb_ins=new javax.swing.JLabel();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));

        panCon.setBackground(new java.awt.Color(204, 204, 255));
        panCon.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true), "Connectez vous!", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bauhaus 93", 0, 18))); // NOI18N

        labLog.setFont(new java.awt.Font("Tekton Pro", 0, 17)); // NOI18N
        labLog.setText("Login");

        labMDP.setFont(new java.awt.Font("Tekton Pro", 0, 17)); // NOI18N
        labMDP.setText("Mot de passe");

        txtLog.setBackground(new java.awt.Color(204, 204, 204));
        txtLog.setMinimumSize(new java.awt.Dimension(20, 23));

        txtMDP.setBackground(new java.awt.Color(204, 204, 204));
        txtMDP.setMinimumSize(new java.awt.Dimension(20, 23));
      
      

        btAnnuler.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        btAnnuler.setText("Annuler");
        btAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnnulerActionPerformed(evt);
            }
        });
     
       
        btYes.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        btYes.setText("Connecter");
        btYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btYesActionPerformed(evt);
            }
        });
                

        lb_url.setText("Volet administration");
        lb_url.setCursor(new Cursor(Cursor.HAND_CURSOR));
        lb_ins.setText("S'inscrire");
        lb_ins.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
       		        
        javax.swing.GroupLayout panConLayout = new javax.swing.GroupLayout(panCon);
        panCon.setLayout(panConLayout);
        panConLayout.setHorizontalGroup(
        	
            panConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panConLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                		.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panConLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lb_url))
                		.addGroup(panConLayout.createSequentialGroup()
                        .addComponent(btAnnuler)
                        .addGap(67, 67, 67)
                        .addComponent(btYes))
                    .addGroup(panConLayout.createSequentialGroup()
                        .addGroup(panConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labLog)
                            .addComponent(labMDP))
                        .addGap(47, 47, 47)
                        .addGroup(panConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMDP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addComponent(lb_ins)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        panConLayout.setVerticalGroup(
            panConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panConLayout.createSequentialGroup()
            	.addContainerGap()
                .addComponent(lb_url)
                .addGap(18, 18, 18)
                .addComponent(lb_ins)
                .addGroup(panConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labLog)
                    .addComponent(txtLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(panConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labMDP)
                    .addComponent(txtMDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(panConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAnnuler)
                    .addComponent(btYes))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(panCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
		
	
		
	}                       

    protected void btYesActionPerformed(ActionEvent evt) {
    	
    	CtrUser.checkLogPass();
    	if (CtrUser.getCheckMethodeLog()==1)
    	{
		//Si nous cliquons sur btYes (connecter), la méthode login(String b) du web serviceest exécutée
		try
		{
			service = new ChatRoomServiceLocator();
			image_locale = service.getChatRoom();
			
			image_locale.login(txtLog.getText());
			CtrUser.loginEffect();
			
			//utilisateur connecté donc ouverture de la 2e GUI
			
			this.setVisible(false);
			new ClientGUI2().setVisible(true);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
    	}
    	else
    	{
    		viderCases();
    	}
		}
		
	

    public void viderCases()
    {
    	txtLog.setText("");
        txtMDP.setText("");
    }

	private void btAnnulerActionPerformed(java.awt.event.ActionEvent evt) {                                          
       
		viderCases();
    }                                       

                                         

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Client1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	
                Client1 oo=new Client1();
                oo.setVisible(true);
                lb_url.addMouseListener(new MouseAdapter()
                {
                    //Click sur le lien
                    public void mouseClicked(MouseEvent e)
                    {
                    	oo.dispose();
                    	//ouverture de la GUI Admin
                    }
         
                    //Survol sur le lien
                    public void mouseEntered(MouseEvent e) {
                        javax.swing.JLabel label=(javax.swing.JLabel)e.getSource();
                        String plainText = label.getText();
                        //Sousligner le texte 
                        String urlText="<html><u>"+plainText+"</u></html>";
                        lb_url.setText(urlText);
                    }
         
                    //Quitte la zone du lien    
                    public void mouseExited(MouseEvent e) {
                        javax.swing.JLabel label=(javax.swing.JLabel)e.getSource();
                        String plainText = label.getText();
                        //Texte sans souslignage
                        String urlText="<html>"+plainText+"</html>";
                        lb_url.setText(urlText);
                    }
                });
                
                
                
                lb_ins.addMouseListener(new MouseAdapter()
                {
                    //Click sur le lien
                    public void mouseClicked(MouseEvent e) {oo.dispose();new GUIInscription().setVisible(true);;}
         
                    //Survol sur le lien
                    public void mouseEntered(MouseEvent e) {
                        javax.swing.JLabel label=(javax.swing.JLabel)e.getSource();
                        String plainText = label.getText();
                        //Sousligner le texte 
                        String urlText="<html><u>"+plainText+"</u></html>";
                        lb_ins.setText(urlText);
                    }
         
                    //Quitte la zone du lien    
                    public void mouseExited(MouseEvent e) {
                        javax.swing.JLabel label=(javax.swing.JLabel)e.getSource();
                        String plainText = label.getText();
                        //Texte sans souslignage
                        String urlText="<html>"+plainText+"</html>";
                        lb_ins.setText(urlText);
                    }
                });
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btAnnuler;
    private javax.swing.JButton btYes;
    private javax.swing.JLabel labLog;
    private javax.swing.JLabel labMDP;
    private javax.swing.JPanel panCon;
    private static javax.swing.JTextField txtLog;
    private static JPasswordField txtMDP;
    private static  javax.swing.JLabel lb_url;
    private static javax.swing.JLabel lb_ins;
    // End of variables declaration                   
}
