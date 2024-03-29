from unittest import TestCase
from observed_pin import get_pins


class Test(TestCase):
    def test_get_pins(self):
        self.assertEqual(['5', '7', '8', '9', '0'], get_pins('8'))
        self.assertEqual(sorted(["11", "22", "44", "12", "21", "14", "41", "24", "42"]), get_pins('11'))
        self.assertEqual(sorted(
            ["339", "366", "399", "658", "636", "258", "268", "669", "668", "266", "369", "398", "256", "296", "259",
             "368", "638", "396", "238", "356", "659", "639", "666", "359", "336", "299", "338", "696", "269", "358",
             "656", "698", "699", "298", "236", "239"]), get_pins('369'))
