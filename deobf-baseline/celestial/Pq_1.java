package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pq_1 extends Pv_1 {
   private static long[] id_protected;
   public Object[] id_break;
   private static boolean[] id_throws;
   private static short[] id_case;
   private static double[] id_catch;
   private static byte[] id_private;
   public static Object[] id_byte;

   private static void id_byte() {
      Object[] var0 = new Object[]{20};
      id_byte = var0;
   }

   public Pq_1(C_class var1) {
      super(var1);
      this.id_private();
      rrfw_3 var6 = new rrfw_3();
      this.id_break[id_case[0]] = var6;
      Long var7 = TimeUnit.MINUTES.toMillis(id_protected[0]);
      this.id_break[id_case[1]] = var7;
      ArrayDeque var8 = new ArrayDeque();
      this.id_break[id_case[2]] = var8;
      Long var9 = id_protected[1];
      this.id_break[id_case[3]] = var9;
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(rrLU var1) {
      this.id_private();
      super.id_class(var1);
      if ((Long)this.id_break[id_case[15]] != id_protected[3]) {
         ((Queue)this.id_break[id_case[16]]).add(rqR_2.id_break() - (Long)this.id_break[id_case[17]]);
         Long var6 = id_protected[4];
         this.id_break[id_case[18]] = var6;
      }
   }

   @Override
   public void id_class(rrAM var1) {
      this.id_private();
      super.id_class(var1);
      ((rrfw_3)this.id_break[id_case[19]]).id_class();
      ((Queue)this.id_break[id_case[20]]).clear();
      Long var6 = id_protected[5];
      this.id_break[id_case[21]] = var6;
   }

   @Override
   public void id_class(j_1 var1) {
      this.id_private();
      super.id_class(var1);
      if (!((Queue)this.id_break[id_case[4]]).isEmpty()) {
         if (((rrfw_3)this.id_break[id_case[5]]).id_class((double)((Long)this.id_break[id_case[6]]).longValue())) {
            ((Queue)this.id_break[id_case[7]]).clear();
            ((rrfw_3)this.id_break[id_case[8]]).id_class();
         }

         if (((Queue)this.id_break[id_case[9]]).size() > id_private[0]) {
            ((Queue)this.id_break[id_case[10]]).poll();
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7707361345434514669L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1584471315;
   }

   public long id_class() {
      this.id_private();
      return ((Queue)this.id_break[id_case[22]]).size() < id_private[1]
         ? id_protected[6]
         : (long)((Queue)this.id_break[id_case[23]]).stream().mapToLong(Long::longValue).average().orElse(id_catch[0]);
   }

   @Override
   public void id_class(rrFe_1 var1) {
      this.id_private();
      super.id_class(var1);
      rrFa_1 var2 = var1.id_break();
      if (var2 == (rrFa_1)rrFa_1.staticFieldsc276c0e8494830db9e45df4464b752ad[id_case[11]] && (Long)this.id_break[id_case[12]] == id_protected[2]) {
         Long var7 = rqR_2.id_break();
         this.id_break[id_case[13]] = var7;
         ((rrfw_3)this.id_break[id_case[14]]).id_class();
      }
   }

   private static void id_break() {
      id_throws = new boolean[]{true, true, false};
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{80, -112, -50, 110, -28, -66, -97, 57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_private = new byte[]{20, 20, 4, 3, 20};
   }

   private static void id_catch() {
      id_case = new short[]{0, 1, 2, 3, 2, 0, 1, 2, 0, 2, 2, 0, 3, 3, 0, 3, 2, 3, 3, 0, 2, 3, 2, 2};
   }

   private static void id_case() {
      id_protected = new long[]{2L, -1L, -1L, -1L, -1L, -1L, 0L, 0L, 0L};
   }

   private static void id_protected() {
      id_catch = new double[1];
   }

   private void id_private() {
      if (this.id_break == null) {
         this.id_break = new Object[id_private[2]];
         Object[] var1 = this.id_break;
         var1[id_throws[0]] = id_protected[7];
         var1[id_private[3]] = id_protected[8];
      }
   }
}
