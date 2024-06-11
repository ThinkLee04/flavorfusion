<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="./css/bootstrap.css">
    <link rel="stylesheet" href="./css/loginstyle.css">
    <link href='https://fonts.googleapis.com/css?family=Poppins' rel='stylesheet'>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />

</head>
        <!-- LOGO -->
        <div id="logo">
            <img  src="./resource/img/logo_trans.png" alt="">
        </div>

        <!-- Container -->
        <div id="container">
            
            <div id="login" class="form-container" >
                <h2>Log In</h2>
                <form action="LoginController">
                    <label for="email">Email</label>
                    <input type="email" id="email" name="email" required>
                    <label for="password">Password</label>
                    <input type="password" id="password" name="password" required>
                    <!--dong nay khi nhap sai se hien chu do-->
                    <div class="d-block mx-4 mb-3 mb-lg-4  text-danger"><b>${mess}</b></div>
                    <div class="remember-me">
                      <input type="checkbox" id="remember-me" name="remember-me">
                      <label for="remember-me">Keep me logged in</label>
                    </div>
                    <button type="submit">Next</button>
                    <div class="switch-div">
                        <p class="switch">Don't have an account? <a href="#" id="signUp"> Sign up </a></p>
                    </div>
                  </form>
                
                <div class="social-login">
                    <p><button class="social-btn"><i class="fab fa-google"></i> Continue with Google</button></p>
                    <p><button class="social-btn"><i class="fab fa-facebook"></i> Continue with Facebook</button></p>
                    <p><button class="social-btn"><i class="fab fa-twitter"></i> Continue with Twitter</button></p>
                </div>
                <p class="terms">By logging in to Flavor Fusion, I confirm that I have read and agree to the Flavor Fusion Terms of Service, Privacy Policy.</p>
            </div>

            <div id="register" class="form-container">
                <h2>Register</h2>
                <form action="#">
                    <div class="name-box">
                        <label for="firstname">First name</label>
                        <input type="text" id="firstname" name="firstname" required>
                    </div>
                    <div class="name-box">    
                        <label for="lastname">Last name</label>
                        <input type="text" id="lastname" name="lastname" required>
                    </div>
                    <label for="email">Email</label>
                    <input type="email" id="email" name="email" required>
                    <label for="password">Password</label>
                    <input type="password" id="password" name="password" required>
                    <label for="confpassword">Confirm password</label>
                    <input type="password" id="confpassword" name="confpassword" required>
                    <label for="phone">Phone</label>
                    <input type="tel" id="phone" name="phone" required>
                    <button type="submit">Sign in</button>
                    <div class="switch-div">
                        <p class="switch">Already have an account? <a href="#" id="signIn"> Log in </a></p>
                    </div>
                </form>
            </div>
            <div class="overlay-container">
                
                <div class="overlay">
                    <img src="./resource/img/login-big.jpeg" alt="">
                    <div class="overlay-panel overlay-left">
                    </div>
                    <div class="overlay-panel overlay-right">
                    </div>
                </div>
            </div>
        </div>
        
        <script src="./js/login.js"></script>
        <script src="./js/bootstrap.js"></script>
</body>
</html>