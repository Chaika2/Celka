package celestial;

import java.util.List;

public class rrJM extends vm_3 {
   protected List<LZ> throws_ = this.new_;
   protected cm_3 case_ = (cm_3)QY.instanceof_().class_[15];
   protected boolean catch_ = false;

   protected void byte_(LZ var1) {
   }

   public rrJM(rgP_2 var1) {
      super(var1);
   }

   public static void class_(Ml_1 var0, cm_3 var1, rpl_3 var2, int var3, int var4, int var5) {
      var1.class_(var0, var2, (float)(var3 - var1.class_(var2) / 2), (float)var4, var5);
   }

   public static LZ class_(int var0, int var1, List<LZ> var2) {
      for (int var3 = 0; var3 < var2.size(); var3++) {
         LZ var4 = (LZ)var2.get(var3);
         if (var4.new_) {
            int var5 = rrWl_1.class_(var4);
            int var6 = rrWl_1.break_(var4);
            if (var0 >= var4.volatile_ && var1 >= var4.final_ && var0 < var4.volatile_ + var5 && var1 < var4.final_ + var6) {
               return var4;
            }
         }
      }

      return null;
   }

   @Override
   public boolean class_(double var1, double var3, int var5, double var6, double var8) {
      return !this.catch_ ? false : super.class_(var1, var3, var5, var6, var8);
   }

   @Override
   public boolean class_(double var1, double var3, int var5) {
      if (!this.catch_) {
         return false;
      } else {
         this.catch_ = false;
         this.class_(false);
         return this.catch_() != null && this.catch_().class_(var1, var3, var5) ? true : super.class_(var1, var3, var5);
      }
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      boolean var6 = super.break_(var1, var3, var5);
      this.catch_ = true;
      LZ var7 = class_((int)var1, (int)var3, this.throws_);
      if (var7 != null && var7.int_) {
         if (var5 == 1 && var7 instanceof rrJO var8 && var8.implements_() == QF.public_) {
            var7.class_(super.volatile_.c());
         }

         if (var5 == 0) {
            this.break_(var7);
         } else if (var5 == 1) {
            this.byte_(var7);
         }

         return true;
      } else {
         return var6;
      }
   }

   protected void break_(LZ var1) {
   }
}
