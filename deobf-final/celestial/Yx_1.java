package celestial;

import java.util.List;
import java.util.function.Supplier;

class Yx_1 implements YO {
   private final String class_;

   public Yx_1(String var1) {
      this.class_ = var1;
   }

   @Override
   public rcZ_2 class_() {
      return new rcd_3();
   }

   @Override
   public int class_(rcZ_2 var1, Supplier<rcZ_2> var2) {
      if (var1 instanceof rcd_3 var3) {
         rcZ_2 var4 = (rcZ_2)var2.get();
         rcZ_2 var5 = var3.class_(this.class_, var4);
         if (!var4.equals(var5)) {
            return 1;
         }
      }

      return 0;
   }

   @Override
   public int class_(rcZ_2 var1) {
      if (var1 instanceof rcd_3 var2 && var2.throws_(this.class_)) {
         var2.continue_(this.class_);
         return 1;
      }

      return 0;
   }

   @Override
   public void class_(rcZ_2 var1, Supplier<rcZ_2> var2, List<rcZ_2> var3) {
      if (var1 instanceof rcd_3 var4) {
         rcZ_2 var5;
         if (var4.throws_(this.class_)) {
            var5 = var4.byte_(this.class_);
         } else {
            var5 = (rcZ_2)var2.get();
            var4.class_(this.class_, var5);
         }

         var3.add(var5);
      }
   }

   @Override
   public void class_(rcZ_2 var1, List<rcZ_2> var2) {
      if (var1 instanceof rcd_3) {
         rcZ_2 var3 = ((rcd_3)var1).byte_(this.class_);
         if (var3 != null) {
            var2.add(var3);
         }
      }
   }
}
