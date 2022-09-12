from unittest import TestCase

from next_bigger_number import next_bigger


class Test(TestCase):
    def test_big_next_bigger(self):
        self.assertEqual(241782515269, next_bigger(241782512965))
        self.assertEqual(1234567908, next_bigger(1234567890))
        self.assertEqual(80069, next_bigger(69800))
        self.assertEqual(67989, next_bigger(67899))
        self.assertEqual(67908, next_bigger(67890))

    def test_next_bigger(self):
        self.assertEqual(351, next_bigger(315))
        self.assertEqual(21, next_bigger(12))
        self.assertEqual(2071, next_bigger(2017))
        self.assertEqual(441, next_bigger(414))
        self.assertEqual(414, next_bigger(144))
        self.assertEqual(-1, next_bigger(31))
        self.assertEqual(2170, next_bigger(2107))
        self.assertEqual(-1, next_bigger(9))
        self.assertEqual(-1, next_bigger(111))
        self.assertEqual(-1, next_bigger(531))
