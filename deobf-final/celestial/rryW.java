package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryW implements rryz_1 {
   private static short[] class_;
   private static String[] break_;

   @Override
   public void byte_() {
      String var1 = "Вы не можете добавить своё имя в чёрный список";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Duel Blacklist", var1, 2000));
      rrfu_3.byte_(var1);
   }

   private String byte_(String var1) {
      return "'" + var1 + "'";
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -186053926;
   }

   @Override
   public void class_(String var1) {
      String var2 = "'" + var1 + "' не найден в чёрном списке";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Duel Blacklist", var2, 2000));
      rrfu_3.byte_(var2);
   }

   @Override
   public void class_(String var1, boolean var2) {
      String var3 = this.byte_(var1) + (var2 ? " добавлен в чёрный список" : break_[1]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
         .class_((rrtO_2)(var2 ? new rrtQ_2("Duel Blacklist", var3, 2000) : new rrtx_3("Duel Blacklist", var3, 2000)));
      rrfu_3.byte_(var3);
   }

   @Override
   public void class_() {
      String var1 = "Чёрный список очищен";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtQ_2("Duel Blacklist", var1, 2000));
      rrfu_3.byte_(var1);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 58067428230058721L;
   }

   @Override
   public void break_(String var1, boolean var2) {
      String var3 = this.byte_(var1) + (var2 ? " удалён из чёрного списка" : break_[5]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
         .class_((rrtO_2)(var2 ? new rrtQ_2("Duel Blacklist", var3, 2000) : new rrtx_3("Duel Blacklist", var3, 2000)));
      rrfu_3.byte_(var3);
   }

   @Override
   public void break_() {
      String var1 = "Чёрный список пуст";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Duel Blacklist", var1, 2000));
      rrfu_3.byte_(var1);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{17, -6, 62, 50, 103, -56, -5, -23}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      class_ = new short[]{0, 2000, 2000, 0, 2000, 2000, 0, 2000, 0, 2000, 0, 2000, 0, 2000};
   }

   private static void protected_() {
      break_ = new String[]{
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
