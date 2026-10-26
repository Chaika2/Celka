package celestial;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class rkN_2 extends rdb_3 implements ee_3 {
   private final Multimap<iJ_2, ix_3> id_class;

   @Override
   public rkc_3 id_byte(rdn_3 var1) {
      return rkc_3.SPEAR;
   }

   public rkN_2(rdO_2 var1) {
      super(var1);
      Builder var2 = ImmutableMultimap.builder();
      var2.put(iQ_2.id_case, new ix_3(id_case, "Tool modifier", 8.0, id_3.ADDITION));
      var2.put(iQ_2.id_private, new ix_3(id_catch, "Tool modifier", -2.9F, id_3.ADDITION));
      this.id_class = var2.build();
   }

   @Override
   public boolean id_class(rdn_3 var1, iB_2 var2, iB_2 var3) {
      var1.id_class(1, var3, var0 -> var0.id_break(rXQ.MAINHAND));
      return true;
   }

   @Override
   public boolean id_class(rdn_3 var1, rYB var2, xc_3 var3, rfH_2 var4, iB_2 var5) {
      if ((double)var3.id_private(var2, var4) != 0.0) {
         var1.id_class(2, var5, var0 -> var0.id_break(rXQ.MAINHAND));
      }

      return true;
   }

   @Override
   public Multimap<iJ_2, ix_3> id_class(rXQ var1) {
      return var1 == rXQ.MAINHAND ? this.id_class : super.id_class(var1);
   }

   @Override
   public boolean id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4) {
      return !var4.id_implements();
   }

   @Override
   public void id_class(rdn_3 var1, rYB var2, iB_2 var3, int var4) {
      if (var3 instanceof rhd_3 var5) {
         int var6 = this.id_break(var1) - var4;
         if (var6 >= 10) {
            int var7 = eA_2.id_catch(var1);
            if (var7 <= 0 || var5.Pf()) {
               if (!var2.id_continue) {
                  var1.id_class(1, var5, var1x -> var1x.id_byte(var3.P()));
                  if (var7 == 0) {
                     rhD_2 var8 = new rhD_2(var2, var5, var1);
                     var8.id_class(var5, (Float)var5.id_throws[16], (Float)var5.id_throws[15], 0.0F, 2.5F + (float)var7 * 0.5F, 1.0F);
                     if (((rhx_3)var5.id_implements[18]).id_protected) {
                        var8.id_protected = rhZ_2.CREATIVE_ONLY;
                     }

                     var2.a_(var8);
                     var2.id_class((rhd_3)null, var8, rqn_3.dk, rqL_2.PLAYERS, 1.0F, 1.0F);
                     if (!((rhx_3)var5.id_implements[18]).id_protected) {
                        ((rhz_3)var5.id_implements[1]).id_catch(var1);
                     }
                  }
               }

               var5.id_class(rlB_2.id_byte.id_break(this));
               if (var7 > 0) {
                  float var16 = (Float)var5.id_throws[15];
                  float var9 = (Float)var5.id_throws[16];
                  float var10 = -rfU_2.id_class(var16 * (float) (Math.PI / 180.0)) * rfU_2.id_break(var9 * (float) (Math.PI / 180.0));
                  float var11 = -rfU_2.id_class(var9 * (float) (Math.PI / 180.0));
                  float var12 = rfU_2.id_break(var16 * (float) (Math.PI / 180.0)) * rfU_2.id_break(var9 * (float) (Math.PI / 180.0));
                  float var13 = rfU_2.id_byte(var10 * var10 + var11 * var11 + var12 * var12);
                  float var14 = 3.0F * ((1.0F + (float)var7) / 4.0F);
                  var10 *= var14 / var13;
                  var11 *= var14 / var13;
                  var12 *= var14 / var13;
                  var5.id_implements((double)var10, (double)var11, (double)var12);
                  var5.id_volatile(20);
                  if (var5.BL()) {
                     float var15 = 1.1999999F;
                     var5.id_class(iG_2.SELF, new rjU_2(0.0, 1.1999999F, 0.0));
                  }

                  rqA_2 var20;
                  if (var7 >= 3) {
                     var20 = rqn_3.dd;
                  } else if (var7 == 2) {
                     var20 = rqn_3.dx;
                  } else {
                     var20 = rqn_3.dJ;
                  }

                  var2.id_class((rhd_3)null, var5, var20, rqL_2.PLAYERS, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public rym_3<rdn_3> id_class(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.id_protected(var3);
      if (var4.id_catch() >= var4.id_private() - 1) {
         return rym_3.id_protected(var4);
      } else if (eA_2.id_catch(var4) > 0 && !var2.Pf()) {
         return rym_3.id_protected(var4);
      } else {
         var2.id_break(var3);
         return rym_3.id_break(var4);
      }
   }

   @Override
   public int id_break(rdn_3 var1) {
      return 72000;
   }

   @Override
   public int id_protected() {
      return 1;
   }
}
