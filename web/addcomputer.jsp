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
    <div class="col-6 mx-auto">
      <%
        String success = request.getParameter("success");
        if(success!=null && success.equals("1")){
      %>
      <div class="alert alert-success alert-dismissible fade show" role="alert">
        Computer added successfully!
        <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
      </div>
      <%
        }
      %>
      <form action="/addcomputer" method="post">
        <div class="row mt-3">
          <div class="col-12">
            <input type="text" class="form-control" name="name" placeholder="Insert name">
          </div>
        </div>
        <div class="row mt-3">
          <div class="col-12">
            <input type="text" class="form-control" name="description" placeholder="Insert description">
          </div>
        </div>
        <div class="row mt-3">
          <div class="col-12">
            <input type="text" class="form-control" name="price" placeholder="Insert price">
          </div>
        </div>
        <div class="row mt-3">
          <div class="col-12">
            <input type="text" class="form-control" name="amount" placeholder="Insert amount">
          </div>
        </div>
        <div class="row mt-3">
          <div class="col-12">
            <button class="btn btn-success">ADD COMPUTER</button>
          </div>
        </div>
      </form>
    </div>
  </div>
</div>
<%@include file="footer.jsp"%>
</body>
</html>
