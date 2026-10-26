package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bv_1 extends Pv_1 {
   private static boolean[] id_break;
   private static short[] id_byte;
   private static byte[] id_protected;

   private static void id_byte() {
      id_byte = new short[]{1};
   }

   public Bv_1(C_class var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(rrLu_1 var1) {
      super.id_class(var1);
      if (var1.id_class() instanceof rvQ_2 var2 && var2.id_break() == 35 && var2.id_class(((Ps_1)this.id_class[1]).id_case()) instanceof rhd_3 var4) {
         rdn_3[] var5 = rrfH_2.id_class(var4);
         rdn_3[] var6 = var5;
         int var7 = var5.length;

         for (int var8 = id_break[0]; var8 < var7; var8++) {
            rdn_3 var9 = var6[var8];
            if (var9.id_break() == rdy_3.kL) {
               rrAp_1.id_class(var4, var9);
               break;
            }
         }
      }
   }

   private static void id_class() {
      id_protected = new byte[]{35};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 359486306;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3757962789593181448L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{23, -8, -79, 90, -100, 64, 94, 84}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_break = new boolean[1];
   }
}
