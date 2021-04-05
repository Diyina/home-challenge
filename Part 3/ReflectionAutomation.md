# Part 3: Reflection on the automation exercise

Notes:
- For this API, I noticed some inconsistencies.
    - The required fields are not the correct ones, only the "Id" field was required. 
    - I can use the POST to update the data, not only using PUT action.

###Explain the following

1. In terms of the different testing categories that describe the scope of the test,
   how would you describe the type of test you have just written?
   
    
- Integration testing, in this case I need to verify the interactions of the components can integrate together without issue.
   These tests are using the components as a group (Create, Update, Delete), and verifying the communication between them.
   For the Scope, I'm only using a positive testing or "happy path", but I can consider more scenarios. 
   
2. Outline the possibilities of automating these specific test cases in different scopes, together with a short summary of the pros and cons of each of them.


- **Scope 1: Data validation:**
  
    **Pro**: These types of tests are helpful when you have a lot of code, and you need to validate the data structure/payload/response 
These tests can provide an early feedback.
    
    **Cons**: sometimes, this can be hard to find the issue. I mean, you know now that you've an issue, 
but probably you need to go deeper and verify the logic/data for each endpoint.


- **Scope 2: Functional testing / Error approach:**
    
    **Pro**: For this scope you can verify if the APi works as expected using different techniques (limits values, positive/negative scenarios).
  You can have different scenarios using the acceptance criteria.
  
    **Cons**: Sometimes, when we have an exploratory testing or edge cases, all those scenarios could be a lot and this can be difficult to maintain.
  

- **Scope 3: End-to-end testing:**
    
    **Pro**: You can verify very quickly if the problem is the API response or is related to the frontend components, occasionally the API can affect the behaviour in the UI components.
  
    **Cons**: Functional and E2E testing can be confused, and some testers replaced the functional for E2E, too many flows can be out of the scope if we use this approach.


