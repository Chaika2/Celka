package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sX_2 extends C_try {
   private static boolean[] break_;
   private static short[] throws_;
   private static String[] case_;
   private static byte[] catch_;

   public sX_2(C_case var1) {
      super(var1, "come");
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 228638204;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      var2.class_(0);
      an_3 var3 = b_.catch_();
      if (var3 == null) {
         throw new k_1("Ваш игрок не найден");
      } else {
         ((C_case)this.class_[0]).import_().break_(new rS_2(var3.Bs()));
         this.case_("Идём");
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1601531151851025193L;
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) {
      return Stream.empty();
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{0, 1, 14, 58, 113, 15, -16, -74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      case_ = new String[]{
         new String("come"),
         new String("Ваш игрок не найден"),
         new String("Идём"),
         new String("Указывает Baritone направиться к вашей камере"),
         new String("Указывает Baritone направиться к вашей камере"),
         new String(""),
         new String("Это может быть полезно в чит клиентах, где FreeCamera не перемещает позицию игрока"),
         new String(""),
         new String("Использование:"),
         new String("> come")
      };
   }

   private static void finally_() {
      break_ = new boolean[]{true, false, false, false, true, true};
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList(
         "Указывает Baritone направиться к вашей камере",
         "",
         "Это может быть полезно в чит клиентах, где FreeCamera не перемещает позицию игрока",
         "",
         "Использование:",
         "> come"
      );
   }

   private static void extends_() {
      throws_ = new short[1];
   }

   @Override
   public boolean case_() {
      return true;
   }

   @Override
   public String implements_() {
      return "Указывает Baritone направиться к вашей камере";
   }

   private static void protected_() {
      catch_ = new byte[]{6, 2, 3, 4, 5};
   }
}
