package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class Bt_1 implements MinecraftAccessor {
   private static byte[] id_class;
   public Object[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;

   public Aw_1 id_byte() {
      return (Aw_1)this.id_break[2];
   }

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{54, 32, -99, 117, -75, 112, 24, 75}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Bt_1(String var1) {
      this.id_break();
      this.id_break[0] = var1;
      this.id_break[1] = var1;
   }

   static {
      ntfClinit();
   }

   public void id_class(Aw_1 var1) {
      this.id_break[2] = var1;
   }

   private static void id_class() {
      id_class = new byte[]{3};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1273030095;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8996262157848378274L;
   }

   private void id_break() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
         Object[] var1 = this.id_break;
      }
   }

   public void id_throws(String var1) {
      Matcher var2 = ((Pattern)Bl_1.id_class[3]).matcher(var1);
      if (var2.find()) {
         String var3 = var2.group(1);
         Aw_1 var8 = id_import.id_void().id_class(var3);
         this.id_break[2] = var8;
      }
   }

   public String id_throws() {
      return (String)this.id_break[0];
   }

   private static void id_catch() {
      id_protected = new boolean[]{true};
   }

   public void id_case(String var1) {
      this.id_break[1] = var1;
   }

   public boolean id_case() {
      return ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).id_protected((String)this.id_break[0]);
   }

   public void id_protected(String var1) {
      this.id_break[0] = var1;
   }

   public String id_protected() {
      return (String)this.id_break[1];
   }

   private static void id_private() {
      id_byte = new short[]{0, 1, 3, 2, 0, 0, 0, 1, 2, 0, 1, 2};
   }
}
