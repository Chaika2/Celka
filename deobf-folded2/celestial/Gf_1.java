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
      return !var1.id_class() && var1.id_break().equals(rdy_3.Xv) ? true : id_catch[8];
   }

   @Override
   public boolean id_byte() {
      this.id_native();
      return (Boolean)this.id_throws[0];
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
      return "Farming";
   }

   private boolean id_class(rYB var1, rfH_2 var2, xc_3 var3) {
      for (Gj_1 var7 : Gj_1.values()) {
         if ((xd_3)var7.fieldsc2539fcd16d03c23acab3f85bec2d6b6[0] == var3.id_break()) {
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
      if ((Integer)C_class.id_instanceof().Pf.id_class[0] != 0) {
         int var10002 = (Integer)this.id_throws[2];
         Integer var23 = var10002 + 1;
         this.id_throws[2] = var23;
         if (var10002 % (Integer)C_class.id_instanceof().Pf.id_class[0] == 0) {
            ArrayList var3 = new ArrayList();

            for (Gj_1 var7 : Gj_1.values()) {
               var3.add((xd_3)var7.fieldsc2539fcd16d03c23acab3f85bec2d6b6[0]);
            }

            if ((Boolean)C_class.id_instanceof().PG.id_class[0]) {
               var3.add(xu_3.PS);
               var3.add(xu_3.id_default);
               if ((Boolean)C_class.id_instanceof().rd.id_class[0]) {
                  var3.add(xu_3.PY);
               }
            }

            C_class.id_interface().execute(() -> {
               this.id_native();
               List var6 = C_throws.id_class().id_throws().id_class((Ps_1)this.id_case[1], var3, (Integer)C_class.id_instanceof().f.id_class[0], 10, 10);
               this.id_throws[1] = var6;
            });
         }
      }

      if ((List)this.id_throws[1] == null) {
         return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
      } else {
         ArrayList var24 = new ArrayList();
         ArrayList var25 = new ArrayList();
         ArrayList var26 = new ArrayList();
         ArrayList var27 = new ArrayList();
         ArrayList var28 = new ArrayList();

         for (rfH_2 var9 : (List)this.id_throws[1]) {
            if ((Integer)this.id_throws[3] == 0
               || !(var9.id_private((rfH_2)this.id_throws[4]) > (double)((Integer)this.id_throws[3] * (Integer)this.id_throws[3]))) {
               xc_3 var10 = ((Ps_1)this.id_case[1]).id_case().id_byte(var9);
               boolean var11 = ((Ps_1)this.id_case[1]).id_case().id_byte(var9.id_final()).id_break() instanceof Ja_1;
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
                     if (((Ps_1)this.id_case[1]).id_case().id_byte(var9.id_break(var13)).id_break() instanceof Ja_1) {
                        var28.add(var9);
                        break;
                     }
                  }
               } else if (this.id_class(((Ps_1)this.id_case[1]).id_case(), var9, var10)) {
                  var24.add(var9);
               } else if (var10.id_break() instanceof kX_2) {
                  kX_2 var12 = (kX_2)var10.id_break();
                  if (var12.id_class(((Ps_1)this.id_case[1]).id_case(), var9, var10, true)
                     && var12.id_class(((Ps_1)this.id_case[1]).id_case(), ((Ps_1)this.id_case[1]).id_case().id_int, var9, var10)) {
                     var26.add(var9);
                  }
               }
            }
         }

         ((C_class)this.id_case[0]).id_int().id_class();
         rU_2 var29 = ((Ps_1)this.id_case[1]).id_volatile();
         double var30 = ((Ps_1)this.id_case[1]).id_native().id_case();

         for (rfH_2 var34 : var24) {
            if (!(var29.id_private(var34) > var30 * var30)) {
               Optional var39 = PJ.id_class((Ps_1)this.id_case[1], var34);
               if (var39.isPresent() && var2) {
                  ((C_class)this.id_case[0]).id_private().id_class(((Px_1)var39.get()).id_class(), true);
                  EF.id_class((Ps_1)this.id_case[1], ((Ps_1)this.id_case[1]).id_case().id_byte(var34));
                  if (((Ps_1)this.id_case[1]).id_class(var34)) {
                     ((C_class)this.id_case[0]).id_int().id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[4], true);
                  }

                  return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
               }
            }
         }

         ArrayList var32 = new ArrayList(var25);
         var32.addAll(var27);

         for (rfH_2 var40 : var32) {
            if (!(var29.id_private(var40) > var30 * var30)) {
               boolean var14 = var27.contains(var40);
               Optional var15 = PJ.id_class(
                  (Ps_1)this.id_case[1], var40, new rjU_2((double)var40.b_() + 0.5, (double)(var40.c_() + 1), (double)var40.d_() + 0.5), var30, false
               );
               if (var15.isPresent() && var2 && ((C_class)this.id_case[0]).id_static().id_class(true, var14 ? this::id_class : this::id_protected)) {
                  rjG_2 var16 = Ph_1.id_class(((Ps_1)this.id_case[1]).id_catch(), ((Px_1)var15.get()).id_class(), var30);
                  if (var16 instanceof rff_3 && ((rff_3)var16).id_break() == rpr_3.UP) {
                     ((C_class)this.id_case[0]).id_private().id_class(((Px_1)var15.get()).id_class(), true);
                     if (((Ps_1)this.id_case[1]).id_class(var40)) {
                        ((C_class)this.id_case[0]).id_int().id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], true);
                     }

                     return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
                  }
               }
            }
         }

         for (rfH_2 var41 : var28) {
            if (!(var29.id_private(var41) > var30 * var30)) {
               for (rpr_3 var57 : rpb_3.HORIZONTAL) {
                  if (((Ps_1)this.id_case[1]).id_case().id_byte(var41.id_break(var57)).id_break() instanceof Ja_1) {
                     rjU_2 var60 = rjU_2.id_class((rja_3)var41).id_throws(rjU_2.id_break(var57.id_int()).id_class(0.5));
                     Optional var17 = PJ.id_class((Ps_1)this.id_case[1], var41, var60, var30, false);
                     if (var17.isPresent() && var2 && ((C_class)this.id_case[0]).id_static().id_class(true, this::id_byte)) {
                        rjG_2 var18 = Ph_1.id_class(((Ps_1)this.id_case[1]).id_catch(), ((Px_1)var17.get()).id_class(), var30);
                        if (var18 instanceof rff_3 && ((rff_3)var18).id_break() == var57) {
                           ((C_class)this.id_case[0]).id_private().id_class(((Px_1)var17.get()).id_class(), true);
                           if (((Ps_1)this.id_case[1]).id_class(var41)) {
                              ((C_class)this.id_case[0]).id_int().id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], true);
                           }

                           return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
                        }
                     }
                  }
               }
            }
         }

         for (rfH_2 var42 : var26) {
            if (!(var29.id_private(var42) > var30 * var30)) {
               Optional var50 = PJ.id_class((Ps_1)this.id_case[1], var42);
               if (var50.isPresent() && var2 && ((C_class)this.id_case[0]).id_static().id_class(true, this::id_break)) {
                  ((C_class)this.id_case[0]).id_private().id_class(((Px_1)var50.get()).id_class(), true);
                  if (((Ps_1)this.id_case[1]).id_class(var42)) {
                     ((C_class)this.id_case[0]).id_int().id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], true);
                  }

                  return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
               }
            }
         }

         if (var1) {
            this.id_case("Фарм не удался");
            if ((Boolean)C_class.id_instanceof().m.id_class[0]) {
               this.id_byte("Фарм не удался", true);
            }

            this.id_protected();
            return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
         } else {
            ArrayList var38 = new ArrayList();

            for (rfH_2 var51 : var24) {
               var38.add(new Gv_1(var51));
            }

            if (((C_class)this.id_case[0]).id_static().id_class(false, this::id_protected)) {
               for (rfH_2 var52 : var25) {
                  var38.add(new rS_2(var52.id_final()));
               }
            }

            if (((C_class)this.id_case[0]).id_static().id_class(false, this::id_class)) {
               for (rfH_2 var53 : var27) {
                  var38.add(new rS_2(var53.id_final()));
               }
            }

            if (((C_class)this.id_case[0]).id_static().id_class(false, this::id_byte)) {
               for (rfH_2 var54 : var28) {
                  for (rpr_3 var61 : rpb_3.HORIZONTAL) {
                     if (((Ps_1)this.id_case[1]).id_case().id_byte(var54.id_break(var61)).id_break() instanceof Ja_1) {
                        var38.add(new rE_2(var54.id_break(var61)));
                     }
                  }
               }
            }

            if (((C_class)this.id_case[0]).id_static().id_class(false, this::id_break)) {
               for (rfH_2 var55 : var26) {
                  var38.add(new rS_2(var55));
               }
            }

            for (an_3 var56 : ((Ps_1)this.id_case[1]).id_final()) {
               if (var56 instanceof rsE_2) {
                  rsE_2 var59 = (rsE_2)var56;
                  if (var56.BL() && ((List)id_break[1]).contains(var59.id_protected().id_break())) {
                     rjU_2 var62 = var56.Ps();
                     var38.add(new rS_2(new rU_2(var62.id_class(), var62.id_break() + 0.1, var62.id_byte())));
                  }
               }
            }

            if (var38.isEmpty()) {
               this.id_case("Фарм не удался");
               if ((Boolean)C_class.id_instanceof().m.id_class[0]) {
                  this.id_byte("Фарм не удался", true);
               }

               this.id_protected();
               return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
            } else {
               return new rn_3(new rs_3(var38.toArray(new rP_2[0])), (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[0]);
            }
         }
      }
   }

   @Override
   public void id_class(int var1, rfH_2 var2) {
      this.id_native();
      if (var2 == null) {
         rU_2 var7 = ((C_class)this.id_case[0]).id_throw().id_volatile();
         this.id_throws[4] = var7;
      } else {
         this.id_throws[4] = var2;
      }

      Integer var9 = var1;
      this.id_throws[3] = var9;
      Boolean var10 = true;
      this.id_throws[0] = var10;
      Object var11 = null;
      this.id_throws[1] = var11;
   }

   private boolean id_class(rdn_3 var1) {
      return !var1.id_class() && var1.id_break().equals(rdy_3.JL) ? true : id_catch[6];
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
      return !var1.id_class() && var1.id_break().equals(rdy_3.Xg) ? true : id_catch[4];
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
      Boolean var5 = false;
      this.id_throws[0] = var5;
   }

   private boolean id_protected(rdn_3 var1) {
      return ((List)id_break[0]).contains(var1.id_break());
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
         this.id_throws = new Object[5];
         Object[] var1 = this.id_throws;
         var1[0] = false;
         var1[2] = 0;
         var1[3] = 0;
      }
   }
}
