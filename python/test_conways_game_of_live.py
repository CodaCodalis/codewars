import unittest
from unittest import TestCase
from conways_game_of_live import get_generation


class Test(TestCase):
    def test_get_generation(self):
        self.fail()

    def htmlize(array):
        s = []
        for row in array:
            for cell in row:
                s.append('▓▓' if cell else '░░')
            s.append('<:LF:>')
        return ''.join(s)

    start = [[1, 0, 0],
             [0, 1, 1],
             [1, 1, 0]]
    end = [[0, 1, 0],
           [0, 0, 1],
           [1, 1, 1]]

    test.describe('Glider<:LF:>' + htmlize(start))
    test.it('Glider 1')

    resp = get_generation(start, 1)
    test.expect(resp == end, 'Got<:LF:>' + htmlize(resp) + '<:LF:>instead of<:LF:>' + htmlize(end))
