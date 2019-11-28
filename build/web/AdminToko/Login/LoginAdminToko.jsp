<%-- 
    Document   : LoginAdmin
    Created on : Jul 6, 2018, 6:38:25 PM
    Author     : DeysiFortuna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Meta, title, CSS, favicons, etc. -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>GoSurfSumatera </title>

        <!-- Bootstrap -->
        <link href="../../vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
        <!-- Font Awesome -->
        <link href="../../vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
        <!-- NProgress -->
        <link href="../../vendors/nprogress/nprogress.css" rel="stylesheet">
        <!-- Animate.css -->
        <link href="../../vendors/animate.css/animate.min.css" rel="stylesheet">

        <!-- Custom Theme Style -->
        <link href="../../build/css/custom.min.css" rel="stylesheet">
    </head>

    <body class="login">
        <div>
            <a class="hiddenanchor" id="signup"></a>
            <a class="hiddenanchor" id="signin"></a>

            <div class="login_wrapper">
                <div class="animate form login_form">
                    <section class="login_content">
                        <form action="dashboard.jsp" method="post">
                            <h1>Login Admin Toko</h1>
                            <div>
                                <input type="text" class="form-control" name="email" placeholder="E-Mail" required="" />
                            </div>
                            <div>
                                <input type="password" class="form-control" name="password" placeholder="Password" required="" />
                            </div>
                            <div>
                                <input type="submit" name="login" value="Login">

                            </div>

                            <div class="clearfix"></div>

                            <div class="separator">
                                <font size="3px">
                                <p class="change_link">Mendaftar menjadi Admin Toko &nbsp</font>
                                    <a href="#signup" class="to_register"><font size="3px">-Buat Akun-</a></font>
                                </p>
                                <div class="clearfix"></div>
                                <br />

                                <div>
                                    <img src="../../Gambar/GoSurfSumatera.png" height="40px">
                                    <p>©2018 All Rights Reserved. GoSurfSumatera! Privacy and Terms</p>
                                </div>
                            </div>
                        </form>
                    </section>
                </div>
                <div id="register" class="animate form registration_form">
                    <section class="login_content">
                        <form id="form1" data-parsley-validate class="form-horizontal form-label-left" action="../../AddAdminToko2" method="post">
                            <h1>Buat Akun Admin Toko</h1>
                            <input type="hidden" name="kodePusatOleh2" value="">
                            <font size=3px>Masukkan Foto Profil</font>
                            <center><div>
                                <input type="file" id="myFile" placeholder="Masukkan Foto Profil" name="gambar" required>
                                </div></center>
                            <br>
                            <div>
                                <input type="text" class="form-control" placeholder="Username" name="id" required="" />
                            </div>
                            <div>
                                <input type="password" class="form-control" placeholder="Password" name="password" required="" />
                            </div>
                            <div>
                                <input type="text" class="form-control" placeholder="Nama" name="nama"  required="" />
                            </div>
                            <div>
                                <input type="email" class="form-control" placeholder="Email" name="email" required="" />
                            </div>
                            <div>
                                <input type="text" class="form-control" placeholder="NoHP" name="noHP" required="" />
                            </div>
                            <div>
                                <button type="submit" class="btn btn-success" form="form1">Submit</button>
                            </div>

                            <div class="clearfix"></div>

                            <div class="separator">
                                <p class="change_link">Already a member ?
                                    <a href="#signin" class="to_register"> Log in </a>
                                </p>

                                <div class="clearfix"></div>
                                <br />

                                <div>
                                    <h1><i class="fa fa-paw"></i> Gentelella Alela!</h1>
                                    <p>©2016 All Rights Reserved. Gentelella Alela! is a Bootstrap 3 template. Privacy and Terms</p>
                                </div>
                            </div>
                        </form>
                    </section>
                </div>
            </div>
        </div>
    </body>
</html>

