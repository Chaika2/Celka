package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcv_3 extends rrfI_2<Boolean> {
   public Object[] id_class;
   private static boolean[] id_break;
   private static String[] id_byte;
   private static short[] id_protected;

   @Override
   public boolean id_byte() {
      return this.id_break();
   }

   public rrcv_3(rrcZ_2 var1, rrNw_1 var2) {
      this.id_protected();
      this.id_class[0] = var2;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 403156390;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3457369534934745651L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-40, -14, 63, -23, -6, 40, -58, -1}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Boolean id_break() {
      this.id_protected();
      rJY var1 = ((rrNw_1)this.id_class[0]).id_throws();
      rdn_3 var2 = var1 == null ? ((rrNw_1)this.id_class[0]).id_protected() : var1.id_class();
      return var2.id_continue().getString().contains("★");
   }

   private static void id_throws() {
      id_protected = new short[3];
   }

   private static void id_catch() {
      id_break = new boolean[]{true};
   }

   private static void id_case() {
      id_byte = new String[]{new String("★")};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }
}
