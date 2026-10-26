package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gf_1 extends bq_3 implements rZ_2 {
   private static boolean[] id_catch;
   private static byte[] id_private;
   private static double[] id_implements;
   private static short[] id_finally;
   public static Object[] id_break;
   private static String[] id_extends;
   public Object[] id_throws;

   private boolean id_byte(rdn_3 var1) {
      return !var1.id_class() && var1.id_break().equals(rdy_3.Xv) ? id_catch[7] : id_catch[8];
   }

   @Override
   public boolean id_byte() {
      this.id_native();
      return (Boolean)this.id_throws[id_finally[0]];
   }

   public Gf_1(C_class var1) {
      super(var1);
      this.id_native();
   }

   static {
      ntfClinit();
   }

   @Override
   public String id_class() {
      return id_extends[4];
   }

   private boolean id_class(rYB var1, rfH_2 var2, xc_3 var3) {
      Gj_1[] var4 = Gj_1.values();
      int var5 = var4.length;

      for (int var6 = id_catch[1]; var6 < var5; var6++) {
         Gj_1 var7 = var4[var6];
         if ((xd_3)var7.fieldsc2539fcd16d03c23acab3f85bec2d6b6[id_finally[7]] == var3.id_break()) {
            return var7.id_class(var1, var2, var3);
         }
      }

      return id_catch[2];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1539468312313468045L;
   }

   @Override
   public rn_3 id_class(boolean var1, boolean var2) {
      this.id_native();
      if ((Integer)C_class.id_instanceof().Pf.id_class[id_finally[9]] != 0) {
         int var10002 = (Integer)this.id_throws[id_finally[10]];
         Integer var23 = var10002 + id_catch[9];
         this.id_throws[id_finally[11]] = var23;
         if (var10002 % (Integer)C_class.id_instanceof().Pf.id_class[id_finally[12]] == 0) {
            ArrayList var3 = new ArrayList();
            Gj_1[] var4 = Gj_1.values();
            int var5 = var4.length;

            for (int var6 = id_catch[10]; var6 < var5; var6++) {
               Gj_1 var7 = var4[var6];
               var3.add((xd_3)var7.fieldsc2539fcd16d03c23acab3f85bec2d6b6[id_finally[13]]);
            }

            if ((Boolean)C_class.id_instanceof().PG.id_class[id_finally[14]]) {
               var3.add(xu_3.PS);
               var3.add(xu_3.id_default);
               if ((Boolean)C_class.id_instanceof().rd.id_class[id_finally[15]]) {
                  var3.add(xu_3.PY);
               }
            }

            C_class.id_interface()
               .execute(
                  () -> {
                     this.id_native();
                     List var6x = C_throws.id_class()
                        .id_throws()
                        .id_class(
                           (Ps_1)this.id_case[id_finally[78]], var3, (Integer)C_class.id_instanceof().f.id_class[id_finally[79]], id_private[0], id_private[1]
                        );
                     this.id_throws[id_finally[80]] = var6x;
                  }
               );
         }
      }

      if ((List)this.id_throws[id_finally[16]] == null) {
         return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_finally[17]]);
      } else {
         ArrayList var24 = new ArrayList();
         ArrayList var25 = new ArrayList();
         ArrayList var26 = new ArrayList();
         ArrayList var27 = new ArrayList();
         ArrayList var28 = new ArrayList();

         for (rfH_2 var9 : (List)this.id_throws[id_finally[18]]) {
            if ((Integer)this.id_throws[id_finally[19]] == 0
               || !(
                  var9.id_private((rfH_2)this.id_throws[id_finally[20]])
                     > (double)((Integer)this.id_throws[id_finally[21]] * (Integer)this.id_throws[id_finally[22]])
               )) {
               xc_3 var10 = ((Ps_1)this.id_case[id_finally[23]]).id_case().id_byte(var9);
               boolean var11 = ((Ps_1)this.id_case[id_finally[24]]).id_case().id_byte(var9.id_final()).id_break() instanceof Ja_1;
               if (var10.id_break() == xu_3.PS) {
                  if (var11) {
                     var25.add(var9);
                  }
               } else if (var10.id_break() == xu_3.PY) {
                  if (var11) {
                     var27.add(var9);
                  }
               } else if (var10.id_break() == xu_3.id_default) {
                  for (rpr_3 var13 : rpb_3.HORIZONTAL) {
                     if (((Ps_1)this.id_case[id_finally[25]]).id_case().id_byte(var9.id_break(var13)).id_break() instanceof Ja_1) {
                        var28.add(var9);
                        break;
                     }
                  }
               } else if (this.id_class(((Ps_1)this.id_case[id_finally[26]]).id_case(), var9, var10)) {
                  var24.add(var9);
               } else if (var10.id_break() instanceof kX_2) {
                  kX_2 var12 = (kX_2)var10.id_break();
                  if (var12.id_class(((Ps_1)this.id_case[id_finally[27]]).id_case(), var9, var10, id_catch[11])
                     && var12.id_class(((Ps_1)this.id_case[id_finally[28]]).id_case(), ((Ps_1)this.id_case[id_finally[29]]).id_case().id_int, var9, var10)) {
                     var26.add(var9);
                  }
               }
            }
         }

         ((C_class)this.id_case[id_finally[30]]).id_int().id_class();
         rU_2 var29 = ((Ps_1)this.id_case[id_finally[31]]).id_volatile();
         double var30 = ((Ps_1)this.id_case[id_finally[32]]).id_native().id_case();

         for (rfH_2 var34 : var24) {
            if (!(var29.id_private(var34) > var30 * var30)) {
               Optional var39 = PJ.id_class((Ps_1)this.id_case[id_finally[33]], var34);
               if (var39.isPresent() && var2) {
                  ((C_class)this.id_case[id_finally[34]]).id_private().id_class(((Px_1)var39.get()).id_class(), id_catch[12]);
                  EF.id_class((Ps_1)this.id_case[id_finally[35]], ((Ps_1)this.id_case[id_finally[36]]).id_case().id_byte(var34));
                  if (((Ps_1)this.id_case[id_finally[37]]).id_class(var34)) {
                     ((C_class)this.id_case[id_finally[38]])
                        .id_int()
                        .id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_finally[39]], id_catch[13]);
                  }

                  return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_finally[40]]);
               }
            }
         }

         ArrayList var32 = new ArrayList(var25);
         var32.addAll(var27);

         for (rfH_2 var40 : var32) {
            if (!(var29.id_private(var40) > var30 * var30)) {
               boolean var14 = var27.contains(var40);
               Optional var15 = PJ.id_class(
                  (Ps_1)this.id_case[id_finally[41]],
                  var40,
                  new rjU_2((double)var40.b_() + id_implements[0], (double)(var40.c_() + id_catch[14]), (double)var40.d_() + id_implements[1]),
                  var30,
                  id_catch[15]
               );
               if (var15.isPresent()
                  && var2
                  && ((C_class)this.id_case[id_finally[42]]).id_static().id_class(id_catch[16], var14 ? this::id_class : this::id_protected)) {
                  rjG_2 var16 = Ph_1.id_class(((Ps_1)this.id_case[id_finally[43]]).id_catch(), ((Px_1)var15.get()).id_class(), var30);
                  if (var16 instanceof rff_3 && ((rff_3)var16).id_break() == rpr_3.UP) {
                     ((C_class)this.id_case[id_finally[44]]).id_private().id_class(((Px_1)var15.get()).id_class(), id_catch[17]);
                     if (((Ps_1)this.id_case[id_finally[45]]).id_class(var40)) {
                        ((C_class)this.id_case[id_finally[46]])
                           .id_int()
                           .id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_finally[47]], id_catch[18]);
                     }

                     return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_finally[48]]);
                  }
               }
            }
         }

         for (rfH_2 var41 : var28) {
            if (!(var29.id_private(var41) > var30 * var30)) {
               for (rpr_3 var57 : rpb_3.HORIZONTAL) {
                  if (((Ps_1)this.id_case[id_finally[49]]).id_case().id_byte(var41.id_break(var57)).id_break() instanceof Ja_1) {
                     rjU_2 var60 = rjU_2.id_class((rja_3)var41).id_throws(rjU_2.id_break(var57.id_int()).id_class(id_implements[2]));
                     Optional var17 = PJ.id_class((Ps_1)this.id_case[id_finally[50]], var41, var60, var30, id_catch[19]);
                     if (var17.isPresent() && var2 && ((C_class)this.id_case[id_finally[51]]).id_static().id_class(id_catch[20], this::id_byte)) {
                        rjG_2 var18 = Ph_1.id_class(((Ps_1)this.id_case[id_finally[52]]).id_catch(), ((Px_1)var17.get()).id_class(), var30);
                        if (var18 instanceof rff_3 && ((rff_3)var18).id_break() == var57) {
                           ((C_class)this.id_case[id_finally[53]]).id_private().id_class(((Px_1)var17.get()).id_class(), id_catch[21]);
                           if (((Ps_1)this.id_case[id_finally[54]]).id_class(var41)) {
                              ((C_class)this.id_case[id_finally[55]])
                                 .id_int()
                                 .id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_finally[56]], id_catch[22]);
                           }

                           return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_finally[57]]);
                        }
                     }
                  }
               }
            }
         }

         for (rfH_2 var42 : var26) {
            if (!(var29.id_private(var42) > var30 * var30)) {
               Optional var50 = PJ.id_class((Ps_1)this.id_case[id_finally[58]], var42);
               if (var50.isPresent() && var2 && ((C_class)this.id_case[id_finally[59]]).id_static().id_class(id_catch[23], this::id_break)) {
                  ((C_class)this.id_case[id_finally[60]]).id_private().id_class(((Px_1)var50.get()).id_class(), id_catch[24]);
                  if (((Ps_1)this.id_case[id_finally[61]]).id_class(var42)) {
                     ((C_class)this.id_case[id_finally[62]])
                        .id_int()
                        .id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_finally[63]], id_catch[25]);
                  }

                  return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_finally[64]]);
               }
            }
         }

         if (var1) {
            this.id_case(id_extends[0]);
            if ((Boolean)C_class.id_instanceof().m.id_class[id_finally[65]]) {
               this.id_byte(id_extends[1], id_catch[26]);
            }

            this.id_protected();
            return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_finally[66]]);
         } else {
            ArrayList var38 = new ArrayList();

            for (rfH_2 var51 : var24) {
               var38.add(new Gv_1(var51));
            }

            if (((C_class)this.id_case[id_finally[67]]).id_static().id_class(id_catch[27], this::id_protected)) {
               for (rfH_2 var52 : var25) {
                  var38.add(new rS_2(var52.id_final()));
               }
            }

            if (((C_class)this.id_case[id_finally[68]]).id_static().id_class(id_catch[28], this::id_class)) {
               for (rfH_2 var53 : var27) {
                  var38.add(new rS_2(var53.id_final()));
               }
            }

            if (((C_class)this.id_case[id_finally[69]]).id_static().id_class(id_catch[29], this::id_byte)) {
               for (rfH_2 var54 : var28) {
                  for (rpr_3 var61 : rpb_3.HORIZONTAL) {
                     if (((Ps_1)this.id_case[id_finally[70]]).id_case().id_byte(var54.id_break(var61)).id_break() instanceof Ja_1) {
                        var38.add(new rE_2(var54.id_break(var61)));
                     }
                  }
               }
            }

            if (((C_class)this.id_case[id_finally[71]]).id_static().id_class(id_catch[30], this::id_break)) {
               for (rfH_2 var55 : var26) {
                  var38.add(new rS_2(var55));
               }
            }

            for (an_3 var56 : ((Ps_1)this.id_case[id_finally[72]]).id_final()) {
               if (var56 instanceof rsE_2) {
                  rsE_2 var59 = (rsE_2)var56;
                  if (var56.BL() && ((List)id_break[id_finally[73]]).contains(var59.id_protected().id_break())) {
                     rjU_2 var62 = var56.Ps();
                     var38.add(new rS_2(new rU_2(var62.id_class(), var62.id_break() + id_implements[3], var62.id_byte())));
                  }
               }
            }

            if (var38.isEmpty()) {
               this.id_case(id_extends[2]);
               if ((Boolean)C_class.id_instanceof().m.id_class[id_finally[74]]) {
                  this.id_byte(id_extends[3], id_catch[31]);
               }

               this.id_protected();
               return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_finally[75]]);
            } else {
               return new rn_3(new rs_3(var38.toArray(new rP_2[id_catch[32]])), (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_finally[76]]);
            }
         }
      }
   }

   @Override
   public void id_class(int var1, rfH_2 var2) {
      this.id_native();
      if (var2 == null) {
         rU_2 var7 = ((C_class)this.id_case[id_finally[1]]).id_throw().id_volatile();
         this.id_throws[id_finally[2]] = var7;
      } else {
         this.id_throws[id_finally[3]] = var2;
      }

      Integer var9 = var1;
      this.id_throws[id_finally[4]] = var9;
      Boolean var10 = id_catch[0];
      this.id_throws[id_finally[5]] = var10;
      Object var11 = null;
      this.id_throws[id_finally[6]] = var11;
   }

   private boolean id_class(rdn_3 var1) {
      return !var1.id_class() && var1.id_break().equals(rdy_3.JL) ? id_catch[5] : id_catch[6];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{96, 82, -99, 66, -85, 26, -69, 72}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1074233177;
   }

   private boolean id_break(rdn_3 var1) {
      return !var1.id_class() && var1.id_break().equals(rdy_3.Xg) ? id_catch[3] : id_catch[4];
   }

   private static void id_finally() {
      id_finally = new short[]{
         0,
         0,
         4,
         4,
         3,
         0,
         1,
         0,
         0,
         0,
         2,
         2,
         0,
         0,
         0,
         0,
         1,
         1,
         1,
         3,
         4,
         3,
         3,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         0,
         1,
         1,
         1,
         0,
         1,
         1,
         1,
         0,
         4,
         1,
         1,
         0,
         1,
         0,
         1,
         0,
         5,
         1,
         1,
         1,
         0,
         1,
         0,
         1,
         0,
         5,
         1,
         1,
         0,
         0,
         1,
         0,
         5,
         1,
         0,
         1,
         0,
         0,
         0,
         1,
         0,
         1,
         1,
         0,
         1,
         0,
         0,
         1,
         0,
         1
      };
   }

   private static void id_extends() {
      id_extends = new String[]{
         new String("Фарм не удался"), new String("Фарм не удался"), new String("Фарм не удался"), new String("Фарм не удался"), new String("Farming")
      };
   }

   private static void id_implements() {
      id_implements = new double[]{0.5, 0.5, 0.5, 0.1};
   }

   private static void id_package() {
      Object[] var0 = new Object[2];
      rdb_3[] var2 = new rdb_3[]{rdy_3.kJ, rdy_3.JW, rdy_3.hP, rdy_3.Jk, rdy_3.dE, rdy_3.ds};
      var0[0] = Arrays.asList(var2);
      rdb_3[] var3 = new rdb_3[]{
         rdy_3.kJ, rdy_3.kX, rdy_3.JW, rdy_3.Jx, rdy_3.BU, rdy_3.hP, rdy_3.hB, rdy_3.Jk, rdy_3.Bd, rdy_3.dE, rdy_3.ds, rdy_3.JL, rdy_3.rT, rdy_3.rw, rdy_3.BS
      };
      var0[1] = Arrays.asList(var3);
      id_break = var0;
   }

   @Override
   public void id_protected() {
      this.id_native();
      super.id_protected();
      Boolean var5 = id_catch[33];
      this.id_throws[id_finally[77]] = var5;
   }

   private boolean id_protected(rdn_3 var1) {
      return ((List)id_break[id_finally[8]]).contains(var1.id_break());
   }

   private static void id_final() {
      id_private = new byte[]{10, 10, 6, 2, 3, 4, 5, 15, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 5, 2, 3, 2};
   }

   private static void id_volatile() {
      id_catch = new boolean[]{
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
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
         true,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         false,
         false
      };
   }

   private void id_native() {
      if (this.id_throws == null) {
         this.id_throws = new Object[id_private[21]];
         Object[] var1 = this.id_throws;
         var1[id_catch[40]] = id_catch[41];
         var1[id_private[22]] = Integer.valueOf(id_catch[42]);
         var1[id_private[23]] = Integer.valueOf(id_catch[43]);
      }
   }
}
