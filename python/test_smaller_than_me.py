from unittest import TestCase
from smaller_than_me import smaller


class TestSmallerThanMe(TestCase):
    def test_smaller_than_me(self):
        self.assertEqual([4, 3, 2, 1, 0], smaller([5, 4, 3, 2, 1]))
        self.assertEqual([0, 0, 0], smaller([1, 2, 3]))
        self.assertEqual([1, 1, 0], smaller([1, 2, 0]))
        self.assertEqual([0, 1, 0], smaller([1, 2, 1]))
        self.assertEqual([3, 3, 0, 0, 0], smaller([1, 1, -1, 0, 0]))
        self.assertEqual([4, 1, 5, 5, 0, 0, 0, 0, 0], smaller([5, 4, 7, 9, 2, 4, 4, 5, 6]))
        self.assertEqual([5, 2, 6, 6, 1, 1, 0, 0, 0, 0], smaller([5, 4, 7, 9, 2, 4, 1, 4, 5, 6]))
