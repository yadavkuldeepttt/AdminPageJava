<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <script src="https://kit.fontawesome.com/25efc1ea52.js"
            crossorigin="anonymous"></script>
        <link rel="stylesheet" href="Register.css">
    </head>
    <body>
          <div class="container">

            <div class="form_box">
                <div class="btnbox">
                    <div id="btn"></div>
                    <button type="button" class="toggle_btn" id="log">Log In</button>
                    <button type="button" class="toggle_btn" id="reg">Register</button>
                </div>

                <div class="socialicons">
                    <i class="fa-brands fa-facebook"></i>
                    <i class="fa-brands fa-instagram"></i>
                    <i class="fa-brands fa-twitter"></i>
                </div>

                <!-- login page -->
                <form action="login" method="post" id="login"
                    class="input_group">
                    <div class="inp">
                        <i class="fa-solid fa-user"></i>
                        <input type="text" id="email" name="username"
                            class="input-field"
                            placeholder="Username or Phone Number"
                            required>

                    </div>
                    <div class="inp">
                        <i class="fa-solid fa-lock"></i> <input type="password"
                            id="log_password" name="userpass"
                            class="input-field"
                            placeholder="Password"
                            required>
                    </div>
                    <input type="checkbox" class="check-box" name="remember"
                        id="rpass">Remember
                    Password
                    <button type="submit" class="submitbtn"
                        onclick="submitHandler()">Log In</button>
                </form>

                <div class="otherlogin" id="other">
                    <div class="instead">
                        <h3>or</h3>
                    </div>
                    <button class="connect" onclick="google()">
                        <i class="fa-brands fa-google"></i>
                        Sign in with Google
                    </button>
                </div>

                <!-- Registration form -->
                <form action="register" method ="get" id="register" class="input_group">

                    <input type="text" name="userid" class="input-field"
                        placeholder="User Id" required>
                    <input type="text" name="username" class="input-field"
                        placeholder="Full Name" required>
                    <input type="number" name="userage" class="input-field"
                        placeholder="Age">
                    <input type="phone" name="username" class="input-field"
                        placeholder="Phone">
                    <input type="password" name="password" class="input-field"
                        placeholder="Create Password">
                  <!--   <input type="password" name="retypepass" class="input-field"
                        placeholder="Confirm Password"> -->
                    <br> <input type="checkbox" class="check-box" name="agree"
                        id="agreeterm">I agree
                    to the Terms & Conditions
                    <input type="submit" value="Register" id="regbtn"
                        class="submitbtn">
                </form>
            </div>
        </div>

        <script src="Register.js"></script>
    </body>
</html>