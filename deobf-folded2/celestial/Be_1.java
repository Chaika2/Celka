package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Be_1 extends Bn_1 implements By_1 {
   private static short[] id_protected;
   private static boolean[] id_throws;
   private static String[] id_case;
   public Object[] id_byte;

   public Be_1() {
      super("Метеор. дождь", (Pattern[])Bl_1.id_class[15]);
      this.id_catch();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 67622947;
   }

   @Override
   public String id_class() {
      this.id_catch();
      return (Ba_1)this.id_byte[0] == null ? null : ((Ba_1)this.id_byte[0]).id_class();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6758016890447815831L;
   }

   @Override
   public void id_throws(String var1) {
      this.id_catch();
      super.id_throws(var1);
      Ba_1 var6 = Ba_1.id_class(var1);
      this.id_byte[0] = var6;
      if ((Ba_1)this.id_byte[0] != null) {
         this.id_protected(((Ba_1)this.id_byte[0]).id_class() + " " + this.id_throws().toLowerCase());
      }
   }

   private static void id_finally() {
      id_throws = new boolean[]{true};
   }

   private void id_catch() {
      if (this.id_byte == null) {
         this.id_byte = new Object[1];
         Object[] var1 = this.id_byte;
      }
   }

   public static String id_catch(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{96, -63, 84, -67, 81, 126, 57, -22}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_implements() {
      id_case = new String[]{new String("Метеор. дождь")};
   }

   private static void id_private() {
      id_protected = new short[]{15, 0, 0, 0, 0, 0};
   }
}
