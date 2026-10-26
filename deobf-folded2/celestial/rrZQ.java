package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZQ implements rrZz_1 {
   private static short[] id_class;
   private static String[] id_break;

   @Override
   public void id_byte() {
      String var1 = "Список друзей пуст";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtx_3("Friends", var1, 2000));
      rrfu_3.id_byte(var1);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2019303308;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1125210007331517406L;
   }

   @Override
   public void id_class() {
      String var1 = "Ник слишком короткий или слишком большой";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtx_3("Friends", var1, 2000));
      rrfu_3.id_byte(var1);
   }

   private String id_class(rrZk_1 var1) {
      return "'" + var1.id_class() + "'";
   }

   @Override
   public void id_class(String var1) {
      String var2 = "'" + var1 + "' не найден друзьях";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtx_3("Friends", var2, 2000));
      rrfu_3.id_byte(var2);
   }

   @Override
   public void id_class(rrZk_1 var1, boolean var2) {
      String var3 = this.id_class(var1) + (var2 ? " добавлен в друзья" : id_break[1]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
         .id_class((rrtO_2)(var2 ? new rrtQ_2("Friends", var3, 2000) : new rrtx_3("Friends", var3, 2000)));
      rrfu_3.id_byte(var3);
   }

   @Override
   public void id_break() {
      String var1 = "Список друзей очищен";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtQ_2("Friends", var1, 2000));
      rrfu_3.id_byte(var1);
   }

   @Override
   public void id_break(rrZk_1 var1, boolean var2) {
      String var3 = this.id_class(var1) + (var2 ? " удалён из друзей" : id_break[5]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
         .id_class((rrtO_2)(var2 ? new rrtQ_2("Friends", var3, 2000) : new rrtx_3("Friends", var3, 2000)));
      rrfu_3.id_byte(var3);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{33, -82, -47, -55, -21, 36, 77, -2}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_break = new String[]{
         new String(" добавлен в друзья"),
         new String(" уже есть в друзьях"),
         new String("Friends"),
         new String("Friends"),
         new String(" удалён из друзей"),
         new String(" не найден в друзьях"),
         new String("Friends"),
         new String("Friends"),
         new String("Список друзей очищен"),
         new String("Friends"),
         new String("Список друзей пуст"),
         new String("Friends"),
         new String("Friends"),
         new String("Ник слишком короткий или слишком большой"),
         new String("Friends"),
         new String("Вы не можете добавить себя в друзья"),
         new String("Friends")
      };
   }

   private static void id_case() {
      id_class = new short[]{0, 2000, 2000, 0, 2000, 2000, 0, 2000, 0, 2000, 0, 2000, 0, 2000, 0, 2000};
   }

   @Override
   public void id_protected() {
      String var1 = "Вы не можете добавить себя в друзья";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtx_3("Friends", var1, 2000));
      rrfu_3.id_byte(var1);
   }
}
