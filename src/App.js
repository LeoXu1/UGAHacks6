import { useState } from 'react'
import Header from './components/Header'
import Tasks from './components/Tasks'
import basethumb from './smileys/basethumb.png'

  const App = () => {
    const [tasks, setTasks] = useState([
        {
            id: 1,
            day: 'Sunday',
            text: 'Take a Walk',
            points: 40,
        },
        {
            id: 2,
            day: 'Monday',
            text: 'Take Public Transportation',
            points: 50
        },
        {
            id: 3,
            day: 'Tuesday',
            text: 'Pick Up Trash',
            points: 30
        },
        {
            id: 4,
            day: 'Wednesday',
            text: 'Eat Healthy',
            points: 45
        },
        {
            id: 5,
            day: 'Thursday',
            text: 'Recycle',
            points: 30
        },
        {
            id: 6,
            day: 'Friday',
            text: 'Meditate',
            points: 20
        },
        {
          id: 7,
          day: 'Saturday',
          text: 'Volunteer',
          points: 100
        },
        {
          id: 8,
          day: "Week Total",
          points: 315
        }
    ])

 // Delete Task
 const deleteTask = (id) => {
   console.log('delete', id)
 }

  return (
    <div className='container'>
      <Header />
      <p> Do something new to help the environment each day.</p>
      <Tasks tasks={tasks}/>
      <img src={basethumb} width = '600px'/>
    </div>
  )
  }
export default App;
