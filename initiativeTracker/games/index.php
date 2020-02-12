<?php

/* 
 * Game Controller
 */


 

    

    $action = filter_input(INPUT_POST, 'action');
     if ($action == NULL){
      $action = filter_input(INPUT_GET, 'action');
     }


    switch ($action){
        
        case 'newGame':
            include '../view/newGame.php';
            break;
    
        case 'saveGame':
            include '../view/saveGame.php';
            break;
        
        case 'loadGame':
            include '../view/loadGame.php';
            break;
        
        case 'helpMenu':
            include '../view/helpMenu.php';
            break;
 
        default:
            include 'view/start.php';
    }
