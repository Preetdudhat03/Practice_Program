from chatterbot import ChatBot
from chatterbot.trainers import ListTrainer

# Create a chatbot
chatbot = ChatBot("My Chatterbot")

# Create a list of training data (conversation examples)
conversation = [
    "Hi",
    "Hello!",
    "How are you doing?",
    "I'm doing well, thanks for asking. How about you?",
    "That's great to hear! What can I talk to you about today?",
    "I'm interested in learning more about  science",
    "Science is a fascinating topic! What area of science are you curious about?",
    "Astronomy",
    "Astronomy is awesome! Did you know the sun is a giant star?"
]

# Train the chatbot with the conversation
trainer = ListTrainer(chatbot)
trainer.train(conversation)

# Start a conversation
while True:
  user_input = input("You: ")
  if user_input.lower() == "bye":
    break
  else:
    bot_response = chatbot.get_response(user_input)
    print(f"Chatbot: {bot_response}")