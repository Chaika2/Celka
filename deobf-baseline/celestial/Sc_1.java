package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class Sc_1 {
   private static byte[] id_break;
   private static int[] id_byte;
   public Object[] id_class;
   private static short[] id_protected;
   private static boolean[] id_throws;

   public rfl_3 id_byte() {
      if ((rfl_3)this.id_class[id_protected[3]] == null && !((Map)this.id_class[id_protected[4]]).isEmpty()) {
         int[] var10000 = new int[id_break[0]];
         var10000[id_throws[4]] = id_byte[0];
         var10000[id_throws[5]] = id_byte[1];
         var10000[id_break[1]] = id_byte[2];
         int[] var1 = var10000;
         var10000 = new int[id_break[2]];
         var10000[id_throws[6]] = id_byte[3];
         var10000[id_throws[7]] = id_byte[4];
         var10000[id_break[3]] = id_byte[5];
         int[] var2 = var10000;

         for (rfH_2 var4 : ((Map)this.id_class[id_protected[6]]).keySet()) {
            var1[id_throws[8]] = Math.min(var1[id_throws[9]], var4.b_());
            var1[id_throws[10]] = Math.min(var1[id_throws[11]], var4.c_());
            var1[id_break[4]] = Math.min(var1[id_break[5]], var4.d_());
            var2[id_throws[12]] = Math.max(var2[id_throws[13]], var4.b_() + id_throws[14]);
            var2[id_throws[15]] = Math.max(var2[id_throws[16]], var4.c_() + id_throws[17]);
            var2[id_break[6]] = Math.max(var2[id_break[7]], var4.d_() + id_throws[18]);
         }

         rfl_3 var9;
         rfl_3 var11 = var9 = new rfl_3(
            (double)var1[id_throws[19]],
            (double)var1[id_throws[20]],
            (double)var1[id_break[8]],
            (double)var2[id_throws[21]],
            (double)var2[id_throws[22]],
            (double)var2[id_break[9]]
         );
         this.id_class[id_protected[7]] = var9;
         return var11;
      } else {
         return (rfl_3)this.id_class[id_protected[5]];
      }
   }

   public Sc_1() {
      this.id_implements();
      HashMap var5 = new HashMap();
      this.id_class[id_protected[10]] = var5;
   }

   static {
      ntfClinit();
   }

   public void id_class(Map<rfH_2, xd_3> var1) {
      ((Map)this.id_class[id_protected[0]]).putAll(var1);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2124465920043303914L;
   }

   public void id_class(rfl_3 var1) {
      this.id_class[id_protected[11]] = var1;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-68, 113, 52, 4, 78, -111, 51, -84}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1067724748;
   }

   public rfl_3 id_class() {
      return (rfl_3)this.id_class[id_protected[9]];
   }

   public Map<rfH_2, xd_3> id_break() {
      return (Map<rfH_2, xd_3>)this.id_class[id_protected[8]];
   }

   public boolean id_throws() {
      return (rfl_3)this.id_class[id_protected[2]] != null ? id_throws[2] : id_throws[3];
   }

   private static void id_finally() {
      id_break = new byte[]{3, 2, 3, 2, 2, 2, 2, 2, 2, 2, 2};
   }

   private static void id_catch() {
      id_byte = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
   }

   private static void id_case() {
      id_protected = new short[]{0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1};
   }

   private void id_implements() {
      if (this.id_class == null) {
         this.id_class = new Object[id_break[10]];
         Object[] var1 = this.id_class;
      }
   }

   public boolean id_protected() {
      return !((Map)this.id_class[id_protected[1]]).isEmpty() ? id_throws[0] : id_throws[1];
   }

   private static void id_private() {
      id_throws = new boolean[]{
         true, false, true, false, false, true, false, true, false, false, true, true, false, false, true, true, true, true, true, false, true, false, true
      };
   }
}
