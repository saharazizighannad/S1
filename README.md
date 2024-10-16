To run this project just do following steps:
1. Make sure your docker is running
2. run "docker network remove rabbitmq-network"
3. run "docker-compose up --build"

The link below is a google drive link to the video which shows the screen sharing of running the project locally.
https://drive.google.com/file/d/17GDjaWxQxeOZAo9lJEGLnCJKjCmdW7wL/view?usp=drive_link

Notes:
I have not worked with the RabbitMQ before so what I did was googling and using Chatgpt to learn about it. Then I started just with creating S1 and queue and tried seeing the UI of queue. Then I was able to generate the S2 and keep going with them.
All AI tools that I used was from Intelij to help with filling the codes and when it was a mistake I fixed it and also used the Chatgpt with correct prompts to undesrtand the RabbitMQ and its functinality.

Final Note:
I had so many issues running the java 8 b/c of spring boot version so I had to use java 17 instead although I know the requirment was using the java 8. I will attach some errors b/c of java 8 here also.

<img width="1070" alt="Screenshot 2024-10-11 at 6 56 12 PM" src="https://github.com/user-attachments/assets/ea03a901-00a8-4177-a5f3-978e86afada6">
