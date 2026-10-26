package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnG_2 {
   public Object[] id_class;
   public static Object[] id_break;
   private static float[] id_byte;
   private static short[] id_protected;
   private static byte[] id_throws;
   private static boolean[] id_case;

   public Ml_1 id_byte() {
      return (Ml_1)this.id_class[id_protected[12]];
   }

   public rrnG_2() {
      this.id_case();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1947432229;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8449881996058233727L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-101, 104, -8, -57, -33, -37, 13, -114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(vm_3 var1) {
      this.id_class[id_protected[16]] = var1;
   }

   public static rrnG_2 id_class(vm_3 var0, Ml_1 var1, int var2, int var3, float var4) {
      ((rrnG_2)id_break[id_protected[0]]).id_class[id_protected[1]] = var0;
      ((rrnG_2)id_break[id_protected[2]]).id_class[id_protected[3]] = var1;
      rrnG_2 var10000 = (rrnG_2)id_break[id_protected[4]];
      Integer var11 = var2;
      var10000.id_class[id_protected[5]] = var11;
      var10000 = (rrnG_2)id_break[id_protected[6]];
      Integer var12 = var3;
      var10000.id_class[id_protected[7]] = var12;
      var10000 = (rrnG_2)id_break[id_protected[8]];
      Float var13 = var4;
      var10000.id_class[id_protected[9]] = var13;
      return (rrnG_2)id_break[id_protected[10]];
   }

   public int id_class() {
      return (Integer)this.id_class[id_protected[14]];
   }

   public vm_3 id_break() {
      return (vm_3)this.id_class[id_protected[11]];
   }

   public int id_throws() {
      return (Integer)this.id_class[id_protected[13]];
   }

   private static void id_finally() {
      id_case = new boolean[]{false, false, false, true};
   }

   private static void id_catch() {
      id_protected = new short[]{0, 0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 0, 1, 2, 3, 4, 0};
   }

   private static void id_extends() {
      Object[] var0 = new Object[]{new rrnG_2()};
      id_break = var0;
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[id_throws[0]];
         Object[] var1 = this.id_class;
         var1[id_throws[1]] = Integer.valueOf(id_case[1]);
         var1[id_throws[2]] = Integer.valueOf(id_case[2]);
         var1[id_throws[3]] = id_byte[0];
      }
   }

   private static void id_implements() {
      id_throws = new byte[]{5, 2, 3, 4};
   }

   public float id_protected() {
      return (Float)this.id_class[id_protected[15]];
   }

   private static void id_private() {
      id_byte = new float[1];
   }
}
