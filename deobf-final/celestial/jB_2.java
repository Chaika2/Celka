package celestial;

import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class jB_2<S extends ryO_2> implements ryX_2<S, Int2IntFunction> {
   public Int2IntFunction class_(S var1, S var2) {
      return var2x -> {
         if (rrbY_2.case_()) {
            return HQ.class_;
         } else {
            int var3 = yX_2.class_(var1.while_(), var1.char_());
            int var4 = yX_2.class_(var2.while_(), var2.char_());
            int var5 = HQ.class_(var3);
            int var6 = HQ.class_(var4);
            int var7 = HQ.break_(var3);
            int var8 = HQ.break_(var4);
            return HQ.class_(Math.max(var5, var6), Math.max(var7, var8));
         }
      };
   }

   public Int2IntFunction class_() {
      return var0 -> var0;
   }

   public Int2IntFunction class_(S var1) {
      return var0 -> var0;
   }
}
