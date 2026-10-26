package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwo_3 implements rrwK_2 {
   private static String[] id_class;
   private static boolean[] id_break;
   private static short[] id_byte;

   @Override
   public void id_byte(String var1) {
      this.id_class(var1, "добавлен", false);
   }

   private static void id_byte() {
      id_byte = new short[]{0, 0, 1500, 1500};
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4180519224472450342L;
   }

   public void id_class(String var1, String var2, boolean var3) {
      CreeperFarm var4 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().i();
      String var5 = "Конфиг " + this.id_case(var1) + " " + var2;
      rrfu_3.id_byte(var5);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
         .id_class((rrtO_2)(var3 ? new rrtx_3(var4.id_final(), var5, 1500) : new rrtQ_2(var4.id_final(), var5, 1500)));
   }

   @Override
   public void id_class(String var1) {
      this.id_class(var1, "загружен", false);
   }

   private static void id_class() {
      id_class = new String[]{new String("добавлен"), new String("удалён"), new String("загружен"), new String("сохранён"), new String("не существует")};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1216260960;
   }

   private static void id_break() {
      id_break = new boolean[]{false, false, false, false, true};
   }

   @Override
   public void id_break(String var1) {
      this.id_class(var1, "не существует", true);
   }

   @Override
   public void id_throws(String var1) {
      this.id_class(var1, "удалён", false);
   }

   public static String id_catch(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-76, -116, -33, 93, 55, 67, 123, -90}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String id_case(String var1) {
      return "'" + var1 + "'";
   }

   @Override
   public void id_protected(String var1) {
      this.id_class(var1, "сохранён", false);
   }
}
