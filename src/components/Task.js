const Task = ({ task }) => {
    return (
        <div className='task'>
            <h3>{task.day}</h3>
            <p>{task.text}</p> 
        </div>
    )
}

export default Task
