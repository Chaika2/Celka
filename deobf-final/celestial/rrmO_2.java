package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmO_2 extends C_try {
   private static String[] break_;
   private static boolean[] throws_;
   private static short[] case_;
   private static byte[] catch_;

   public rrmO_2(C_case var1) {
      super(var1, "hclip");
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 879928206;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      var2.implements_();
      rrmI_2.protected_();
      if (var2.final_()) {
         double var3 = var2.protected_(Double.class);
         PX var5 = PJ.class_((Float)((cb_3)b_.class_[57]).break_[45]);
         ((cb_3)b_.class_[57])
            .int_(
               ((cb_3)b_.class_[57]).rx() + (double)var5.throws_() * var3,
               ((cb_3)b_.class_[57]).re(),
               ((cb_3)b_.class_[57]).BO() + (double)var5.protected_() * var3
            );
      }

      rrmI_2.protected_();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6210606537066026893L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-16, 90, 65, -27, -79, 35, 15, 43}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) throws x_1 {
      return Stream.empty();
   }

   private static void throws_() {
      break_ = new String[]{new String("hclip"), new String("Команда для телепорта по XZ координате"), new String("> %s%s <значение>")};
   }

   private static void finally_() {
      throws_ = new boolean[]{true, false, false, false, true};
   }

   @Override
   public List<String> catch_() {
      String var1 = this.break_().get(0);
      String var2 = (String)C_class.instanceof_().protected_.class_[0];
      return List.of("> %s%s <значение>".formatted(var2, var1));
   }

   private static void extends_() {
      case_ = new short[]{57, 45, 57, 57, 57, 57, 0};
   }

   @Override
   public String implements_() {
      return "Команда для телепорта по XZ координате";
   }

   private static void protected_() {
      catch_ = new byte[]{2};
   }
}
