package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SP extends Bn_1 implements By_1 {
   private static String[] id_protected;
   private static short[] id_throws;
   public Object[] id_byte;
   private static boolean[] id_case;

   public SP() {
      super(id_protected[0], (Pattern[])Bl_1.id_class[id_throws[0]]);
      this.id_private();
   }

   static {
      ntfClinit();
   }

   @Override
   public String id_class() {
      this.id_private();
      return (SB)this.id_byte[id_throws[4]] == null ? null : ((SB)this.id_byte[id_throws[5]]).id_class();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5850071901462858031L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 310029569;
   }

   @Override
   public void id_throws(String var1) {
      this.id_private();
      super.id_throws(var1);
      SB var6 = SB.id_class(var1);
      this.id_byte[id_throws[1]] = var6;
      if ((SB)this.id_byte[id_throws[2]] != null) {
         this.id_protected(((SB)this.id_byte[id_throws[3]]).id_class() + " " + this.id_throws().toLowerCase());
      }
   }

   private static void id_finally() {
      id_case = new boolean[]{true};
   }

   public static String id_catch(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-72, 119, -39, -91, -19, -114, 40, -109}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_catch() {
      id_protected = new String[]{new String("Мистик")};
   }

   private static void id_implements() {
      id_throws = new short[]{16, 0, 0, 0, 0, 0};
   }

   private void id_private() {
      if (this.id_byte == null) {
         this.id_byte = new Object[id_case[0]];
         Object[] var1 = this.id_byte;
      }
   }
}
