package celestial;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EB implements D {
   public Object[] id_class;
   private static boolean[] id_break;
   private static short[] id_byte;

   private static void id_byte() {
      id_break = new boolean[]{true, true, true, true};
   }

   public EB(EP var1) {
      this.id_break();
      this.id_class[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3072353841831678291L;
   }

   @Override
   public void id_class(T var1) {
      if ((Boolean)C_class.id_instanceof().Pw.id_class[0] && (rU_2)((EP)this.id_class[0]).id_break[1] != null) {
         Color var2 = (Color)C_class.id_instanceof().id_short.id_class[0];
         float var3 = (Float)C_class.id_instanceof().id_super.id_class[0];
         float var4 = (Float)C_class.id_instanceof().PT.id_class[0];
         boolean var5 = (Boolean)C_class.id_instanceof().id_package.id_class[0];
         bj_3.id_class(var2, var3, var4, var5);
         bj_3.id_class(var1.id_byte(), new rfl_3((rU_2)((EP)this.id_class[0]).id_break[1], ((rU_2)((EP)this.id_class[0]).id_break[1]).id_class(1, 1, 1)));
         bj_3.id_class(var5);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 16555155;
   }

   private static void id_class() {
      id_byte = new short[]{0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{109, -91, 68, 63, -57, -24, -78, -20}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }
}
