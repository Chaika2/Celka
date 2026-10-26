package celestial;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sn_3 implements D {
   public Object[] id_class;
   private static boolean[] id_break;
   private static short[] id_byte;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   public sn_3(sA_2 var1, C_case var2) {
      this.id_byte();
      this.id_class[0] = var2;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-37, -30, -7, -123, 5, 82, 39, -117}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2574230454760854273L;
   }

   @Override
   public void id_class(T var1) {
      rY_2 var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_finally().id_new();
      rm_3 var3 = ((C_case)this.id_class[0]).id_long();
      if (var2 != null && var3.id_byte()) {
         if ((Boolean)C_class.id_instanceof().Pw.id_class[0]) {
            Color var4 = (Color)C_class.id_instanceof().id_try.id_class[0];
            float var5 = (Float)C_class.id_instanceof().id_super.id_class[0];
            float var6 = (Float)C_class.id_instanceof().PT.id_class[0];
            boolean var7 = (Boolean)C_class.id_instanceof().id_package.id_class[0];
            bj_3.id_class(var4, var5, var6, var7);
            bj_3.id_class(var1.id_byte(), var2.id_break());
            bj_3.id_class(var7);
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1540115941;
   }

   private static void id_class() {
      id_byte = new short[8];
   }

   private static void id_break() {
      id_break = new boolean[]{true};
   }
}
