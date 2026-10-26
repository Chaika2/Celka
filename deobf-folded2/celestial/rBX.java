package celestial;

import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;

public class rBX extends rBk_1 {
   private final is_3 id_class;
   private final Predicate<is_3> id_break;
   private is_3 id_byte;
   private final double id_protected;
   private final rLy_1 id_throws;
   private int id_case;
   private final float id_catch;
   private float id_private;
   private final float id_implements;

   @Override
   public void id_byte() {
      this.id_case = 0;
      this.id_private = this.id_class.id_class(rLp_1.WATER);
      this.id_class.id_class(rLp_1.WATER, 0.0F);
   }

   public rBX(is_3 var1, double var2, float var4, float var5) {
      this.id_class = var1;
      this.id_break = var1x -> var1x != null && var1.getClass() != var1x.getClass();
      this.id_protected = var2;
      this.id_throws = var1.id_public();
      this.id_catch = var4;
      this.id_implements = var5;
      this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
      if (!(var1.id_public() instanceof rLA) && !(var1.id_public() instanceof rLL)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
      }
   }

   @Override
   public boolean id_class() {
      List var1 = ((rYB)this.id_class.id_throws[7]).id_class(is_3.class, this.id_class.rN().id_class((double)this.id_implements), this.id_break);
      if (!var1.isEmpty()) {
         for (is_3 var3 : var1) {
            if (!var3.Pp()) {
               this.id_byte = var3;
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean id_break() {
      return this.id_byte != null && !this.id_throws.id_native() && this.id_class.id_int(this.id_byte) > (double)(this.id_catch * this.id_catch);
   }

   @Override
   public void id_throws() {
      if (this.id_byte != null && !this.id_class.z()) {
         this.id_class.id_continue().id_class(this.id_byte, 10.0F, (float)this.id_class.r());
         if (--this.id_case <= 0) {
            this.id_case = 10;
            double var1 = this.id_class.rx() - this.id_byte.rx();
            double var3 = this.id_class.re() - this.id_byte.re();
            double var5 = this.id_class.BO() - this.id_byte.BO();
            double var7 = var1 * var1 + var3 * var3 + var5 * var5;
            if (!(var7 <= (double)(this.id_catch * this.id_catch))) {
               this.id_throws.id_class(this.id_byte, this.id_protected);
            } else {
               this.id_throws.id_final();
               rPR var9 = this.id_byte.id_continue();
               if (var7 <= (double)this.id_catch
                  || var9.id_protected() == this.id_class.rx() && var9.id_throws() == this.id_class.re() && var9.id_case() == this.id_class.BO()) {
                  double var10 = this.id_byte.rx() - this.id_class.rx();
                  double var12 = this.id_byte.BO() - this.id_class.BO();
                  this.id_throws.id_class(this.id_class.rx() - var10, this.id_class.re(), this.id_class.BO() - var12, this.id_protected);
               }
            }
         }
      }
   }

   @Override
   public void id_protected() {
      this.id_byte = null;
      this.id_throws.id_final();
      this.id_class.id_class(rLp_1.WATER, this.id_private);
   }
}
