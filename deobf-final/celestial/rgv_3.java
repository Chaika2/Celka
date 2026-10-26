package celestial;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;

public class rgv_3 {
   public static rgP_2 class_(Message var0) {
      return (rgP_2)(var0 instanceof rgP_2 ? (rgP_2)var0 : new rgN_2(var0.getString()));
   }

   public static rVi_1 class_(rgP_2 var0) {
      return new rgn_3("chat.square_brackets", var0);
   }

   public static rVi_1 class_(rVi_1 var0, rgy_3 var1) {
      return var0.case_().class_(var0.class_().class_(var1));
   }

   public static rVi_1 class_(rVi_1 var0, rgl_3 var1) {
      return var0.case_().class_(var0.class_().class_(var1));
   }

   public static rVi_1 class_(rVi_1 var0, rgy_3 var1, rgl_3 var2) {
      return class_(class_(var0, var2), var1);
   }

   public static rVi_1 class_(rVi_1 var0, rgc_3 var1) {
      if (var1.catch_()) {
         return var0;
      } else {
         rgc_3 var2 = var0.class_();
         if (var2.catch_()) {
            return var0.class_(var1);
         } else {
            return var2.equals(var1) ? var0 : var0.class_(var2.class_(var1));
         }
      }
   }

   public static rVi_1 class_(gy_3 var0, rgP_2 var1, an_3 var2, int var3) throws CommandSyntaxException {
      if (var3 > 100) {
         return var1.case_();
      } else {
         rVi_1 var4 = var1 instanceof rgr_3 ? ((rgr_3)var1).class_(var0, var2, var3 + 1) : var1.throws_();

         for (rgP_2 var6 : var1.protected_()) {
            var4.class_(class_(var0, var6, var2, var3 + 1));
         }

         return var4.break_(class_(var0, var1.class_(), var2, var3));
      }
   }

   private static rgc_3 class_(gy_3 var0, rgc_3 var1, an_3 var2, int var3) throws CommandSyntaxException {
      rgy_3 var4 = var1.implements_();
      if (var4 != null) {
         rgP_2 var5 = var4.class_(rgp_3.class_);
         if (var5 != null) {
            rgy_3 var6 = new rgy_3(rgp_3.class_, class_(var0, var5, var2, var3 + 1));
            return var1.class_(var6);
         }
      }

      return var1;
   }

   public static <T extends Comparable<T>> rgP_2 class_(Collection<T> var0, Function<T, rgP_2> var1) {
      if (var0.isEmpty()) {
         return rgN_2.byte_;
      } else if (var0.size() == 1) {
         return (rgP_2)var1.apply((Comparable)var0.iterator().next());
      } else {
         ArrayList var2 = Lists.newArrayList(var0);
         var2.sort(Comparable::compareTo);
         return break_(var2, var1);
      }
   }

   public static rgP_2 class_(Collection<String> var0) {
      return class_(var0, var0x -> new rgN_2(var0x).class_(rgF_2.GREEN));
   }

   public static rgP_2 class_(GameProfile var0) {
      if (var0.getName() != null) {
         return new rgN_2(var0.getName());
      } else {
         return var0.getId() != null ? new rgN_2(var0.getId().toString()) : new rgN_2("(unknown)");
      }
   }

   public static <T> rVi_1 break_(Collection<T> var0, Function<T, rgP_2> var1) {
      if (var0.isEmpty()) {
         return new rgN_2("");
      } else if (var0.size() == 1) {
         return ((rgP_2)var1.apply(var0.iterator().next())).case_();
      } else {
         rgN_2 var2 = new rgN_2("");
         boolean var3 = true;

         for (Object var5 : var0) {
            if (!var3) {
               var2.class_(new rgN_2(", ").class_(rgF_2.GRAY));
            }

            var2.class_((rgP_2)var1.apply(var5));
            var3 = false;
         }

         return var2;
      }
   }
}
