package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Mc_1 implements rw_3 {
   private static boolean[] id_break;
   private static short[] id_byte;
   public Object[] id_class;

   @Override
   public int id_byte() {
      return ((ML)this.id_class[id_byte[4]]).id_class().id_byte();
   }

   public Mc_1(ML var1) {
      this.id_throws();
      this.id_class[id_byte[0]] = var1;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{74, 91, -18, -44, 83, 99, 26, 116}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1730221494;
   }

   @Override
   public int id_class() {
      return ((ML)this.id_class[id_byte[3]]).id_class().id_break();
   }

   @Override
   public xc_3 id_class(int var1, int var2, int var3) {
      return ((ML)this.id_class[id_byte[1]]).id_class().id_class(new rfH_2(var1, var2, var3));
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5561258149904380313L;
   }

   @Override
   public xc_3 id_class(int var1, int var2, int var3, xc_3 var4, List<xc_3> var5) {
      return this.id_class(var1, var2, var3);
   }

   @Override
   public int id_break() {
      return ((ML)this.id_class[id_byte[2]]).id_class().id_class();
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[id_break[0]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_catch() {
      id_byte = new short[5];
   }

   private static void id_case() {
      id_break = new boolean[]{true};
   }
}
