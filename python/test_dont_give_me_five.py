import unittest
from dont_give_me_five import dont_give_me_five


class TestDontGiveMeFive(unittest.TestCase):
    def test_easy(self):
        self.assertEqual(14, dont_give_me_five(12, 27))
        self.assertEqual(1844, dont_give_me_five(126, 2703))

    def test_num(self):
        self.assertEqual(24, dont_give_me_five(-17, 9))
        self.assertEqual(8, dont_give_me_five(1, 9))
        self.assertEqual(12, dont_give_me_five(4, 17))
        self.assertEqual(12, dont_give_me_five(-17, -4))

    def test_large_num(self):
        self.assertEqual(2449, dont_give_me_five(984, 4304))
        self.assertEqual(4, dont_give_me_five(2313, 2317))
        self.assertEqual(2194, dont_give_me_five(-4436, -1429))
        self.assertEqual(4819, dont_give_me_five(-4045, 2575))

    def test_huge_num(self):
        self.assertEqual(326131553237897713, dont_give_me_five(40076, 2151514229639903569))
        self.assertEqual(340132150309630357, dont_give_me_five(-206981731, 2235756979031654521))
        self.assertEqual(520812180, dont_give_me_five(-2490228783604515625, -2490228782196537011))
        self.assertEqual(2401514164751985937, dont_give_me_five(-9000000000000000000, 9000000000000000000))

    def test_edge_num(self):
        self.assertEqual(2, dont_give_me_five(0, 1))
        self.assertEqual(9, dont_give_me_five(5, 15))
        self.assertEqual(9, dont_give_me_five(-5, 4))
        self.assertEqual(1, dont_give_me_five(51, 60))
