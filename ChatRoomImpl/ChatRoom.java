import java.util.Vector;
import java.util.Hashtable;
import java.util.Enumeration;


/** Cette classe est la classe repr�sentative d'un service de discussion, commun�ment appel� <B>"Chat"</B>. <BR>
    Elle expose un certain nombre de m�thodes publiques lui permettant d'avoir les fonctionalit�s de base 
    d'un salon de discussion (<B>"ChatRoom"</B>).
 *  @version 1.0 02/2008
 *  @since 1.0 02/2008
 *  @author Cheikh BA
 */
 
public class ChatRoom extends Hashtable{

	
/** Cette m�thode, lanc�e qu'une seule fois par le serveur, permet d'initialiser un ChatRoom, en cr�ant (loggant) l'utilisateur sp�cial ROOM (qui repr�sente le salon de discussion).
 */
public ChatRoom(){
	
	System.out.println("Lancement du ChatRoom :.......... status --> " + this.login("ROOM"));
}

	
/** Cette m�thode renvoie le nombre d'utilisateurs en ligne dans le ChatRoom.
 *  @return le nombre de "chateurs" en ligne.
 */
public int getNumberOfUsersOnline(){
	return this.size();
}

private boolean isOnline(String id){
	return this.containsKey(id);
}

	
/** Cette m�thode permet � l'utilisateur id de se logger (d'�tre en ligne)
 *@param id l'identificateur de l'utilisateur
 *@return vrai si le log s'est bien fait,faux sinon (s'il s'�tait d�j� logg� par exemple.)
 */
public boolean login(String id){
	boolean status;
	
	if (this.isOnline(id)) return false;

	this.put(id, new Vector());
	return true;
}

/** Cette m�thode permet � l'utilisateur id de se d�logger (d'�tre hors ligne)
 *@param id l'identificateur de l'utilisateur
 *@return vrai si le logout s'est bien fait, faux sinon (s'il n'�tait pas en ligne par exemple.)
 */
public boolean logout(String id){
	boolean status;
	
	if (this.isOnline(id)){
		this.remove(id);
		return true;
	}

	return false;
}

/** Cette m�thode permet d'obtenir la liste des utilisateurs en ligne
 *@return une chaine de caract�re (String) contenant la liste des logins des utilisateurs en ligne, s�par�e par ":"
 *<BR><B>Exemple : </B> si USER1 et USER2 sont en ligne, la m�thode renvoie ":USER1:USER2:"
 */
public String getUsersOnline(){
	
	String usersList = ":"; 
		
	for (Enumeration e = this.keys() ; e.hasMoreElements() ;) {
        	usersList += "" + (String)e.nextElement() + ":";
        }
	
	return usersList;
}

/**Cette m�thode permet � l'utilisateur id de r�cup�rer ses messages.
 *@param id l'identificateur de l'utilisateur
 *@return Un objet de type Vector contenant les messages de l'utilisateur id
 */
public Vector getMessages(String id){
	
	Vector messages = null;
	
	if (this.isOnline(id)) {
		messages = ( (Vector) ((Vector) this.get(id)).clone());
		((Vector)this.get(id)).clear();
	}
	
	return messages;
}

/**Cette m�thode permet � un utilisateur d'envoyer un messsage � un autre utilisateur.
 *@param id_sender l'identificateur de l'�metteur du message
 *@param id_receiver l'identificateur du destinataire du message
 *@param message le message � envoyer
 *@return renvoie un objet de type Vector contenant les messages de l'utilisateur id
 */
public boolean sendMessage(String id_sender, String id_receiver, String message){

	boolean status;

	if (! "ROOM".equals(id_receiver)) { // le destinataire n'est pas l'utilisateur ROOM
		  if (! this.isOnline(id_sender) || ! this.isOnline(id_receiver)) 
			  status = false;
		  else {
			  status = true;
			  ((Vector)this.get(id_receiver)).add(("" + id_sender + "-->" + id_receiver + ":" + message));
		  }
	}
	else { // le destinataire est l'utilisateur ROOM
		if (! this.isOnline(id_sender)) 
			  status = false;
		  else {
			  status = true;
			  
			  for (Enumeration e = this.keys(); e.hasMoreElements() ;)
			  		((Vector)this.get(e.nextElement())).add(("" + id_sender + "-->" + "ROOM" + ":" + message));
		  }
	}	       
	
	return status;
}

}