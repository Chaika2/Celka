package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTN extends rJr_1 implements rXi_1 {
   public static Object[] id_class;
   private static boolean[] id_byte;
   private static short[] id_protected;
   private static byte[] id_catch;
   public Object[] id_break;

   private void id_byte() {
      this.id_throws();

      for (int var1 = id_byte[1]; var1 < 3; var1++) {
         for (int var2 = id_byte[2]; var2 < 9; var2++) {
            int var3 = var2 + var1 * 9;
            int var4 = 8 + var2 * 18;
            int var5 = 18 + var1 * 18;
            this.id_break(new rrTc_1((rXu_1)this.id_break[id_protected[1]], var3, var4, var5));
         }
      }
   }

   public rrTN(List<rdn_3> var1) {
      super(null, -1);
      this.id_throws();
      rXu_1 var6 = this.id_break(var1);
      this.id_break[id_protected[0]] = var6;
      this.id_byte();
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      id_byte = new boolean[]{false, false, false, true, false, true, true, false};
   }

   @Override
   public boolean id_class(rdn_3 var1, rJY var2) {
      return id_byte[4];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-44, 110, -117, -33, -105, 63, -26, 78}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public rdn_3 id_class(rhd_3 var1, int var2) {
      return rdn_3.id_break;
   }

   @Override
   public boolean id_class(rhd_3 var1) {
      return true;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6055793232411197489L;
   }

   private static void id_break() {
      Object[] var0 = new Object[]{27};
      id_class = var0;
   }

   private rXu_1 id_break(List<rdn_3> var1) {
      rXA var2 = new rXA(27);

      for (int var3 = id_byte[0]; var3 < Math.min(var1.size(), 27); var3++) {
         rdn_3 var4 = (rdn_3)var1.get(var3);
         if (var4 != null && !var4.id_class()) {
            var2.id_break(var3, var4.id_implements());
         }
      }

      return var2;
   }

   private void id_throws() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
      }
   }

   private static void id_case() {
      id_protected = new short[2];
   }

   private static int id_protected(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1337217027;
   }

   private static void id_protected() {
      id_catch = new byte[]{-1, 27, 27, 3, 9, 9, 8, 18, 18, 18, 27};
   }
}
