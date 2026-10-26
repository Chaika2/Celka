package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAI {
   private static short[] id_byte;
   public static Object[] id_class;
   private static boolean[] id_protected;
   private static byte[] id_throws;
   public Object[] id_break;

   public xd_3 id_byte() {
      return (xd_3)this.id_break[id_byte[11]];
   }

   public rrAI() {
      this.id_implements();
   }

   static {
      ntfClinit();
   }

   public static rrAI id_class(rdn_3 var0, rfH_2 var1, xd_3 var2, ryZ_2 var3) {
      ((rrAI)id_class[id_byte[0]]).id_break[id_byte[1]] = var0;
      ((rrAI)id_class[id_byte[2]]).id_break[id_byte[3]] = var1;
      ((rrAI)id_class[id_byte[4]]).id_break[id_byte[5]] = var2;
      ((rrAI)id_class[id_byte[6]]).id_break[id_byte[7]] = var3;
      return (rrAI)id_class[id_byte[8]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5610207736679760100L;
   }

   public rfH_2 id_class() {
      return (rfH_2)this.id_break[id_byte[10]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 36368328;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-116, 14, 55, -74, 103, -95, -1, -15}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public ryZ_2 id_break() {
      return (ryZ_2)this.id_break[id_byte[12]];
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrAI()};
      id_class = var0;
   }

   private static void id_catch() {
      id_byte = new short[]{0, 0, 0, 1, 0, 2, 0, 3, 0, 0, 1, 2, 3};
   }

   private static void id_case() {
      id_protected = new boolean[]{false, true};
   }

   private void id_implements() {
      if (this.id_break == null) {
         this.id_break = new Object[id_throws[0]];
         Object[] var1 = this.id_break;
      }
   }

   public rdn_3 id_protected() {
      return (rdn_3)this.id_break[id_byte[9]];
   }

   private static void id_private() {
      id_throws = new byte[]{4};
   }
}
