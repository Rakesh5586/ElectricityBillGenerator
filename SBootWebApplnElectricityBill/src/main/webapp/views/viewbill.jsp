<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form" %>
<%@ taglib uri  = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>viewBill</title>
    <style>
         table  
         {
            background-color: aliceblue;
            font-size: x-large;
            width: 100%;
            height: 200px;
         }
         body
         {
              background-color: rgb(163, 168, 173);
         }
    </style>
</head>
<body>
    <div>
    <h1 style="color: rgb(13, 92, 92); text-align: center;">Display All Customer Details</h1>
    <table border="1">
    <tr>
        <th>CONSUMER ID</th>
        <th>CONSUMER NAME</th>
        <th>CURRENT READING</th>
        <th>PREVOIUS READING</th>
        <th>UNIT</th>
        <th>SERVICE CHARGE</th>
        <th>TOTAL BILL</th>
        <th colspan="2">Action</th>
    </tr>
    <c:forEach var = "bill" items = "${bills}">
        <tr>
            <td>${bill.cid}</td>
            <td>${bill.cname}</td>
            <td>${bill.crd}</td>
            <td>${bill.prd}</td>
            <td>${bill.unit}</td>
            <td>${bill.service_charge}</td>
            <td>${bill.total_bill}</td>
            <td><a href="/editUrl/${bill.cid}">Edit</a></td>
            <td><a href="/deleteUrl/${bill.cid}">Delete</a></td>
        </tr>
    </c:forEach>
    </table>
    </div>
</body>
</html>