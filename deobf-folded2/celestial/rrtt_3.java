package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrtt_3 extends rrtm_3 {
   public Object[] id_byte;
   private static short[] id_protected;
   private static byte[] id_throws;

   public rrtt_3(rrtN_2 var1, rrtf_3<?> var2, float var3, float var4, float var5, float var6) {
      super(var3, var4, var5, var6);
      this.id_public();
      this.id_byte[0] = var1;
      this.id_byte[1] = var2;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5800961264983759952L;
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1471353696;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{49, -73, -79, -117, 69, -18, -23, -118}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Setting<?> id_finally() {
      this.id_public();
      return ((rrtf_3)this.id_byte[1]).id_break();
   }

   private static void id_goto() {
      id_protected = new short[]{0, 1, 1, 0, 1};
   }

   private static void id_return() {
      id_throws = new byte[]{2};
   }

   private void id_public() {
      if (this.id_byte == null) {
         this.id_byte = new Object[2];
         Object[] var1 = this.id_byte;
      }
   }

   @Override
   public rrtN_2 id_private() {
      this.id_public();
      return (rrtN_2)this.id_byte[0];
   }

   @Override
   public rruv_1 id_volatile() {
      return new rruv_1(this.id_package(), this.id_final(), this.id_new(), this.id_continue());
   }

   public rrtf_3<?> id_synchronized() {
      this.id_public();
      return (rrtf_3<?>)this.id_byte[1];
   }
}
