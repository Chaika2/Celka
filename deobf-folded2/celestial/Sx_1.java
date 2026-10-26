package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum Sx_1 {
   private static short[] shorts367340c5841f3ba4814e59f96eff4d12;
   private static String[] strings367340c5841f3ba4814e59f96eff4d12;
   public static Object[] staticFields367340c5841f3ba4814e59f96eff4d12;
   private static boolean[] booleans367340c5841f3ba4814e59f96eff4d12;
   public Object[] fields367340c5841f3ba4814e59f96eff4d12;
   private static byte[] bytes367340c5841f3ba4814e59f96eff4d12;

   private void id_byte() {
      if (this.fields367340c5841f3ba4814e59f96eff4d12 == null) {
         this.fields367340c5841f3ba4814e59f96eff4d12 = new Object[1];
         Object[] var1 = this.fields367340c5841f3ba4814e59f96eff4d12;
      }
   }

   private Sx_1(String var3) {
      this.id_byte();
      this.fields367340c5841f3ba4814e59f96eff4d12[0] = var3;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1076127266;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5848692409660372504L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{5, 79, -107, -73, -115, 77, -79, -56}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String id_class() {
      return (String)this.fields367340c5841f3ba4814e59f96eff4d12[0];
   }

   private static void id_break() {
      booleans367340c5841f3ba4814e59f96eff4d12 = new boolean[]{false, false, true, false, false, true, true, true};
   }

   public static Sx_1 id_break(String var0) {
      for (Sx_1 var4 : values()) {
         if (var0.toLowerCase().contains(var4.id_class().toLowerCase())) {
            return var4;
         }
      }

      return null;
   }

   private static void id_catch() {
      shorts367340c5841f3ba4814e59f96eff4d12 = new short[]{5, 0, 0, 0, 1, 2, 3, 4};
   }

   private static void id_case() {
      strings367340c5841f3ba4814e59f96eff4d12 = new String[]{
         new String("LEGENDARY"),
         new String("Легендарный"),
         new String("MYTHIC"),
         new String("Мифический"),
         new String("EPIC"),
         new String("Эпический"),
         new String("RARE"),
         new String("Редкий"),
         new String("COMMON"),
         new String("Обычный")
      };
   }

   private static void id_protected() {
      bytes367340c5841f3ba4814e59f96eff4d12 = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
   }

   private static void id_private() {
      Object[] var0 = new Object[]{new Sx_1("Легендарный"), new Sx_1("Мифический"), new Sx_1("Эпический"), new Sx_1("Редкий"), new Sx_1("Обычный"), null};
      var0[5] = new Sx_1[]{(Sx_1)var0[0], (Sx_1)var0[1], (Sx_1)var0[2], (Sx_1)var0[3], (Sx_1)var0[4]};
      staticFields367340c5841f3ba4814e59f96eff4d12 = var0;
   }
}
