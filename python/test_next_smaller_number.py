from unittest import TestCase
from next_smaller_number import next_smaller


class Test(TestCase):
    def test_next_smaller(self):
        self.assertEqual(790, next_smaller(907))
        self.assertEqual(123456789, (next_smaller(123456798)))
