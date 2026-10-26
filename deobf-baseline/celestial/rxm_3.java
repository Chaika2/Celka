package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class rxm_3 extends rkB_2 implements ee_3, rdS_2 {
   public static final rdn_3 id_class = new rdn_3(rdy_3.kW);
   private boolean id_protected = false;
   private boolean id_finally = false;

   @Override
   public Predicate<rdn_3> id_byte() {
      return id_break;
   }

   @Override
   public rkc_3 id_byte(rdn_3 var1) {
      return rkc_3.CROSSBOW;
   }

   public rxm_3(rdO_2 var1) {
      super(var1);
   }

   private rqA_2 id_class(int var1) {
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
   public void id_class(rYB var1, iB_2 var2, rdn_3 var3, int var4) {
      if (!var1.id_continue) {
         int var5 = eA_2.id_class(eY_2.id_void, var3);
         rqA_2 var6 = this.id_class(var5);
         rqA_2 var7 = var5 == 0 ? rqn_3.PL : null;
         float var8 = (float)(var3.id_extends() - var4) / (float)id_private(var3);
         if (var8 < 0.2F) {
            this.id_protected = false;
            this.id_finally = false;
         }

         if (var8 >= 0.2F && !this.id_protected) {
            this.id_protected = true;
            var1.id_class((rhd_3)null, var2.rx(), var2.re(), var2.BO(), var6, rqL_2.PLAYERS, 0.5F, 1.0F);
         }

         if (var8 >= 0.5F && var7 != null && !this.id_finally) {
            this.id_finally = true;
            var1.id_class((rhd_3)null, var2.rx(), var2.re(), var2.BO(), var7, rqL_2.PLAYERS, 0.5F, 1.0F);
         }
      }
   }

   private static void id_class(rYB var0, iB_2 var1, rdn_3 var2) {
      if (var1 instanceof rhN_2 var3) {
         if (!var0.id_continue) {
            Oo_1.id_abstract.id_class(var3, var2);
         }

         var3.id_class(rlB_2.id_byte.id_break(var2.id_break()));
      }

      id_volatile(var2);
   }

   private static float id_class(boolean var0) {
      float var1 = var0 ? 0.63F : 0.43F;
      return 1.0F / (id_private.nextFloat() * 0.5F + 1.8F) + var1;
   }

   @Override
   public rym_3<rdn_3> id_class(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.id_protected(var3);
      if (id_protected(var4)) {
         id_class(var1, var2, var3, var4, id_final(var4), 1.0F);
         id_class(var4, false);
         return rym_3.id_break(var4);
      } else if (!var2.id_case(var4).id_class()) {
         if (!id_protected(var4)) {
            this.id_protected = false;
            this.id_finally = false;
            var2.id_break(var3);
         }

         return rym_3.id_break(var4);
      } else {
         return rym_3.id_protected(var4);
      }
   }

   public static void id_class(rYB var0, iB_2 var1, rpm_3 var2, rdn_3 var3, float var4, float var5) {
      List var6 = id_catch(var3);
      float[] var7 = id_class(var1.Sa());

      for (int var8 = 0; var8 < var6.size(); var8++) {
         rdn_3 var9 = (rdn_3)var6.get(var8);
         boolean var10 = var1 instanceof rhd_3 && ((rhx_3)((rhd_3)var1).id_implements[18]).id_protected;
         if (!var9.id_class()) {
            if (var8 == 0) {
               id_class(var0, var1, var2, var3, var9, var7[var8], var10, var4, var5, 0.0F);
            } else if (var8 == 1) {
               id_class(var0, var1, var2, var3, var9, var7[var8], var10, var4, var5, -10.0F);
            } else if (var8 == 2) {
               id_class(var0, var1, var2, var3, var9, var7[var8], var10, var4, var5, 10.0F);
            }
         }
      }

      id_class(var0, var1, var3);
   }

   private static float[] id_class(Random var0) {
      boolean var1 = var0.nextBoolean();
      return new float[]{1.0F, id_class(var1), id_class(!var1)};
   }

   @Override
   public String id_class(rhd_3 var1, rdn_3 var2) {
      if (var1.id_implements()) {
         return "Inf";
      } else {
         int var3 = id_native(var2);

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
   public void id_class(rdn_3 var1, rYB var2, List<rgP_2> var3, VD var4) {
      List var5 = id_catch(var1);
      if (id_protected(var1) && !var5.isEmpty()) {
         rdn_3 var6 = (rdn_3)var5.get(0);
         var3.add(new rgn_3("item.minecraft.crossbow.projectile").id_break(" ").id_class(var6.id_throw()));
         if (var4.id_class() && var6.id_break() == rdy_3.dc) {
            ArrayList var7 = Lists.newArrayList();
            rdy_3.dc.id_class(var6, var2, var7, var4);
            if (!var7.isEmpty()) {
               for (int var8 = 0; var8 < var7.size(); var8++) {
                  var7.set(var8, new rgN_2("  ").id_class((rgP_2)var7.get(var8)).id_class(rgF_2.GRAY));
               }

               var3.addAll(var7);
            }
         }
      }
   }

   public static float id_class(int var0, rdn_3 var1) {
      float var2 = (float)var0 / (float)id_private(var1);
      if (var2 > 1.0F) {
         var2 = 1.0F;
      }

      return var2;
   }

   @Override
   public void id_class(rdn_3 var1, rYB var2, iB_2 var3, int var4) {
      int var5 = this.id_break(var1) - var4;
      float var6 = id_class(var5, var1);
      if (var6 >= 1.0F && !id_protected(var1) && id_class(var3, var1)) {
         id_class(var1, true);
         rqL_2 var7 = var3 instanceof rhd_3 ? rqL_2.PLAYERS : rqL_2.HOSTILE;
         var2.id_class((rhd_3)null, var3.rx(), var3.re(), var3.BO(), rqn_3.PF, var7, 1.0F, 1.0F / (id_private.nextFloat() * 0.5F + 1.0F) + 0.2F);
      }
   }

   public static void id_class(rdn_3 var0, boolean var1) {
      rcd_3 var2 = var0.id_int();
      var2.id_class("Charged", var1);
   }

   private static boolean id_class(iB_2 var0, rdn_3 var1, rdn_3 var2, boolean var3, boolean var4) {
      if (var2.id_class()) {
         return false;
      } else {
         boolean var5 = var4 && var2.id_break() instanceof rxb_3;
         rdn_3 var6;
         if (!var5 && !var4 && !var3) {
            var6 = var2.id_class(1);
            if (var2.id_class() && var0 instanceof rhd_3) {
               ((rhz_3)((rhd_3)var0).id_implements[1]).id_catch(var2);
            }
         } else {
            var6 = var2.id_implements();
         }

         id_break(var1, var6);
         return true;
      }
   }

   private static boolean id_class(iB_2 var0, rdn_3 var1) {
      int var2 = eA_2.id_class(eY_2.id_float, var1);
      int var3 = var2 == 0 ? 1 : 3;
      boolean var4 = var0 instanceof rhd_3 && ((rhx_3)((rhd_3)var0).id_implements[18]).id_protected;
      rdn_3 var5 = var0.id_case(var1);
      rdn_3 var6 = var5.id_implements();

      for (int var7 = 0; var7 < var3; var7++) {
         if (var7 > 0) {
            var5 = var6.id_implements();
         }

         if (var5.id_class() && var4) {
            var5 = new rdn_3(rdy_3.OO);
            var6 = var5.id_implements();
         }

         if (!id_class(var0, var1, var5, var7 > 0, var4)) {
            return false;
         }
      }

      return true;
   }

   public static boolean id_class(rdn_3 var0, rdb_3 var1) {
      return id_catch(var0).stream().anyMatch(var1x -> var1x.id_break() == var1);
   }

   private static void id_class(rYB var0, iB_2 var1, rpm_3 var2, rdn_3 var3, rdn_3 var4, float var5, boolean var6, float var7, float var8, float var9) {
      if (!var0.id_continue) {
         boolean var10 = var4.id_break() == rdy_3.dc;
         Object var11;
         if (var10) {
            var11 = new rhy_3(var0, var4, var1, var1.rx(), var1.rH() - 0.15F, var1.BO(), true);
         } else {
            var11 = id_class(var0, var1, var3, var4);
            if (var6 || var9 != 0.0F) {
               ((rhm_3)var11).id_protected = rhZ_2.CREATIVE_ONLY;
            }
         }

         if (var1 instanceof aY_2 var12) {
            var12.id_class(var12.I_(), var3, (rhf_3)var11, var9);
         } else {
            rjU_2 var16 = var1.id_continue(1.0F);
            rjY_2 var13 = new rjY_2(new rje_3(var16), var9, true);
            rjU_2 var14 = var1.id_break(1.0F);
            rje_3 var15 = new rje_3(var14);
            var15.id_class(var13);
            ((rhf_3)var11).id_byte((double)var15.id_class(), (double)var15.id_break(), (double)var15.id_byte(), var7, var8);
         }

         var3.id_class(var10 ? 3 : 1, var1, var1x -> var1x.id_byte(var2));
         var0.a_((an_3)var11);
         var0.id_class((rhd_3)null, var1.rx(), var1.re(), var1.BO(), rqn_3.PH, rqL_2.PLAYERS, 1.0F, var5);
      }
   }

   private static rhm_3 id_class(rYB var0, iB_2 var1, rdn_3 var2, rdn_3 var3) {
      rxb_3 var4 = (rxb_3)(var3.id_break() instanceof rxb_3 ? var3.id_break() : rdy_3.OO);
      rhm_3 var5 = var4.id_class(var0, var3, var1);
      if (var1 instanceof rhd_3) {
         var5.id_class(true);
      }

      var5.id_class(rqn_3.Pv);
      var5.id_protected(true);
      int var6 = eA_2.id_class(eY_2.id_static, var2);
      if (var6 > 0) {
         var5.id_break((byte)var6);
      }

      return var5;
   }

   private static void id_break(rdn_3 var0, rdn_3 var1) {
      rcd_3 var2 = var0.id_int();
      rcy_3 var3;
      if (var2.id_byte("ChargedProjectiles", 9)) {
         var3 = var2.id_protected("ChargedProjectiles", 10);
      } else {
         var3 = new rcy_3();
      }

      rcd_3 var4 = new rcd_3();
      var1.id_break(var4);
      var3.add(var4);
      var2.id_class("ChargedProjectiles", var3);
   }

   @Override
   public int id_break(rdn_3 var1) {
      return id_private(var1) + 3;
   }

   @Override
   public int id_throws() {
      return 8;
   }

   @Override
   public rdn_3 id_catch() {
      return id_class;
   }

   public static List<rdn_3> id_catch(rdn_3 var0) {
      ArrayList var1 = Lists.newArrayList();
      rcd_3 var2 = var0.id_package();
      if (var2 != null && var2.id_byte("ChargedProjectiles", 9)) {
         rcy_3 var3 = var2.id_protected("ChargedProjectiles", 10);
         if (var3 != null) {
            for (int var4 = 0; var4 < var3.size(); var4++) {
               rcd_3 var5 = var3.id_class(var4);
               var1.add(rdn_3.id_class(var5));
            }
         }
      }

      return var1;
   }

   public static boolean id_protected(rdn_3 var0) {
      rcd_3 var1 = var0.id_package();
      return var1 != null && var1.id_new("Charged");
   }

   public static int id_private(rdn_3 var0) {
      int var1 = eA_2.id_class(eY_2.id_void, var0);
      return var1 == 0 ? 25 : 25 - 5 * var1;
   }

   @Override
   public Predicate<rdn_3> id_private() {
      return id_byte;
   }

   private static float id_final(rdn_3 var0) {
      return var0.id_break() == rdy_3.kU && id_class(var0, rdy_3.dc) ? 1.6F : 3.15F;
   }

   private static void id_volatile(rdn_3 var0) {
      rcd_3 var1 = var0.id_package();
      if (var1 != null) {
         rcy_3 var2 = var1.id_protected("ChargedProjectiles", 9);
         var2.clear();
         var1.id_class("ChargedProjectiles", var2);
      }
   }

   private static int id_native(rdn_3 var0) {
      rcd_3 var1 = var0.id_package();
      return var1 != null && var1.id_byte("ChargedProjectiles", 9) ? var1.id_protected("ChargedProjectiles", 10).size() : 0;
   }
}
