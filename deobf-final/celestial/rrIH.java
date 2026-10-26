package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrIH {
   ;
   public Object[] fields0d29566e59ec37698621b18f09fc7b34;
   private static boolean[] booleans0d29566e59ec37698621b18f09fc7b34;
   private static byte[] bytes0d29566e59ec37698621b18f09fc7b34;
   private static short[] shorts0d29566e59ec37698621b18f09fc7b34;
   private static String[] strings0d29566e59ec37698621b18f09fc7b34;
   public static Object[] staticFields0d29566e59ec37698621b18f09fc7b34;

   private static void byte_() {
      shorts0d29566e59ec37698621b18f09fc7b34 = new short[]{1, 0, 0, 0, 0, 0, 0};
   }

   private rrIH() {
      this.implements_();
      ArrayList var7 = new ArrayList();
      this.fields0d29566e59ec37698621b18f09fc7b34[0] = var7;
      this.protected_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1205617738095681171L;
   }

   public List<rrIl_1> class_() {
      return (List<rrIl_1>)this.fields0d29566e59ec37698621b18f09fc7b34[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{78, 48, 93, 94, -63, 109, -25, 76}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(rrIl_1... var1) {
      ((List)this.fields0d29566e59ec37698621b18f09fc7b34[0]).addAll(List.of(var1));
   }

   public void class_(Ng_1 var1, rAL var2) {
      for (rrIl_1 var4 : (List)((rrIH)staticFields0d29566e59ec37698621b18f09fc7b34[0]).fields0d29566e59ec37698621b18f09fc7b34[0]) {
         var1.class_(var4.native_(), var4.volatile_(), var2);
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -385374809;
   }

   private static void break_() {
      booleans0d29566e59ec37698621b18f09fc7b34 = new boolean[]{false, true, true, false, false, false, true, true};
   }

   private static void throws_() {
      strings0d29566e59ec37698621b18f09fc7b34 = new String[]{new String("INSTANCE")};
   }

   private static void catch_() {
      Object[] var0 = new Object[]{new rrIH(), null};
      var0[1] = new rrIH[]{(rrIH)var0[0]};
      staticFields0d29566e59ec37698621b18f09fc7b34 = var0;
   }

   private static void case_() {
      bytes0d29566e59ec37698621b18f09fc7b34 = new byte[]{10, 2, 3, 4, 5, 6, 7, 8, 9, 2};
   }

   private void implements_() {
      if (this.fields0d29566e59ec37698621b18f09fc7b34 == null) {
         this.fields0d29566e59ec37698621b18f09fc7b34 = new Object[1];
         Object[] var1 = this.fields0d29566e59ec37698621b18f09fc7b34;
      }
   }

   private void protected_() {
      this.class_(new rrIR(), new rrIg_1(), new rrIY(), new rrIt_1(), new rrIT(), new rrIq_1(), new rrIw_1(), new rrIf_1(), new rrIj_1(), new rrII());
   }
}
