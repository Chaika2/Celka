package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GE extends Ev_1 {
   public Object[] id_continue;
   private static String[] id_this;
   public static Object[] id_super;
   private static boolean[] id_else;
   private static short[] id_synchronized;
   private static byte[] id_return;
   private static double[] id_public;

   @Override
   public EA id_byte(EA var1) {
      this.id_package();
      super.id_byte(var1);
      if (var1.id_byte() != (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[2]) {
         return var1;
      } else if ((Integer)((Ps_1)this.id_new[1]).id_volatile().id_break[1] < (Integer)((rU_2)this.id_new[3]).id_break[1]) {
         this.id_byte(id_this[0]);
         return var1.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[4]);
      } else {
         if ((Integer)this.id_continue[1] >= 4 || (Boolean)this.id_continue[2]) {
            var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[8], true);
         }

         EF.id_class((Ps_1)this.id_new[1], var1, (rU_2)this.id_new[4]);
         if (((Ps_1)this.id_new[1]).id_volatile().equals((rU_2)this.id_new[4])) {
            xd_3 var2 = bw_3.id_break((Ps_1)this.id_new[1], (rU_2)this.id_new[4]);
            if (var2 == xu_3.BD || var2 == xu_3.PJ) {
               return var1.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[3]);
            }

            if (((Ps_1)this.id_new[1]).id_catch().Ps().id_byte - (double)((Ps_1)this.id_new[1]).id_volatile().c_() < 0.094) {
               var1.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[3]);
            }
         } else if (!((Ps_1)this.id_new[1]).id_volatile().equals((rU_2)this.id_new[3])) {
            if (!((Ps_1)this.id_new[1]).id_volatile().equals(((rU_2)this.id_new[3]).id_class((rpr_3)this.id_continue[id_synchronized[91]]))
               && !(((Ps_1)this.id_new[1]).id_catch().Ps().id_byte - (double)((Integer)((rU_2)this.id_new[3]).id_break[1]).intValue() > 1.0E-4)) {
               if (!((Ps_1)this.id_new[1]).id_volatile().equals(((rU_2)this.id_new[4]).id_byte((rpr_3)this.id_continue[id_synchronized[115]], -1))) {
                  var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[8], id_else[34]);
                  if (((Ps_1)this.id_new[1]).id_volatile().equals(((rU_2)this.id_new[3]).id_byte((rpr_3)this.id_continue[id_synchronized[119]], -1))) {
                     EF.id_class((Ps_1)this.id_new[1], var1, (rU_2)this.id_new[3]);
                  } else {
                     EF.id_class((Ps_1)this.id_new[1], var1, ((rU_2)this.id_new[3]).id_byte((rpr_3)this.id_continue[id_synchronized[124]], -1));
                  }
               }
            } else {
               if ((Boolean)C_class.id_instanceof().k.id_class[id_synchronized[95]]
                  && ((C_class)((C_case)this.id_new[id_synchronized[96]])).id_static().id_class()
                  && !EF.id_break((Ps_1)this.id_new[1], ((rU_2)this.id_new[4]).id_case())
                  && !((Ps_1)this.id_new[1]).id_catch().BL()
                  && EF.id_class(var1, (C_case)this.id_new[id_synchronized[100]], ((rU_2)this.id_new[4]).id_case(), true, id_else[31])
                     == (EL)EL.staticFieldse3b1cfc58f9d3b6596ccfd637c5fdb13[id_synchronized[102]]) {
                  var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], true);
               }

               if ((Integer)this.id_continue[1] == 3 && !(Boolean)this.id_continue[2]) {
                  double var8 = (double)((Integer)((rU_2)this.id_new[3]).id_break[id_synchronized[107]]).intValue()
                     + 0.5
                     - ((Ps_1)this.id_new[1]).id_catch().Ps().id_break;
                  double var4 = (double)((Integer)((rU_2)this.id_new[3]).id_break[2]).intValue() + 0.5 - ((Ps_1)this.id_new[1]).id_catch().Ps().id_protected;
                  double var6 = Math.max(Math.abs(var8), Math.abs(var4));
                  if (var6 < 0.7) {
                     return var1;
                  }
               }

               var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[6], true);
            }
         }

         return var1;
      }
   }

   private static double id_byte(int var0) {
      switch (var0) {
         case 2:
            return 9.26569376882094;
         case 3:
            return 13.89854065323141;
         case 4:
            return 14.255167498218103;
         default:
            throw new IllegalStateException("LOL " + var0);
      }
   }

   private static void id_int() {
      id_return = new byte[]{2, 2, 2, 4, 3, 2, 2, 3, 16, 2, 3, 5, 2, 4, 3, -1, -1, -1, 3, 2};
   }

   private GE(C_case var1, rU_2 var2, int var3, rpr_3 var4, boolean var5) {
      super(
         var1,
         var2,
         var2.id_byte(var4, var3).id_final(var5 ? 1 : id_else[1]),
         (rU_2[])id_super[id_synchronized[0]],
         var2.id_byte(var4, var3).id_protected(var5 ? id_else[2] : 1)
      );
      this.id_package();
      this.id_continue[id_synchronized[1]] = var4;
      Integer var11 = var3;
      this.id_continue[1] = var11;
      Boolean var12 = var5;
      this.id_continue[2] = var12;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_synchronized = new short[]{
         0,
         0,
         1,
         2,
         0,
         1,
         2,
         0,
         0,
         2,
         2,
         1,
         1,
         12,
         256,
         14,
         16,
         8,
         4,
         15,
         8,
         4,
         0,
         1,
         2,
         26,
         3,
         4,
         17,
         4,
         0,
         1,
         2,
         26,
         3,
         13,
         4,
         4,
         0,
         0,
         0,
         4,
         0,
         1,
         2,
         26,
         3,
         3,
         0,
         3,
         1,
         3,
         2,
         0,
         0,
         4,
         0,
         1,
         4,
         1,
         2,
         4,
         2,
         3,
         1,
         3,
         0,
         2,
         2,
         1,
         1,
         3,
         1,
         4,
         1,
         2,
         8,
         1,
         4,
         1,
         4,
         1,
         4,
         3,
         1,
         1,
         3,
         1,
         3,
         1,
         3,
         0,
         1,
         3,
         1,
         0,
         0,
         1,
         4,
         1,
         0,
         4,
         0,
         5,
         1,
         2,
         3,
         0,
         1,
         3,
         2,
         1,
         6,
         1,
         4,
         0,
         8,
         1,
         3,
         0,
         1,
         3,
         1,
         3,
         0
      };
   }

   @Override
   public double id_class(EZ var1) {
      this.id_package();
      Mr_1 var2 = new Mr_1();
      id_class(
         var1,
         (Integer)((rU_2)this.id_new[3]).id_break[id_synchronized[48]],
         (Integer)((rU_2)this.id_new[3]).id_break[1],
         (Integer)((rU_2)this.id_new[3]).id_break[2],
         (rpr_3)this.id_continue[id_synchronized[53]],
         var2
      );
      return var2.id_class[id_synchronized[54]] == ((rU_2)this.id_new[4]).id_break[id_synchronized[56]]
            && var2.id_class[1] == ((rU_2)this.id_new[4]).id_break[1]
            && var2.id_class[2] == ((rU_2)this.id_new[4]).id_break[2]
         ? (Double)var2.id_class[3]
         : 1000000.0;
   }

   @Override
   public boolean id_class(EA var1) {
      return var1.id_byte() != (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[2] ? true : id_else[28];
   }

   public static void id_class(EZ var0, int var1, int var2, int var3, rpr_3 var4, Mr_1 var5) {
      if ((Boolean)var0.id_break[12]) {
         if (var2 != 256 || (Boolean)var0.id_break[14]) {
            int var6 = var4.id_implements();
            int var7 = var4.id_extends();
            if (EF.id_break(var0, var1 + var6, var2, var3 + var7)) {
               xc_3 var8 = var0.id_class(var1 + var6, var2 - 1, var3 + var7);
               if (!EF.id_class(var0, var1 + var6, var2 - 1, var3 + var7, var8)) {
                  if (!EF.id_throws(var8) || var8.id_volatile().id_class() instanceof rXh_1) {
                     if (EF.id_break(var0, var1 + var6, var2 + 1, var3 + var7)) {
                        if (EF.id_break(var0, var1 + var6, var2 + 2, var3 + var7)) {
                           if (EF.id_break(var0, var1, var2 + 2, var3)) {
                              xc_3 var9 = var0.id_class(var1, var2 - 1, var3);
                              if (var9.id_break() != xu_3.BD && var9.id_break() != xu_3.PJ && !(var9.id_break() instanceof zG_2) && !EF.id_break(var9)) {
                                 if (!(Boolean)var0.id_break[16] || var9.id_volatile().id_byte()) {
                                    if (var0.id_class(var1, var2, var3).id_volatile().id_byte()) {
                                       byte var10;
                                       if (var9.id_break() == xu_3.PY) {
                                          var10 = 2;
                                       } else if ((Boolean)var0.id_break[8]) {
                                          var10 = 4;
                                       } else {
                                          var10 = 3;
                                       }

                                       int var11 = 1;

                                       for (int var12 = 2; var12 <= var10; var11 = var12++) {
                                          int var13 = var1 + var6 * var12;
                                          int var14 = var3 + var7 * var12;
                                          if (!EF.id_break(var0, var13, var2 + 1, var14) || !EF.id_break(var0, var13, var2 + 2, var14)) {
                                             break;
                                          }

                                          xc_3 var15 = ((bw_3)var0.id_break[4]).id_class(var13, var2, var14);
                                          if (!EF.id_byte(var0, var13, var2, var14, var15)) {
                                             if (var12 <= 3
                                                && (Boolean)var0.id_break[15]
                                                && (Boolean)var0.id_break[8]
                                                && EF.id_class(var0, var13, var2, var14, var15)
                                                && id_protected((bw_3)var0.id_break[4], var13 + var6, var2 + 1, var14 + var7)) {
                                                Integer var26 = var13;
                                                var5.id_class[id_synchronized[22]] = var26;
                                                Integer var27 = var2 + 1;
                                                var5.id_class[1] = var27;
                                                Integer var28 = var14;
                                                var5.id_class[2] = var28;
                                                Double var29 = (double)var12 * 3.563791874554526 + (Double)var0.id_break[26];
                                                var5.id_class[3] = var29;
                                                return;
                                             }
                                             break;
                                          }

                                          xc_3 var16 = ((bw_3)var0.id_break[4]).id_class(var13, var2 - 1, var14);
                                          if (var16.id_break() != xu_3.PS && EF.id_class(var0, var13, var2 - 1, var14, var16)
                                             || Math.min(16, (Integer)var0.id_break[17] + 2) >= var12 && EF.id_class(var0, var16)) {
                                             if (id_protected((bw_3)var0.id_break[4], var13 + var6, var2, var14 + var7)) {
                                                Integer var30 = var13;
                                                var5.id_class[id_synchronized[30]] = var30;
                                                Integer var31 = var2;
                                                var5.id_class[1] = var31;
                                                Integer var32 = var14;
                                                var5.id_class[2] = var32;
                                                Double var33 = id_byte(var12) + (Double)var0.id_break[26];
                                                var5.id_class[3] = var33;
                                                return;
                                             }
                                             break;
                                          }

                                          if (!EF.id_break(var0, var13, var2 + 3, var14)) {
                                             break;
                                          }
                                       }

                                       if ((Boolean)var0.id_break[13]) {
                                          for (int var38 = var11; var38 > 1; var38--) {
                                             int var39 = var1 + var38 * var6;
                                             int var40 = var3 + var38 * var7;
                                             xc_3 var41 = var0.id_class(var39, var2 - 1, var40);
                                             double var42 = var0.id_class(var39, var2 - 1, var40, var41);
                                             if (!(var42 >= 1000000.0)
                                                && EF.id_break(var39, var2 - 1, var40, var41, (bw_3)var0.id_break[4])
                                                && id_protected((bw_3)var0.id_break[4], var39 + var6, var2, var40 + var7)) {
                                                for (int var18 = id_else[20]; var18 < 5; var18++) {
                                                   int var19 = var39 + ((rpr_3[])id_class[id_synchronized[38]])[var18].id_implements();
                                                   int var20 = var2 - 1 + ((rpr_3[])id_class[id_synchronized[39]])[var18].id_finally();
                                                   int var21 = var40 + ((rpr_3[])id_class[id_synchronized[40]])[var18].id_extends();
                                                   if ((var19 != var39 - var6 || var21 != var40 - var7)
                                                      && EF.id_class((bw_3)var0.id_break[4], var19, var20, var21)) {
                                                      Integer var34 = var39;
                                                      var5.id_class[id_synchronized[42]] = var34;
                                                      Integer var35 = var2;
                                                      var5.id_class[1] = var35;
                                                      Integer var36 = var40;
                                                      var5.id_class[2] = var36;
                                                      Double var37 = id_byte(var38) + var42 + (Double)var0.id_break[26];
                                                      var5.id_class[3] = var37;
                                                      return;
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
                  }
               }
            }
         }
      }
   }

   public static GE id_class(EZ var0, rU_2 var1, rpr_3 var2) {
      Mr_1 var3 = new Mr_1();
      id_class(var0, (Integer)var1.id_break[id_synchronized[4]], (Integer)var1.id_break[1], (Integer)var1.id_break[2], var2, var3);
      int var4 = Math.abs((Integer)var3.id_class[id_synchronized[7]] - (Integer)var1.id_break[id_synchronized[8]])
         + Math.abs((Integer)var3.id_class[2] - (Integer)var1.id_break[2]);
      return new GE(var0.id_break(), var1, var4, var2, var3.id_class[1] > var1.id_break[1] ? true : id_else[5]);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8945428755020965613L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{15, -101, -3, -55, 77, -76, 52, -14}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1348111881;
   }

   private static void id_continue() {
      id_this = new String[]{new String("sorry")};
   }

   private static void id_else() {
      id_else = new boolean[]{
         true,
         false,
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
         true,
         true,
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
         false,
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         true
      };
   }

   private static void id_new() {
      id_public = new double[]{3.563791874554526, 1000000.0, 9.26569376882094, 13.89854065323141, 14.255167498218103, 1000000.0, 0.094, 1.0E-4, 0.5, 0.5, 0.7};
   }

   private void id_package() {
      if (this.id_continue == null) {
         this.id_continue = new Object[3];
         Object[] var1 = this.id_continue;
         var1[1] = Integer.valueOf(id_else[38]);
         var1[2] = id_else[39];
      }
   }

   private static void id_super() {
      Object[] var0 = new Object[]{new rU_2[0]};
      id_super = var0;
   }

   private static boolean id_protected(bw_3 var0, int var1, int var2, int var3) {
      return !EF.id_throws(var0.id_class(var1, var2, var3)) && !EF.id_throws(var0.id_class(var1, var2 + 1, var3)) ? true : id_else[24];
   }

   @Override
   public Set<rU_2> id_native() {
      this.id_package();
      HashSet var1 = new HashSet();

      for (int var2 = id_else[25]; var2 <= this.id_continue[1]; var2++) {
         for (int var3 = id_else[26]; var3 < 2; var3++) {
            var1.add(((rU_2)this.id_new[3]).id_byte((rpr_3)this.id_continue[id_synchronized[66]], var2).id_final(var3));
         }
      }

      return var1;
   }
}
