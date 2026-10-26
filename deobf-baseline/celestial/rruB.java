package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruB implements rrci_3 {
   public Object[] id_class;
   private static short[] id_break;
   private static boolean[] id_byte;

   private static void id_byte() {
      id_break = new short[2];
   }

   public rruB() {
      this.id_break();
      Object var5 = null;
      this.id_class[id_break[0]] = var5;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1314221589;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{126, 91, -86, 48, -82, 94, 105, 2}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean id_class() {
      return id_byte[0];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -9050381257782635624L;
   }

   @Override
   public Ok_1 id_class(Hx_1 var1, cG_2 var2) {
      return var1.getBuffer(HU.id_byte(var2.id_case()));
   }

   @Override
   public void id_class(cG_2 var1, int var2, Iq_1 var3, Ml_1 var4, Hx_1 var5, int var6, int var7) {
      var3.id_class(var4, (Ok_1)this.id_class[id_break[1]], var6, fZ_2.id_class);
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[1]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      id_byte = new boolean[]{true, true};
   }
}
