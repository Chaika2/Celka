package celestial;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class rhI_2 extends rhV_2 implements ai_3 {
   public static final Predicate<iB_2> id_class = iB_2::BU;

   public rhI_2(rYB var1, double var2, double var4, double var6) {
      super(aI_2.V, var2, var4, var6, var1);
   }

   public rhI_2(rYB var1, iB_2 var2) {
      super(aI_2.V, var2, var1);
   }

   public rhI_2(aI_2<? extends rhI_2> var1, rYB var2) {
      super(var1, var2);
   }

   private void id_class(rfH_2 var1, rpr_3 var2) {
      xc_3 var3 = ((rYB)this.id_throws[7]).id_byte(var1);
      if (var3.id_class(rls_3.N)) {
         ((rYB)this.id_throws[7]).id_class(var1, false);
      } else if (xn_3.id_private(var3)) {
         ((rYB)this.id_throws[7]).id_class((rhd_3)null, 1009, var1, 0);
         xn_3.id_byte((rYB)this.id_throws[7], var1, var3);
         ((rYB)this.id_throws[7]).id_break(var1, var3.id_class(xn_3.id_final, Boolean.valueOf(false)));
      }
   }

   private void id_class(rdn_3 var1, rLi_1 var2) {
      aZ_2 var3 = new aZ_2((rYB)this.id_throws[7], this.rx(), this.re(), this.BO());
      an_3 var4 = this.id_else();
      if (var4 instanceof iB_2) {
         var3.id_class((iB_2)var4);
      }

      var3.id_byte(3.0F);
      var3.id_protected(-0.5F);
      var3.id_byte(10);
      var3.id_catch(-var3.id_protected() / (float)var3.id_private());
      var3.id_class(var2);

      for (rLY var6 : rAB.id_break(var1)) {
         var3.id_class(new rLY(var6));
      }

      rcd_3 var7 = var1.id_package();
      if (var7 != null && var7.id_byte("CustomPotionColor", 99)) {
         var3.id_class(var7.id_private("CustomPotionColor"));
      }

      ((rYB)this.id_throws[7]).a_(var3);
   }

   @Override
   protected void id_class(rjG_2 var1) {
      super.id_class(var1);
      rdn_3 var2 = this.id_class();
      rdn_3 var3;
      List var4;
      if (((rYB)this.id_throws[7]).id_continue) {
         rrFi_1 var5 = rrFi_1.id_class(var2, rAB.id_class(var2));
         var3 = var5.id_class();
         var4 = var5.id_break();
      } else {
         var3 = var2;
         var4 = rAB.id_class(var2);
      }

      rLi_1 var8 = rAB.id_protected(var3);
      boolean var6 = var8 == rAS.id_break && var4.isEmpty();
      if (var6) {
         if (!((rYB)this.id_throws[7]).id_continue) {
            this.id_catch();
         }
      } else if (this.id_private()) {
         if (!((rYB)this.id_throws[7]).id_continue && !var4.isEmpty()) {
            this.id_class(var3, var8);
         }
      } else {
         this.id_class(var4, var3, var1.id_byte() == rjM_2.ENTITY ? ((rfo_3)var1).id_class() : null);
      }

      if (!((rYB)this.id_throws[7]).id_continue) {
         int var7 = var8.id_break() ? 2007 : 2002;
         ((rYB)this.id_throws[7]).id_byte(var7, this.Bs(), rAB.id_byte(var3));
      }

      this.PD();
   }

   @Override
   protected void id_class(rff_3 var1) {
      super.id_class(var1);
      if (!((rYB)this.id_throws[7]).id_continue) {
         rdn_3 var2 = this.id_class();
         rLi_1 var3 = rAB.id_protected(var2);
         List var4 = rAB.id_class(var2);
         boolean var5 = var3 == rAS.id_break && var4.isEmpty();
         rpr_3 var6 = var1.id_break();
         rfH_2 var7 = var1.id_class();
         rfH_2 var8 = var7.id_break(var6);
         if (var5) {
            this.id_class(var8, var6);
            this.id_class(var8.id_break(var6.id_case()), var6);

            for (rpr_3 var10 : rpb_3.HORIZONTAL) {
               this.id_class(var8.id_break(var10), var10);
            }
         }
      }
   }

   private void id_class(List<rLY> var1, rdn_3 var2, an_3 var3) {
      rfl_3 var4 = this.rN().id_byte(4.0, 2.0, 4.0);
      List var5 = ((rYB)this.id_throws[7]).id_class(iB_2.class, var4);
      if (!var5.isEmpty()) {
         Bk_1 var6 = C_throws.id_byte().id_boolean();
         ArrayList var7 = new ArrayList();
         boolean var8 = var1.isEmpty() && var6.id_class();

         for (iB_2 var10 : var5) {
            if (var10.SL()) {
               double var11 = this.id_int(var10);
               if (var11 < 16.0) {
                  double var13 = 1.0 - Math.sqrt(var11) / 4.0;
                  if (var10 == var3) {
                     var13 = 1.0;
                  }

                  ArrayList var15 = new ArrayList();

                  for (rLY var17 : var1) {
                     rLR var18 = var17.id_class();
                     if (var18.id_class()) {
                        if (!((rYB)this.id_throws[7]).id_continue) {
                           var18.id_class(this, this.id_else(), var10, var17.id_byte(), var13);
                        }
                     } else {
                        int var19 = (int)(var13 * (double)var17.id_break() + 0.5);
                        if (var19 > 20) {
                           rLY var20 = new rLY(var18, var19, var17.id_byte(), var17.id_protected(), var17.id_throws());
                           var15.add(var20);
                           if (var10 != (cb_3)QY.id_instanceof().id_class[57] && var10.BC() == aI_2.rM) {
                              var10.id_break(var20);
                           }
                        }
                     }
                  }

                  if (((rYB)this.id_throws[7]).id_continue) {
                     if (!var8) {
                        if (!var15.isEmpty()) {
                           rrLD.id_class(var10, var2, var15, var13);
                        }
                     } else {
                        var7.add(new BN(var10, var13));
                     }
                  }
               }
            }
         }

         if (((rYB)this.id_throws[7]).id_continue && var8 && !var7.isEmpty()) {
            var6.id_class(var3, this.Ps(), var2, var7);
         }
      }
   }

   @Override
   public float id_throws() {
      return 0.05F;
   }

   private void id_catch() {
      rfl_3 var1 = this.rN().id_byte(4.0, 2.0, 4.0);
      List var2 = ((rYB)this.id_throws[7]).id_class(iB_2.class, var1, id_class);
      if (!var2.isEmpty()) {
         for (iB_2 var4 : var2) {
            double var5 = this.id_int(var4);
            if (var5 < 16.0 && var4.BU()) {
               var4.id_break(rye_3.id_byte(var4, this.id_else()), 1.0F);
            }
         }
      }
   }

   @Override
   protected rdb_3 id_protected() {
      return rdy_3.kk;
   }

   private boolean id_private() {
      return this.id_class().id_break() == rdy_3.kQ;
   }
}
