package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTy_1 extends rrTC {
   private static boolean[] id_protected;
   private static short[] id_throws;
   public Object[] id_byte;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-62, 5, -121, 78, -58, 38, 79, -98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrTy_1(rrTT var1) {
      super(var1.id_this());
      this.id_implements();
      this.id_byte[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6089154769574187913L;
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1984997610;
   }

   @Override
   public PX id_throws() {
      this.id_implements();
      return ((rrTT)this.id_byte[0]).id_new().orElseGet(() -> ((cb_3)id_import.id_class[57]).rO());
   }

   private static void id_catch() {
      id_throws = new short[]{0, 0, 57};
   }

   private static void id_case() {
      id_protected = new boolean[]{true};
   }

   private void id_implements() {
      if (this.id_byte == null) {
         this.id_byte = new Object[1];
         Object[] var1 = this.id_byte;
      }
   }
}
