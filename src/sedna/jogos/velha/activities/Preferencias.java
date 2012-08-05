package sedna.jogos.velha.activities;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class Preferencias extends PreferenceActivity {
	
	/*
	 * Na vers�o HONECOMB do Android, esta � uma velha forma de fazer
	 * prefer�ncias. A nova forma de criar prefer�ncias � atrav�s da classe
	 * android.preference.PreferenceFragment, para maiores detalhes consulte a
	 * documenta��o dispon�vel em: http://developer.android.com/reference/
	 * android/preference/PreferenceFragment.html
	 */
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      addPreferencesFromResource(R.xml.settings);
   }  
   
   /* para usar, fazer 
    * 
    * SharedPreferences sp=PreferenceManager.
getDefaultSharedPreferences(context);
String value=sp.getString("key","defaultvalue");
    */

}
