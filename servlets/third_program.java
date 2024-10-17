protected void doPost(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("Username: " + username);
    out.println("Password: " + password);
}
