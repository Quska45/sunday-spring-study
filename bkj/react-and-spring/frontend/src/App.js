import React, {Component, useState, useEffect} from 'react';
import logo from './logo.svg';
import './App.css';

//헤더
import mainHeader from './component/mainHeader.js';

function App () {
    const [message, setMessage] = useState("");
    const [chageMessage, setChangeMessage] = useState(0);

    //리액트 컴포넌트가 렌더링 될 때 특정 작업을 수행하도록 설정할 수 있는 Hook.
    //여기서는 message라는 상태가 변경될 때 스프링으로 실행된 서버에서 /api/hello경로로 이동해 데이터를 받아서 message에서 값을 받아온다.
    //배열인자에 값을 넣어주면  useEffect를 message가 변경될 때 마다 실행 시킬 수 있다.
    useEffect(() => {
        //proxy 설정이 되어 있기 때문에 전체 경로를 쓰지 않아도 된다.
        //cors관련 오류를 간단하게 방지 할 수 있기 때문에 설정을 해놓고 쓰는 것이 좋겠다. 여기서 전체 경로를 쓰면 데이터를 제대로 받아오지 못한다.
        fetch('/api/hello')
            .then(response => response.text())
            .then(message => {
                setMessage(message);
            });
    },[message, chageMessage]);
    
    return (
        <div className="App">
        <mainHeader>123</mainHeader>
        <header className="App-header">
        <img src={logo} className="App-logo" alt="logo"/>
        <h1 className="App-title">{message}</h1>
        </header>
        <p className="App-intro">
        To get started, edit <code>src/App.js</code> and save to reload.
        <button onClick={() => setChangeMessage(chageMessage + 1)}>+</button>
    </p>
    </div>
)
}

export default App;
