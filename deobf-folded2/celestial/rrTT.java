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
   public static Object[] id_break;
   private static byte[] id_protected;
   private static short[] id_throws;
   private static boolean[] id_case;
   public Object[] id_byte;
   private static float[] id_catch;
   private static double[] id_private;

   @Override
   public PX id_byte() {
      this.id_goto();
      return (PX)this.id_byte[2];
   }

   public rrTj_1 id_int() {
      this.id_goto();
      return (rrTj_1)this.id_byte[8];
   }

   public rrTT(C_class var1, rrnF_2 var2) {
      super(var1);
      this.id_goto();
      Boolean var7 = true;
      this.id_byte[5] = var7;
      Integer var8 = -1;
      this.id_byte[7] = var8;
      this.id_byte[1] = var2;
      rrTy_1 var10 = new rrTy_1(this);
      this.id_byte[0] = var10;
      id_break[3] = this;
   }

   public rrTT(rrnF_2 var1) {
      this(C_throws.id_byte(), var1);
   }

   static {
      ntfClinit();
   }

   public rrnF_2 id_this() {
      this.id_goto();
      return (rrnF_2)this.id_byte[1];
   }

   @Override
   public void id_class(g_1 var1) {
      this.id_final();
   }

   private Pair<rjU_2, rjU_2> id_class(rrTj_1 var1, PX var2) {
      this.id_goto();
      if (var1 instanceof an_3 var3) {
         Pair var16 = ((rrnF_2)this.id_byte[1]).id_class(var3, var2);
         rrTA var12 = (rrTA)var16.getRight();
         id_break[2] = var12;
         return Pair.of(((rrTA)var16.getLeft()).rr(), ((rrTA)var16.getRight()).rr());
      } else if (var1 instanceof rrTV var4) {
         Pair var15 = ((rrnF_2)this.id_byte[1]).id_class(var4, var2);
         rrTA var13 = (rrTA)var15.getRight();
         id_break[2] = var13;
         return Pair.of(((rrTA)var15.getLeft()).rr(), ((rrTA)var15.getRight()).rr());
      } else if (var1 instanceof rfH_2 var5) {
         rjU_2 var14 = new rjU_2((double)var5.b_() + 0.5, (double)var5.c_() + 0.5, (double)var5.d_() + 0.5);
         return Pair.of(var14, var14);
      } else if (var1 instanceof rrTR var6) {
         rjU_2 var7 = var6.rr();
         return Pair.of(var7, var7);
      } else {
         return Pair.of(rjU_2.id_class, rjU_2.id_class);
      }
   }

   @Override
   public void id_class(rrAX var1) {
      this.id_goto();
      if ((PX)this.id_byte[2] != null && (rrTj_1)this.id_byte[8] != null) {
         var1.id_class(PJ.id_class((rrTj_1)this.id_byte[8]));
      }
   }

   public void id_class(boolean var1) {
      this.id_goto();
      Boolean var6 = var1;
      this.id_byte[5] = var6;
   }

   public boolean id_class(rrTR var1) {
      this.id_goto();
      if (!((rrnF_2)this.id_byte[1]).aG_()) {
         return false;
      } else {
         rjG_2 var3 = (rjG_2)id_import.id_class[64];
         return (!(var3 instanceof rfo_3 var2) || var2.id_class() == var1) && !((cb_3)id_import.id_class[57]).id_class(var1) ? true : id_case[10];
      }
   }

   @Override
   public void id_class(rrAz_1 var1) {
      this.id_goto();
      if ((PX)this.id_byte[2] != null) {
         rrTq_1 var2 = ((rrnF_2)this.id_byte[1]).aB_();
         if (var2 != null) {
            var1.id_class(var2.id_break());
            var1.id_class(var2.id_class());
         } else {
            var1.id_class((PX)this.id_byte[2]);
            var1.id_class(PJ.id_class((PX)this.id_byte[2], var1.id_protected(), false));
         }
      }
   }

   public void id_class(rrTy_1 var1) {
      this.id_goto();
      this.id_byte[0] = var1;
   }

   private static float id_class(float var0) {
      return Math.abs(rfU_2.id_catch(((PX)PJ.id_class[0]).id_throws() - var0));
   }

   @Override
   public void id_class(t_1 var1) {
      this.id_goto();
      if ((PX)this.id_byte[2] != null) {
         if (((rrnF_2)this.id_byte[1]).id_catch() == (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[3]) {
            var1.id_class(true);
            return;
         }

         if (!this.id_else()) {
            return;
         }

         var1.id_class(((rrnF_2)this.id_byte[1]).id_catch() == (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[3] ? true : id_case[14]);
      }
   }

   public void id_class(rrTj_1 var1, rrTI var2) {
      this.id_goto();
      this.id_byte[8] = var1;
      if (var1 == null) {
         rrTj_1 var3 = ((rrnF_2)this.id_byte[1]).aF_();
         if (var3 == null) {
            return;
         }

         var1 = var3;
         this.id_byte[8] = var3;
      }

      ((Set)id_break[0]).add(this);
      if (((Set)id_break[0]).size() <= 1) {
         id_break[3] = this;
         this.id_byte[9] = var2;
         Boolean var16 = true;
         this.id_byte[5] = var16;
         Boolean var17 = false;
         this.id_byte[6] = var17;
         int var10003 = (Integer)this.id_byte[7] - 1;
         Integer var18 = var10003;
         this.id_byte[7] = var18;
         Integer var19 = Math.max(var10003, 0);
         this.id_byte[7] = var19;
         float var4;
         float var25;
         if (var1 instanceof rrTg_1 var5) {
            PX var6 = var5.getNeedRotation();
            var25 = var6.id_throws();
            var4 = var6.id_protected();
         } else {
            Pair var28 = this.id_class(var1, (PX)PJ.id_class[0]);
            rjU_2 var7 = ((cb_3)id_import.id_class[57]).id_new(1.0F);
            var25 = ((rrnF_2)this.id_byte[1]).id_class(var7, (rjU_2)var28.getLeft());
            var4 = ((rrnF_2)this.id_byte[1]).id_break(var7, (rjU_2)var28.getRight());
         }

         if (var1 instanceof rrTR var26 && this.id_class(var26)) {
            Boolean var20 = true;
            this.id_byte[6] = var20;
            if (var2 != (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[1]) {
               if ((Integer)this.id_byte[7] < 1) {
                  var25 += 40.0F;
               }
            } else {
               Integer var21 = 2;
               this.id_byte[7] = var21;
            }
         }

         Float var22 = id_class(var25);
         this.id_byte[10] = var22;
         Float var23 = id_break(var4);
         this.id_byte[11] = var23;
         PX var27 = ((rrTy_1)this.id_byte[0]).id_class(new PX(var25, var4));
         if ((PX)this.id_byte[2] == null) {
            PX var24 = (PX)PX.id_class[0];
            this.id_byte[2] = var24;
         }

         if (((rrnF_2)this.id_byte[1]).id_class(var27)) {
            ((PX)this.id_byte[2]).id_class(var27.id_throws());
         }

         if (((rrnF_2)this.id_byte[1]).id_break(var27)) {
            ((PX)this.id_byte[2]).id_byte(var27.id_protected());
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2371900852722691418L;
   }

   @Override
   public void id_class(j_1 var1) {
      this.id_goto();
      if (var1.id_class() == (V)V.staticFields30e1cd8580ce39faa61be3646b7cc079[0]) {
         ((rrTy_1)this.id_byte[0]).id_break();
         ((Set)id_break[0]).clear();
      }
   }

   public rrTT id_class(rrTw_1 var1) {
      this.id_goto();
      this.id_byte[4] = var1;
      return this;
   }

   @Override
   public void id_class(q_1 var1) {
      this.id_goto();
      if ((C_volatile)id_break[3] != this) {
         Object var6 = null;
         this.id_byte[2] = var6;
      } else if ((PX)this.id_byte[2] != null) {
         switch (((int[])rrTt_1.id_class[0])[var1.id_class().ordinal()]) {
            case 1:
               PX var7 = ((cb_3)id_import.id_class[57]).rO();
               this.id_byte[3] = var7;
               cb_3 var17 = (cb_3)id_import.id_class[57];
               Float var8 = ((PX)this.id_byte[2]).id_throws();
               var17.id_throws[15] = var8;
               var17 = (cb_3)id_import.id_class[57];
               Float var9 = ((PX)this.id_byte[2]).id_protected();
               var17.id_throws[16] = var9;
               var17 = (cb_3)id_import.id_class[57];
               Float var10 = rfU_2.id_class((Float)((cb_3)id_import.id_class[57]).id_throws[16], -90.0F, 90.0F);
               var17.id_throws[16] = var10;
               break;
            case 2:
               if ((PX)this.id_byte[3] != null) {
                  cb_3 var10000 = (cb_3)id_import.id_class[57];
                  Float var11 = ((PX)this.id_byte[3]).id_throws();
                  var10000.id_throws[15] = var11;
                  var10000 = (cb_3)id_import.id_class[57];
                  Float var12 = ((PX)this.id_byte[3]).id_protected();
                  var10000.id_throws[16] = var12;
                  var10000 = (cb_3)id_import.id_class[57];
                  Float var13 = rfU_2.id_class((Float)((cb_3)id_import.id_class[57]).id_throws[16], -90.0F, 90.0F);
                  var10000.id_throws[16] = var13;
                  Object var14 = null;
                  this.id_byte[3] = var14;
               }

               if ((rrTj_1)this.id_byte[8] == null) {
                  this.id_final();
               }

               if ((rrTw_1)this.id_byte[4] != null) {
                  ((rrTw_1)this.id_byte[4]).id_class(() -> {
                     this.id_goto();
                     ((rrTw_1)this.id_byte[4]).id_break();
                     Object var5 = null;
                     this.id_byte[2] = var5;
                     Object var6x = null;
                     this.id_byte[8] = var6x;
                  });
               }
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 250636663;
   }

   @Override
   public void id_class(rrAO var1) {
      this.id_goto();
      if (!this.id_else()) {
         if ((PX)this.id_byte[2] != null) {
            switch (((int[])rrTt_1.id_class[1])[((rrnF_2)this.id_byte[1]).id_catch().ordinal()]) {
               case 1:
                  rrfj_3.id_class(var1, ((PX)this.id_byte[2]).id_throws(), (Float)((cb_3)id_import.id_class[57]).id_break[45]);
                  break;
               case 2:
                  rrTj_1 var3 = (rrTj_1)this.id_byte[8];
                  if (!(var3 instanceof rrTR var2)
                     || !((cb_3)id_import.id_class[57]).id_class(var2)
                     || !((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().P().id_super()) {
                     rrfj_3.id_class(var1, ((PX)this.id_byte[2]).id_throws(), (Float)((cb_3)id_import.id_class[57]).id_break[45]);
                     return;
                  }

                  if (var2 instanceof an_3 var4) {
                     rrfj_3.id_class(var1, var4, ((rrnF_2)this.id_byte[1]).az_(), ((rrnF_2)this.id_byte[1]).aD_(), ((PX)this.id_byte[2]).id_throws());
                  } else {
                     rrfj_3.id_class(var1, var2.rr(), ((PX)this.id_byte[2]).id_throws());
                  }
            }
         }
      }
   }

   @Override
   public rrTj_1 id_break() {
      this.id_goto();
      return (rrTj_1)this.id_byte[8];
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-105, 33, -91, 109, -107, 19, 53, -42}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static float id_break(float var0) {
      return Math.abs(((PX)PJ.id_class[0]).id_protected() - var0);
   }

   public PX id_throws() {
      return Optional.ofNullable(this.id_byte()).orElse(((cb_3)id_import.id_class[57]).z());
   }

   public void id_finally() {
   }

   public boolean id_catch() {
      this.id_goto();
      return (Boolean)this.id_byte[6];
   }

   public PX id_extends() {
      this.id_goto();
      return (PX)this.id_byte[3];
   }

   private void id_goto() {
      if (this.id_byte == null) {
         this.id_byte = new Object[12];
         Object[] var1 = this.id_byte;
         var1[5] = false;
         var1[6] = false;
         var1[7] = 0;
         var1[10] = 0.0F;
         var1[11] = 0.0F;
      }
   }

   public rrTw_1 id_case() {
      this.id_goto();
      return (rrTw_1)this.id_byte[4];
   }

   public int id_continue() {
      this.id_goto();
      return (Integer)this.id_byte[7];
   }

   public boolean id_else() {
      this.id_goto();
      if (!((cb_3)id_import.id_class[57]).PZ() && !((cb_3)id_import.id_class[57]).Sy()) {
         return ((rrnF_2)this.id_byte[1]).id_catch() == (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[1] ? true : id_case[17];
      } else {
         return id_case[15];
      }
   }

   public rrTI id_implements() {
      this.id_goto();
      return (rrTI)this.id_byte[9];
   }

   private static void id_instanceof() {
      id_protected = new byte[]{-1, 2, 12, 5, 6, 7, 10, 11, 4};
   }

   public Optional<PX> id_new() {
      return Optional.ofNullable((PX)PJ.id_class[0]);
   }

   public boolean id_package() {
      this.id_goto();
      return (Boolean)this.id_byte[5];
   }

   private static void id_return() {
      id_private = new double[]{0.5, 0.5, 0.5};
   }

   public float id_super() {
      this.id_goto();
      return (Float)this.id_byte[11];
   }

   private static void id_try() {
      id_catch = new float[]{1.0F, 40.0F, -90.0F, 90.0F, -90.0F, 90.0F, 0.0F, 0.0F};
   }

   private static void id_while() {
      id_case = new boolean[]{
         true, true, true, false, true, false, true, true, false, true, false, false, true, true, false, true, true, false, false, true, false, false, false
      };
   }

   private static void id_public() {
      id_throws = new short[]{
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

   public rrTy_1 id_protected() {
      this.id_goto();
      return (rrTy_1)this.id_byte[0];
   }

   public float id_private() {
      this.id_goto();
      return (Float)this.id_byte[10];
   }

   public void id_final() {
      this.id_goto();
      PX var1 = (PX)PJ.id_class[0];
      if ((cb_3)id_import.id_class[57] != null && (PX)this.id_byte[2] != null && var1 != null && (C_volatile)id_break[3] == this) {
         cb_3 var10000 = (cb_3)id_import.id_class[57];
         Float var6 = var1.id_throws() + rfU_2.id_catch((Float)((cb_3)id_import.id_class[57]).id_throws[15] - var1.id_throws());
         var10000.id_throws[15] = var6;
      }

      Object var7 = null;
      this.id_byte[2] = var7;
      Object var8 = null;
      this.id_byte[8] = var8;
   }

   private static void id_synchronized() {
      Object[] var0 = new Object[]{new HashSet(), new ArrayList(), null, null};
      id_break = var0;
   }
}
