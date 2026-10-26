package celestial;

import java.util.List;
import java.util.function.Supplier;

class YG implements YO {
   private final int class_;

   public YG(int var1) {
      this.class_ = var1;
   }

   @Override
   public rcZ_2 class_() {
      return new rcy_3();
   }

   @Override
   public int class_(rcZ_2 var1, Supplier<rcZ_2> var2) {
      if (var1 instanceof rcx_3 var3) {
         int var4 = var3.size();
         int var5 = this.class_ < 0 ? var4 + this.class_ : this.class_;
         if (0 <= var5 && var5 < var4) {
            rcZ_2 var6 = (rcZ_2)var3.get(var5);
            rcZ_2 var7 = (rcZ_2)var2.get();
            if (!var7.equals(var6) && var3.class_(var5, var7)) {
               return 1;
            }
         }
      }

      return 0;
   }

   @Override
   public int class_(rcZ_2 var1) {
      if (var1 instanceof rcx_3 var2) {
         int var3 = var2.size();
         int var4 = this.class_ < 0 ? var3 + this.class_ : this.class_;
         if (0 <= var4 && var4 < var3) {
            var2.byte_(var4);
            return 1;
         }
      }

      return 0;
   }

   @Override
   public void class_(rcZ_2 var1, Supplier<rcZ_2> var2, List<rcZ_2> var3) {
      this.class_(var1, var3);
   }

   @Override
   public void class_(rcZ_2 var1, List<rcZ_2> var2) {
      if (var1 instanceof rcx_3 var3) {
         int var4 = var3.size();
         int var5 = this.class_ < 0 ? var4 + this.class_ : this.class_;
         if (0 <= var5 && var5 < var4) {
            var2.add((rcZ_2)var3.get(var5));
         }
      }
   }
}
