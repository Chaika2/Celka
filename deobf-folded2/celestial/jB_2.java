package celestial;

import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class jB_2<S extends ryO_2> implements ryX_2<S, Int2IntFunction> {
   public Int2IntFunction id_class(S var1, S var2) {
      return var2x -> {
         if (rrbY_2.id_case()) {
            return HQ.id_class;
         } else {
            int var3 = yX_2.id_class(var1.id_while(), var1.id_char());
            int var4 = yX_2.id_class(var2.id_while(), var2.id_char());
            int var5 = HQ.id_class(var3);
            int var6 = HQ.id_class(var4);
            int var7 = HQ.id_break(var3);
            int var8 = HQ.id_break(var4);
            return HQ.id_class(Math.max(var5, var6), Math.max(var7, var8));
         }
      };
   }

   public Int2IntFunction id_class() {
      return var0 -> var0;
   }

   public Int2IntFunction id_class(S var1) {
      return var0 -> var0;
   }
}
