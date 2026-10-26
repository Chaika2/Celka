package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GU extends bq_3 {
   private static short[] id_throws;
   private static double[] id_catch;
   private static boolean[] id_private;
   public Object[] id_break;
   private static String[] id_implements;
   private static byte[] id_finally;

   @Override
   public boolean id_byte() {
      return ((Ps_1)this.id_case[id_throws[0]]).id_catch() != null && ((Ps_1)this.id_case[id_throws[1]]).id_case() != null ? id_private[1] : id_private[0];
   }

   private static void id_int() {
      id_finally = new byte[]{3, 2};
   }

   public GU(C_class var1) {
      super(var1);
      this.id_final();
   }

   static {
      ntfClinit();
   }

   @Override
   public rn_3 id_class(boolean var1, boolean var2) {
      this.id_final();
      Boolean var7 = var2;
      this.id_break[id_throws[6]] = var7;
      if ((Boolean)this.id_break[id_throws[7]]) {
         Boolean var8 = id_private[8];
         this.id_break[id_throws[8]] = var8;
         if (this.id_implements()) {
            Integer var9 = (Integer)this.id_break[id_throws[9]] + id_private[9];
            this.id_break[id_throws[10]] = var9;
         }

         return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_throws[11]]);
      } else {
         Integer var10 = Integer.valueOf(id_private[10]);
         this.id_break[id_throws[12]] = var10;
         return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_throws[13]]);
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-32, 95, 50, -75, 105, 10, 54, -14}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1657275220;
   }

   @Override
   public String id_class() {
      return id_implements[0];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2628449614538763159L;
   }

   private static void id_finally() {
      id_implements = new String[]{new String("inventory pauser")};
   }

   @Override
   public boolean id_catch() {
      return id_private[11];
   }

   private static void id_extends() {
      id_private = new boolean[]{false, true, true, false, true, true, true, false, false, true, false, true, false, false, true, false, false};
   }

   @Override
   public double id_case() {
      return id_catch[1];
   }

   private boolean id_implements() {
      return this.id_native() < id_catch[0] ? id_private[2] : id_private[3];
   }

   private static void id_package() {
      id_catch = new double[]{1.0E-5, 5.1};
   }

   public boolean id_private() {
      this.id_final();
      Boolean var5 = id_private[4];
      this.id_break[id_throws[3]] = var5;
      return this.id_break[id_throws[4]] && this.id_break[id_throws[5]] > id_private[5] ? id_private[6] : id_private[7];
   }

   private void id_final() {
      if (this.id_break == null) {
         this.id_break = new Object[id_finally[0]];
         Object[] var1 = this.id_break;
         var1[id_private[12]] = id_private[13];
         var1[id_private[14]] = id_private[15];
         var1[id_finally[1]] = Integer.valueOf(id_private[16]);
      }
   }

   private static void id_volatile() {
      id_throws = new short[]{1, 1, 1, 0, 1, 2, 1, 0, 0, 2, 2, 1, 2, 5};
   }

   private double id_native() {
      rjU_2 var1 = ((Ps_1)this.id_case[id_throws[2]]).id_catch().rv();
      return Math.sqrt(var1.id_break * var1.id_break + var1.id_protected * var1.id_protected);
   }
}
