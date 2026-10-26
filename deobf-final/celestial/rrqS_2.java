package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrqS_2 {
   ;
   private static boolean[] booleans76a63d849f9636f9a8b567c1e8edd09e;
   private static short[] shorts76a63d849f9636f9a8b567c1e8edd09e;
   private static String[] strings76a63d849f9636f9a8b567c1e8edd09e;
   public static Object[] staticFields76a63d849f9636f9a8b567c1e8edd09e;
   public Object[] fields76a63d849f9636f9a8b567c1e8edd09e;
   private static byte[] bytes76a63d849f9636f9a8b567c1e8edd09e;

   private static void byte_() {
      booleans76a63d849f9636f9a8b567c1e8edd09e = new boolean[]{false, true, false, false, true, true};
   }

   private rrqS_2(rgP_2 var3) {
      this.protected_();
      this.fields76a63d849f9636f9a8b567c1e8edd09e[0] = var3;
      String var9 = var3.getString();
      this.fields76a63d849f9636f9a8b567c1e8edd09e[1] = var9;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-25, -76, -18, -2, 18, -34, 15, 20}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -769989547;
   }

   public rgP_2 class_() {
      return (rgP_2)this.fields76a63d849f9636f9a8b567c1e8edd09e[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1060233937078267902L;
   }

   public String break_() {
      return (String)this.fields76a63d849f9636f9a8b567c1e8edd09e[1];
   }

   private static void throws_() {
      Object[] var0 = new Object[]{
         new rrqS_2(rrfu_3.class_().break_(rVa_1.class_("#00ff00"), rVa_1.class_("#7fff7f")).class_("Активен").break_()),
         new rrqS_2(rrfu_3.class_().break_(rVa_1.class_("#ff0000"), rVa_1.class_("#ff7f7f")).class_("В спеке").break_()),
         new rrqS_2(rrfu_3.class_().break_(rVa_1.class_("#ff0000"), rVa_1.class_("#ff7f7f")).class_("Рядом").break_()),
         new rrqS_2(rrfu_3.class_().break_(rVa_1.class_("#ffd700"), rVa_1.class_("#ffddaf")).class_("GM3").break_()),
         new rrqS_2(rrfu_3.class_().break_(rVa_1.class_("#ff0000"), rVa_1.class_("#ff7f7f")).class_("Вышел").break_()),
         new rrqS_2(rrfu_3.class_().break_(rVa_1.class_("#ff0000"), rVa_1.class_("#ff7f7f")).class_("Неизвестно").break_()),
         null
      };
      var0[6] = new rrqS_2[]{(rrqS_2)var0[0], (rrqS_2)var0[1], (rrqS_2)var0[2], (rrqS_2)var0[3], (rrqS_2)var0[4], (rrqS_2)var0[5]};
      staticFields76a63d849f9636f9a8b567c1e8edd09e = var0;
   }

   private static void case_() {
      bytes76a63d849f9636f9a8b567c1e8edd09e = new byte[]{6, 2, 3, 4, 5, 2, 2, 3, 3, 4, 4, 5, 5, 6, 2, 7};
   }

   private static void implements_() {
      strings76a63d849f9636f9a8b567c1e8edd09e = new String[]{
         new String("ACTIVE"),
         new String("#00ff00"),
         new String("#7fff7f"),
         new String("Активен"),
         new String("VANISH"),
         new String("#ff0000"),
         new String("#ff7f7f"),
         new String("В спеке"),
         new String("NEAR"),
         new String("#ff0000"),
         new String("#ff7f7f"),
         new String("Рядом"),
         new String("SPECTATOR"),
         new String("#ffd700"),
         new String("#ffddaf"),
         new String("GM3"),
         new String("LEFT_FROM_SERVER"),
         new String("#ff0000"),
         new String("#ff7f7f"),
         new String("Вышел"),
         new String("UNKNOWN"),
         new String("#ff0000"),
         new String("#ff7f7f"),
         new String("Неизвестно")
      };
   }

   private void protected_() {
      if (this.fields76a63d849f9636f9a8b567c1e8edd09e == null) {
         this.fields76a63d849f9636f9a8b567c1e8edd09e = new Object[2];
      }
   }

   private static void private_() {
      shorts76a63d849f9636f9a8b567c1e8edd09e = new short[]{6, 0, 1, 0, 1, 0, 1, 2, 3, 4, 5};
   }
}
