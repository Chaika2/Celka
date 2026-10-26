package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bg_1 extends Bn_1 implements By_1 {
   private static boolean[] id_protected;
   public Object[] id_byte;
   private static short[] id_throws;
   private static String[] id_case;

   public Bg_1() {
      super(id_case[0], (Pattern[])Bl_1.id_class[id_throws[0]]);
      this.id_catch();
   }

   static {
      ntfClinit();
   }

   @Override
   public String id_class() {
      this.id_catch();
      return (BR)this.id_byte[id_throws[4]] == null ? null : ((BR)this.id_byte[id_throws[5]]).id_class();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -623250404;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3329730522932075399L;
   }

   @Override
   public void id_throws(String var1) {
      this.id_catch();
      super.id_throws(var1);
      BR var6 = BR.id_class(var1);
      this.id_byte[id_throws[1]] = var6;
      if ((BR)this.id_byte[id_throws[2]] != null) {
         this.id_protected(((BR)this.id_byte[id_throws[3]]).id_class() + " " + this.id_throws().toLowerCase());
      }
   }

   private static void id_finally() {
      id_protected = new boolean[]{true};
   }

   private void id_catch() {
      if (this.id_byte == null) {
         this.id_byte = new Object[id_protected[0]];
         Object[] var1 = this.id_byte;
      }
   }

   public static String id_catch(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{110, 26, -93, 80, -44, -29, 62, -117}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_implements() {
      id_case = new String[]{new String("Маяк убийца")};
   }

   private static void id_private() {
      id_throws = new short[]{18, 0, 0, 0, 0, 0};
   }
}
