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
   private static byte[] break_;
   private static double[] byte_;
   public Object[] class_;
   private static short[] protected_;
   private static boolean[] throws_;
   private static String[] case_;

   private static void byte_() {
      throws_ = new boolean[]{true, true, false, true, false, true, false, false, false, true, false, false, false, false};
   }

   public be_3(rfH_2 var1, double var2, int var4) {
      this(var1.b_(), var1.c_(), var1.d_(), var2, var4);
   }

   public be_3(int var1, int var2, int var3, double var4, int var6) {
      this.class_();
      Integer var11 = var1;
      this.class_[0] = var11;
      Integer var12 = var2;
      this.class_[1] = var12;
      Integer var13 = var3;
      this.class_[2] = var13;
      Double var14 = var4;
      this.class_[3] = var14;
      Integer var15 = var6;
      this.class_[4] = var15;
      Integer var16 = var6 * var6;
      this.class_[5] = var16;
   }

   static {
      ntfClinit();
   }

   public void class_(Long2DoubleOpenHashMap var1) {
      for (int var2 = -(Integer)this.class_[4]; var2 <= this.class_[4]; var2++) {
         for (int var3 = -(Integer)this.class_[4]; var3 <= this.class_[4]; var3++) {
            for (int var4 = -(Integer)this.class_[4]; var4 <= this.class_[4]; var4++) {
               if (var2 * var2 + var3 * var3 + var4 * var4 <= (Integer)this.class_[4] * (Integer)this.class_[4]) {
                  long var5 = rU_2.byte_((Integer)this.class_[0] + var2, (Integer)this.class_[1] + var3, (Integer)this.class_[2] + var4);
                  var1.put(var5, var1.get(var5) * (Double)this.class_[3]);
               }
            }
         }
      }
   }

   public double class_(int var1, int var2, int var3) {
      int var4 = var1 - (Integer)this.class_[0];
      int var5 = var2 - (Integer)this.class_[1];
      int var6 = var3 - (Integer)this.class_[2];
      return var4 * var4 + var5 * var5 + var6 * var6 <= this.class_[5] ? (Double)this.class_[3] : byte_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6543648761240366690L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-121, -117, 8, 89, 21, -29, 27, 56}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1351628224;
   }

   public static List<be_3> class_(Ps_1 var0) {
      if (!(Boolean)C_class.instanceof_().transient_.class_[0]) {
         return Collections.emptyList();
      } else {
         ArrayList var1 = new ArrayList();
         double var2 = (Double)C_class.instanceof_().D.class_[0];
         double var4 = (Double)C_class.instanceof_().this_.class_[0];
         if (var2 != 1.0) {
            var0.package_()
               .break_()
               .class_("mob_spawner", 1, (Integer)var0.volatile_().break_[0], (Integer)var0.volatile_().break_[2], 2)
               .forEach(var3 -> var1.add(new be_3(var3, var2, (Integer)C_class.instanceof_().BP.class_[0])));
         }

         if (var4 != 1.0) {
            var0.implements_()
               .filter(var0x -> var0x instanceof is_3)
               .filter(var1x -> var1x instanceof rGw_1 && !((double)var0.catch_().rX() < 0.5) ? throws_[6] : throws_[5])
               .filter(var0x -> var0x instanceof rbG_2 && ((rbG_2)var0x).Sr() == null ? throws_[4] : throws_[3])
               .filter(var0x -> var0x instanceof rEu_1 && !((rEu_1)var0x).sk() ? throws_[2] : throws_[1])
               .forEach(var3 -> var1.add(new be_3(var3.Bs(), var4, (Integer)C_class.instanceof_().long_.class_[0])));
         }

         return var1;
      }
   }

   private void class_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         Object[] var1 = this.class_;
         var1[0] = 0;
         var1[1] = 0;
         var1[2] = 0;
         var1[3] = 0.0;
         var1[4] = 0;
         var1[5] = 0;
      }
   }

   private static void break_() {
      case_ = new String[]{new String("mob_spawner")};
   }

   private static void throws_() {
      protected_ = new short[]{0, 1, 2, 3, 4, 5, 0, 1, 2, 5, 3, 0, 0, 0, 0, 2, 4, 4, 4, 4, 4, 4, 4, 4, 0, 1, 2, 3, 0, 0};
   }

   private static void case_() {
      byte_ = new double[]{1.0, 1.0, 1.0, 0.5, 0.0};
   }

   private static void protected_() {
      break_ = new byte[]{2, 6, 2, 3, 4, 5};
   }
}
