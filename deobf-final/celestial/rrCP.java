package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCP extends rrnK_2 {
   private static boolean[] protected_;
   private static short[] case_;
   public Object[] byte_;
   private static float[] catch_;
   private static byte[] private_;

   @Override
   public float byte_() {
      return -1.0F;
   }

   @Override
   public float int_() {
      return -1.0F;
   }

   public rrCP(AttackAura var1) {
      super(var1, new rrTT(var1));
      this.else_();
      Boolean var6 = true;
      this.byte_[0] = var6;
      rrCB var7 = new rrCB(this);
      this.byte_[1] = var7;
      this.class_(true);
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      case_ = new short[]{0, 1, 0, 0, 0, 1, 0, 0, 57, 15, 0, 57, 16, 0, 1};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4812986788951713981L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1531096384;
   }

   @Override
   public float class_(rjU_2 var1, rjU_2 var2) {
      this.else_();
      return this.byte_[0] ? (Float)((cb_3)import_.class_[57]).throws_[15] : super.class_(var1, var2);
   }

   @Override
   public void class_(q_1 var1) {
      this.else_();
      super.class_(var1);
      AttackAura var2 = this.continue_();
      rrnD_2 var3 = var2.long_();
      iB_2 var4 = var2.continue_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         this.class_(var4, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]);
         if (var3.class_(var2)) {
            Boolean var9 = false;
            this.byte_[0] = var9;
            this.class_(var4, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[1]);
            this.class_(var4);
         } else {
            Boolean var10 = true;
            this.byte_[0] = var10;
         }
      }

      var3.class_(var2, var1);
   }

   @Override
   public float break_(rjU_2 var1, rjU_2 var2) {
      this.else_();
      return this.byte_[0] ? (Float)((cb_3)import_.class_[57]).throws_[16] : super.break_(var1, var2);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-61, -105, -58, -70, 79, 59, 68, -5}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void else_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[2];
         this.byte_[0] = false;
      }
   }

   private static void return_() {
      catch_ = new float[]{-1.0F, -1.0F};
   }

   private static void public_() {
      private_ = new byte[]{2};
   }

   @Override
   public rrTf_1 protected_() {
      this.else_();
      return (rrTf_1)this.byte_[1];
   }

   @Override
   public void volatile_() {
      this.else_();
      super.volatile_();
      Boolean var5 = true;
      this.byte_[0] = var5;
   }

   private static void synchronized_() {
      protected_ = new boolean[]{true, true, false, true, true, false, false};
   }
}
