package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class Bt_1 implements MinecraftAccessor {
   private static byte[] class_;
   public Object[] break_;
   private static short[] byte_;
   private static boolean[] protected_;

   public Aw_1 byte_() {
      return (Aw_1)this.break_[2];
   }

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{54, 32, -99, 117, -75, 112, 24, 75}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Bt_1(String var1) {
      this.break_();
      this.break_[0] = var1;
      this.break_[1] = var1;
   }

   static {
      ntfClinit();
   }

   public void class_(Aw_1 var1) {
      this.break_[2] = var1;
   }

   private static void class_() {
      class_ = new byte[]{3};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1273030095;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8996262157848378274L;
   }

   private void break_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
         Object[] var1 = this.break_;
      }
   }

   public void throws_(String var1) {
      Matcher var2 = ((Pattern)Bl_1.class_[3]).matcher(var1);
      if (var2.find()) {
         String var3 = var2.group(1);
         Aw_1 var8 = import_.void_().class_(var3);
         this.break_[2] = var8;
      }
   }

   public String throws_() {
      return (String)this.break_[0];
   }

   private static void catch_() {
      protected_ = new boolean[]{true};
   }

   public void case_(String var1) {
      this.break_[1] = var1;
   }

   public boolean case_() {
      return ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).protected_((String)this.break_[0]);
   }

   public void protected_(String var1) {
      this.break_[0] = var1;
   }

   public String protected_() {
      return (String)this.break_[1];
   }

   private static void private_() {
      byte_ = new short[]{0, 1, 3, 2, 0, 0, 0, 1, 2, 0, 1, 2};
   }
}
