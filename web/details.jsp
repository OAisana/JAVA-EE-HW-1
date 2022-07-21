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
        Computer computer = (Computer) request.getAttribute("computer");
        if(computer!=null){
      %>
      <div class="row mt-3">
        <div class="col-12">
          <input type="text" class="form-control" name="name" placeholder="Insert name" value="<% out.print(computer.getName()); %>" readonly>
        </div>
      </div>
      <div class="row mt-3">
        <div class="col-12">
          <input type="text" class="form-control" name="description" placeholder="Insert description" value="<% out.print(computer.getDescription()); %>" readonly>
        </div>
      </div>
      <div class="row mt-3">
        <div class="col-12">
          <input type="text" class="form-control" name="price" placeholder="Insert price" value="<% out.print(computer.getPrice()); %>" readonly>
        </div>
      </div>
      <div class="row mt-3">
        <div class="col-12">
          <input type="text" class="form-control" name="amount" placeholder="Insert amount" value="<% out.print(computer.getAmount()); %>" readonly>
        </div>
      </div>
      <div class="row mt-3">
        <div class="col-12">
          <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#editComputerModal">
            EDIT
          </button>
          <button type="button" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#deleteComputerModal">
            DELETE
          </button>
        </div>
      </div>
      <div class="modal fade" id="editComputerModal" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
        <div class="modal-dialog modal-lg">
          <form action="/savecomputer" method="post">
            <input type="hidden" value="<%=computer.getId()%>" name="id">
            <div class="modal-content">
              <div class="modal-header">
                <h5 class="modal-title" id="staticBackdropLabel">Modal title</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
              </div>
              <div class="modal-body">
                <div class="row">
                  <div class="col-10 mx-auto">
                    <div class="row mt-3">
                      <div class="col-12">
                        <input type="text" class="form-control" name="name" placeholder="Insert name" value="<%=computer.getName()%>">
                      </div>
                    </div>
                    <div class="row mt-3">
                      <div class="col-12">
                        <input type="text" class="form-control" name="description" placeholder="Insert description" value="<%=computer.getDescription()%>">
                      </div>
                    </div>
                    <div class="row mt-3">
                      <div class="col-12">
                        <input type="text" class="form-control" name="price" placeholder="Insert price" value="<%=computer.getPrice()%>">
                      </div>
                    </div>
                    <div class="row mt-3">
                      <div class="col-12">
                        <input type="text" class="form-control" name="amount" placeholder="Insert amount" value="<%=computer.getAmount()%>">
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">CANCEL</button>
                <button class="btn btn-success">SAVE</button>
              </div>
            </div>
          </form>
        </div>
      </div>
      <div class="modal fade" id="deleteComputerModal" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabelDelete" aria-hidden="true">
        <div class="modal-dialog">
          <form action="/deletecomputer" method="post">
            <input type="hidden" value="<%=computer.getId()%>" name="id">
            <div class="modal-content">
              <div class="modal-header">
                <h5 class="modal-title" id="staticBackdropLabelDelete">Confirm Delete</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
              </div>
              <div class="modal-body">
                Are you sure?
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">NO</button>
                <button type="submit" class="btn btn-danger">YES</button>
              </div>
            </div>
          </form>
        </div>
      </div>

      <%
      }else{
      %>
      <h1 class="text-center">404 COMPUTER NOT FOUND</h1>
      <%
        }
      %>
    </div>
  </div>
</div>
<%@include file="footer.jsp"%>
</body>
</html>
