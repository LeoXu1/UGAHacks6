import React from 'react'
import PropTypes from 'prop-types'
import Button from './Button'

class Header extends React.Component {
    constructor(props) {
        super(props);
        this.handleClick = this.handleClick.bind(this);
        this.state = { random: 1};
    }
    handleClick() {
        console.log('click')
        this.state.random = Math.floor(Math.random()*5);
        this.setState({ random: this.state.random });
    }
    render() {
    return (
        <header className='header'>
        <h1>For a Day</h1>
        <h2>{this.state.random}</h2>
        <Button color='green' text='Spin' onClick={this.handleClick.bind(this)} />
        </header>
    )
    }
}

export default Header