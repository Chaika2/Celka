package celestial;

import java.util.EnumSet;

public class rBe_1 extends rBk_1 {
   private final is_3 id_class;
   private final aa_3 id_break;
   private iB_2 id_byte;
   private int id_protected = -1;
   private final double id_throws;
   private int id_case;
   private final int id_catch;
   private final int id_private;
   private final float id_implements;
   private final float id_finally;

   public rBe_1(aa_3 var1, double var2, int var4, float var5) {
      this(var1, var2, var4, var4, var5);
   }

   public rBe_1(aa_3 var1, double var2, int var4, int var5, float var6) {
      if (!(var1 instanceof iB_2)) {
         throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
      } else {
         this.id_break = var1;
         this.id_class = (is_3)var1;
         this.id_throws = var2;
         this.id_catch = var4;
         this.id_private = var5;
         this.id_implements = var6;
         this.id_finally = var6 * var6;
         this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
      }
   }

   @Override
   public boolean id_class() {
      iB_2 var1 = this.id_class.I_();
      if (var1 != null && var1.BM()) {
         this.id_byte = var1;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean id_break() {
      return this.id_class() || !this.id_class.id_public().id_native();
   }

   @Override
   public void id_throws() {
      double var1 = this.id_class.id_class(this.id_byte.rx(), this.id_byte.re(), this.id_byte.BO());
      boolean var3 = this.id_class.id_goto().id_class(this.id_byte);
      if (var3) {
         this.id_case++;
      } else {
         this.id_case = 0;
      }

      if (!(var1 > (double)this.id_finally) && this.id_case >= 5) {
         this.id_class.id_public().id_final();
      } else {
         this.id_class.id_public().id_class(this.id_byte, this.id_throws);
      }

      this.id_class.id_continue().id_class(this.id_byte, 30.0F, 30.0F);
      if (--this.id_protected == 0) {
         if (!var3) {
            return;
         }

         float var4 = rfU_2.id_class(var1) / this.id_implements;
         float var5 = rfU_2.id_class(var4, 0.1F, 1.0F);
         this.id_break.id_break(this.id_byte, var5);
         this.id_protected = rfU_2.id_protected(var4 * (float)(this.id_private - this.id_catch) + (float)this.id_catch);
      } else if (this.id_protected < 0) {
         float var6 = rfU_2.id_class(var1) / this.id_implements;
         this.id_protected = rfU_2.id_protected(var6 * (float)(this.id_private - this.id_catch) + (float)this.id_catch);
      }
   }

   @Override
   public void id_protected() {
      this.id_byte = null;
      this.id_case = 0;
      this.id_protected = -1;
   }
}
