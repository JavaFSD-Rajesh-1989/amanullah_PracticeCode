HttpSession session = request.getSession();
session.setAttribute("username", "Amanullah");

String username = (String) session.getAttribute("username");
