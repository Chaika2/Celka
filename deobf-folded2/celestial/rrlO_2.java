package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlO_2 extends rrTF<Spider> {
   private static short[] id_break;
   public Object[] id_class;
   private static double[] id_byte;
   private static boolean[] id_protected;

   private static void id_byte() {
      id_break = new short[]{0, 57, 23, 0, 57, 0};
   }

   public rrlO_2(Spider var1) {
      super(var1);
      this.id_break();
      rrfw_3 var6 = new rrfw_3();
      this.id_class[0] = var6;
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void id_class(rrAo_1 var1) {
      this.id_break();
      if ((Boolean)((cb_3)id_import.id_class[57]).id_throws[23] && rrfj_3.id_catch() && ((rrfw_3)this.id_class[0]).id_class(150.0)) {
         var1.id_break(true);
         ((cb_3)id_import.id_class[57]).sl();
         ((rrfw_3)this.id_class[0]).id_class();
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5637964548593704514L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1876021831;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{102, 96, -106, -111, -76, 60, -93, -81}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_byte = new double[]{150.0};
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
      }
   }

   private static void id_protected() {
      id_protected = new boolean[]{true, true};
   }
}
