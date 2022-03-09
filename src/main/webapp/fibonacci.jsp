<%@ page import ="com.CEN4028.web.Utilities" %>
<%@ page import ="com.CEN4028.web.Fibonacci" %>
<%@ page import ="java.util.Random" %>

<html>

<body>

<%! Random rnd = new Random();

int n = rnd.nextInt(90);
com.CEN4028.web.Fibonacci fibCalculator = new com.CEN4028.web.Fibonacci();


%>



<%= n%> is a random number between 0 and 90 inclusive

The fibonacci number for this index is <%= fibCalculator.fibonacci(n)%>

 
 
</body>


</html>