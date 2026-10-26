package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.RandomStringUtils;

public class rryJ extends rrTF<AntiAfk> {
   private static double[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
      }
   }

   public rryJ(AntiAfk var1) {
      super(var1);
      this.id_byte();
      rrfw_3 var6 = new rrfw_3();
      this.id_class[id_protected[0]] = var6;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-92, 56, -68, 2, 27, 126, 114, 89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3255846481776113086L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 233872460;
   }

   private static void id_class() {
      id_byte = new boolean[]{true, true};
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_byte();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[1]]) {
         if (!rrfj_3.id_catch() && !rrfZ_2.id_byte()) {
            if (((rrfw_3)this.id_class[id_protected[2]]).id_class(id_break[0])) {
               ((cb_3)id_import.id_class[id_protected[3]]).id_case("/ho" + RandomStringUtils.randomAlphabetic(id_byte[0]).toLowerCase() + "me");
               ((rrfw_3)this.id_class[id_protected[4]]).id_class();
            }
         } else {
            ((rrfw_3)this.id_class[id_protected[5]]).id_class();
         }
      }
   }

   private static void id_break() {
      id_break = new double[]{10000.0};
   }

   private static void id_protected() {
      id_protected = new short[]{0, 0, 0, 57, 0, 0, 0};
   }

   @Override
   public boolean aK_() {
      this.id_byte();
      ((rrfw_3)this.id_class[id_protected[6]]).id_class();
      return super.aK_();
   }
}
