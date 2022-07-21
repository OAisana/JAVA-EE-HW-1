<%@ page import="java.util.ArrayList" %>
<%@ page import="kz.bitlab.bootcamp.db.Computer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="head.jsp"%>
</head>
<body>
<%@include file="navbar.jsp"%>
<div class="container" style="min-height: 800px;">
    <div class="row mt-3">
        <div class="col-12">
            <table class="table table-striped">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>NAME</th>
                    <th>PRICE</th>
                    <th>AMOUNT</th>
                    <th width="10%">DETAILS</th>
                </tr>
                </thead>
                <tbody>
                <%
                    ArrayList<Computer> computers = (ArrayList<Computer>) request.getAttribute("kompukterler");
                    if(computers!=null){
                        for(Computer comp : computers){
                %>
                <tr>
                    <td>
                        <% out.print(comp.getId()); %>
                    </td>
                    <td>
                        <% out.print(comp.getName()); %>
                    </td>
                    <td>
                        <% out.print(comp.getPrice()); %>
                    </td>
                    <td>
                        <% out.print(comp.getAmount()); %>
                    </td>
                    <td>
                        <a href="/details?id=<% out.print(comp.getId());%>" class="btn btn-success btn-sm">DETAILS</a>
                    </td>
                </tr>
                <%
                        }
                    }
                %>
                </tbody>
            </table>
        </div>
    </div>
</div>
<%@include file="footer.jsp"%>
</body>
</html>
