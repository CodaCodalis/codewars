from unittest import TestCase
from rot13 import rot13


class Test(TestCase):
    def test_rot13(self):
        self.assertEqual(
            "ROT13 example.",
            rot13("EBG13 rknzcyr."))
        self.assertEqual(
            "Ubj pna lbh gryy na rkgebireg sebz na\nvagebireg ng AFN? In the elevators,\nthe extrovert looks at the OTHER guy's shoes.",
            rot13("How can you tell an extrovert from an\nintrovert at NSA? Va gur ryringbef,\ngur rkgebireg ybbxf ng gur BGURE thl'f fubrf."))
        self.assertEqual(
            "123",
            rot13("123"))
        self.assertEqual(
            "This is actually the first kata I ever made. Thanks for finishing it! :)",
            rot13("Guvf vf npghnyyl gur svefg xngn V rire znqr. Gunaxf sbe svavfuvat vg! :)"))
        self.assertEqual(
            "@[`{",
            rot13("@[`{"))
