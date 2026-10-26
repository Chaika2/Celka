package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class so_3 extends C_try {
   private static boolean[] break_;
   private static String[] throws_;
   private static short[] case_;
   private static byte[] catch_;

   public so_3(C_case var1) {
      super(var1, "path");
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      rc_3 var3 = ((C_case)this.class_[0]).import_();
      var2.class_(0);
      ((So_1)So_1.staticFields4d15df505e473c14b11aa564ea558cfe[0]).class_((Ps_1)this.class_[1]);
      var3.implements_();
      this.case_("Прокладывание пути...");
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6576350284255742176L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1707134618;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{115, -46, 24, -23, 68, 96, -71, -48}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) throws x_1 {
      return Stream.empty();
   }

   private static void throws_() {
      throws_ = new String[]{
         new String("path"),
         new String("Прокладывание пути..."),
         new String("Двигаться к цели (Goal)"),
         new String("Команда \"path\" указывает Baritone направиться к текущей цели (Goal)."),
         new String(""),
         new String("Использование:"),
         new String("> path - Начать идти к цели.")
      };
   }

   private static void finally_() {
      case_ = new short[]{0, 0, 1};
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList("Команда \"path\" указывает Baritone направиться к текущей цели (Goal).", "", "Использование:", "> path - Начать идти к цели.");
   }

   private static void extends_() {
      catch_ = new byte[]{4, 2, 3};
   }

   @Override
   public boolean case_() {
      return true;
   }

   @Override
   public String implements_() {
      return "Двигаться к цели (Goal)";
   }

   private static void protected_() {
      break_ = new boolean[]{true, false, false, false, true, true};
   }
}
