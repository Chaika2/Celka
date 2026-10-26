package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SJ extends Bn_1 {
   private static boolean[] id_protected;
   private static short[] id_throws;
   public Object[] id_byte;
   private static String[] id_case;

   public SJ() {
      super(id_case[0], (Pattern[])BH.id_class[4]);
      this.id_extends();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7368834094118296463L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1287466463;
   }

   @Override
   public void id_throws(String var1) {
      this.id_extends();
      super.id_throws(var1);
      Sx_1 var6 = Sx_1.id_break(var1);
      this.id_byte[id_throws[1]] = var6;
      if ((Sx_1)this.id_byte[id_throws[2]] != null) {
         this.id_protected(((Sx_1)this.id_byte[id_throws[3]]).id_class() + " " + this.id_throws().toLowerCase());
      }
   }

   private static void id_finally() {
      id_protected = new boolean[]{true};
   }

   public Sx_1 id_catch() {
      this.id_extends();
      return (Sx_1)this.id_byte[id_throws[4]];
   }

   public static String id_catch(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{65, 50, -34, 93, 115, -35, 102, 23}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_extends() {
      if (this.id_byte == null) {
         this.id_byte = new Object[1];
         Object[] var1 = this.id_byte;
      }
   }

   private static void id_implements() {
      id_case = new String[]{new String("Аир-дроп")};
   }

   private static void id_private() {
      id_throws = new short[]{4, 0, 0, 0, 0};
   }
}
