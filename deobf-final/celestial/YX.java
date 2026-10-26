package celestial;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.apache.commons.lang3.mutable.MutableBoolean;

class YX implements YO {
   private final rcd_3 class_;
   private final Predicate<rcZ_2> break_;

   public YX(rcd_3 var1) {
      this.class_ = var1;
      this.break_ = YE.class_(var1);
   }

   @Override
   public int class_(rcZ_2 var1, Supplier<rcZ_2> var2) {
      int var3 = 0;
      if (var1 instanceof rcy_3 var4) {
         int var5 = var4.size();
         if (var5 == 0) {
            var4.add((rcZ_2)var2.get());
            var3++;
         } else {
            for (int var6 = 0; var6 < var5; var6++) {
               rcZ_2 var7 = var4.finally_(var6);
               if (this.break_.test(var7)) {
                  rcZ_2 var8 = (rcZ_2)var2.get();
                  if (!var8.equals(var7) && var4.class_(var6, var8)) {
                     var3++;
                  }
               }
            }
         }
      }

      return var3;
   }

   @Override
   public int class_(rcZ_2 var1) {
      int var2 = 0;
      if (var1 instanceof rcy_3 var3) {
         for (int var4 = var3.size() - 1; var4 >= 0; var4--) {
            if (this.break_.test(var3.finally_(var4))) {
               var3.byte_(var4);
               var2++;
            }
         }
      }

      return var2;
   }

   @Override
   public rcZ_2 class_() {
      return new rcy_3();
   }

   @Override
   public void class_(rcZ_2 var1, Supplier<rcZ_2> var2, List<rcZ_2> var3) {
      MutableBoolean var4 = new MutableBoolean();
      if (var1 instanceof rcy_3 var5) {
         var5.stream().filter(this.break_).forEach(var2x -> {
            var3.add(var2x);
            var4.setTrue();
         });
         if (var4.isFalse()) {
            rcd_3 var6 = this.class_.catch_();
            var5.add(var6);
            var3.add(var6);
         }
      }
   }

   @Override
   public void class_(rcZ_2 var1, List<rcZ_2> var2) {
      if (var1 instanceof rcy_3 var3) {
         var3.stream().filter(this.break_).forEach(var2::add);
      }
   }
}
