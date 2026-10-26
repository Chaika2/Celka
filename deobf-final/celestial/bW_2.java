package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class bW_2 extends bq_3 implements D, rm_3 {
   private static short[] catch_;
   public static Object[] break_;
   private static byte[] private_;
   private static float[] implements_;
   public Object[] throws_;
   private static long[] finally_;
   private static boolean[] extends_;
   private static String[] native_;
   private static double[] volatile_;

   @Override
   public boolean byte_() {
      this.public_();
      return (Boolean)this.throws_[4];
   }

   private rfH_2 byte_(rYB var1, bv_3 var2) {
      this.public_();
      if (var2 == null) {
         return null;
      } else {
         bL_2[] var3 = var2.throws_();
         if (rrki_1.break_(var3)) {
            return null;
         } else {
            bL_2 var4 = null;

            for (bL_2 var8 : var3) {
               if (((Set)this.throws_[16]).contains(new rfH_2(var8)) && !this.break_(var1, var2, var8)) {
                  var4 = var8;
                  break;
               }
            }

            return var4;
         }
      }
   }

   private static void int_() {
      private_ = new byte[]{-1, 2, 2, 2, 2, 2, 2, 9, -1, 36, 9, -1, 9, 2, 2, 9, 21, 4, 7, 9, 10, 12, 19, 20, 2};
   }

   public bW_2(C_class var1) {
      super(var1);
      this.public_();
      bX_2 var6 = new bX_2();
      this.throws_[15] = var6;
      HashSet var7 = new HashSet();
      this.throws_[16] = var7;
      HashSet var8 = new HashSet();
      this.throws_[17] = var8;
      var1.s().class_(this);
   }

   static {
      ntfClinit();
   }

   private rn_3 this_() {
      this.public_();
      long var1 = rqR_2.break_() - (Long)this.throws_[10];
      String var3 = "Farm Builder: Процесс завершен за " + String.format("%.1f%s", (double)var1 / 1000.0, "с");
      rrfu_3.byte_(var3);
      MinecraftAccessor.a_(var3, false);
      this.protected_();
      this.new_();
      return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[2]);
   }

   private boolean class_(bc_3 var1, rdn_3 var2) {
      return var2 != null && !var2.class_() ? var1.class_().test(var2) : extends_[55];
   }

   @Override
   public void class_(rrLz_1 var1) {
      this.public_();
      if ((Boolean)this.throws_[9]
         && ((Ps_1)this.case_[1]).catch_().BL()
         && (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) {
         var1.class_(var1.byte_());
      }
   }

   private boolean class_(bc_3 var1, rYB var2, cb_3 var3, bv_3 var4) {
      this.public_();
      if (var4 == null) {
         return false;
      } else if (this.class_(var1, var3.ss())) {
         if ((rfH_2)this.throws_[14] != null) {
            Optional var5 = PJ.class_((Ps_1)this.case_[1], (rfH_2)this.throws_[14]);
            var5.ifPresent(var1x -> ((C_class)this.case_[0]).private_().class_(var1x.class_(), true));
         }

         PE var9 = ((Ps_1)this.case_[1]).native_();
         if (((Ps_1)this.case_[1]).byte_() instanceof rff_3 var7) {
            rfH_2 var8 = var7.class_();
            if (var4.break_(var8)) {
               ((Set)this.throws_[16]).add(var8);
               if (var9.class_(var3, var2, rpm_3.MAIN_HAND, var7).break_()) {
                  var3.class_(rpm_3.MAIN_HAND);
               }
            }
         }

         return extends_[23];
      } else {
         return extends_[24];
      }
   }

   @Override
   public void class_(EA var1) {
      this.public_();
      super.class_(var1);
      En_1 var2 = var1.class_();
      if (var2 != null && (bv_3)this.throws_[6] != null && (bu_3)this.throws_[1] == (bu_3)bu_3.staticFields580f7ea75a023f1a97051d53b9f86917[1]) {
         if ((bc_3)this.throws_[0] == (bc_3)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[0]) {
            var2.break_().ifPresent(var1x -> var2.class_(var1x.case_(-90.0F)));
         } else if ((bc_3)this.throws_[0] == (bc_3)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[1]) {
            cb_3 var3 = ((Ps_1)this.case_[1]).catch_();
            rYB var4 = ((Ps_1)this.case_[1]).case_();
            rU_2 var5 = ((Ps_1)this.case_[1]).volatile_();
            rdn_3 var6 = var3.ss();
            bL_2 var7 = null;
            double var8 = Double.MAX_VALUE;
            rxJ_2 var10 = null;
            if (var6.break_() instanceof rxJ_2 var11) {
               var10 = var11;
            }

            for (bL_2 var14 : ((bv_3)this.throws_[6]).throws_()) {
               if (this.class_(var4, (bv_3)this.throws_[6], var14)) {
                  if (var10 != null) {
                     rdH_2 var15 = new rdH_2(var3, rpm_3.MAIN_HAND, new rff_3(new rjU_2((rfH_2)var14), rpr_3.UP, new rfH_2(var14), false));
                     xc_3 var16 = var10.byte_(new rxx_3(var15));
                     if (var16 == null) {
                        continue;
                     }
                  }

                  double var29 = var5.private_(var14);
                  if (var29 < var8) {
                     var8 = var29;
                     var7 = var14;
                  }
               }
            }

            boolean var26 = extends_[17];
            if (var7 != null && (bL_2)this.throws_[11] != var7) {
               int var10002 = (Integer)this.throws_[12] + 1;
               Integer var21 = var10002;
               this.throws_[12] = var21;
               if (var10002 > 1) {
                  this.throws_[11] = var7;
                  Integer var23 = 0;
                  this.throws_[12] = var23;
                  Object var24 = null;
                  this.throws_[13] = var24;
               } else if ((PX)this.throws_[13] != null) {
                  var2.class_((PX)this.throws_[13]);
                  var26 = true;
               }
            }

            if ((bL_2)this.throws_[11] != null && !var26) {
               Optional var28 = PJ.class_((Ps_1)this.case_[1], (bL_2)this.throws_[11]);
               var28.ifPresent(var2x -> {
                  this.public_();
                  var2.class_(var2x.class_());
                  PX var7x = var2.break_().orElse(null);
                  this.throws_[13] = var7x;
               });
            }
         }

         if ((Integer)this.throws_[19] > 0) {
            var1.class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[5]);
         }
      }
   }

   private bm_3 class_(cb_3 var1, PE var2, int var3) {
      if (rme_3.class_ != var3) {
         ((rhz_3)var1.implements_[1]).protected_ = var3;
         var2.class_();
         return (bm_3)bm_3.staticFields25d9569e4235359b81fd7f84865d53c7[0];
      } else {
         return (bm_3)bm_3.staticFields25d9569e4235359b81fd7f84865d53c7[2];
      }
   }

   public void class_(bc_3 var1) {
      this.public_();
      this.throws_[0] = var1;
   }

   @Override
   public void class_(q_1 var1) {
      this.public_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (!this.byte_()) {
            this.extends_();
            return;
         }

         Boolean var6 = false;
         this.throws_[9] = var6;
         if (this.return_()) {
            ((C_class)this.case_[0]).int_().class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[6], true);
            Boolean var7 = true;
            this.throws_[9] = var7;
         }
      }
   }

   private void class_(cb_3 var1, PE var2) {
      for (int var3 = 0; var3 < 9; var3++) {
         rdn_3 var4 = ((rhz_3)var1.implements_[1]).extends_(var3);
         if (!var4.class_() && ((Set)break_[1]).contains(var4.break_())) {
            var2.class_(var3);
            ((Aq_1)var1.break_[0]).break_(new rZb_1(rZM.DROP_ALL_ITEMS, rfH_2.protected_, rpr_3.DOWN));
            var1.class_(rpm_3.MAIN_HAND, false);
         }
      }
   }

   private int class_(cb_3 var1) {
      for (int var2 = 0; var2 < 9; var2++) {
         rdn_3 var3 = ((rhz_3)var1.implements_[1]).extends_(var2);
         if (var3.break_() instanceof rkx_3) {
            return var2;
         }
      }

      return private_[8];
   }

   private void class_(rYB var1, bv_3[] var2) {
      this.public_();
      if (!rrki_1.break_(var2)) {
         if ((bv_3)this.throws_[6] == null || ((bv_3)this.throws_[6]).class_() != (Integer)this.throws_[7]) {
            for (bv_3 var6 : var2) {
               int var7 = var6.class_();
               if (this.break_(var1, var6) && var7 == (Integer)this.throws_[7]) {
                  Integer var12 = (Integer)this.throws_[7] + 1;
                  this.throws_[7] = var12;
               }

               if (var7 == (Integer)this.throws_[7]) {
                  this.throws_[6] = var6;
                  return;
               }
            }

            Object var14 = null;
            this.throws_[6] = var14;
         }
      }
   }

   @Override
   public void class_(rrAS var1) {
      this.public_();
      if ((Boolean)this.throws_[9]) {
         var1.class_(0);
      }
   }

   @Override
   public void class_(rY_2 var1) {
      this.public_();
      this.throws_[3] = var1;
   }

   public boolean class_(rYB var1, bv_3 var2) {
      return var2 == null ? false : var2.class_(var1);
   }

   private void class_(List<iB_2> var1) {
      this.public_();
      cb_3 var2 = ((Ps_1)this.case_[1]).catch_();
      PE var3 = ((Ps_1)this.case_[1]).native_();
      if (!var1.isEmpty() && (float)(System.currentTimeMillis() - (Long)this.throws_[20]) >= 500.0F && rrfo_3.protected_()) {
         boolean var4 = true;
         boolean var5 = false;

         for (iB_2 var7 : var1) {
            if (var2.int_(var7) < 36.0) {
               var3.class_(var2, var7, true);
               var5 = true;
               if (!var4) {
                  break;
               }
            }
         }

         if (var5) {
            Long var12 = System.currentTimeMillis();
            this.throws_[20] = var12;
         }
      }
   }

   private rfH_2 class_(rYB var1, bc_3 var2, rY_2 var3, bA_2 var4, rfH_2 var5, bF_2 var6) {
      rfl_3 var7 = var4.break_();
      rfl_3 var8 = var3.break_();
      rpr_3 var9 = this.break_(var2);
      ArrayList var10 = new ArrayList();

      for (int var11 = (int)var7.class_ - 1; (double)var11 <= var7.protected_ + 1.0; var11++) {
         rfH_2 var12 = new rfH_2(var11, var5.c_(), var5.d_());
         rfH_2 var13 = var12.break_(var9);
         if (!var4.break_(var12) && var1.finally_(var13) && var8.break_(var12)) {
            var10.add(var12);
         }
      }

      if (var10.isEmpty()) {
         return null;
      } else {
         rfH_2 var19 = new rfH_2(var6.break_().case_());
         rfH_2 var20 = null;
         double var21 = Double.MAX_VALUE;

         for (rfH_2 var16 : var10) {
            double var17 = var16.private_(var19);
            if (var17 < var21) {
               var21 = var17;
               var20 = var16;
            }
         }

         return var20;
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6090820126020355683L;
   }

   @Override
   public String class_() {
      return "Farm Building";
   }

   @Override
   public void class_(bc_3 var1, rY_2 var2) {
      this.public_();
      if (var1 != null && var2 != null) {
         this.class_(var1);
         bZ_2 var3 = (bZ_2)((Map)break_[0]).get((bc_3)this.throws_[0]);
         if (var3 == null) {
            rrfu_3.byte_("Farm Builder: Неизвестный режим заполнения " + (bc_3)this.throws_[0]);
         } else {
            this.break_(var2);

            bl_3 var4 = switch (((int[])bN_2.class_[0])[((bc_3)this.throws_[0]).ordinal()]) {
               case 1 -> new bl_3(var2.byte_().final_(2), var2.case_().class_());
               case 2 -> new bl_3(var2.byte_().case_(), var2.case_().protected_(2));
               default -> throw new IncompatibleClassChangeError();
            };
            this.class_(var4);
            bv_3[] var5 = this.class_(var4, var3);
            if (rrki_1.break_(var5)) {
               rrfu_3.byte_("Farm Builder: Не удалось заполнить выбранную область");
            } else {
               this.throws_[5] = var5;
               Boolean var11 = true;
               this.throws_[4] = var11;
               Long var12 = rqR_2.break_();
               this.throws_[10] = var12;
               Integer var13 = 0;
               this.throws_[19] = var13;
            }
         }
      }
   }

   private rfH_2 class_(rYB var1, bv_3 var2, rU_2 var3) {
      bL_2[] var4 = var2.throws_();
      if (rrki_1.break_(var4)) {
         return null;
      } else {
         bL_2 var5 = var2.byte_();
         bL_2 var6 = var2.protected_();
         int var7 = var2.case_();
         int var8 = var7 / 2;
         if (var3.private_(var5) < var3.private_(var6)) {
            for (int var9 = 0; var9 < var8; var9++) {
               bL_2 var10 = var4[var9];
               if (this.class_(var1, var2, var10)) {
                  return var10;
               }
            }

            for (int var11 = var8; var11 < var7; var11++) {
               bL_2 var14 = var4[var11];
               if (this.class_(var1, var2, var14)) {
                  return var14;
               }
            }
         } else {
            for (int var12 = var7 - 1; var12 >= var8; var12--) {
               bL_2 var15 = var4[var12];
               if (this.class_(var1, var2, var15)) {
                  return var15;
               }
            }

            for (int var13 = var8 - 1; var13 >= 0; var13--) {
               bL_2 var16 = var4[var13];
               if (this.class_(var1, var2, var16)) {
                  return var16;
               }
            }
         }

         return null;
      }
   }

   private bv_3[] class_(rY_2 var1, bZ_2 var2) {
      return var1 == null ? null : var2.class_((Ps_1)this.case_[1], var1);
   }

   private rn_3 class_(int var1) {
      this.public_();
      Integer var6 = var1;
      this.throws_[19] = var6;
      return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
   }

   private rfH_2 class_(bc_3 var1, rYB var2, rY_2 var3, bA_2 var4, rfH_2 var5, boolean var6) {
      if (var4 == null) {
         return null;
      } else {
         bL_2[] var7 = var4.throws_();
         if (rrki_1.break_(var7)) {
            return null;
         } else {
            bL_2 var8 = var4.byte_();
            bL_2 var9 = var4.protected_();
            bF_2 var10 = var4.private_();
            bF_2 var11 = var4.implements_();
            double var12 = var5.private_(var8);
            double var14 = var5.private_(var9);
            bF_2 var16;
            bL_2 var17;
            if (var12 < var14) {
               var17 = var6 ? var9 : var8;
               var16 = var6 ? var11 : var10;
            } else {
               var17 = var6 ? var8 : var9;
               var16 = var6 ? var10 : var11;
            }

            return this.class_(var2, var1, var3, var4, var17, var16);
         }
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-119, -105, -99, 114, -82, 105, -113, -8}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void class_(rrLx_1 var1) {
      this.public_();
      if ((Boolean)this.throws_[9] && (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) {
         var1.break_(true);
      }
   }

   @Override
   public void class_(rrLX var1) {
      this.public_();
      if ((Boolean)this.throws_[9] && (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) {
         var1.break_(false);
      }
   }

   private bm_3 class_(cb_3 var1, PE var2, List<Pair<rdn_3, Integer>> var3, Pair<rdn_3, Integer> var4) {
      this.public_();
      if (var4 == null && !var3.isEmpty()) {
         this.class_(var1, var2);

         for (int var7 = 0; var7 < Math.min(var3.size(), 9); var7++) {
            Pair var6 = (Pair)var3.get(var7);
            if (((Set)this.throws_[17]).add((Integer)var6.getRight())) {
               var2.class_((Integer)var6.getRight());
            }
         }

         return (bm_3)bm_3.staticFields25d9569e4235359b81fd7f84865d53c7[1];
      } else if (var4 == null) {
         return (bm_3)bm_3.staticFields25d9569e4235359b81fd7f84865d53c7[2];
      } else {
         int var5 = (Integer)var4.getRight();
         if (var5 != -1 && rme_3.class_ != var5) {
            ((rhz_3)var1.implements_[1]).protected_ = var5;
            var2.class_();
            return (bm_3)bm_3.staticFields25d9569e4235359b81fd7f84865d53c7[0];
         } else {
            return (bm_3)bm_3.staticFields25d9569e4235359b81fd7f84865d53c7[2];
         }
      }
   }

   private boolean class_(bv_3 var1) {
      if (var1 == null) {
         return false;
      } else {
         cb_3 var2 = ((Ps_1)this.case_[1]).catch_();
         return var2 != null && var2.rN().protected_(var1.break_()) ? true : extends_[54];
      }
   }

   private boolean class_(bc_3 var1, rYB var2, rY_2 var3, bv_3 var4, rfH_2 var5, rfH_2 var6) {
      this.public_();
      if (var4 != null && var5 != null && var6 != null) {
         if (var1 == (bc_3)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[1] && var4 instanceof bA_2 var7) {
            rfH_2 var18 = this.class_(var1, var2, var3, var7, var6, true);
            this.throws_[8] = var18;
         } else {
            bL_2 var8 = var4.byte_();
            bL_2 var9 = var4.protected_();
            double var10 = var6.private_(var8);
            double var12 = var6.private_(var9);
            bL_2 var19 = var10 < var12 ? var9 : var8;
            this.throws_[8] = var19;
         }

         return extends_[42];
      } else {
         return extends_[40];
      }
   }

   private void class_(rfH_2 var1) {
      this.public_();
      if ((rfH_2)this.throws_[18] == null) {
         this.throws_[18] = var1;
      }
   }

   private List<Pair<rdn_3, Integer>> class_(cb_3 var1, bc_3 var2) {
      if (var2 == null) {
         return null;
      } else {
         Predicate var3 = var2.class_();
         if (var3 == null) {
            return null;
         } else {
            ArrayList var4 = new ArrayList();

            for (int var5 = 0; var5 < 36; var5++) {
               rdn_3 var6 = ((rhz_3)var1.implements_[1]).extends_(var5);
               if (var3.test(var6)) {
                  var4.add(Pair.of(var6, var5));
               }
            }

            if (var4.isEmpty()) {
               return null;
            } else {
               var4.sort(Comparator.comparingInt(var0 -> -((rdn_3)var0.getLeft()).char_()));
               return var4;
            }
         }
      }
   }

   private boolean class_(rYB var1, bv_3 var2, bL_2 var3) {
      return !this.break_(var1, var2, var3) ? true : extends_[46];
   }

   @Override
   public rn_3 class_(boolean var1, boolean var2) {
      this.public_();
      bu_3 var18 = (bu_3)bu_3.staticFields580f7ea75a023f1a97051d53b9f86917[2];
      this.throws_[1] = var18;
      if ((Integer)this.throws_[7] >= ((bv_3[])this.throws_[5]).length) {
         return this.this_();
      } else {
         rYB var3 = ((Ps_1)this.case_[1]).case_();
         cb_3 var4 = ((Ps_1)this.case_[1]).catch_();
         PE var5 = ((Ps_1)this.case_[1]).native_();
         boolean var6 = false;

         for (bv_3 var10 : (bv_3[])this.throws_[5]) {
            if (this.class_(var3, var10)) {
               var6 = true;
               break;
            }
         }

         if (!var6) {
            return this.this_();
         } else {
            if (this.protected_(var3, (bv_3)this.throws_[6])) {
               this.goto_();
            }

            if (this.continue_()) {
               this.class_(var3, (bv_3[])this.throws_[5]);
            }

            if ((bv_3)this.throws_[6] == null) {
               return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
            } else {
               rU_2 var24 = ((Ps_1)this.case_[1]).volatile_();
               Integer var19 = Math.max(0, (Integer)this.throws_[19] - 1);
               this.throws_[19] = var19;
               List var25 = bO_2.class_(
                  (Ps_1)this.case_[1], var1x -> var1x.BC() != aI_2.rM && var1x.Pu() && var1x.int_(var4) <= 100.0 && var1x.while_(var4) ? true : extends_[73]
               );
               if (!var25.isEmpty()) {
                  int var26 = this.class_(var4);
                  if (var26 != -1) {
                     bu_3 var20 = (bu_3)bu_3.staticFields580f7ea75a023f1a97051d53b9f86917[0];
                     this.throws_[1] = var20;
                     this.class_(var24);
                     this.class_(var4, var5, var26);
                     this.class_(var25);
                     rfl_3 var28 = ((rY_2)this.throws_[2]).break_();
                     rP_2 var11 = ((bX_2)this.throws_[15])
                        .class_((Ps_1)this.case_[1], var28, var25.stream().filter(var1x -> var28.byte_(var1x.rN())).toList(), var25);
                     if (var11 != null) {
                        return new rn_3(var11, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[4]);
                     }
                  }
               }

               if (var4.return_()) {
                  this.class_(var24);
                  return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
               } else {
                  List var27 = this.class_(var4, (bc_3)this.throws_[0]);
                  if (var27 == null) {
                     return this.else_();
                  } else {
                     Pair var29 = var27.stream().filter(var0 -> var0.getRight() < 9 ? true : extends_[71]).findFirst().orElse(null);
                     if (this.class_(var4, var5, var27, var29) != (bm_3)bm_3.staticFields25d9569e4235359b81fd7f84865d53c7[1]
                        && ((bc_3)this.throws_[0]).class_().test(var4.ss())) {
                        if (!((Set)this.throws_[17]).isEmpty()) {
                           ((Set)this.throws_[17]).clear();
                        }

                        if ((rfH_2)this.throws_[18] != null) {
                           rS_2 var33 = this.break_((rfH_2)this.throws_[18]);
                           if (var33.break_(var24)) {
                              Object var21 = null;
                              this.throws_[18] = var21;
                           }

                           return new rn_3(var33, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[4]);
                        } else {
                           bu_3 var22 = (bu_3)bu_3.staticFields580f7ea75a023f1a97051d53b9f86917[1];
                           this.throws_[1] = var22;
                           if ((bc_3)this.throws_[0] == (bc_3)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[0]) {
                              rfH_2 var30 = this.byte_(var3, (bv_3)this.throws_[6]);
                              if (var30 != null) {
                                 this.throws_[14] = var30;
                                 if (!this.class_((bc_3)this.throws_[0], var3, var4, (bv_3)this.throws_[6])) {
                                    return this.class_(2);
                                 }

                                 rS_2 var35 = this.break_(var30);
                                 return new rn_3(var35, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[4]);
                              }
                           }

                           if ((rfH_2)this.throws_[8] != null) {
                              rS_2 var32 = this.break_((rfH_2)this.throws_[8]);
                              if (!this.class_((bc_3)this.throws_[0], var3, var4, (bv_3)this.throws_[6])) {
                                 return this.class_(2);
                              } else {
                                 if (var32.break_(var24)) {
                                    this.goto_();
                                 }

                                 return new rn_3(var32, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[4]);
                              }
                           } else {
                              rfH_2 var31 = null;
                              if ((bc_3)this.throws_[0] == (bc_3)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[0]) {
                                 var31 = this.class_(var3, (bv_3)this.throws_[6], var24);
                              } else if ((bc_3)this.throws_[0] == (bc_3)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[1]) {
                                 bv_3 var13 = (bv_3)this.throws_[6];
                                 if (var13 instanceof bA_2 var12) {
                                    var31 = this.class_((bc_3)this.throws_[0], var3, (rY_2)this.throws_[3], var12, var24, false);
                                 }
                              }

                              if (var31 == null) {
                                 return this.this_();
                              } else if (!this.class_((bc_3)this.throws_[0], var3, var4, (bv_3)this.throws_[6])) {
                                 return this.class_(2);
                              } else {
                                 rS_2 var34 = this.break_(var31);
                                 return var34.break_(var24)
                                       && !this.class_((bc_3)this.throws_[0], var3, (rY_2)this.throws_[3], (bv_3)this.throws_[6], var34.break_(), var24)
                                    ? this.this_()
                                    : new rn_3(var34, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[4]);
                              }
                           }
                        }
                     } else {
                        return this.class_(2);
                     }
                  }
               }
            }
         }
      }
   }

   private rS_2 break_(rfH_2 var1) {
      return new bQ_2(this, var1);
   }

   private rpr_3 break_(bc_3 var1) {
      return switch (((int[])bN_2.class_[0])[var1.ordinal()]) {
         case 1 -> rpr_3.DOWN;
         case 2 -> rpr_3.UP;
         default -> throw new IncompatibleClassChangeError();
      };
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -24816765;
   }

   @Override
   public void break_(rY_2 var1) {
      this.public_();
      this.throws_[2] = var1;
   }

   private boolean break_(rYB var1, bv_3 var2, bL_2 var3) {
      this.public_();
      return var2 != null && var3 != null ? var2.class_(var1, var3, this.break_((bc_3)this.throws_[0])) : extends_[47];
   }

   private boolean break_(rYB var1, bv_3 var2) {
      return var2 != null && !var2.catch_() && !this.protected_(var1, var2) ? extends_[51] : extends_[50];
   }

   @Override
   public rrTq_1 throws_() {
      return new rrTq_1(rjG_2.catch_(), ((Ps_1)this.case_[1]).catch_().goto_());
   }

   private static void finally_() {
      native_ = new String[]{
         new String("Farm Builder: Не удалось заполнить выбранную область"),
         new String("Farm Building"),
         new String("%.1f%s"),
         new String("с"),
         new String("Farm Builder: Закончились предметы")
      };
   }

   private void extends_() {
      this.public_();
      Object var5 = null;
      this.throws_[5] = var5;
      Object var6 = null;
      this.throws_[6] = var6;
      Integer var7 = 0;
      this.throws_[7] = var7;
      Object var8 = null;
      this.throws_[8] = var8;
      Boolean var9 = false;
      this.throws_[9] = var9;
      Object var10 = null;
      this.throws_[11] = var10;
      Object var11 = null;
      this.throws_[14] = var11;
      Object var12 = null;
      this.throws_[18] = var12;
      Integer var13 = 0;
      this.throws_[12] = var13;
      ((Set)this.throws_[16]).clear();
      ((Set)this.throws_[17]).clear();
      Object var14 = null;
      this.throws_[13] = var14;
      Integer var15 = 0;
      this.throws_[19] = var15;
   }

   private void goto_() {
      this.public_();
      Integer var5 = (Integer)this.throws_[7] + 1;
      this.throws_[7] = var5;
      Object var6 = null;
      this.throws_[6] = var6;
      Object var7 = null;
      this.throws_[8] = var7;
      ((Set)this.throws_[16]).clear();
   }

   private boolean continue_() {
      this.public_();
      return (bv_3)this.throws_[6] == null ? true : extends_[57];
   }

   private rn_3 else_() {
      String var1 = "Farm Builder: Закончились предметы";
      rrfu_3.byte_(var1);
      MinecraftAccessor.a_(var1, false);
      this.protected_();
      this.new_();
      return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[2]);
   }

   @Override
   public rY_2 implements_() {
      this.public_();
      return (rY_2)this.throws_[3];
   }

   private void new_() {
      rrvT var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_();
      if (var1 != null) {
         FarmBuilder var2 = var1.finally_();
         if (var2.aJ_()) {
            var2.byte_(true);
         }
      }
   }

   private static void package_() {
      Object[] var0 = new Object[]{
         new bz_3(bc_3.class),
         Set.of(
            (rdb_3)rdy_3.OO,
            (rdb_3)rdy_3.Ju,
            (rdb_3)rdy_3.JC,
            (rdb_3)rdy_3.Oi,
            (rdb_3)rdy_3.hr,
            (rdb_3)rdy_3.Oa,
            (rdb_3)rdy_3.XR,
            (rdb_3)rdy_3.XO,
            (rdb_3)rdy_3.ha
         )
      };
      break_ = var0;
   }

   private boolean return_() {
      return !((Ps_1)this.case_[1]).case_().byte_(((Ps_1)this.case_[1]).extends_()).catch_() ? true : extends_[59];
   }

   private static void super_() {
      implements_ = new float[]{500.0F, -90.0F};
   }

   private static void try_() {
      finally_ = new long[2];
   }

   private static void while_() {
      volatile_ = new double[]{Double.MAX_VALUE, 36.0, 1.0, Double.MAX_VALUE, 1000.0, 100.0};
   }

   private void public_() {
      if (this.throws_ == null) {
         this.throws_ = new Object[21];
         Object[] var1 = this.throws_;
         var1[4] = false;
         var1[7] = 0;
         var1[9] = false;
         var1[10] = 0L;
         var1[12] = 0;
         var1[19] = 0;
         var1[20] = 0L;
      }
   }

   @Override
   public void protected_() {
      this.public_();
      super.protected_();
      this.extends_();
      Boolean var5 = false;
      this.throws_[4] = var5;
   }

   private boolean protected_(rYB var1, bv_3 var2) {
      this.public_();
      return var2 != null && !var2.catch_() ? var2.class_(var1, this.break_((bc_3)this.throws_[0])) : extends_[49];
   }

   @Override
   public rY_2 private_() {
      this.public_();
      return (rY_2)this.throws_[2];
   }

   private static void final_() {
      extends_ = new boolean[]{
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
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
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         false
      };
   }

   private static void synchronized_() {
      catch_ = new short[]{
         15,
         16,
         17,
         2,
         1,
         7,
         5,
         1,
         1,
         1,
         5,
         6,
         5,
         6,
         1,
         1,
         19,
         19,
         1,
         0,
         1,
         2,
         15,
         1,
         4,
         1,
         0,
         1,
         0,
         17,
         17,
         18,
         18,
         18,
         4,
         1,
         1,
         0,
         0,
         6,
         14,
         0,
         6,
         4,
         8,
         8,
         0,
         6,
         4,
         0,
         0,
         6,
         0,
         1,
         6,
         0,
         3,
         0,
         6,
         0,
         3,
         6,
         4,
         0,
         9,
         0,
         6,
         9,
         9,
         1,
         1,
         2,
         9,
         1,
         2,
         9,
         1,
         2,
         9,
         0,
         0,
         0,
         0,
         0,
         5,
         4,
         10,
         19,
         3,
         2,
         4,
         4,
         3,
         2,
         6,
         1,
         1,
         0,
         0,
         0,
         1,
         1,
         1,
         1,
         6,
         6,
         11,
         12,
         12,
         11,
         12,
         13,
         13,
         13,
         11,
         1,
         11,
         19,
         5,
         1,
         14,
         1,
         14,
         1,
         1,
         16,
         1,
         0,
         2,
         1,
         1,
         1,
         20,
         20,
         1,
         17,
         1,
         2,
         2,
         1,
         0,
         1,
         1,
         0,
         16,
         1,
         6,
         6,
         7,
         7,
         7,
         7,
         7,
         6,
         6,
         1,
         8,
         8,
         7,
         7,
         6,
         8,
         16,
         0,
         0,
         0,
         1,
         18,
         18,
         6,
         1,
         1,
         10,
         2,
         2,
         19,
         1,
         0,
         0,
         5,
         6,
         7,
         8,
         9,
         11,
         14,
         18,
         12,
         16,
         17,
         13,
         19,
         0,
         13
      };
   }
}
