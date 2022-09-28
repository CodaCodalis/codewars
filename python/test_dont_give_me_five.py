import unittest
from dont_give_me_five import dont_give_me_five


class TestDontGiveMeFive(unittest.TestCase):
    def test_easy(self):
        self.assertEqual(14, dont_give_me_five(12, 27))
        self.assertEqual(1844, dont_give_me_five(126, 2703))
        self.assertEqual(11, dont_give_me_five(1004, 1016))

    def test_easy_with_5(self):
        self.assertEqual(599, dont_give_me_five(-236, 554))

    def test_num(self):
        self.assertEqual(24, dont_give_me_five(-17, 9))
        self.assertEqual(8, dont_give_me_five(1, 9))
        self.assertEqual(12, dont_give_me_five(4, 17))
        self.assertEqual(12, dont_give_me_five(-17, -4))

    def test_large_num(self):
        self.assertEqual(2449, dont_give_me_five(984, 4304))
        self.assertEqual(4, dont_give_me_five(2313, 2317))
        self.assertEqual(2194, dont_give_me_five(-4436, -1429))

    def test_large_num_with_5(self):
        self.assertEqual(4819, dont_give_me_five(-4045, 2575))

    def test_huge_num(self):
        self.assertEqual(2401514164751985937, dont_give_me_five(-9000000000000000000, 9000000000000000000))

    def test_huge_num_with_5_1(self):
        self.assertEqual(570482817105126924, dont_give_me_five(547768182990878638, 4318817020651594284))

    def test_huge_num_with_5_2(self):
        self.assertEqual(425485462869819639,
                         dont_give_me_five(-7346585220536825693, -3539375522201811359))  # start5: 4 end5: 4

    def test_huge_num_with_5_3(self):
        self.assertEqual(1560242999013250121,
                         dont_give_me_five(-5735287473368442538, 6354610726435343653))  # start5: 3 end5: 3

    def test_huge_num_with_5_4(self):
        self.assertEqual(340132150309630357, dont_give_me_five(-206981731, 2235756979031654521))

    def test_huge_num_with_5_5(self):
        self.assertEqual(326131553237897713, dont_give_me_five(40076, 2151514229639903569))

    def test_huge_num_with_5_6(self):
        self.assertEqual(520812180, dont_give_me_five(-2490228783604515625,
                                                      -2490228782196537011))

    def test_huge_num_with_5_7(self):
        self.assertEqual(559607227730307405, dont_give_me_five(326019214472511805,
                                                               4085842786620136703))

    def test_huge_num_with_5_8(self):
        self.assertEqual(493153700637124496, dont_give_me_five(-5915473813563144277,
                                                               -1738804689424496218))

    def test_huge_num_with_5_9(self):
        self.assertEqual(1902067750824921827, dont_give_me_five(-6331739003603149531,
                                                                8272451928786893985))  # start5: 1 end5: 2

    def test_huge_num_with_5_900(self):
        self.assertEqual(145091136199526638, dont_give_me_five(-1168726074229991037,
                                                               -195101851660971919))

    # @unittest.skip("for a reason")
    def test_edge_num_1(self):
        self.assertEqual(2, dont_give_me_five(0, 1))

    def test_edge_num_2(self):
        self.assertEqual(9, dont_give_me_five(-5, 4))

    def test_edge_num_3(self):
        self.assertEqual(1, dont_give_me_five(510, 600))

    def test_edge_num_4(self):
        self.assertEqual(1, dont_give_me_five(59, 60))

    def test_edge_num_5(self):
        self.assertEqual(1, dont_give_me_five(51, 60))

    def test_edge_num_6(self):
        self.assertEqual(9, dont_give_me_five(5, 15))
