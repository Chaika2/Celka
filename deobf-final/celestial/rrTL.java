package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTL implements rrTv_1 {
   private static String[] class_;
   private static short[] break_;

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{76, -119, 116, -34, 88, -29, 111, 72}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      class_ = new String[]{new String("включен"), new String("отключен"), new String("None"), new String("разбинжен"), new String("Modules")};
   }

   @Override
   public void class_(Module var1, KeyBind var2) {
      String var3 = var2.break_();
      String var4 = var3.equals("None") ? "разбинжен" : "забинжен на '" + var3 + "'";
      this.class_(var1, var4, (rrtz_3)rrtz_3.staticFieldsb85642e435023a9b997fb27aa0167b70[2]);
   }

   public void class_(Module var1, String var2, rrtz_3 var3) {
      if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().Y().new_()) {
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtk_3("Modules", var1.extends_() + " " + var2, 1500, var3));
      }
   }

   @Override
   public void class_(Module var1) {
      this.class_(var1, "включен", (rrtz_3)rrtz_3.staticFieldsb85642e435023a9b997fb27aa0167b70[0]);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -745162233;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1236799614373048683L;
   }

   @Override
   public void break_(Module var1) {
      this.class_(var1, "отключен", (rrtz_3)rrtz_3.staticFieldsb85642e435023a9b997fb27aa0167b70[1]);
   }

   private static void break_() {
      break_ = new short[]{0, 1, 2, 0, 0, 1500};
   }
}
