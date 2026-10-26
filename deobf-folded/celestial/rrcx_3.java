package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcx_3 implements rrcT_2<rrfO_2> {
   private static short[] id_break;
   public Object[] id_class;
   private static boolean[] id_byte;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   public rrcx_3(rrfO_2 var1) {
      this.id_byte();
      this.id_class[id_break[1]] = var1;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4680518301379964127L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 329258038;
   }

   @Override
   public rrfI_2<rrfO_2> id_class(rrNd_1 var1, rrNw_1 var2) {
      return new rrcd_3(this, var2);
   }

   public rrfO_2 id_class() {
      return (rrfO_2)this.id_class[id_break[0]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-12, -121, -96, 103, 14, -51, 61, -66}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_byte = new boolean[]{true};
   }

   private static void id_protected() {
      id_break = new short[2];
   }
}
