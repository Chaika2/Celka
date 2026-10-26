package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum BU {
   private static boolean[] booleanse462c7c8b20936b69781915dd77e35b5;
   private static byte[] bytese462c7c8b20936b69781915dd77e35b5;
   private static String[] stringse462c7c8b20936b69781915dd77e35b5;
   private static short[] shortse462c7c8b20936b69781915dd77e35b5;
   public static Object[] staticFieldse462c7c8b20936b69781915dd77e35b5;
   public Object[] fieldse462c7c8b20936b69781915dd77e35b5;

   private void id_byte() {
      if (this.fieldse462c7c8b20936b69781915dd77e35b5 == null) {
         this.fieldse462c7c8b20936b69781915dd77e35b5 = new Object[1];
         Object[] var1 = this.fieldse462c7c8b20936b69781915dd77e35b5;
      }
   }

   private BU(String var3) {
      this.id_byte();
      this.fieldse462c7c8b20936b69781915dd77e35b5[shortse462c7c8b20936b69781915dd77e35b5[2]] = var3;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -336273553;
   }

   public String id_class() {
      return (String)this.fieldse462c7c8b20936b69781915dd77e35b5[shortse462c7c8b20936b69781915dd77e35b5[1]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1198338614388297684L;
   }

   public static BU id_class(String var0) {
      BU[] var1 = values();
      int var2 = var1.length;

      for (int var3 = booleanse462c7c8b20936b69781915dd77e35b5[0]; var3 < var2; var3++) {
         BU var4 = var1[var3];
         if (var0.toLowerCase().contains("уровень лута: " + var4.id_class().toLowerCase())) {
            return var4;
         }
      }

      return null;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-104, -94, 91, -84, 44, -16, -127, 51}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      Object[] var0 = new Object[]{
         new BU(stringse462c7c8b20936b69781915dd77e35b5[1]),
         new BU(stringse462c7c8b20936b69781915dd77e35b5[3]),
         new BU(stringse462c7c8b20936b69781915dd77e35b5[5]),
         new BU(stringse462c7c8b20936b69781915dd77e35b5[7]),
         new BU(stringse462c7c8b20936b69781915dd77e35b5[9]),
         null
      };
      var0[5] = new BU[]{(BU)var0[0], (BU)var0[1], (BU)var0[2], (BU)var0[3], (BU)var0[4]};
      staticFieldse462c7c8b20936b69781915dd77e35b5 = var0;
   }

   private static void id_throws() {
      shortse462c7c8b20936b69781915dd77e35b5 = new short[]{5, 0, 0, 0, 1, 2, 3, 4};
   }

   private static void id_catch() {
      booleanse462c7c8b20936b69781915dd77e35b5 = new boolean[]{false, false, true, false, false, true, true, true};
   }

   private static void id_case() {
      bytese462c7c8b20936b69781915dd77e35b5 = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
   }

   private static void id_private() {
      stringse462c7c8b20936b69781915dd77e35b5 = new String[]{
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
