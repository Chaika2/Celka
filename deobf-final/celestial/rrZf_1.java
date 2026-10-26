package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZf_1 extends rrZN implements rrZT, rrZq_1<rrvB> {
   private static float[] protected_;
   private static double[] throws_;
   public Object[] break_;
   public static Object[] byte_;
   private static short[] case_;
   private static byte[] catch_;
   private static boolean[] private_;

   @Override
   public List<rrvB> byte_() {
      this.int_();
      Predicate var1 = var1x -> {
         this.int_();
         rrtY_2 var2 = ((rrvJ)this.break_[0]).finally_().extends_();
         String var3 = var2.final_();
         String var4 = var1x.break_().byte_();
         return var2.new_() ? true : var4.toLowerCase().contains(var3.trim().toLowerCase());
      };
      return ((List)this.break_[2]).stream().filter(var1).toList();
   }

   private void int_() {
      if (this.break_ == null) {
         this.break_ = new Object[4];
         Object[] var1 = this.break_;
         var1[3] = 0;
      }
   }

   public rrZf_1(rrvJ var1, int var2, int var3) {
      this.int_();
      ArrayList var14 = new ArrayList();
      this.break_[2] = var14;
      this.break_[0] = var1;
      Integer var16 = var2;
      this.break_[3] = var16;
      rrZl_1 var17 = new rrZl_1(new rrZH(0.5F));
      this.break_[1] = var17;
      Supplier var4 = () -> (float)var1.volatile_().abstract_() + (float)var2;
      Supplier var5 = () -> (float)var1.volatile_().finally_() + (float)var3;

      for (rrvP var9 : ((ThemeManager)ThemeManager.staticFieldsc3c8b26240a53959b0b3ce0fbbe0f311[0]).class_()) {
         ((List)this.break_[2]).add(new rrvB(this, var9, var4, var5, 75, 30));
      }
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, double var4, boolean var6) {
      this.int_();
      short var7 = 252;
      boolean var8 = this.class_(
         (Integer)rrvk_1.class_[0],
         (Integer)rrvk_1.class_[1],
         (float)(((rrvJ)this.break_[0]).volatile_().abstract_() + (Integer)this.break_[3]),
         (float)(((rrvJ)this.break_[0]).volatile_().finally_() + 38),
         (float)(363 - (Integer)this.break_[3] - 5),
         252.0F
      );
      this.finally_().class_(var8 && super.class_(var1, var2, var3, var4, var6) ? true : private_[8], var4, 25.0);
      return ((rrZl_1)this.break_[1]).class_(var1, var2, var3, var4, var6);
   }

   @Override
   public boolean class_(Ml_1 var1, rrtu_3 var2, float var3, float var4, float var5, float var6, int var7, int var8, boolean var9) {
      short var10 = 252;
      this.implements_()
         .class_(
            () -> {
               this.int_();
               List var9x = this.byte_();
               AnimValue var10x = this.implements_().class_();
               float var11 = 0.0F;
               float var12 = 0.0F;
               var10x.class_(!this.ai_() ? true : private_[13]);
               this.finally_().class_((float)this.break_(), 257.0F);
               float var13 = var10x.byte_();
               float var14 = (1.0F - var13) * 5.0F;

               for (int var15 = 0; var15 < var9x.size(); var15++) {
                  rrvB var16 = (rrvB)var9x.get(var15);
                  var11 += 83.0F;
                  if (var15 % 3 == 0) {
                     var11 = 0.0F;
                     var12 += 38.0F;
                  }

                  var16.class_(var11, var12 + this.finally_().case_() + var14);
                  rruv_1 var17 = var16.protected_();
                  if (!(var17.protected_() < var4) && !(var17.protected_() > var4 + 252.0F + 38.0F + 1.0F + 10.0F)) {
                     var16.class_(var1, var2, var7, var8, var17, var9, false);
                  }
               }

               this.implements_()
                  .class_(
                     var1,
                     (rrZl_1)this.break_[1],
                     var2,
                     var3 + var5 - 9.0F,
                     var4 + 4.0F + 38.0F,
                     var7,
                     var8,
                     5.0F,
                     251.0F,
                     (float)(this.break_() - 6),
                     255,
                     var9
                  );
            },
            var1,
            var3,
            var4,
            363.0F,
            299.0F
         );
      rrvJ.class_(var1, this.finally_(), var3 + 100.0F + 1.0F, var4 + 30.0F + 4.0F, var4 + 252.0F + 38.0F - 10.0F, 253.0F, 20.0F);
      return true;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7020779580871425429L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -484963537;
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.int_();
      ClickGuiScreen var6 = ((rrvJ)this.break_[0]).volatile_();
      int var7 = var6.abstract_();
      int var8 = var6.finally_();
      if (!this.class_(var2, var3, (float)(var7 + 100), (float)(var8 + 30 + 4), 263.0F, 266.0F)) {
         this.throws_();
         return false;
      } else if (!super.class_(var1, var2, var3, var4, var5)) {
         return false;
      } else {
         ((rrZl_1)this.break_[1]).class_(var1, var2, var3, var4, var5);
         List var9 = this.byte_();

         for (int var10 = var9.size() - 1; var10 >= 0; var10--) {
            rrvB var11 = (rrvB)var9.get(var10);
            if (var11.class_(var1, var2, var3, var4, var5)) {
               return true;
            }
         }

         this.throws_();
         return false;
      }
   }

   @Override
   public int break_() {
      List var1 = this.byte_();
      return var1.stream().filter(var1x -> var1.indexOf(var1x) % 3 == 0 ? true : private_[10]).mapToInt(var0 -> var0.extends_() + 8).sum();
   }

   @Override
   public void break_(int var1, int var2, int var3) {
      this.int_();
      ((rrZl_1)this.break_[1]).break_(var1, var2, var3);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{84, 38, 123, -40, 20, 70, 88, -102}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrZH finally_() {
      this.int_();
      return ((rrZl_1)this.break_[1]).extends_();
   }

   public rrvJ extends_() {
      this.int_();
      return (rrvJ)this.break_[0];
   }

   @Override
   public rrZl_1 case_() {
      this.int_();
      return (rrZl_1)this.break_[1];
   }

   private static void continue_() {
      case_ = new short[]{2, 0, 3, 1, 0, 2, 252, 0, 1, 1, 252, 0, 1, 0, 3, 0, 363, 3, 1, 1, 2, 1, 0, 1, 1, 0, 1, 255};
   }

   private static void new_() {
      Object[] var0 = new Object[]{75, 30, 83, 38};
      byte_ = var0;
   }

   private static void package_() {
      private_ = new boolean[]{false, true, false, false, true, true, false, true, false, true, false, true, true, false, false, false, false, false, true};
   }

   private static void super_() {
      protected_ = new float[]{
         0.5F,
         363.0F,
         299.0F,
         100.0F,
         1.0F,
         30.0F,
         4.0F,
         252.0F,
         38.0F,
         10.0F,
         253.0F,
         20.0F,
         263.0F,
         266.0F,
         252.0F,
         0.0F,
         0.0F,
         257.0F,
         1.0F,
         5.0F,
         83.0F,
         0.0F,
         38.0F,
         252.0F,
         38.0F,
         1.0F,
         10.0F,
         9.0F,
         4.0F,
         38.0F,
         5.0F,
         251.0F
      };
   }

   @Override
   public void private_() {
      this.int_();
      super.private_();
      ((rrZl_1)this.break_[1]).private_();
   }

   private static void final_() {
      throws_ = new double[]{25.0};
   }

   private static void volatile_() {
      catch_ = new byte[]{75, 30, 100, 30, 4, 38, 5, 8, 3, 3, 6, 4, 3, 4, 75, 30, 2, 83, 3, 38};
   }

   public rrZl_1 native_() {
      this.int_();
      return (rrZl_1)this.break_[1];
   }
}
