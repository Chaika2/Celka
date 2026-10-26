package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAk_1 extends Om_1 {
   private static boolean[] id_byte;
   public static Object[] id_class;
   public Object[] id_break;
   private static byte[] id_protected;
   private static short[] id_throws;

   public rrAk_1() {
      this.id_private();
   }

   static {
      ntfClinit();
   }

   public void id_class(xc_3 var1) {
      this.id_private();
      this.id_break[2] = var1;
   }

   public xc_3 id_class() {
      this.id_private();
      return (xc_3)this.id_break[2];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-12, -49, 79, 70, -29, 66, -51, -86}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5246407357504937366L;
   }

   public void id_class(rjB_2 var1) {
      this.id_private();
      this.id_break[1] = var1;
   }

   public static rrAk_1 id_class(rff_3 var0, rjB_2 var1, xc_3 var2) {
      ((rrAk_1)id_class[id_throws[0]]).id_break[id_throws[1]] = var0;
      ((rrAk_1)id_class[id_throws[2]]).id_break[1] = var1;
      ((rrAk_1)id_class[id_throws[4]]).id_break[2] = var2;
      return (rrAk_1)id_class[id_throws[6]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -623863540;
   }

   public void id_class(rff_3 var1) {
      this.id_private();
      this.id_break[id_throws[10]] = var1;
   }

   public rff_3 id_break() {
      this.id_private();
      return (rff_3)this.id_break[id_throws[7]];
   }

   private static void id_throws() {
      id_throws = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 1, 2, 0, 1, 2};
   }

   private static void id_catch() {
      id_byte = new boolean[]{false, true};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new rrAk_1()};
      id_class = var0;
   }

   private static void id_implements() {
      id_protected = new byte[]{3};
   }

   public rjB_2 id_protected() {
      this.id_private();
      return (rjB_2)this.id_break[1];
   }

   private void id_private() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
         Object[] var1 = this.id_break;
      }
   }
}
