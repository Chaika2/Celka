package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvf_1 implements rrvI {
   private static short[] id_class;
   private static String[] id_break;

   private static void id_byte() {
      id_break = new String[]{
         new String("Все бинды были сброшены"), new String("Binds"), new String("Binds"), new String("Нет забинженных модулей"), new String("Binds")
      };
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(Module var1) {
      String var2 = "Бинд модуля " + this.id_break(var1) + " сброшен";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[2]]).id_class(new rrtQ_2(id_break[2], var2, 2000));
      rrfu_3.id_byte(var2);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7144229370063808129L;
   }

   @Override
   public void id_class() {
      String var1 = id_break[0];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[0]]).id_class(new rrtQ_2(id_break[1], var1, 2000));
      rrfu_3.id_byte(var1);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1907661388;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-48, 47, -93, -91, 114, -116, -91, -57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private String id_break(Module var1) {
      return "'" + var1.id_final() + "'";
   }

   @Override
   public void id_break() {
      String var1 = id_break[3];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[4]]).id_class(new rrtx_3(id_break[4], var1, 2000));
      rrfu_3.id_byte(var1);
   }

   private static void id_protected() {
      id_class = new short[]{0, 2000, 0, 2000, 0, 2000};
   }
}
