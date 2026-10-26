package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZU implements rrZp_1 {
   private static short[] id_class;
   private static String[] id_break;

   @Override
   public void id_byte(rrIX var1) {
      this.id_class(var1, id_break[1]);
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{107, 39, 15, -46, -21, -88, -74, 28}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 321226379;
   }

   public void id_class(rrIX var1, String var2) {
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[0]])
         .id_class(new rrtQ_2(id_break[4], "Конфиг " + this.id_throws(var1) + " " + var2, 1500));
   }

   private static void id_class() {
      id_class = new short[]{0, 1500};
   }

   @Override
   public void id_class(rrIX var1) {
      this.id_class(var1, id_break[3]);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6722043824286251716L;
   }

   private static void id_break() {
      id_break = new String[]{new String("добавлен"), new String("удалён"), new String("загружен"), new String("сохранён"), new String("Configs")};
   }

   @Override
   public void id_break(rrIX var1) {
      this.id_class(var1, id_break[2]);
   }

   public String id_throws(rrIX var1) {
      return "'" + var1.id_class() + "'";
   }

   @Override
   public void id_protected(rrIX var1) {
      this.id_class(var1, id_break[0]);
   }
}
