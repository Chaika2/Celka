package celestial;

import java.util.List;
import java.util.function.Supplier;

class Yx_1 implements YO {
   private final String id_class;

   public Yx_1(String var1) {
      this.id_class = var1;
   }

   @Override
   public rcZ_2 id_class() {
      return new rcd_3();
   }

   @Override
   public int id_class(rcZ_2 var1, Supplier<rcZ_2> var2) {
      if (var1 instanceof rcd_3 var3) {
         rcZ_2 var4 = (rcZ_2)var2.get();
         rcZ_2 var5 = var3.id_class(this.id_class, var4);
         if (!var4.equals(var5)) {
            return 1;
         }
      }

      return 0;
   }

   @Override
   public int id_class(rcZ_2 var1) {
      if (var1 instanceof rcd_3 var2 && var2.id_throws(this.id_class)) {
         var2.id_continue(this.id_class);
         return 1;
      }

      return 0;
   }

   @Override
   public void id_class(rcZ_2 var1, Supplier<rcZ_2> var2, List<rcZ_2> var3) {
      if (var1 instanceof rcd_3 var4) {
         rcZ_2 var5;
         if (var4.id_throws(this.id_class)) {
            var5 = var4.id_byte(this.id_class);
         } else {
            var5 = (rcZ_2)var2.get();
            var4.id_class(this.id_class, var5);
         }

         var3.add(var5);
      }
   }

   @Override
   public void id_class(rcZ_2 var1, List<rcZ_2> var2) {
      if (var1 instanceof rcd_3) {
         rcZ_2 var3 = ((rcd_3)var1).id_byte(this.id_class);
         if (var3 != null) {
            var2.add(var3);
         }
      }
   }
}
