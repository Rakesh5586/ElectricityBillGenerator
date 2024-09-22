<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>NewRegistration</title>
    <style>
        .head
        {
            border: 2px solid;
            border-radius: 10px;
            width: max-content;
            padding: 40px;
            margin: auto;
            margin-top: 60px;
            background-color: azure;
            text-align: center;
            font-size: large;
        }
        body{
            background-color: rgb(200, 204, 204);
        }
    </style>
</head>
<body>
    <div class="head">
            <h1>Electricity Bill Form</h1>
            <form action  = "/saveUrl" method  ="POST">
                <label>Consumer Name:</label>
                <input type ="text" name ="cname"><p></p>
                <label>Current Reading:</label>
                <input type ="text" name ="crd"><p></p>
                <label>Previous Reading:</label>
                <input type ="text" name ="prd"><p></p>
                <input type ="submit" value="SaveBill">
          </form>
    </div>
</body>
</html>