import React, { useEffect, useState } from 'react'
import MapService from '../mapService/MapService';
import { Link } from 'react-router-dom';

const ListOfMap = () => {

  const [mapping, setMapping] = useState([]);


  useEffect(() => {
    getMapping();
  })

  const getMapping = () => {
    MapService.getMappingData().then((response) => {
      setMapping(response.data);
      console.log(response.data);
    }).catch(error => {
      console.log(error)
    }, [])
  }

  return (
    <div>
      <div className='container'>

        <h2 className='text-center'> Map Details </h2>

        <Link to="/add-map" className="btn btn-primary"> Add Performance Details </Link>
        <Link to="/" className="btn btn-secondary" style={{ marginLeft: "10px" }}>Back</Link>



        <table className='table table-bordered table-striped'>
          <thead>
            <th> Map Id </th>
            <th> Name</th>
            <th> Email </th>
            <th>PhoneNumber</th>
            <th>Address</th>
            <th>Number</th>

          </thead>
          <tbody>

            {
              mapping.map(mapping =>
                <tr key={mapping.id}>
                  {/* <td>{mapping.id}</td> */}
                  <td>{mapping.name}</td>
                  <td>{mapping.email}</td>
                  {/* <td>{mapping.phoneNumber}</td>
                  <td>{mapping.address}</td>
                  <td>{mapping.gender}</td> */}


                  {/* <td>
                    <Link className='btn btn-info' to={`/edit-performance/${performance.id}`} >Update </Link>
                  
                    <button className='btn btn-danger' onClick={() => deletePerformance(performance.id)} 
                    style={{ marginLeft: "10px" }}>
                      Delete
                    </button>
                  </td> */}
                </tr>
              )
            }

          </tbody>

        </table>

      </div>
    </div>

  )
}

export default ListOfMap