package clientapp;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.rmi.RemoteException;

/**
 *
 * @author Chris
 */
public class ChatWindows extends javax.swing.JFrame implements java.awt.event.MouseListener {
	
    /**
     * Creates new form ChatWindows
     */
    public ChatWindows() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panelDiscussion = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMessagesRecus = new javax.swing.JTextArea();
        txtMessageAEnvoyer = new javax.swing.JTextField();
        btEnvoyer = new javax.swing.JButton();
        btAnnuler = new javax.swing.JButton();
 
        nomInterlocuteur = new javax.swing.JLabel();
    
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelDiscussion.setBackground(new java.awt.Color(204, 204, 255));
        panelDiscussion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Discussion", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Bauhaus 93", 0, 24))); // NOI18N

        txtMessagesRecus.setColumns(20);
        txtMessagesRecus.setRows(5);
        txtMessagesRecus.setEditable(false);
        txtMessagesRecus.addMouseListener(this);
        jScrollPane1.setViewportView(txtMessagesRecus);

        btEnvoyer.setBackground(new java.awt.Color(153, 153, 153));
        btEnvoyer.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        btEnvoyer.setText("Envoyer");
        btEnvoyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnvoyerActionPerformed(evt);
            }
        });


        
        btAnnuler.setBackground(new java.awt.Color(153, 153, 153));
        btAnnuler.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        btAnnuler.setForeground(new java.awt.Color(51, 51, 51));
        btAnnuler.setText("Annuler");
        btAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnnulerActionPerformed(evt);
            }
        });

        nomInterlocuteur.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        nomInterlocuteur.setText(ClientGUI2.aQuiParler.toString());

        javax.swing.GroupLayout panelDiscussionLayout = new javax.swing.GroupLayout(panelDiscussion);
        panelDiscussion.setLayout(panelDiscussionLayout);
        panelDiscussionLayout.setHorizontalGroup(
            panelDiscussionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDiscussionLayout.createSequentialGroup()
                .addGroup(panelDiscussionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDiscussionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDiscussionLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(panelDiscussionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelDiscussionLayout.createSequentialGroup()
                                .addComponent(btEnvoyer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btAnnuler))
                            
                            .addComponent(txtMessageAEnvoyer, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDiscussionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nomInterlocuteur)
                .addGap(31, 31, 31))
        );
        panelDiscussionLayout.setVerticalGroup(
            panelDiscussionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDiscussionLayout.createSequentialGroup()
                .addComponent(nomInterlocuteur)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMessageAEnvoyer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDiscussionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEnvoyer)
                    .addComponent(btAnnuler)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDiscussion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDiscussion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void btAnnulerActionPerformed(java.awt.event.ActionEvent evt) {                                          
    	this.dispose();
    	
    }                                         

    
 // m�thode servant � envoyer un message d�s que l'on clique sur "Envoyer"
    private void btEnvoyerActionPerformed(java.awt.event.ActionEvent evt) {   
    	message=txtMessageAEnvoyer.getText();
    	
    	nomInterlocuteurPropre=nomInterlocuteur.getText();
    	
    
    	 try {
    		  
    		 Client1.image_locale.sendMessage(ClientGUI2.getLabUser().getText(),nomInterlocuteurPropre.replaceAll("[\\[\\]]",""),
    		 message);
    		
    		  } catch (RemoteException e) { // TODO Auto-generated catch block
    		  e.printStackTrace();
    		  System.out.println("test �chou�");}
    	 
    
    	 txtMessagesRecus.setText(txtMessagesRecus.getText()+"\n"+ClientGUI2.getLabUser().getText()+": "+message);
    	
    	 txtMessageAEnvoyer.setText("");
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
            java.util.logging.Logger.getLogger(ChatWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatWindows().setVisible(true);
            }
        });
      
    }

    //pour test sendmessage
	String message;
	
	
	String nomInterlocuteurPropre;
    // Variables declaration - do not modify  
	
    private javax.swing.JButton btAnnuler;
    private javax.swing.JButton btEnvoyer;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JLabel nomInterlocuteur;
    private javax.swing.JPanel panelDiscussion;
    private javax.swing.JTextField txtMessageAEnvoyer;
    private javax.swing.JTextArea txtMessagesRecus;
    
    

    
    // End of variables declaration                   
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		java.util.Vector messageR = null;
		try {
			
			/* ClientGUI2.getLabUser().getText() est le nom de l'utilisateur qui cherche 
			 * � recevoir les messages qu'on lui a ennvoyer
			 */
			
			messageR=Client1.getImage_locale().getMessages(ClientGUI2.getLabUser().getText());	
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			System.out.println("## Exception:" + e1);
			e1.printStackTrace();
		}
		
		//�criture du message re�u
		String str=messageR.toString();
		
		String strSC=str.replaceAll("[\\[]","");
		
		int endIndex=str.indexOf("-");
		String nomEmetteur=strSC.substring(0,endIndex);
		String nomEmetteurPurge= nomEmetteur.replace("-", "");
		
		int index=str.indexOf(":");
		int endIndex2=str.indexOf("]");
		String corpusMessage=strSC.substring(index,endIndex2);
		String corpusMessagePurge=corpusMessage.replace("]", "");
		
		String messageRecu=nomEmetteurPurge+": "+corpusMessagePurge;
	
		
		//String messageRec=str.replace("[\\[\\]\\-\\>\\'"+ClientGUI2.getLabUser().getText()+"]","");
		
		
		txtMessagesRecus.setText(
				txtMessagesRecus.getText()+"\n"
				//+"\n"+nomInterlocuteurPropre.replaceAll("[\\[\\]]","")
				+messageRecu);
		
	
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void mouseExited(MouseEvent e) {
		/*try {
			 p=Client1.getImage_locale().getMessages(ClientGUI2.getLabUser().getText());
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		
		
		//d�s qu'on re�oit un message la fen�tre de discussion s'ouvre
		/*if(p.isEmpty()==false)
		{
			new ChatWindows().setVisible(true);
		}*/
		
		 //txtMessagesRecus.setText(txtMessagesRecus.getText()+"\n"+p.toString());
		
		
		//String[] listMess = null;p.copyInto(listMess);
		 //System.out.println("liste   "+listMess.toString());
		 
		 
		/* for(int i=0;i<=listMess.length;i++)
		 {
		 txtMessagesRecus.setText(txtMessagesRecus.getText()+"\n"+listMess[i]);
		 }
		 */
		 
		 
		/*while (pp.hasMoreElements())
		{
			//pp.nextElement();
			System.out.println(pp.nextElement().toString());
		
		}*/
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
