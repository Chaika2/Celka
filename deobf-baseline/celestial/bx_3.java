package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bx_3 extends rS_2 {
   public Object[] id_break;
   private static boolean[] id_byte;
   private static float[] id_protected;
   private static byte[] id_throws;
   private static short[] id_case;

   public boolean id_byte() {
      this.id_throws();
      return (Boolean)this.id_break[id_case[2]];
   }

   public bx_3(rfH_2 var1, float var2, boolean var3) {
      super(var1);
      this.id_throws();
      Float var8 = var2;
      this.id_break[id_case[0]] = var8;
      Boolean var9 = var3;
      this.id_break[id_case[1]] = var9;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1332542960;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8292536883720265442L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-108, -90, 6, 72, -42, 7, -38, 75}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_throws() {
      if (this.id_break == null) {
         this.id_break = new Object[id_throws[0]];
         Object[] var1 = this.id_break;
         var1[id_byte[0]] = id_protected[0];
         var1[id_byte[1]] = id_byte[2];
      }
   }

   private static void id_catch() {
      id_byte = new boolean[]{false, true, false};
   }

   private static void id_case() {
      id_case = new short[]{0, 1, 1, 0};
   }

   private static void id_implements() {
      id_protected = new float[1];
   }

   public float id_protected() {
      this.id_throws();
      return (Float)this.id_break[id_case[3]];
   }

   private static void id_private() {
      id_throws = new byte[]{2};
   }
}
