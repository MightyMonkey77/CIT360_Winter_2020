<!DOCTYPE html>

<html lang="en">
    
    <head>
        <title>Character Information</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="/initiativeTracker/css/style.css" media="screen"/>
    </head>
    
    <body>
        
        <header>
            <?php include $_SERVER['DOCUMENT_ROOT'] . '/initiativeTracker/common/header.php';?>
        </header>
        
            <nav>
                <?php include $_SERVER['DOCUMENT_ROOT'] . '/initiativeTracker/common/nav.php';?>
            </nav>

        <main>
            
            <h1>Input character info, please!</h1>
            
        <div class="formtextinput">
            
            <form action="../index.php" method="post">
            
            <label>Character Name:</label>
            <br>
            <input id="characterName" name="characterName" type="text">
            <br>
            <label>Character Race:</label>
            <br>
            <input id="characterRace" name="characterRace" type="text">
            <br>
            <label>Character Class:</label>
            <br>
            <input id="characterClass" name="characterClass" type="text">
            <br>
            <label>Character Gold:</label>
            <br>
            <input id="characterGold" name="characterGold" type="number" placeholder="Represented as Decimal">
            <br>
            <label>Character AC:</label>
            <br>
            <input id="characterAC" name="characterAC" type="number">
            <br>
            <label>Strength:</label>
            <br>
            <input id="characterStr" name="characterStr" type="number">
            <br>
            <label>Dexterity:</label>
            <br>
            <input id="characterDex" name="characterDex" type="number">
            <br>
            <label>Wisdom:</label>
            <br>
            <input id="characterWis" name="characterWis" type="number">
            <br>
            <label>Intelligence:</label>
            <br>
            <input id="characterint" name="characterInt" type="number">
            <br>
            <label>Constitution:</label>
            <br>
            <input id="characterCon" name="characterCon" type="number">
            <br>
            <label>Charisma:</label>
            <br>
            <input id="characterCha" name="characterCha" type="number">
            <br>
            <br>
            
            <input type="submit" class="button" value="Add Character">
            <input type="hidden" name="action" value="character">
            
            </form>
            
        </div>
            
            
            
            
        </main>
        
        <footer>
            <?php include $_SERVER['DOCUMENT_ROOT'] . '/initiativeTracker/common/footer.php';?>
        </footer>
        
    </body>
    
</html>

