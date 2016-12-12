        <%--
  Created by IntelliJ IDEA.
  User: Mec
  Date: 12/12/2016
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="com.mec.brandhini.Puppy,com.mec.brandhini.PuppyTest"%>

    <jsp:useBean id="Puppy" class="com.mec.brandhini.Puppy" scope="application" />
    <jsp:setProperty name="Puppy" property="name" value="${10*5}"/> <%-- works --%>
                                            <%-- value="${Puppy.name}"/> doesnt work --%>
                                    <%-- value="${com.mec.brandhini.Puppy.name}"/> doesnt work --%>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
Name of Person is : ${Puppy.name} OR
<jsp:getProperty name="Puppy" property="name" />

   Blah ${com.mec.brandhini.Puppy.a} blah

</body>
</html>

