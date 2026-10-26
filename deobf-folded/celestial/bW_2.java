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
   private static short[] id_catch;
   public static Object[] id_break;
   private static byte[] id_private;
   private static float[] id_implements;
   public Object[] id_throws;
   private static long[] id_finally;
   private static boolean[] id_extends;
   private static String[] id_native;
   private static double[] id_volatile;

   @Override
   public boolean id_byte() {
      this.id_public();
      return (Boolean)this.id_throws[4];
   }

   private rfH_2 id_byte(rYB var1, bv_3 var2) {
      this.id_public();
      if (var2 == null) {
         return null;
      } else {
         bL_2[] var3 = var2.id_throws();
         if (rrki_1.id_break(var3)) {
            return null;
         } else {
            bL_2 var4 = null;
            bL_2[] var5 = var3;
            int var6 = var3.length;

            for (int var7 = id_extends[34]; var7 < var6; var7++) {
               bL_2 var8 = var5[var7];
               if (((Set)this.id_throws[16]).contains(new rfH_2(var8)) && !this.id_break(var1, var2, var8)) {
                  var4 = var8;
                  break;
               }
            }

            return var4;
         }
      }
   }

   private static void id_int() {
      id_private = new byte[]{-1, 2, 2, 2, 2, 2, 2, 9, -1, 36, 9, -1, 9, 2, 2, 9, 21, 4, 7, 9, 10, 12, 19, 20, 2};
   }

   public bW_2(C_class var1) {
      super(var1);
      this.id_public();
      bX_2 var6 = new bX_2();
      this.id_throws[15] = var6;
      HashSet var7 = new HashSet();
      this.id_throws[16] = var7;
      HashSet var8 = new HashSet();
      this.id_throws[17] = var8;
      var1.s().id_class(this);
   }

   static {
      ntfClinit();
   }

   private rn_3 id_this() {
      this.id_public();
      long var1 = rqR_2.id_break() - (Long)this.id_throws[10];
      String var10000 = id_native[2];
      Object[] var10001 = new Object[2];
      var10001[id_extends[60]] = (double)var1 / 1000.0;
      var10001[1] = id_native[3];
      String var3 = "Farm Builder: Процесс завершен за " + String.format(var10000, var10001);
      rrfu_3.id_byte(var3);
      MinecraftAccessor.a_(var3, id_extends[62]);
      this.id_protected();
      this.id_new();
      return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[2]);
   }

   private boolean id_class(bc_3 var1, rdn_3 var2) {
      return var2 != null && !var2.id_class() ? var1.id_class().test(var2) : id_extends[55];
   }

   @Override
   public void id_class(rrLz_1 var1) {
      this.id_public();
      if ((Boolean)this.id_throws[9]
         && ((Ps_1)this.id_case[1]).id_catch().BL()
         && (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) {
         var1.id_class(var1.id_byte());
      }
   }

   private boolean id_class(bc_3 var1, rYB var2, cb_3 var3, bv_3 var4) {
      this.id_public();
      if (var4 == null) {
         return id_extends[22];
      } else if (this.id_class(var1, var3.ss())) {
         if ((rfH_2)this.id_throws[14] != null) {
            Optional var5 = PJ.id_class((Ps_1)this.id_case[1], (rfH_2)this.id_throws[14]);
            var5.ifPresent(var1x -> ((C_class)this.id_case[id_catch[192]]).id_private().id_class(var1x.id_class(), true));
         }

         PE var9 = ((Ps_1)this.id_case[1]).id_native();
         if (((Ps_1)this.id_case[1]).id_byte() instanceof rff_3 var7) {
            rfH_2 var8 = var7.id_class();
            if (var4.id_break(var8)) {
               ((Set)this.id_throws[16]).add(var8);
               if (var9.id_class(var3, var2, rpm_3.MAIN_HAND, var7).id_break()) {
                  var3.id_class(rpm_3.MAIN_HAND);
               }
            }
         }

         return true;
      } else {
         return id_extends[24];
      }
   }

   @Override
   public void id_class(EA var1) {
      this.id_public();
      super.id_class(var1);
      En_1 var2 = var1.id_class();
      if (var2 != null && (bv_3)this.id_throws[6] != null && (bu_3)this.id_throws[1] == (bu_3)bu_3.staticFields580f7ea75a023f1a97051d53b9f86917[1]) {
         if ((bc_3)this.id_throws[id_catch[97]] == (bc_3)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[id_catch[98]]) {
            var2.id_break().ifPresent(var1x -> var2.id_class(var1x.id_case(-90.0F)));
         } else if ((bc_3)this.id_throws[id_catch[99]] == (bc_3)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[1]) {
            cb_3 var3 = ((Ps_1)this.id_case[1]).id_catch();
            rYB var4 = ((Ps_1)this.id_case[1]).id_case();
            rU_2 var5 = ((Ps_1)this.id_case[1]).id_volatile();
            rdn_3 var6 = var3.ss();
            bL_2 var7 = null;
            double var8 = Double.MAX_VALUE;
            rxJ_2 var10 = null;
            if (var6.id_break() instanceof rxJ_2 var11) {
               var10 = var11;
            }

            bL_2[] var25 = ((bv_3)this.id_throws[6]).id_throws();
            int var27 = var25.length;

            for (int var13 = id_extends[15]; var13 < var27; var13++) {
               bL_2 var14 = var25[var13];
               if (this.id_class(var4, (bv_3)this.id_throws[6], var14)) {
                  if (var10 != null) {
                     rdH_2 var15 = new rdH_2(var3, rpm_3.MAIN_HAND, new rff_3(new rjU_2((rfH_2)var14), rpr_3.UP, new rfH_2(var14), id_extends[16]));
                     xc_3 var16 = var10.id_byte(new rxx_3(var15));
                     if (var16 == null) {
                        continue;
                     }
                  }

                  double var29 = var5.id_private(var14);
                  if (var29 < var8) {
                     var8 = var29;
                     var7 = var14;
                  }
               }
            }

            boolean var26 = id_extends[17];
            if (var7 != null && (bL_2)this.id_throws[11] != var7) {
               int var10002 = (Integer)this.id_throws[12] + 1;
               Integer var21 = var10002;
               this.id_throws[12] = var21;
               if (var10002 > 1) {
                  this.id_throws[11] = var7;
                  Integer var23 = Integer.valueOf(id_extends[20]);
                  this.id_throws[12] = var23;
                  Object var24 = null;
                  this.id_throws[13] = var24;
               } else if ((PX)this.id_throws[13] != null) {
                  var2.id_class((PX)this.id_throws[13]);
                  var26 = true;
               }
            }

            if ((bL_2)this.id_throws[11] != null && !var26) {
               Optional var28 = PJ.id_class((Ps_1)this.id_case[1], (bL_2)this.id_throws[11]);
               var28.ifPresent(var2x -> {
                  this.id_public();
                  var2.id_class(var2x.id_class());
                  PX var7x = var2.id_break().orElse(null);
                  this.id_throws[13] = var7x;
               });
            }
         }

         if ((Integer)this.id_throws[19] > 0) {
            var1.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[5]);
         }
      }
   }

   private bm_3 id_class(cb_3 var1, PE var2, int var3) {
      if (rme_3.id_class != var3) {
         ((rhz_3)var1.id_implements[1]).id_protected = var3;
         var2.id_class();
         return (bm_3)bm_3.staticFields25d9569e4235359b81fd7f84865d53c7[id_catch[127]];
      } else {
         return (bm_3)bm_3.staticFields25d9569e4235359b81fd7f84865d53c7[2];
      }
   }

   public void id_class(bc_3 var1) {
      this.id_public();
      this.id_throws[id_catch[178]] = var1;
   }

   @Override
   public void id_class(q_1 var1) {
      this.id_public();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[63]]) {
         if (!this.id_byte()) {
            this.id_extends();
            return;
         }

         Boolean var6 = id_extends[6];
         this.id_throws[9] = var6;
         if (this.id_return()) {
            ((C_class)this.id_case[id_catch[65]]).id_int().id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[6], true);
            Boolean var7 = true;
            this.id_throws[9] = var7;
         }
      }
   }

   private void id_class(cb_3 var1, PE var2) {
      for (int var3 = id_extends[32]; var3 < 9; var3++) {
         rdn_3 var4 = ((rhz_3)var1.id_implements[1]).id_extends(var3);
         if (!var4.id_class() && ((Set)id_break[1]).contains(var4.id_break())) {
            var2.id_class(var3);
            ((Aq_1)var1.id_break[id_catch[143]]).id_break(new rZb_1(rZM.DROP_ALL_ITEMS, rfH_2.id_protected, rpr_3.DOWN));
            var1.id_class(rpm_3.MAIN_HAND, id_extends[33]);
         }
      }
   }

   private int id_class(cb_3 var1) {
      for (int var2 = id_extends[25]; var2 < 9; var2++) {
         rdn_3 var3 = ((rhz_3)var1.id_implements[1]).id_extends(var2);
         if (var3.id_break() instanceof rkx_3) {
            return var2;
         }
      }

      return -1;
   }

   private void id_class(rYB var1, bv_3[] var2) {
      this.id_public();
      if (!rrki_1.id_break(var2)) {
         if ((bv_3)this.id_throws[6] == null || ((bv_3)this.id_throws[6]).id_class() != (Integer)this.id_throws[7]) {
            bv_3[] var3 = var2;
            int var4 = var2.length;

            for (int var5 = id_extends[38]; var5 < var4; var5++) {
               bv_3 var6 = var3[var5];
               int var7 = var6.id_class();
               if (this.id_break(var1, var6) && var7 == (Integer)this.id_throws[7]) {
                  Integer var12 = (Integer)this.id_throws[7] + 1;
                  this.id_throws[7] = var12;
               }

               if (var7 == (Integer)this.id_throws[7]) {
                  this.id_throws[6] = var6;
                  return;
               }
            }

            Object var14 = null;
            this.id_throws[6] = var14;
         }
      }
   }

   @Override
   public void id_class(rrAS var1) {
      this.id_public();
      if ((Boolean)this.id_throws[9]) {
         var1.id_class(id_extends[11]);
      }
   }

   @Override
   public void id_class(rY_2 var1) {
      this.id_public();
      this.id_throws[3] = var1;
   }

   public boolean id_class(rYB var1, bv_3 var2) {
      return var2 == null ? id_extends[48] : var2.id_class(var1);
   }

   private void id_class(List<iB_2> var1) {
      this.id_public();
      cb_3 var2 = ((Ps_1)this.id_case[1]).id_catch();
      PE var3 = ((Ps_1)this.id_case[1]).id_native();
      if (!var1.isEmpty() && (float)(System.currentTimeMillis() - (Long)this.id_throws[20]) >= 500.0F && rrfo_3.id_protected()) {
         boolean var4 = true;
         boolean var5 = id_extends[27];

         for (iB_2 var7 : var1) {
            if (var2.id_int(var7) < 36.0) {
               var3.id_class(var2, var7, true);
               var5 = true;
               if (!var4) {
                  break;
               }
            }
         }

         if (var5) {
            Long var12 = System.currentTimeMillis();
            this.id_throws[20] = var12;
         }
      }
   }

   private rfH_2 id_class(rYB var1, bc_3 var2, rY_2 var3, bA_2 var4, rfH_2 var5, bF_2 var6) {
      rfl_3 var7 = var4.id_break();
      rfl_3 var8 = var3.id_break();
      rpr_3 var9 = this.id_break(var2);
      ArrayList var10 = new ArrayList();

      for (int var11 = (int)var7.id_class - 1; (double)var11 <= var7.id_protected + 1.0; var11++) {
         rfH_2 var12 = new rfH_2(var11, var5.c_(), var5.d_());
         rfH_2 var13 = var12.id_break(var9);
         if (!var4.id_break(var12) && var1.id_finally(var13) && var8.id_break(var12)) {
            var10.add(var12);
         }
      }

      if (var10.isEmpty()) {
         return null;
      } else {
         rfH_2 var19 = new rfH_2(var6.id_break().id_case());
         rfH_2 var20 = null;
         double var21 = Double.MAX_VALUE;

         for (rfH_2 var16 : var10) {
            double var17 = var16.id_private(var19);
            if (var17 < var21) {
               var21 = var17;
               var20 = var16;
            }
         }

         return var20;
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6090820126020355683L;
   }

   @Override
   public String id_class() {
      return id_native[1];
   }

   @Override
   public void id_class(bc_3 var1, rY_2 var2) {
      this.id_public();
      if (var1 != null && var2 != null) {
         this.id_class(var1);
         bZ_2 var3 = (bZ_2)((Map)id_break[id_catch[79]]).get((bc_3)this.id_throws[id_catch[80]]);
         if (var3 == null) {
            rrfu_3.id_byte("Farm Builder: Неизвестный режим заполнения " + (bc_3)this.id_throws[id_catch[81]]);
         } else {
            this.id_break(var2);

            bl_3 var4 = switch (((int[])bN_2.id_class[id_catch[82]])[((bc_3)this.id_throws[id_catch[83]]).ordinal()]) {
               case 1 -> new bl_3(var2.id_byte().id_final(2), var2.id_case().id_class());
               case 2 -> new bl_3(var2.id_byte().id_case(), var2.id_case().id_protected(2));
               default -> throw new IncompatibleClassChangeError();
            };
            this.id_class(var4);
            bv_3[] var5 = this.id_class(var4, var3);
            if (rrki_1.id_break(var5)) {
               rrfu_3.id_byte(id_native[0]);
            } else {
               this.id_throws[5] = var5;
               Boolean var11 = true;
               this.id_throws[4] = var11;
               Long var12 = rqR_2.id_break();
               this.id_throws[10] = var12;
               Integer var13 = Integer.valueOf(id_extends[13]);
               this.id_throws[19] = var13;
            }
         }
      }
   }

   private rfH_2 id_class(rYB var1, bv_3 var2, rU_2 var3) {
      bL_2[] var4 = var2.id_throws();
      if (rrki_1.id_break(var4)) {
         return null;
      } else {
         bL_2 var5 = var2.id_byte();
         bL_2 var6 = var2.id_protected();
         int var7 = var2.id_case();
         int var8 = var7 / 2;
         if (var3.id_private(var5) < var3.id_private(var6)) {
            for (int var9 = id_extends[35]; var9 < var8; var9++) {
               bL_2 var10 = var4[var9];
               if (this.id_class(var1, var2, var10)) {
                  return var10;
               }
            }

            for (int var11 = var8; var11 < var7; var11++) {
               bL_2 var14 = var4[var11];
               if (this.id_class(var1, var2, var14)) {
                  return var14;
               }
            }
         } else {
            for (int var12 = var7 - 1; var12 >= var8; var12--) {
               bL_2 var15 = var4[var12];
               if (this.id_class(var1, var2, var15)) {
                  return var15;
               }
            }

            for (int var13 = var8 - 1; var13 >= 0; var13--) {
               bL_2 var16 = var4[var13];
               if (this.id_class(var1, var2, var16)) {
                  return var16;
               }
            }
         }

         return null;
      }
   }

   private bv_3[] id_class(rY_2 var1, bZ_2 var2) {
      return var1 == null ? null : var2.id_class((Ps_1)this.id_case[1], var1);
   }

   private rn_3 id_class(int var1) {
      this.id_public();
      Integer var6 = var1;
      this.id_throws[19] = var6;
      return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
   }

   private rfH_2 id_class(bc_3 var1, rYB var2, rY_2 var3, bA_2 var4, rfH_2 var5, boolean var6) {
      if (var4 == null) {
         return null;
      } else {
         bL_2[] var7 = var4.id_throws();
         if (rrki_1.id_break(var7)) {
            return null;
         } else {
            bL_2 var8 = var4.id_byte();
            bL_2 var9 = var4.id_protected();
            bF_2 var10 = var4.id_private();
            bF_2 var11 = var4.id_implements();
            double var12 = var5.id_private(var8);
            double var14 = var5.id_private(var9);
            bF_2 var16;
            bL_2 var17;
            if (var12 < var14) {
               var17 = var6 ? var9 : var8;
               var16 = var6 ? var11 : var10;
            } else {
               var17 = var6 ? var8 : var9;
               var16 = var6 ? var10 : var11;
            }

            return this.id_class(var2, var1, var3, var4, var17, var16);
         }
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-119, -105, -99, 114, -82, 105, -113, -8}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_class(rrLx_1 var1) {
      this.id_public();
      if ((Boolean)this.id_throws[9] && (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) {
         var1.id_break(true);
      }
   }

   @Override
   public void id_class(rrLX var1) {
      this.id_public();
      if ((Boolean)this.id_throws[9] && (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) {
         var1.id_break(id_extends[10]);
      }
   }

   private bm_3 id_class(cb_3 var1, PE var2, List<Pair<rdn_3, Integer>> var3, Pair<rdn_3, Integer> var4) {
      this.id_public();
      if (var4 == null && !var3.isEmpty()) {
         this.id_class(var1, var2);

         for (int var7 = id_extends[31]; var7 < Math.min(var3.size(), 9); var7++) {
            Pair var6 = (Pair)var3.get(var7);
            if (((Set)this.id_throws[17]).add((Integer)var6.getRight())) {
               var2.id_class((Integer)var6.getRight());
            }
         }

         return (bm_3)bm_3.staticFields25d9569e4235359b81fd7f84865d53c7[1];
      } else if (var4 == null) {
         return (bm_3)bm_3.staticFields25d9569e4235359b81fd7f84865d53c7[2];
      } else {
         int var5 = (Integer)var4.getRight();
         if (var5 != -1 && rme_3.id_class != var5) {
            ((rhz_3)var1.id_implements[1]).id_protected = var5;
            var2.id_class();
            return (bm_3)bm_3.staticFields25d9569e4235359b81fd7f84865d53c7[id_catch[140]];
         } else {
            return (bm_3)bm_3.staticFields25d9569e4235359b81fd7f84865d53c7[2];
         }
      }
   }

   private boolean id_class(bv_3 var1) {
      if (var1 == null) {
         return id_extends[52];
      } else {
         cb_3 var2 = ((Ps_1)this.id_case[1]).id_catch();
         return var2 != null && var2.rN().id_protected(var1.id_break()) ? true : id_extends[54];
      }
   }

   private boolean id_class(bc_3 var1, rYB var2, rY_2 var3, bv_3 var4, rfH_2 var5, rfH_2 var6) {
      this.id_public();
      if (var4 != null && var5 != null && var6 != null) {
         if (var1 == (bc_3)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[1] && var4 instanceof bA_2 var7) {
            rfH_2 var18 = this.id_class(var1, var2, var3, var7, var6, true);
            this.id_throws[8] = var18;
         } else {
            bL_2 var8 = var4.id_byte();
            bL_2 var9 = var4.id_protected();
            double var10 = var6.id_private(var8);
            double var12 = var6.id_private(var9);
            bL_2 var19 = var10 < var12 ? var9 : var8;
            this.id_throws[8] = var19;
         }

         return true;
      } else {
         return id_extends[40];
      }
   }

   private void id_class(rfH_2 var1) {
      this.id_public();
      if ((rfH_2)this.id_throws[18] == null) {
         this.id_throws[18] = var1;
      }
   }

   private List<Pair<rdn_3, Integer>> id_class(cb_3 var1, bc_3 var2) {
      if (var2 == null) {
         return null;
      } else {
         Predicate var3 = var2.id_class();
         if (var3 == null) {
            return null;
         } else {
            ArrayList var4 = new ArrayList();

            for (int var5 = id_extends[30]; var5 < 36; var5++) {
               rdn_3 var6 = ((rhz_3)var1.id_implements[1]).id_extends(var5);
               if (var3.test(var6)) {
                  var4.add(Pair.of(var6, var5));
               }
            }

            if (var4.isEmpty()) {
               return null;
            } else {
               var4.sort(Comparator.comparingInt(var0 -> -((rdn_3)var0.getLeft()).id_char()));
               return var4;
            }
         }
      }
   }

   private boolean id_class(rYB var1, bv_3 var2, bL_2 var3) {
      return !this.id_break(var1, var2, var3) ? true : id_extends[46];
   }

   @Override
   public rn_3 id_class(boolean var1, boolean var2) {
      this.id_public();
      bu_3 var18 = (bu_3)bu_3.staticFields580f7ea75a023f1a97051d53b9f86917[2];
      this.id_throws[1] = var18;
      if ((Integer)this.id_throws[7] >= ((bv_3[])this.id_throws[5]).length) {
         return this.id_this();
      } else {
         rYB var3 = ((Ps_1)this.id_case[1]).id_case();
         cb_3 var4 = ((Ps_1)this.id_case[1]).id_catch();
         PE var5 = ((Ps_1)this.id_case[1]).id_native();
         boolean var6 = id_extends[0];
         bv_3[] var7 = (bv_3[])this.id_throws[5];
         int var8 = var7.length;

         for (int var9 = id_extends[1]; var9 < var8; var9++) {
            bv_3 var10 = var7[var9];
            if (this.id_class(var3, var10)) {
               var6 = true;
               break;
            }
         }

         if (!var6) {
            return this.id_this();
         } else {
            if (this.id_protected(var3, (bv_3)this.id_throws[6])) {
               this.id_goto();
            }

            if (this.id_continue()) {
               this.id_class(var3, (bv_3[])this.id_throws[5]);
            }

            if ((bv_3)this.id_throws[6] == null) {
               return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
            } else {
               rU_2 var24 = ((Ps_1)this.id_case[1]).id_volatile();
               Integer var19 = Math.max(id_extends[3], (Integer)this.id_throws[19] - 1);
               this.id_throws[19] = var19;
               List var25 = bO_2.id_class(
                  (Ps_1)this.id_case[1],
                  var1x -> var1x.BC() != aI_2.rM && var1x.Pu() && var1x.id_int(var4) <= 100.0 && var1x.id_while(var4) ? true : id_extends[73]
               );
               if (!var25.isEmpty()) {
                  int var26 = this.id_class(var4);
                  if (var26 != -1) {
                     bu_3 var20 = (bu_3)bu_3.staticFields580f7ea75a023f1a97051d53b9f86917[id_catch[19]];
                     this.id_throws[1] = var20;
                     this.id_class(var24);
                     this.id_class(var4, var5, var26);
                     this.id_class(var25);
                     rfl_3 var28 = ((rY_2)this.id_throws[2]).id_break();
                     rP_2 var11 = ((bX_2)this.id_throws[15])
                        .id_class((Ps_1)this.id_case[1], var28, var25.stream().filter(var1x -> var28.id_byte(var1x.rN())).toList(), var25);
                     if (var11 != null) {
                        return new rn_3(var11, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[4]);
                     }
                  }
               }

               if (var4.id_return()) {
                  this.id_class(var24);
                  return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
               } else {
                  List var27 = this.id_class(var4, (bc_3)this.id_throws[id_catch[26]]);
                  if (var27 == null) {
                     return this.id_else();
                  } else {
                     Pair var29 = var27.stream().filter(var0 -> var0.getRight() < 9 ? true : id_extends[71]).findFirst().orElse(null);
                     if (this.id_class(var4, var5, var27, var29) != (bm_3)bm_3.staticFields25d9569e4235359b81fd7f84865d53c7[1]
                        && ((bc_3)this.id_throws[id_catch[28]]).id_class().test(var4.ss())) {
                        if (!((Set)this.id_throws[17]).isEmpty()) {
                           ((Set)this.id_throws[17]).clear();
                        }

                        if ((rfH_2)this.id_throws[18] != null) {
                           rS_2 var33 = this.id_break((rfH_2)this.id_throws[18]);
                           if (var33.id_break(var24)) {
                              Object var21 = null;
                              this.id_throws[18] = var21;
                           }

                           return new rn_3(var33, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[4]);
                        } else {
                           bu_3 var22 = (bu_3)bu_3.staticFields580f7ea75a023f1a97051d53b9f86917[1];
                           this.id_throws[1] = var22;
                           if ((bc_3)this.id_throws[id_catch[37]] == (bc_3)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[id_catch[38]]) {
                              rfH_2 var30 = this.id_byte(var3, (bv_3)this.id_throws[6]);
                              if (var30 != null) {
                                 this.id_throws[14] = var30;
                                 if (!this.id_class((bc_3)this.id_throws[id_catch[41]], var3, var4, (bv_3)this.id_throws[6])) {
                                    return this.id_class(2);
                                 }

                                 rS_2 var35 = this.id_break(var30);
                                 return new rn_3(var35, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[4]);
                              }
                           }

                           if ((rfH_2)this.id_throws[8] != null) {
                              rS_2 var32 = this.id_break((rfH_2)this.id_throws[8]);
                              if (!this.id_class((bc_3)this.id_throws[id_catch[46]], var3, var4, (bv_3)this.id_throws[6])) {
                                 return this.id_class(2);
                              } else {
                                 if (var32.id_break(var24)) {
                                    this.id_goto();
                                 }

                                 return new rn_3(var32, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[4]);
                              }
                           } else {
                              rfH_2 var31 = null;
                              if ((bc_3)this.id_throws[id_catch[49]] == (bc_3)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[id_catch[50]]) {
                                 var31 = this.id_class(var3, (bv_3)this.id_throws[6], var24);
                              } else if ((bc_3)this.id_throws[id_catch[52]] == (bc_3)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[1]) {
                                 bv_3 var13 = (bv_3)this.id_throws[6];
                                 if (var13 instanceof bA_2 var12) {
                                    var31 = this.id_class((bc_3)this.id_throws[id_catch[55]], var3, (rY_2)this.id_throws[3], var12, var24, id_extends[5]);
                                 }
                              }

                              if (var31 == null) {
                                 return this.id_this();
                              } else if (!this.id_class((bc_3)this.id_throws[id_catch[57]], var3, var4, (bv_3)this.id_throws[6])) {
                                 return this.id_class(2);
                              } else {
                                 rS_2 var34 = this.id_break(var31);
                                 return var34.id_break(var24)
                                       && !this.id_class(
                                          (bc_3)this.id_throws[id_catch[59]], var3, (rY_2)this.id_throws[3], (bv_3)this.id_throws[6], var34.id_break(), var24
                                       )
                                    ? this.id_this()
                                    : new rn_3(var34, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[4]);
                              }
                           }
                        }
                     } else {
                        return this.id_class(2);
                     }
                  }
               }
            }
         }
      }
   }

   private rS_2 id_break(rfH_2 var1) {
      return new bQ_2(this, var1);
   }

   private rpr_3 id_break(bc_3 var1) {
      return switch (((int[])bN_2.id_class[id_catch[165]])[var1.ordinal()]) {
         case 1 -> rpr_3.DOWN;
         case 2 -> rpr_3.UP;
         default -> throw new IncompatibleClassChangeError();
      };
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -24816765;
   }

   @Override
   public void id_break(rY_2 var1) {
      this.id_public();
      this.id_throws[2] = var1;
   }

   private boolean id_break(rYB var1, bv_3 var2, bL_2 var3) {
      this.id_public();
      return var2 != null && var3 != null ? var2.id_class(var1, var3, this.id_break((bc_3)this.id_throws[id_catch[163]])) : id_extends[47];
   }

   private boolean id_break(rYB var1, bv_3 var2) {
      return var2 != null && !var2.id_catch() && !this.id_protected(var1, var2) ? id_extends[51] : true;
   }

   @Override
   public rrTq_1 id_throws() {
      return new rrTq_1(rjG_2.id_catch(), ((Ps_1)this.id_case[1]).id_catch().id_goto());
   }

   private static void id_finally() {
      id_native = new String[]{
         new String("Farm Builder: Не удалось заполнить выбранную область"),
         new String("Farm Building"),
         new String("%.1f%s"),
         new String("с"),
         new String("Farm Builder: Закончились предметы")
      };
   }

   private void id_extends() {
      this.id_public();
      Object var5 = null;
      this.id_throws[5] = var5;
      Object var6 = null;
      this.id_throws[6] = var6;
      Integer var7 = Integer.valueOf(id_extends[65]);
      this.id_throws[7] = var7;
      Object var8 = null;
      this.id_throws[8] = var8;
      Boolean var9 = id_extends[66];
      this.id_throws[9] = var9;
      Object var10 = null;
      this.id_throws[11] = var10;
      Object var11 = null;
      this.id_throws[14] = var11;
      Object var12 = null;
      this.id_throws[18] = var12;
      Integer var13 = Integer.valueOf(id_extends[67]);
      this.id_throws[12] = var13;
      ((Set)this.id_throws[16]).clear();
      ((Set)this.id_throws[17]).clear();
      Object var14 = null;
      this.id_throws[13] = var14;
      Integer var15 = Integer.valueOf(id_extends[68]);
      this.id_throws[19] = var15;
   }

   private void id_goto() {
      this.id_public();
      Integer var5 = (Integer)this.id_throws[7] + 1;
      this.id_throws[7] = var5;
      Object var6 = null;
      this.id_throws[6] = var6;
      Object var7 = null;
      this.id_throws[8] = var7;
      ((Set)this.id_throws[16]).clear();
   }

   private boolean id_continue() {
      this.id_public();
      return (bv_3)this.id_throws[6] == null ? true : id_extends[57];
   }

   private rn_3 id_else() {
      String var1 = id_native[4];
      rrfu_3.id_byte(var1);
      MinecraftAccessor.a_(var1, id_extends[63]);
      this.id_protected();
      this.id_new();
      return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[2]);
   }

   @Override
   public rY_2 id_implements() {
      this.id_public();
      return (rY_2)this.id_throws[3];
   }

   private void id_new() {
      rrvT var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_catch[177]]).id_private();
      if (var1 != null) {
         FarmBuilder var2 = var1.id_finally();
         if (var2.aJ_()) {
            var2.id_byte(true);
         }
      }
   }

   private static void id_package() {
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
      id_break = var0;
   }

   private boolean id_return() {
      return !((Ps_1)this.id_case[1]).id_case().id_byte(((Ps_1)this.id_case[1]).id_extends()).id_catch() ? true : id_extends[59];
   }

   private static void id_super() {
      id_implements = new float[]{500.0F, -90.0F};
   }

   private static void id_try() {
      id_finally = new long[2];
   }

   private static void id_while() {
      id_volatile = new double[]{Double.MAX_VALUE, 36.0, 1.0, Double.MAX_VALUE, 1000.0, 100.0};
   }

   private void id_public() {
      if (this.id_throws == null) {
         this.id_throws = new Object[21];
         Object[] var1 = this.id_throws;
         var1[4] = id_extends[76];
         var1[7] = Integer.valueOf(id_extends[77]);
         var1[9] = id_extends[78];
         var1[10] = id_finally[0];
         var1[12] = Integer.valueOf(id_extends[79]);
         var1[19] = Integer.valueOf(id_extends[80]);
         var1[20] = id_finally[1];
      }
   }

   @Override
   public void id_protected() {
      this.id_public();
      super.id_protected();
      this.id_extends();
      Boolean var5 = id_extends[14];
      this.id_throws[4] = var5;
   }

   private boolean id_protected(rYB var1, bv_3 var2) {
      this.id_public();
      return var2 != null && !var2.id_catch() ? var2.id_class(var1, this.id_break((bc_3)this.id_throws[id_catch[164]])) : id_extends[49];
   }

   @Override
   public rY_2 id_private() {
      this.id_public();
      return (rY_2)this.id_throws[2];
   }

   private static void id_final() {
      id_extends = new boolean[]{
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

   private static void id_synchronized() {
      id_catch = new short[]{
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
