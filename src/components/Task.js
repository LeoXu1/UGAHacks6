const Task = ({ task }) => {
    return (
        <div className='task'>
            <h3>{task.day}</h3>
            <p>{task.text}</p>
            <p>{task.points} points</p>
        </div>
    )
}

export default Task
