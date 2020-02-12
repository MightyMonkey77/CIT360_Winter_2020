<?php

/* 
 * character- model
 */

//Add character to a database.
function addCharacter($characterName, $characterRace, $characterClass, $characterStr, $characterDex, $characterWis, $characterInt, $characterCon, $characterCha) {
        $db = initTracConnect();
        $sql = 'INSERT INTO characters (characterName, characterRace, characterClass, characterStr, characterDex, characterWis, characterInt, characterCon, characterCha)
                VALUES (:characterName, :characterRace, :characterClass, :characterStr, :characterDex, :characterWis, :characterInt, :characterCon, :characterCha)';
        $stmt->bindValue(':characterName', $characterName, PDO::PARAM_STR);
        $stmt->bindValue(':characterRace', $characterRace, PDO::PARAM_STR);
        $stmt->bindValue(':characterClass', $characterClass, PDO::PARAM_STR);
        $stmt->bindValue(':characterStr', $characterStr, PDO::PARAM_INT);
        $stmt->bindValue(':characterDex', $characterDex, PDO::PARAM_INT);
        $stmt->bindValue(':characterWis', $characterWis, PDO::PARAM_INT);
        $stmt->bindValue(':characterInt', $characterInt, PDO::PARAM_INT);
        $stmt->bindValue(':characterCon', $characterCon, PDO::PARAM_INT);
        $stmt->bindValue(':characterCha', $characterCha, PDO::PARAM_INT);
        $stmt->execute();
        $rowsChanged = $stmt->rowsCount();
        $stmt->closeCursor();
        return $rowsChanged;
        
}

