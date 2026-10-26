package celestial;

import it.unimi.dsi.fastutil.longs.Long2DoubleOpenHashMap;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class be_3 {
   private static byte[] id_break;
   private static double[] id_byte;
   public Object[] id_class;
   private static short[] id_protected;
   private static boolean[] id_throws;
   private static String[] id_case;

   private static void id_byte() {
      id_throws = new boolean[]{true, true, false, true, false, true, false, false, false, true, false, false, false, false};
   }

   public be_3(rfH_2 var1, double var2, int var4) {
      this(var1.b_(), var1.c_(), var1.d_(), var2, var4);
   }

   public be_3(int var1, int var2, int var3, double var4, int var6) {
      this.id_class();
      Integer var11 = var1;
      this.id_class[0] = var11;
      Integer var12 = var2;
      this.id_class[1] = var12;
      Integer var13 = var3;
      this.id_class[2] = var13;
      Double var14 = var4;
      this.id_class[3] = var14;
      Integer var15 = var6;
      this.id_class[4] = var15;
      Integer var16 = var6 * var6;
      this.id_class[5] = var16;
   }

   static {
      ntfClinit();
   }

   public void id_class(Long2DoubleOpenHashMap var1) {
      for (int var2 = -(Integer)this.id_class[4]; var2 <= this.id_class[4]; var2++) {
         for (int var3 = -(Integer)this.id_class[4]; var3 <= this.id_class[4]; var3++) {
            for (int var4 = -(Integer)this.id_class[4]; var4 <= this.id_class[4]; var4++) {
               if (var2 * var2 + var3 * var3 + var4 * var4 <= (Integer)this.id_class[4] * (Integer)this.id_class[4]) {
                  long var5 = rU_2.id_byte((Integer)this.id_class[0] + var2, (Integer)this.id_class[1] + var3, (Integer)this.id_class[2] + var4);
                  var1.put(var5, var1.get(var5) * (Double)this.id_class[3]);
               }
            }
         }
      }
   }

   public double id_class(int var1, int var2, int var3) {
      int var4 = var1 - (Integer)this.id_class[0];
      int var5 = var2 - (Integer)this.id_class[1];
      int var6 = var3 - (Integer)this.id_class[2];
      return var4 * var4 + var5 * var5 + var6 * var6 <= this.id_class[5] ? (Double)this.id_class[3] : id_byte[0];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6543648761240366690L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-121, -117, 8, 89, 21, -29, 27, 56}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1351628224;
   }

   public static List<be_3> id_class(Ps_1 var0) {
      if (!(Boolean)C_class.id_instanceof().id_transient.id_class[0]) {
         return Collections.emptyList();
      } else {
         ArrayList var1 = new ArrayList();
         double var2 = (Double)C_class.id_instanceof().D.id_class[0];
         double var4 = (Double)C_class.id_instanceof().id_this.id_class[0];
         if (var2 != 1.0) {
            var0.id_package()
               .id_break()
               .id_class("mob_spawner", 1, (Integer)var0.id_volatile().id_break[0], (Integer)var0.id_volatile().id_break[2], 2)
               .forEach(var3 -> var1.add(new be_3(var3, var2, (Integer)C_class.id_instanceof().BP.id_class[0])));
         }

         if (var4 != 1.0) {
            var0.id_implements()
               .filter(var0x -> var0x instanceof is_3)
               .filter(var1x -> var1x instanceof rGw_1 && !((double)var0.id_catch().rX() < 0.5) ? id_throws[6] : id_throws[5])
               .filter(var0x -> var0x instanceof rbG_2 && ((rbG_2)var0x).Sr() == null ? id_throws[4] : id_throws[3])
               .filter(var0x -> var0x instanceof rEu_1 && !((rEu_1)var0x).sk() ? id_throws[2] : id_throws[1])
               .forEach(var3 -> var1.add(new be_3(var3.Bs(), var4, (Integer)C_class.id_instanceof().id_long.id_class[0])));
         }

         return var1;
      }
   }

   private void id_class() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
         Object[] var1 = this.id_class;
         var1[0] = 0;
         var1[1] = 0;
         var1[2] = 0;
         var1[3] = 0.0;
         var1[4] = 0;
         var1[5] = 0;
      }
   }

   private static void id_break() {
      id_case = new String[]{new String("mob_spawner")};
   }

   private static void id_throws() {
      id_protected = new short[]{0, 1, 2, 3, 4, 5, 0, 1, 2, 5, 3, 0, 0, 0, 0, 2, 4, 4, 4, 4, 4, 4, 4, 4, 0, 1, 2, 3, 0, 0};
   }

   private static void id_case() {
      id_byte = new double[]{1.0, 1.0, 1.0, 0.5, 0.0};
   }

   private static void id_protected() {
      id_break = new byte[]{2, 6, 2, 3, 4, 5};
   }
}
