package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrTm_1 {
   private static short[] shorts9ecc5a8aa54b3c499a2c916d8fcc4ea4;
   private static boolean[] booleans9ecc5a8aa54b3c499a2c916d8fcc4ea4;
   public static Object[] staticFields9ecc5a8aa54b3c499a2c916d8fcc4ea4;
   public Object[] fields9ecc5a8aa54b3c499a2c916d8fcc4ea4;
   private static byte[] bytes9ecc5a8aa54b3c499a2c916d8fcc4ea4;
   private static String[] strings9ecc5a8aa54b3c499a2c916d8fcc4ea4;

   private static void id_byte() {
      bytes9ecc5a8aa54b3c499a2c916d8fcc4ea4 = new byte[]{2, 2};
   }

   private rrTm_1() {
      this.id_case();
      ArrayList var7 = new ArrayList();
      this.fields9ecc5a8aa54b3c499a2c916d8fcc4ea4[shorts9ecc5a8aa54b3c499a2c916d8fcc4ea4[1]] = var7;
      ArrayList var8 = new ArrayList();
      this.fields9ecc5a8aa54b3c499a2c916d8fcc4ea4[1] = var8;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8022568760434258156L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1262891847;
   }

   public void id_class(rrTZ var1) {
      ((List)this.fields9ecc5a8aa54b3c499a2c916d8fcc4ea4[1]).remove(var1);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{113, 2, 44, 114, -118, 60, 120, 100}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(rrHv_1 var1) {
      ((List)this.fields9ecc5a8aa54b3c499a2c916d8fcc4ea4[shorts9ecc5a8aa54b3c499a2c916d8fcc4ea4[3]]).add(var1);

      for (rrTZ var3 : (List)this.fields9ecc5a8aa54b3c499a2c916d8fcc4ea4[1]) {
         var3.id_class(var1);
      }
   }

   public List<rrTZ> id_class() {
      return (List<rrTZ>)this.fields9ecc5a8aa54b3c499a2c916d8fcc4ea4[1];
   }

   public List<rrHv_1> id_break() {
      return (List<rrHv_1>)this.fields9ecc5a8aa54b3c499a2c916d8fcc4ea4[shorts9ecc5a8aa54b3c499a2c916d8fcc4ea4[7]];
   }

   public void id_break(rrTZ var1) {
      ((List)this.fields9ecc5a8aa54b3c499a2c916d8fcc4ea4[1]).add(var1);
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{new rrTm_1(), null};
      var0[1] = new rrTm_1[]{(rrTm_1)var0[0]};
      staticFields9ecc5a8aa54b3c499a2c916d8fcc4ea4 = var0;
   }

   private void id_case() {
      if (this.fields9ecc5a8aa54b3c499a2c916d8fcc4ea4 == null) {
         this.fields9ecc5a8aa54b3c499a2c916d8fcc4ea4 = new Object[2];
         Object[] var1 = this.fields9ecc5a8aa54b3c499a2c916d8fcc4ea4;
      }
   }

   private static void id_implements() {
      booleans9ecc5a8aa54b3c499a2c916d8fcc4ea4 = new boolean[]{true, false, false, false, true};
   }

   private static void id_protected() {
      strings9ecc5a8aa54b3c499a2c916d8fcc4ea4 = new String[]{new String("INSTANCE")};
   }

   private static void id_private() {
      shorts9ecc5a8aa54b3c499a2c916d8fcc4ea4 = new short[]{1, 0, 1, 0, 1, 1, 1, 0, 1, 0};
   }
}
