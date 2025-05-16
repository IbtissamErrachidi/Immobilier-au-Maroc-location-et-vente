import { useEffect, useState } from 'react';
import './App.css';

function App() {
    const [message, setMessage] = useState('');

    useEffect(() => {
        fetch('http://localhost:8080/api/hello')
            .then((res) => res.text())
            .then((data) => setMessage(data))
            .catch((err) => console.error('Erreur:', err));
    }, []);

    return (
        <div>
            <h1>Test CORS</h1>
            <p>{message}</p>
        </div>
    );
}

export default App;

