package celestial;

import java.nio.file.Path;

public class Dq_1 extends Ux_1<rXs_1> {
   public Dq_1(DA var1) {
      super(var1, rVL.default_);
   }

   @Override
   public String class_() {
      return "Fluid Tags";
   }

   @Override
   protected Path class_(rqO_2 var1) {
      return this.break_.break_().resolve("data/" + var1.byte_() + "/tags/fluids/" + var1.break_() + ".json");
   }

   @Override
   protected void break_() {
      this.class_(rlG_2.break_).class_(rXG.byte_, rXG.break_);
      this.class_(rlG_2.byte_).class_(rXG.throws_, rXG.protected_);
   }
}
