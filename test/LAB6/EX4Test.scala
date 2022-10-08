package LAB6
import chisel3._
import org.scalatest.FreeSpec
import chiseltest._

class My_QueueTest extends FreeSpec with ChiselScalatestTester{
    "EX4Test" in{
        test(new My_Queue){c =>
            c.io.in.bits.poke(4.U)
            c.io.in.valid.poke(1.B)
            c.clock.step(5)
            c.io.out.bits.expect(4.U)
        }
    }
}