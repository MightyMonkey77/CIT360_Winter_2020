<!DOCTYPE html>

<html lang="en">
    
    <head>
        <title>Template</title>
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
        <div class='formtextinput'>
            
        <main>
            
            <h1>Saving your game are you?</h1>
            <br>
            <p>I will need you to fill out the questions below</p>
            
            <label>What shall we name this grand adventure?</label>
            <br>
            <input type='text' name='saving'>
        </main>
            
        </div>    
        
        <footer>
            <?php include $_SERVER['DOCUMENT_ROOT'] . '/initiativeTracker/common/footer.php';?>
        </footer>
        
    </body>
    
</html>
