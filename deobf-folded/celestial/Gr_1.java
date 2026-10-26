package celestial;

import com.google.common.collect.ImmutableSet;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gr_1 extends Ev_1 {
   private static double[] id_super;
   public Object[] id_continue;
   private static boolean[] id_this;
   private static short[] id_else;
   private static byte[] id_synchronized;

   @Override
   public EA id_byte(EA var1) {
      this.id_int();
      if ((Integer)((Ps_1)this.id_new[1]).id_volatile().id_break[1] < (Integer)((rU_2)this.id_new[3]).id_break[1]) {
         return var1.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[4]);
      } else {
         super.id_byte(var1);
         if (var1.id_byte() != (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[2]) {
            return var1;
         } else if (!((Ps_1)this.id_new[1]).id_volatile().equals((rU_2)this.id_new[4])
            && !((Ps_1)this.id_new[1]).id_volatile().equals(((rU_2)this.id_new[4]).id_break(this.id_byte().id_break()))) {
            xc_3 var2 = bw_3.id_class((Ps_1)this.id_new[1], (rU_2)this.id_new[6]);
            if (!EF.id_class((Ps_1)this.id_new[1], (rU_2)this.id_new[6], var2)) {
               Integer var15 = (Integer)this.id_continue[id_else[38]] + 1;
               this.id_continue[id_else[39]] = var15;
               if (EF.id_class(var1, (C_case)this.id_new[id_else[40]], ((rU_2)this.id_new[4]).id_case(), id_this[14], true)
                  == (EL)EL.staticFieldse3b1cfc58f9d3b6596ccfd637c5fdb13[id_else[42]]) {
                  var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7], true);
                  if (((Ps_1)this.id_new[1]).id_catch().x()) {
                     var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], true);
                  }
               }

               if ((Integer)this.id_continue[id_else[46]] > 10) {
                  var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[1], true);
               }

               return var1;
            } else {
               EF.id_class((Ps_1)this.id_new[1], var1, (rU_2)this.id_new[4]);
               if (EF.id_break(var2) && !EF.id_break(bw_3.id_class((Ps_1)this.id_new[1], ((rU_2)this.id_new[3]).id_case()))) {
                  return var1;
               } else if (!(Boolean)C_class.id_instanceof().rN.id_class[id_else[52]]
                  && !((Ps_1)this.id_new[1]).id_volatile().equals(((rU_2)this.id_new[3]).id_class())) {
                  int var3 = Math.abs(((rU_2)this.id_new[3]).b_() - ((rU_2)this.id_new[4]).b_());
                  int var4 = Math.abs(((rU_2)this.id_new[3]).d_() - ((rU_2)this.id_new[4]).d_());
                  double var5 = (double)var3 * Math.abs((double)((rU_2)this.id_new[4]).b_() + 0.5 - ((Ps_1)this.id_new[1]).id_catch().Ps().id_break)
                     + (double)var4 * Math.abs((double)((rU_2)this.id_new[4]).d_() + 0.5 - ((Ps_1)this.id_new[1]).id_catch().Ps().id_protected);
                  double var7 = (double)var4 * Math.abs((double)((rU_2)this.id_new[4]).b_() + 0.5 - ((Ps_1)this.id_new[1]).id_catch().Ps().id_break)
                     + (double)var3 * Math.abs((double)((rU_2)this.id_new[4]).d_() + 0.5 - ((Ps_1)this.id_new[1]).id_catch().Ps().id_protected);
                  double var9 = (double)var3 * ((Ps_1)this.id_new[1]).id_catch().rv().id_protected
                     + (double)var4 * ((Ps_1)this.id_new[1]).id_catch().rv().id_break;
                  if (Math.abs(var9) > 0.1) {
                     return var1;
                  } else if (this.id_package()) {
                     return var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[6], true);
                  } else {
                     return !(var5 > 1.2) && !(var7 > 0.2) ? var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[6], true) : var1;
                  }
               } else {
                  return var1;
               }
            }
         } else {
            return var1.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[3]);
         }
      }
   }

   private void id_int() {
      if (this.id_continue == null) {
         this.id_continue = new Object[1];
         Object[] var1 = this.id_continue;
         var1[id_this[27]] = Integer.valueOf(id_this[28]);
      }
   }

   public Gr_1(C_case var1, rU_2 var2, rU_2 var3) {
      rU_2[] var10004 = new rU_2[3];
      var10004[id_this[0]] = var3;
      var10004[1] = var2.id_final(2);
      var10004[2] = var3.id_class();
      super(var1, var2, var3, var10004, var3.id_case());
      this.id_int();
      Integer var8 = Integer.valueOf(id_this[2]);
      this.id_continue[id_else[0]] = var8;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_this = new boolean[]{
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         true,
         true,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         false
      };
   }

   public static double id_class(EZ var0, int var1, int var2, int var3, int var4, int var5) {
      xc_3 var6 = var0.id_class(var4, var2, var5);
      double var7 = id_super[0];
      if (!EF.id_class(var0, var4, var2, var5, var6)) {
         var7 = var0.id_class(var4, var2, var5, var6);
         if (var7 >= 1000000.0) {
            return 1000000.0;
         }

         if (!EF.id_break(var4, var2, var5, var6, (bw_3)var0.id_break[4])) {
            return 1000000.0;
         }

         boolean var9 = id_this[4];

         for (int var10 = id_this[5]; var10 < 5; var10++) {
            int var11 = var4 + ((rpr_3[])id_class[id_else[17]])[var10].id_implements();
            int var12 = var2 + ((rpr_3[])id_class[id_else[18]])[var10].id_finally();
            int var13 = var5 + ((rpr_3[])id_class[id_else[19]])[var10].id_extends();
            if ((var11 != var1 || var13 != var3) && EF.id_class((bw_3)var0.id_break[4], var11, var12, var13)) {
               var9 = true;
               break;
            }
         }

         if (!var9) {
            return 1000000.0;
         }
      }

      xc_3 var17 = var0.id_class(var1, var2 + 2, var3);
      if (!(var0.id_class(var1, var2 + 3, var3).id_break() instanceof dH_2) || !EF.id_byte(var0, var1, var2 + 1, var3) && var17.id_break() instanceof dH_2) {
         xc_3 var18 = var0.id_class(var1, var2 - 1, var3);
         if (var18.id_break() != xu_3.PJ && var18.id_break() != xu_3.BD) {
            boolean var19 = EF.id_break(var18);
            boolean var20 = EF.id_break(var6);
            if (var19 && !var20) {
               return 1000000.0;
            } else {
               double var22;
               if (var20) {
                  if (var19) {
                     var22 = Math.max(id_break, 4.63284688441047);
                     var22 += var0.id_break[26];
                  } else {
                     var22 = 4.63284688441047;
                  }
               } else {
                  if (var6.id_break() == xu_3.PY) {
                     var22 = 9.26569376882094;
                  } else {
                     var22 = Math.max(id_break, 4.63284688441047);
                  }

                  var22 += var0.id_break[26];
               }

               double var15 = var22 + var7;
               var15 += EF.id_class(var0, var1, var2 + 2, var3, var17, id_this[9]);
               if (var15 >= 1000000.0) {
                  return 1000000.0;
               } else {
                  var15 += EF.id_class(var0, var4, var2 + 1, var5, id_this[11]);
                  return var15 >= 1000000.0 ? 1000000.0 : var15 + EF.id_class(var0, var4, var2 + 2, var5, true);
               }
            }
         } else {
            return 1000000.0;
         }
      } else {
         return 1000000.0;
      }
   }

   @Override
   public double id_class(EZ var1) {
      return id_class(
         var1,
         (Integer)((rU_2)this.id_new[3]).id_break[id_else[3]],
         (Integer)((rU_2)this.id_new[3]).id_break[1],
         (Integer)((rU_2)this.id_new[3]).id_break[2],
         (Integer)((rU_2)this.id_new[4]).id_break[id_else[9]],
         (Integer)((rU_2)this.id_new[4]).id_break[2]
      );
   }

   @Override
   public boolean id_class(EA var1) {
      this.id_int();
      return var1.id_byte() == (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[2] && this.id_continue[id_else[74]] != 0 ? id_this[25] : true;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6994590195772881644L;
   }

   @Override
   public void id_class() {
      this.id_int();
      super.id_class();
      Integer var5 = Integer.valueOf(id_this[3]);
      this.id_continue[id_else[1]] = var5;
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -753247137;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-72, 40, 10, 99, 89, 103, -79, -21}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_synchronized = new byte[]{3, 2, 2, 5, 2, 3, 2, 2, 10, 2, 4};
   }

   private static void id_new() {
      id_else = new short[]{
         0,
         0,
         3,
         0,
         3,
         1,
         3,
         2,
         4,
         0,
         4,
         2,
         3,
         3,
         3,
         4,
         4,
         0,
         0,
         0,
         4,
         26,
         26,
         1,
         1,
         3,
         1,
         4,
         2,
         1,
         4,
         1,
         4,
         3,
         1,
         6,
         1,
         6,
         0,
         0,
         0,
         4,
         0,
         7,
         1,
         5,
         0,
         1,
         1,
         4,
         1,
         3,
         0,
         1,
         3,
         3,
         4,
         3,
         4,
         4,
         1,
         4,
         1,
         4,
         1,
         4,
         1,
         1,
         1,
         6,
         6,
         3,
         1,
         2,
         0
      };
   }

   public boolean id_package() {
      rU_2 var1 = ((rU_2)this.id_new[3]).id_final(2);

      for (int var2 = id_this[21]; var2 < 4; var2++) {
         rU_2 var3 = var1.id_class(rpr_3.id_break(var2));
         if (!EF.id_class((Ps_1)this.id_new[1], var3)) {
            return id_this[22];
         }
      }

      return true;
   }

   private static void id_super() {
      id_super = new double[]{
         0.0,
         1000000.0,
         1000000.0,
         1000000.0,
         1000000.0,
         1000000.0,
         1000000.0,
         1000000.0,
         4.63284688441047,
         4.63284688441047,
         9.26569376882094,
         4.63284688441047,
         1000000.0,
         1000000.0,
         1000000.0,
         1000000.0,
         0.5,
         0.5,
         0.5,
         0.5,
         0.1,
         1.2,
         0.2
      };
   }

   @Override
   public Set<rU_2> id_native() {
      rU_2 var1 = new rU_2(((rU_2)this.id_new[3]).id_byte(this.id_byte()).id_final());
      return ImmutableSet.of((rU_2)this.id_new[3], ((rU_2)this.id_new[3]).id_class(), (rU_2)this.id_new[4], var1, var1.id_class());
   }
}
