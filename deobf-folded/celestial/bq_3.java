package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class bq_3 implements PP, rz_3 {
   private static short[] id_break;
   private static boolean[] id_throws;
   private static byte[] id_catch;
   public Object[] id_case;

   public bq_3(C_class var1) {
      this.id_finally();
      this.id_case[id_break[0]] = var1;
      Ps_1 var7 = var1.id_throw();
      this.id_case[1] = var7;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7927040365553033380L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{122, 2, -58, 54, -48, -2, 7, 61}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1279566370;
   }

   private void id_finally() {
      if (this.id_case == null) {
         this.id_case = new Object[2];
         Object[] var1 = this.id_case;
      }
   }

   @Override
   public boolean id_catch() {
      return id_throws[0];
   }

   private static void id_extends() {
      id_throws = new boolean[1];
   }

   private static void id_implements() {
      id_break = new short[]{0, 1, 0};
   }

   @Override
   public void id_protected() {
      ((C_class)this.id_case[id_break[2]]).s().id_native();
   }

   private static void id_final() {
      id_catch = new byte[]{2};
   }
}
