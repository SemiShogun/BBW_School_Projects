#!/bin/bash

clear
declare -i points=0
declare -i difficulty=0

echo "Choose your difficulty (0 for player vs player, 1 for bot): "

read difficulty
if [[ $difficulty == 0 ]]; then

    echo "Name for player1: "
    read player1
    echo "Name for player2: "
    read player2

    turn=$player2

    clear

    while [ $points -lt 20 ]; do
        if [[ $turn == $player2 ]]; then
            turn=$player1
        else
            turn=$player2
        fi
        echo "=================================================================="
        while true; do
            read -p "$turn please enter a number between 1 and 2: " input
            if !(( $input == 1 || $input == 2 )); then
                echo "Please enter a number, not a letter or symbol." >&2
                continue
            else
                break
            fi
        done
        echo "================================================================="
        points=$((points + input))
        clear
        echo "$turn put $input"
        echo "$points points"
    done

    echo "$turn wins!"
    exit 1

else
    echo "Please enter your name: "
    read player

    while [ $points -lt 20 ]; do
        if [[ $turn == $player ]]; then
            $input=$((1 + RANDOM % 2))
            turn="bot"
        else
            turn=$player
            echo "================================================================"
            while true; do
                read -p "$turn please enter a number between 1 and 2: " input
                if !(( $input == 1 || $input == 2 )); then
                    echo "Please enter a number, not a letter or symbol." >&2
                    continue
                else
                    break
                fi
            done
            echo "==============================================================="
        fi
        points=$((points + input))
        clear
        echo "$turn put $input"
        echo "$points points"
    done

    echo "$turn wins!"
    exit 1
fi
