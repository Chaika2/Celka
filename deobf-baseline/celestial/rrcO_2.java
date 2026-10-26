package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcO_2 implements rrcT_2<rrfG_2> {
   private static short[] id_break;
   public Object[] id_class;
   private static boolean[] id_byte;

   private static void id_byte() {
      id_byte = new boolean[]{true};
   }

   public rrcO_2(rrfG_2 var1) {
      this.id_break();
      this.id_class[id_break[1]] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public rrfI_2<rrfG_2> id_class(rrNd_1 var1, rrNw_1 var2) {
      return new rrch_3(this, var2);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1954426783658740729L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1979926091;
   }

   public rrfG_2 id_class() {
      return (rrfG_2)this.id_class[id_break[0]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{84, -97, -70, 125, -58, 24, -25, 124}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[0]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      id_break = new short[2];
   }
}
