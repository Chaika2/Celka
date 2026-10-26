package celestial;

import com.google.common.collect.ImmutableSet;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GG extends Ev_1 {
   private static String[] id_continue;
   private static double[] id_super;
   private static short[] id_this;
   private static boolean[] id_else;
   private static byte[] id_synchronized;

   @Override
   public EA id_byte(EA var1) {
      super.id_byte(var1);
      if (var1.id_byte() != (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[2]) {
         return var1;
      } else if ((Integer)((Ps_1)this.id_new[1]).id_volatile().id_break[1] < (Integer)((rU_2)this.id_new[3]).id_break[1]) {
         return var1.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[4]);
      } else {
         xc_3 var2 = bw_3.id_class((Ps_1)this.id_new[1], (rU_2)this.id_new[3]);
         if (EF.id_byte(var2) && EF.id_throws((Ps_1)this.id_new[1], (rU_2)this.id_new[4])) {
            var1.id_class(
               new En_1(
                  PJ.id_class(((Ps_1)this.id_new[1]).id_finally(), Pu_1.id_class((rU_2)this.id_new[4]), ((Ps_1)this.id_new[1]).id_protected()), id_else[15]
               )
            );
            rjU_2 var17 = Pu_1.id_class((rU_2)this.id_new[4]);
            if (Math.abs(((Ps_1)this.id_new[1]).id_catch().Ps().id_break - var17.id_break) > 0.2
               || Math.abs(((Ps_1)this.id_new[1]).id_catch().Ps().id_protected - var17.id_protected) > 0.2) {
               var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[27]], true);
            }

            return ((Ps_1)this.id_new[1]).id_volatile().equals((rU_2)this.id_new[4])
               ? var1.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[3])
               : var1;
         } else {
            boolean var3 = var2.id_break() != xu_3.PJ && var2.id_break() != xu_3.BD ? id_else[18] : true;
            boolean var4 = var2.id_break() == xu_3.BD ? true : id_else[20];
            PX var5 = PJ.id_class(
               ((Ps_1)this.id_new[1]).id_finally(),
               Pu_1.id_class((rU_2)this.id_new[6]),
               new PX((Float)((Ps_1)this.id_new[1]).id_catch().id_throws[15], (Float)((Ps_1)this.id_new[1]).id_catch().id_throws[16])
            );
            if (!var3) {
               var1.id_class(new En_1(new PX((Float)((Ps_1)this.id_new[1]).id_catch().id_throws[15], var5.id_protected()), true));
            }

            boolean var6 = !EF.id_break((Ps_1)this.id_new[1], (rU_2)this.id_new[3]) && !var3 ? id_else[23] : true;
            if (var3) {
               Object var18 = var4
                  ? id_class(new EZ((C_case)this.id_new[id_this[41]]), (rU_2)this.id_new[3])
                  : ((rU_2)this.id_new[3]).id_class(var2.id_byte(kc_3.id_volatile).id_case());
               if (var18 == null) {
                  this.id_case(id_continue[0]);
                  return var1.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[4]);
               } else if (!((Ps_1)this.id_new[1]).id_volatile().equals(((rfH_2)var18).id_final())
                  && !((Ps_1)this.id_new[1]).id_volatile().equals((rU_2)this.id_new[4])) {
                  if (EF.id_break(bw_3.id_class((Ps_1)this.id_new[1], ((rU_2)this.id_new[3]).id_case()))) {
                     var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[6], true);
                  }

                  EF.id_class((Ps_1)this.id_new[1], var1, (rfH_2)var18);
                  return var1;
               } else {
                  return var1.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[3]);
               }
            } else if (!((C_class)((C_case)this.id_new[id_this[53]]))
               .id_static()
               .id_class(
                  true,
                  (Integer)((rU_2)this.id_new[3]).id_break[id_this[55]],
                  (Integer)((rU_2)this.id_new[3]).id_break[1],
                  (Integer)((rU_2)this.id_new[3]).id_break[2]
               )) {
               return var1.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[4]);
            } else {
               var1.id_class(
                  (Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7],
                  !(((Ps_1)this.id_new[1]).id_catch().Ps().id_byte > (double)((rU_2)this.id_new[4]).c_())
                        && !(((Ps_1)this.id_new[1]).id_catch().Ps().id_byte < (double)((rU_2)this.id_new[3]).c_() + 0.2)
                     ? id_else[27]
                     : true
               );
               double var7 = ((Ps_1)this.id_new[1]).id_catch().Ps().id_break - ((double)((rU_2)this.id_new[4]).b_() + 0.5);
               double var9 = ((Ps_1)this.id_new[1]).id_catch().Ps().id_protected - ((double)((rU_2)this.id_new[4]).d_() + 0.5);
               double var11 = Math.sqrt(var7 * var7 + var9 * var9);
               double var13 = Math.sqrt(
                  ((Ps_1)this.id_new[1]).id_catch().rv().id_break * ((Ps_1)this.id_new[1]).id_catch().rv().id_break
                     + ((Ps_1)this.id_new[1]).id_catch().rv().id_protected * ((Ps_1)this.id_new[1]).id_catch().rv().id_protected
               );
               if (var11 > 0.17) {
                  var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[74]], true);
                  var1.id_class(new En_1(var5, true));
               } else if (var13 < 0.05) {
                  var1.id_class(
                     (Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[6],
                     ((Ps_1)this.id_new[1]).id_catch().Ps().id_byte < (double)((rU_2)this.id_new[4]).c_() ? true : id_else[31]
                  );
               }

               if (!var6) {
                  xc_3 var15 = bw_3.id_class((Ps_1)this.id_new[1], (rU_2)this.id_new[3]);
                  xd_3 var16 = var15.id_break();
                  if (!(var16 instanceof Ja_1) && !var15.id_byte().id_throws()) {
                     PJ.id_class(((Ps_1)this.id_new[1]).id_catch(), (rU_2)this.id_new[3], ((Ps_1)this.id_new[1]).id_native().id_case())
                        .map(var0 -> new En_1(var0.id_class(), true))
                        .ifPresent(var1::id_class);
                     var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[6], id_else[32]);
                     var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[4], true);
                     var6 = id_else[34];
                  } else if (((Ps_1)this.id_new[1]).id_catch().x()
                     && (((Ps_1)this.id_new[1]).id_class(((rU_2)this.id_new[3]).id_case()) || ((Ps_1)this.id_new[1]).id_class((rU_2)this.id_new[3]))
                     && ((Ps_1)this.id_new[1]).id_catch().Ps().id_byte > (double)((rU_2)this.id_new[4]).c_() + 0.1) {
                     var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], true);
                  }
               }

               return ((Ps_1)this.id_new[1]).id_volatile().equals((rU_2)this.id_new[4]) && var6
                  ? var1.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[3])
                  : var1;
            }
         }
      }
   }

   private static void id_int() {
      id_continue = new String[]{new String("Unable to climb vines. Consider disabling allowVines.")};
   }

   public GG(C_case var1, rU_2 var2, rU_2 var3) {
      rU_2[] var10004 = new rU_2[1];
      var10004[id_else[1]] = var2.id_final(2);
      super(var1, var2, var3, var10004, var2);
   }

   static {
      ntfClinit();
   }

   @Override
   public double id_class(EZ var1) {
      return id_protected(
         var1, (Integer)((rU_2)this.id_new[3]).id_break[id_this[1]], (Integer)((rU_2)this.id_new[3]).id_break[1], (Integer)((rU_2)this.id_new[3]).id_break[2]
      );
   }

   public static rfH_2 id_class(EZ var0, rU_2 var1) {
      if (EF.id_catch(var0.id_class(var1.id_finally()))) {
         return var1.id_finally();
      } else if (EF.id_catch(var0.id_class(var1.id_volatile()))) {
         return var1.id_volatile();
      } else if (EF.id_catch(var0.id_class(var1.id_throws()))) {
         return var1.id_throws();
      } else {
         return EF.id_catch(var0.id_class(var1.id_native())) ? var1.id_native() : null;
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8812872870696033353L;
   }

   @Override
   public boolean id_break(EA var1) {
      if (((Ps_1)this.id_new[1]).id_volatile().equals((rU_2)this.id_new[3]) || ((Ps_1)this.id_new[1]).id_volatile().equals(((rU_2)this.id_new[3]).id_case())) {
         xd_3 var2 = bw_3.id_break((Ps_1)this.id_new[1], ((rU_2)this.id_new[3]).id_case());
         if (var2 == xu_3.PJ || var2 == xu_3.BD) {
            var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7], true);
         }
      }

      return EF.id_throws((Ps_1)this.id_new[1], ((rU_2)this.id_new[4]).id_class()) ? true : super.id_break(var1);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-24, -100, 36, -104, -118, 62, 25, -29}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 141686236;
   }

   public static boolean id_throws(EZ var0, int var1, int var2, int var3) {
      return !EF.id_catch(var0.id_class(var1 + 1, var2, var3))
            && !EF.id_catch(var0.id_class(var1 - 1, var2, var3))
            && !EF.id_catch(var0.id_class(var1, var2, var3 + 1))
            && !EF.id_catch(var0.id_class(var1, var2, var3 - 1))
         ? id_else[14]
         : true;
   }

   private static void id_continue() {
      id_synchronized = new byte[]{2, 2, 2, 3};
   }

   private static void id_new() {
      id_else = new boolean[]{
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         true,
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
         true,
         true,
         false,
         true,
         true,
         true,
         false,
         true,
         true,
         true,
         false,
         false,
         true,
         false,
         true,
         true,
         true,
         true
      };
   }

   private static void id_package() {
      id_this = new short[]{
         3,
         0,
         3,
         1,
         3,
         2,
         3,
         4,
         4,
         16,
         26,
         2,
         1,
         1,
         3,
         1,
         4,
         1,
         3,
         1,
         4,
         1,
         4,
         1,
         4,
         1,
         1,
         0,
         1,
         4,
         3,
         1,
         6,
         1,
         15,
         1,
         16,
         1,
         15,
         1,
         3,
         0,
         3,
         3,
         4,
         1,
         1,
         4,
         3,
         1,
         3,
         6,
         1,
         0,
         3,
         0,
         3,
         1,
         3,
         2,
         4,
         7,
         1,
         4,
         1,
         3,
         1,
         4,
         1,
         4,
         1,
         1,
         1,
         1,
         0,
         6,
         1,
         4,
         1,
         3,
         1,
         3,
         1,
         6,
         4,
         1,
         1,
         3,
         1,
         3,
         1,
         4,
         5,
         1,
         4,
         3,
         1,
         3,
         1,
         3,
         1,
         3,
         7,
         1,
         4
      };
   }

   private static void id_super() {
      id_super = new double[]{
         1000000.0,
         1000000.0,
         1000000.0,
         1000000.0,
         8.51063829787234,
         0.0,
         1000000.0,
         1000000.0,
         0.1,
         1000000.0,
         1000000.0,
         1000000.0,
         1000000.0,
         0.0,
         0.0,
         1000000.0,
         8.51063829787234,
         5.0,
         0.2,
         0.2,
         0.2,
         0.5,
         0.5,
         0.17,
         0.05,
         0.1
      };
   }

   public static double id_protected(EZ var0, int var1, int var2, int var3) {
      xc_3 var4 = var0.id_class(var1, var2, var3);
      xd_3 var5 = var4.id_break();
      boolean var6 = var5 != xu_3.PJ && var5 != xu_3.BD ? id_else[3] : true;
      xc_3 var7 = var0.id_class(var1, var2 - 1, var3);
      if (!var6) {
         if (var7.id_break() == xu_3.PJ || var7.id_break() == xu_3.BD) {
            return 1000000.0;
         }

         if (var7.id_break() instanceof Wg_1 && var7.id_byte(Wg_1.id_volatile) == rCo_1.BOTTOM) {
            return 1000000.0;
         }
      }

      if (var5 == xu_3.BD && !id_throws(var0, var1, var2, var3)) {
         return 1000000.0;
      } else {
         xc_3 var8 = var0.id_class(var1, var2 + 2, var3);
         xd_3 var9 = var8.id_break();
         if (var9 instanceof dq_3) {
            return 1000000.0;
         } else {
            xc_3 var10 = null;
            if (EF.id_byte(var8) && EF.id_byte(var4)) {
               var10 = var0.id_class(var1, var2 + 1, var3);
               if (EF.id_byte(var10)) {
                  return 8.51063829787234;
               }
            }

            double var11 = id_super[5];
            if (!var6) {
               var11 = var0.id_class(var1, var2, var3, var4);
               if (var11 >= 1000000.0) {
                  return 1000000.0;
               }

               if (var7.id_break() instanceof Ja_1) {
                  var11 += 0.1;
               }
            }

            if (EF.id_finally(var4) && !EF.id_case((bw_3)var0.id_break[4], var1, var2 - 1, var3, var7) || EF.id_finally(var7) && (Boolean)var0.id_break[16]) {
               return 1000000.0;
            } else if ((var5 == xu_3.Sr || var5 instanceof xC_2) && !var7.id_volatile().id_byte()) {
               return 1000000.0;
            } else {
               double var13 = EF.id_class(var0, var1, var2 + 2, var3, var8, true);
               if (var13 >= 1000000.0) {
                  return 1000000.0;
               } else {
                  if (var13 != id_super[13]) {
                     if (var9 != xu_3.PJ && var9 != xu_3.BD) {
                        xc_3 var15 = var0.id_class(var1, var2 + 3, var3);
                        if (var15.id_break() instanceof dH_2) {
                           if (var10 == null) {
                              var10 = var0.id_class(var1, var2 + 1, var3);
                           }

                           if (!(var9 instanceof dH_2) || !(var10.id_break() instanceof dH_2)) {
                              return 1000000.0;
                           }
                        }
                     } else {
                        var13 = id_super[14];
                     }
                  }

                  return var6 ? 8.51063829787234 + var13 * 5.0 : id_break + var11 + (Double)var0.id_break[26] + var13;
               }
            }
         }
      }
   }

   @Override
   public Set<rU_2> id_native() {
      return ImmutableSet.of((rU_2)this.id_new[3], (rU_2)this.id_new[4]);
   }
}
