package celestial;

import java.util.Random;

public class rUs_1 extends rUO<rUt_1> {
   public static final rfH_2 class_ = rfH_2.protected_;
   private final boolean b;

   public rUs_1(boolean var1) {
      super(rUt_1.class_);
      this.b = var1;
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUt_1 var5) {
      for (rfH_2 var7 : rfH_2.class_(new rfH_2(var4.b_() - 4, var4.c_() - 1, var4.d_() - 4), new rfH_2(var4.b_() + 4, var4.c_() + 32, var4.d_() + 4))) {
         boolean var8 = var7.class_(var4, 2.5);
         if (var8 || var7.class_(var4, 3.5)) {
            if (var7.c_() < var4.c_()) {
               if (var8) {
                  this.class_(var1, var7, xu_3.while_.continue_());
               } else if (var7.c_() < var4.c_()) {
                  this.class_(var1, var7, xu_3.Sh.continue_());
               }
            } else if (var7.c_() > var4.c_()) {
               this.class_(var1, var7, xu_3.class_.continue_());
            } else if (!var8) {
               this.class_(var1, var7, xu_3.while_.continue_());
            } else if (this.b) {
               this.class_(var1, new rfH_2(var7), xu_3.SM.continue_());
            } else {
               this.class_(var1, new rfH_2(var7), xu_3.class_.continue_());
            }
         }
      }

      for (int var9 = 0; var9 < 4; var9++) {
         this.class_(var1, var4.break_(var9), xu_3.while_.continue_());
      }

      rfH_2 var10 = var4.break_(2);

      for (rpr_3 var12 : rpb_3.HORIZONTAL) {
         this.class_(var1, var10.break_(var12), xu_3.rY.continue_().class_(zg_3.volatile_, var12));
      }

      return true;
   }
}
