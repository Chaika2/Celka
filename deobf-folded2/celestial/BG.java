package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum BG {
   public Object[] fieldsd25d445181413210921a2969c1bcd756;
   private static short[] shortsd25d445181413210921a2969c1bcd756;
   private static String[] stringsd25d445181413210921a2969c1bcd756;
   private static byte[] bytesd25d445181413210921a2969c1bcd756;
   public static Object[] staticFieldsd25d445181413210921a2969c1bcd756;
   private static boolean[] booleansd25d445181413210921a2969c1bcd756;

   private static void id_byte() {
      shortsd25d445181413210921a2969c1bcd756 = new short[]{5, 0, 1, 1, 0, 0, 1, 2, 3};
   }

   private BG(String var3) {
      this.id_catch();
      rgn_3 var8 = new rgn_3("menu." + this.name().toLowerCase());
      this.fieldsd25d445181413210921a2969c1bcd756[1] = var8;
      this.fieldsd25d445181413210921a2969c1bcd756[0] = var3;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4611145318762716024L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 161899409;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{54, -46, -4, -68, -126, -120, 73, 100}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String id_class() {
      return (String)this.fieldsd25d445181413210921a2969c1bcd756[0];
   }

   public rgn_3 id_break() {
      return (rgn_3)this.fieldsd25d445181413210921a2969c1bcd756[1];
   }

   private static void id_throws() {
      stringsd25d445181413210921a2969c1bcd756 = new String[]{
         new String("TELEGRAM"),
         new String("https://t.me/CelestialMinecraft"),
         new String("TELEGRAM_CHAT"),
         new String("https://t.me/+WryXTDhad-s4NzEy"),
         new String("DISCORD"),
         new String("https://discord.gg/celestialdlc"),
         new String("VK"),
         new String("https://vk.com/celestialclient")
      };
   }

   private void id_catch() {
      if (this.fieldsd25d445181413210921a2969c1bcd756 == null) {
         this.fieldsd25d445181413210921a2969c1bcd756 = new Object[2];
         Object[] var1 = this.fieldsd25d445181413210921a2969c1bcd756;
      }
   }

   private static void id_case() {
      booleansd25d445181413210921a2969c1bcd756 = new boolean[]{false, true, false, false, true, true};
   }

   private static void id_implements() {
      bytesd25d445181413210921a2969c1bcd756 = new byte[]{4, 2, 3, 2, 2, 3, 3, 5, 4, 2, 6};
   }

   private static void id_private() {
      Object[] var0 = new Object[]{
         new BG("https://t.me/CelestialMinecraft"),
         new BG("https://t.me/+WryXTDhad-s4NzEy"),
         new BG("https://discord.gg/celestialdlc"),
         new BG("https://vk.com/celestialclient"),
         null,
         null
      };
      var0[4] = new BG[]{(BG)var0[0], (BG)var0[1], (BG)var0[2], (BG)var0[3]};
      var0[5] = new BG[]{(BG)var0[0], (BG)var0[1], (BG)var0[2], (BG)var0[3]};
      staticFieldsd25d445181413210921a2969c1bcd756 = var0;
   }
}
