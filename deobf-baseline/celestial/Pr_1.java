package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongSupplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pr_1 {
   private static double[] id_byte;
   public static Object[] id_class;
   private static long[] id_protected;
   private static byte[] id_throws;
   private static boolean[] id_case;
   private static short[] id_catch;
   public Object[] id_break;

   public double id_byte() {
      return (double)(this.id_break() >>> id_throws[3]) * id_byte[0];
   }

   public Pr_1() {
      this(System.nanoTime() ^ System.currentTimeMillis());
   }

   private Pr_1(long[] var1) {
      this.id_throws();
      this.id_break[id_catch[1]] = var1;
   }

   public Pr_1(long var1) {
      this.id_throws();
      AtomicLong var3 = new AtomicLong(var1);
      LongSupplier var4 = () -> {
         long var1x = var3.addAndGet(id_protected[0]);
         var1x = (var1x ^ var1x >>> id_throws[17]) * id_protected[1];
         var1x = (var1x ^ var1x >>> id_throws[18]) * id_protected[2];
         return var1x ^ var1x >>> id_throws[19];
      };
      long[] var10001 = new long[id_throws[0]];
      var10001[id_case[0]] = var4.getAsLong();
      var10001[id_case[1]] = var4.getAsLong();
      var10001[id_throws[1]] = var4.getAsLong();
      var10001[id_throws[2]] = var4.getAsLong();
      long[] var9 = var10001;
      this.id_break[id_catch[0]] = var9;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0, int var2) {
      return var0 << var2 | var0 >>> id_throws[16] - var2;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1430502370;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7695174906451172496L;
   }

   public Pr_1 id_class() {
      return new Pr_1(Arrays.copyOf((long[])this.id_break[id_catch[17]], id_throws[15]));
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-33, -47, -49, -44, 126, 83, -10, -29}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public long id_break() {
      long var1 = id_class(((long[])this.id_break[id_catch[2]])[id_case[2]] + ((long[])this.id_break[id_catch[3]])[id_throws[4]], id_throws[5])
         + ((long[])this.id_break[id_catch[4]])[id_case[3]];
      long var3 = ((long[])this.id_break[id_catch[5]])[id_case[4]] << id_throws[6];
      ((long[])this.id_break[id_catch[6]])[id_throws[7]] = ((long[])this.id_break[id_catch[6]])[id_throws[7]]
         ^ ((long[])this.id_break[id_catch[7]])[id_case[5]];
      ((long[])this.id_break[id_catch[8]])[id_throws[8]] = ((long[])this.id_break[id_catch[8]])[id_throws[8]]
         ^ ((long[])this.id_break[id_catch[9]])[id_case[6]];
      ((long[])this.id_break[id_catch[10]])[id_case[7]] = ((long[])this.id_break[id_catch[10]])[id_case[7]]
         ^ ((long[])this.id_break[id_catch[11]])[id_throws[9]];
      ((long[])this.id_break[id_catch[12]])[id_case[8]] = ((long[])this.id_break[id_catch[12]])[id_case[8]]
         ^ ((long[])this.id_break[id_catch[13]])[id_throws[10]];
      ((long[])this.id_break[id_catch[14]])[id_throws[11]] = ((long[])this.id_break[id_catch[14]])[id_throws[11]] ^ var3;
      ((long[])this.id_break[id_catch[15]])[id_throws[12]] = id_class(((long[])this.id_break[id_catch[16]])[id_throws[13]], id_throws[14]);
      return var1;
   }

   private void id_throws() {
      if (this.id_break == null) {
         this.id_break = new Object[id_case[9]];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_finally() {
      Object[] var0 = new Object[]{1.110223E-16F};
      id_class = var0;
   }

   private static void id_catch() {
      id_protected = new long[]{-7046029254386353131L, -4658895280553007687L, -7723592293110705685L};
   }

   private static void id_case() {
      id_case = new boolean[]{false, true, false, false, true, false, true, true, false, true, true, false};
   }

   private static void id_implements() {
      id_byte = new double[]{1.110223E-16F, 1.110223E-16F};
   }

   private static void id_protected() {
      id_throws = new byte[]{4, 2, 3, 11, 3, 23, 17, 2, 3, 2, 3, 2, 3, 3, 45, 4, 64, 30, 27, 31};
   }

   private static void id_private() {
      id_catch = new short[18];
   }
}
