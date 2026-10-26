package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAH {
   public static Object[] id_class;
   public Object[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;
   private static byte[] id_throws;
   private static float[] id_case;

   public float id_byte() {
      return (Float)this.id_break[id_byte[8]];
   }

   public rrAH() {
      this.id_case();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1244815905599929273L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2000202130;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-93, 31, -57, 54, 1, 95, -102, -82}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(boolean var1) {
      Boolean var6 = var1;
      this.id_break[id_byte[12]] = var6;
   }

   public void id_class(float var1) {
      Float var6 = var1;
      this.id_break[id_byte[10]] = var6;
   }

   public float id_class() {
      return (Float)this.id_break[id_byte[7]];
   }

   public static rrAH id_class(float var0, float var1, boolean var2) {
      rrAH var10000 = (rrAH)id_class[id_byte[0]];
      Float var7 = var0;
      var10000.id_break[id_byte[1]] = var7;
      var10000 = (rrAH)id_class[id_byte[2]];
      Float var8 = var1;
      var10000.id_break[id_byte[3]] = var8;
      var10000 = (rrAH)id_class[id_byte[4]];
      Boolean var9 = var2;
      var10000.id_break[id_byte[5]] = var9;
      return (rrAH)id_class[id_byte[6]];
   }

   public boolean id_break() {
      return (Boolean)this.id_break[id_byte[9]];
   }

   public void id_break(float var1) {
      Float var6 = var1;
      this.id_break[id_byte[11]] = var6;
   }

   private static void id_throws() {
      id_throws = new byte[]{3, 2};
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{new rrAH()};
      id_class = var0;
   }

   private void id_case() {
      if (this.id_break == null) {
         this.id_break = new Object[id_throws[0]];
         Object[] var1 = this.id_break;
         var1[id_protected[1]] = id_case[0];
         var1[id_protected[2]] = id_case[1];
         var1[id_throws[1]] = id_protected[3];
      }
   }

   private static void id_implements() {
      id_protected = new boolean[]{false, false, true, false, true};
   }

   private static void id_protected() {
      id_case = new float[2];
   }

   private static void id_private() {
      id_byte = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 1, 2, 0, 1, 2};
   }
}
