package celestial;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Yh_1 implements YO {
   private final String class_;
   private final rcd_3 break_;
   private final Predicate<rcZ_2> byte_;

   public Yh_1(String var1, rcd_3 var2) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = YE.class_(var2);
   }

   @Override
   public rcZ_2 class_() {
      return new rcd_3();
   }

   @Override
   public int class_(rcZ_2 var1, Supplier<rcZ_2> var2) {
      if (var1 instanceof rcd_3 var3) {
         rcZ_2 var4 = var3.byte_(this.class_);
         if (this.byte_.test(var4)) {
            rcZ_2 var5 = (rcZ_2)var2.get();
            if (!var5.equals(var4)) {
               var3.class_(this.class_, var5);
               return 1;
            }
         }
      }

      return 0;
   }

   @Override
   public int class_(rcZ_2 var1) {
      if (var1 instanceof rcd_3 var2) {
         rcZ_2 var3 = var2.byte_(this.class_);
         if (this.byte_.test(var3)) {
            var2.continue_(this.class_);
            return 1;
         }
      }

      return 0;
   }

   @Override
   public void class_(rcZ_2 var1, Supplier<rcZ_2> var2, List<rcZ_2> var3) {
      if (var1 instanceof rcd_3 var4) {
         rcZ_2 var5 = var4.byte_(this.class_);
         if (var5 == null) {
            rcd_3 var6 = this.break_.catch_();
            var4.class_(this.class_, var6);
            var3.add(var6);
         } else if (this.byte_.test(var5)) {
            var3.add(var5);
         }
      }
   }

   @Override
   public void class_(rcZ_2 var1, List<rcZ_2> var2) {
      if (var1 instanceof rcd_3) {
         rcZ_2 var3 = ((rcd_3)var1).byte_(this.class_);
         if (this.byte_.test(var3)) {
            var2.add(var3);
         }
      }
   }
}
