<%@ page import="java.time.LocalDate" %>
<div class="container-fluid bg-dark text-light p-4 mt-3">
  <div class="row">
    <div class="col-12">
      <h5 class="text-center">
        Copyright &copy;
        <%
          LocalDate localDate = LocalDate.now();
          out.print(localDate.getYear());
        %>
        All Rights Reserved.
      </h5>
    </div>
  </div>
</div>