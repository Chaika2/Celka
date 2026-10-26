package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrIH {
   public Object[] fields0d29566e59ec37698621b18f09fc7b34;
   private static boolean[] booleans0d29566e59ec37698621b18f09fc7b34;
   private static byte[] bytes0d29566e59ec37698621b18f09fc7b34;
   private static short[] shorts0d29566e59ec37698621b18f09fc7b34;
   private static String[] strings0d29566e59ec37698621b18f09fc7b34;
   public static Object[] staticFields0d29566e59ec37698621b18f09fc7b34;

   private static void id_byte() {
      shorts0d29566e59ec37698621b18f09fc7b34 = new short[]{1, 0, 0, 0, 0, 0, 0};
   }

   private rrIH() {
      this.id_implements();
      ArrayList var7 = new ArrayList();
      this.fields0d29566e59ec37698621b18f09fc7b34[shorts0d29566e59ec37698621b18f09fc7b34[1]] = var7;
      this.id_protected();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1205617738095681171L;
   }

   public List<rrIl_1> id_class() {
      return (List<rrIl_1>)this.fields0d29566e59ec37698621b18f09fc7b34[shorts0d29566e59ec37698621b18f09fc7b34[5]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{78, 48, 93, 94, -63, 109, -25, 76}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(rrIl_1... var1) {
      ((List)this.fields0d29566e59ec37698621b18f09fc7b34[shorts0d29566e59ec37698621b18f09fc7b34[2]]).addAll(List.of(var1));
   }

   public void id_class(Ng_1 var1, rAL var2) {
      for (rrIl_1 var4 : (List)((rrIH)staticFields0d29566e59ec37698621b18f09fc7b34[shorts0d29566e59ec37698621b18f09fc7b34[3]]).fields0d29566e59ec37698621b18f09fc7b34[shorts0d29566e59ec37698621b18f09fc7b34[4]]) {
         var1.id_class(var4.id_native(), var4.id_volatile(), var2);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -385374809;
   }

   private static void id_break() {
      booleans0d29566e59ec37698621b18f09fc7b34 = new boolean[]{false, true, true, false, false, false, true, true};
   }

   private static void id_throws() {
      strings0d29566e59ec37698621b18f09fc7b34 = new String[]{new String("INSTANCE")};
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{new rrIH(), null};
      var0[1] = new rrIH[]{(rrIH)var0[0]};
      staticFields0d29566e59ec37698621b18f09fc7b34 = var0;
   }

   private static void id_case() {
      bytes0d29566e59ec37698621b18f09fc7b34 = new byte[]{10, 2, 3, 4, 5, 6, 7, 8, 9, 2};
   }

   private void id_implements() {
      if (this.fields0d29566e59ec37698621b18f09fc7b34 == null) {
         this.fields0d29566e59ec37698621b18f09fc7b34 = new Object[1];
         Object[] var1 = this.fields0d29566e59ec37698621b18f09fc7b34;
      }
   }

   private void id_protected() {
      rrIl_1[] var10001 = new rrIl_1[10];
      var10001[booleans0d29566e59ec37698621b18f09fc7b34[0]] = new rrIR();
      var10001[1] = new rrIg_1();
      var10001[2] = new rrIY();
      var10001[3] = new rrIt_1();
      var10001[4] = new rrIT();
      var10001[5] = new rrIq_1();
      var10001[6] = new rrIw_1();
      var10001[7] = new rrIf_1();
      var10001[8] = new rrIj_1();
      var10001[9] = new rrII();
      this.id_class(var10001);
   }
}
