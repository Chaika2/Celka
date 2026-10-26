package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtk_3 extends rrtd_3 {
   private static short[] id_throws;
   private static boolean[] id_case;
   public Object[] id_protected;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{26, 57, 41, -102, 106, -112, -126, -47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrtk_3(String var1, String var2, int var3, rrtz_3 var4) {
      this(new rgN_2(var1), new rgN_2(var2), var3, var4);
   }

   public rrtk_3(rVi_1 var1, rVi_1 var2, int var3, rrtz_3 var4) {
      super(var1, var2, var3);
      this.id_synchronized();
      this.id_protected[0] = var4;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_case = new boolean[]{true};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1356303449;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8037362624815299927L;
   }

   @Override
   public rqA_2 id_throws() {
      this.id_synchronized();

      return switch (((int[])rrtW_2.id_class[0])[((rrtz_3)this.id_protected[0]).ordinal()]) {
         case 1, 2 -> rqn_3.zh;
         case 3 -> rqn_3.zX;
         default -> throw new IncompatibleClassChangeError();
      };
   }

   private static void id_else() {
      id_throws = new short[3];
   }

   private void id_synchronized() {
      if (this.id_protected == null) {
         this.id_protected = new Object[1];
         Object[] var1 = this.id_protected;
      }
   }
}
