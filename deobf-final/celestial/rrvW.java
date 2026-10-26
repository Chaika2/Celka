package celestial;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvW {
   private static boolean[] break_;
   private static short[] byte_;
   private static String[] protected_;
   private static byte[] throws_;
   public Object[] class_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-23, 72, 24, 107, -25, -53, -86, -98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String byte_() {
      return (String)this.class_[2];
   }

   public rrvW(String var1) {
      this.case_();
      ArrayList var6 = new ArrayList();
      this.class_[3] = var6;
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -326174799;
   }

   public void class_(String var1) {
      this.class_[2] = var1;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1815674350254401751L;
   }

   public void class_(rrvz_1 var1) {
      ((List)this.class_[3]).add(var1);
   }

   public String class_() {
      return (String)this.class_[1];
   }

   public void break_(String var1) {
      this.class_[1] = var1;
   }

   public void break_() throws IOException {
   }

   private static void throws_() {
      byte_ = new short[]{3, 0, 0, 1, 2, 1, 2, 3, 1, 3, 1, 2, 3, 3, 0};
   }

   private static void catch_() {
      break_ = new boolean[]{true};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
      }
   }

   private static void implements_() {
      throws_ = new byte[]{8, 8, 4};
   }

   public String protected_() {
      return (String)this.class_[0];
   }

   private static void private_() {
      protected_ = new String[]{
         new String("Set content or add at least one EmbedObject"),
         new String("content"),
         new String("username"),
         new String("title"),
         new String("description"),
         new String("url"),
         new String("color"),
         new String("url"),
         new String("image"),
         new String("name"),
         new String("value"),
         new String("inline"),
         new String("fields"),
         new String("embeds"),
         new String("Content-Type"),
         new String("application/json"),
         new String("User-Agent"),
         new String("Java-DiscordWebhook-BY-Gelox_"),
         new String("POST")
      };
   }
}
