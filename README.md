# Voca Buddy – Student Translator App  

## Description  
The **Voca Buddy App** is a translator and communication tool designed to help students overcome language barriers. It enables users to display real-time translated text, store conversation history, and customize app settings for accessibility. The app is ideal for multilingual classrooms and individuals needing effective communication tools.  

---

## Features Implemented (V1)  

### Login Screen  
- **User Authentication**:  
    - Simple login functionality with username and password fields.  
    - Provides secure access to user-specific settings and past conversations.  

### Home Screen  
- **Real-Time Translation**:  
    - Users can type into a text field to display translated content.  
    - A "Connect to Device" button allows external display for real-time communication assistance.  

### Past Conversations Screen  
- **Conversation History**:  
    - View saved conversations displayed chronologically.  
    - Implemented **RecyclerView** for a clean, scrollable list of conversations with timestamps.  
---

## Planned Features (V2+)  

### Voice Input and Translation  
- Users will be able to speak directly into the app for real-time voice-to-text translations.  

### Program Keys  
- Quick access program keys for switching between frequently used languages and settings.  

### Gamification and Rewards  
- Introduce streak tracking for consistent app usage.  
- Provide rewards for achieving communication milestones.  

### Enhanced Conversation Management  
- Users can sort, search, and categorize conversations for better organization.  

---

## User Journey  

### Current Flow (V1):  
1. **Login Screen**:  
    - User enters credentials → Navigates to Home Screen.  
2. **Home Screen**:  
    - Type in a message → Displays translated text in real time.  
    - Option to connect the device for external display.  
4. **Past Conversations Screen**:  
    - View previously saved conversations.  

---

## Technologies Used  
- **Kotlin** for development.  
- **RecyclerView** for displaying past conversations.  
- **SharedPreferences** for storing user preferences (e.g., language settings and theme).  
- **ConstraintLayout** for flexible UI design.  

---

## Video Walkthrough  

Here's a walkthrough of implemented user stories:  

- <img src='assets/VocaBuddyWalkthrough.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />  

GIF created with [CloudConvert](https://cloudconvert.com/)  

---

## Challenges  
1. **Device Connection**:  
    - Ensuring smooth real-time text display when connecting to external devices required careful implementation.  
2. **Dark Mode and Accessibility**:  
    - Customizing the app for light/dark modes while maintaining accessibility standards took additional UI testing.  

---

## License  

    Copyright [2024] [Pooja Loganathan]  

    Licensed under the Apache License, Version 2.0 (the "License");  
    you may not use this file except in compliance with the License.  
    You may obtain a copy of the License at  

        http://www.apache.org/licenses/LICENSE-2.0  

    Unless required by applicable law or agreed to in writing, software  
    distributed under the License is distributed on an "AS IS" BASIS,  
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  
    See the License for the specific language governing permissions and  
    limitations under the License.  
