<?php

if($_SERVER["REQUEST_METHOD"]=="POST"){
	require 'connection.php';
	createSignUp();
}
function createSignUp(){
	global $connect;

	$email = $_POST["email"];
	$password = $_POST["password"];


	//$query = "INSERT INTO `u347086859_medc`.`user` (`user_emailid`, `user_password`) VALUES ('".$email."','". $password."');";

	$query = "select * from user where user_emailid = '$email' and user_password = '$password'";
	
	$result = mysqli_query($connect,$query) or die(mysqli_error($connect));

	if($result==1){
		header('Content-type: application/json');
		echo json_encode(array("result"=>"success"));
	}
	else{
		header('Content-type: application/json');
		echo json_encode(array("result"=>"unsuccess"));
	}
	mysqli_close($connect);

}



?>