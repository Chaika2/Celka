package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmq_3 implements rruT<String>, rruq_1 {
   private static boolean[] id_break;
   private static short[] id_byte;
   private static String[] id_protected;
   public Object[] id_class;

   private static void id_byte() {
      id_byte = new short[7];
   }

   rrmq_3(rrmH_2 var1) {
      this.id_break();
      this.id_class[0] = var1;
   }

   static {
      ntfClinit();
   }

   public rVe_1 id_class(String var1) {
      rVe_1 var2 = new rVe_1(" - ");
      var2.id_class(new rgN_2("Удалить").id_class(var2.id_class().id_class(rgF_2.RED)));
      rVe_1 var3 = new rVe_1("");
      var3.id_class(var3.id_class().id_class(rgF_2.GRAY));
      var3.id_class(String.join("\n", "Нажмите чтобы удалить '" + var1 + "' из списка префиксов"));
      var2.id_class(var2.id_class().id_class(new rgy_3(rgp_3.id_class, var3)));
      rVe_1 var4 = rrfu_3.id_class((Object)var1).id_break();
      var4.id_class(var4.id_class().id_class(rgF_2.GRAY));
      var4.id_class(var2);
      var4.id_class(
         var4.id_class().id_class(new rgl_3(rgH_2.RUN_COMMAND, (String)C_class.id_instanceof().id_protected.id_class[0] + "staffprefix remove " + var1))
      );
      return var4;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1470645963;
   }

   private static void id_class() {
      id_break = new boolean[]{true, false, true, false, true};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1387103326321036910L;
   }

   @Override
   public void id_class(C_static var1) {
      ((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[0]).id_class(var1x -> {
         rVe_1 var2 = this.id_class(var1x);
         ((rrmH_2)this.id_class[0]).id_class(new rVi_1[]{var2});
      });
      if (!((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[0]).id_byte().isEmpty()) {
         ((rrmH_2)this.id_class[0]).id_case("Всего префиксов: " + ((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[0]).id_throws());
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-97, -30, 110, -99, -104, -88, 123, -89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      id_protected = new String[]{new String(" - "), new String("Удалить"), new String(""), new String("\n")};
   }
}
