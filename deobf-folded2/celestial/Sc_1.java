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
      if ((rfl_3)this.id_class[1] == null && !((Map)this.id_class[0]).isEmpty()) {
         int[] var10000 = new int[id_break[0]];
         var10000[0] = Integer.MAX_VALUE;
         var10000[1] = Integer.MAX_VALUE;
         var10000[2] = Integer.MAX_VALUE;
         int[] var1 = var10000;
         int[] var2 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};

         for (rfH_2 var4 : ((Map)this.id_class[0]).keySet()) {
            var1[0] = Math.min(var1[0], var4.b_());
            var1[1] = Math.min(var1[1], var4.c_());
            var1[2] = Math.min(var1[2], var4.d_());
            var2[0] = Math.max(var2[0], var4.b_() + 1);
            var2[1] = Math.max(var2[1], var4.c_() + 1);
            var2[2] = Math.max(var2[2], var4.d_() + 1);
         }

         rfl_3 var9;
         rfl_3 var10 = var9 = new rfl_3((double)var1[0], (double)var1[1], (double)var1[2], (double)var2[0], (double)var2[1], (double)var2[2]);
         this.id_class[1] = var9;
         return var10;
      } else {
         return (rfl_3)this.id_class[1];
      }
   }

   public Sc_1() {
      this.id_implements();
      HashMap var5 = new HashMap();
      this.id_class[0] = var5;
   }

   static {
      ntfClinit();
   }

   public void id_class(Map<rfH_2, xd_3> var1) {
      ((Map)this.id_class[0]).putAll(var1);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2124465920043303914L;
   }

   public void id_class(rfl_3 var1) {
      this.id_class[1] = var1;
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
      return (rfl_3)this.id_class[1];
   }

   public Map<rfH_2, xd_3> id_break() {
      return (Map<rfH_2, xd_3>)this.id_class[0];
   }

   public boolean id_throws() {
      return (rfl_3)this.id_class[1] != null ? true : id_throws[3];
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
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   public boolean id_protected() {
      return !((Map)this.id_class[0]).isEmpty() ? true : id_throws[1];
   }

   private static void id_private() {
      id_throws = new boolean[]{
         true, false, true, false, false, true, false, true, false, false, true, true, false, false, true, true, true, true, true, false, true, false, true
      };
   }
}
