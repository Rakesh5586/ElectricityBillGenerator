<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Spring MVC form tags</title>
</head>
 
<body>
    <h2>Edit Electric Bill Here</h2>
 
    <form:form action="/editsaveUrl" method = "GET">
        <table>
            <tr>
                <td>Consumer Id:</td>
                <td><form:input path="cid" /></td>
            </tr>
            <tr>
                <td>Consumer Name:</td>
                <td><form:input path="cname" /></td>
            </tr>
            <tr>
                <td>Current Reading:</td>
                <td><form:input path="crd" /></td>
            </tr>
            <tr>
                <td>Previous Reading:</td>
                <td><form:input path="prd" /></td>
            </tr>
            <tr>
                <td></td>
                <td><input type = "submit" value = "EditSave"></td>
            </tr>
        </table>
    </form:form>
 
</body>
</html>