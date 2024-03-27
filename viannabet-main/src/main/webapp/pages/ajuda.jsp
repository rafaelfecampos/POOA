<!DOCTYPE html>

<%@page import="br.edu.vianna.game.model.Usuario" %>

<html lang="en"> 
  <head> 
    <meta charset="utf-8" />  
    <!-- Change for better search engine indexing -->  
    <title>Web Site</title>  
    <meta name="title" content="Web site" />  
    <meta name="description" content="Your Web site description here" />  
    <meta name="keywords" content="Your Web site keywords here" />  
    <meta name="subject" content="Your Web Site subject here" />  
    <meta name="copyright" content="Your company or organization" />  
    <meta name="robots" content="All" />  
    <meta name="abstract" content="Site description here" />  
    <meta name="MSSmartTagsPreventParsing" content="true" />  
    <link id="theme" rel="stylesheet" type="text/css" href="style.css" title="theme" />  
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto+Condensed:300|Roboto+Condensed|Roboto+Condensed:300|Roboto+Condensed:300|Roboto+Condensed:300|Roboto+Condensed:300" type="text/css" />  
	<script type="text/javascript" language="javascript" src="js/jquery-1.8.1.min.js"></script>  
	<script type="text/javascript" language="javascript" src="js/scripts.js"></script>  
	<script type="text/javascript" language="javascript" src="js/theme.js"></script>  
	<script type="text/javascript" language="javascript" src="js/custom.js"></script>  
    <!-- Add your custom script here --> 
  </head>  
  <body>
    <div id="wrapper"> 
      <div class="bg"></div>  
      <div class="row"> 
        <div id="container"> 
          <div id="page"> 
            <div id="main"> 
              <section class="home">

                <div class="logindv">
                  <h1>Em que posso lhe ajudar </h1>
                  <%
                  Usuario u = (Usuario)session.getAttribute("user");
                  %>
                  <h2> <%= u.getNome() %> </h2>
                  <div class="bodydv">

                  </div>
                </div>

            </section>
            </div>  
            <div class="clear" style="height:60px"></div> 
          </div> 
        </div> 
      </div> 
    </div>
  </body> 
</html>
