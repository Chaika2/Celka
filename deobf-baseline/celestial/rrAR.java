package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAR extends Om_1 {
   private static short[] id_byte;
   public static Object[] id_class;
   private static boolean[] id_protected;
   private static byte[] id_throws;
   public Object[] id_break;

   public rrAR() {
      this.id_case();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1179794961;
   }

   public static rrAR id_class(rdn_3 var0, rff_3 var1, xd_3 var2, rpm_3 var3) {
      ((rrAR)id_class[id_byte[0]]).id_break[id_byte[1]] = var0;
      ((rrAR)id_class[id_byte[2]]).id_break[id_byte[3]] = var1;
      ((rrAR)id_class[id_byte[4]]).id_break[id_byte[5]] = var2;
      ((rrAR)id_class[id_byte[6]]).id_break[id_byte[7]] = var3;
      ((rrAR)id_class[id_byte[8]]).id_class(id_protected[0]);
      return (rrAR)id_class[id_byte[9]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -9044253113654332721L;
   }

   public rdn_3 id_class() {
      this.id_case();
      return (rdn_3)this.id_break[id_byte[12]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-121, 60, -17, -121, -29, -26, -45, -67}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rff_3 id_break() {
      this.id_case();
      return (rff_3)this.id_break[id_byte[10]];
   }

   public rpm_3 id_throws() {
      this.id_case();
      return (rpm_3)this.id_break[id_byte[13]];
   }

   private static void id_finally() {
      id_byte = new short[]{0, 2, 0, 0, 0, 1, 0, 3, 0, 0, 0, 1, 2, 3};
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{new rrAR()};
      id_class = var0;
   }

   private void id_case() {
      if (this.id_break == null) {
         this.id_break = new Object[id_throws[0]];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_implements() {
      id_throws = new byte[]{4};
   }

   public xd_3 id_protected() {
      this.id_case();
      return (xd_3)this.id_break[id_byte[11]];
   }

   private static void id_private() {
      id_protected = new boolean[]{false, false, true};
   }
}
