package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BD extends Bn_1 implements By_1 {
   private static short[] id_protected;
   private static boolean[] id_throws;
   public Object[] id_byte;
   private static String[] id_case;

   public BD() {
      super(id_case[0], (Pattern[])Bl_1.id_class[id_protected[0]]);
      this.id_private();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4325367419091138209L;
   }

   @Override
   public String id_class() {
      this.id_private();
      return (BU)this.id_byte[id_protected[4]] == null ? null : ((BU)this.id_byte[id_protected[5]]).id_class();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1900915126;
   }

   @Override
   public void id_throws(String var1) {
      this.id_private();
      super.id_throws(var1);
      BU var6 = BU.id_class(var1);
      this.id_byte[id_protected[1]] = var6;
      if ((BU)this.id_byte[id_protected[2]] != null) {
         this.id_protected(((BU)this.id_byte[id_protected[3]]).id_class() + " " + this.id_throws().toLowerCase());
      }
   }

   private static void id_finally() {
      id_throws = new boolean[]{true};
   }

   private static void id_catch() {
      id_protected = new short[]{23, 0, 0, 0, 0, 0};
   }

   public static String id_catch(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-107, -82, 77, 43, 5, -80, -107, -38}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_implements() {
      id_case = new String[]{new String("Гейзер")};
   }

   private void id_private() {
      if (this.id_byte == null) {
         this.id_byte = new Object[id_throws[0]];
         Object[] var1 = this.id_byte;
      }
   }
}
