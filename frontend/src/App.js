import React, { Component } from 'react';
//import './dc/public/ArchwayHealth-Logo-White.png';
import './App.css';
import ReactDOM from 'react-dom';

const client = require('./client');



class App extends Component {

  constructor(props) {
    super(props)
    this.state = {records: []};
  }

  // componentDidMount(){
  //
  //     client({method: 'GET', path: '/api/records'}).done(response => {
  //
  //           this.setState({records: response.entity._embedded.resords});
  //
  //           setTimeout(function() {
  //               done();  // MAGIC == EVIL.
  //           }, 1000);
  //
  //     })
  //   }



  render() {
    return (

      <RecordList records={this.state.records}>

      <div className="App">

        <div className="App-header">

        //  <img src='./ArchwayHealth-Logo-White.png' length={100} width={200} alt="logo" />
        <h1>Patient Information Input</h1>

        </div>

        <div className='style1'>

            <text> FIRST NAME </text>
            <form>
                  <input type='text' name='firstName' />
            </form>

            <text> LAST NAME </text>
            <form>
                  <input type='text' name='lastName' />
            </form>

            <text> DATE OF BIRTH </text>
            <form>
                  <input type='date' name='dob' />
            </form>

            <text> EMAIL</text>
            <form>
                  <input type='email' name='email' />
            </form>

            <text> SOCIAL SECURITY NUMBER </text>
            <form>
                  <input type='text' name='ssnum' />
            </form>

            <button variant="dark" size="lg" onSubmit={this.handleSubmit} block>

              Submit
            </button>

        </div>
      </div>

  </RecordList>
    );
  }
}
class Record extends Component {

  render() {

    return(

      <tr>
        <td>{this.props.record.firstName}</td>
        <td> {this.props.record.lastName}</td>
        <td>{this.props.record.email}</td>
        <td>{this.props.record.ssNum}</td>
        <td>{this.props.record.dob}</td>
      </tr>
    )
  }
}

class RecordList extends Component {

  render(){

    const records = this.props.records.map(records =>
        <Record key={Record._links.self.href}
                Record={Record} /> );

    return(

      <table>
        <tbody>
          <tr>
            <td>First Name</td>
            <td>Last Name</td>
            <td>Email Address</td>
            <td>Social Security Number</td>
            <td>Date of Birth</td>
            </tr>
            {records}
          </tbody>
      </table>
    )
  }
}
