package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmO_2 extends C_try {
   private static String[] id_break;
   private static boolean[] id_throws;
   private static short[] id_case;
   private static byte[] id_catch;

   public rrmO_2(C_case var1) {
      super(var1, "hclip");
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 879928206;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      var2.id_implements();
      rrmI_2.id_protected();
      if (var2.id_final()) {
         double var3 = var2.id_protected(Double.class);
         PX var5 = PJ.id_class((Float)((cb_3)b_.id_class[57]).id_break[45]);
         ((cb_3)b_.id_class[57])
            .id_int(
               ((cb_3)b_.id_class[57]).rx() + (double)var5.id_throws() * var3,
               ((cb_3)b_.id_class[57]).re(),
               ((cb_3)b_.id_class[57]).BO() + (double)var5.id_protected() * var3
            );
      }

      rrmI_2.id_protected();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6210606537066026893L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-16, 90, 65, -27, -79, 35, 15, 43}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      return Stream.empty();
   }

   private static void id_throws() {
      id_break = new String[]{new String("hclip"), new String("Команда для телепорта по XZ координате"), new String("> %s%s <значение>")};
   }

   private static void id_finally() {
      id_throws = new boolean[]{true, false, false, false, true};
   }

   @Override
   public List<String> id_catch() {
      String var1 = this.id_break().get(0);
      String var2 = (String)C_class.id_instanceof().id_protected.id_class[0];
      return List.of("> %s%s <значение>".formatted(var2, var1));
   }

   private static void id_extends() {
      id_case = new short[]{57, 45, 57, 57, 57, 57, 0};
   }

   @Override
   public String id_implements() {
      return "Команда для телепорта по XZ координате";
   }

   private static void id_protected() {
      id_catch = new byte[]{2};
   }
}
