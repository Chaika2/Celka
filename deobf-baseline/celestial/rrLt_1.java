package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLt_1 {
   public static Object[] id_class;
   private static byte[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_break;
   private static short[] id_throws;

   public boolean id_byte() {
      return (Boolean)this.id_break[id_throws[9]];
   }

   public rrLt_1() {
      this.id_case();
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-33, 74, -74, -12, -28, 108, -56, 108}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(rjU_2 var1) {
      this.id_break[id_throws[10]] = var1;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3478087875744000012L;
   }

   public void id_class(boolean var1) {
      Boolean var6 = var1;
      this.id_break[id_throws[12]] = var6;
   }

   public static rrLt_1 id_class(rjU_2 var0, rjU_2 var1, boolean var2) {
      ((rrLt_1)id_class[id_throws[0]]).id_break[id_throws[1]] = var0;
      ((rrLt_1)id_class[id_throws[2]]).id_break[id_throws[3]] = var1;
      rrLt_1 var10000 = (rrLt_1)id_class[id_throws[4]];
      Boolean var9 = var2;
      var10000.id_break[id_throws[5]] = var9;
      return (rrLt_1)id_class[id_throws[6]];
   }

   public rjU_2 id_class() {
      return (rjU_2)this.id_break[id_throws[8]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -850554814;
   }

   public void id_break(rjU_2 var1) {
      this.id_break[id_throws[11]] = var1;
   }

   public rjU_2 id_break() {
      return (rjU_2)this.id_break[id_throws[7]];
   }

   private static void id_throws() {
      id_throws = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 1, 2, 0, 1, 2};
   }

   private static void id_catch() {
      id_byte = new byte[]{3, 2};
   }

   private void id_case() {
      if (this.id_break == null) {
         this.id_break = new Object[id_byte[0]];
         Object[] var1 = this.id_break;
         var1[id_byte[1]] = id_protected[1];
      }
   }

   private static void id_protected() {
      id_protected = new boolean[]{false, false, true};
   }

   private static void id_private() {
      Object[] var0 = new Object[]{new rrLt_1()};
      id_class = var0;
   }
}
