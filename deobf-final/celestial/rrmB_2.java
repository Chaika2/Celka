package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmB_2 implements rruq_1 {
   private static String[] break_;
   public Object[] class_;
   private static boolean[] byte_;
   private static short[] protected_;

   private static void byte_() {
      byte_ = new boolean[]{true};
   }

   rrmB_2(rrua_1 var1) {
      this.protected_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(C_static var1) throws x_1 {
      String var2 = var1.extends_().replaceAll(",", "");
      rryk_1 var3 = ((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[0]).protected_(var2);
      if (var3 == null) {
         throw new k_1("Игрок '" + var2 + "' не найден в чёрном списке");
      } else {
         String var4 = var3.class_();
         if (var4 != null && !var4.isEmpty()) {
            ((rrua_1)this.class_[0]).case_("Заметка для игрока '" + var2 + "': " + rgF_2.RED + var4);
         } else {
            ((rrua_1)this.class_[0]).case_("Не найдено заметки для игрока '" + var2 + "'");
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -433064633265097390L;
   }

   private static void class_() {
      break_ = new String[]{new String(","), new String("")};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2856273;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-96, 14, -78, -86, 41, 27, -103, 74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      protected_ = new short[4];
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }
}
