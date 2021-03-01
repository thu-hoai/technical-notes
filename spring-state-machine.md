<b>Introduction Spring state machine</b>

<i>A state machine also called a <b>finite state machine</b> - a computational model used to build an abstract machine.
<b>These machines can only be in one state at a given time.</b>
Each state is a status of the system that changes to another state.
These state changes are called transition.
</i>

Why?
- Help to define consistent behavior for a finite number of states
- Application logic becomes more modular and more precisely defined.
- A state machine can be loosely defined as anything with a set of known states.

What?
A state machine can be:
- If - then - else
- Case statements
- Switch statements

- The concept of a State Machine referencing the concept of finite automata. Finite automata consists of:
    - Finite set of states
    - Set of inputs
    - Initial State
    - Final State
    - Transition function

State machine use cases
- Message (event) based applications -ie New order, pay order , ship order
- Events get published based on state changed
- UI Applications with action triggered by Use- Caps Lock on, Caps Lock Off
- Application behavior changes based on known states.

<b>State Machine Terminology</b>

- <b>States</b> - The specific state of the state machine. Finite and predetermined values. Frequently defined in an enumeration.
- <b>Events</b> - Something that happens to the system - may or may not changed the state.
- <b>Action</b> - The response of the State Machine to events. Can be changing variables, calling a method or changing to a different state.
- <b>Transitions</b> - Type of action which changes state
- <b>Guards</b> - Boolean conditions
- <b>Extended State</b> - State machine variables (in addition to state)

<b>Spring State Machine</b>

- Create a project for Spring State Machine
- Define states + events into Java enums
- Define JPA Entity
- Define Spring Data JPA Repository
- Configure State Machine, transitions, and actions

```java

```