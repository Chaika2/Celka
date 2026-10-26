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
   private static boolean[] catch_;
   private static byte[] private_;
   private static double[] implements_;
   private static short[] finally_;
   public static Object[] break_;
   private static String[] extends_;
   public Object[] throws_;

   private boolean byte_(rdn_3 var1) {
      return !var1.class_() && var1.break_().equals(rdy_3.Xv) ? true : catch_[8];
   }

   @Override
   public boolean byte_() {
      this.native_();
      return (Boolean)this.throws_[0];
   }

   public Gf_1(C_class var1) {
      super(var1);
      this.native_();
   }

   static {
      ntfClinit();
   }

   @Override
   public String class_() {
      return "Farming";
   }

   private boolean class_(rYB var1, rfH_2 var2, xc_3 var3) {
      for (Gj_1 var7 : Gj_1.values()) {
         if ((xd_3)var7.fieldsc2539fcd16d03c23acab3f85bec2d6b6[0] == var3.break_()) {
            return var7.class_(var1, var2, var3);
         }
      }

      return catch_[2];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1539468312313468045L;
   }

   @Override
   public rn_3 class_(boolean var1, boolean var2) {
      this.native_();
      if ((Integer)C_class.instanceof_().Pf.class_[0] != 0) {
         int var10002 = (Integer)this.throws_[2];
         Integer var23 = var10002 + 1;
         this.throws_[2] = var23;
         if (var10002 % (Integer)C_class.instanceof_().Pf.class_[0] == 0) {
            ArrayList var3 = new ArrayList();

            for (Gj_1 var7 : Gj_1.values()) {
               var3.add((xd_3)var7.fieldsc2539fcd16d03c23acab3f85bec2d6b6[0]);
            }

            if ((Boolean)C_class.instanceof_().PG.class_[0]) {
               var3.add(xu_3.PS);
               var3.add(xu_3.default_);
               if ((Boolean)C_class.instanceof_().rd.class_[0]) {
                  var3.add(xu_3.PY);
               }
            }

            C_class.interface_().execute(() -> {
               this.native_();
               List var6 = C_throws.class_().throws_().class_((Ps_1)this.case_[1], var3, (Integer)C_class.instanceof_().f.class_[0], 10, 10);
               this.throws_[1] = var6;
            });
         }
      }

      if ((List)this.throws_[1] == null) {
         return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
      } else {
         ArrayList var24 = new ArrayList();
         ArrayList var25 = new ArrayList();
         ArrayList var26 = new ArrayList();
         ArrayList var27 = new ArrayList();
         ArrayList var28 = new ArrayList();

         for (rfH_2 var9 : (List)this.throws_[1]) {
            if ((Integer)this.throws_[3] == 0 || !(var9.private_((rfH_2)this.throws_[4]) > (double)((Integer)this.throws_[3] * (Integer)this.throws_[3]))) {
               xc_3 var10 = ((Ps_1)this.case_[1]).case_().byte_(var9);
               boolean var11 = ((Ps_1)this.case_[1]).case_().byte_(var9.final_()).break_() instanceof Ja_1;
               if (var10.break_() == xu_3.PS) {
                  if (var11) {
                     var25.add(var9);
                  }
               } else if (var10.break_() == xu_3.PY) {
                  if (var11) {
                     var27.add(var9);
                  }
               } else if (var10.break_() == xu_3.default_) {
                  for (rpr_3 var13 : rpb_3.HORIZONTAL) {
                     if (((Ps_1)this.case_[1]).case_().byte_(var9.break_(var13)).break_() instanceof Ja_1) {
                        var28.add(var9);
                        break;
                     }
                  }
               } else if (this.class_(((Ps_1)this.case_[1]).case_(), var9, var10)) {
                  var24.add(var9);
               } else if (var10.break_() instanceof kX_2) {
                  kX_2 var12 = (kX_2)var10.break_();
                  if (var12.class_(((Ps_1)this.case_[1]).case_(), var9, var10, true)
                     && var12.class_(((Ps_1)this.case_[1]).case_(), ((Ps_1)this.case_[1]).case_().int_, var9, var10)) {
                     var26.add(var9);
                  }
               }
            }
         }

         ((C_class)this.case_[0]).int_().class_();
         rU_2 var29 = ((Ps_1)this.case_[1]).volatile_();
         double var30 = ((Ps_1)this.case_[1]).native_().case_();

         for (rfH_2 var34 : var24) {
            if (!(var29.private_(var34) > var30 * var30)) {
               Optional var39 = PJ.class_((Ps_1)this.case_[1], var34);
               if (var39.isPresent() && var2) {
                  ((C_class)this.case_[0]).private_().class_(((Px_1)var39.get()).class_(), true);
                  EF.class_((Ps_1)this.case_[1], ((Ps_1)this.case_[1]).case_().byte_(var34));
                  if (((Ps_1)this.case_[1]).class_(var34)) {
                     ((C_class)this.case_[0]).int_().class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[4], true);
                  }

                  return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
               }
            }
         }

         ArrayList var32 = new ArrayList(var25);
         var32.addAll(var27);

         for (rfH_2 var40 : var32) {
            if (!(var29.private_(var40) > var30 * var30)) {
               boolean var14 = var27.contains(var40);
               Optional var15 = PJ.class_(
                  (Ps_1)this.case_[1], var40, new rjU_2((double)var40.b_() + 0.5, (double)(var40.c_() + 1), (double)var40.d_() + 0.5), var30, false
               );
               if (var15.isPresent() && var2 && ((C_class)this.case_[0]).static_().class_(true, var14 ? this::class_ : this::protected_)) {
                  rjG_2 var16 = Ph_1.class_(((Ps_1)this.case_[1]).catch_(), ((Px_1)var15.get()).class_(), var30);
                  if (var16 instanceof rff_3 && ((rff_3)var16).break_() == rpr_3.UP) {
                     ((C_class)this.case_[0]).private_().class_(((Px_1)var15.get()).class_(), true);
                     if (((Ps_1)this.case_[1]).class_(var40)) {
                        ((C_class)this.case_[0]).int_().class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], true);
                     }

                     return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
                  }
               }
            }
         }

         for (rfH_2 var41 : var28) {
            if (!(var29.private_(var41) > var30 * var30)) {
               for (rpr_3 var57 : rpb_3.HORIZONTAL) {
                  if (((Ps_1)this.case_[1]).case_().byte_(var41.break_(var57)).break_() instanceof Ja_1) {
                     rjU_2 var60 = rjU_2.class_((rja_3)var41).throws_(rjU_2.break_(var57.int_()).class_(0.5));
                     Optional var17 = PJ.class_((Ps_1)this.case_[1], var41, var60, var30, false);
                     if (var17.isPresent() && var2 && ((C_class)this.case_[0]).static_().class_(true, this::byte_)) {
                        rjG_2 var18 = Ph_1.class_(((Ps_1)this.case_[1]).catch_(), ((Px_1)var17.get()).class_(), var30);
                        if (var18 instanceof rff_3 && ((rff_3)var18).break_() == var57) {
                           ((C_class)this.case_[0]).private_().class_(((Px_1)var17.get()).class_(), true);
                           if (((Ps_1)this.case_[1]).class_(var41)) {
                              ((C_class)this.case_[0]).int_().class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], true);
                           }

                           return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
                        }
                     }
                  }
               }
            }
         }

         for (rfH_2 var42 : var26) {
            if (!(var29.private_(var42) > var30 * var30)) {
               Optional var50 = PJ.class_((Ps_1)this.case_[1], var42);
               if (var50.isPresent() && var2 && ((C_class)this.case_[0]).static_().class_(true, this::break_)) {
                  ((C_class)this.case_[0]).private_().class_(((Px_1)var50.get()).class_(), true);
                  if (((Ps_1)this.case_[1]).class_(var42)) {
                     ((C_class)this.case_[0]).int_().class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], true);
                  }

                  return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
               }
            }
         }

         if (var1) {
            this.case_("Фарм не удался");
            if ((Boolean)C_class.instanceof_().m.class_[0]) {
               this.byte_("Фарм не удался", true);
            }

            this.protected_();
            return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
         } else {
            ArrayList var38 = new ArrayList();

            for (rfH_2 var51 : var24) {
               var38.add(new Gv_1(var51));
            }

            if (((C_class)this.case_[0]).static_().class_(false, this::protected_)) {
               for (rfH_2 var52 : var25) {
                  var38.add(new rS_2(var52.final_()));
               }
            }

            if (((C_class)this.case_[0]).static_().class_(false, this::class_)) {
               for (rfH_2 var53 : var27) {
                  var38.add(new rS_2(var53.final_()));
               }
            }

            if (((C_class)this.case_[0]).static_().class_(false, this::byte_)) {
               for (rfH_2 var54 : var28) {
                  for (rpr_3 var61 : rpb_3.HORIZONTAL) {
                     if (((Ps_1)this.case_[1]).case_().byte_(var54.break_(var61)).break_() instanceof Ja_1) {
                        var38.add(new rE_2(var54.break_(var61)));
                     }
                  }
               }
            }

            if (((C_class)this.case_[0]).static_().class_(false, this::break_)) {
               for (rfH_2 var55 : var26) {
                  var38.add(new rS_2(var55));
               }
            }

            for (an_3 var56 : ((Ps_1)this.case_[1]).final_()) {
               if (var56 instanceof rsE_2) {
                  rsE_2 var59 = (rsE_2)var56;
                  if (var56.BL() && ((List)break_[1]).contains(var59.protected_().break_())) {
                     rjU_2 var62 = var56.Ps();
                     var38.add(new rS_2(new rU_2(var62.class_(), var62.break_() + 0.1, var62.byte_())));
                  }
               }
            }

            if (var38.isEmpty()) {
               this.case_("Фарм не удался");
               if ((Boolean)C_class.instanceof_().m.class_[0]) {
                  this.byte_("Фарм не удался", true);
               }

               this.protected_();
               return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
            } else {
               return new rn_3(new rs_3(var38.toArray(new rP_2[0])), (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[0]);
            }
         }
      }
   }

   @Override
   public void class_(int var1, rfH_2 var2) {
      this.native_();
      if (var2 == null) {
         rU_2 var7 = ((C_class)this.case_[0]).throw_().volatile_();
         this.throws_[4] = var7;
      } else {
         this.throws_[4] = var2;
      }

      Integer var9 = var1;
      this.throws_[3] = var9;
      Boolean var10 = true;
      this.throws_[0] = var10;
      Object var11 = null;
      this.throws_[1] = var11;
   }

   private boolean class_(rdn_3 var1) {
      return !var1.class_() && var1.break_().equals(rdy_3.JL) ? true : catch_[6];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{96, 82, -99, 66, -85, 26, -69, 72}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1074233177;
   }

   private boolean break_(rdn_3 var1) {
      return !var1.class_() && var1.break_().equals(rdy_3.Xg) ? true : catch_[4];
   }

   private static void finally_() {
      finally_ = new short[]{
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

   private static void extends_() {
      extends_ = new String[]{
         new String("Фарм не удался"), new String("Фарм не удался"), new String("Фарм не удался"), new String("Фарм не удался"), new String("Farming")
      };
   }

   private static void implements_() {
      implements_ = new double[]{0.5, 0.5, 0.5, 0.1};
   }

   private static void package_() {
      Object[] var0 = new Object[2];
      rdb_3[] var2 = new rdb_3[]{rdy_3.kJ, rdy_3.JW, rdy_3.hP, rdy_3.Jk, rdy_3.dE, rdy_3.ds};
      var0[0] = Arrays.asList(var2);
      rdb_3[] var3 = new rdb_3[]{
         rdy_3.kJ, rdy_3.kX, rdy_3.JW, rdy_3.Jx, rdy_3.BU, rdy_3.hP, rdy_3.hB, rdy_3.Jk, rdy_3.Bd, rdy_3.dE, rdy_3.ds, rdy_3.JL, rdy_3.rT, rdy_3.rw, rdy_3.BS
      };
      var0[1] = Arrays.asList(var3);
      break_ = var0;
   }

   @Override
   public void protected_() {
      this.native_();
      super.protected_();
      Boolean var5 = false;
      this.throws_[0] = var5;
   }

   private boolean protected_(rdn_3 var1) {
      return ((List)break_[0]).contains(var1.break_());
   }

   private static void final_() {
      private_ = new byte[]{10, 10, 6, 2, 3, 4, 5, 15, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 5, 2, 3, 2};
   }

   private static void volatile_() {
      catch_ = new boolean[]{
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

   private void native_() {
      if (this.throws_ == null) {
         this.throws_ = new Object[5];
         Object[] var1 = this.throws_;
         var1[0] = false;
         var1[2] = 0;
         var1[3] = 0;
      }
   }
}
