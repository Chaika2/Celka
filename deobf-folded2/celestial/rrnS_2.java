package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnS_2 {
   public Object[] id_class;
   public static Object[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;
   private static byte[] id_throws;
   private static float[] id_case;

   public int id_byte() {
      return (Integer)this.id_class[3];
   }

   public rrnS_2() {
      this.id_private();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2482047001853845923L;
   }

   public static rrnS_2 id_class(vm_3 var0, Ml_1 var1, int var2, int var3, float var4) {
      ((rrnS_2)id_break[0]).id_class[0] = var0;
      ((rrnS_2)id_break[0]).id_class[1] = var1;
      rrnS_2 var10000 = (rrnS_2)id_break[0];
      Integer var11 = var2;
      var10000.id_class[2] = var11;
      var10000 = (rrnS_2)id_break[0];
      Integer var12 = var3;
      var10000.id_class[3] = var12;
      var10000 = (rrnS_2)id_break[0];
      Float var13 = var4;
      var10000.id_class[4] = var13;
      return (rrnS_2)id_break[0];
   }

   public float id_class() {
      return (Float)this.id_class[4];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1143632542;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{113, -55, -106, -9, 70, -72, -64, 40}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public vm_3 id_break() {
      return (vm_3)this.id_class[0];
   }

   public Ml_1 id_throws() {
      return (Ml_1)this.id_class[1];
   }

   private static void id_finally() {
      Object[] var0 = new Object[]{new rrnS_2()};
      id_break = var0;
   }

   private static void id_catch() {
      id_byte = new boolean[]{false, false, false, true};
   }

   private static void id_extends() {
      id_case = new float[1];
   }

   private static void id_case() {
      id_throws = new byte[]{5, 2, 3, 4};
   }

   private static void id_implements() {
      id_protected = new short[]{0, 0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 0, 1, 2, 3, 4};
   }

   public int id_protected() {
      return (Integer)this.id_class[2];
   }

   private void id_private() {
      if (this.id_class == null) {
         this.id_class = new Object[5];
         Object[] var1 = this.id_class;
         var1[2] = 0;
         var1[3] = 0;
         var1[4] = 0.0F;
      }
   }
}
