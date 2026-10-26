package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class NotificationStyle {
   public Object[] class_;
   private static boolean[] break_;
   private static float[] byte_;
   private static short[] protected_;

   public NotificationStyle byte_() {
      rrfu_3 var10000 = (rrfu_3)this.class_[0];
      rVa_1 var5 = rVa_1.class_(ColorHelper.class_(0.0F));
      var10000.break_[2] = var5;
      var10000 = (rrfu_3)this.class_[0];
      rVa_1 var6 = rVa_1.class_(ColorHelper.class_(270.0F));
      var10000.break_[3] = var6;
      return this;
   }

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{48, 9, -104, -127, 111, 63, -69, -33}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   NotificationStyle() {
      this.protected_();
      rrfu_3 var5 = new rrfu_3();
      this.class_[0] = var5;
   }

   static {
      ntfClinit();
   }

   public NotificationStyle class_(rVa_1 var1, rVa_1 var2) {
      ((rrfu_3)this.class_[0]).break_[2] = var1;
      ((rrfu_3)this.class_[0]).break_[3] = var2;
      return this;
   }

   public NotificationStyle class_(rVa_1 var1) {
      ((rrfu_3)this.class_[0]).break_[4] = var1;
      ((rrfu_3)this.class_[0]).break_[5] = var1;
      return this;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1686541788;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2269250902018343080L;
   }

   public NotificationStyle class_() {
      rrfu_3 var10000 = (rrfu_3)this.class_[0];
      rVa_1 var5 = rVa_1.class_(ColorHelper.class_(0.0F));
      var10000.break_[4] = var5;
      var10000 = (rrfu_3)this.class_[0];
      rVa_1 var6 = rVa_1.class_(ColorHelper.class_(270.0F));
      var10000.break_[5] = var6;
      return this;
   }

   public NotificationStyle class_(String var1) {
      ((rrfu_3)this.class_[0]).break_[1] = var1;
      return this;
   }

   public rVe_1 break_() {
      return ((rrfu_3)this.class_[0]).catch_();
   }

   public NotificationStyle break_(rVa_1 var1, rVa_1 var2) {
      ((rrfu_3)this.class_[0]).break_[4] = var1;
      ((rrfu_3)this.class_[0]).break_[5] = var2;
      return this;
   }

   public NotificationStyle break_(String var1) {
      ((rrfu_3)this.class_[0]).break_[0] = var1;
      return this;
   }

   private static void throws_() {
      byte_ = new float[]{0.0F, 270.0F, 0.0F, 270.0F};
   }

   private static void catch_() {
      break_ = new boolean[]{true};
   }

   private static void case_() {
      protected_ = new short[]{0, 0, 0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 4, 0, 5, 0, 4, 0, 5, 0, 2, 0, 3, 0};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
      }
   }
}
