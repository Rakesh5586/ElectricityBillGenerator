<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>homePage</title>
    <style>
        body{
            background-color: aquamarine;
        }
        .home
        {
           border: 2px solid;
           border-radius: 15px;
           width: max-content;
           height: 300px;
           padding: 20px;
           margin: auto;
           text-align: center;
           background-color: antiquewhite;
           margin-top: 60px;
        }
        .link
        {
           border: 1px solid;
           padding: 5px;
           display: flex;
           justify-content: space-around;
           background-color: aqua;
           
        }
        a:hover{
            color: black;
            background-color: rgb(82, 82, 18);
            
        }
        a{
            text-decoration: none;
            color: black;
            font-size: x-large;
        }
    </style>
</head>
<body>
    <div class="home">
        <h1 style="color: rgb(40, 52, 228);">ELECTRICITY BILL APPLICATION</h1>
        <div class="link">
        <a href="/regisbillUrl">Add New Bill</a>
        <a href="/viewAllUrl">View All Bill</a>
       </div>
    </div>   
</body>
</html>