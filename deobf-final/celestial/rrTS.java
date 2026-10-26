package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrTS {
   ;
   private static byte[] bytes35fc53f9a5633735b32b94862e310fdb;
   private static String[] strings35fc53f9a5633735b32b94862e310fdb;
   private static boolean[] booleans35fc53f9a5633735b32b94862e310fdb;
   private static short[] shorts35fc53f9a5633735b32b94862e310fdb;
   public Object[] fields35fc53f9a5633735b32b94862e310fdb;
   public static Object[] staticFields35fc53f9a5633735b32b94862e310fdb;

   private static void byte_() {
      shorts35fc53f9a5633735b32b94862e310fdb = new short[]{2, 0, 0, 0, 1};
   }

   private rrTS(rVi_1 var3) {
      this.break_();
      this.fields35fc53f9a5633735b32b94862e310fdb[0] = var3;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1002154820;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4773401775143737345L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{2, -108, 30, 34, 24, 60, 45, 95}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rVi_1 class_() {
      return (rVi_1)this.fields35fc53f9a5633735b32b94862e310fdb[0];
   }

   private void break_() {
      if (this.fields35fc53f9a5633735b32b94862e310fdb == null) {
         this.fields35fc53f9a5633735b32b94862e310fdb = new Object[1];
      }
   }

   private static void throws_() {
      Object[] var0 = new Object[]{
         new rrTS(rrfu_3.class_().break_(rVa_1.class_(rgF_2.GOLD), rVa_1.class_(rgF_2.YELLOW)).class_("ReallyWorld").break_()),
         new rrTS(rrfu_3.class_().break_(rVa_1.class_(rgF_2.DARK_RED), rVa_1.class_(rgF_2.RED)).class_("Funtime").break_()),
         null
      };
      var0[2] = new rrTS[]{(rrTS)var0[0], (rrTS)var0[1]};
      staticFields35fc53f9a5633735b32b94862e310fdb = var0;
   }

   private static void catch_() {
      bytes35fc53f9a5633735b32b94862e310fdb = new byte[]{2, 2, 3};
   }

   private static void case_() {
      booleans35fc53f9a5633735b32b94862e310fdb = new boolean[]{false, true, false, false, true, true, true};
   }

   private static void private_() {
      strings35fc53f9a5633735b32b94862e310fdb = new String[]{
         new String("REALLY_WORLD"), new String("ReallyWorld"), new String("FUNTIME"), new String("Funtime")
      };
   }
}
