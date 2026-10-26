package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum SG {
   private static short[] shortse5c26292bc063f57a586f786ce621980;
   private static boolean[] booleanse5c26292bc063f57a586f786ce621980;
   private static byte[] bytese5c26292bc063f57a586f786ce621980;
   public static Object[] staticFieldse5c26292bc063f57a586f786ce621980;
   public Object[] fieldse5c26292bc063f57a586f786ce621980;
   private static String[] stringse5c26292bc063f57a586f786ce621980;

   private void id_byte() {
      if (this.fieldse5c26292bc063f57a586f786ce621980 == null) {
         this.fieldse5c26292bc063f57a586f786ce621980 = new Object[1];
         Object[] var1 = this.fieldse5c26292bc063f57a586f786ce621980;
      }
   }

   private SG(String var3) {
      this.id_byte();
      this.fieldse5c26292bc063f57a586f786ce621980[0] = var3;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -534808603223142619L;
   }

   public static SG id_class(String var0) {
      for (SG var4 : values()) {
         if (var0.toLowerCase().contains("уровень лута: " + var4.id_class().toLowerCase())) {
            return var4;
         }
      }

      return null;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1850097398;
   }

   public String id_class() {
      return (String)this.fieldse5c26292bc063f57a586f786ce621980[0];
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{91, 6, 116, -78, -92, -108, -92, -75}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      stringse5c26292bc063f57a586f786ce621980 = new String[]{
         new String("LEGENDARY"),
         new String("Легендарный"),
         new String("ELITE"),
         new String("Элитный"),
         new String("RICH"),
         new String("Богатый"),
         new String("SOLID"),
         new String("Солидный"),
         new String("COMMON"),
         new String("Обычный")
      };
   }

   private static void id_throws() {
      bytese5c26292bc063f57a586f786ce621980 = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{new SG("Легендарный"), new SG("Элитный"), new SG("Богатый"), new SG("Солидный"), new SG("Обычный"), null};
      var0[5] = new SG[]{(SG)var0[0], (SG)var0[1], (SG)var0[2], (SG)var0[3], (SG)var0[4]};
      staticFieldse5c26292bc063f57a586f786ce621980 = var0;
   }

   private static void id_case() {
      shortse5c26292bc063f57a586f786ce621980 = new short[]{5, 0, 0, 0, 1, 2, 3, 4};
   }

   private static void id_private() {
      booleanse5c26292bc063f57a586f786ce621980 = new boolean[]{false, false, true, false, false, true, true, true};
   }
}
