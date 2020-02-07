/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360httpurlconnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author azhra
 */
public class CIT360HTTPURLConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        
        new CIT360HTTPURLConnection();
    }
         public CIT360HTTPURLConnection()
  {
    try
    {
      // local url to go after 
      //String myUrl = "http://localhost/phpmyadmin/sql.php?server=1&db=acme&table=inventory&pos=0";
      //Trying a website. Edit: Failiure  
      //String myUrl = "https://paizo.com/pathfinder/rules/downloads";
      //Try another website. Edit: Success  
      String myUrl = "https://openweathermap.org/api";
      String results = doHttpUrlConnectionAction(myUrl);
      System.out.println(results);
    }
    catch (Exception e)
    {
      
    }
  }

  /**
   * Should return the inventory DB from the acme server
   * EDIT: It seems to go after everything
   * 
   * @param desiredUrl
   * @return
   * @throws Exception
   */
  private String doHttpUrlConnectionAction(String desiredUrl)
  throws Exception
  {
    URL url = null;
    BufferedReader reader = null;
    StringBuilder stringBuilder;

    try
    {
      // create the HttpURLConnection
      url = new URL(desiredUrl);
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      
      // just want to do an HTTP GET here. No posting.
      connection.setRequestMethod("GET");
                  
      // give it 15 seconds to respond. This is great to set in case no response.
      connection.setReadTimeout(15*1000);
      connection.connect();

      // read the output from the server
      reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
      stringBuilder = new StringBuilder();

      String line = null;
      while ((line = reader.readLine()) != null)
      {
        stringBuilder.append(line + "\n");
      }
            
      return stringBuilder.toString();
    }
    catch (Exception e)
    {
      e.printStackTrace();
      throw e;
    }
    finally
    {
      // close the reader; this can throw an exception too, so
      // wrap it in another try/catch block.
      if (reader != null)
      {
        try
        {
          reader.close();
        }
        catch (IOException e)
        {
          e.printStackTrace();
        }
      }
    }
  }
        
}
