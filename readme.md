You will build a service that will accept 
GraphQL requests at http://localhost:8080/graphql.

Make sure this is application.properties file
spring.graphql.graphiql.enabled=true

Now in the playground use this query:

{
getAllPosts{
postId
description
}
}