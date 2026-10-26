package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrwk_3 extends Pv_1 {
   public Object[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;

   public abstract rrfq_3 id_byte();

   public rrwk_3(C_class var1) {
      super(var1);
      this.id_protected();
   }

   static {
      ntfClinit();
   }

   public void id_class(boolean var1) {
      this.id_protected();
      Boolean var6 = var1;
      this.id_break[0] = var6;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7634164818494878225L;
   }

   @Override
   public void id_class(rrFK var1) {
      this.id_class(false);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -675616049;
   }

   public boolean id_class() {
      this.id_protected();
      return (Boolean)this.id_break[0];
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-101, -48, 21, 47, -5, 59, -71, 94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean id_break() {
      this.id_protected();
      return !this.id_break[0] && !((Ps_1)this.id_class[1]).id_throws().id_finally() && (rrfq_3)rrfp_3.id_class[1] == this.id_byte() ? true : id_protected[1];
   }

   private static void id_throws() {
      id_protected = new boolean[]{true, false, false, true, false, false};
   }

   private static void id_case() {
      id_byte = new short[]{0, 1, 1, 0, 0};
   }

   private void id_protected() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
         var1[0] = false;
      }
   }
}
