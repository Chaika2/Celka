package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum BR {
   public Object[] fields106ab800b639370da43e6ac2a2275f07;
   private static boolean[] booleans106ab800b639370da43e6ac2a2275f07;
   private static byte[] bytes106ab800b639370da43e6ac2a2275f07;
   private static String[] strings106ab800b639370da43e6ac2a2275f07;
   public static Object[] staticFields106ab800b639370da43e6ac2a2275f07;
   private static short[] shorts106ab800b639370da43e6ac2a2275f07;

   private void id_byte() {
      if (this.fields106ab800b639370da43e6ac2a2275f07 == null) {
         this.fields106ab800b639370da43e6ac2a2275f07 = new Object[1];
         Object[] var1 = this.fields106ab800b639370da43e6ac2a2275f07;
      }
   }

   private BR(String var3) {
      this.id_byte();
      this.fields106ab800b639370da43e6ac2a2275f07[0] = var3;
   }

   static {
      ntfClinit();
   }

   public static BR id_class(String var0) {
      for (BR var4 : values()) {
         if (var0.toLowerCase().contains("уровень лута: " + var4.id_class().toLowerCase())) {
            return var4;
         }
      }

      return null;
   }

   public String id_class() {
      return (String)this.fields106ab800b639370da43e6ac2a2275f07[0];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1684518924;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1784411811303679388L;
   }

   private static void id_break() {
      bytes106ab800b639370da43e6ac2a2275f07 = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-61, 15, 90, 59, -48, 88, 84, 57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      shorts106ab800b639370da43e6ac2a2275f07 = new short[]{5, 0, 0, 0, 1, 2, 3, 4};
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{new BR("Легендарный"), new BR("Элитный"), new BR("Богатый"), new BR("Солидный"), new BR("Обычный"), null};
      var0[5] = new BR[]{(BR)var0[0], (BR)var0[1], (BR)var0[2], (BR)var0[3], (BR)var0[4]};
      staticFields106ab800b639370da43e6ac2a2275f07 = var0;
   }

   private static void id_case() {
      booleans106ab800b639370da43e6ac2a2275f07 = new boolean[]{false, false, true, false, false, true, true, true};
   }

   private static void id_private() {
      strings106ab800b639370da43e6ac2a2275f07 = new String[]{
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
}
