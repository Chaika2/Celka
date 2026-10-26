package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAg_1 {
   public static Object[] id_class;
   private static byte[] id_byte;
   public Object[] id_break;
   private static short[] id_protected;
   private static boolean[] id_throws;

   public rdn_3 id_byte() {
      return (rdn_3)this.id_break[5];
   }

   public rrAg_1() {
      this.id_catch();
   }

   static {
      ntfClinit();
   }

   public int id_class() {
      return (Integer)this.id_break[1];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 13900203;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{109, -10, 55, -82, 6, 113, 57, -56}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 162559671018294786L;
   }

   public static rrAg_1 id_class(int var0, int var1, int var2, short var3, rXa_1 var4, rdn_3 var5) {
      rrAg_1 var10000 = (rrAg_1)id_class[0];
      Integer var10 = var0;
      var10000.id_break[0] = var10;
      var10000 = (rrAg_1)id_class[0];
      Integer var11 = var1;
      var10000.id_break[1] = var11;
      var10000 = (rrAg_1)id_class[0];
      Integer var12 = var2;
      var10000.id_break[2] = var12;
      var10000 = (rrAg_1)id_class[0];
      Short var13 = var3;
      var10000.id_break[3] = var13;
      ((rrAg_1)id_class[0]).id_break[4] = var4;
      ((rrAg_1)id_class[0]).id_break[5] = var5;
      return (rrAg_1)id_class[0];
   }

   public static void id_break(int var0, int var1, int var2, short var3, rXa_1 var4, rdn_3 var5) {
      rrAg_1 var6 = id_class(var0, var1, var2, var3, var4, var5);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var6);
   }

   public int id_break() {
      return (Integer)this.id_break[2];
   }

   public short id_throws() {
      return (Short)this.id_break[3];
   }

   private static void id_finally() {
      id_protected = new short[]{0, 0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 0, 0, 1, 2, 3, 4, 5};
   }

   private void id_catch() {
      if (this.id_break == null) {
         this.id_break = new Object[6];
         Object[] var1 = this.id_break;
         var1[0] = 0;
         var1[1] = 0;
         var1[2] = 0;
         var1[3] = (short)0;
      }
   }

   private static void id_extends() {
      id_throws = new boolean[]{false, false, false, true, false, false, false, true};
   }

   public int id_case() {
      return (Integer)this.id_break[0];
   }

   private static void id_implements() {
      id_byte = new byte[]{6, 2, 3};
   }

   public rXa_1 id_protected() {
      return (rXa_1)this.id_break[4];
   }

   private static void id_private() {
      Object[] var0 = new Object[]{new rrAg_1()};
      id_class = var0;
   }
}
