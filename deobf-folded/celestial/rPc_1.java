package celestial;

import com.google.common.collect.ImmutableMap;

public class rPc_1 extends rPm_1<is_3> {
   private final float id_class;

   public rPc_1(float var1) {
      super(ImmutableMap.of());
      this.id_class = var1;
   }

   protected boolean id_class(rrEm_1 var1, is_3 var2) {
      return var2.rT() && var2.id_break(rlG_2.id_break) > var2.rI() || var2.ry();
   }

   protected boolean id_class(rrEm_1 var1, is_3 var2, long var3) {
      return this.id_class(var1, var2);
   }

   protected void id_break(rrEm_1 var1, is_3 var2, long var3) {
      if (var2.Sa().nextFloat() < this.id_class) {
         var2.id_else().id_class();
      }
   }
}
