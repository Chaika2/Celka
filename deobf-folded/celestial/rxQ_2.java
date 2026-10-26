package celestial;

import java.util.function.Predicate;

public class rxQ_2 extends rkB_2 implements ee_3, rdS_2 {
   @Override
   public rkc_3 id_byte(rdn_3 var1) {
      return rkc_3.BOW;
   }

   @Override
   public Predicate<rdn_3> id_byte() {
      return id_break;
   }

   public rxQ_2(rdO_2 var1) {
      super(var1);
   }

   @Override
   public String id_class(rhd_3 var1, rdn_3 var2) {
      if (var1.id_implements()) {
         return "Inf";
      } else {
         int var3 = 0;

         for (int var4 = 0; var4 < 45; var4++) {
            rdn_3 var5 = ((rhz_3)var1.id_implements[1]).id_extends(var4);
            if (var5.id_break() instanceof rxb_3) {
               var3 += var5.id_char();
            }
         }

         return var3 + "";
      }
   }

   @Override
   public rym_3<rdn_3> id_class(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.id_protected(var3);
      boolean var5 = !var2.id_case(var4).id_class();
      if (!((rhx_3)var2.id_implements[18]).id_protected && !var5) {
         return rym_3.id_protected(var4);
      } else {
         var2.id_break(var3);
         return rym_3.id_break(var4);
      }
   }

   @Override
   public void id_class(rdn_3 var1, rYB var2, iB_2 var3, int var4) {
      if (var3 instanceof rhd_3 var5) {
         boolean var6 = ((rhx_3)var5.id_implements[18]).id_protected || eA_2.id_class(eY_2.id_try, var1) > 0;
         rdn_3 var7 = var5.id_case(var1);
         if (!var7.id_class() || var6) {
            if (var7.id_class()) {
               var7 = new rdn_3(rdy_3.OO);
            }

            int var8 = this.id_break(var1) - var4;
            float var9 = id_class(var8);
            if (!((double)var9 < 0.1)) {
               boolean var10 = var6 && var7.id_break() == rdy_3.OO;
               if (!var2.id_continue) {
                  rxb_3 var11 = (rxb_3)(var7.id_break() instanceof rxb_3 ? var7.id_break() : rdy_3.OO);
                  rhm_3 var12 = var11.id_class(var2, var7, var5);
                  var12.id_class(var5, (Float)var5.id_throws[16], (Float)var5.id_throws[15], 0.0F, var9 * 3.0F, 1.0F);
                  if (var9 == 1.0F) {
                     var12.id_class(true);
                  }

                  int var13 = eA_2.id_class(eY_2.id_public, var1);
                  if (var13 > 0) {
                     var12.id_private(var12.id_private() + (double)var13 * 0.5 + 0.5);
                  }

                  int var14 = eA_2.id_class(eY_2.id_goto, var1);
                  if (var14 > 0) {
                     var12.id_class(var14);
                  }

                  if (eA_2.id_class(eY_2.id_while, var1) > 0) {
                     var12.id_case(100);
                  }

                  var1.id_class(1, var5, var1x -> var1x.id_byte(var5.P()));
                  if (var10 || ((rhx_3)var5.id_implements[18]).id_protected && (var7.id_break() == rdy_3.kW || var7.id_break() == rdy_3.kz)) {
                     var12.id_protected = rhZ_2.CREATIVE_ONLY;
                  }

                  var2.a_(var12);
               }

               var2.id_class(null, var5.rx(), var5.re(), var5.BO(), rqn_3.s, rqL_2.PLAYERS, 1.0F, 1.0F / (id_private.nextFloat() * 0.4F + 1.2F) + var9 * 0.5F);
               if (!var10 && !((rhx_3)var5.id_implements[18]).id_protected) {
                  var7.id_catch(1);
                  if (var7.id_class()) {
                     ((rhz_3)var5.id_implements[1]).id_catch(var7);
                  }
               }

               var5.id_class(rlB_2.id_byte.id_break(this));
            }
         }
      }
   }

   public static float id_class(float var0) {
      float var1 = var0 / 20.0F;
      var1 = (var1 * var1 + var1 * 2.0F) / 3.0F;
      if (var1 > 1.0F) {
         var1 = 1.0F;
      }

      return var1;
   }

   public static float id_class(int var0) {
      return id_class((float)var0);
   }

   @Override
   public int id_break(rdn_3 var1) {
      return 72000;
   }

   @Override
   public int id_throws() {
      return 15;
   }

   @Override
   public rdn_3 id_catch() {
      return rxm_3.id_class;
   }
}
