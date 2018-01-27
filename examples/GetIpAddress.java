
Program :

import java.net.*;

public class GetIpAddress 
{ 
    public static void main(String args[])
	{ 
        try 
		{
            InetAddress ipAddr = InetAddress.getLocalHost();
            System.out.println("\nIP address of the machine: " +ipAddr.getHostAddress());
        } 
		catch (UnknownHostException ex) 
		{
            ex.printStackTrace();
        }
    }
}

Output :


IP address of the machine: 192.168.1.36
