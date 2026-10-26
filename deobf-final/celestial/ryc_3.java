package celestial;

public class ryc_3 {
   public static rfl_3 class_(rfl_3 var0, rpr_3 var1, double var2) {
      double var4 = var2 * (double)var1.throws_().class_();
      double var6 = Math.min(var4, 0.0);
      double var8 = Math.max(var4, 0.0);
      switch (var1) {
         case WEST:
            return new rfl_3(var0.class_ + var6, var0.break_, var0.byte_, var0.class_ + var8, var0.throws_, var0.case_);
         case EAST:
            return new rfl_3(var0.protected_ + var6, var0.break_, var0.byte_, var0.protected_ + var8, var0.throws_, var0.case_);
         case DOWN:
            return new rfl_3(var0.class_, var0.break_ + var6, var0.byte_, var0.protected_, var0.break_ + var8, var0.case_);
         case UP:
         default:
            return new rfl_3(var0.class_, var0.throws_ + var6, var0.byte_, var0.protected_, var0.throws_ + var8, var0.case_);
         case NORTH:
            return new rfl_3(var0.class_, var0.break_, var0.byte_ + var6, var0.protected_, var0.throws_, var0.byte_ + var8);
         case SOUTH:
            return new rfl_3(var0.class_, var0.break_, var0.case_ + var6, var0.protected_, var0.throws_, var0.case_ + var8);
      }
   }
}
