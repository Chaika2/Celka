package celestial;

import java.util.Random;

public class rUs_1 extends rUO<rUt_1> {
   public static final rfH_2 id_class = rfH_2.id_protected;
   private final boolean b;

   public rUs_1(boolean var1) {
      super(rUt_1.id_class);
      this.b = var1;
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUt_1 var5) {
      for (rfH_2 var7 : rfH_2.id_class(new rfH_2(var4.b_() - 4, var4.c_() - 1, var4.d_() - 4), new rfH_2(var4.b_() + 4, var4.c_() + 32, var4.d_() + 4))) {
         boolean var8 = var7.id_class(var4, 2.5);
         if (var8 || var7.id_class(var4, 3.5)) {
            if (var7.c_() < var4.c_()) {
               if (var8) {
                  this.id_class(var1, var7, xu_3.id_while.id_continue());
               } else if (var7.c_() < var4.c_()) {
                  this.id_class(var1, var7, xu_3.Sh.id_continue());
               }
            } else if (var7.c_() > var4.c_()) {
               this.id_class(var1, var7, xu_3.id_class.id_continue());
            } else if (!var8) {
               this.id_class(var1, var7, xu_3.id_while.id_continue());
            } else if (this.b) {
               this.id_class(var1, new rfH_2(var7), xu_3.SM.id_continue());
            } else {
               this.id_class(var1, new rfH_2(var7), xu_3.id_class.id_continue());
            }
         }
      }

      for (int var9 = 0; var9 < 4; var9++) {
         this.id_class(var1, var4.id_break(var9), xu_3.id_while.id_continue());
      }

      rfH_2 var10 = var4.id_break(2);

      for (rpr_3 var12 : rpb_3.HORIZONTAL) {
         this.id_class(var1, var10.id_break(var12), xu_3.rY.id_continue().id_class(zg_3.id_volatile, var12));
      }

      return true;
   }
}
