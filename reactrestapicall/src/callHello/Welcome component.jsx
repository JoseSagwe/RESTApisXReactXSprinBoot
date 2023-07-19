import axios from 'axios'

// export default function retrieveHelloBean(){
//     return(
//     axios.get('http://localhost:8080/helloB')

//     )
// }


const apiClient = axios.create(
    {
        baseURL: 'http://localhost:8080'
    }
)



export  const retrieveHelloBean = () =>apiClient.get('/helloB')


// to configure a common base Url using Axios


// //////////           OR              //////////
export  const retrieveHelloBeanParam = (username) => apiClient.get(`/hello-bean/${username}`)











// import axios from 'axios'

// export default function WelcomeComponent(){

//     function callHelloRestApi(){
//         console.log("called")
//         axios.get('http://localhost:8080/hello')
//         .then( (response) => successfulResponse(response) )
//           .catch ( (error) => errorResponse(error) )
//           .finally ( () => console.log('cleanup') )
//         }



//   function successfulResponse(response) {
//       console.log(response)
     
//   }

//   function errorResponse(error) {
//       console.log(error)
//   }


//     return(
//         <div>
//             Welcome Developer Joseph
//             <hr />
//             <div>
//             <button className='btn btn-success m-5' onClick={callHelloRestApi}>Call Hello API</button>
//         </div>
//         </div>
//     )
// }