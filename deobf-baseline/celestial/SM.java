package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum SM {
   public static Object[] staticFieldsb13e79bae31f3ba4bc6e5cebabe1a91c;
   private static short[] shortsb13e79bae31f3ba4bc6e5cebabe1a91c;
   private static String[] stringsb13e79bae31f3ba4bc6e5cebabe1a91c;
   public Object[] fieldsb13e79bae31f3ba4bc6e5cebabe1a91c;
   private static byte[] bytesb13e79bae31f3ba4bc6e5cebabe1a91c;
   private static boolean[] booleansb13e79bae31f3ba4bc6e5cebabe1a91c;

   private static void id_byte() {
      shortsb13e79bae31f3ba4bc6e5cebabe1a91c = new short[]{5, 0, 0, 0, 1, 2, 3, 4};
   }

   private SM(String var3) {
      this.id_protected();
      this.fieldsb13e79bae31f3ba4bc6e5cebabe1a91c[shortsb13e79bae31f3ba4bc6e5cebabe1a91c[2]] = var3;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6268493204329362969L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 517177143;
   }

   public String id_class() {
      return (String)this.fieldsb13e79bae31f3ba4bc6e5cebabe1a91c[shortsb13e79bae31f3ba4bc6e5cebabe1a91c[1]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-30, -19, 10, 46, -109, -101, 28, -128}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static SM id_break(String var0) {
      SM[] var1 = values();
      int var2 = var1.length;

      for (int var3 = booleansb13e79bae31f3ba4bc6e5cebabe1a91c[0]; var3 < var2; var3++) {
         SM var4 = var1[var3];
         if (var0.toLowerCase().contains("уровень лута: " + var4.id_class().toLowerCase())) {
            return var4;
         }
      }

      return null;
   }

   private static void id_break() {
      stringsb13e79bae31f3ba4bc6e5cebabe1a91c = new String[]{
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
      Object[] var0 = new Object[]{
         new SM(stringsb13e79bae31f3ba4bc6e5cebabe1a91c[1]),
         new SM(stringsb13e79bae31f3ba4bc6e5cebabe1a91c[3]),
         new SM(stringsb13e79bae31f3ba4bc6e5cebabe1a91c[5]),
         new SM(stringsb13e79bae31f3ba4bc6e5cebabe1a91c[7]),
         new SM(stringsb13e79bae31f3ba4bc6e5cebabe1a91c[9]),
         null
      };
      var0[5] = new SM[]{(SM)var0[0], (SM)var0[1], (SM)var0[2], (SM)var0[3], (SM)var0[4]};
      staticFieldsb13e79bae31f3ba4bc6e5cebabe1a91c = var0;
   }

   private static void id_case() {
      bytesb13e79bae31f3ba4bc6e5cebabe1a91c = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
   }

   private void id_protected() {
      if (this.fieldsb13e79bae31f3ba4bc6e5cebabe1a91c == null) {
         this.fieldsb13e79bae31f3ba4bc6e5cebabe1a91c = new Object[booleansb13e79bae31f3ba4bc6e5cebabe1a91c[7]];
         Object[] var1 = this.fieldsb13e79bae31f3ba4bc6e5cebabe1a91c;
      }
   }

   private static void id_private() {
      booleansb13e79bae31f3ba4bc6e5cebabe1a91c = new boolean[]{false, false, true, false, false, true, true, true};
   }
}
