from unittest import TestCase

from max_subarray_sum import max_sequence


class Test(TestCase):
    def test_max_sequence(self):
        self.assertEqual(6, max_sequence([-2, 1, -3, 4, -1, 2, 1, -5, 4]))
        self.assertEqual(0, max_sequence([]))
        self.assertEqual(0, max_sequence([-2, -1, -3, -4, -1, -2, -1, -5, -4]))
        self.assertEqual(65, max_sequence([2, 63]))
        self.assertEqual(68, max_sequence([2, 63, 3]))
        self.assertEqual(65, max_sequence([2, 63, 3, -3]))
        self.assertEqual(259, max_sequence([-2, -1, -3, -4, -1, -2, -1, -5, -4, 132, 44, 39, 44]))
        self.assertEqual(259, max_sequence([132, 44, 39, 44, -2, -1, -3, -4, -1, -2, -1, -5, -4]))
