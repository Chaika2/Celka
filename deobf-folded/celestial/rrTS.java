package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrTS {
   private static byte[] bytes35fc53f9a5633735b32b94862e310fdb;
   private static String[] strings35fc53f9a5633735b32b94862e310fdb;
   private static boolean[] booleans35fc53f9a5633735b32b94862e310fdb;
   private static short[] shorts35fc53f9a5633735b32b94862e310fdb;
   public Object[] fields35fc53f9a5633735b32b94862e310fdb;
   public static Object[] staticFields35fc53f9a5633735b32b94862e310fdb;

   private static void id_byte() {
      shorts35fc53f9a5633735b32b94862e310fdb = new short[]{2, 0, 0, 0, 1};
   }

   private rrTS(rVi_1 var3) {
      this.id_break();
      this.fields35fc53f9a5633735b32b94862e310fdb[shorts35fc53f9a5633735b32b94862e310fdb[2]] = var3;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1002154820;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4773401775143737345L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{2, -108, 30, 34, 24, 60, 45, 95}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rVi_1 id_class() {
      return (rVi_1)this.fields35fc53f9a5633735b32b94862e310fdb[shorts35fc53f9a5633735b32b94862e310fdb[1]];
   }

   private void id_break() {
      if (this.fields35fc53f9a5633735b32b94862e310fdb == null) {
         this.fields35fc53f9a5633735b32b94862e310fdb = new Object[1];
      }
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{
         new rrTS(
            rrfu_3.id_class()
               .id_break(rVa_1.id_class(rgF_2.GOLD), rVa_1.id_class(rgF_2.YELLOW))
               .id_class(strings35fc53f9a5633735b32b94862e310fdb[1])
               .id_break()
         ),
         new rrTS(
            rrfu_3.id_class()
               .id_break(rVa_1.id_class(rgF_2.DARK_RED), rVa_1.id_class(rgF_2.RED))
               .id_class(strings35fc53f9a5633735b32b94862e310fdb[3])
               .id_break()
         ),
         null
      };
      var0[2] = new rrTS[]{(rrTS)var0[0], (rrTS)var0[1]};
      staticFields35fc53f9a5633735b32b94862e310fdb = var0;
   }

   private static void id_catch() {
      bytes35fc53f9a5633735b32b94862e310fdb = new byte[]{2, 2, 3};
   }

   private static void id_case() {
      booleans35fc53f9a5633735b32b94862e310fdb = new boolean[]{false, true, false, false, true, true, true};
   }

   private static void id_private() {
      strings35fc53f9a5633735b32b94862e310fdb = new String[]{
         new String("REALLY_WORLD"), new String("ReallyWorld"), new String("FUNTIME"), new String("Funtime")
      };
   }
}
