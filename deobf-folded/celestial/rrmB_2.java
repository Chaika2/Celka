package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmB_2 implements rruq_1 {
   private static String[] id_break;
   public Object[] id_class;
   private static boolean[] id_byte;
   private static short[] id_protected;

   private static void id_byte() {
      id_byte = new boolean[]{true};
   }

   rrmB_2(rrua_1 var1) {
      this.id_protected();
      this.id_class[id_protected[0]] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(C_static var1) throws x_1 {
      String var2 = var1.id_extends().replaceAll(id_break[0], id_break[1]);
      rryk_1 var3 = ((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[id_protected[1]]).id_protected(var2);
      if (var3 == null) {
         throw new k_1("Игрок '" + var2 + "' не найден в чёрном списке");
      } else {
         String var4 = var3.id_class();
         if (var4 != null && !var4.isEmpty()) {
            ((rrua_1)this.id_class[id_protected[3]]).id_case("Заметка для игрока '" + var2 + "': " + rgF_2.RED + var4);
         } else {
            ((rrua_1)this.id_class[id_protected[2]]).id_case("Не найдено заметки для игрока '" + var2 + "'");
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -433064633265097390L;
   }

   private static void id_class() {
      id_break = new String[]{new String(","), new String("")};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2856273;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-96, 14, -78, -86, 41, 27, -103, 74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_protected = new short[4];
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }
}
