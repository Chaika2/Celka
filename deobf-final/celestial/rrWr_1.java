package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class rrWr_1 {
   private static rVL<rYG> protected_ = break_((gm_3)QY.instanceof_().class_[56]);
   public static rYG class_ = class_(protected_, rYl_1.break_, () -> rYL.class_(false));
   public static rYG break_ = class_(protected_, rYl_1.catch_, () -> rYL.protected_(-0.2F, 0.1F, false));
   public static rYG byte_ = class_(protected_, rYl_1.X, () -> rYL.protected_(-0.1F, 0.3F, true));

   public static List<rYG> byte_() {
      return Lists.newArrayList(protected_);
   }

   public static rYG byte_(rqO_2 var0) {
      return class_().class_(var0);
   }

   public static int class_(rqO_2 var0) {
      rYG var1 = byte_(var0);
      return class_().class_(var1);
   }

   public static List<rrMk_1> class_(Collection<rqO_2> var0) {
      ArrayList var1 = new ArrayList();

      for (rqO_2 var3 : var0) {
         rrMk_1 var4 = rrMk_1.class_(var3);
         if (var4 != null) {
            var1.add(var4);
         }
      }

      return var1;
   }

   private static rYG class_(rVL<rYG> var0, rqM_2<rYG> var1, Supplier<rYG> var2) {
      rYG var3 = (rYG)var0.class_(var1);
      if (var3 == null) {
         var3 = (rYG)var2.get();
      }

      return var3;
   }

   public static void class_(rYB var0) {
      protected_ = break_(var0);
      class_ = class_(protected_, rYl_1.break_, () -> rYL.class_(false));
      break_ = class_(protected_, rYl_1.catch_, () -> rYL.protected_(-0.2F, 0.1F, false));
      byte_ = class_(protected_, rYl_1.X, () -> rYL.protected_(-0.1F, 0.3F, true));
   }

   public static rVL<rYG> class_() {
      return protected_;
   }

   public static rqO_2 class_(rYG var0) {
      return class_().break_(var0);
   }

   public static rYG class_(rRp_1 var0, rfH_2 var1) {
      rYG var2 = class_;
      if (var0 instanceof rrJI) {
         var2 = ((rrJI)var0).throws_(var1);
      } else if (var0 instanceof rRR) {
         var2 = ((rRR)var0).implements_(var1);
      }

      return var2;
   }

   public static rVL<rYG> break_(rYB var0) {
      return (rVL<rYG>)(var0 != null ? var0.new_().break_(rVL.n) : rVy_1.implements_);
   }

   public static int break_(rYG var0) {
      return class_().class_(var0);
   }

   public static rrMk_1 break_(rqO_2 var0) {
      return rrMk_1.class_(var0);
   }

   public static Set<rqO_2> break_() {
      return class_().protected_();
   }

   public static List<rrMk_1> protected_() {
      return class_(break_());
   }
}
