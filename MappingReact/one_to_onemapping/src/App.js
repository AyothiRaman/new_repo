import { Route, Router, Switch } from 'react-router-dom';
import './App.css';
import ListOfMap from './mapComponent/ListOfMap';

function App() {
  return (
    <div className="App">

      <Router>
        <div className='container'>
        <Switch>
          <Route path='/' component={ListOfMap} exact={true}></Route>
        </Switch>
        </div>
      </Router>
     
     
    </div>
  );
}

export default App;
