package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sK_2 extends C_try {
   private static short[] break_;
   private static byte[] throws_;
   private static String[] case_;
   private static boolean[] catch_;

   public sK_2(C_case var1) {
      super(var1, "pickup");
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3627153102960250525L;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      HashSet var3 = new HashSet();

      while (var2.final_()) {
         rdb_3 var4 = var2.break_((P)P.staticFieldsee62191719013ce696dd0417ea84d4fd[0]);
         var3.add(var4);
      }

      if (var3.isEmpty()) {
         ((C_case)this.class_[0]).public_().class_(var0 -> true);
         this.case_("Собираем все предметы");
      } else {
         ((C_case)this.class_[0]).public_().class_(var1x -> var3.contains(var1x.break_()));
         this.case_("Собираем эти предметы:");
         var3.stream().map(rVL.for_::break_).map(rqO_2::toString).forEach(this::case_);
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -781090867;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{70, 6, 41, -35, 0, 8, -14, 67}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) throws x_1 {
      while (var2.break_(2)) {
         if (var2.byte_((P)P.staticFieldsee62191719013ce696dd0417ea84d4fd[0]) == null) {
            return Stream.empty();
         }

         var2.throws_();
      }

      return var2.class_((P)P.staticFieldsee62191719013ce696dd0417ea84d4fd[0]);
   }

   private static void throws_() {
      case_ = new String[]{
         new String("pickup"),
         new String("Собираем все предметы"),
         new String("Собираем эти предметы:"),
         new String("Подбирать предметы"),
         new String("Usage:"),
         new String("> pickup - Подбирать все предметы"),
         new String("> pickup <item1> <item2> <...> - Подбирать только указанные предметы")
      };
   }

   private static void finally_() {
      throws_ = new byte[]{2, 3, 2};
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList("Usage:", "> pickup - Подбирать все предметы", "> pickup <item1> <item2> <...> - Подбирать только указанные предметы");
   }

   private static void extends_() {
      catch_ = new boolean[]{true, false, false, true, true};
   }

   @Override
   public String implements_() {
      return "Подбирать предметы";
   }

   private static void protected_() {
      break_ = new short[5];
   }
}
