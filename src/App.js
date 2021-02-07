import { useState } from 'react'
import Header from './components/Header'
import Tasks from './components/Tasks'
import basethumb from './smileys/basethumb.png'

  const App = () => {
    const [weekTasks, setweekTasks] = useState([
        {
            id: 1,
            day: 'Sunday'
        },
        {
            id: 2,
            day: 'Monday',
        },
        {
            id: 3,
            day: 'Tuesday',
        },
        {
            id: 4,
            day: 'Wednesday',
        },
        {
            id: 5,
            day: 'Thursday',
        },
        {
            id: 6,
            day: 'Friday',
        },
        {
          id: 7,
          day: 'Saturday',
        },
        {
          id: 8,
          day: "Week Total",
        }
    ])
    const [allTasks, setAllTasks] = useState([
        {
            id: 1,
            day: '1',
            text: 'Text a friend',
            points: 15,
        },
        {
            id: 2,
            day: '2',
            text: 'Pick up trash',
            points: 30
        },
        {
            id: 3,
            day: '3',
            text: 'Ride the bus',
            points: 50
        },
        {
            id: 4,
            day: '4',
            text: 'Take a walk',
            points: 40
        },
        {
            id: 5,
            day: '5',
            text: 'Eat healthy',
            points: 45
        },
        {
            id: 6,
            day: '6',
            text: 'Recycle',
            points: 30
        },
        {
          id: 7,
          day: '7',
          text: 'Meditate',
          points: 20
        },
        {
          id: 8,
          day: "8",
          text: 'Volunteer',
          points: 100
        },
        {
          id: 9,
          day: "9",
          text: 'Read a book',
          points: 50
        },
        {
          id: 10,
          day: "10",
          text: 'Meet someone new',
          points: 40
        },
        {
          id: 11,
          day: "11",
          text: 'Call a relative',
          points: 20
        },
        {
          id: 12,
          day: "12",
          text: 'Grow a plant',
          points: 60
        },
        {
          id: 13,
          day: "13",
          text: 'Make a craft out of trash',
          points: 40
        },
        {
          id: 14,
          day: "14",
          text: 'Find a new hobby',
          points: 60
        },
        {
          id: 15,
          day: "15",
          text: 'Go to bed early',
          points: 55
        },
        {
          id: 16,
          day: "16",
          text: 'Journal',
          points: 15
        },
        {
          id: 17,
          day: "17",
          text: 'Donate to a charity',
          points: 100
        },
        {
          id: 18,
          day: "18",
          text: 'Go plastic free',
          points: 25
        },
        {
          id: 19,
          day: "19",
          text: 'Turn off your TV',
          points: 60
        },
        {
          id: 20,
          day: "20",
          text: 'Cook a new meal',
          points: 35
        },
        {
          id: 21,
          day: "21",
          text: 'Write a letter',
          points: 20
        },
        {
          id: 22,
          day: "22",
          text: 'Unplug nonessential devices',
          points: 70
        },
        {
          id: 23,
          day: "23",
          text: 'Dance',
          points: 10
        },
        {
          id: 24,
          day: "24",
          text: 'Clean',
          points: 80
        },
        {
          id: 25,
          day: "25",
          text: 'Encourage someone',
          points: 25
        },
        {
          id: 26,
          day: "26",
          text: 'Draw',
          points: 10
        },
        {
          id: 27,
          day: "27",
          text: 'Give a gift',
          points: 60
        },
        {
          id: 28,
          day: "28",
          text: 'Sing',
          points: 10
        }
    ])

 // Delete Task
 const deleteTask = (id) => {
   console.log('delete', id)
 }

  return (
    <div className='base'>
      <div className='container'>
        <Header />
        <p> Do something new to help the environment each day.</p>
        <input type = "text" />
        <br></br>
        <input type = "text" />
        <br></br>
        <input type = "text" />
        <br></br>
        <input type = "text" />
        <br></br>
        <input type = "text" />
        <br></br>
        <input type = "text" />
        <br></br>
        <input type = "text" />
        <br></br>
        <input type = "text" />
        <div class="img">
          <img class="center" src={basethumb} width = '300px'/>
        </div>
      </div>
      <div className='container'>
        <h1>Do these:</h1>
        <Tasks tasks={allTasks}/>
      </div>
    </div>
  )
  }
export default App;
