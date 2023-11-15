<html>

<head>

</head>

<body>
<h3>Book Details</h3>
<form action="book">

Book Id:<input type="text" name="id"><br>

<input type="submit" value="search"/>

</form>

<hr/>
<%-- here book.id means book is the in the controller and the id means we mantioned the variable in the entity book class --%>
Book Id: ${book.id}<br/>
Book Author: ${book.author }<br/>
Book Name: ${book.name}<br/>
Book Price: ${book.price}<br/>

</body>
</html>