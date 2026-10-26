package celestial;

import java.util.EnumSet;
import java.util.Random;

public class rBH extends rBk_1 {
   private final aA_2 id_class;
   private final int id_break;
   private rfH_2 id_byte;

   public rBH(aA_2 var1, int var2) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_class(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean id_class() {
      if (this.id_class.BP()) {
         return false;
      } else if (((rYB)this.id_class.id_throws[7]).id_strictfp()) {
         return false;
      } else if (this.id_class.Sa().nextInt(this.id_break) != 0) {
         return false;
      } else {
         rrEm_1 var1 = (rrEm_1)((rYB)this.id_class.id_throws[7]);
         rfH_2 var2 = this.id_class.Bs();
         if (!var1.id_byte(var2, 6)) {
            return false;
         } else {
            rjU_2 var3 = iX_2.id_class(this.id_class, 15, 7, var1x -> (double)(-var1.id_break(rjh_3.id_class(var1x))));
            this.id_byte = var3 == null ? null : new rfH_2(var3);
            return this.id_byte != null;
         }
      }
   }

   @Override
   public boolean id_break() {
      return this.id_byte != null && !this.id_class.id_public().id_native() && this.id_class.id_public().id_catch().equals(this.id_byte);
   }

   @Override
   public void id_throws() {
      if (this.id_byte != null) {
         rLy_1 var1 = this.id_class.id_public();
         if (var1.id_native() && !this.id_byte.id_class(this.id_class.Ps(), 10.0)) {
            rjU_2 var2 = rjU_2.id_protected(this.id_byte);
            rjU_2 var3 = this.id_class.Ps();
            rjU_2 var4 = var3.id_protected(var2);
            var2 = var4.id_class(0.4).id_throws(var2);
            rjU_2 var5 = var2.id_protected(var3).id_protected().id_class(10.0).id_throws(var3);
            rfH_2 var6 = new rfH_2(var5);
            var6 = ((rYB)this.id_class.id_throws[7]).id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, var6);
            if (!var1.id_class((double)var6.b_(), (double)var6.c_(), (double)var6.d_(), 1.0)) {
               this.id_catch();
            }
         }
      }
   }

   private void id_catch() {
      Random var1 = this.id_class.Sa();
      rfH_2 var2 = ((rYB)this.id_class.id_throws[7])
         .id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, this.id_class.Bs().id_break(-8 + var1.nextInt(16), 0, -8 + var1.nextInt(16)));
      this.id_class.id_public().id_class((double)var2.b_(), (double)var2.c_(), (double)var2.d_(), 1.0);
   }
}
