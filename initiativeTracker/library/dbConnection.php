<?php

/* 
 * Database Conection File
 */

function initTracConnect(){
    
    $server = 'localhost';
    $dbname= 'inittracdb';
    $username = 'dbUser';
    $password = 'oADCoppX301wlSvE';
    $dsn = "mysql:host=$server; dbname=$dbname";
    $options = array(PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION);

    // Create the actual connection object and assign it to a variable
        try {
            $initTracLink = new PDO($dsn, $username, $password, $options);
            return $initTracLink;
            } 
        catch(PDOException $e) 
        {
            header('Location: /initiativeTracker/view/500.php');
            exit;
        }
}

//acmeConnect();