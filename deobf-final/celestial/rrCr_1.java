package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCr_1 extends rrnK_2 {
   private static float[] protected_;
   private static double[] case_;
   private static short[] catch_;
   private static boolean[] private_;
   private static byte[] implements_;
   public Object[] byte_;

   @Override
   public float byte_() {
      return 52.0F;
   }

   @Override
   public float int_() {
      AttackAura var1 = this.continue_();
      if (this.extends_() == (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[1]) {
         iB_2 var2 = var1.continue_();
         PX var3 = this.private_();
         if (var2 != null && var3 != null) {
            float var4 = var1.try_();
            an_3 var5 = Ph_1.class_(var2, ((cb_3)import_.class_[57]).new_(1.0F), new PX(var3.throws_(), var3.protected_()), var4, true);
            if (var5 != var2) {
               return -1.0F;
            }
         }
      }

      return protected_[3];
   }

   public rrCr_1(AttackAura var1) {
      super(var1, new rrTT(var1));
      this.goto_();
      rrTf_1 var6 = (var1x, var2) -> {
         this.goto_();
         float var3 = var2.throws_();
         float var4 = var2.protected_();
         if (!(Boolean)this.byte_[0]) {
            Pr_1 var5 = this.implements_().protected_();
            var3 += (float)(Math.sin((double)((Integer)((cb_3)import_.class_[57]).throws_[41]).intValue()) * 3.0);
            var4 += (float)Math.cos((double)((Integer)((cb_3)import_.class_[57]).throws_[41]).intValue()) * 0.5F;
            var3 += (float)rrfQ_2.class_(var5, -0.5, 0.5);
            var4 += (float)rrfQ_2.class_(var5, -0.5, 0.5);
         }

         return new PX(var3, var4);
      };
      this.byte_[1] = var6;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      case_ = new double[]{3.0, -0.5, 0.5, -0.5, 0.5};
   }

   @Override
   public void class_(q_1 var1) {
      this.goto_();
      super.class_(var1);
      AttackAura var2 = this.continue_();
      rrnD_2 var3 = var2.long_();
      iB_2 var4 = var2.continue_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         this.class_(var4, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]);
         if (var3.class_(var2)) {
            Boolean var9 = true;
            this.byte_[0] = var9;
            this.class_(var4, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[1]);
            this.class_(var4);
         } else {
            Boolean var10 = false;
            this.byte_[0] = var10;
         }
      }

      var3.class_(var2, var1);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5857290385354911740L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1516174425;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{53, -88, 83, -47, -10, 55, -95, 88}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void goto_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[2];
         this.byte_[0] = false;
      }
   }

   private static void else_() {
      catch_ = new short[]{1, 0, 0, 0, 1, 0, 1, 57, 1, 0, 0, 57, 41, 57, 41};
   }

   private static void return_() {
      private_ = new boolean[]{true, false, true, false, false, false};
   }

   private static void public_() {
      implements_ = new byte[]{2};
   }

   @Override
   public rrTf_1 protected_() {
      this.goto_();
      return (rrTf_1)this.byte_[1];
   }

   @Override
   public void volatile_() {
      this.goto_();
      super.volatile_();
      Boolean var5 = false;
      this.byte_[0] = var5;
   }

   private static void synchronized_() {
      protected_ = new float[]{52.0F, 1.0F, -1.0F, 5.0F, 0.5F};
   }
}
