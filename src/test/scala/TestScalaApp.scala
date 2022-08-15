import org.scalatest.funsuite.AnyFunSuite
import com.practice.data.utils.EmployeeDataGeneratorUtil

class TestScalaApp extends AnyFunSuite {

  val employeeDataGeneratorUtil = new EmployeeDataGeneratorUtil

  test("Test generateSampleEmployeeData generate 100 employees data") {
    assert(employeeDataGeneratorUtil.generateSampleEmployeeData(100).size == 100)
  }

}
