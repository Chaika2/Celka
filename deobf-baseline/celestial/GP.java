package celestial;

import com.google.common.collect.ImmutableSet;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GP extends Ev_1 {
   private static byte[] id_super;
   public Object[] id_continue;
   private static double[] id_this;
   private static boolean[] id_else;
   private static short[] id_synchronized;

   @Override
   public EA id_byte(EA var1) {
      this.id_this();
      super.id_byte(var1);
      if (var1.id_byte() != (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_synchronized[43]]) {
         return var1;
      } else {
         rU_2 var2 = ((Ps_1)this.id_new[id_synchronized[44]]).id_volatile();
         rfH_2 var3 = new rfH_2(
            ((rU_2)this.id_new[id_synchronized[45]]).b_() * id_super[9] - ((rU_2)this.id_new[id_synchronized[46]]).b_(),
            ((rU_2)this.id_new[id_synchronized[47]]).c_(),
            ((rU_2)this.id_new[id_synchronized[48]]).d_() * id_super[10] - ((rU_2)this.id_new[id_synchronized[49]]).d_()
         );
         if (!var2.equals((rU_2)this.id_new[id_synchronized[50]]) && !var2.equals(var3)
            || !EF.id_protected((Ps_1)this.id_new[id_synchronized[51]], (rU_2)this.id_new[id_synchronized[52]])
               && !(((Ps_1)this.id_new[id_synchronized[53]]).id_catch().Ps().id_byte - (double)((rU_2)this.id_new[id_synchronized[54]]).c_() < id_this[12])) {
            if (this.id_new()) {
               double var21 = ((double)((rU_2)this.id_new[id_synchronized[56]]).b_() + id_this[13]) * id_this[14]
                  + ((double)((rU_2)this.id_new[id_synchronized[57]]).b_() + id_this[15]) * id_this[16];
               double var22 = ((double)((rU_2)this.id_new[id_synchronized[58]]).d_() + id_this[17]) * id_this[18]
                  + ((double)((rU_2)this.id_new[id_synchronized[59]]).d_() + id_this[19]) * id_this[20];
               cb_3 var23 = ((Ps_1)this.id_new[id_synchronized[60]]).id_catch();
               var1.id_class(
                     new En_1(
                        new PX(
                           PJ.id_class(
                                 ((Ps_1)this.id_new[id_synchronized[61]]).id_finally(),
                                 new rjU_2(var21, (double)((rU_2)this.id_new[id_synchronized[62]]).c_(), var22),
                                 new PX((Float)var23.id_throws[id_synchronized[63]], (Float)var23.id_throws[id_synchronized[64]])
                              )
                              .id_throws(),
                           (Float)var23.id_throws[id_synchronized[65]]
                        ),
                        id_else[35]
                     )
                  )
                  .id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_synchronized[66]], id_else[36]);
               return var1;
            } else {
               double var4 = ((Ps_1)this.id_new[id_synchronized[67]]).id_catch().Ps().id_break
                  - ((double)((rU_2)this.id_new[id_synchronized[68]]).b_() + id_this[21]);
               double var6 = ((Ps_1)this.id_new[id_synchronized[69]]).id_catch().Ps().id_protected
                  - ((double)((rU_2)this.id_new[id_synchronized[70]]).d_() + id_this[22]);
               double var8 = Math.sqrt(var4 * var4 + var6 * var6);
               double var10 = ((Ps_1)this.id_new[id_synchronized[71]]).id_catch().Ps().id_break
                  - ((double)((rU_2)this.id_new[id_synchronized[72]]).b_() + id_this[23]);
               double var12 = ((Ps_1)this.id_new[id_synchronized[73]]).id_catch().Ps().id_protected
                  - ((double)((rU_2)this.id_new[id_synchronized[74]]).d_() + id_this[24]);
               double var14 = Math.sqrt(var10 * var10 + var12 * var12);
               if (!var2.equals((rU_2)this.id_new[id_synchronized[75]]) || var8 > id_this[25]) {
                  int var10002 = (Integer)this.id_continue[id_synchronized[76]];
                  Integer var20 = var10002 + id_else[37];
                  this.id_continue[id_synchronized[77]] = var20;
                  if (var10002 < id_super[11] && var14 < id_this[26]) {
                     EF.id_class((Ps_1)this.id_new[id_synchronized[78]], var1, var3);
                  } else {
                     EF.id_class((Ps_1)this.id_new[id_synchronized[79]], var1, (rU_2)this.id_new[id_synchronized[80]]);
                  }
               }

               return var1;
            }
         } else {
            return var1.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_synchronized[55]]);
         }
      }
   }

   public void id_int() {
      this.id_this();
      Boolean var5 = id_else[6];
      this.id_continue[id_synchronized[4]] = var5;
   }

   public GP(C_case var1, rU_2 var2, rU_2 var3) {
      rU_2[] var10004 = new rU_2[id_super[0]];
      var10004[id_else[0]] = var3.id_final(id_super[1]);
      var10004[id_else[1]] = var3.id_class();
      var10004[id_super[2]] = var3;
      super(var1, var2, var3, var10004, var3.id_case());
      this.id_this();
      Integer var8 = Integer.valueOf(id_else[2]);
      this.id_continue[id_synchronized[0]] = var8;
      Boolean var9 = id_else[3];
      this.id_continue[id_synchronized[1]] = var9;
   }

   static {
      ntfClinit();
   }

   private void id_this() {
      if (this.id_continue == null) {
         this.id_continue = new Object[id_super[14]];
         Object[] var1 = this.id_continue;
         var1[id_else[45]] = Integer.valueOf(id_else[46]);
         var1[id_else[47]] = id_else[48];
      }
   }

   public static boolean id_class(EZ var0, int var1, int var2, int var3, int var4, int var5, double var6, xc_3 var8, Mr_1 var9) {
      if (var6 != id_this[8] && var0.id_class(var4, var2 + id_super[5], var5).id_break() instanceof dH_2) {
         return id_else[16];
      } else if (!EF.id_break(var0, var4, var2 - id_super[6], var5, var8)) {
         return id_else[17];
      } else {
         double var10 = id_this[9];
         int var12 = var2;
         int var13 = id_super[7];

         while (true) {
            int var14 = var2 - var13;
            if (var14 < 0) {
               return id_else[18];
            }

            xc_3 var15 = var0.id_class(var4, var14, var5);
            int var16 = var13 - (var2 - var12);
            double var17 = id_this[10] + id_package[var16] + var6 + var10;
            if (EF.id_byte(var15)) {
               if (!EF.id_break(var0, var4, var14, var5, var15)) {
                  return id_else[19];
               }

               if ((Boolean)var0.id_break[id_synchronized[26]]) {
                  return id_else[20];
               }

               if (EF.id_byte(var4, var14, var5, var15, (bw_3)var0.id_break[id_synchronized[27]])) {
                  return id_else[21];
               }

               if (!EF.id_class(var0, var4, var14 - id_else[22], var5)) {
                  return id_else[23];
               }

               Integer var23 = var4;
               var9.id_class[id_synchronized[28]] = var23;
               Integer var24 = var14;
               var9.id_class[id_synchronized[29]] = var24;
               Integer var25 = var5;
               var9.id_class[id_synchronized[30]] = var25;
               Double var26 = var17;
               var9.id_class[id_synchronized[31]] = var26;
               return id_else[24];
            }

            if (var16 > id_super[8] || var15.id_break() != xu_3.BD && var15.id_break() != xu_3.PJ) {
               if (!EF.id_break(var0, var4, var14, var5, var15)) {
                  if (!EF.id_class(var0, var4, var14, var5, var15)) {
                     return id_else[26];
                  }

                  if (EF.id_break(var15)) {
                     return id_else[27];
                  }

                  if (var16 <= (Integer)var0.id_break[id_synchronized[32]] + id_else[28]) {
                     Integer var27 = var4;
                     var9.id_class[id_synchronized[33]] = var27;
                     Integer var28 = var14 + id_else[29];
                     var9.id_class[id_synchronized[34]] = var28;
                     Integer var29 = var5;
                     var9.id_class[id_synchronized[35]] = var29;
                     Double var30 = var17;
                     var9.id_class[id_synchronized[36]] = var30;
                     return id_else[30];
                  }

                  if ((Boolean)var0.id_break[id_synchronized[37]] && var16 <= (Integer)var0.id_break[id_synchronized[38]] + id_else[31]) {
                     Integer var31 = var4;
                     var9.id_class[id_synchronized[39]] = var31;
                     Integer var32 = var14 + id_else[32];
                     var9.id_class[id_synchronized[40]] = var32;
                     Integer var33 = var5;
                     var9.id_class[id_synchronized[41]] = var33;
                     Double var34 = var17 + var0.id_class();
                     var9.id_class[id_synchronized[42]] = var34;
                     return id_else[33];
                  }

                  return id_else[34];
               }
            } else {
               var10 += id_package[var16 - id_else[25]];
               var10 += id_this[11];
               var12 = var14;
            }

            var13++;
         }
      }
   }

   @Override
   public void id_class() {
      this.id_this();
      super.id_class();
      Integer var5 = Integer.valueOf(id_else[4]);
      this.id_continue[id_synchronized[2]] = var5;
      Boolean var6 = id_else[5];
      this.id_continue[id_synchronized[3]] = var6;
   }

   @Override
   public double id_class(EZ var1) {
      Mr_1 var2 = new Mr_1();
      id_class(
         var1,
         (Integer)((rU_2)this.id_new[id_synchronized[5]]).id_break[id_synchronized[6]],
         (Integer)((rU_2)this.id_new[id_synchronized[7]]).id_break[id_synchronized[8]],
         (Integer)((rU_2)this.id_new[id_synchronized[9]]).id_break[id_synchronized[10]],
         (Integer)((rU_2)this.id_new[id_synchronized[11]]).id_break[id_synchronized[12]],
         (Integer)((rU_2)this.id_new[id_synchronized[13]]).id_break[id_synchronized[14]],
         var2
      );
      return var2.id_class[id_synchronized[15]] != ((rU_2)this.id_new[id_synchronized[16]]).id_break[id_synchronized[17]]
         ? id_this[0]
         : (Double)var2.id_class[id_synchronized[18]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3026789802879318899L;
   }

   public static void id_class(EZ var0, int var1, int var2, int var3, int var4, int var5, Mr_1 var6) {
      double var7 = id_this[1];
      xc_3 var9 = var0.id_class(var4, var2 - id_else[7], var5);
      var7 += EF.id_class(var0, var4, var2 - id_else[8], var5, var9, id_else[9]);
      if (!(var7 >= id_this[2])) {
         var7 += EF.id_class(var0, var4, var2, var5, id_else[10]);
         if (!(var7 >= id_this[3])) {
            var7 += EF.id_class(var0, var4, var2 + id_else[11], var5, id_else[12]);
            if (!(var7 >= id_this[4])) {
               xd_3 var10 = var0.id_class(var1, var2 - id_else[13], var3).id_break();
               if (var10 != xu_3.PJ && var10 != xu_3.BD) {
                  xc_3 var11 = var0.id_class(var4, var2 - id_super[3], var5);
                  if (!EF.id_class(var0, var4, var2 - id_super[4], var5, var11)) {
                     id_class(var0, var1, var2, var3, var4, var5, var7, var11, var6);
                  } else if (var9.id_break() != xu_3.PJ && var9.id_break() != xu_3.BD) {
                     if (!EF.id_class(var0, var9)) {
                        double var12 = id_this[5];
                        if (var10 == xu_3.PY) {
                           var12 *= id_this[6];
                        }

                        var7 += var12 + Math.max(id_package[id_else[14]], id_this[7]);
                        Integer var18 = var4;
                        var6.id_class[id_synchronized[22]] = var18;
                        Integer var19 = var2 - id_else[15];
                        var6.id_class[id_synchronized[23]] = var19;
                        Integer var20 = var5;
                        var6.id_class[id_synchronized[24]] = var20;
                        Double var21 = var7;
                        var6.id_class[id_synchronized[25]] = var21;
                     }
                  }
               }
            }
         }
      }
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1298476758;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{60, 6, -61, -38, 99, 82, -90, 34}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_this = new double[]{
         1000000.0,
         0.0,
         1000000.0,
         1000000.0,
         1000000.0,
         3.7062775075283763,
         2.0,
         0.9265693768820937,
         0.0,
         0.0,
         3.7062775075283763,
         6.666666666666667,
         0.5,
         0.5,
         0.17,
         0.5,
         0.83,
         0.5,
         0.17,
         0.5,
         0.83,
         0.5,
         0.5,
         0.5,
         0.5,
         0.25,
         1.25
      };
   }

   private static void id_else() {
      id_synchronized = new short[]{
         0,
         1,
         0,
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
         4,
         4,
         0,
         1,
         2,
         3,
         16,
         4,
         0,
         1,
         2,
         3,
         21,
         0,
         1,
         2,
         3,
         6,
         22,
         0,
         1,
         2,
         3,
         2,
         1,
         4,
         3,
         4,
         4,
         3,
         4,
         1,
         4,
         1,
         4,
         3,
         3,
         4,
         3,
         4,
         1,
         1,
         4,
         15,
         16,
         16,
         0,
         1,
         4,
         1,
         4,
         1,
         3,
         1,
         3,
         4,
         0,
         0,
         1,
         1,
         4,
         1,
         4,
         3,
         4,
         1,
         4,
         3,
         4,
         1,
         1,
         1
      };
   }

   public boolean id_new() {
      this.id_this();
      if ((Boolean)this.id_continue[id_synchronized[81]]) {
         return id_else[38];
      } else {
         rfH_2 var1 = ((rU_2)this.id_new[id_synchronized[82]])
            .id_byte(((rU_2)this.id_new[id_synchronized[83]]).id_case())
            .id_break((rU_2)this.id_new[id_synchronized[84]]);
         if (this.id_package()) {
            return id_else[39];
         } else {
            for (int var2 = id_else[40]; var2 <= id_super[12]; var2++) {
               if (EF.id_throws(bw_3.id_class((Ps_1)this.id_new[id_synchronized[85]], var1.id_break(var2)))) {
                  return id_else[41];
               }
            }

            return id_else[42];
         }
      }
   }

   public boolean id_package() {
      rfH_2 var1 = ((rU_2)this.id_new[id_synchronized[86]])
         .id_byte(((rU_2)this.id_new[id_synchronized[87]]).id_case())
         .id_break((rU_2)this.id_new[id_synchronized[88]]);
      return !EF.id_class((Ps_1)this.id_new[id_synchronized[89]], new rU_2(var1))
            && EF.id_class((Ps_1)this.id_new[id_synchronized[90]], new rU_2(var1).id_class())
            && EF.id_class((Ps_1)this.id_new[id_synchronized[91]], new rU_2(var1).id_final(id_super[13]))
         ? id_else[43]
         : id_else[44];
   }

   private static void id_super() {
      id_else = new boolean[]{
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
         false,
         true,
         true,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         true,
         true,
         false,
         false,
         true,
         true,
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
         false
      };
   }

   private static void id_synchronized() {
      id_super = new byte[]{3, 2, 2, 2, 2, 2, 2, 3, 11, 2, 2, 20, 2, 2, 2};
   }

   @Override
   public Set<rU_2> id_native() {
      return ImmutableSet.of(
         (rU_2)this.id_new[id_synchronized[19]], ((rU_2)this.id_new[id_synchronized[20]]).id_class(), (rU_2)this.id_new[id_synchronized[21]]
      );
   }
}
