package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class C_try implements C_interface {
   private static boolean[] id_break;
   private static short[] id_throws;
   private static byte[] id_case;
   private static String[] id_catch;
   public Object[] id_class;

   @Override
   public x_1 id_byte() {
      return null;
   }

   public C_try(C_case var1, String... var2) {
      this.id_native();
      List var7 = Stream.of(var2).map(var0 -> var0.toLowerCase(Locale.US)).toList();
      this.id_class[2] = var7;
      this.id_class[0] = var1;
      Ps_1 var9 = var1.id_throw();
      this.id_class[1] = var9;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{67, -56, -68, 69, -16, 46, -88, 16}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1153100300;
   }

   @Override
   public rVi_1 id_class() {
      rVi_1 var1 = new rVe_1("Наведите мышь, чтобы увидеть подробное описание команды ")
         .id_class(new rgN_2("'" + this.id_break().get(0) + "'").id_break(rgF_2.RED));
      rVe_1 var2 = new rVe_1(this.id_implements() + "\n\n" + String.join("\n", this.id_catch()));
      var1.id_class(var1.id_class().id_class(rgF_2.GRAY));
      var2.id_class(var2.id_class().id_class(rgF_2.GRAY));
      return rgv_3.id_class(
         var1,
         new rgy_3(rgp_3.id_class, var2),
         new rgl_3(rgH_2.SUGGEST_COMMAND, (String)C_class.id_instanceof().id_protected.id_class[0] + this.id_break().get(0) + " ")
      );
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8915527887891206725L;
   }

   @Override
   public List<String> id_break() {
      return (List<String>)this.id_class[2];
   }

   private static void id_throws() {
      id_break = new boolean[2];
   }

   private static void id_finally() {
      id_catch = new String[]{new String("Наведите мышь, чтобы увидеть подробное описание команды "), new String("\n")};
   }

   private static void id_extends() {
      id_case = new byte[]{3};
   }

   private static void id_protected() {
      id_throws = new short[]{2, 0, 1, 0, 2};
   }

   private void id_native() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
      }
   }
}
