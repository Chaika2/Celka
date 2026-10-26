package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrTT extends Pv_1 implements MinecraftAccessor, C_volatile {
   public static Object[] break_;
   private static byte[] protected_;
   private static short[] throws_;
   private static boolean[] case_;
   public Object[] byte_;
   private static float[] catch_;
   private static double[] private_;

   @Override
   public PX byte_() {
      this.goto_();
      return (PX)this.byte_[2];
   }

   public rrTj_1 int_() {
      this.goto_();
      return (rrTj_1)this.byte_[8];
   }

   public rrTT(C_class var1, rrnF_2 var2) {
      super(var1);
      this.goto_();
      Boolean var7 = true;
      this.byte_[5] = var7;
      Integer var8 = -1;
      this.byte_[7] = var8;
      this.byte_[1] = var2;
      rrTy_1 var10 = new rrTy_1(this);
      this.byte_[0] = var10;
      break_[3] = this;
   }

   public rrTT(rrnF_2 var1) {
      this(C_throws.byte_(), var1);
   }

   static {
      ntfClinit();
   }

   public rrnF_2 this_() {
      this.goto_();
      return (rrnF_2)this.byte_[1];
   }

   @Override
   public void class_(g_1 var1) {
      this.final_();
   }

   private Pair<rjU_2, rjU_2> class_(rrTj_1 var1, PX var2) {
      this.goto_();
      if (var1 instanceof an_3 var3) {
         Pair var16 = ((rrnF_2)this.byte_[1]).class_(var3, var2);
         rrTA var12 = (rrTA)var16.getRight();
         break_[2] = var12;
         return Pair.of(((rrTA)var16.getLeft()).rr(), ((rrTA)var16.getRight()).rr());
      } else if (var1 instanceof rrTV var4) {
         Pair var15 = ((rrnF_2)this.byte_[1]).class_(var4, var2);
         rrTA var13 = (rrTA)var15.getRight();
         break_[2] = var13;
         return Pair.of(((rrTA)var15.getLeft()).rr(), ((rrTA)var15.getRight()).rr());
      } else if (var1 instanceof rfH_2 var5) {
         rjU_2 var14 = new rjU_2((double)var5.b_() + 0.5, (double)var5.c_() + 0.5, (double)var5.d_() + 0.5);
         return Pair.of(var14, var14);
      } else if (var1 instanceof rrTR var6) {
         rjU_2 var7 = var6.rr();
         return Pair.of(var7, var7);
      } else {
         return Pair.of(rjU_2.class_, rjU_2.class_);
      }
   }

   @Override
   public void class_(rrAX var1) {
      this.goto_();
      if ((PX)this.byte_[2] != null && (rrTj_1)this.byte_[8] != null) {
         var1.class_(PJ.class_((rrTj_1)this.byte_[8]));
      }
   }

   public void class_(boolean var1) {
      this.goto_();
      Boolean var6 = var1;
      this.byte_[5] = var6;
   }

   public boolean class_(rrTR var1) {
      this.goto_();
      if (!((rrnF_2)this.byte_[1]).aG_()) {
         return false;
      } else {
         rjG_2 var3 = (rjG_2)import_.class_[64];
         return (!(var3 instanceof rfo_3 var2) || var2.class_() == var1) && !((cb_3)import_.class_[57]).class_(var1) ? true : case_[10];
      }
   }

   @Override
   public void class_(rrAz_1 var1) {
      this.goto_();
      if ((PX)this.byte_[2] != null) {
         rrTq_1 var2 = ((rrnF_2)this.byte_[1]).aB_();
         if (var2 != null) {
            var1.class_(var2.break_());
            var1.class_(var2.class_());
         } else {
            var1.class_((PX)this.byte_[2]);
            var1.class_(PJ.class_((PX)this.byte_[2], var1.protected_(), false));
         }
      }
   }

   public void class_(rrTy_1 var1) {
      this.goto_();
      this.byte_[0] = var1;
   }

   private static float class_(float var0) {
      return Math.abs(rfU_2.catch_(((PX)PJ.class_[0]).throws_() - var0));
   }

   @Override
   public void class_(t_1 var1) {
      this.goto_();
      if ((PX)this.byte_[2] != null) {
         if (((rrnF_2)this.byte_[1]).catch_() == (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[3]) {
            var1.class_(true);
            return;
         }

         if (!this.else_()) {
            return;
         }

         var1.class_(((rrnF_2)this.byte_[1]).catch_() == (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[3] ? true : case_[14]);
      }
   }

   public void class_(rrTj_1 var1, rrTI var2) {
      this.goto_();
      this.byte_[8] = var1;
      if (var1 == null) {
         rrTj_1 var3 = ((rrnF_2)this.byte_[1]).aF_();
         if (var3 == null) {
            return;
         }

         var1 = var3;
         this.byte_[8] = var3;
      }

      ((Set)break_[0]).add(this);
      if (((Set)break_[0]).size() <= 1) {
         break_[3] = this;
         this.byte_[9] = var2;
         Boolean var16 = true;
         this.byte_[5] = var16;
         Boolean var17 = false;
         this.byte_[6] = var17;
         int var10003 = (Integer)this.byte_[7] - 1;
         Integer var18 = var10003;
         this.byte_[7] = var18;
         Integer var19 = Math.max(var10003, 0);
         this.byte_[7] = var19;
         float var4;
         float var25;
         if (var1 instanceof rrTg_1 var5) {
            PX var6 = var5.getNeedRotation();
            var25 = var6.throws_();
            var4 = var6.protected_();
         } else {
            Pair var28 = this.class_(var1, (PX)PJ.class_[0]);
            rjU_2 var7 = ((cb_3)import_.class_[57]).new_(1.0F);
            var25 = ((rrnF_2)this.byte_[1]).class_(var7, (rjU_2)var28.getLeft());
            var4 = ((rrnF_2)this.byte_[1]).break_(var7, (rjU_2)var28.getRight());
         }

         if (var1 instanceof rrTR var26 && this.class_(var26)) {
            Boolean var20 = true;
            this.byte_[6] = var20;
            if (var2 != (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[1]) {
               if ((Integer)this.byte_[7] < 1) {
                  var25 += 40.0F;
               }
            } else {
               Integer var21 = 2;
               this.byte_[7] = var21;
            }
         }

         Float var22 = class_(var25);
         this.byte_[10] = var22;
         Float var23 = break_(var4);
         this.byte_[11] = var23;
         PX var27 = ((rrTy_1)this.byte_[0]).class_(new PX(var25, var4));
         if ((PX)this.byte_[2] == null) {
            PX var24 = (PX)PX.class_[0];
            this.byte_[2] = var24;
         }

         if (((rrnF_2)this.byte_[1]).class_(var27)) {
            ((PX)this.byte_[2]).class_(var27.throws_());
         }

         if (((rrnF_2)this.byte_[1]).break_(var27)) {
            ((PX)this.byte_[2]).byte_(var27.protected_());
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2371900852722691418L;
   }

   @Override
   public void class_(j_1 var1) {
      this.goto_();
      if (var1.class_() == (V)V.staticFields30e1cd8580ce39faa61be3646b7cc079[0]) {
         ((rrTy_1)this.byte_[0]).break_();
         ((Set)break_[0]).clear();
      }
   }

   public rrTT class_(rrTw_1 var1) {
      this.goto_();
      this.byte_[4] = var1;
      return this;
   }

   @Override
   public void class_(q_1 var1) {
      this.goto_();
      if ((C_volatile)break_[3] != this) {
         Object var6 = null;
         this.byte_[2] = var6;
      } else if ((PX)this.byte_[2] != null) {
         switch (((int[])rrTt_1.class_[0])[var1.class_().ordinal()]) {
            case 1:
               PX var7 = ((cb_3)import_.class_[57]).rO();
               this.byte_[3] = var7;
               cb_3 var17 = (cb_3)import_.class_[57];
               Float var8 = ((PX)this.byte_[2]).throws_();
               var17.throws_[15] = var8;
               var17 = (cb_3)import_.class_[57];
               Float var9 = ((PX)this.byte_[2]).protected_();
               var17.throws_[16] = var9;
               var17 = (cb_3)import_.class_[57];
               Float var10 = rfU_2.class_((Float)((cb_3)import_.class_[57]).throws_[16], -90.0F, 90.0F);
               var17.throws_[16] = var10;
               break;
            case 2:
               if ((PX)this.byte_[3] != null) {
                  cb_3 var10000 = (cb_3)import_.class_[57];
                  Float var11 = ((PX)this.byte_[3]).throws_();
                  var10000.throws_[15] = var11;
                  var10000 = (cb_3)import_.class_[57];
                  Float var12 = ((PX)this.byte_[3]).protected_();
                  var10000.throws_[16] = var12;
                  var10000 = (cb_3)import_.class_[57];
                  Float var13 = rfU_2.class_((Float)((cb_3)import_.class_[57]).throws_[16], -90.0F, 90.0F);
                  var10000.throws_[16] = var13;
                  Object var14 = null;
                  this.byte_[3] = var14;
               }

               if ((rrTj_1)this.byte_[8] == null) {
                  this.final_();
               }

               if ((rrTw_1)this.byte_[4] != null) {
                  ((rrTw_1)this.byte_[4]).class_(() -> {
                     this.goto_();
                     ((rrTw_1)this.byte_[4]).break_();
                     Object var5 = null;
                     this.byte_[2] = var5;
                     Object var6x = null;
                     this.byte_[8] = var6x;
                  });
               }
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 250636663;
   }

   @Override
   public void class_(rrAO var1) {
      this.goto_();
      if (!this.else_()) {
         if ((PX)this.byte_[2] != null) {
            switch (((int[])rrTt_1.class_[1])[((rrnF_2)this.byte_[1]).catch_().ordinal()]) {
               case 1:
                  rrfj_3.class_(var1, ((PX)this.byte_[2]).throws_(), (Float)((cb_3)import_.class_[57]).break_[45]);
                  break;
               case 2:
                  rrTj_1 var3 = (rrTj_1)this.byte_[8];
                  if (!(var3 instanceof rrTR var2)
                     || !((cb_3)import_.class_[57]).class_(var2)
                     || !((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().P().super_()) {
                     rrfj_3.class_(var1, ((PX)this.byte_[2]).throws_(), (Float)((cb_3)import_.class_[57]).break_[45]);
                     return;
                  }

                  if (var2 instanceof an_3 var4) {
                     rrfj_3.class_(var1, var4, ((rrnF_2)this.byte_[1]).az_(), ((rrnF_2)this.byte_[1]).aD_(), ((PX)this.byte_[2]).throws_());
                  } else {
                     rrfj_3.class_(var1, var2.rr(), ((PX)this.byte_[2]).throws_());
                  }
            }
         }
      }
   }

   @Override
   public rrTj_1 break_() {
      this.goto_();
      return (rrTj_1)this.byte_[8];
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-105, 33, -91, 109, -107, 19, 53, -42}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static float break_(float var0) {
      return Math.abs(((PX)PJ.class_[0]).protected_() - var0);
   }

   public PX throws_() {
      return Optional.ofNullable(this.byte_()).orElse(((cb_3)import_.class_[57]).z());
   }

   public void finally_() {
   }

   public boolean catch_() {
      this.goto_();
      return (Boolean)this.byte_[6];
   }

   public PX extends_() {
      this.goto_();
      return (PX)this.byte_[3];
   }

   private void goto_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[12];
         Object[] var1 = this.byte_;
         var1[5] = false;
         var1[6] = false;
         var1[7] = 0;
         var1[10] = 0.0F;
         var1[11] = 0.0F;
      }
   }

   public rrTw_1 case_() {
      this.goto_();
      return (rrTw_1)this.byte_[4];
   }

   public int continue_() {
      this.goto_();
      return (Integer)this.byte_[7];
   }

   public boolean else_() {
      this.goto_();
      if (!((cb_3)import_.class_[57]).PZ() && !((cb_3)import_.class_[57]).Sy()) {
         return ((rrnF_2)this.byte_[1]).catch_() == (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[1] ? true : case_[17];
      } else {
         return case_[15];
      }
   }

   public rrTI implements_() {
      this.goto_();
      return (rrTI)this.byte_[9];
   }

   private static void instanceof_() {
      protected_ = new byte[]{-1, 2, 12, 5, 6, 7, 10, 11, 4};
   }

   public Optional<PX> new_() {
      return Optional.ofNullable((PX)PJ.class_[0]);
   }

   public boolean package_() {
      this.goto_();
      return (Boolean)this.byte_[5];
   }

   private static void return_() {
      private_ = new double[]{0.5, 0.5, 0.5};
   }

   public float super_() {
      this.goto_();
      return (Float)this.byte_[11];
   }

   private static void try_() {
      catch_ = new float[]{1.0F, 40.0F, -90.0F, 90.0F, -90.0F, 90.0F, 0.0F, 0.0F};
   }

   private static void while_() {
      case_ = new boolean[]{
         true, true, true, false, true, false, true, true, false, true, false, false, true, true, false, true, true, false, false, true, false, false, false
      };
   }

   private static void public_() {
      throws_ = new short[]{
         5,
         7,
         1,
         0,
         3,
         8,
         1,
         8,
         0,
         0,
         3,
         9,
         5,
         6,
         7,
         7,
         7,
         0,
         57,
         1,
         1,
         6,
         1,
         7,
         7,
         10,
         11,
         0,
         2,
         0,
         2,
         1,
         2,
         1,
         2,
         1,
         2,
         1,
         2,
         1,
         64,
         57,
         0,
         57,
         2,
         3,
         57,
         57,
         15,
         15,
         2,
         8,
         3,
         2,
         2,
         0,
         57,
         3,
         57,
         2,
         15,
         57,
         2,
         16,
         57,
         57,
         16,
         16,
         3,
         57,
         3,
         15,
         57,
         3,
         16,
         57,
         57,
         16,
         16,
         3,
         8,
         4,
         4,
         2,
         1,
         2,
         2,
         2,
         1,
         1,
         2,
         57,
         45,
         8,
         57,
         0,
         1,
         1,
         2,
         2,
         2,
         57,
         45,
         2,
         1,
         3,
         1,
         3,
         2,
         8,
         8,
         0,
         0,
         0,
         2,
         0,
         57,
         8,
         4,
         57,
         57,
         1,
         1,
         0,
         0,
         0,
         1,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         0,
         5,
         4,
         2,
         8
      };
   }

   public rrTy_1 protected_() {
      this.goto_();
      return (rrTy_1)this.byte_[0];
   }

   public float private_() {
      this.goto_();
      return (Float)this.byte_[10];
   }

   public void final_() {
      this.goto_();
      PX var1 = (PX)PJ.class_[0];
      if ((cb_3)import_.class_[57] != null && (PX)this.byte_[2] != null && var1 != null && (C_volatile)break_[3] == this) {
         cb_3 var10000 = (cb_3)import_.class_[57];
         Float var6 = var1.throws_() + rfU_2.catch_((Float)((cb_3)import_.class_[57]).throws_[15] - var1.throws_());
         var10000.throws_[15] = var6;
      }

      Object var7 = null;
      this.byte_[2] = var7;
      Object var8 = null;
      this.byte_[8] = var8;
   }

   private static void synchronized_() {
      Object[] var0 = new Object[]{new HashSet(), new ArrayList(), null, null};
      break_ = var0;
   }
}
