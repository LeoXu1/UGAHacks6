import { useState } from 'react'
import Header from './components/Header'
import Tasks from './components/Tasks'

  const App = () => {
    const [tasks, setTasks] = useState([
        {
            id: 1,
            day: 'Sunday',
            text: 'Take a Walk',
        },
        {
            id: 2,
            day: 'Monday',
            text: 'Take Public Transportation',
        },
        {
            id: 3,
            day: 'Tuesday',
            text: 'Pick Up Trash',
        },
        {
            id: 4,
            day: 'Wednesday',
            text: 'Eat Healthy',
        },
        {
            id: 5,
            day: 'Thursday',
            text: 'Yeet',
        },
        {
            id: 6,
            day: 'Friday',
            text: 'Yeet',
        },
        {
          id: 7,
          day: 'Saturday',
          text: 'yuh',
        }
    ])

 // Delete Task
 const deleteTask = (id) => {
   console.log('delete', id)
 }

  return (
    <div className='container'>
      <Header />
      <Tasks tasks={tasks}/>
    </div>
  )
  }
export default App;