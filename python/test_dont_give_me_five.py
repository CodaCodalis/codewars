import unittest
from dont_give_me_five import dont_give_me_five


class TestDontGiveMeFive(unittest.TestCase):
    def test_num(self):
        self.assertEqual(dont_give_me_five(-17, 9), 24)
        self.assertEqual(dont_give_me_five(1, 9), 8)
        self.assertEqual(dont_give_me_five(4, 17), 12)
        self.assertEqual(dont_give_me_five(-17, -4), 12)

    def test_large_num(self):
        self.assertEqual(dont_give_me_five(984, 4304), 2449)
        self.assertEqual(dont_give_me_five(2313, 2317), 4)
        self.assertEqual(dont_give_me_five(-4045, 2575), 4819)
        self.assertEqual(dont_give_me_five(-4436, -1429), 2194)

    def test_huge_num(self):
        self.assertEqual(dont_give_me_five(40076, 2151514229639903569), 326131553237897713)
        self.assertEqual(dont_give_me_five(-206981731, 2235756979031654521), 340132150309630357)
        self.assertEqual(dont_give_me_five(-2490228783604515625, -2490228782196537011), 520812180)
        self.assertEqual(dont_give_me_five(-9000000000000000000, 9000000000000000000), 2401514164751985937)

    def test_edge_num(self):
        self.assertEqual(dont_give_me_five(0, 1), 2)
        self.assertEqual(dont_give_me_five(5, 15), 9)
        self.assertEqual(dont_give_me_five(-5, 4), 9)
        self.assertEqual(dont_give_me_five(51, 60), 1)


if __name__ == '__main__':
    unittest.main()
