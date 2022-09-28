import unittest
from tic_tac_toe_checker import is_solved


class TestTicTacToeChecker(unittest.TestCase):
    def test_is_not_yet_solved(self):
        # not yet finished
        board = [[0, 0, 1],
                 [0, 1, 2],
                 [2, 1, 0]]
        self.assertEqual(is_solved(board), -1)

    def test_is_solved_row_1(self):
        # winning row
        board = [[1, 1, 1],
                 [0, 2, 2],
                 [0, 0, 0]]
        self.assertEqual(is_solved(board), 1)

    def test_is_solved_column_1(self):
        # winning column
        board = [[2, 1, 2],
                 [2, 1, 1],
                 [1, 1, 2]]
        self.assertEqual(is_solved(board), 1)

    def test_is_solved_draw(self):
        # draw
        board = [[2, 1, 2],
                 [2, 1, 1],
                 [1, 2, 1]]
        self.assertEqual(is_solved(board), 0)

    def test_is_solved_column_2(self):
        # winning column
        board = [[2, 1, 2],
                 [2, 1, 1],
                 [2, 1, 1]]
        self.assertEqual(is_solved(board), 2)

    def test_is_solved_row_2(self):
        # winning column
        board = [[2, 2, 2],
                 [2, 1, 1],
                 [1, 1, 2]]
        self.assertEqual(is_solved(board), 2)
