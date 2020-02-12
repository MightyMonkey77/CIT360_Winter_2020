<?php

/* 
 * Initiative Controller
 */

    require_once '/library/dbConnection.php'; // Connect to DB
    require_once '/model/character-model.php'; // Use the models functions
 

    

    $action = filter_input(INPUT_POST, 'action');
     if ($action == NULL){
      $action = filter_input(INPUT_GET, 'action');
     }


    switch ($action){
        case 'character':
            
            $characterName = filter_input(INPUT_POST, 'characterName', FILTER_SANITIZE_STRING);
            $characterRace = filter_input(INPUT_POST, 'characterRace', FILTER_SANITIZE_STRING);
            $characterClass = filter_input(INPUT_POST, 'characterClass', FILTER_SANITIZE_STRING);
            $characterGold = filter_input(INPUT_POST, 'characterGold', FILTER_SANITIZE_NUMBER_FLOAT, FILTER_FLAG_ALLOW_FRACTION);
            $characterStr = filter_input(INPUT_POST, 'characterStr', FILTER_SANITIZE_NUMBER_INT);
            $characterDex = filter_input(INPUT_POST, 'characterStr', FILTER_SANITIZE_NUMBER_INT);
            $characterWis = filter_input(INPUT_POST, 'characterStr', FILTER_SANITIZE_NUMBER_INT);
            $characterInt = filter_input(INPUT_POST, 'characterStr', FILTER_SANITIZE_NUMBER_INT);
            $characterCon = filter_input(INPUT_POST, 'characterStr', FILTER_SANITIZE_NUMBER_INT);
            $characterCha = filter_input(INPUT_POST, 'characterStr', FILTER_SANITIZE_NUMBER_INT);
            
                if (empty($characterName) || (empty($characterRace)) || (empty($characterClass)) || (empty($characterGold)) || (empty($characterStr)) || (empty($characterDex)) || (empty($characterWis)) || (empty($characterInt)) || (empty($characterCon)) || (empty($characterCha))) {
                    $message ="<p>All fields required, try again</p>";
                    $_SESSION['message'] = $message;
                    include '../view/characterInfo.php';
                    exit;
                }
            
            $addCharacter = addCharacter($characterName, $characterRace, $characterClass, $characterGold, $characterStr, $characterDex, $characterWis, $characterInt, $characterCon, $characterCha);
            
                if ($addCharacter === 1) {
                    $message = "<p>Character $characterName, has been succesfully added.</p>";
                    $_SESSION['message'] = $message;
                    include '../view/newGame.php';
                }
                else
                {
                    $message = "<p>$characterName has failed to be added. Try again.</p>";
                    $_SESSION['message'] = $message;
                }
                
                include '../view/characterInfo.php';
                exit;
                
        default:
            include 'view/start.php';
    }
