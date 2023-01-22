import random

def print_board(board):
    for i in range(3):
        for j in range(3):
            print(board[i][j], end="")
            if j < 2:
                print("|", end="")
        print()
        if i < 2:
            print("-----")

def check_win(board):
    for i in range(3):
        if board[i][0] == board[i][1] and board[i][1] == board[i][2] and board[i][0] != ' ':
            return True
    for i in range(3):
        if board[0][i] == board[1][i] and board[1][i] == board[2][i] and board[0][i] != ' ':
            return True
    if board[0][0] == board[1][1] and board[1][1] == board[2][2] and board[0][0] != ' ':
        return True
    if board[0][2] == board[1][1] and board[1][1] == board[2][0] and board[0][2] != ' ':
        return True
    return False

def main():
    board = [[' ' for i in range(3)] for j in range(3)]
    turn = 0
    is_win = False
    is_tie = False
    while not is_win and not is_tie:
        print_board(board)
        if turn % 2 == 0:
            print("Player 1's turn")
        else:
            print("Player 2's turn")
        is_valid = False
        while not is_valid:
            row = int(input("Enter row: "))
            col = int(input("Enter column: "))
            if row >= 0 and row < 3 and col >= 0 and col < 3 and board[row][col] == ' ':
                is_valid = True
            else:
                print("Invalid input")
        if turn % 2 == 0:
            board[row][col] = 'X'
        else:
            board[row][col] = 'O'
        turn += 1
        is_win = check_win(board)
        if turn == 9:
            is_tie = True
    print_board(board)
    if is_win:
        if turn % 2 == 0:
            print("Player 1 wins")
        else:
            print("Player 2 wins")
    else:
        print("Tie")

if __name__ == "__main__":
    main()
