<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> Registration</TITLE>
  <META NAME="Generator" CONTENT="EditPlus">
  <META NAME="Author" CONTENT="">
  <META NAME="Keywords" CONTENT="">
  <META NAME="Description" CONTENT="">
  <link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet" type="text/css">
	
  <script src="https://code.jquery.com/jquery-3.3.1.min.js"  integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="  crossorigin="anonymous"></script>
 
 </HEAD>

 <BODY>
   <div class="main">
      <div class="one">
        <div class="register">
          <h3>Create your account</h3>
          <form id="reg-form" action="register.do" method="post">
            <div>
              <label for="email">Email</label>
              <input type="text" id="logonId" name="logonId" spellcheck="false" placeholder="xyz@xyz.com"/>
            </div>
            
            <div>
              <label for="fname">First Name</label>
              <input type="text" id="firstName" name="firstName" spellcheck="false" placeholder="First Name"/>
            </div>
            <div>
              <label for="lname">Last Name</label>
              <input type="text" id="lastName" name="lastName" spellcheck="false" placeholder="Last Name"/>
            </div>
            
            <div>
              <label for="password">Password</label>
              <input type="password" id="password" name="password" placeholder="Password"/>
            </div>
            <div>
              <label for="password-again">Repeat Password</label>
              <input type="password" id="password-again" name="repeatPwd" placeholder="Repeat-Password"/>
            </div>
            <div>
              <label for="sQuestion">Security Question</label>
              <select id="sQuestion" name="sQuestion">
              	<option value="What was your childhood nickname?">What was your childhood nickname?</option>
              	<option value="What is the name of your favorite childhood friend?">What is the name of your favorite childhood friend?</option>
              	<option value="What is your favorite team?">What is your favorite team?</option>
              	<option value="Who is your childhood sports hero?">Who is your childhood sports hero?</option>
              	<option value="In what town was your first job?">In what town was your first job?</option>
              </select>
            </div>
            <div>
              <label for="sAnswer">Security Answer</label>
              <input type="password" id="sAnswer" name="sAnswer" placeholder="Securtiy Answer"/>
            </div>
            
            <div>
              <label></label>
              <input type="submit" value="Create Account" id="create-account" class="button"/>
            </div>
          </form>
        </div>
      </div>
      
    </div>
    <script type="text/javascript">
    $(document).ready(function(){
    	  var placeholder = null;
    	  $('input[type=text]').focus(function(){
    	    placeholder = $(this).attr("placeholder");
    	    $(this).attr("placeholder","");
    	  });
    	  $('input[type=text]').blur(function(){
    	    $(this).attr("placeholder", placeholder);
    	  });
    	});
    </script>
 </BODY>
</HTML>
