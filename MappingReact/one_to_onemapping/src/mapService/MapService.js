import axios from 'axios'



const MAPPING_URL = 'http://localhost:8082'

class MapService{

    getMappingData(){
        return axios.get(MAPPING_URL);
    }

    saveMappingData(mapping){
        return axios.post(MAPPING_URL,mapping)
    }
}

export default new MapService();