package celestial;

import com.google.common.collect.ImmutableMap;

public class rPc_1 extends rPm_1<is_3> {
   private final float class_;

   public rPc_1(float var1) {
      super(ImmutableMap.of());
      this.class_ = var1;
   }

   protected boolean class_(rrEm_1 var1, is_3 var2) {
      return var2.rT() && var2.break_(rlG_2.break_) > var2.rI() || var2.ry();
   }

   protected boolean class_(rrEm_1 var1, is_3 var2, long var3) {
      return this.class_(var1, var2);
   }

   protected void break_(rrEm_1 var1, is_3 var2, long var3) {
      if (var2.Sa().nextFloat() < this.class_) {
         var2.else_().class_();
      }
   }
}
