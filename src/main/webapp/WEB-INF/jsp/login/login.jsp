<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE>Welcome Spring MVC</TITLE>
  <META NAME="Generator" CONTENT="EditPlus">
  <META NAME="Author" CONTENT="">
  <META NAME="Keywords" CONTENT="">
  <META NAME="Description" CONTENT="">
  <link href="<c:url value="/resources/css/main.css"/>/resources/css/main.css" rel="stylesheet" type="text/css">
 </HEAD>

 <BODY>
	<div class="main">
		<div class="one">
			<div class="register">
		    <h3>Sign in to your account.</h3>
	          	<form id="login-form" action="authenticate.do" method="post">
		            <div>
		              <label for="email">Email</label>
		              <input type="text" id="logonId" name="logonId" spellcheck="false" placeholder="xyz@xyz.com"/>
		            </div>
		            
		            <div>
		              <label for="fname">Password</label>
		              <input type="text" id="password" name="password" spellcheck="false" placeholder="Password"/>
		            </div>
		             <div>
	              		<label></label>
	              		<input type="submit" value="Submit" id="login" class="button"/>
	            	</div>
	            </form>
	            <span style="margin-left:50%">Not a registered user? <a href="regform.do">Sign up now</a></span>
          </div>
		</div>
	</div>
 </BODY>
</HTML>
