package celestial;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvz_1 {
   private static byte[] break_;
   private static short[] byte_;
   public Object[] class_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{54, -53, -28, 95, -65, 115, -62, 105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String byte_() {
      return (String)this.class_[1];
   }

   public rrvz_1() {
      this.catch_();
      ArrayList var5 = new ArrayList();
      this.class_[5] = var5;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8372024027130035135L;
   }

   public void class_(rrvN var1) {
      this.class_[4] = var1;
   }

   public rrvz_1 class_(Color var1) {
      this.class_[3] = var1;
      return this;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1571304625;
   }

   public void class_(List<rrvQ> var1) {
      this.class_[5] = var1;
   }

   public rrvz_1 class_(String var1, String var2, boolean var3) {
      ((List)this.class_[5]).add(new rrvQ(var1, var2, var3));
      return this;
   }

   public Color class_() {
      return (Color)this.class_[3];
   }

   public rrvz_1 class_(String var1) {
      this.class_[2] = var1;
      return this;
   }

   public List<rrvQ> break_() {
      return (List<rrvQ>)this.class_[5];
   }

   public rrvz_1 break_(String var1) {
      this.class_[1] = var1;
      return this;
   }

   public String throws_() {
      return (String)this.class_[2];
   }

   public rrvz_1 throws_(String var1) {
      this.class_[0] = var1;
      return this;
   }

   private void catch_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         Object[] var1 = this.class_;
      }
   }

   public String case_() {
      return (String)this.class_[0];
   }

   private static void implements_() {
      break_ = new byte[]{6};
   }

   public rrvz_1 protected_(String var1) {
      rrvN var6 = new rrvN(var1);
      this.class_[4] = var6;
      return this;
   }

   public rrvN protected_() {
      return (rrvN)this.class_[4];
   }

   private static void private_() {
      byte_ = new short[]{5, 4, 5, 0, 1, 2, 3, 4, 5, 5, 0, 1, 2, 3, 4};
   }
}
