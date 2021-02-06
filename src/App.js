import { useState } from 'react'
import Header from './components/Header'
import Tasks from './components/Tasks'

  const App = () => {
    const [tasks, setTasks] = useState([
        {
            id: 1,
            text: 'Take a Walk',
        },
        {
            id: 2,
            text: 'Take Public Transportation',
        },
        {
            id: 3,
            text: 'Pick Up Trash',
        },
        {
            id: 4,
            text: 'Eat Healthy',
        },
        {
            id: 5,
            text: 'Talk to a Neighbor'
        }
    ])
}

  return (
    <div className='container'>
      <Header />
      <Tasks tasks={tasks}/>
    </div>
  )

export default App;
