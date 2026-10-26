package celestial;

import it.unimi.dsi.fastutil.longs.Long2DoubleOpenHashMap;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bi_3 {
   private static short[] id_break;
   private static double[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_class;

   private static void id_byte() {
      id_byte = new double[]{1.0, 1.0};
   }

   public bi_3(Ps_1 var1, a_1 var2, EZ var3) {
      this(var2, var3);

      for (be_3 var5 : be_3.id_class(var1)) {
         var5.id_class((Long2DoubleOpenHashMap)this.id_class[id_break[0]]);
      }

      PP.a_.id_byte("Favoring size: " + ((Long2DoubleOpenHashMap)this.id_class[id_break[1]]).size());
   }

   public bi_3(a_1 var1, EZ var2) {
      this.id_protected();
      Long2DoubleOpenHashMap var9 = new Long2DoubleOpenHashMap();
      this.id_class[id_break[2]] = var9;
      ((Long2DoubleOpenHashMap)this.id_class[id_break[3]]).defaultReturnValue(1.0);
      double var3 = (Double)var2.id_break[25];
      if (var3 != 1.0 && var1 != null) {
         var1.id_break().forEach(var3x -> ((Long2DoubleOpenHashMap)this.id_class[id_break[7]]).put(rU_2.id_class(var3x), var3));
      }
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1328443734;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{32, 22, -103, 62, 106, 124, -105, 91}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public double id_class(long var1) {
      return ((Long2DoubleOpenHashMap)this.id_class[id_break[6]]).get(var1);
   }

   public boolean id_class() {
      return ((Long2DoubleOpenHashMap)this.id_class[id_break[5]]).isEmpty();
   }

   private static void id_break() {
      id_break = new short[]{0, 0, 0, 0, 25, 0, 0, 0};
   }

   private static long id_break(long var0) {
      return Long.rotateLeft(var0, 32) ^ 641646542431286422L;
   }

   private static void id_throws() {
      id_protected = new boolean[]{true};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }
}
