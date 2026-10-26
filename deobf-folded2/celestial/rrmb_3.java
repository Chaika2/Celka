package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmb_3 implements rruT<rrZk_1>, rruq_1 {
   private static short[] id_break;
   private static String[] id_byte;
   public Object[] id_class;
   private static boolean[] id_protected;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   rrmb_3(rrms_3 var1) {
      this.id_byte();
      this.id_class[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 840185984409463620L;
   }

   private static void id_class() {
      id_byte = new String[]{new String(" - "), new String("Удалить"), new String(""), new String("\n")};
   }

   public rVe_1 id_class(rrZk_1 var1) {
      rgN_2 var2 = new rgN_2(" - ");
      var2.id_class(new rgN_2("Удалить").id_class(var2.id_class().id_class(rgF_2.RED)));
      rgN_2 var3 = new rgN_2("");
      var3.id_class(var3.id_class().id_class(rgF_2.GRAY));
      var3.id_break(String.join("\n", "Нажмите чтобы удалить '" + var1.id_class() + "' из друзей"));
      var2.id_class(var2.id_class().id_class(new rgy_3(rgp_3.id_class, var3)));
      rVe_1 var4 = rrfu_3.id_class(var1.id_class()).id_break();
      var4.id_class(var4.id_class().id_class(rgF_2.GRAY));
      var4.id_class(var2);
      var4.id_class(
         var4.id_class().id_class(new rgl_3(rgH_2.RUN_COMMAND, (String)C_class.id_instanceof().id_protected.id_class[0] + "friend remove " + var1.id_class()))
      );
      return var4;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1040996569;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{75, -97, 90, 56, 95, -20, 91, 79}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_class(C_static var1) {
      ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).id_class(var1x -> {
         rVe_1 var2 = this.id_class(var1x);
         ((rrms_3)this.id_class[0]).id_class(new rVi_1[]{var2});
      });
      if (!((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).id_class().isEmpty()) {
         ((rrms_3)this.id_class[0]).id_case("Всего друзей: " + ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).id_break());
      }
   }

   private static void id_break() {
      id_break = new short[7];
   }

   private static void id_protected() {
      id_protected = new boolean[]{true, false, true, false, true};
   }
}
