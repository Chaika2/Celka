package celestial;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class rkN_2 extends rdb_3 implements ee_3 {
   private final Multimap<iJ_2, ix_3> class_;

   @Override
   public rkc_3 byte_(rdn_3 var1) {
      return rkc_3.SPEAR;
   }

   public rkN_2(rdO_2 var1) {
      super(var1);
      Builder var2 = ImmutableMultimap.builder();
      var2.put(iQ_2.case_, new ix_3(case_, "Tool modifier", 8.0, id_3.ADDITION));
      var2.put(iQ_2.private_, new ix_3(catch_, "Tool modifier", -2.9F, id_3.ADDITION));
      this.class_ = var2.build();
   }

   @Override
   public boolean class_(rdn_3 var1, iB_2 var2, iB_2 var3) {
      var1.class_(1, var3, var0 -> var0.break_(rXQ.MAINHAND));
      return true;
   }

   @Override
   public boolean class_(rdn_3 var1, rYB var2, xc_3 var3, rfH_2 var4, iB_2 var5) {
      if ((double)var3.private_(var2, var4) != 0.0) {
         var1.class_(2, var5, var0 -> var0.break_(rXQ.MAINHAND));
      }

      return true;
   }

   @Override
   public Multimap<iJ_2, ix_3> class_(rXQ var1) {
      return var1 == rXQ.MAINHAND ? this.class_ : super.class_(var1);
   }

   @Override
   public boolean class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4) {
      return !var4.implements_();
   }

   @Override
   public void class_(rdn_3 var1, rYB var2, iB_2 var3, int var4) {
      if (var3 instanceof rhd_3 var5) {
         int var6 = this.break_(var1) - var4;
         if (var6 >= 10) {
            int var7 = eA_2.catch_(var1);
            if (var7 <= 0 || var5.Pf()) {
               if (!var2.continue_) {
                  var1.class_(1, var5, var1x -> var1x.byte_(var3.P()));
                  if (var7 == 0) {
                     rhD_2 var8 = new rhD_2(var2, var5, var1);
                     var8.class_(var5, (Float)var5.throws_[16], (Float)var5.throws_[15], 0.0F, 2.5F + (float)var7 * 0.5F, 1.0F);
                     if (((rhx_3)var5.implements_[18]).protected_) {
                        var8.protected_ = rhZ_2.CREATIVE_ONLY;
                     }

                     var2.a_(var8);
                     var2.class_((rhd_3)null, var8, rqn_3.dk, rqL_2.PLAYERS, 1.0F, 1.0F);
                     if (!((rhx_3)var5.implements_[18]).protected_) {
                        ((rhz_3)var5.implements_[1]).catch_(var1);
                     }
                  }
               }

               var5.class_(rlB_2.byte_.break_(this));
               if (var7 > 0) {
                  float var16 = (Float)var5.throws_[15];
                  float var9 = (Float)var5.throws_[16];
                  float var10 = -rfU_2.class_(var16 * (float) (Math.PI / 180.0)) * rfU_2.break_(var9 * (float) (Math.PI / 180.0));
                  float var11 = -rfU_2.class_(var9 * (float) (Math.PI / 180.0));
                  float var12 = rfU_2.break_(var16 * (float) (Math.PI / 180.0)) * rfU_2.break_(var9 * (float) (Math.PI / 180.0));
                  float var13 = rfU_2.byte_(var10 * var10 + var11 * var11 + var12 * var12);
                  float var14 = 3.0F * ((1.0F + (float)var7) / 4.0F);
                  var10 *= var14 / var13;
                  var11 *= var14 / var13;
                  var12 *= var14 / var13;
                  var5.implements_((double)var10, (double)var11, (double)var12);
                  var5.volatile_(20);
                  if (var5.BL()) {
                     float var15 = 1.1999999F;
                     var5.class_(iG_2.SELF, new rjU_2(0.0, 1.1999999F, 0.0));
                  }

                  rqA_2 var20;
                  if (var7 >= 3) {
                     var20 = rqn_3.dd;
                  } else if (var7 == 2) {
                     var20 = rqn_3.dx;
                  } else {
                     var20 = rqn_3.dJ;
                  }

                  var2.class_((rhd_3)null, var5, var20, rqL_2.PLAYERS, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public rym_3<rdn_3> class_(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.protected_(var3);
      if (var4.catch_() >= var4.private_() - 1) {
         return rym_3.protected_(var4);
      } else if (eA_2.catch_(var4) > 0 && !var2.Pf()) {
         return rym_3.protected_(var4);
      } else {
         var2.break_(var3);
         return rym_3.break_(var4);
      }
   }

   @Override
   public int break_(rdn_3 var1) {
      return 72000;
   }

   @Override
   public int protected_() {
      return 1;
   }
}
