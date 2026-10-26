package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrna_3 extends rrnK_2 {
   private static short[] protected_;
   public Object[] byte_;
   private static boolean[] case_;
   private static byte[] catch_;
   private static float[] private_;
   private static double[] implements_;

   @Override
   public float byte_() {
      return -1.0F;
   }

   @Override
   public float int_() {
      this.try_();
      if (this.synchronized_()) {
         return -1.0F;
      } else {
         AttackAura var1 = this.continue_();
         iB_2 var2 = var1.continue_();
         if (var2 == null && (Boolean)this.byte_[5]) {
            return (float)rrfQ_2.class_(((cb_3)import_.class_[57]).Sa(), 8.0, 10.0);
         } else {
            PX var3 = this.private_();
            float var4 = var1.try_();
            if (this.extends_() == (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[1] && var2 != null && var3 != null) {
               an_3 var5 = Ph_1.class_(var2, ((cb_3)import_.class_[57]).new_(1.0F), new PX((Float)this.byte_[2], var3.protected_()), var4, true);
               if (var5 != var2) {
                  return -1.0F;
               }
            }

            return private_[11];
         }
      }
   }

   public rrna_3(AttackAura var1) {
      super(var1, new rrTT(var1));
      this.try_();
      rrni_3 var6 = new rrni_3(this);
      this.byte_[0] = var6;
      Boolean var7 = true;
      this.byte_[1] = var7;
      Float var8 = Float.MIN_VALUE;
      this.byte_[7] = var8;
      this.class_(true);
   }

   static {
      ntfClinit();
   }

   private boolean this_() {
      an_3 var1 = Ph_1.class_(((cb_3)import_.class_[57]).z(), 3.0F, true, null);
      if (var1 == null) {
         ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rmq_3(rpm_3.MAIN_HAND));
         return true;
      } else {
         return case_[20];
      }
   }

   @EventTarget
   public void class_(rrFj_1 var1) {
      this.try_();
      if (((rrwW_2)rrwW_2.staticFieldsd828d5c982463367b63d6cc3c26fd998[0]).class_((rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2])) {
         Integer var6 = (Integer)this.byte_[3] + 1;
         this.byte_[3] = var6;
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2602842125709980338L;
   }

   @Override
   public float class_(rjU_2 var1, rjU_2 var2) {
      this.try_();
      float var10002 = super.class_(var1, var2);
      Float var8 = var10002;
      this.byte_[2] = var8;
      float var3 = var10002;
      if ((Boolean)this.byte_[1]) {
         var3 = (Float)((cb_3)import_.class_[57]).throws_[15];
         if ((Boolean)this.byte_[4]) {
            var3 = ((cb_3)import_.class_[57]).N();
         }
      }

      return var3;
   }

   @Override
   public Pair<rrTA, rrTA> class_(an_3 var1, PX var2) {
      ((List)rrTT.break_[1]).clear();
      rfl_3 var3 = var1.rN();
      List var4 = this.class_(var1, var3);
      PX var5 = var2.byte_();
      rjU_2 var6 = var1.new_(1.0F);
      ((List)rrTT.break_[1]).addAll(var4);
      Object var7 = new rrTn_1(var6);
      double var8 = Double.MAX_VALUE;

      for (rrTA var11 : var4) {
         PX var12 = PJ.class_(var11);
         double var13 = PJ.class_(var5.protected_(), var12.protected_());
         if (var13 < var8) {
            var8 = var13;
            var7 = var11;
         }
      }

      return Pair.of(var7, var7);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 341675344;
   }

   @Override
   public List<rrTA> class_(an_3 var1, rfl_3 var2) {
      ArrayList var3 = new ArrayList();
      rjU_2 var4 = ((cb_3)import_.class_[57]).new_(1.0F);
      float var5 = 0.08F;
      float var6 = 0.0F;
      float var7 = 0.0F;
      double var8 = var2.class_ + (double)var5;
      double var10 = var2.protected_ - (double)var5;
      double var12 = var2.byte_ + (double)var5;
      double var14 = var2.case_ - (double)var5;
      double var16 = var10 - var8;
      double var18 = var16 / 2.0;
      double var20 = (var2.throws_ - var2.break_) / 12.0;
      float var22 = this.continue_().try_();

      for (double var23 = var2.break_; var23 < var2.throws_; var23 += var20) {
         if (!(var23 < var1.re() + (double)var7) && !(var23 > var2.throws_ - (double)var6)) {
            for (double var25 = implements_[3]; var25 < var16; var25 += var18) {
               rrTn_1 var27 = new rrTn_1(new rjU_2(var8, var23, var12 + var25));
               var3.add(var27);
               rrTn_1 var28 = new rrTn_1(new rjU_2(var10, var23, var12 + var25));
               var3.add(var28);
               rrTn_1 var29 = new rrTn_1(new rjU_2(var8 + var25, var23, var12));
               var3.add(var29);
               rrTn_1 var30 = new rrTn_1(new rjU_2(var8 + var25, var23, var14));
               var3.add(var30);
            }

            rrTn_1 var32 = new rrTn_1(new rjU_2(var10, var23, var14));
            var3.add(var32);
         }
      }

      ArrayList var31 = new ArrayList();
      boolean var24 = this.native_();
      boolean var33 = var24 && !var3.stream().anyMatch(var3x -> var3x.class_(var4, var1, var1xx -> !this.class_(var1xx) ? true : case_[27]))
         ? case_[13]
         : case_[12];

      for (rrTA var34 : var3) {
         rjU_2 var35 = var34.rr();
         if (!var24 || var34.class_(var4, var1, var1x -> !this.class_(var1x) ? true : case_[25]) || !var33) {
            rfo_3 var36 = rhj_3.class_((cb_3)import_.class_[57], var1, var4, var35, (double)var22);
            if (var36 != null) {
               var31.add(var34);
            }
         }
      }

      return var31.isEmpty() ? var3 : var31;
   }

   @Override
   public void class_(q_1 var1) {
      this.try_();
      super.class_(var1);
      AttackAura var2 = this.continue_();
      rrnD_2 var3 = var2.long_();
      iB_2 var4 = var2.continue_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         Boolean var10 = ((cb_3)import_.class_[57]).private_[16] > 0 && ((cb_3)import_.class_[57]).private_[16] < 10 ? true : case_[3];
         this.byte_[4] = var10;
         if ((Boolean)this.byte_[6]) {
            Float var11 = this.while_();
            this.byte_[7] = var11;
         }

         this.class_(var4, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]);
         boolean var5 = this.synchronized_();
         if (var5 && this.this_()) {
            Boolean var12 = false;
            this.byte_[6] = var12;
            Integer var13 = 2;
            this.byte_[8] = var13;
         }

         Integer var14 = (Integer)this.byte_[8] - 1;
         this.byte_[8] = var14;
         if (var4 != null || ((cb_3)import_.class_[57]).z().class_((Float)((cb_3)import_.class_[57]).throws_[16], 0.1F)) {
            Boolean var15 = false;
            this.byte_[5] = var15;
         }

         if (var3.class_(var2)) {
            Boolean var16 = false;
            this.byte_[1] = var16;
            if (!var5 && (Integer)this.byte_[8] <= 0) {
               this.class_(var4, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[1]);
               this.class_(var4);
            }

            if ((Integer)this.byte_[3] >= 50
               && ((rrwW_2)rrwW_2.staticFieldsd828d5c982463367b63d6cc3c26fd998[0]).class_((rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2])) {
               Integer var17 = 0;
               this.byte_[3] = var17;
               Boolean var18 = true;
               this.byte_[6] = var18;
            }
         } else {
            Boolean var19 = true;
            this.byte_[1] = var19;
         }
      }

      var3.class_(var2, var1);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-28, -89, 113, 43, -81, 44, -92, 10}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public float break_(rjU_2 var1, rjU_2 var2) {
      this.try_();
      if (this.synchronized_()) {
         return (Float)this.byte_[7];
      } else {
         return this.byte_[1] && this.byte_[4] ? ((cb_3)import_.class_[57]).b() : super.break_(var1, var2);
      }
   }

   @Override
   public void throws_() {
      this.try_();
      super.throws_();
      Boolean var5 = false;
      this.byte_[5] = var5;
   }

   @Override
   public rrTH finally_() {
      return (var0, var1, var2) -> {
         float var3 = rfU_2.catch_(var1 - var0);
         float var4 = var2 * Math.abs(var3) / 180.0F;
         float var5 = 1.0F;
         if (var4 < var5) {
            var4 = var5;
         }

         return var3 > 0.0F ? var0 + var4 : var0 - var4;
      };
   }

   private static void else_() {
      implements_ = new double[]{Double.MAX_VALUE, 2.0, 12.0, 0.0, 8.0, 10.0};
   }

   private static void instanceof_() {
      catch_ = new byte[]{10, 2, 50, -90, 90, 9, 2, 3, 4, 5, 6, 7, 8};
   }

   @Override
   public rrTH package_() {
      return (var0, var1, var2) -> {
         float var3 = rfU_2.catch_(var1 - var0);
         if (var3 > var2) {
            return var0 + var2;
         } else {
            return var3 < -var2 ? var0 - var2 : var1;
         }
      };
   }

   private static void return_() {
      protected_ = new short[]{
         0,
         1,
         7,
         0,
         57,
         16,
         57,
         16,
         4,
         6,
         7,
         0,
         6,
         8,
         8,
         8,
         57,
         57,
         16,
         5,
         1,
         8,
         1,
         3,
         0,
         2,
         3,
         6,
         1,
         5,
         0,
         2,
         3,
         3,
         1,
         1,
         57,
         57,
         5,
         57,
         1,
         57,
         2,
         2,
         1,
         57,
         15,
         4,
         57,
         7,
         1,
         4,
         57,
         0,
         1,
         5,
         5,
         57,
         57,
         0,
         57,
         6,
         7,
         57
      };
   }

   private static void throw_() {
      private_ = new float[]{
         Float.MIN_VALUE,
         0.1F,
         1.0F,
         1.0F,
         0.08F,
         0.0F,
         0.0F,
         -1.0F,
         -1.0F,
         1.0F,
         -1.0F,
         1.0F,
         3.0F,
         Float.MIN_VALUE,
         3.0F,
         Float.MIN_VALUE,
         180.0F,
         1.0F,
         0.0F,
         0.0F,
         0.0F
      };
   }

   private void try_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[9];
         this.byte_[1] = false;
         this.byte_[2] = 0.0F;
         this.byte_[3] = 0;
         this.byte_[4] = false;
         this.byte_[5] = false;
         this.byte_[6] = false;
         this.byte_[7] = 0.0F;
         this.byte_[8] = 0;
      }
   }

   private float while_() {
      PX var1 = ((cb_3)import_.class_[57]).z();
      float var2 = var1.throws_();
      float var3 = Float.MIN_VALUE;

      for (byte var4 = -90; var4 <= 90; var4 += 20) {
         an_3 var5 = Ph_1.class_(new PX(var2, (float)var4), 3.0F, false, null);
         if (var5 == null) {
            return (float)var4;
         }
      }

      return var3;
   }

   private static void public_() {
      case_ = new boolean[]{
         true,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
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
         false,
         false,
         false,
         false,
         false
      };
   }

   @Override
   public rrTf_1 protected_() {
      this.try_();
      return (rrTf_1)this.byte_[0];
   }

   @Override
   public rrTj_1 final_() {
      this.try_();
      return (rrTj_1)(this.byte_[5] ? () -> ((cb_3)import_.class_[57]).rO() : super.final_());
   }

   @Override
   public void volatile_() {
      this.try_();
      super.volatile_();
      Boolean var5 = true;
      this.byte_[1] = var5;
      Boolean var6 = true;
      this.byte_[5] = var6;
   }

   boolean synchronized_() {
      this.try_();
      return this.byte_[6] && this.byte_[7] != Float.MIN_VALUE ? true : case_[23];
   }
}
