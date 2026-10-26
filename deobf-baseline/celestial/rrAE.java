package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAE extends Om_1 {
   private static byte[] id_byte;
   public static Object[] id_class;
   public Object[] id_break;
   private static short[] id_protected;
   private static boolean[] id_throws;

   public rrAE() {
      this.id_private();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -840514808;
   }

   public xd_3 id_class() {
      this.id_private();
      return (xd_3)this.id_break[id_protected[10]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -316223895521349470L;
   }

   public static rrAE id_class(rfH_2 var0, rdn_3 var1) {
      ((rrAE)id_class[id_protected[0]]).id_break[id_protected[1]] = var1;
      ((rrAE)id_class[id_protected[2]]).id_break[id_protected[3]] = var0;
      rrAE var10000 = (rrAE)id_class[id_protected[4]];
      xd_3 var8 = rrjc_3.id_protected(var0);
      var10000.id_break[id_protected[5]] = var8;
      ((rrAE)id_class[id_protected[6]]).id_class(id_throws[0]);
      return (rrAE)id_class[id_protected[7]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-69, 91, 55, -119, 23, -82, -61, 100}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rfH_2 id_break() {
      this.id_private();
      return (rfH_2)this.id_break[id_protected[9]];
   }

   private static void id_throws() {
      id_byte = new byte[]{3};
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{new rrAE()};
      id_class = var0;
   }

   private static void id_case() {
      id_throws = new boolean[]{false, false, true};
   }

   private static void id_implements() {
      id_protected = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 0, 1, 2};
   }

   public rdn_3 id_protected() {
      this.id_private();
      return (rdn_3)this.id_break[id_protected[8]];
   }

   private void id_private() {
      if (this.id_break == null) {
         this.id_break = new Object[id_byte[0]];
         Object[] var1 = this.id_break;
      }
   }
}
