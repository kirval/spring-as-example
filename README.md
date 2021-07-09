1. Go to <http://localhost:9000/login> (creds: ```user password```)
2. Go to <http://localhost:9000/oauth2/authorize?response_type=code&client_id=client&scope=read>
3. Copy ```code``` param from url to which you were redirected
4. Send POST request to <http://localhost:9000/oauth2/token?grant_type=authorization_code&code=>{```copied_code```} 
    with Basic Auth (creds: ```client secret```)
