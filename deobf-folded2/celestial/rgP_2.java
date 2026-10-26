package celestial;

import com.mojang.brigadier.Message;
import java.util.List;
import java.util.Optional;

public interface rgP_2 extends Message, rgS_2 {
   static rgP_2 id_byte(String var0) {
      return (rgP_2)(var0 != null ? new rgN_2(var0) : rgN_2.id_byte);
   }

   default String id_byte() {
      return rql_3.id_class(this.getString());
   }

   @Override
   default <T> Optional<T> id_class(rgM_2<T> var1, rgc_3 var2) {
      rgc_3 var3 = this.id_class().id_class(var2);
      Optional var4 = this.id_break(var1, var3);
      if (var4.isPresent()) {
         return var4;
      } else {
         for (rgP_2 var6 : this.id_protected()) {
            Optional var7 = var6.id_class(var1, var3);
            if (var7.isPresent()) {
               return var7;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> id_class(rgO_2<T> var1) {
      Optional var2 = this.id_break(var1);
      if (var2.isPresent()) {
         return var2;
      } else {
         for (rgP_2 var4 : this.id_protected()) {
            Optional var5 = var4.id_class(var1);
            if (var5.isPresent()) {
               return var5;
            }
         }

         return Optional.empty();
      }
   }

   default String id_class(int var1) {
      StringBuilder var2 = new StringBuilder();
      this.id_class(var2x -> {
         int var3 = var1 - var2.length();
         if (var3 <= 0) {
            return id_class;
         } else {
            var2.append(var2x.length() <= var3 ? var2x : var2x.substring(0, var3));
            return Optional.empty();
         }
      });
      return var2.toString();
   }

   rgc_3 id_class();

   default <T> Optional<T> id_break(rgO_2<T> var1) {
      return var1.accept(this.id_break());
   }

   default <T> Optional<T> id_break(rgM_2<T> var1, rgc_3 var2) {
      rrLb_1 var3 = rrLb_1.id_class(this.id_break());
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var3);
      return var1.accept(var2, var3.id_class());
   }

   String id_break();

   rVi_1 id_throws();

   @Override
   default String getString() {
      return rgS_2.super.getString();
   }

   rpl_3 id_catch();

   rVi_1 id_case();

   List<rgP_2> id_protected();
}
