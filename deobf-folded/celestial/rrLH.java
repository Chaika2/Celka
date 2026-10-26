package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLH extends Om_1 {
   private static byte[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_class;
   private static short[] id_throws;
   public static Object[] id_break;

   public rrLH() {
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   public xc_3 id_class() {
      this.id_throws();
      return (xc_3)this.id_class[1];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{3, 52, 83, -94, -81, -18, 110, 58}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrLH id_class(rfH_2 var0, xc_3 var1, rrLy_1 var2) {
      ((rrLH)id_break[id_throws[0]]).id_class[id_throws[1]] = var0;
      ((rrLH)id_break[id_throws[2]]).id_class[1] = var1;
      ((rrLH)id_break[id_throws[4]]).id_class[2] = var2;
      return (rrLH)id_break[id_throws[6]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -483111606;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2914218781117785792L;
   }

   public rfH_2 id_break() {
      this.id_throws();
      return (rfH_2)this.id_class[id_throws[7]];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_catch() {
      id_protected = new boolean[]{false, true};
   }

   private static void id_case() {
      id_throws = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 1, 2};
   }

   private static void id_implements() {
      id_byte = new byte[]{3};
   }

   public rrLy_1 id_protected() {
      this.id_throws();
      return (rrLy_1)this.id_class[2];
   }

   private static void id_private() {
      Object[] var0 = new Object[]{new rrLH()};
      id_break = var0;
   }
}
