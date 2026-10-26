package celestial;

import java.util.function.Predicate;

public class rxQ_2 extends rkB_2 implements ee_3, rdS_2 {
   @Override
   public rkc_3 byte_(rdn_3 var1) {
      return rkc_3.BOW;
   }

   @Override
   public Predicate<rdn_3> byte_() {
      return break_;
   }

   public rxQ_2(rdO_2 var1) {
      super(var1);
   }

   @Override
   public String class_(rhd_3 var1, rdn_3 var2) {
      if (var1.implements_()) {
         return "Inf";
      } else {
         int var3 = 0;

         for (int var4 = 0; var4 < 45; var4++) {
            rdn_3 var5 = ((rhz_3)var1.implements_[1]).extends_(var4);
            if (var5.break_() instanceof rxb_3) {
               var3 += var5.char_();
            }
         }

         return var3 + "";
      }
   }

   @Override
   public rym_3<rdn_3> class_(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.protected_(var3);
      boolean var5 = !var2.case_(var4).class_();
      if (!((rhx_3)var2.implements_[18]).protected_ && !var5) {
         return rym_3.protected_(var4);
      } else {
         var2.break_(var3);
         return rym_3.break_(var4);
      }
   }

   @Override
   public void class_(rdn_3 var1, rYB var2, iB_2 var3, int var4) {
      if (var3 instanceof rhd_3 var5) {
         boolean var6 = ((rhx_3)var5.implements_[18]).protected_ || eA_2.class_(eY_2.try_, var1) > 0;
         rdn_3 var7 = var5.case_(var1);
         if (!var7.class_() || var6) {
            if (var7.class_()) {
               var7 = new rdn_3(rdy_3.OO);
            }

            int var8 = this.break_(var1) - var4;
            float var9 = class_(var8);
            if (!((double)var9 < 0.1)) {
               boolean var10 = var6 && var7.break_() == rdy_3.OO;
               if (!var2.continue_) {
                  rxb_3 var11 = (rxb_3)(var7.break_() instanceof rxb_3 ? var7.break_() : rdy_3.OO);
                  rhm_3 var12 = var11.class_(var2, var7, var5);
                  var12.class_(var5, (Float)var5.throws_[16], (Float)var5.throws_[15], 0.0F, var9 * 3.0F, 1.0F);
                  if (var9 == 1.0F) {
                     var12.class_(true);
                  }

                  int var13 = eA_2.class_(eY_2.public_, var1);
                  if (var13 > 0) {
                     var12.private_(var12.private_() + (double)var13 * 0.5 + 0.5);
                  }

                  int var14 = eA_2.class_(eY_2.goto_, var1);
                  if (var14 > 0) {
                     var12.class_(var14);
                  }

                  if (eA_2.class_(eY_2.while_, var1) > 0) {
                     var12.case_(100);
                  }

                  var1.class_(1, var5, var1x -> var1x.byte_(var5.P()));
                  if (var10 || ((rhx_3)var5.implements_[18]).protected_ && (var7.break_() == rdy_3.kW || var7.break_() == rdy_3.kz)) {
                     var12.protected_ = rhZ_2.CREATIVE_ONLY;
                  }

                  var2.a_(var12);
               }

               var2.class_(null, var5.rx(), var5.re(), var5.BO(), rqn_3.s, rqL_2.PLAYERS, 1.0F, 1.0F / (private_.nextFloat() * 0.4F + 1.2F) + var9 * 0.5F);
               if (!var10 && !((rhx_3)var5.implements_[18]).protected_) {
                  var7.catch_(1);
                  if (var7.class_()) {
                     ((rhz_3)var5.implements_[1]).catch_(var7);
                  }
               }

               var5.class_(rlB_2.byte_.break_(this));
            }
         }
      }
   }

   public static float class_(float var0) {
      float var1 = var0 / 20.0F;
      var1 = (var1 * var1 + var1 * 2.0F) / 3.0F;
      if (var1 > 1.0F) {
         var1 = 1.0F;
      }

      return var1;
   }

   public static float class_(int var0) {
      return class_((float)var0);
   }

   @Override
   public int break_(rdn_3 var1) {
      return 72000;
   }

   @Override
   public int throws_() {
      return 15;
   }

   @Override
   public rdn_3 catch_() {
      return rxm_3.class_;
   }
}
