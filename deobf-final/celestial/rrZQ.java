package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZQ implements rrZz_1 {
   private static short[] class_;
   private static String[] break_;

   @Override
   public void byte_() {
      String var1 = "Список друзей пуст";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Friends", var1, 2000));
      rrfu_3.byte_(var1);
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2019303308;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1125210007331517406L;
   }

   @Override
   public void class_() {
      String var1 = "Ник слишком короткий или слишком большой";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Friends", var1, 2000));
      rrfu_3.byte_(var1);
   }

   private String class_(rrZk_1 var1) {
      return "'" + var1.class_() + "'";
   }

   @Override
   public void class_(String var1) {
      String var2 = "'" + var1 + "' не найден друзьях";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Friends", var2, 2000));
      rrfu_3.byte_(var2);
   }

   @Override
   public void class_(rrZk_1 var1, boolean var2) {
      String var3 = this.class_(var1) + (var2 ? " добавлен в друзья" : break_[1]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
         .class_((rrtO_2)(var2 ? new rrtQ_2("Friends", var3, 2000) : new rrtx_3("Friends", var3, 2000)));
      rrfu_3.byte_(var3);
   }

   @Override
   public void break_() {
      String var1 = "Список друзей очищен";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtQ_2("Friends", var1, 2000));
      rrfu_3.byte_(var1);
   }

   @Override
   public void break_(rrZk_1 var1, boolean var2) {
      String var3 = this.class_(var1) + (var2 ? " удалён из друзей" : break_[5]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
         .class_((rrtO_2)(var2 ? new rrtQ_2("Friends", var3, 2000) : new rrtx_3("Friends", var3, 2000)));
      rrfu_3.byte_(var3);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{33, -82, -47, -55, -21, 36, 77, -2}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      break_ = new String[]{
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

   private static void case_() {
      class_ = new short[]{0, 2000, 2000, 0, 2000, 2000, 0, 2000, 0, 2000, 0, 2000, 0, 2000, 0, 2000};
   }

   @Override
   public void protected_() {
      String var1 = "Вы не можете добавить себя в друзья";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Friends", var1, 2000));
      rrfu_3.byte_(var1);
   }
}
