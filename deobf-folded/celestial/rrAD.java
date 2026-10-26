package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAD {
   private static short[] id_byte;
   private static boolean[] id_protected;
   private static byte[] id_throws;
   public Object[] id_class;
   public static Object[] id_break;

   public int id_byte() {
      return (Integer)this.id_class[2];
   }

   public rrAD() {
      this.id_private();
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-117, -36, 104, 85, -103, 75, -30, -33}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8151305930362557873L;
   }

   public int id_class() {
      return (Integer)this.id_class[5];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1674116105;
   }

   public static rrAD id_class(Ml_1 var0, rJY var1, int var2, int var3, int var4, int var5) {
      ((rrAD)id_break[id_byte[0]]).id_class[id_byte[1]] = var0;
      ((rrAD)id_break[id_byte[2]]).id_class[1] = var1;
      rrAD var10000 = (rrAD)id_break[id_byte[4]];
      Integer var12 = var2;
      var10000.id_class[2] = var12;
      var10000 = (rrAD)id_break[id_byte[6]];
      Integer var13 = var3;
      var10000.id_class[3] = var13;
      var10000 = (rrAD)id_break[id_byte[8]];
      Integer var14 = var4;
      var10000.id_class[4] = var14;
      var10000 = (rrAD)id_break[id_byte[10]];
      Integer var15 = var5;
      var10000.id_class[5] = var15;
      return (rrAD)id_break[id_byte[12]];
   }

   public Ml_1 id_break() {
      return (Ml_1)this.id_class[id_byte[13]];
   }

   public int id_throws() {
      return (Integer)this.id_class[3];
   }

   private static void id_finally() {
      Object[] var0 = new Object[]{new rrAD()};
      id_break = var0;
   }

   private static void id_catch() {
      id_protected = new boolean[]{false, false, false, false, false, true};
   }

   private static void id_extends() {
      id_throws = new byte[]{6, 2, 3, 4, 5};
   }

   public rJY id_case() {
      return (rJY)this.id_class[1];
   }

   private static void id_implements() {
      id_byte = new short[]{0, 0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 0, 1, 2, 3, 4, 5};
   }

   public int id_protected() {
      return (Integer)this.id_class[4];
   }

   private void id_private() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
         Object[] var1 = this.id_class;
         var1[2] = Integer.valueOf(id_protected[1]);
         var1[3] = Integer.valueOf(id_protected[2]);
         var1[4] = Integer.valueOf(id_protected[3]);
         var1[5] = Integer.valueOf(id_protected[4]);
      }
   }
}
