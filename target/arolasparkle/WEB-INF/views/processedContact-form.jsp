<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contact Confirmation</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f8f9fa;
            color: #333;
            margin: 0;
            padding: 20px;
        }

        h1 {
            color: #007bff;
            margin-bottom: 10px;
        }

        p {
            font-size: 16px;
            margin-bottom: 15px;
        }

        span {
            font-style: italic;
            color: #28a745;
        }

        i {
            font-style: italic;
            color: #007bff;
        }

        blockquote {
            background-color: #e2e3e5;
            padding: 10px;
            border-left: 5px solid #007bff;
            margin-top: 0;
            margin-bottom: 15px;
        }
    </style>
</head>
<body>
    <h1>Hi, ${visitorName}</h1>  
    <p>Thanks for contacting <span>Arola Sparkles</span>.</p> 
    <p>A verification code is sent to <i>${visitorEmail}</i>.</p> 
    <p>The following message was received from you:</p>
    <blockquote>${visitorMessage}</blockquote>
</body>
</html>
