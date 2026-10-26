package celestial;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Yh_1 implements YO {
   private final String id_class;
   private final rcd_3 id_break;
   private final Predicate<rcZ_2> id_byte;

   public Yh_1(String var1, rcd_3 var2) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = YE.id_class(var2);
   }

   @Override
   public rcZ_2 id_class() {
      return new rcd_3();
   }

   @Override
   public int id_class(rcZ_2 var1, Supplier<rcZ_2> var2) {
      if (var1 instanceof rcd_3 var3) {
         rcZ_2 var4 = var3.id_byte(this.id_class);
         if (this.id_byte.test(var4)) {
            rcZ_2 var5 = (rcZ_2)var2.get();
            if (!var5.equals(var4)) {
               var3.id_class(this.id_class, var5);
               return 1;
            }
         }
      }

      return 0;
   }

   @Override
   public int id_class(rcZ_2 var1) {
      if (var1 instanceof rcd_3 var2) {
         rcZ_2 var3 = var2.id_byte(this.id_class);
         if (this.id_byte.test(var3)) {
            var2.id_continue(this.id_class);
            return 1;
         }
      }

      return 0;
   }

   @Override
   public void id_class(rcZ_2 var1, Supplier<rcZ_2> var2, List<rcZ_2> var3) {
      if (var1 instanceof rcd_3 var4) {
         rcZ_2 var5 = var4.id_byte(this.id_class);
         if (var5 == null) {
            rcd_3 var6 = this.id_break.id_catch();
            var4.id_class(this.id_class, var6);
            var3.add(var6);
         } else if (this.id_byte.test(var5)) {
            var3.add(var5);
         }
      }
   }

   @Override
   public void id_class(rcZ_2 var1, List<rcZ_2> var2) {
      if (var1 instanceof rcd_3) {
         rcZ_2 var3 = ((rcd_3)var1).id_byte(this.id_class);
         if (this.id_byte.test(var3)) {
            var2.add(var3);
         }
      }
   }
}
