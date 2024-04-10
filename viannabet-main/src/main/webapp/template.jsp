<!DOCTYPE html>

<%@page import="br.edu.vianna.game.model.User" %>

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
    <header> 
      <div id="top"> 
        <div class="bg"></div>  
        <div class="row"> 
          <div id="logo"></div>

          <% User u = (User)session.getAttribute("user");  %>

          <nav> 
            <div id="hmenu"> 
              <ul> 
                <li> 
                  <a href="/master">Home</a>
                </li>  
                <li>
                <% if (u == null){ %>
                     <a href="/master?ac=login">Login</a>
                  <% }else{ %>
                    <a href="/master?ac=logout">Sair</a>
                  <% } %>
                </li>
                <% if (u == null){ %>
                     <li>
                       <a href="/master?ac=equipe">Cadastre-se</a>
                     </li>
                 <% } %>
                 <li>
                   <a href="/master?ac=ajuda">Ajuda</a>
                 </li>
              </ul> 
            </div> 
          </nav>  
          <div class="clear"></div> 
        </div> 
      </div>  
      <div id="header-wrapper"> 
        <div class="bg"></div>  
        <div class="row"> 
          <div id="header"> 
            <div id="tagline"> 
              <h1>We Simplify Your Way To International Market</h1>  
              <input type="button" class="cta pie" value="SEE HOW..." /> 
            </div> 
          </div> 
        </div> 
      </div> 
    </header>  
    <div id="wrapper"> 
      <div class="bg"></div>  
      <div class="row"> 
        <div id="container"> 
          <div id="page"> 
            <div id="main"> 
              <section class="home">

                <%
                 String pg = request.getParameter("pg");
                 pg = (pg == null)? "home" : pg;
                 pg = "/pages/"+pg+".jsp";
                 %>

              <jsp:include page="<%= pg %>" />

             <!--   <div class="logindv">
                  <h1>HOME</h1>
                  <div class="bodydv">

                  </div>
                </div> -->

            </section>
            </div>  
            <div class="clear" style="height:60px"></div> 
          </div> 
        </div> 
      </div> 
    </div>  
    <footer id="footer"> 
      <div class="bg"></div>  
      <div class="content"> 
        <div class="group"> 
          <div class="col span_1_of_3"> 
            <h2>Links</h2>  
            <div class="vmenu"> 
              <ul> 
                <li>
                  <a href="#">Lorem ipsum</a>
                </li>  
                <li>
                  <a href="#">Vivamus</a>
                </li>  
                <li>
                  <a href="#">Suspendisse</a>
                </li> 
              </ul> 
            </div> 
          </div>  
          <div class="col span_1_of_3"> 
            <h2>About Us</h2>  
            <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec.</p> 
          </div>  
          <div class="col span_1_of_3"> 
            <h2>Contact</h2>  
            <p>Your Company Ltd
              <br /> 10 Somewhere Street, WWW Design City
              <br /> 
            </p> 
          </div> 
        </div>  
        <div class="clear"></div>  
        <div class="baseline"> 
          <div style="float:left;margin-top:7px"> 
            <p> 
              <!-- Update your organization copyright --> Copyright - 2016 - Your Organization | All Rights Reserved | 
              <!-- This template is free. In respect with copyright, please keep this credit link visible and unmodified (except for translation purposes) --> Theme created with 
              <a href="http://www.dotemplate.com">doTemplate</a> free web template builder
            </p> 
          </div>  
          <ul class="social-links" style="float:right"> 
            <li> 
              <a href="#" rel="nofollow" style="background-image:url('images/facebook.png')" title="Be a fan on Facebook"></a> 
            </li>  
            <li> 
              <a href="#" rel="nofollow" style="background-image:url('images/twitter.png')" title="Follow us on Twitter"></a> 
            </li>  
            <li> 
              <a href="#" style="background-image:url('images/googleplus.png')" title="Circle us on Google+"></a> 
            </li>  
            <li> 
              <a href="#" rel="nofollow" style="background-image:url('images/rss.png')" title="RSS Feed"></a> 
            </li> 
          </ul>  
          <div class="clear"></div> 
        </div> 
      </div> 
    </footer> 
  </body> 
</html>
