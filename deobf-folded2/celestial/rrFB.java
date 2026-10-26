package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFB extends rrFr_1 {
   public Object[] id_break;
   private static byte[] id_byte;
   private static short[] id_protected;
   private static boolean[] id_throws;

   @Override
   public boolean id_byte() {
      return true;
   }

   private static long id_byte(long var0) {
      return Long.rotateLeft(var0, 32) ^ -461490798771604423L;
   }

   public rrFB(rrvi_1 var1, rdb_3 var2, String var3) {
      this.id_extends();
      this.id_break[2] = var1;
      rdn_3 var9 = new rdn_3(var2);
      this.id_break[0] = var9;
      this.id_break[1] = var3;
   }

   static {
      ntfClinit();
   }

   @Override
   public rdn_3 id_class() {
      this.id_extends();
      return (rdn_3)this.id_break[0];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 450250485;
   }

   @Override
   public boolean id_break(boolean var1) {
      this.id_extends();
      return ((rrvi_1)this.id_break[2]).id_package();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-3, 21, -55, -8, -66, -24, -121, -4}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean id_throws() {
      return false;
   }

   private void id_extends() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
         Object[] var1 = this.id_break;
      }
   }

   @Override
   public String id_implements() {
      this.id_extends();
      return (String)this.id_break[1];
   }

   @Override
   public boolean id_protected() {
      this.id_extends();
      return ((rrvi_1)this.id_break[2]).x();
   }

   private static void id_final() {
      id_protected = new short[]{2, 0, 1, 0, 1, 2, 2};
   }

   private static void id_volatile() {
      id_byte = new byte[]{3};
   }

   private static void id_native() {
      id_throws = new boolean[]{true, false};
   }
}
