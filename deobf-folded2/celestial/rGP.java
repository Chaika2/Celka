package celestial;

import java.util.EnumSet;
import java.util.List;
import java.util.Random;

public class rGP<T extends rGr_1> extends rBk_1 {
   private final T id_class;
   private final double id_break;
   private final double id_byte;
   private long id_protected;

   @Override
   public void id_byte() {
   }

   public rGP(T var1, double var2, double var4) {
      this.id_class = (T)var1;
      this.id_break = var2;
      this.id_byte = var4;
      this.id_protected = -1L;
      this.id_class(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean id_class() {
      boolean var1 = ((rYB)this.id_class.id_throws[7]).r() < this.id_protected;
      return this.id_class.sA() && this.id_class.I_() == null && !this.id_class.BP() && this.id_class.sv() && !var1;
   }

   @Override
   public void id_throws() {
      boolean var1 = this.id_class.sF();
      rLy_1 var2 = this.id_class.id_public();
      if (var2.id_native()) {
         List var3 = this.id_catch();
         if (this.id_class.sA() && var3.isEmpty()) {
            this.id_class.id_return(false);
         } else if (var1 && this.id_class.sZ().id_class(this.id_class.Ps(), 10.0)) {
            this.id_class.sL();
         } else {
            rjU_2 var4 = rjU_2.id_protected(this.id_class.sZ());
            rjU_2 var5 = this.id_class.Ps();
            rjU_2 var6 = var5.id_protected(var4);
            var4 = var6.id_break(90.0F).id_class(0.4).id_throws(var4);
            rjU_2 var7 = var4.id_protected(var5).id_protected().id_class(10.0).id_throws(var5);
            rfH_2 var8 = new rfH_2(var7);
            var8 = ((rYB)this.id_class.id_throws[7]).id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, var8);
            if (!var2.id_class((double)var8.b_(), (double)var8.c_(), (double)var8.d_(), var1 ? this.id_byte : this.id_break)) {
               this.id_private();
               this.id_protected = ((rYB)this.id_class.id_throws[7]).r() + 200L;
            } else if (var1) {
               for (rGr_1 var10 : var3) {
                  var10.id_implements(var8);
               }
            }
         }
      }
   }

   private List<rGr_1> id_catch() {
      return ((rYB)this.id_class.id_throws[7]).id_class(rGr_1.class, this.id_class.rN().id_class(16.0), var1 -> var1.sJ() && !var1.id_continue(this.id_class));
   }

   @Override
   public void id_protected() {
   }

   private boolean id_private() {
      Random var1 = this.id_class.Sa();
      rfH_2 var2 = ((rYB)this.id_class.id_throws[7])
         .id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, this.id_class.Bs().id_break(-8 + var1.nextInt(16), 0, -8 + var1.nextInt(16)));
      return this.id_class.id_public().id_class((double)var2.b_(), (double)var2.c_(), (double)var2.d_(), this.id_break);
   }
}
