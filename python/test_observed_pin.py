from unittest import TestCase
from observed_pin import get_pins


class Test(TestCase):
    def test_get_pins(self):
        self.assertEqual(['5', '7', '8', '9', '0'], get_pins('8'))
        self.assertEqual(["11", "22", "44", "12", "21", "14", "41", "24", "42"], get_pins('11'))
        self.assertEqual(
            ["339", "366", "399", "658", "636", "258", "268", "669", "668", "266", "369", "398", "256", "296", "259",
             "368", "638", "396", "238", "356", "659", "639", "666", "359", "336", "299", "338", "696", "269", "358",
             "656", "698", "699", "298", "236", "239"], get_pins('369'))

#  digits = {1,2,4}
#  digits[0] + digits[0]    11
#  digits[1] + digits[1]    22
#  digits[2] + digits[2]    44
#  digits[0] + digits[1]    12
#  digits[1] + digits[0]    21
#  digits[0] + digits[2]    14
#  digits[2] + digits[0]    41
#  digits[1] + digits[2]    24
#  digits[2] + digits[1]    42
