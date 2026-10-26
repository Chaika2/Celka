package celestial;

import com.mojang.brigadier.Message;
import java.util.List;
import java.util.Optional;

public interface rgP_2 extends Message, rgS_2 {
   static rgP_2 byte_(String var0) {
      return (rgP_2)(var0 != null ? new rgN_2(var0) : rgN_2.byte_);
   }

   default String byte_() {
      return rql_3.class_(this.getString());
   }

   @Override
   default <T> Optional<T> class_(rgM_2<T> var1, rgc_3 var2) {
      rgc_3 var3 = this.class_().class_(var2);
      Optional var4 = this.break_(var1, var3);
      if (var4.isPresent()) {
         return var4;
      } else {
         for (rgP_2 var6 : this.protected_()) {
            Optional var7 = var6.class_(var1, var3);
            if (var7.isPresent()) {
               return var7;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> class_(rgO_2<T> var1) {
      Optional var2 = this.break_(var1);
      if (var2.isPresent()) {
         return var2;
      } else {
         for (rgP_2 var4 : this.protected_()) {
            Optional var5 = var4.class_(var1);
            if (var5.isPresent()) {
               return var5;
            }
         }

         return Optional.empty();
      }
   }

   default String class_(int var1) {
      StringBuilder var2 = new StringBuilder();
      this.class_(var2x -> {
         int var3 = var1 - var2.length();
         if (var3 <= 0) {
            return class_;
         } else {
            var2.append(var2x.length() <= var3 ? var2x : var2x.substring(0, var3));
            return Optional.empty();
         }
      });
      return var2.toString();
   }

   rgc_3 class_();

   default <T> Optional<T> break_(rgO_2<T> var1) {
      return var1.accept(this.break_());
   }

   default <T> Optional<T> break_(rgM_2<T> var1, rgc_3 var2) {
      rrLb_1 var3 = rrLb_1.class_(this.break_());
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var3);
      return var1.accept(var2, var3.class_());
   }

   String break_();

   rVi_1 throws_();

   @Override
   default String getString() {
      return rgS_2.super.getString();
   }

   rpl_3 catch_();

   rVi_1 case_();

   List<rgP_2> protected_();
}
