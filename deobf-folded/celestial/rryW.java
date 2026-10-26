package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryW implements rryz_1 {
   private static short[] id_class;
   private static String[] id_break;

   @Override
   public void id_byte() {
      String var1 = id_break[13];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[12]]).id_class(new rrtx_3(id_break[14], var1, 2000));
      rrfu_3.id_byte(var1);
   }

   private String id_byte(String var1) {
      return "'" + var1 + "'";
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -186053926;
   }

   @Override
   public void id_class(String var1) {
      String var2 = "'" + var1 + "' не найден в чёрном списке";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[10]]).id_class(new rrtx_3(id_break[12], var2, 2000));
      rrfu_3.id_byte(var2);
   }

   @Override
   public void id_class(String var1, boolean var2) {
      String var3 = this.id_byte(var1) + (var2 ? id_break[0] : id_break[1]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[0]])
         .id_class((rrtO_2)(var2 ? new rrtQ_2(id_break[2], var3, 2000) : new rrtx_3(id_break[3], var3, 2000)));
      rrfu_3.id_byte(var3);
   }

   @Override
   public void id_class() {
      String var1 = id_break[8];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[6]]).id_class(new rrtQ_2(id_break[9], var1, 2000));
      rrfu_3.id_byte(var1);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 58067428230058721L;
   }

   @Override
   public void id_break(String var1, boolean var2) {
      String var3 = this.id_byte(var1) + (var2 ? id_break[4] : id_break[5]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[3]])
         .id_class((rrtO_2)(var2 ? new rrtQ_2(id_break[6], var3, 2000) : new rrtx_3(id_break[7], var3, 2000)));
      rrfu_3.id_byte(var3);
   }

   @Override
   public void id_break() {
      String var1 = id_break[10];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[8]]).id_class(new rrtx_3(id_break[11], var1, 2000));
      rrfu_3.id_byte(var1);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{17, -6, 62, 50, 103, -56, -5, -23}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_class = new short[]{0, 2000, 2000, 0, 2000, 2000, 0, 2000, 0, 2000, 0, 2000, 0, 2000};
   }

   private static void id_protected() {
      id_break = new String[]{
         new String(" добавлен в чёрный список"),
         new String(" уже есть в чёрном списке"),
         new String("Duel Blacklist"),
         new String("Duel Blacklist"),
         new String(" удалён из чёрного списка"),
         new String(" не найден в чёрном списке"),
         new String("Duel Blacklist"),
         new String("Duel Blacklist"),
         new String("Чёрный список очищен"),
         new String("Duel Blacklist"),
         new String("Чёрный список пуст"),
         new String("Duel Blacklist"),
         new String("Duel Blacklist"),
         new String("Вы не можете добавить своё имя в чёрный список"),
         new String("Duel Blacklist")
      };
   }
}
