package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAm_1 {
   private static boolean[] id_byte;
   private static short[] id_protected;
   public static Object[] id_class;
   public Object[] id_break;
   private static byte[] id_throws;

   private static void id_byte() {
      id_throws = new byte[]{2};
   }

   public rrAm_1() {
      this.id_protected();
   }

   static {
      ntfClinit();
   }

   public vm_3 id_class() {
      return (vm_3)this.id_break[id_protected[5]];
   }

   public void id_class(boolean var1) {
      Boolean var6 = var1;
      this.id_break[id_protected[7]] = var6;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-1, -83, -52, 68, 44, -38, -69, -74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1050662598;
   }

   public static rrAm_1 id_class(vm_3 var0) {
      ((rrAm_1)id_class[id_protected[0]]).id_break[id_protected[1]] = var0;
      rrAm_1 var10000 = (rrAm_1)id_class[id_protected[2]];
      Boolean var6 = id_byte[0];
      var10000.id_break[id_protected[3]] = var6;
      return (rrAm_1)id_class[id_protected[4]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8580315293209524696L;
   }

   public boolean id_break() {
      return (Boolean)this.id_break[id_protected[6]];
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrAm_1()};
      id_class = var0;
   }

   private static void id_catch() {
      id_byte = new boolean[]{false, false, true, false, true};
   }

   private static void id_case() {
      id_protected = new short[]{0, 0, 0, 1, 0, 0, 1, 1};
   }

   private void id_protected() {
      if (this.id_break == null) {
         this.id_break = new Object[id_throws[0]];
         Object[] var1 = this.id_break;
         var1[id_byte[2]] = id_byte[3];
      }
   }
}
