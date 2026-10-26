package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class rrWr_1 {
   private static rVL<rYG> id_protected = id_break((gm_3)QY.id_instanceof().id_class[56]);
   public static rYG id_class = id_class(id_protected, rYl_1.id_break, () -> rYL.id_class(false));
   public static rYG id_break = id_class(id_protected, rYl_1.id_catch, () -> rYL.id_protected(-0.2F, 0.1F, false));
   public static rYG id_byte = id_class(id_protected, rYl_1.X, () -> rYL.id_protected(-0.1F, 0.3F, true));

   public static List<rYG> id_byte() {
      return Lists.newArrayList(id_protected);
   }

   public static rYG id_byte(rqO_2 var0) {
      return id_class().id_class(var0);
   }

   public static int id_class(rqO_2 var0) {
      rYG var1 = id_byte(var0);
      return id_class().id_class(var1);
   }

   public static List<rrMk_1> id_class(Collection<rqO_2> var0) {
      ArrayList var1 = new ArrayList();

      for (rqO_2 var3 : var0) {
         rrMk_1 var4 = rrMk_1.id_class(var3);
         if (var4 != null) {
            var1.add(var4);
         }
      }

      return var1;
   }

   private static rYG id_class(rVL<rYG> var0, rqM_2<rYG> var1, Supplier<rYG> var2) {
      rYG var3 = (rYG)var0.id_class(var1);
      if (var3 == null) {
         var3 = (rYG)var2.get();
      }

      return var3;
   }

   public static void id_class(rYB var0) {
      id_protected = id_break(var0);
      id_class = id_class(id_protected, rYl_1.id_break, () -> rYL.id_class(false));
      id_break = id_class(id_protected, rYl_1.id_catch, () -> rYL.id_protected(-0.2F, 0.1F, false));
      id_byte = id_class(id_protected, rYl_1.X, () -> rYL.id_protected(-0.1F, 0.3F, true));
   }

   public static rVL<rYG> id_class() {
      return id_protected;
   }

   public static rqO_2 id_class(rYG var0) {
      return id_class().id_break(var0);
   }

   public static rYG id_class(rRp_1 var0, rfH_2 var1) {
      rYG var2 = id_class;
      if (var0 instanceof rrJI) {
         var2 = ((rrJI)var0).id_throws(var1);
      } else if (var0 instanceof rRR) {
         var2 = ((rRR)var0).id_implements(var1);
      }

      return var2;
   }

   public static rVL<rYG> id_break(rYB var0) {
      return (rVL<rYG>)(var0 != null ? var0.id_new().id_break(rVL.n) : rVy_1.id_implements);
   }

   public static int id_break(rYG var0) {
      return id_class().id_class(var0);
   }

   public static rrMk_1 id_break(rqO_2 var0) {
      return rrMk_1.id_class(var0);
   }

   public static Set<rqO_2> id_break() {
      return id_class().id_protected();
   }

   public static List<rrMk_1> id_protected() {
      return id_class(id_break());
   }
}
