package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCS extends Pv_1 implements MinecraftAccessor {
   public Object[] break_;
   private static byte[] protected_;
   private static boolean[] throws_;
   public static Object[] byte_;
   private static double[] case_;
   private static short[] catch_;
   private static long[] private_;
   private static float[] implements_;

   private static void byte_() {
      private_ = new long[]{4000L, 4000L, 0L, 4000L};
   }

   public rrCS() {
      super(C_throws.byte_());
      this.catch_();
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(rrFK var1) {
      this.catch_();
      super.class_(var1);
      Long var6 = System.currentTimeMillis() + 4000L;
      this.break_[1] = var6;
   }

   @Override
   public void class_(rrAX var1) {
   }

   private static float class_(float var0, float var1, boolean var2) {
      float var3 = rrfQ_2.byte_(2.2F, 2.3F);
      float var4 = Math.abs(var1);
      float var5 = var0 + var3;
      float var6 = var0 - var3;
      if (var2) {
         var5 = rfU_2.class_(var5, -90.0F, 90.0F);
         var6 = rfU_2.class_(var6, -90.0F, 90.0F);
      }

      float var7 = var5 - var0;
      float var8 = var6 - var0;
      if (var7 == 0.0F) {
         return var8;
      } else if (var8 == 0.0F) {
         return var7;
      } else {
         float var9 = Math.abs(Math.abs(var5) - var4);
         float var10 = Math.abs(Math.abs(var6) - var4);
         return var9 >= var10 ? var7 : var8;
      }
   }

   public static double class_(double var0, double var2) {
      double var4 = Math.pow(10.0, var2);
      return Math.ceil(var0 * var4) / var4;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3172205131124250027L;
   }

   @Override
   public void class_(rrAO var1) {
      this.catch_();
      if ((PX)this.break_[3] != null) {
         rrfj_3.class_(var1, ((PX)this.break_[3]).throws_(), (Float)((cb_3)import_.class_[57]).break_[45]);
      }
   }

   @Override
   public void class_(q_1 var1) {
      this.catch_();
      Y var2 = var1.class_();
      if (var2 == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         Object var16 = null;
         this.break_[3] = var16;
         Object var17 = null;
         this.break_[2] = var17;
         if (!this.implements_() || System.currentTimeMillis() - (Long)this.break_[1] > 4000L) {
            Boolean var18 = false;
            this.break_[0] = var18;
            return;
         }

         boolean var3 = (Boolean)this.break_[0];
         Boolean var19 = false;
         this.break_[0] = var19;
         float var4 = ((cb_3)import_.class_[57]).N();
         float var5 = ((cb_3)import_.class_[57]).b();
         float var6 = (Float)((cb_3)import_.class_[57]).throws_[15];
         float var7 = (Float)((cb_3)import_.class_[57]).throws_[16];
         float var8 = Math.abs(var6 - var4);
         float var9 = Math.abs(var7 - var5);
         if (class_((double)var8, 2.0) > 35.0 || class_((double)var9, 2.0) > 35.0) {
            Boolean var20 = true;
            this.break_[0] = var20;
         }

         if (var3) {
            PX var21 = ((cb_3)import_.class_[57]).goto_();
            this.break_[2] = var21;
            float var10 = class_(var6, var4, false);
            float var11 = class_(var7, var5, true);
            PX var22 = new PX(var6 + var10, rfU_2.class_(var7 + var11, -90.0F, 90.0F));
            this.break_[3] = var22;
            cb_3 var10000 = (cb_3)import_.class_[57];
            Float var23 = ((PX)this.break_[3]).throws_();
            var10000.throws_[15] = var23;
            var10000 = (cb_3)import_.class_[57];
            Float var24 = ((PX)this.break_[3]).protected_();
            var10000.throws_[16] = var24;
         }
      } else if (var2 == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[1] && (PX)this.break_[2] != null) {
         cb_3 var29 = (cb_3)import_.class_[57];
         Float var25 = ((PX)this.break_[2]).throws_();
         var29.throws_[15] = var25;
         var29 = (cb_3)import_.class_[57];
         Float var26 = ((PX)this.break_[2]).protected_();
         var29.throws_[16] = var26;
         Object var27 = null;
         this.break_[2] = var27;
      }
   }

   @Override
   public void class_(rrAH var1) {
      if (this.implements_()) {
         var1.class_(((cb_3)import_.class_[57]).N());
         var1.break_(((cb_3)import_.class_[57]).b());
         var1.class_(false);
      }
   }

   private static void class_() {
      catch_ = new short[]{
         0, 3, 2, 1, 0, 0, 0, 57, 57, 57, 15, 57, 16, 0, 57, 2, 3, 57, 3, 15, 57, 3, 16, 1, 2, 57, 2, 15, 57, 2, 16, 2, 57, 57, 0, 1, 3, 3, 57, 45, 1, 1, 4, 0
      };
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 117861840;
   }

   private static void break_() {
      protected_ = new byte[]{4, 2};
   }

   @Override
   public void break_(y_1 var1) {
      this.catch_();
      if (var1.byte_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (var1.protected_() instanceof rZq_1 var2 && var2.break_() == rZT.ATTACK) {
            Long var8 = System.currentTimeMillis();
            this.break_[1] = var8;
         }
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-21, 48, -71, -72, 16, 74, 94, 116}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      implements_ = new float[]{-90.0F, 90.0F, 2.2F, 2.3F, -90.0F, 90.0F, -90.0F, 90.0F, 0.0F, 0.0F, 35.0F};
   }

   private void catch_() {
      if (this.break_ == null) {
         this.break_ = new Object[4];
         this.break_[0] = false;
         this.break_[1] = 0L;
      }
   }

   private static void case_() {
      throws_ = new boolean[]{false, false, true, false, true, false, false, false, true, false, false, true, false, true};
   }

   private boolean implements_() {
      if ((rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]) {
         return false;
      } else {
         return !((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().E().void_() ? false : throws_[8];
      }
   }

   private static void protected_() {
      case_ = new double[]{2.0, 35.0, 2.0, 35.0, 10.0};
   }

   private static void private_() {
      Object[] var0 = new Object[]{0.0F, 4000L};
      byte_ = var0;
   }
}
