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
   private static byte[] super_;
   public static Object[] continue_;
   private static double[] this_;
   private static short[] else_;
   private static boolean[] synchronized_;

   @Override
   public List<rfH_2> byte_(bw_3 var1) {
      if ((List)this.new_[10] == null) {
         ArrayList var8 = new ArrayList();
         this.new_[10] = var8;
      }

      ArrayList var2 = new ArrayList();

      for (int var3 = 0; var3 < 4; var3++) {
         if (!EF.break_(
            var1,
            (Integer)((rU_2[])this.new_[5])[var3].break_[0],
            (Integer)((rU_2[])this.new_[5])[var3].break_[1],
            (Integer)((rU_2[])this.new_[5])[var3].break_[2]
         )) {
            var2.add(((rU_2[])this.new_[5])[var3]);
         }
      }

      this.new_[10] = var2;
      return (List<rfH_2>)this.new_[10];
   }

   @Override
   public EA byte_(EA var1) {
      super.byte_(var1);
      if (var1.byte_() != (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[2]) {
         return var1;
      } else if (((Ps_1)this.new_[1]).volatile_().equals((rU_2)this.new_[4])) {
         return var1.class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[3]);
      } else if (this.extends_()
         || EF.protected_((Ps_1)this.new_[1], (rU_2)this.new_[3]) && this.volatile_().contains(((Ps_1)this.new_[1]).volatile_().class_())) {
         if ((Integer)((rU_2)this.new_[4]).break_[1] > (Integer)((rU_2)this.new_[3]).break_[1]
            && ((Ps_1)this.new_[1]).catch_().Ps().byte_ < (double)((Integer)((rU_2)this.new_[3]).break_[1]).intValue() + 0.1
            && (Boolean)((Ps_1)this.new_[1]).catch_().throws_[23]) {
            var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[6], true);
         }

         if (this.package_()) {
            var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[8], true);
         }

         EF.class_((Ps_1)this.new_[1], var1, (rU_2)this.new_[4]);
         return var1;
      } else {
         return var1.class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[4]);
      }
   }

   private static void int_() {
      super_ = new byte[]{6, 2, 3, 4, 5, 2, 2, 2, 2, 2, 4, 4, 6, 4};
   }

   public GB(C_case var1, rU_2 var2, rpr_3 var3, rpr_3 var4, int var5) {
      this(var1, var2, var2.class_(var3), var2.class_(var4), var4, var5);
   }

   private GB(C_case var1, rU_2 var2, rU_2 var3, rU_2 var4, rU_2 var5) {
      super(var1, var2, var3, new rU_2[]{var4, var4.class_(), var5, var5.class_(), var3, var3.class_()});
   }

   private GB(C_case var1, rU_2 var2, rU_2 var3, rU_2 var4, rpr_3 var5, int var6) {
      this(var1, var2, var3.class_(var5).final_(var6), var3, var4);
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      synchronized_ = new boolean[]{
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

   public static void class_(EZ var0, int var1, int var2, int var3, int var4, int var5, Mr_1 var6) {
      if (EF.byte_(var0, var4, var2 + 1, var5)) {
         xc_3 var7 = var0.class_(var4, var2, var5);
         boolean var9 = false;
         boolean var11 = false;
         boolean var12 = false;
         xc_3 var8;
         xc_3 var10;
         if (!EF.break_(var0, var4, var2, var5, var7)) {
            var9 = true;
            if (!(Boolean)var0.break_[19]
               || !EF.byte_(var0, var1, var2 + 2, var3)
               || !EF.class_(var0, var4, var2, var5, var7)
               || !EF.byte_(var0, var4, var2 + 2, var5)) {
               return;
            }

            var10 = var7;
            var8 = var0.class_(var1, var2 - 1, var3);
         } else {
            var10 = var0.class_(var4, var2 - 1, var5);
            var8 = var0.class_(var1, var2 - 1, var3);
            boolean var13 = EF.protected_(var0, var1, var2 - 1, var3, var8);
            var12 = var13 && EF.class_(var0, var10) ? true : synchronized_[23];
            if (!var12 && !EF.class_(var0, var4, var2 - 1, var5, var10)) {
               var11 = true;
               if (!(Boolean)var0.break_[18] || !EF.class_(var0, var4, var2 - 2, var5) || !EF.break_(var0, var4, var2 - 1, var5, var10)) {
                  return;
               }
            }

            var12 &= !var0.break_[16] ? true : synchronized_[28];
         }

         double var44 = this_[3];
         if (var10.break_() == xu_3.PY) {
            var44 += 2.316423442205235;
         } else if (!var12 && var10.break_() == xu_3.try_) {
            var44 += var0.break_[27] * continue_[0];
         }

         xd_3 var15 = var8.break_();
         if (var15 != xu_3.PJ && var15 != xu_3.BD) {
            if (var15 == xu_3.PY) {
               var44 += 2.316423442205235;
            }

            xc_3 var16 = var0.class_(var1, var2 - 1, var5);
            if (var16.break_() != xu_3.bV && !EF.case_(var16)) {
               xc_3 var17 = var0.class_(var4, var2 - 1, var3);
               if (var17.break_() != xu_3.bV && !EF.case_(var17)) {
                  boolean var18 = synchronized_[31];
                  xc_3 var19 = var0.class_(var1, var2, var3);
                  xd_3 var20 = var19.break_();
                  if (EF.byte_(var19) || EF.byte_(var7)) {
                     if (var9) {
                        return;
                     }

                     var44 = (Double)var0.break_[23];
                     var18 = true;
                  }

                  xc_3 var21 = var0.class_(var1, var2, var5);
                  xc_3 var22 = var0.class_(var4, var2, var3);
                  if (var9) {
                     boolean var46 = EF.byte_(var0, var1, var2 + 2, var5);
                     boolean var24 = EF.byte_(var0, var1, var2 + 1, var5);
                     boolean var48 = EF.break_(var0, var1, var2, var5, var21);
                     boolean var26 = EF.byte_(var0, var4, var2 + 2, var3);
                     boolean var49 = EF.byte_(var0, var4, var2 + 1, var3);
                     boolean var50 = EF.break_(var0, var4, var2, var3, var22);
                     if ((var46 && var24 && var48 || var26 && var49 && var50)
                        && !EF.throws_(var21)
                        && !EF.throws_(var22)
                        && (!var46 || !var24 || !EF.class_(var0, var1, var2, var5, var21))
                        && (!var26 || !var49 || !EF.class_(var0, var4, var2, var3, var22))
                        && (var46 || !var24 || !var48)
                        && (var26 || !var49 || !var50)) {
                        Double var33 = var44 * (Double)continue_[0] + break_;
                        var6.class_[3] = var33;
                        Integer var34 = var4;
                        var6.class_[0] = var34;
                        Integer var35 = var5;
                        var6.class_[2] = var35;
                        Integer var36 = var2 + 1;
                        var6.class_[1] = var36;
                     }
                  } else {
                     double var23 = EF.class_(var0, var1, var2, var5, var21, false);
                     double var25 = EF.class_(var0, var4, var2, var3, var22, false);
                     if (var23 == 0.0 || var25 == 0.0) {
                        xc_3 var27 = var0.class_(var1, var2 + 1, var5);
                        var23 += EF.class_(var0, var1, var2 + 1, var5, var27, true);
                        if (var23 == 0.0 || var25 == 0.0) {
                           xc_3 var28 = var0.class_(var4, var2 + 1, var3);
                           if (var23 != 0.0 || (!EF.throws_(var22) || var22.break_() == xu_3.try_) && !EF.throws_(var28)) {
                              var25 += EF.class_(var0, var4, var2 + 1, var3, var28, true);
                              if (var23 == 0.0 || var25 == 0.0) {
                                 if (var25 != 0.0 || (!EF.throws_(var21) || var21.break_() == xu_3.try_) && !EF.throws_(var27)) {
                                    if (var23 != 0.0 || var25 != 0.0) {
                                       var44 *= continue_[0] - 0.001;
                                       if (var20 == xu_3.PJ || var20 == xu_3.BD) {
                                          return;
                                       }
                                    } else if ((Boolean)var0.break_[8] && !var18) {
                                       var44 *= 0.7692444761225944;
                                    }

                                    Double var37 = var44 * (Double)continue_[0];
                                    var6.class_[3] = var37;
                                    if (var11) {
                                       Double var38 = (Double)var6.class_[3] + Math.max(package_[1], 0.9265693768820937);
                                       var6.class_[3] = var38;
                                       Integer var39 = var2 - 1;
                                       var6.class_[1] = var39;
                                    } else {
                                       Integer var40 = var2;
                                       var6.class_[1] = var40;
                                    }

                                    Integer var41 = var4;
                                    var6.class_[0] = var41;
                                    Integer var42 = var5;
                                    var6.class_[2] = var42;
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
   public List<rfH_2> class_(bw_3 var1) {
      if ((List)this.new_[8] != null) {
         return (List<rfH_2>)this.new_[8];
      } else {
         ArrayList var2 = new ArrayList();

         for (int var3 = 4; var3 < 6; var3++) {
            if (!EF.break_(
               var1,
               (Integer)((rU_2[])this.new_[5])[var3].break_[0],
               (Integer)((rU_2[])this.new_[5])[var3].break_[1],
               (Integer)((rU_2[])this.new_[5])[var3].break_[2]
            )) {
               var2.add(((rU_2[])this.new_[5])[var3]);
            }
         }

         this.new_[8] = var2;
         return var2;
      }
   }

   @Override
   public double class_(EZ var1) {
      Mr_1 var2 = new Mr_1();
      class_(
         var1,
         (Integer)((rU_2)this.new_[3]).break_[0],
         (Integer)((rU_2)this.new_[3]).break_[1],
         (Integer)((rU_2)this.new_[3]).break_[2],
         (Integer)((rU_2)this.new_[4]).break_[0],
         (Integer)((rU_2)this.new_[4]).break_[2],
         var2
      );
      return var2.class_[1] != ((rU_2)this.new_[4]).break_[1] ? 1000000.0 : (Double)var2.class_[3];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2525528200496678257L;
   }

   @Override
   public boolean class_(EA var1) {
      cb_3 var2 = ((Ps_1)this.new_[1]).catch_();
      double var3 = 0.25;
      double var5 = var2.Ps().break_;
      double var7 = var2.Ps().byte_ - 1.0;
      double var9 = var2.Ps().protected_;
      if (((Ps_1)this.new_[1]).volatile_().equals((rU_2)this.new_[3])) {
         return true;
      } else if (EF.class_(
            (Ps_1)this.new_[1],
            new rfH_2((Integer)((rU_2)this.new_[3]).break_[0], (Integer)((rU_2)this.new_[3]).break_[1] - 1, (Integer)((rU_2)this.new_[4]).break_[2])
         )
         && EF.class_(
            (Ps_1)this.new_[1],
            new rfH_2((Integer)((rU_2)this.new_[4]).break_[0], (Integer)((rU_2)this.new_[3]).break_[1] - 1, (Integer)((rU_2)this.new_[3]).break_[2])
         )) {
         return true;
      } else if (!((Ps_1)this.new_[1])
            .volatile_()
            .equals(new rU_2((Integer)((rU_2)this.new_[3]).break_[0], (Integer)((rU_2)this.new_[3]).break_[1], (Integer)((rU_2)this.new_[4]).break_[2]))
         && !((Ps_1)this.new_[1])
            .volatile_()
            .equals(new rU_2((Integer)((rU_2)this.new_[4]).break_[0], (Integer)((rU_2)this.new_[3]).break_[1], (Integer)((rU_2)this.new_[3]).break_[2]))) {
         return synchronized_[8];
      } else {
         return !EF.break_((Ps_1)this.new_[1], new rU_2(var5 + var3, var7, var9 + var3))
               && !EF.break_((Ps_1)this.new_[1], new rU_2(var5 + var3, var7, var9 - var3))
               && !EF.break_((Ps_1)this.new_[1], new rU_2(var5 - var3, var7, var9 + var3))
               && !EF.break_((Ps_1)this.new_[1], new rU_2(var5 - var3, var7, var9 - var3))
            ? synchronized_[7]
            : synchronized_[6];
      }
   }

   @Override
   public boolean break_(EA var1) {
      return true;
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2101552584;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-27, -22, 82, -43, 97, -104, 101, 0}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void continue_() {
      this_ = new double[]{
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

   private static void new_() {
      Object[] var0 = new Object[]{1.4142135623730951};
      continue_ = var0;
   }

   private boolean package_() {
      if (EF.protected_((Ps_1)this.new_[1], ((Ps_1)this.new_[1]).volatile_()) && !(Boolean)C_class.instanceof_().finally_.class_[0]) {
         return false;
      } else {
         for (int var1 = synchronized_[49]; var1 < 4; var1++) {
            if (!EF.class_((Ps_1)this.new_[1], ((rU_2[])this.new_[5])[var1])) {
               return false;
            }
         }

         return synchronized_[51];
      }
   }

   private static void super_() {
      else_ = new short[]{
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
   public Set<rU_2> native_() {
      rU_2 var1 = new rU_2((Integer)((rU_2)this.new_[3]).break_[0], (Integer)((rU_2)this.new_[3]).break_[1], (Integer)((rU_2)this.new_[4]).break_[2]);
      rU_2 var2 = new rU_2((Integer)((rU_2)this.new_[4]).break_[0], (Integer)((rU_2)this.new_[3]).break_[1], (Integer)((rU_2)this.new_[3]).break_[2]);
      if ((Integer)((rU_2)this.new_[4]).break_[1] < (Integer)((rU_2)this.new_[3]).break_[1]) {
         return ImmutableSet.of((rU_2)this.new_[3], ((rU_2)this.new_[4]).class_(), var1, var2, (rU_2)this.new_[4], var1.case_(), new rU_2[]{var2.case_()});
      } else {
         return ((rU_2)this.new_[4]).break_[1] > ((rU_2)this.new_[3]).break_[1]
            ? ImmutableSet.of((rU_2)this.new_[3], ((rU_2)this.new_[3]).class_(), var1, var2, (rU_2)this.new_[4], var1.class_(), new rU_2[]{var2.class_()})
            : ImmutableSet.of((rU_2)this.new_[3], (rU_2)this.new_[4], var1, var2);
      }
   }
}
