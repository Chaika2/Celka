package celestial;

import com.google.common.collect.ImmutableSet;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GB extends Ev_1 {
   private static byte[] id_super;
   public static Object[] id_continue;
   private static double[] id_this;
   private static short[] id_else;
   private static boolean[] id_synchronized;

   @Override
   public List<rfH_2> id_byte(bw_3 var1) {
      if ((List)this.id_new[10] == null) {
         ArrayList var8 = new ArrayList();
         this.id_new[10] = var8;
      }

      ArrayList var2 = new ArrayList();

      for (int var3 = 0; var3 < 4; var3++) {
         if (!EF.id_break(
            var1,
            (Integer)((rU_2[])this.id_new[5])[var3].id_break[0],
            (Integer)((rU_2[])this.id_new[5])[var3].id_break[1],
            (Integer)((rU_2[])this.id_new[5])[var3].id_break[2]
         )) {
            var2.add(((rU_2[])this.id_new[5])[var3]);
         }
      }

      this.id_new[10] = var2;
      return (List<rfH_2>)this.id_new[10];
   }

   @Override
   public EA id_byte(EA var1) {
      super.id_byte(var1);
      if (var1.id_byte() != (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[2]) {
         return var1;
      } else if (((Ps_1)this.id_new[1]).id_volatile().equals((rU_2)this.id_new[4])) {
         return var1.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[3]);
      } else if (this.id_extends()
         || EF.id_protected((Ps_1)this.id_new[1], (rU_2)this.id_new[3]) && this.id_volatile().contains(((Ps_1)this.id_new[1]).id_volatile().id_class())) {
         if ((Integer)((rU_2)this.id_new[4]).id_break[1] > (Integer)((rU_2)this.id_new[3]).id_break[1]
            && ((Ps_1)this.id_new[1]).id_catch().Ps().id_byte < (double)((Integer)((rU_2)this.id_new[3]).id_break[1]).intValue() + 0.1
            && (Boolean)((Ps_1)this.id_new[1]).id_catch().id_throws[23]) {
            var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[6], true);
         }

         if (this.id_package()) {
            var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[8], true);
         }

         EF.id_class((Ps_1)this.id_new[1], var1, (rU_2)this.id_new[4]);
         return var1;
      } else {
         return var1.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[4]);
      }
   }

   private static void id_int() {
      id_super = new byte[]{6, 2, 3, 4, 5, 2, 2, 2, 2, 2, 4, 4, 6, 4};
   }

   public GB(C_case var1, rU_2 var2, rpr_3 var3, rpr_3 var4, int var5) {
      this(var1, var2, var2.id_class(var3), var2.id_class(var4), var4, var5);
   }

   private GB(C_case var1, rU_2 var2, rU_2 var3, rU_2 var4, rU_2 var5) {
      super(var1, var2, var3, new rU_2[]{var4, var4.id_class(), var5, var5.id_class(), var3, var3.id_class()});
   }

   private GB(C_case var1, rU_2 var2, rU_2 var3, rU_2 var4, rpr_3 var5, int var6) {
      this(var1, var2, var3.id_class(var5).id_final(var6), var3, var4);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_synchronized = new boolean[]{
         false,
         true,
         true,
         true,
         true,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         true,
         true,
         true,
         true,
         true,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         true,
         true,
         false,
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
         false,
         true,
         true,
         false,
         false,
         true,
         false
      };
   }

   public static void id_class(EZ var0, int var1, int var2, int var3, int var4, int var5, Mr_1 var6) {
      if (EF.id_byte(var0, var4, var2 + 1, var5)) {
         xc_3 var7 = var0.id_class(var4, var2, var5);
         boolean var9 = false;
         boolean var11 = false;
         boolean var12 = false;
         xc_3 var8;
         xc_3 var10;
         if (!EF.id_break(var0, var4, var2, var5, var7)) {
            var9 = true;
            if (!(Boolean)var0.id_break[19]
               || !EF.id_byte(var0, var1, var2 + 2, var3)
               || !EF.id_class(var0, var4, var2, var5, var7)
               || !EF.id_byte(var0, var4, var2 + 2, var5)) {
               return;
            }

            var10 = var7;
            var8 = var0.id_class(var1, var2 - 1, var3);
         } else {
            var10 = var0.id_class(var4, var2 - 1, var5);
            var8 = var0.id_class(var1, var2 - 1, var3);
            boolean var13 = EF.id_protected(var0, var1, var2 - 1, var3, var8);
            var12 = var13 && EF.id_class(var0, var10) ? true : id_synchronized[23];
            if (!var12 && !EF.id_class(var0, var4, var2 - 1, var5, var10)) {
               var11 = true;
               if (!(Boolean)var0.id_break[18] || !EF.id_class(var0, var4, var2 - 2, var5) || !EF.id_break(var0, var4, var2 - 1, var5, var10)) {
                  return;
               }
            }

            var12 &= !var0.id_break[16] ? true : id_synchronized[28];
         }

         double var44 = id_this[3];
         if (var10.id_break() == xu_3.PY) {
            var44 += 2.316423442205235;
         } else if (!var12 && var10.id_break() == xu_3.id_try) {
            var44 += var0.id_break[27] * id_continue[0];
         }

         xd_3 var15 = var8.id_break();
         if (var15 != xu_3.PJ && var15 != xu_3.BD) {
            if (var15 == xu_3.PY) {
               var44 += 2.316423442205235;
            }

            xc_3 var16 = var0.id_class(var1, var2 - 1, var5);
            if (var16.id_break() != xu_3.bV && !EF.id_case(var16)) {
               xc_3 var17 = var0.id_class(var4, var2 - 1, var3);
               if (var17.id_break() != xu_3.bV && !EF.id_case(var17)) {
                  boolean var18 = id_synchronized[31];
                  xc_3 var19 = var0.id_class(var1, var2, var3);
                  xd_3 var20 = var19.id_break();
                  if (EF.id_byte(var19) || EF.id_byte(var7)) {
                     if (var9) {
                        return;
                     }

                     var44 = (Double)var0.id_break[23];
                     var18 = true;
                  }

                  xc_3 var21 = var0.id_class(var1, var2, var5);
                  xc_3 var22 = var0.id_class(var4, var2, var3);
                  if (var9) {
                     boolean var46 = EF.id_byte(var0, var1, var2 + 2, var5);
                     boolean var24 = EF.id_byte(var0, var1, var2 + 1, var5);
                     boolean var48 = EF.id_break(var0, var1, var2, var5, var21);
                     boolean var26 = EF.id_byte(var0, var4, var2 + 2, var3);
                     boolean var49 = EF.id_byte(var0, var4, var2 + 1, var3);
                     boolean var50 = EF.id_break(var0, var4, var2, var3, var22);
                     if ((var46 && var24 && var48 || var26 && var49 && var50)
                        && !EF.id_throws(var21)
                        && !EF.id_throws(var22)
                        && (!var46 || !var24 || !EF.id_class(var0, var1, var2, var5, var21))
                        && (!var26 || !var49 || !EF.id_class(var0, var4, var2, var3, var22))
                        && (var46 || !var24 || !var48)
                        && (var26 || !var49 || !var50)) {
                        Double var33 = var44 * (Double)id_continue[0] + id_break;
                        var6.id_class[3] = var33;
                        Integer var34 = var4;
                        var6.id_class[0] = var34;
                        Integer var35 = var5;
                        var6.id_class[2] = var35;
                        Integer var36 = var2 + 1;
                        var6.id_class[1] = var36;
                     }
                  } else {
                     double var23 = EF.id_class(var0, var1, var2, var5, var21, false);
                     double var25 = EF.id_class(var0, var4, var2, var3, var22, false);
                     if (var23 == 0.0 || var25 == 0.0) {
                        xc_3 var27 = var0.id_class(var1, var2 + 1, var5);
                        var23 += EF.id_class(var0, var1, var2 + 1, var5, var27, true);
                        if (var23 == 0.0 || var25 == 0.0) {
                           xc_3 var28 = var0.id_class(var4, var2 + 1, var3);
                           if (var23 != 0.0 || (!EF.id_throws(var22) || var22.id_break() == xu_3.id_try) && !EF.id_throws(var28)) {
                              var25 += EF.id_class(var0, var4, var2 + 1, var3, var28, true);
                              if (var23 == 0.0 || var25 == 0.0) {
                                 if (var25 != 0.0 || (!EF.id_throws(var21) || var21.id_break() == xu_3.id_try) && !EF.id_throws(var27)) {
                                    if (var23 != 0.0 || var25 != 0.0) {
                                       var44 *= id_continue[0] - 0.001;
                                       if (var20 == xu_3.PJ || var20 == xu_3.BD) {
                                          return;
                                       }
                                    } else if ((Boolean)var0.id_break[8] && !var18) {
                                       var44 *= 0.7692444761225944;
                                    }

                                    Double var37 = var44 * (Double)id_continue[0];
                                    var6.id_class[3] = var37;
                                    if (var11) {
                                       Double var38 = (Double)var6.id_class[3] + Math.max(id_package[1], 0.9265693768820937);
                                       var6.id_class[3] = var38;
                                       Integer var39 = var2 - 1;
                                       var6.id_class[1] = var39;
                                    } else {
                                       Integer var40 = var2;
                                       var6.id_class[1] = var40;
                                    }

                                    Integer var41 = var4;
                                    var6.id_class[0] = var41;
                                    Integer var42 = var5;
                                    var6.id_class[2] = var42;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public List<rfH_2> id_class(bw_3 var1) {
      if ((List)this.id_new[8] != null) {
         return (List<rfH_2>)this.id_new[8];
      } else {
         ArrayList var2 = new ArrayList();

         for (int var3 = 4; var3 < 6; var3++) {
            if (!EF.id_break(
               var1,
               (Integer)((rU_2[])this.id_new[5])[var3].id_break[0],
               (Integer)((rU_2[])this.id_new[5])[var3].id_break[1],
               (Integer)((rU_2[])this.id_new[5])[var3].id_break[2]
            )) {
               var2.add(((rU_2[])this.id_new[5])[var3]);
            }
         }

         this.id_new[8] = var2;
         return var2;
      }
   }

   @Override
   public double id_class(EZ var1) {
      Mr_1 var2 = new Mr_1();
      id_class(
         var1,
         (Integer)((rU_2)this.id_new[3]).id_break[0],
         (Integer)((rU_2)this.id_new[3]).id_break[1],
         (Integer)((rU_2)this.id_new[3]).id_break[2],
         (Integer)((rU_2)this.id_new[4]).id_break[0],
         (Integer)((rU_2)this.id_new[4]).id_break[2],
         var2
      );
      return var2.id_class[1] != ((rU_2)this.id_new[4]).id_break[1] ? 1000000.0 : (Double)var2.id_class[3];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2525528200496678257L;
   }

   @Override
   public boolean id_class(EA var1) {
      cb_3 var2 = ((Ps_1)this.id_new[1]).id_catch();
      double var3 = 0.25;
      double var5 = var2.Ps().id_break;
      double var7 = var2.Ps().id_byte - 1.0;
      double var9 = var2.Ps().id_protected;
      if (((Ps_1)this.id_new[1]).id_volatile().equals((rU_2)this.id_new[3])) {
         return true;
      } else if (EF.id_class(
            (Ps_1)this.id_new[1],
            new rfH_2((Integer)((rU_2)this.id_new[3]).id_break[0], (Integer)((rU_2)this.id_new[3]).id_break[1] - 1, (Integer)((rU_2)this.id_new[4]).id_break[2])
         )
         && EF.id_class(
            (Ps_1)this.id_new[1],
            new rfH_2((Integer)((rU_2)this.id_new[4]).id_break[0], (Integer)((rU_2)this.id_new[3]).id_break[1] - 1, (Integer)((rU_2)this.id_new[3]).id_break[2])
         )) {
         return true;
      } else if (!((Ps_1)this.id_new[1])
            .id_volatile()
            .equals(
               new rU_2((Integer)((rU_2)this.id_new[3]).id_break[0], (Integer)((rU_2)this.id_new[3]).id_break[1], (Integer)((rU_2)this.id_new[4]).id_break[2])
            )
         && !((Ps_1)this.id_new[1])
            .id_volatile()
            .equals(
               new rU_2((Integer)((rU_2)this.id_new[4]).id_break[0], (Integer)((rU_2)this.id_new[3]).id_break[1], (Integer)((rU_2)this.id_new[3]).id_break[2])
            )) {
         return id_synchronized[8];
      } else {
         return !EF.id_break((Ps_1)this.id_new[1], new rU_2(var5 + var3, var7, var9 + var3))
               && !EF.id_break((Ps_1)this.id_new[1], new rU_2(var5 + var3, var7, var9 - var3))
               && !EF.id_break((Ps_1)this.id_new[1], new rU_2(var5 - var3, var7, var9 + var3))
               && !EF.id_break((Ps_1)this.id_new[1], new rU_2(var5 - var3, var7, var9 - var3))
            ? id_synchronized[7]
            : id_synchronized[6];
      }
   }

   @Override
   public boolean id_break(EA var1) {
      return true;
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2101552584;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-27, -22, 82, -43, 97, -104, 101, 0}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_this = new double[]{
         0.25,
         1.0,
         1000000.0,
         4.63284688441047,
         2.316423442205235,
         2.316423442205235,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.001,
         0.7692444761225944,
         0.9265693768820937,
         0.1,
         2.0,
         0.0
      };
   }

   private static void id_new() {
      Object[] var0 = new Object[]{1.4142135623730951};
      id_continue = var0;
   }

   private boolean id_package() {
      if (EF.id_protected((Ps_1)this.id_new[1], ((Ps_1)this.id_new[1]).id_volatile()) && !(Boolean)C_class.id_instanceof().id_finally.id_class[0]) {
         return false;
      } else {
         for (int var1 = id_synchronized[49]; var1 < 4; var1++) {
            if (!EF.id_class((Ps_1)this.id_new[1], ((rU_2[])this.id_new[5])[var1])) {
               return false;
            }
         }

         return id_synchronized[51];
      }
   }

   private static void id_super() {
      id_else = new short[]{
         1,
         1,
         3,
         1,
         3,
         0,
         3,
         1,
         4,
         2,
         1,
         4,
         0,
         3,
         1,
         3,
         2,
         1,
         3,
         0,
         3,
         1,
         4,
         2,
         1,
         4,
         0,
         3,
         1,
         3,
         2,
         1,
         1,
         1,
         1,
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
         1,
         4,
         1,
         3,
         3,
         0,
         3,
         1,
         4,
         2,
         4,
         0,
         3,
         1,
         3,
         2,
         4,
         1,
         3,
         1,
         3,
         4,
         4,
         4,
         1,
         3,
         1,
         3,
         3,
         4,
         3,
         4,
         19,
         18,
         16,
         27,
         0,
         23,
         0,
         3,
         0,
         2,
         1,
         0,
         8,
         0,
         3,
         3,
         3,
         1,
         1,
         0,
         2,
         2,
         1,
         4,
         3,
         1,
         3,
         1,
         4,
         4,
         1,
         3,
         1,
         1,
         3,
         1,
         1,
         23,
         6,
         8,
         1,
         4,
         1,
         1,
         0,
         1,
         5,
         8,
         8,
         5,
         0,
         5,
         1,
         5,
         2,
         5,
         8,
         10,
         10,
         5,
         0,
         5,
         1,
         5,
         2,
         5,
         10,
         10
      };
   }

   @Override
   public Set<rU_2> id_native() {
      rU_2 var1 = new rU_2(
         (Integer)((rU_2)this.id_new[3]).id_break[0], (Integer)((rU_2)this.id_new[3]).id_break[1], (Integer)((rU_2)this.id_new[4]).id_break[2]
      );
      rU_2 var2 = new rU_2(
         (Integer)((rU_2)this.id_new[4]).id_break[0], (Integer)((rU_2)this.id_new[3]).id_break[1], (Integer)((rU_2)this.id_new[3]).id_break[2]
      );
      if ((Integer)((rU_2)this.id_new[4]).id_break[1] < (Integer)((rU_2)this.id_new[3]).id_break[1]) {
         return ImmutableSet.of(
            (rU_2)this.id_new[3], ((rU_2)this.id_new[4]).id_class(), var1, var2, (rU_2)this.id_new[4], var1.id_case(), new rU_2[]{var2.id_case()}
         );
      } else {
         return ((rU_2)this.id_new[4]).id_break[1] > ((rU_2)this.id_new[3]).id_break[1]
            ? ImmutableSet.of(
               (rU_2)this.id_new[3], ((rU_2)this.id_new[3]).id_class(), var1, var2, (rU_2)this.id_new[4], var1.id_class(), new rU_2[]{var2.id_class()}
            )
            : ImmutableSet.of((rU_2)this.id_new[3], (rU_2)this.id_new[4], var1, var2);
      }
   }
}
