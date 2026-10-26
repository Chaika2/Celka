package celestial;

import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface rpl_3 {
   rpl_3 class_ = var0 -> true;

   static rpl_3 class_(int var0, rgc_3 var1) {
      return var2 -> var2.accept(0, var1, var0);
   }

   static rpl_3 class_(String var0, rgc_3 var1) {
      return var0.isEmpty() ? class_ : var2 -> rgL_2.class_(var0, var1, var2);
   }

   static rpl_3 class_(String var0, rgc_3 var1, Int2IntFunction var2) {
      return var0.isEmpty() ? class_ : var3 -> rgL_2.break_(var0, var1, class_(var3, var2));
   }

   static rpv_3 class_(rpv_3 var0, Int2IntFunction var1) {
      return (var2, var3, var4) -> var0.accept(var2, var3, (Integer)var1.apply(var4));
   }

   static rpl_3 class_(rpl_3 var0, rpl_3 var1) {
      return break_(var0, var1);
   }

   static rpl_3 class_(List<rpl_3> var0) {
      int var1 = var0.size();
      switch (var1) {
         case 0:
            return class_;
         case 1:
            return (rpl_3)var0.get(0);
         case 2:
            return break_((rpl_3)var0.get(0), (rpl_3)var0.get(1));
         default:
            return break_(ImmutableList.copyOf(var0));
      }
   }

   boolean accept(rpv_3 var1);

   static rpl_3 break_(rpl_3 var0, rpl_3 var1) {
      return var2 -> var0.accept(var2) && var1.accept(var2);
   }

   static rpl_3 break_(List<rpl_3> var0) {
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
