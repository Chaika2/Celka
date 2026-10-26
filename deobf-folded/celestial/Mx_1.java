package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Mx_1 extends MM {
   private static String[] id_protected;
   private static double[] id_throws;
   public Object[] id_break;
   private static int[] id_case;
   private static byte[] id_catch;
   private static short[] id_private;
   private static boolean[] id_implements;

   private void id_int() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
      }
   }

   public Mx_1(rcd_3 var1, boolean var2) {
      this.id_int();
      this.id_break[1] = var1;
      rja_3 var8 = new rja_3(this.id_protected(id_protected[0]), this.id_protected(id_protected[1]), this.id_protected(id_protected[2]));
      this.id_break[id_private[1]] = var8;
      Integer var9 = Math.abs(((rcd_3)this.id_break[1]).id_int(id_protected[3]).id_int(id_protected[4]).id_private(id_protected[5]));
      this.id_class[1] = var9;
      if (var2) {
         Integer var10 = Math.abs(((rcd_3)this.id_break[1]).id_int(id_protected[6]).id_int(id_protected[7]).id_private(id_protected[8]));
         this.id_class[id_private[5]] = var10;
         Integer var11 = Math.abs(((rcd_3)this.id_break[1]).id_int(id_protected[9]).id_int(id_protected[10]).id_private(id_protected[11]));
         this.id_class[2] = var11;
      } else {
         Integer var12 = Math.abs(((rcd_3)this.id_break[1]).id_int(id_protected[12]).id_int(id_protected[13]).id_private(id_protected[14]));
         this.id_class[id_private[9]] = var12;
         Integer var13 = Math.abs(((rcd_3)this.id_break[1]).id_int(id_protected[15]).id_int(id_protected[16]).id_private(id_protected[17]));
         this.id_class[2] = var13;
      }

      xc_3[][][] var14 = new xc_3[this.id_class[id_private[12]]][this.id_class[2]][this.id_class[1]];
      this.id_byte[id_private[15]] = var14;
      this.id_implements();
   }

   static {
      ntfClinit();
   }

   private static <T extends Comparable<T>> xc_3 id_class(xc_3 var0, rCZ<T> var1, String var2) {
      Optional var3 = var1.id_break(var2);
      if (var3.isPresent()) {
         return var0.id_class(var1, (Comparable)var3.get());
      } else {
         throw new IllegalArgumentException("Invalid value for property " + var1);
      }
   }

   private static xc_3 id_class(xd_3 var0, rcd_3 var1) {
      xc_3 var2 = var0.id_continue();
      Object[] var3 = var1.id_protected().toArray();
      int var4 = var3.length;

      for (int var5 = id_implements[2]; var5 < var4; var5++) {
         Object var6 = var3[var5];
         rCZ var7 = var0.id_new().id_class((String)var6);
         String var8 = var1.id_native((String)var6);
         if (var7 != null) {
            var2 = id_class(var2, var7, var8);
         }
      }

      return var2;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7200999688664337847L;
   }

   private static int id_class(rcd_3 var0, String var1, String var2) {
      int var3 = var0.id_int(id_protected[19]).id_int(var1).id_int(id_protected[20]).id_private(var2);
      int var4 = var0.id_int(id_protected[21]).id_int(var1).id_int(id_protected[22]).id_private(var2);
      if (var4 < 0) {
         var4++;
      }

      return Math.min(var3, var3 + var4);
   }

   private static boolean id_class(rcd_3 var0, String var1, int var2, int var3, int var4) {
      return var2 >= 0
            && var3 >= 0
            && var4 >= 0
            && var2 < Math.abs(var0.id_int(id_protected[36]).id_int(var1).id_int(id_protected[37]).id_private(id_protected[38]))
            && var3 < Math.abs(var0.id_int(id_protected[39]).id_int(var1).id_int(id_protected[40]).id_private(id_protected[41]))
            && var4 < Math.abs(var0.id_int(id_protected[42]).id_int(var1).id_int(id_protected[43]).id_private(id_protected[44]))
         ? true
         : id_implements[4];
   }

   private static xc_3[] id_class(rcy_3 var0) {
      xc_3[] var1 = new xc_3[var0.size()];

      for (int var2 = id_implements[1]; var2 < var0.size(); var2++) {
         xd_3 var3 = rVL.id_strictfp.id_class(new rqO_2(((rcd_3)var0.id_finally(var2)).id_native(id_protected[23])));
         rcd_3 var4 = ((rcd_3)var0.id_finally(var2)).id_int(id_protected[24]);
         var1[var2] = id_class(var3, var4);
      }

      return var1;
   }

   private static String[] id_class(rcd_3 var0) {
      return var0.id_int(id_protected[18]).id_protected().toArray(new String[id_implements[0]]);
   }

   public Mx_1 id_class(boolean var1) {
      this.id_int();
      return new Mx_1((rcd_3)this.id_break[1], var1);
   }

   private static long[] id_class(rcd_3 var0, String var1) {
      return var0.id_int(id_protected[34]).id_int(var1).id_package(id_protected[35]);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 62648604;
   }

   private void id_class(rcd_3 var1, String var2, xc_3[] var3, Md_1 var4) {
      this.id_int();
      rja_3 var5 = new rja_3(id_class(var1, var2, id_protected[47]), id_class(var1, var2, id_protected[48]), id_class(var1, var2, id_protected[49]));
      int var6 = id_implements[7];

      for (int var7 = id_implements[8]; var7 < this.id_class[1]; var7++) {
         for (int var8 = id_implements[9]; var8 < this.id_class[2]; var8++) {
            for (int var9 = id_implements[10]; var9 < this.id_class[id_private[25]]; var9++) {
               if (id_class(var1, var2, var9, var7, var8)) {
                  ((xc_3[][][])this.id_byte[id_private[26]])[var9 - (((rja_3)this.id_break[id_private[27]]).b_() - var5.b_())][var8
                     - (((rja_3)this.id_break[id_private[28]]).d_() - var5.d_())][var7 - (((rja_3)this.id_break[id_private[29]]).c_() - var5.c_())] = var3[var4.id_class(
                     (long)var6
                  )];
                  var6++;
               }
            }
         }
      }
   }

   private static int id_break(int var0) {
      return (int)Math.max(2.0, Math.ceil(Math.log((double)var0) / Math.log(2.0)));
   }

   public void id_break(int var1, int var2, int var3, xc_3 var4) {
      ((xc_3[][][])this.id_byte[id_private[34]])[var1][var3][var2] = var4;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{89, -103, -11, 88, 40, 108, 90, -8}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_break(rcd_3 var0, String var1) {
      return (long)Math.abs(
         var0.id_int(id_protected[25]).id_int(var1).id_int(id_protected[26]).id_private(id_protected[27])
            * var0.id_int(id_protected[28]).id_int(var1).id_int(id_protected[29]).id_private(id_protected[30])
            * var0.id_int(id_protected[31]).id_int(var1).id_int(id_protected[32]).id_private(id_protected[33])
      );
   }

   public int id_throws() {
      return (Integer)this.id_class[id_private[31]];
   }

   private static void id_finally() {
      id_throws = new double[]{2.0, 2.0};
   }

   public int id_catch() {
      return (Integer)this.id_class[2];
   }

   private static void id_extends() {
      id_case = new int[]{Integer.MAX_VALUE};
   }

   public rja_3 id_case() {
      this.id_int();
      return (rja_3)this.id_break[id_private[30]];
   }

   private void id_implements() {
      this.id_int();
      String[] var1 = id_class((rcd_3)this.id_break[1]);
      int var2 = var1.length;

      for (int var3 = id_implements[6]; var3 < var2; var3++) {
         String var4 = var1[var3];
         rcy_3 var5 = ((rcd_3)this.id_break[1]).id_int(id_protected[45]).id_int(var4).id_protected(id_protected[46], 10);
         xc_3[] var6 = id_class(var5);
         int var7 = id_break(var5.size());
         long var8 = id_break((rcd_3)this.id_break[1], var4);
         long[] var10 = id_class((rcd_3)this.id_break[1], var4);
         Md_1 var11 = new Md_1(var7, var8, var10);
         this.id_class((rcd_3)this.id_break[1], var4, var6, var11);
      }
   }

   private static void id_package() {
      id_private = new short[]{1, 0, 1, 1, 1, 0, 1, 2, 1, 0, 1, 2, 0, 2, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 1, 2, 0, 1};
   }

   private int id_protected(String var1) {
      this.id_int();
      int var2 = Integer.MAX_VALUE;
      String[] var3 = id_class((rcd_3)this.id_break[1]);
      int var4 = var3.length;

      for (int var5 = id_implements[5]; var5 < var4; var5++) {
         String var6 = var3[var5];
         var2 = Math.min(var2, id_class((rcd_3)this.id_break[1], var6, var1));
      }

      return var2;
   }

   public int id_private() {
      return (Integer)this.id_class[1];
   }

   private static void id_final() {
      id_implements = new boolean[]{false, false, false, true, false, false, false, false, false, false, false};
   }

   private static void id_volatile() {
      id_protected = new String[]{
         new String("x"),
         new String("y"),
         new String("z"),
         new String("Metadata"),
         new String("EnclosingSize"),
         new String("y"),
         new String("Metadata"),
         new String("EnclosingSize"),
         new String("z"),
         new String("Metadata"),
         new String("EnclosingSize"),
         new String("x"),
         new String("Metadata"),
         new String("EnclosingSize"),
         new String("x"),
         new String("Metadata"),
         new String("EnclosingSize"),
         new String("z"),
         new String("Regions"),
         new String("Regions"),
         new String("Position"),
         new String("Regions"),
         new String("Size"),
         new String("Name"),
         new String("Properties"),
         new String("Regions"),
         new String("Size"),
         new String("x"),
         new String("Regions"),
         new String("Size"),
         new String("y"),
         new String("Regions"),
         new String("Size"),
         new String("z"),
         new String("Regions"),
         new String("BlockStates"),
         new String("Regions"),
         new String("Size"),
         new String("x"),
         new String("Regions"),
         new String("Size"),
         new String("y"),
         new String("Regions"),
         new String("Size"),
         new String("z"),
         new String("Regions"),
         new String("BlockStatePalette"),
         new String("x"),
         new String("y"),
         new String("z")
      };
   }

   private static void id_native() {
      id_catch = new byte[]{10, 2};
   }
}
