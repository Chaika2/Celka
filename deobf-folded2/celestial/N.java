package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class N extends x_1 {
   public Object[] id_class;
   private static String[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;

   private static void id_byte() {
      id_protected = new boolean[]{true, false, true};
   }

   public N(String var1) {
      super(String.format("Команда не найдена: %s", var1));
      this.id_protected();
      this.id_class[0] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(C_interface var1, List<C_import> var2) {
      PP.a_.id_case(this.getMessage());
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 357345980578508876L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{0, -128, -86, -73, -100, 14, -97, 65}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_byte = new short[1];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1862701993;
   }

   private static void id_break() {
      id_break = new String[]{new String("Команда не найдена: %s")};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }
}
