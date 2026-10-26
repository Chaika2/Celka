package celestial;

import java.util.Collection;
import java.util.List;
import java.util.function.UnaryOperator;

public interface rVi_1 extends rgP_2 {
   rVi_1 id_class(int var1, Collection<rgP_2> var2);

   default rVi_1 id_class(UnaryOperator<rgc_3> var1) {
      this.id_class(var1.apply(this.id_class()));
      return this;
   }

   default rVi_1 id_class(rgF_2... var1) {
      this.id_class(this.id_class().id_class(var1));
      return this;
   }

   default rVi_1 id_class(rgF_2 var1) {
      this.id_class(this.id_class().id_break(var1));
      return this;
   }

   default rVi_1 id_class(String var1, String var2, boolean var3) {
      List var4 = this.id_protected();
      if (var4.isEmpty()) {
         String var9 = this.getString();
         if (!var3) {
            var9 = var9.toLowerCase();
         }

         return new rgN_2(var9.replace(var1, var2)).id_class(this.id_class());
      } else {
         rVi_1 var5 = this.id_throws();

         for (rgP_2 var7 : var4) {
            String var8 = var7.getString();
            if (!var3) {
               var8 = var8.toLowerCase();
            }

            if (var8.contains(var1)) {
               var8 = var8.replace(var1, var2);
               var5.id_class(new rgN_2(var8).id_class(var7.id_class()));
            } else {
               var5.id_class(var7);
            }
         }

         return var5;
      }
   }

   rVi_1 id_class(rgc_3 var1);

   rVi_1 id_class(rgP_2 var1);

   rVi_1 id_class(int var1, rgP_2 var2);

   default rVi_1 id_break(String var1) {
      return this.id_class(new rgN_2(var1));
   }

   default rVi_1 id_break(rgF_2 var1) {
      this.id_class(this.id_class().id_break(var1));
      return this;
   }

   default rVi_1 id_break(rgc_3 var1) {
      this.id_class(var1.id_class(this.id_class()));
      return this;
   }
}
