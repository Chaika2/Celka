package celestial;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvW {
   private static boolean[] id_break;
   private static short[] id_byte;
   private static String[] id_protected;
   private static byte[] id_throws;
   public Object[] id_class;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-23, 72, 24, 107, -25, -53, -86, -98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String id_byte() {
      return (String)this.id_class[id_byte[4]];
   }

   public rrvW(String var1) {
      this.id_case();
      ArrayList var6 = new ArrayList();
      this.id_class[id_byte[0]] = var6;
      this.id_class[id_byte[1]] = var1;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -326174799;
   }

   public void id_class(String var1) {
      this.id_class[id_byte[6]] = var1;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1815674350254401751L;
   }

   public void id_class(rrvz_1 var1) {
      ((List)this.id_class[id_byte[7]]).add(var1);
   }

   public String id_class() {
      return (String)this.id_class[id_byte[3]];
   }

   public void id_break(String var1) {
      this.id_class[id_byte[5]] = var1;
   }

   public void id_break() throws IOException {
   }

   private static void id_throws() {
      id_byte = new short[]{3, 0, 0, 1, 2, 1, 2, 3, 1, 3, 1, 2, 3, 3, 0};
   }

   private static void id_catch() {
      id_break = new boolean[]{true};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[id_throws[2]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_implements() {
      id_throws = new byte[]{8, 8, 4};
   }

   public String id_protected() {
      return (String)this.id_class[id_byte[2]];
   }

   private static void id_private() {
      id_protected = new String[]{
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
