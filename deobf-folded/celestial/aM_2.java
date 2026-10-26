package celestial;

public class aM_2 extends ev_3 {
   public final aO_2 id_class;

   public aM_2(eF_2 var1, aO_2 var2, rXQ... var3) {
      super(var1, var2 == aO_2.FALL ? eC_2.ARMOR_FEET : eC_2.ARMOR, var3);
      this.id_class = var2;
   }

   @Override
   public int id_class(int var1, rye_3 var2) {
      if (var2.id_private()) {
         return 0;
      } else if (this.id_class == aO_2.ALL) {
         return var1;
      } else if (this.id_class == aO_2.FIRE && var2.id_int()) {
         return var1 * 2;
      } else if (this.id_class == aO_2.FALL && var2 == rye_3.id_extends) {
         return var1 * 3;
      } else if (this.id_class == aO_2.EXPLOSION && var2.id_protected()) {
         return var1 * 2;
      } else {
         return this.id_class == aO_2.PROJECTILE && var2.id_break() ? var1 * 2 : 0;
      }
   }

   @Override
   public boolean id_class(ev_3 var1) {
      if (var1 instanceof aM_2 var2) {
         return this.id_class == var2.id_class ? false : this.id_class == aO_2.FALL || var2.id_class == aO_2.FALL;
      } else {
         return super.id_class(var1);
      }
   }

   public static int id_class(iB_2 var0, int var1) {
      int var2 = eA_2.id_class(eY_2.id_break, var0);
      if (var2 > 0) {
         var1 -= rfU_2.id_protected((float)var1 * (float)var2 * 0.15F);
      }

      return var1;
   }

   public static double id_class(iB_2 var0, double var1) {
      int var3 = eA_2.id_class(eY_2.id_protected, var0);
      if (var3 > 0) {
         var1 -= (double)rfU_2.id_byte(var1 * (double)((float)var3 * 0.15F));
      }

      return var1;
   }

   @Override
   public int id_class() {
      return 4;
   }

   @Override
   public int id_class(int var1) {
      return this.id_class.id_class() + (var1 - 1) * this.id_class.id_break();
   }

   @Override
   public int id_break(int var1) {
      return this.id_class(var1) + this.id_class.id_break();
   }
}
