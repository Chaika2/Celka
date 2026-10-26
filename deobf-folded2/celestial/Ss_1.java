package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum Ss_1 {
   public static Object[] staticFieldsfbe4174146d2323d9047521d90bbb1bc;
   private static byte[] bytesfbe4174146d2323d9047521d90bbb1bc;
   private static String[] stringsfbe4174146d2323d9047521d90bbb1bc;
   private static boolean[] booleansfbe4174146d2323d9047521d90bbb1bc;
   public Object[] fieldsfbe4174146d2323d9047521d90bbb1bc;
   private static short[] shortsfbe4174146d2323d9047521d90bbb1bc;

   private static void id_byte() {
      shortsfbe4174146d2323d9047521d90bbb1bc = new short[]{5, 0, 0, 0, 1, 2, 3, 4};
   }

   private Ss_1(String var3) {
      this.id_private();
      this.fieldsfbe4174146d2323d9047521d90bbb1bc[0] = var3;
   }

   static {
      ntfClinit();
   }

   public String id_class() {
      return (String)this.fieldsfbe4174146d2323d9047521d90bbb1bc[0];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8884106455919497635L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1553302234;
   }

   public static Ss_1 id_class(String var0) {
      for (Ss_1 var4 : values()) {
         if (var0.toLowerCase().contains("уровень лута: " + var4.id_class().toLowerCase())) {
            return var4;
         }
      }

      return null;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{76, 106, -96, -3, -23, 111, 51, 61}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      bytesfbe4174146d2323d9047521d90bbb1bc = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new Ss_1("Легендарный"), new Ss_1("Элитный"), new Ss_1("Богатый"), new Ss_1("Солидный"), new Ss_1("Обычный"), null};
      var0[5] = new Ss_1[]{(Ss_1)var0[0], (Ss_1)var0[1], (Ss_1)var0[2], (Ss_1)var0[3], (Ss_1)var0[4]};
      staticFieldsfbe4174146d2323d9047521d90bbb1bc = var0;
   }

   private static void id_catch() {
      stringsfbe4174146d2323d9047521d90bbb1bc = new String[]{
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

   private static void id_protected() {
      booleansfbe4174146d2323d9047521d90bbb1bc = new boolean[]{false, false, true, false, false, true, true, true};
   }

   private void id_private() {
      if (this.fieldsfbe4174146d2323d9047521d90bbb1bc == null) {
         this.fieldsfbe4174146d2323d9047521d90bbb1bc = new Object[1];
         Object[] var1 = this.fieldsfbe4174146d2323d9047521d90bbb1bc;
      }
   }
}
