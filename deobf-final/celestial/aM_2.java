package celestial;

public class aM_2 extends ev_3 {
   public final aO_2 class_;

   public aM_2(eF_2 var1, aO_2 var2, rXQ... var3) {
      super(var1, var2 == aO_2.FALL ? eC_2.ARMOR_FEET : eC_2.ARMOR, var3);
      this.class_ = var2;
   }

   @Override
   public int class_(int var1, rye_3 var2) {
      if (var2.private_()) {
         return 0;
      } else if (this.class_ == aO_2.ALL) {
         return var1;
      } else if (this.class_ == aO_2.FIRE && var2.int_()) {
         return var1 * 2;
      } else if (this.class_ == aO_2.FALL && var2 == rye_3.extends_) {
         return var1 * 3;
      } else if (this.class_ == aO_2.EXPLOSION && var2.protected_()) {
         return var1 * 2;
      } else {
         return this.class_ == aO_2.PROJECTILE && var2.break_() ? var1 * 2 : 0;
      }
   }

   @Override
   public boolean class_(ev_3 var1) {
      if (var1 instanceof aM_2 var2) {
         return this.class_ == var2.class_ ? false : this.class_ == aO_2.FALL || var2.class_ == aO_2.FALL;
      } else {
         return super.class_(var1);
      }
   }

   public static int class_(iB_2 var0, int var1) {
      int var2 = eA_2.class_(eY_2.break_, var0);
      if (var2 > 0) {
         var1 -= rfU_2.protected_((float)var1 * (float)var2 * 0.15F);
      }

      return var1;
   }

   public static double class_(iB_2 var0, double var1) {
      int var3 = eA_2.class_(eY_2.protected_, var0);
      if (var3 > 0) {
         var1 -= (double)rfU_2.byte_(var1 * (double)((float)var3 * 0.15F));
      }

      return var1;
   }

   @Override
   public int class_() {
      return 4;
   }

   @Override
   public int class_(int var1) {
      return this.class_.class_() + (var1 - 1) * this.class_.break_();
   }

   @Override
   public int break_(int var1) {
      return this.class_(var1) + this.class_.break_();
   }
}
