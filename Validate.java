package package1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validate
 */
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Validate() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		void function validusername()
		{
		if(document.Form.empno.value == "" || 
		   isNaN( document.myForm.empno.value )  )
		         {
		            alert( "Please provide a valid number " );
		         }
		}
		function validemp()
		{
		if( document.myForm.employname.value == "" ||
		    !document.myForm.employname.value.match(/^[a-zA-Z]+$/)  )
		         {
		            alert( "Please provide a valid employee name " );                     
		         }
		}
		function validnum()
		{
		if(document.myForm.num.value == "" ||
		   isNaN( document.myForm.num.value )  )
		         {
		            alert( "Please provide a valid phone number " );
		         }
		}
		function validemail()
		{
		    if ( document.myForm.email.value == "" ||
		    		!document.myForm.email.value.match(/\S+@\S+.\S) )	
		         {
		            alert( "Please provide a valid email " );                     
		         }
		}

	}

}
