package celestial;

import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface rpl_3 {
   rpl_3 id_class = var0 -> true;

   static rpl_3 id_class(int var0, rgc_3 var1) {
      return var2 -> var2.accept(0, var1, var0);
   }

   static rpl_3 id_class(String var0, rgc_3 var1) {
      return var0.isEmpty() ? id_class : var2 -> rgL_2.id_class(var0, var1, var2);
   }

   static rpl_3 id_class(String var0, rgc_3 var1, Int2IntFunction var2) {
      return var0.isEmpty() ? id_class : var3 -> rgL_2.id_break(var0, var1, id_class(var3, var2));
   }

   static rpv_3 id_class(rpv_3 var0, Int2IntFunction var1) {
      return (var2, var3, var4) -> var0.accept(var2, var3, (Integer)var1.apply(var4));
   }

   static rpl_3 id_class(rpl_3 var0, rpl_3 var1) {
      return id_break(var0, var1);
   }

   static rpl_3 id_class(List<rpl_3> var0) {
      int var1 = var0.size();
      switch (var1) {
         case 0:
            return id_class;
         case 1:
            return (rpl_3)var0.get(0);
         case 2:
            return id_break((rpl_3)var0.get(0), (rpl_3)var0.get(1));
         default:
            return id_break(ImmutableList.copyOf(var0));
      }
   }

   boolean accept(rpv_3 var1);

   static rpl_3 id_break(rpl_3 var0, rpl_3 var1) {
      return var2 -> var0.accept(var2) && var1.accept(var2);
   }

   static rpl_3 id_break(List<rpl_3> var0) {
      return var1 -> {
         for (rpl_3 var3 : var0) {
            if (!var3.accept(var1)) {
               return false;
            }
         }

         return true;
      };
   }
}
