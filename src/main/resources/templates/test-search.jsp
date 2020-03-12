<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>

    <title> Test Search </title>
</head>
<body>
    <div id="wrapper">
        <div id="header">
            <h2>JUST A HEADER</h2>
        </div>
    </div>

    <div id="container">
        <div id="content">

            <table>
                <tr>
                    <th>Section Name</th>
                </tr>
                <c:forEach var="tempSection" items="${sections}">
                   <tr> ${tempSection.name}</tr>
            </table>

        </div>
    </div>

</body>

</html>