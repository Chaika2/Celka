package celestial;

import java.util.Collection;
import java.util.List;
import java.util.function.UnaryOperator;

public interface rVi_1 extends rgP_2 {
   rVi_1 class_(int var1, Collection<rgP_2> var2);

   default rVi_1 class_(UnaryOperator<rgc_3> var1) {
      this.class_(var1.apply(this.class_()));
      return this;
   }

   default rVi_1 class_(rgF_2... var1) {
      this.class_(this.class_().class_(var1));
      return this;
   }

   default rVi_1 class_(rgF_2 var1) {
      this.class_(this.class_().break_(var1));
      return this;
   }

   default rVi_1 class_(String var1, String var2, boolean var3) {
      List var4 = this.protected_();
      if (var4.isEmpty()) {
         String var9 = this.getString();
         if (!var3) {
            var9 = var9.toLowerCase();
         }

         return new rgN_2(var9.replace(var1, var2)).class_(this.class_());
      } else {
         rVi_1 var5 = this.throws_();

         for (rgP_2 var7 : var4) {
            String var8 = var7.getString();
            if (!var3) {
               var8 = var8.toLowerCase();
            }

            if (var8.contains(var1)) {
               var8 = var8.replace(var1, var2);
               var5.class_(new rgN_2(var8).class_(var7.class_()));
            } else {
               var5.class_(var7);
            }
         }

         return var5;
      }
   }

   rVi_1 class_(rgc_3 var1);

   rVi_1 class_(rgP_2 var1);

   rVi_1 class_(int var1, rgP_2 var2);

   default rVi_1 break_(String var1) {
      return this.class_(new rgN_2(var1));
   }

   default rVi_1 break_(rgF_2 var1) {
      this.class_(this.class_().break_(var1));
      return this;
   }

   default rVi_1 break_(rgc_3 var1) {
      this.class_(var1.class_(this.class_()));
      return this;
   }
}
