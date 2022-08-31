
# To Build JAVA App

## Prerequisites

Knowledge of AWT(Abstract Window Tool), Swing and JavaFX.

## What is AWT?

API to develop Graphical User Interface(GUI) or windows-based app in JAVA.

![AWT](awt.jpeg)
![AWT](awt2.jpeg)

## JAVA AWT Heirarchy

![HeirachyAWT](JAVA AWT Heirarchy.jpeg)

**Understanding Components, Container**
![Components&Container](components,container.jpeg)

** Types of containers in JAVA AWT **

- Window
- Panel
- Frame
- Dialog
- The window is the container that have no borders and menu bars.
- We must use frame, dialog or another window for creating a window.
- We need to create an instance of Window class to create this container.

**Understanding Panel & Frame**
![Components&Container](Panel,Frame.jpeg)

## Methods of Component Class

![Components&Container](methods.jpeg)

## Creating simple AWT GUI using frame

- By extending Frame Class (example1)
- By creating object of frame class (example2)
  
## Java Event Handling

- Changing the state of an object is known as an Event. For e.g, Click on Button, dragging, mouse, etc.
- The java.awt.event package provides many event classes and Listener interfaces for event handling
  
  ![eventHandling](eventHandling.jpeg)
**How to Handle events?**
 ![eventHandlingsteps](step1.jpeg)
 ![eventHandlingsteps](step2.jpeg)
 We can put the event handling code into one of the following places:-
- Within class
- Other class
- Anonymous class (avoid)
