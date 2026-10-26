package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class rxm_3 extends rkB_2 implements ee_3, rdS_2 {
   public static final rdn_3 class_ = new rdn_3(rdy_3.kW);
   private boolean protected_ = false;
   private boolean finally_ = false;

   @Override
   public Predicate<rdn_3> byte_() {
      return break_;
   }

   @Override
   public rkc_3 byte_(rdn_3 var1) {
      return rkc_3.CROSSBOW;
   }

   public rxm_3(rdO_2 var1) {
      super(var1);
   }

   private rqA_2 class_(int var1) {
      switch (var1) {
         case 1:
            return rqn_3.Pn;
         case 2:
            return rqn_3.PC;
         case 3:
            return rqn_3.Pl;
         default:
            return rqn_3.PA;
      }
   }

   @Override
   public void class_(rYB var1, iB_2 var2, rdn_3 var3, int var4) {
      if (!var1.continue_) {
         int var5 = eA_2.class_(eY_2.void_, var3);
         rqA_2 var6 = this.class_(var5);
         rqA_2 var7 = var5 == 0 ? rqn_3.PL : null;
         float var8 = (float)(var3.extends_() - var4) / (float)private_(var3);
         if (var8 < 0.2F) {
            this.protected_ = false;
            this.finally_ = false;
         }

         if (var8 >= 0.2F && !this.protected_) {
            this.protected_ = true;
            var1.class_((rhd_3)null, var2.rx(), var2.re(), var2.BO(), var6, rqL_2.PLAYERS, 0.5F, 1.0F);
         }

         if (var8 >= 0.5F && var7 != null && !this.finally_) {
            this.finally_ = true;
            var1.class_((rhd_3)null, var2.rx(), var2.re(), var2.BO(), var7, rqL_2.PLAYERS, 0.5F, 1.0F);
         }
      }
   }

   private static void class_(rYB var0, iB_2 var1, rdn_3 var2) {
      if (var1 instanceof rhN_2 var3) {
         if (!var0.continue_) {
            Oo_1.abstract_.class_(var3, var2);
         }

         var3.class_(rlB_2.byte_.break_(var2.break_()));
      }

      volatile_(var2);
   }

   private static float class_(boolean var0) {
      float var1 = var0 ? 0.63F : 0.43F;
      return 1.0F / (private_.nextFloat() * 0.5F + 1.8F) + var1;
   }

   @Override
   public rym_3<rdn_3> class_(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.protected_(var3);
      if (protected_(var4)) {
         class_(var1, var2, var3, var4, final_(var4), 1.0F);
         class_(var4, false);
         return rym_3.break_(var4);
      } else if (!var2.case_(var4).class_()) {
         if (!protected_(var4)) {
            this.protected_ = false;
            this.finally_ = false;
            var2.break_(var3);
         }

         return rym_3.break_(var4);
      } else {
         return rym_3.protected_(var4);
      }
   }

   public static void class_(rYB var0, iB_2 var1, rpm_3 var2, rdn_3 var3, float var4, float var5) {
      List var6 = catch_(var3);
      float[] var7 = class_(var1.Sa());

      for (int var8 = 0; var8 < var6.size(); var8++) {
         rdn_3 var9 = (rdn_3)var6.get(var8);
         boolean var10 = var1 instanceof rhd_3 && ((rhx_3)((rhd_3)var1).implements_[18]).protected_;
         if (!var9.class_()) {
            if (var8 == 0) {
               class_(var0, var1, var2, var3, var9, var7[var8], var10, var4, var5, 0.0F);
            } else if (var8 == 1) {
               class_(var0, var1, var2, var3, var9, var7[var8], var10, var4, var5, -10.0F);
            } else if (var8 == 2) {
               class_(var0, var1, var2, var3, var9, var7[var8], var10, var4, var5, 10.0F);
            }
         }
      }

      class_(var0, var1, var3);
   }

   private static float[] class_(Random var0) {
      boolean var1 = var0.nextBoolean();
      return new float[]{1.0F, class_(var1), class_(!var1)};
   }

   @Override
   public String class_(rhd_3 var1, rdn_3 var2) {
      if (var1.implements_()) {
         return "Inf";
      } else {
         int var3 = native_(var2);

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
   public void class_(rdn_3 var1, rYB var2, List<rgP_2> var3, VD var4) {
      List var5 = catch_(var1);
      if (protected_(var1) && !var5.isEmpty()) {
         rdn_3 var6 = (rdn_3)var5.get(0);
         var3.add(new rgn_3("item.minecraft.crossbow.projectile").break_(" ").class_(var6.throw_()));
         if (var4.class_() && var6.break_() == rdy_3.dc) {
            ArrayList var7 = Lists.newArrayList();
            rdy_3.dc.class_(var6, var2, var7, var4);
            if (!var7.isEmpty()) {
               for (int var8 = 0; var8 < var7.size(); var8++) {
                  var7.set(var8, new rgN_2("  ").class_((rgP_2)var7.get(var8)).class_(rgF_2.GRAY));
               }

               var3.addAll(var7);
            }
         }
      }
   }

   public static float class_(int var0, rdn_3 var1) {
      float var2 = (float)var0 / (float)private_(var1);
      if (var2 > 1.0F) {
         var2 = 1.0F;
      }

      return var2;
   }

   @Override
   public void class_(rdn_3 var1, rYB var2, iB_2 var3, int var4) {
      int var5 = this.break_(var1) - var4;
      float var6 = class_(var5, var1);
      if (var6 >= 1.0F && !protected_(var1) && class_(var3, var1)) {
         class_(var1, true);
         rqL_2 var7 = var3 instanceof rhd_3 ? rqL_2.PLAYERS : rqL_2.HOSTILE;
         var2.class_((rhd_3)null, var3.rx(), var3.re(), var3.BO(), rqn_3.PF, var7, 1.0F, 1.0F / (private_.nextFloat() * 0.5F + 1.0F) + 0.2F);
      }
   }

   public static void class_(rdn_3 var0, boolean var1) {
      rcd_3 var2 = var0.int_();
      var2.class_("Charged", var1);
   }

   private static boolean class_(iB_2 var0, rdn_3 var1, rdn_3 var2, boolean var3, boolean var4) {
      if (var2.class_()) {
         return false;
      } else {
         boolean var5 = var4 && var2.break_() instanceof rxb_3;
         rdn_3 var6;
         if (!var5 && !var4 && !var3) {
            var6 = var2.class_(1);
            if (var2.class_() && var0 instanceof rhd_3) {
               ((rhz_3)((rhd_3)var0).implements_[1]).catch_(var2);
            }
         } else {
            var6 = var2.implements_();
         }

         break_(var1, var6);
         return true;
      }
   }

   private static boolean class_(iB_2 var0, rdn_3 var1) {
      int var2 = eA_2.class_(eY_2.float_, var1);
      int var3 = var2 == 0 ? 1 : 3;
      boolean var4 = var0 instanceof rhd_3 && ((rhx_3)((rhd_3)var0).implements_[18]).protected_;
      rdn_3 var5 = var0.case_(var1);
      rdn_3 var6 = var5.implements_();

      for (int var7 = 0; var7 < var3; var7++) {
         if (var7 > 0) {
            var5 = var6.implements_();
         }

         if (var5.class_() && var4) {
            var5 = new rdn_3(rdy_3.OO);
            var6 = var5.implements_();
         }

         if (!class_(var0, var1, var5, var7 > 0, var4)) {
            return false;
         }
      }

      return true;
   }

   public static boolean class_(rdn_3 var0, rdb_3 var1) {
      return catch_(var0).stream().anyMatch(var1x -> var1x.break_() == var1);
   }

   private static void class_(rYB var0, iB_2 var1, rpm_3 var2, rdn_3 var3, rdn_3 var4, float var5, boolean var6, float var7, float var8, float var9) {
      if (!var0.continue_) {
         boolean var10 = var4.break_() == rdy_3.dc;
         Object var11;
         if (var10) {
            var11 = new rhy_3(var0, var4, var1, var1.rx(), var1.rH() - 0.15F, var1.BO(), true);
         } else {
            var11 = class_(var0, var1, var3, var4);
            if (var6 || var9 != 0.0F) {
               ((rhm_3)var11).protected_ = rhZ_2.CREATIVE_ONLY;
            }
         }

         if (var1 instanceof aY_2 var12) {
            var12.class_(var12.I_(), var3, (rhf_3)var11, var9);
         } else {
            rjU_2 var16 = var1.continue_(1.0F);
            rjY_2 var13 = new rjY_2(new rje_3(var16), var9, true);
            rjU_2 var14 = var1.break_(1.0F);
            rje_3 var15 = new rje_3(var14);
            var15.class_(var13);
            ((rhf_3)var11).byte_((double)var15.class_(), (double)var15.break_(), (double)var15.byte_(), var7, var8);
         }

         var3.class_(var10 ? 3 : 1, var1, var1x -> var1x.byte_(var2));
         var0.a_((an_3)var11);
         var0.class_((rhd_3)null, var1.rx(), var1.re(), var1.BO(), rqn_3.PH, rqL_2.PLAYERS, 1.0F, var5);
      }
   }

   private static rhm_3 class_(rYB var0, iB_2 var1, rdn_3 var2, rdn_3 var3) {
      rxb_3 var4 = (rxb_3)(var3.break_() instanceof rxb_3 ? var3.break_() : rdy_3.OO);
      rhm_3 var5 = var4.class_(var0, var3, var1);
      if (var1 instanceof rhd_3) {
         var5.class_(true);
      }

      var5.class_(rqn_3.Pv);
      var5.protected_(true);
      int var6 = eA_2.class_(eY_2.static_, var2);
      if (var6 > 0) {
         var5.break_((byte)var6);
      }

      return var5;
   }

   private static void break_(rdn_3 var0, rdn_3 var1) {
      rcd_3 var2 = var0.int_();
      rcy_3 var3;
      if (var2.byte_("ChargedProjectiles", 9)) {
         var3 = var2.protected_("ChargedProjectiles", 10);
      } else {
         var3 = new rcy_3();
      }

      rcd_3 var4 = new rcd_3();
      var1.break_(var4);
      var3.add(var4);
      var2.class_("ChargedProjectiles", var3);
   }

   @Override
   public int break_(rdn_3 var1) {
      return private_(var1) + 3;
   }

   @Override
   public int throws_() {
      return 8;
   }

   @Override
   public rdn_3 catch_() {
      return class_;
   }

   public static List<rdn_3> catch_(rdn_3 var0) {
      ArrayList var1 = Lists.newArrayList();
      rcd_3 var2 = var0.package_();
      if (var2 != null && var2.byte_("ChargedProjectiles", 9)) {
         rcy_3 var3 = var2.protected_("ChargedProjectiles", 10);
         if (var3 != null) {
            for (int var4 = 0; var4 < var3.size(); var4++) {
               rcd_3 var5 = var3.class_(var4);
               var1.add(rdn_3.class_(var5));
            }
         }
      }

      return var1;
   }

   public static boolean protected_(rdn_3 var0) {
      rcd_3 var1 = var0.package_();
      return var1 != null && var1.new_("Charged");
   }

   public static int private_(rdn_3 var0) {
      int var1 = eA_2.class_(eY_2.void_, var0);
      return var1 == 0 ? 25 : 25 - 5 * var1;
   }

   @Override
   public Predicate<rdn_3> private_() {
      return byte_;
   }

   private static float final_(rdn_3 var0) {
      return var0.break_() == rdy_3.kU && class_(var0, rdy_3.dc) ? 1.6F : 3.15F;
   }

   private static void volatile_(rdn_3 var0) {
      rcd_3 var1 = var0.package_();
      if (var1 != null) {
         rcy_3 var2 = var1.protected_("ChargedProjectiles", 9);
         var2.clear();
         var1.class_("ChargedProjectiles", var2);
      }
   }

   private static int native_(rdn_3 var0) {
      rcd_3 var1 = var0.package_();
      return var1 != null && var1.byte_("ChargedProjectiles", 9) ? var1.protected_("ChargedProjectiles", 10).size() : 0;
   }
}
