<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>sign up</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<style>
.container{
padding:0;
margin-top:110px;
}
</style>
<body>
    <div class="container">
    <form action="save">
          <!-- 2 column grid layout with text inputs for the first and last names -->
          <div class="row mb-4">
            <div class="col">
              <div class="form-outline">
                <input type="text" id="form3Example1" name="First" class="form-control" />
                <label class="form-label" for="form3Example1">First name</label>
              </div>
            </div>
            <div class="col">
              <div class="form-outline">
                <input type="text" id="form3Example2" name="Last" class="form-control" />
                <label class="form-label" for="form3Example2">Last name</label>
              </div>
            </div>
          </div>

          <!-- Email input -->
          <div class="form-outline mb-4">
            <input type="text" id="form3Example3" name="Username"class="form-control" />
            <label class="form-label" for="form3Example3">username</label>
          </div>

          <!-- Password input -->
          <div class="form-outline mb-4">
            <input type="password" id="form3Example4" name="Password" class="form-control" />
            <label class="form-label" for="form3Example4">Password</label>
          </div>

          <!-- Checkbox -->
          <div class="form-check d-flex justify-content-center mb-4">
            <input class="form-check-input me-2" type="checkbox" value="" id="form2Example33" checked />
            <label class="form-check-label" for="form2Example33">
              Subscribe to our newsletter
            </label>
          </div>

          <!-- Submit button -->
          <button type="submit" class="btn btn-primary btn-block mb-4">Sign up</button>
        </form>
    </div>
</body>
</html>