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
      if ((List)this.id_new[id_else[134]] == null) {
         ArrayList var8 = new ArrayList();
         this.id_new[id_else[135]] = var8;
      }

      ArrayList var2 = new ArrayList();

      for (int var3 = id_synchronized[53]; var3 < id_super[13]; var3++) {
         if (!EF.id_break(
            var1,
            (Integer)((rU_2[])this.id_new[id_else[136]])[var3].id_break[id_else[137]],
            (Integer)((rU_2[])this.id_new[id_else[138]])[var3].id_break[id_else[139]],
            (Integer)((rU_2[])this.id_new[id_else[140]])[var3].id_break[id_else[141]]
         )) {
            var2.add(((rU_2[])this.id_new[id_else[142]])[var3]);
         }
      }

      this.id_new[id_else[143]] = var2;
      return (List<rfH_2>)this.id_new[id_else[144]];
   }

   @Override
   public EA id_byte(EA var1) {
      super.id_byte(var1);
      if (var1.id_byte() != (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_else[98]]) {
         return var1;
      } else if (((Ps_1)this.id_new[id_else[99]]).id_volatile().equals((rU_2)this.id_new[id_else[100]])) {
         return var1.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_else[101]]);
      } else if (this.id_extends()
         || EF.id_protected((Ps_1)this.id_new[id_else[102]], (rU_2)this.id_new[id_else[103]])
            && this.id_volatile().contains(((Ps_1)this.id_new[id_else[104]]).id_volatile().id_class())) {
         if ((Integer)((rU_2)this.id_new[id_else[106]]).id_break[id_else[107]] > (Integer)((rU_2)this.id_new[id_else[108]]).id_break[id_else[109]]
            && ((Ps_1)this.id_new[id_else[110]]).id_catch().Ps().id_byte
               < (double)((Integer)((rU_2)this.id_new[id_else[111]]).id_break[id_else[112]]).intValue() + id_this[19]
            && (Boolean)((Ps_1)this.id_new[id_else[113]]).id_catch().id_throws[id_else[114]]) {
            var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_else[115]], id_synchronized[46]);
         }

         if (this.id_package()) {
            var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_else[116]], id_synchronized[47]);
         }

         EF.id_class((Ps_1)this.id_new[id_else[117]], var1, (rU_2)this.id_new[id_else[118]]);
         return var1;
      } else {
         return var1.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_else[105]]);
      }
   }

   private static void id_int() {
      id_super = new byte[]{6, 2, 3, 4, 5, 2, 2, 2, 2, 2, 4, 4, 6, 4};
   }

   public GB(C_case var1, rU_2 var2, rpr_3 var3, rpr_3 var4, int var5) {
      this(var1, var2, var2.id_class(var3), var2.id_class(var4), var4, var5);
   }

   private GB(C_case var1, rU_2 var2, rU_2 var3, rU_2 var4, rU_2 var5) {
      rU_2[] var10004 = new rU_2[id_super[0]];
      var10004[id_synchronized[0]] = var4;
      var10004[id_synchronized[1]] = var4.id_class();
      var10004[id_super[1]] = var5;
      var10004[id_super[2]] = var5.id_class();
      var10004[id_super[3]] = var3;
      var10004[id_super[4]] = var3.id_class();
      super(var1, var2, var3, var10004);
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
      if (EF.id_byte(var0, var4, var2 + id_synchronized[13], var5)) {
         xc_3 var7 = var0.id_class(var4, var2, var5);
         boolean var9 = id_synchronized[14];
         boolean var11 = id_synchronized[15];
         boolean var12 = id_synchronized[16];
         xc_3 var8;
         xc_3 var10;
         if (!EF.id_break(var0, var4, var2, var5, var7)) {
            var9 = id_synchronized[17];
            if (!(Boolean)var0.id_break[id_else[77]]
               || !EF.id_byte(var0, var1, var2 + id_super[5], var3)
               || !EF.id_class(var0, var4, var2, var5, var7)
               || !EF.id_byte(var0, var4, var2 + id_super[6], var5)) {
               return;
            }

            var10 = var7;
            var8 = var0.id_class(var1, var2 - id_synchronized[18], var3);
         } else {
            var10 = var0.id_class(var4, var2 - id_synchronized[19], var5);
            var8 = var0.id_class(var1, var2 - id_synchronized[20], var3);
            boolean var13 = EF.id_protected(var0, var1, var2 - id_synchronized[21], var3, var8);
            var12 = var13 && EF.id_class(var0, var10) ? id_synchronized[22] : id_synchronized[23];
            if (!var12 && !EF.id_class(var0, var4, var2 - id_synchronized[24], var5, var10)) {
               var11 = id_synchronized[25];
               if (!(Boolean)var0.id_break[id_else[78]]
                  || !EF.id_class(var0, var4, var2 - id_super[7], var5)
                  || !EF.id_break(var0, var4, var2 - id_synchronized[26], var5, var10)) {
                  return;
               }
            }

            var12 &= !var0.id_break[id_else[79]] ? id_synchronized[27] : id_synchronized[28];
         }

         double var44 = id_this[3];
         if (var10.id_break() == xu_3.PY) {
            var44 += id_this[4];
         } else if (!var12 && var10.id_break() == xu_3.id_try) {
            var44 += var0.id_break[id_else[80]] * id_continue[id_else[81]];
         }

         xd_3 var15 = var8.id_break();
         if (var15 != xu_3.PJ && var15 != xu_3.BD) {
            if (var15 == xu_3.PY) {
               var44 += id_this[5];
            }

            xc_3 var16 = var0.id_class(var1, var2 - id_synchronized[29], var5);
            if (var16.id_break() != xu_3.bV && !EF.id_case(var16)) {
               xc_3 var17 = var0.id_class(var4, var2 - id_synchronized[30], var3);
               if (var17.id_break() != xu_3.bV && !EF.id_case(var17)) {
                  boolean var18 = id_synchronized[31];
                  xc_3 var19 = var0.id_class(var1, var2, var3);
                  xd_3 var20 = var19.id_break();
                  if (EF.id_byte(var19) || EF.id_byte(var7)) {
                     if (var9) {
                        return;
                     }

                     var44 = (Double)var0.id_break[id_else[82]];
                     var18 = id_synchronized[32];
                  }

                  xc_3 var21 = var0.id_class(var1, var2, var5);
                  xc_3 var22 = var0.id_class(var4, var2, var3);
                  if (var9) {
                     boolean var46 = EF.id_byte(var0, var1, var2 + id_super[8], var5);
                     boolean var24 = EF.id_byte(var0, var1, var2 + id_synchronized[33], var5);
                     boolean var48 = EF.id_break(var0, var1, var2, var5, var21);
                     boolean var26 = EF.id_byte(var0, var4, var2 + id_super[9], var3);
                     boolean var49 = EF.id_byte(var0, var4, var2 + id_synchronized[34], var3);
                     boolean var50 = EF.id_break(var0, var4, var2, var3, var22);
                     if ((var46 && var24 && var48 || var26 && var49 && var50)
                        && !EF.id_throws(var21)
                        && !EF.id_throws(var22)
                        && (!var46 || !var24 || !EF.id_class(var0, var1, var2, var5, var21))
                        && (!var26 || !var49 || !EF.id_class(var0, var4, var2, var3, var22))
                        && (var46 || !var24 || !var48)
                        && (var26 || !var49 || !var50)) {
                        Double var33 = var44 * (Double)id_continue[id_else[83]] + id_break;
                        var6.id_class[id_else[84]] = var33;
                        Integer var34 = var4;
                        var6.id_class[id_else[85]] = var34;
                        Integer var35 = var5;
                        var6.id_class[id_else[86]] = var35;
                        Integer var36 = var2 + id_synchronized[35];
                        var6.id_class[id_else[87]] = var36;
                     }
                  } else {
                     double var23 = EF.id_class(var0, var1, var2, var5, var21, id_synchronized[36]);
                     double var25 = EF.id_class(var0, var4, var2, var3, var22, id_synchronized[37]);
                     if (var23 == id_this[6] || var25 == id_this[7]) {
                        xc_3 var27 = var0.id_class(var1, var2 + id_synchronized[38], var5);
                        var23 += EF.id_class(var0, var1, var2 + id_synchronized[39], var5, var27, id_synchronized[40]);
                        if (var23 == id_this[8] || var25 == id_this[9]) {
                           xc_3 var28 = var0.id_class(var4, var2 + id_synchronized[41], var3);
                           if (var23 != id_this[10] || (!EF.id_throws(var22) || var22.id_break() == xu_3.id_try) && !EF.id_throws(var28)) {
                              var25 += EF.id_class(var0, var4, var2 + id_synchronized[42], var3, var28, id_synchronized[43]);
                              if (var23 == id_this[11] || var25 == id_this[12]) {
                                 if (var25 != id_this[13] || (!EF.id_throws(var21) || var21.id_break() == xu_3.id_try) && !EF.id_throws(var27)) {
                                    if (var23 != id_this[14] || var25 != id_this[15]) {
                                       var44 *= id_continue[id_else[88]] - id_this[16];
                                       if (var20 == xu_3.PJ || var20 == xu_3.BD) {
                                          return;
                                       }
                                    } else if ((Boolean)var0.id_break[id_else[89]] && !var18) {
                                       var44 *= id_this[17];
                                    }

                                    Double var37 = var44 * (Double)id_continue[id_else[90]];
                                    var6.id_class[id_else[91]] = var37;
                                    if (var11) {
                                       Double var38 = (Double)var6.id_class[id_else[92]] + Math.max(id_package[id_synchronized[44]], id_this[18]);
                                       var6.id_class[id_else[93]] = var38;
                                       Integer var39 = var2 - id_synchronized[45];
                                       var6.id_class[id_else[94]] = var39;
                                    } else {
                                       Integer var40 = var2;
                                       var6.id_class[id_else[95]] = var40;
                                    }

                                    Integer var41 = var4;
                                    var6.id_class[id_else[96]] = var41;
                                    Integer var42 = var5;
                                    var6.id_class[id_else[97]] = var42;
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
      if ((List)this.id_new[id_else[124]] != null) {
         return (List<rfH_2>)this.id_new[id_else[125]];
      } else {
         ArrayList var2 = new ArrayList();

         for (int var3 = id_super[11]; var3 < id_super[12]; var3++) {
            if (!EF.id_break(
               var1,
               (Integer)((rU_2[])this.id_new[id_else[126]])[var3].id_break[id_else[127]],
               (Integer)((rU_2[])this.id_new[id_else[128]])[var3].id_break[id_else[129]],
               (Integer)((rU_2[])this.id_new[id_else[130]])[var3].id_break[id_else[131]]
            )) {
               var2.add(((rU_2[])this.id_new[id_else[132]])[var3]);
            }
         }

         this.id_new[id_else[133]] = var2;
         return var2;
      }
   }

   @Override
   public double id_class(EZ var1) {
      Mr_1 var2 = new Mr_1();
      id_class(
         var1,
         (Integer)((rU_2)this.id_new[id_else[35]]).id_break[id_else[36]],
         (Integer)((rU_2)this.id_new[id_else[37]]).id_break[id_else[38]],
         (Integer)((rU_2)this.id_new[id_else[39]]).id_break[id_else[40]],
         (Integer)((rU_2)this.id_new[id_else[41]]).id_break[id_else[42]],
         (Integer)((rU_2)this.id_new[id_else[43]]).id_break[id_else[44]],
         var2
      );
      return var2.id_class[id_else[45]] != ((rU_2)this.id_new[id_else[46]]).id_break[id_else[47]] ? id_this[2] : (Double)var2.id_class[id_else[48]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2525528200496678257L;
   }

   @Override
   public boolean id_class(EA var1) {
      cb_3 var2 = ((Ps_1)this.id_new[id_else[0]]).id_catch();
      double var3 = id_this[0];
      double var5 = var2.Ps().id_break;
      double var7 = var2.Ps().id_byte - id_this[1];
      double var9 = var2.Ps().id_protected;
      if (((Ps_1)this.id_new[id_else[1]]).id_volatile().equals((rU_2)this.id_new[id_else[2]])) {
         return id_synchronized[2];
      } else if (EF.id_class(
            (Ps_1)this.id_new[id_else[3]],
            new rfH_2(
               (Integer)((rU_2)this.id_new[id_else[4]]).id_break[id_else[5]],
               (Integer)((rU_2)this.id_new[id_else[6]]).id_break[id_else[7]] - id_synchronized[3],
               (Integer)((rU_2)this.id_new[id_else[8]]).id_break[id_else[9]]
            )
         )
         && EF.id_class(
            (Ps_1)this.id_new[id_else[10]],
            new rfH_2(
               (Integer)((rU_2)this.id_new[id_else[11]]).id_break[id_else[12]],
               (Integer)((rU_2)this.id_new[id_else[13]]).id_break[id_else[14]] - id_synchronized[4],
               (Integer)((rU_2)this.id_new[id_else[15]]).id_break[id_else[16]]
            )
         )) {
         return id_synchronized[5];
      } else if (!((Ps_1)this.id_new[id_else[17]])
            .id_volatile()
            .equals(
               new rU_2(
                  (Integer)((rU_2)this.id_new[id_else[18]]).id_break[id_else[19]],
                  (Integer)((rU_2)this.id_new[id_else[20]]).id_break[id_else[21]],
                  (Integer)((rU_2)this.id_new[id_else[22]]).id_break[id_else[23]]
               )
            )
         && !((Ps_1)this.id_new[id_else[24]])
            .id_volatile()
            .equals(
               new rU_2(
                  (Integer)((rU_2)this.id_new[id_else[25]]).id_break[id_else[26]],
                  (Integer)((rU_2)this.id_new[id_else[27]]).id_break[id_else[28]],
                  (Integer)((rU_2)this.id_new[id_else[29]]).id_break[id_else[30]]
               )
            )) {
         return id_synchronized[8];
      } else {
         return !EF.id_break((Ps_1)this.id_new[id_else[31]], new rU_2(var5 + var3, var7, var9 + var3))
               && !EF.id_break((Ps_1)this.id_new[id_else[32]], new rU_2(var5 + var3, var7, var9 - var3))
               && !EF.id_break((Ps_1)this.id_new[id_else[33]], new rU_2(var5 - var3, var7, var9 + var3))
               && !EF.id_break((Ps_1)this.id_new[id_else[34]], new rU_2(var5 - var3, var7, var9 - var3))
            ? id_synchronized[7]
            : id_synchronized[6];
      }
   }

   @Override
   public boolean id_break(EA var1) {
      return id_synchronized[52];
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
      if (EF.id_protected((Ps_1)this.id_new[id_else[119]], ((Ps_1)this.id_new[id_else[120]]).id_volatile())
         && !(Boolean)C_class.id_instanceof().id_finally.id_class[id_else[121]]) {
         return id_synchronized[48];
      } else {
         for (int var1 = id_synchronized[49]; var1 < id_super[10]; var1++) {
            if (!EF.id_class((Ps_1)this.id_new[id_else[122]], ((rU_2[])this.id_new[id_else[123]])[var1])) {
               return id_synchronized[50];
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
         (Integer)((rU_2)this.id_new[id_else[49]]).id_break[id_else[50]],
         (Integer)((rU_2)this.id_new[id_else[51]]).id_break[id_else[52]],
         (Integer)((rU_2)this.id_new[id_else[53]]).id_break[id_else[54]]
      );
      rU_2 var2 = new rU_2(
         (Integer)((rU_2)this.id_new[id_else[55]]).id_break[id_else[56]],
         (Integer)((rU_2)this.id_new[id_else[57]]).id_break[id_else[58]],
         (Integer)((rU_2)this.id_new[id_else[59]]).id_break[id_else[60]]
      );
      if ((Integer)((rU_2)this.id_new[id_else[61]]).id_break[id_else[62]] < (Integer)((rU_2)this.id_new[id_else[63]]).id_break[id_else[64]]) {
         rU_2 var3 = (rU_2)this.id_new[id_else[65]];
         rU_2 var4 = ((rU_2)this.id_new[id_else[66]]).id_class();
         rU_2 var5 = (rU_2)this.id_new[id_else[67]];
         rU_2 var6 = var1.id_case();
         rU_2[] var7 = new rU_2[id_synchronized[9]];
         var7[id_synchronized[10]] = var2.id_case();
         return ImmutableSet.of(var3, var4, var1, var2, var5, var6, var7);
      } else if ((Integer)((rU_2)this.id_new[id_else[68]]).id_break[id_else[69]] > (Integer)((rU_2)this.id_new[id_else[70]]).id_break[id_else[71]]) {
         rU_2 var10000 = (rU_2)this.id_new[id_else[72]];
         rU_2 var10001 = ((rU_2)this.id_new[id_else[73]]).id_class();
         rU_2 var10004 = (rU_2)this.id_new[id_else[74]];
         rU_2 var10005 = var1.id_class();
         rU_2[] var10006 = new rU_2[id_synchronized[11]];
         var10006[id_synchronized[12]] = var2.id_class();
         return ImmutableSet.of(var10000, var10001, var1, var2, var10004, var10005, var10006);
      } else {
         return ImmutableSet.of((rU_2)this.id_new[id_else[75]], (rU_2)this.id_new[id_else[76]], var1, var2);
      }
   }
}
