package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GE extends Ev_1 {
   public Object[] continue_;
   private static String[] this_;
   public static Object[] super_;
   private static boolean[] else_;
   private static short[] synchronized_;
   private static byte[] return_;
   private static double[] public_;

   @Override
   public EA byte_(EA var1) {
      this.package_();
      super.byte_(var1);
      if (var1.byte_() != (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[2]) {
         return var1;
      } else if ((Integer)((Ps_1)this.new_[1]).volatile_().break_[1] < (Integer)((rU_2)this.new_[3]).break_[1]) {
         this.byte_("sorry");
         return var1.class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[4]);
      } else {
         if ((Integer)this.continue_[1] >= 4 || (Boolean)this.continue_[2]) {
            var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[8], true);
         }

         EF.class_((Ps_1)this.new_[1], var1, (rU_2)this.new_[4]);
         if (((Ps_1)this.new_[1]).volatile_().equals((rU_2)this.new_[4])) {
            xd_3 var2 = bw_3.break_((Ps_1)this.new_[1], (rU_2)this.new_[4]);
            if (var2 == xu_3.BD || var2 == xu_3.PJ) {
               return var1.class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[3]);
            }

            if (((Ps_1)this.new_[1]).catch_().Ps().byte_ - (double)((Ps_1)this.new_[1]).volatile_().c_() < 0.094) {
               var1.class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[3]);
            }
         } else if (!((Ps_1)this.new_[1]).volatile_().equals((rU_2)this.new_[3])) {
            if (!((Ps_1)this.new_[1]).volatile_().equals(((rU_2)this.new_[3]).class_((rpr_3)this.continue_[0]))
               && !(((Ps_1)this.new_[1]).catch_().Ps().byte_ - (double)((Integer)((rU_2)this.new_[3]).break_[1]).intValue() > 1.0E-4)) {
               if (!((Ps_1)this.new_[1]).volatile_().equals(((rU_2)this.new_[4]).byte_((rpr_3)this.continue_[0], -1))) {
                  var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[8], false);
                  if (((Ps_1)this.new_[1]).volatile_().equals(((rU_2)this.new_[3]).byte_((rpr_3)this.continue_[0], -1))) {
                     EF.class_((Ps_1)this.new_[1], var1, (rU_2)this.new_[3]);
                  } else {
                     EF.class_((Ps_1)this.new_[1], var1, ((rU_2)this.new_[3]).byte_((rpr_3)this.continue_[0], -1));
                  }
               }
            } else {
               if ((Boolean)C_class.instanceof_().k.class_[0]
                  && ((C_class)((C_case)this.new_[0])).static_().class_()
                  && !EF.break_((Ps_1)this.new_[1], ((rU_2)this.new_[4]).case_())
                  && !((Ps_1)this.new_[1]).catch_().BL()
                  && EF.class_(var1, (C_case)this.new_[0], ((rU_2)this.new_[4]).case_(), true, false) == (EL)EL.staticFieldse3b1cfc58f9d3b6596ccfd637c5fdb13[0]
                  )
                {
                  var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], true);
               }

               if ((Integer)this.continue_[1] == 3 && !(Boolean)this.continue_[2]) {
                  double var8 = (double)((Integer)((rU_2)this.new_[3]).break_[0]).intValue() + 0.5 - ((Ps_1)this.new_[1]).catch_().Ps().break_;
                  double var4 = (double)((Integer)((rU_2)this.new_[3]).break_[2]).intValue() + 0.5 - ((Ps_1)this.new_[1]).catch_().Ps().protected_;
                  double var6 = Math.max(Math.abs(var8), Math.abs(var4));
                  if (var6 < 0.7) {
                     return var1;
                  }
               }

               var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[6], true);
            }
         }

         return var1;
      }
   }

   private static double byte_(int var0) {
      switch (var0) {
         case 2:
            return public_[2];
         case 3:
            return public_[3];
         case 4:
            return public_[4];
         default:
            throw new IllegalStateException("LOL " + var0);
      }
   }

   private static void int_() {
      return_ = new byte[]{2, 2, 2, 4, 3, 2, 2, 3, 16, 2, 3, 5, 2, 4, 3, -1, -1, -1, 3, 2};
   }

   private GE(C_case var1, rU_2 var2, int var3, rpr_3 var4, boolean var5) {
      super(var1, var2, var2.byte_(var4, var3).final_(var5 ? 1 : else_[1]), (rU_2[])super_[0], var2.byte_(var4, var3).protected_(var5 ? 0 : else_[3]));
      this.package_();
      this.continue_[0] = var4;
      Integer var11 = var3;
      this.continue_[1] = var11;
      Boolean var12 = var5;
      this.continue_[2] = var12;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      synchronized_ = new short[]{
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
   public double class_(EZ var1) {
      this.package_();
      Mr_1 var2 = new Mr_1();
      class_(
         var1,
         (Integer)((rU_2)this.new_[3]).break_[0],
         (Integer)((rU_2)this.new_[3]).break_[1],
         (Integer)((rU_2)this.new_[3]).break_[2],
         (rpr_3)this.continue_[0],
         var2
      );
      return var2.class_[0] == ((rU_2)this.new_[4]).break_[0]
            && var2.class_[1] == ((rU_2)this.new_[4]).break_[1]
            && var2.class_[2] == ((rU_2)this.new_[4]).break_[2]
         ? (Double)var2.class_[3]
         : public_[5];
   }

   @Override
   public boolean class_(EA var1) {
      return var1.byte_() != (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[2] ? true : else_[28];
   }

   public static void class_(EZ var0, int var1, int var2, int var3, rpr_3 var4, Mr_1 var5) {
      if ((Boolean)var0.break_[12]) {
         if (var2 != 256 || (Boolean)var0.break_[14]) {
            int var6 = var4.implements_();
            int var7 = var4.extends_();
            if (EF.break_(var0, var1 + var6, var2, var3 + var7)) {
               xc_3 var8 = var0.class_(var1 + var6, var2 - 1, var3 + var7);
               if (!EF.class_(var0, var1 + var6, var2 - 1, var3 + var7, var8)) {
                  if (!EF.throws_(var8) || var8.volatile_().class_() instanceof rXh_1) {
                     if (EF.break_(var0, var1 + var6, var2 + 1, var3 + var7)) {
                        if (EF.break_(var0, var1 + var6, var2 + 2, var3 + var7)) {
                           if (EF.break_(var0, var1, var2 + 2, var3)) {
                              xc_3 var9 = var0.class_(var1, var2 - 1, var3);
                              if (var9.break_() != xu_3.BD && var9.break_() != xu_3.PJ && !(var9.break_() instanceof zG_2) && !EF.break_(var9)) {
                                 if (!(Boolean)var0.break_[16] || var9.volatile_().byte_()) {
                                    if (var0.class_(var1, var2, var3).volatile_().byte_()) {
                                       byte var10;
                                       if (var9.break_() == xu_3.PY) {
                                          var10 = 2;
                                       } else if ((Boolean)var0.break_[8]) {
                                          var10 = 4;
                                       } else {
                                          var10 = return_[4];
                                       }

                                       int var11 = else_[10];

                                       for (int var12 = 2; var12 <= var10; var11 = var12++) {
                                          int var13 = var1 + var6 * var12;
                                          int var14 = var3 + var7 * var12;
                                          if (!EF.break_(var0, var13, var2 + 1, var14) || !EF.break_(var0, var13, var2 + 2, var14)) {
                                             break;
                                          }

                                          xc_3 var15 = ((bw_3)var0.break_[4]).class_(var13, var2, var14);
                                          if (!EF.byte_(var0, var13, var2, var14, var15)) {
                                             if (var12 <= 3
                                                && (Boolean)var0.break_[15]
                                                && (Boolean)var0.break_[8]
                                                && EF.class_(var0, var13, var2, var14, var15)
                                                && protected_((bw_3)var0.break_[4], var13 + var6, var2 + 1, var14 + var7)) {
                                                Integer var26 = var13;
                                                var5.class_[0] = var26;
                                                Integer var27 = var2 + 1;
                                                var5.class_[1] = var27;
                                                Integer var28 = var14;
                                                var5.class_[2] = var28;
                                                Double var29 = (double)var12 * 3.563791874554526 + (Double)var0.break_[26];
                                                var5.class_[3] = var29;
                                                return;
                                             }
                                             break;
                                          }

                                          xc_3 var16 = ((bw_3)var0.break_[4]).class_(var13, var2 - 1, var14);
                                          if (var16.break_() != xu_3.PS && EF.class_(var0, var13, var2 - 1, var14, var16)
                                             || Math.min(return_[8], (Integer)var0.break_[17] + 2) >= var12 && EF.class_(var0, var16)) {
                                             if (protected_((bw_3)var0.break_[4], var13 + var6, var2, var14 + var7)) {
                                                Integer var30 = var13;
                                                var5.class_[0] = var30;
                                                Integer var31 = var2;
                                                var5.class_[1] = var31;
                                                Integer var32 = var14;
                                                var5.class_[2] = var32;
                                                Double var33 = byte_(var12) + (Double)var0.break_[26];
                                                var5.class_[3] = var33;
                                                return;
                                             }
                                             break;
                                          }

                                          if (!EF.break_(var0, var13, var2 + 3, var14)) {
                                             break;
                                          }
                                       }

                                       if ((Boolean)var0.break_[13]) {
                                          for (int var38 = var11; var38 > 1; var38--) {
                                             int var39 = var1 + var38 * var6;
                                             int var40 = var3 + var38 * var7;
                                             xc_3 var41 = var0.class_(var39, var2 - 1, var40);
                                             double var42 = var0.class_(var39, var2 - 1, var40, var41);
                                             if (!(var42 >= 1000000.0)
                                                && EF.break_(var39, var2 - 1, var40, var41, (bw_3)var0.break_[4])
                                                && protected_((bw_3)var0.break_[4], var39 + var6, var2, var40 + var7)) {
                                                for (int var18 = else_[20]; var18 < 5; var18++) {
                                                   int var19 = var39 + ((rpr_3[])class_[0])[var18].implements_();
                                                   int var20 = var2 - 1 + ((rpr_3[])class_[0])[var18].finally_();
                                                   int var21 = var40 + ((rpr_3[])class_[0])[var18].extends_();
                                                   if ((var19 != var39 - var6 || var21 != var40 - var7) && EF.class_((bw_3)var0.break_[4], var19, var20, var21)
                                                      )
                                                    {
                                                      Integer var34 = var39;
                                                      var5.class_[0] = var34;
                                                      Integer var35 = var2;
                                                      var5.class_[1] = var35;
                                                      Integer var36 = var40;
                                                      var5.class_[2] = var36;
                                                      Double var37 = byte_(var38) + var42 + (Double)var0.break_[26];
                                                      var5.class_[3] = var37;
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

   public static GE class_(EZ var0, rU_2 var1, rpr_3 var2) {
      Mr_1 var3 = new Mr_1();
      class_(var0, (Integer)var1.break_[0], (Integer)var1.break_[1], (Integer)var1.break_[2], var2, var3);
      int var4 = Math.abs((Integer)var3.class_[0] - (Integer)var1.break_[0]) + Math.abs((Integer)var3.class_[2] - (Integer)var1.break_[2]);
      return new GE(var0.break_(), var1, var4, var2, var3.class_[1] > var1.break_[1] ? true : else_[5]);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8945428755020965613L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{15, -101, -3, -55, 77, -76, 52, -14}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1348111881;
   }

   private static void continue_() {
      this_ = new String[]{new String("sorry")};
   }

   private static void else_() {
      else_ = new boolean[]{
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

   private static void new_() {
      public_ = new double[]{3.563791874554526, 1000000.0, 9.26569376882094, 13.89854065323141, 14.255167498218103, 1000000.0, 0.094, 1.0E-4, 0.5, 0.5, 0.7};
   }

   private void package_() {
      if (this.continue_ == null) {
         this.continue_ = new Object[3];
         Object[] var1 = this.continue_;
         var1[1] = 0;
         var1[2] = false;
      }
   }

   private static void super_() {
      Object[] var0 = new Object[]{new rU_2[0]};
      super_ = var0;
   }

   private static boolean protected_(bw_3 var0, int var1, int var2, int var3) {
      return !EF.throws_(var0.class_(var1, var2, var3)) && !EF.throws_(var0.class_(var1, var2 + 1, var3)) ? true : else_[24];
   }

   @Override
   public Set<rU_2> native_() {
      this.package_();
      HashSet var1 = new HashSet();

      for (int var2 = 0; var2 <= this.continue_[1]; var2++) {
         for (int var3 = 0; var3 < 2; var3++) {
            var1.add(((rU_2)this.new_[3]).byte_((rpr_3)this.continue_[0], var2).final_(var3));
         }
      }

      return var1;
   }
}
