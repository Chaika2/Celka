package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rI_2 extends rl_3 {
   public Object[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;

   public rI_2(rq_3 var1) {
      super(var1.id_break(), var1.id_class(), var1.id_byte());
      this.id_case();
      this.id_break[id_byte[0]] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public xc_3 id_class(int var1, int var2, int var3, xc_3 var4, List<xc_3> var5) {
      this.id_case();
      return ((rq_3)this.id_break[id_byte[2]]).id_class(var1, var2, var3, var4, var5);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1707320765;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3623981078272605745L;
   }

   @Override
   public boolean id_class(int var1, int var2, int var3, xc_3 var4) {
      this.id_case();
      return ((rq_3)this.id_break[id_byte[1]]).id_class(var1, var2, var3, var4) && this.id_break(var1, var2, var3, var4) ? true : id_protected[1];
   }

   public abstract boolean id_break(int var1, int var2, int var3, xc_3 var4);

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-62, 100, -1, -52, -118, -98, 40, 47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_byte = new short[3];
   }

   private static void id_catch() {
      id_protected = new boolean[]{true, false, true};
   }

   private void id_case() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
      }
   }
}
