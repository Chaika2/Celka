package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class su_3 extends C_try {
   private static short[] throws_;
   private static boolean[] case_;
   private static byte[] catch_;
   private static String[] private_;
   public Object[] break_;

   public su_3(sN_2 var1, C_case var2, String[] var3, boolean... var4) {
      super(var2, var3);
      this.protected_();
      this.break_[0] = var4;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 747256742762927287L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1775049014;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      this.protected_();
      var2.class_(0);
      if (((boolean[])this.break_[0])[0]) {
         throw new k_1("Уже на паузе");
      } else {
         ((boolean[])this.break_[0])[0] = true;
         this.case_("Приостановлено");
      }
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) {
      return Stream.empty();
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-106, 25, 48, -51, -128, -25, -16, 2}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      catch_ = new byte[]{6, 2, 3, 4, 5};
   }

   private static void finally_() {
      case_ = new boolean[]{false, false, false, true, false, true, true, true};
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList(
         "Команда \"pause\" устанавливает баритон на паузу.",
         "",
         "Это можно использовать для приостановки прокладки пути, строительства, следования, чего угодно. Однократное использование команды resume запустит его снова!",
         "",
         "Использование:",
         "> pause"
      );
   }

   private static void extends_() {
      throws_ = new short[3];
   }

   @Override
   public boolean case_() {
      return true;
   }

   @Override
   public String implements_() {
      return "Приостанавливает баритон до тех пор, пока вы не воспользуетесь функцией возобновления";
   }

   private void protected_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }

   private static void native_() {
      private_ = new String[]{
         new String("Уже на паузе"),
         new String("Приостановлено"),
         new String("Приостанавливает баритон до тех пор, пока вы не воспользуетесь функцией возобновления"),
         new String("Команда \"pause\" устанавливает баритон на паузу."),
         new String(""),
         new String(
            "Это можно использовать для приостановки прокладки пути, строительства, следования, чего угодно. Однократное использование команды resume запустит его снова!"
         ),
         new String(""),
         new String("Использование:"),
         new String("> pause")
      };
   }
}
