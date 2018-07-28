import java.util.Vector;
import java.util.Hashtable;
import java.util.Enumeration;


/** Cette classe est la classe représentative d'un service de discussion, communément appelé <B>"Chat"</B>. <BR>
    Elle expose un certain nombre de méthodes publiques lui permettant d'avoir les fonctionalités de base 
    d'un salon de discussion (<B>"ChatRoom"</B>).
 *  @version 1.0 02/2008
 *  @since 1.0 02/2008
 *  @author Cheikh BA
 */
 
public class ChatRoom extends Hashtable{

	
/** Cette méthode, lancée qu'une seule fois par le serveur, permet d'initialiser un ChatRoom, en créant (loggant) l'utilisateur spécial ROOM (qui représente le salon de discussion).
 */
public ChatRoom(){
	
	System.out.println("Lancement du ChatRoom :.......... status --> " + this.login("ROOM"));
}

	
/** Cette méthode renvoie le nombre d'utilisateurs en ligne dans le ChatRoom.
 *  @return le nombre de "chateurs" en ligne.
 */
public int getNumberOfUsersOnline(){
	return this.size();
}

private boolean isOnline(String id){
	return this.containsKey(id);
}

	
/** Cette méthode permet à l'utilisateur id de se logger (d'être en ligne)
 *@param id l'identificateur de l'utilisateur
 *@return vrai si le log s'est bien fait,faux sinon (s'il s'était déjà loggé par exemple.)
 */
public boolean login(String id){
	boolean status;
	
	if (this.isOnline(id)) return false;

	this.put(id, new Vector());
	return true;
}

/** Cette méthode permet à l'utilisateur id de se délogger (d'être hors ligne)
 *@param id l'identificateur de l'utilisateur
 *@return vrai si le logout s'est bien fait, faux sinon (s'il n'était pas en ligne par exemple.)
 */
public boolean logout(String id){
	boolean status;
	
	if (this.isOnline(id)){
		this.remove(id);
		return true;
	}

	return false;
}

/** Cette méthode permet d'obtenir la liste des utilisateurs en ligne
 *@return une chaine de caractère (String) contenant la liste des logins des utilisateurs en ligne, séparée par ":"
 *<BR><B>Exemple : </B> si USER1 et USER2 sont en ligne, la méthode renvoie ":USER1:USER2:"
 */
public String getUsersOnline(){
	
	String usersList = ":"; 
		
	for (Enumeration e = this.keys() ; e.hasMoreElements() ;) {
        	usersList += "" + (String)e.nextElement() + ":";
        }
	
	return usersList;
}

/**Cette méthode permet à l'utilisateur id de récupérer ses messages.
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

/**Cette méthode permet à un utilisateur d'envoyer un messsage à un autre utilisateur.
 *@param id_sender l'identificateur de l'émetteur du message
 *@param id_receiver l'identificateur du destinataire du message
 *@param message le message à envoyer
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