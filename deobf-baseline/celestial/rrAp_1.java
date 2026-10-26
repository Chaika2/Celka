package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAp_1 extends Om_1 {
   public static Object[] id_class;
   public Object[] id_break;
   private static boolean[] id_byte;
   private static byte[] id_protected;
   private static short[] id_throws;

   public rrAp_1() {
      this.id_case();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1590343626;
   }

   public static void id_class(rhd_3 var0, rdn_3 var1) {
      rrAp_1 var2 = id_break(var0, var1);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[6]]).id_finally().id_class(var2);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4034630959850568959L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-55, -9, 124, 118, -12, 49, 89, 71}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rdn_3 id_class() {
      this.id_case();
      return (rdn_3)this.id_break[id_throws[8]];
   }

   private static rrAp_1 id_break(rhd_3 var0, rdn_3 var1) {
      ((rrAp_1)id_class[id_throws[0]]).id_break[id_throws[1]] = var0;
      ((rrAp_1)id_class[id_throws[2]]).id_break[id_throws[3]] = var1;
      ((rrAp_1)id_class[id_throws[4]]).id_class(id_byte[0]);
      return (rrAp_1)id_class[id_throws[5]];
   }

   public rhd_3 id_break() {
      this.id_case();
      return (rhd_3)this.id_break[id_throws[7]];
   }

   private static void id_throws() {
      id_throws = new short[]{0, 0, 0, 1, 0, 0, 0, 0, 1};
   }

   private static void id_catch() {
      id_byte = new boolean[]{false, false, true};
   }

   private void id_case() {
      if (this.id_break == null) {
         this.id_break = new Object[id_protected[0]];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_protected() {
      id_protected = new byte[]{2};
   }

   private static void id_private() {
      Object[] var0 = new Object[]{new rrAp_1()};
      id_class = var0;
   }
}
