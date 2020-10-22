package homework_3

import utest._

object Test extends TestSuite{

    val tests: Tests = Tests{
        val trueStr = "правда"
        val falStr = "ложь"
        'test_prettyBooleanFormatter1 - {
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter1(false) == falStr)
            assert(Exercises.prettyBooleanFormatter1(2020) == "2020")
        }
        'test_prettyBooleanFormatter2 - {
            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(false) == falStr)
            assert(Exercises.prettyBooleanFormatter2(Seq(1, 2, "GoodJob")) == "List(1, 2, GoodJob)")
        }
        'test_prettyBooleanFormatter3 - {
            assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter3(false) == falStr)
            assert(Exercises.prettyBooleanFormatter3(Map("a" -> "b")) == "Map(a -> b)")
        }
        'test_max1 - {
            intercept[IllegalArgumentException] {Exercises.max1(Seq())}
            assert(Exercises.max1(Seq(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) == 10)
            assert(Exercises.max1(Seq(0)) == 0)
        }
        'test_max2 - {
            assert(Exercises.max2(Seq(1, 2, 10, 3)) == Seq(10))
            assert(Exercises.max2(Seq(0)) == Seq(0))
            assert(Exercises.max2(0 until 0) == Seq.empty)
        }
        'test_max3 - {
            assert(Exercises.max3(Seq()).isEmpty)
            assert(Exercises.max3(Seq(1, 2, 3)) == Option(3))
            assert(Exercises.max3(Seq(-1, -2, -3)) == Option(-1))
        }
        'test_sum1 - {
            assert(Exercises.sum1(0, 0) == 0)
            assert(Exercises.sum1(-9, 359) == 350)
            assert(Exercises.sum1(90, 0) == 90)
        }
        'test_sum2 - {
            assert(Exercises.sum1(0, 0) == 0)
            assert(Exercises.sum1(-9, 359) == 350)
            assert(Exercises.sum1(90, 0) == 90)
        }
        'test_sum3 - {
            assert(Exercises.sum1(0, 0) == 0)
            assert(Exercises.sum1(-9, 359) == 350)
            assert(Exercises.sum1(90, 0) == 90)
        }
    }
}
