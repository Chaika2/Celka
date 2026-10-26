package celestial;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;

public class rgv_3 {
   public static rgP_2 id_class(Message var0) {
      return (rgP_2)(var0 instanceof rgP_2 ? (rgP_2)var0 : new rgN_2(var0.getString()));
   }

   public static rVi_1 id_class(rgP_2 var0) {
      return new rgn_3("chat.square_brackets", var0);
   }

   public static rVi_1 id_class(rVi_1 var0, rgy_3 var1) {
      return var0.id_case().id_class(var0.id_class().id_class(var1));
   }

   public static rVi_1 id_class(rVi_1 var0, rgl_3 var1) {
      return var0.id_case().id_class(var0.id_class().id_class(var1));
   }

   public static rVi_1 id_class(rVi_1 var0, rgy_3 var1, rgl_3 var2) {
      return id_class(id_class(var0, var2), var1);
   }

   public static rVi_1 id_class(rVi_1 var0, rgc_3 var1) {
      if (var1.id_catch()) {
         return var0;
      } else {
         rgc_3 var2 = var0.id_class();
         if (var2.id_catch()) {
            return var0.id_class(var1);
         } else {
            return var2.equals(var1) ? var0 : var0.id_class(var2.id_class(var1));
         }
      }
   }

   public static rVi_1 id_class(gy_3 var0, rgP_2 var1, an_3 var2, int var3) throws CommandSyntaxException {
      if (var3 > 100) {
         return var1.id_case();
      } else {
         rVi_1 var4 = var1 instanceof rgr_3 ? ((rgr_3)var1).id_class(var0, var2, var3 + 1) : var1.id_throws();

         for (rgP_2 var6 : var1.id_protected()) {
            var4.id_class(id_class(var0, var6, var2, var3 + 1));
         }

         return var4.id_break(id_class(var0, var1.id_class(), var2, var3));
      }
   }

   private static rgc_3 id_class(gy_3 var0, rgc_3 var1, an_3 var2, int var3) throws CommandSyntaxException {
      rgy_3 var4 = var1.id_implements();
      if (var4 != null) {
         rgP_2 var5 = var4.id_class(rgp_3.id_class);
         if (var5 != null) {
            rgy_3 var6 = new rgy_3(rgp_3.id_class, id_class(var0, var5, var2, var3 + 1));
            return var1.id_class(var6);
         }
      }

      return var1;
   }

   public static <T extends Comparable<T>> rgP_2 id_class(Collection<T> var0, Function<T, rgP_2> var1) {
      if (var0.isEmpty()) {
         return rgN_2.id_byte;
      } else if (var0.size() == 1) {
         return (rgP_2)var1.apply((Comparable)var0.iterator().next());
      } else {
         ArrayList var2 = Lists.newArrayList(var0);
         var2.sort(Comparable::compareTo);
         return id_break(var2, var1);
      }
   }

   public static rgP_2 id_class(Collection<String> var0) {
      return id_class(var0, var0x -> new rgN_2(var0x).id_class(rgF_2.GREEN));
   }

   public static rgP_2 id_class(GameProfile var0) {
      if (var0.getName() != null) {
         return new rgN_2(var0.getName());
      } else {
         return var0.getId() != null ? new rgN_2(var0.getId().toString()) : new rgN_2("(unknown)");
      }
   }

   public static <T> rVi_1 id_break(Collection<T> var0, Function<T, rgP_2> var1) {
      if (var0.isEmpty()) {
         return new rgN_2("");
      } else if (var0.size() == 1) {
         return ((rgP_2)var1.apply(var0.iterator().next())).id_case();
      } else {
         rgN_2 var2 = new rgN_2("");
         boolean var3 = true;

         for (Object var5 : var0) {
            if (!var3) {
               var2.id_class(new rgN_2(", ").id_class(rgF_2.GRAY));
            }

            var2.id_class((rgP_2)var1.apply(var5));
            var3 = false;
         }

         return var2;
      }
   }
}
