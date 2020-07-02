import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import registerServiceWorker from './registerServiceWorker';

//화면 분기 처리를 위해 react-router-dom을 사용한다.
//HTML history api를 사용해서 url을 변경하는 기능을 제공한다.
import { BrowserRouter } from 'react-router-dom'

ReactDOM.render(<BrowserRouter><App /></BrowserRouter>, document.getElementById('root'));
registerServiceWorker();
