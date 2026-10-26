package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZI extends rrZN implements rrZT, rrZq_1<rrZi_1> {
   private static String[] protected_;
   public static Object[] break_;
   private static float[] throws_;
   private static double[] case_;
   private static short[] catch_;
   private static byte[] private_;
   private static boolean[] implements_;
   public Object[] byte_;

   @Override
   public List<rrZi_1> byte_() {
      this.package_();
      Predicate var1 = var1x -> {
         this.package_();
         Module var2 = var1x.private_();
         rrtY_2 var3 = ((rrvJ)this.byte_[0]).finally_().extends_();
         String var4 = var3.final_().trim().toLowerCase();
         boolean var5 = var3.new_();
         if (var5) {
            return var2.int_() == (Category)rrZt_1.byte_[5] ? true : implements_[11];
         } else {
            String var6 = var2.final_().replaceAll("[- ]", "").toLowerCase();
            String var7 = var2.final_().toLowerCase();
            String var8 = var2.ay_().toLowerCase();
            return !var6.contains(var4) && !var7.contains(var4) && !var8.contains(var4) ? implements_[13] : implements_[12];
         }
      };
      return ((List)this.byte_[1]).stream().filter(var1).toList();
   }

   private static void int_() {
      case_ = new double[]{25.0};
   }

   public rrZI(rrvJ var1, rrtu_3 var2, int var3, int var4) {
      this.package_();
      ArrayList var13 = new ArrayList();
      this.byte_[1] = var13;
      EnumMap var14 = new EnumMap<>(Category.class);
      this.byte_[2] = var14;
      this.byte_[0] = var1;
      Integer var16 = var3;
      this.byte_[3] = var16;
      Supplier var5 = () -> (float)var1.volatile_().abstract_() + (float)var3;
      Supplier var6 = () -> (float)var1.volatile_().finally_() + (float)var4;

      for (Module var8 : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().g()) {
         ((List)this.byte_[1]).add(new rrZi_1(this, var2, var1.volatile_(), var8, var5, var6, 117, 30));
      }
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      catch_ = new short[]{1, 2, 0, 3, 0, 1, 253, 0, 253, 0, 1, 0, 3, 0, 363, 3, 2, 1, 2, 5, 0, 1, 0, 5, 255, 255};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3149884901384872226L;
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.package_();
      ClickGuiScreen var6 = ((rrvJ)this.byte_[0]).volatile_();
      int var7 = var6.abstract_();
      int var8 = var6.finally_();
      if (!this.class_(var2, var3, (float)(var7 + 100), (float)(var8 + 30 + 4), 263.0F, 266.0F)) {
         this.throws_();
         return false;
      } else if (!super.class_(var1, var2, var3, var4, var5)) {
         return false;
      } else {
         this.volatile_().class_(var1, var2, var3, var4, var5);
         List var9 = this.byte_();

         for (int var10 = var9.size() - 1; var10 >= 0; var10--) {
            rrZi_1 var11 = (rrZi_1)var9.get(var10);
            if (var11.class_(var1, var2, var3, var4, var5)) {
               return true;
            }
         }

         this.throws_();
         return false;
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1423632777;
   }

   @Override
   public void class_(Category var1, Category var2) {
      this.implements_().class_().extends_();
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, double var4, boolean var6) {
      this.package_();
      short var7 = 253;
      boolean var8 = this.class_(
         (Integer)rrvk_1.class_[0],
         (Integer)rrvk_1.class_[1],
         (float)(((rrvJ)this.byte_[0]).volatile_().abstract_() + (Integer)this.byte_[3]),
         (float)(((rrvJ)this.byte_[0]).volatile_().finally_() + 37),
         (float)(363 - (Integer)this.byte_[3] - 5),
         (float)var7
      );
      this.extends_().class_(var8 && super.class_(var1, var2, var3, var4, var6) ? true : implements_[7], var4, 25.0);
      return this.volatile_().class_(var1, var2, var3, var4, var6);
   }

   @Override
   public boolean class_(Ml_1 var1, rrtu_3 var2, float var3, float var4, float var5, float var6, int var7, int var8, boolean var9) {
      short var10 = 253;
      rrZl_1 var11 = this.volatile_();
      rrZH var12 = var11.extends_();
      this.implements_().class_(() -> {
         List var11x = this.byte_();
         AnimValue var12x = this.implements_().class_();
         int var13 = this.break_();
         float var14 = 0.0F;
         float var15 = 0.0F;
         var12x.class_(!this.ai_() ? true : implements_[15]);
         var12.class_((float)var13, 258.0F);
         float var16 = var12x.byte_();
         float var17 = (1.0F - var16) * 5.0F;

         for (int var18 = 0; var18 < var11x.size(); var18++) {
            rrZi_1 var19 = (rrZi_1)var11x.get(var18);
            var14 += 124.0F;
            if (var18 % 2 == 0) {
               var14 = 0.0F;
               var15 += 37.0F;
            }

            var19.class_(var14, var15 + var12.case_() + var17);
            rruv_1 var20 = var19.protected_();
            if (!(var20.protected_() < var4) && !(var20.protected_() > var4 + 253.0F + 37.0F + 10.0F)) {
               var19.class_(var1, var2, var7, var8, var20, var9, false);
            }
         }

         this.implements_().class_(var1, var11, var2, var3 + var5 - 9.0F, var4 + 5.0F + 37.0F, var7, var8, 5.0F, 251.0F, (float)(var13 - 7), 255, var9);
      }, var1, var3, var4, 363.0F, 299.0F);
      rrvJ.class_(var1, var12, var3 + 100.0F + 1.0F, var4 + 30.0F + 4.0F, var4 + 253.0F + 37.0F - 10.0F, 253.0F, 20.0F);
      return true;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{24, -43, -26, 62, -71, 3, 22, 1}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void break_(int var1, int var2, int var3) {
      this.volatile_().break_(var1, var2, var3);
   }

   @Override
   public int break_() {
      List var1 = this.byte_();
      return var1.stream().filter(var1x -> var1.indexOf(var1x) % 2 == 0 ? true : implements_[9]).mapToInt(var0 -> var0.break_() + 7).sum();
   }

   public List<rrZi_1> finally_() {
      this.package_();
      return (List<rrZi_1>)this.byte_[1];
   }

   public rrZH extends_() {
      return this.volatile_().extends_();
   }

   @Override
   public rrZl_1 case_() {
      return this.volatile_();
   }

   private static void continue_() {
      private_ = new byte[]{117, 30, 100, 30, 4, 37, 5, 7, 2, 2, 7, 25, 4, 4, 3, 5, 117, 30, 2, 124, 3, 37, 4};
   }

   private static void else_() {
      implements_ = new boolean[]{
         true, false, false, true, true, false, true, false, true, false, true, false, true, false, true, false, false, false, false, false, true, false
      };
   }

   private static void new_() {
      protected_ = new String[]{new String("[- ]"), new String("")};
   }

   private void package_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[4];
         Object[] var1 = this.byte_;
         var1[3] = 0;
      }
   }

   private static void super_() {
      throws_ = new float[]{
         363.0F,
         299.0F,
         100.0F,
         1.0F,
         30.0F,
         4.0F,
         253.0F,
         37.0F,
         10.0F,
         253.0F,
         20.0F,
         263.0F,
         266.0F,
         0.5F,
         0.0F,
         0.0F,
         258.0F,
         1.0F,
         5.0F,
         124.0F,
         0.0F,
         37.0F,
         253.0F,
         37.0F,
         10.0F,
         9.0F,
         5.0F,
         37.0F,
         5.0F,
         251.0F
      };
   }

   @Override
   public void private_() {
      this.package_();
      super.private_();
      ((Map)this.byte_[2]).values().forEach(rrZl_1::private_);
   }

   private static void final_() {
      Object[] var0 = new Object[]{117, 30, 124, 37, -15132391};
      break_ = var0;
   }

   public rrZl_1 volatile_() {
      this.package_();
      return ((Map)this.byte_[2]).computeIfAbsent((Category)rrZt_1.byte_[5], var0 -> new rrZl_1(new rrZH(0.5F)));
   }

   public rrvJ native_() {
      this.package_();
      return (rrvJ)this.byte_[0];
   }
}
