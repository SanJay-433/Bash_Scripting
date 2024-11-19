#!/bin/bash
echo -e "\n~~ Questionnaire ~~\n"
echo hey
QUESTION1="What's your name?"
QUESTION2="Where are you from?"
QUESTION3="what your favourite coding website"
echo $QUESTION1
read name
echo $QUESTION2
read location
echo $QUESTION3
read website
echo -e "\nhello $name from $location . I learned that your favourite coding website is $website"

