package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public abstract class rrnK_2 extends rrTF<AttackAura> {
   private static boolean[] byte_;
   private static byte[] protected_;
   public static Object[] class_;
   public Object[] break_;
   private static float[] case_;
   private static short[] catch_;
   private static double[] private_;

   public abstract float byte_();

   public abstract float int_();

   public rrnK_2(AttackAura var1, rrTT var2) {
      super(var1);
      this.goto_();
      this.break_[0] = var2;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      private_ = new double[]{180.0, Math.PI, 90.0, 180.0, Math.PI, Double.MAX_VALUE, 8.0, 12.0, 0.0, 0.0};
   }

   public void class_(boolean var1) {
      this.goto_();
      Boolean var6 = var1;
      this.break_[1] = var6;
   }

   public void class_(AttackAura var1, iB_2 var2, rrnD_2 var3) {
      if (var2 != null && rmD_2.break_ && var1.float_()) {
         if (var3.case_() && var3.class_(var1, 2.0F, 50, false, false, 1)) {
            ((cb_3)import_.class_[57]).c_(false);
            Integer var8 = 1;
            var3.break_[6] = var8;
         }
      }
   }

   public List<rrTA> class_(an_3 var1, rfl_3 var2) {
      ArrayList var3 = new ArrayList();
      rjU_2 var4 = ((cb_3)import_.class_[57]).new_(1.0F);
      float var5 = 0.08F;
      float var6 = 0.0F;
      float var7 = 0.0F;
      double var8 = var2.class_ + (double)var5;
      double var10 = var2.protected_ - (double)var5;
      double var12 = var2.byte_ + (double)var5;
      double var14 = var2.case_ - (double)var5;
      double var16 = var10 - var8;
      double var18 = var16 / 8.0;
      double var20 = (var2.throws_ - var2.break_) / 12.0;
      float var22 = this.continue_().try_();

      for (double var23 = var2.break_; var23 < var2.throws_; var23 += var20) {
         if (!(var23 < var1.re() + (double)var7) && !(var23 > var2.throws_ - (double)var6)) {
            for (double var25 = private_[8]; var25 < var16; var25 += var18) {
               rrTn_1 var27 = new rrTn_1(new rjU_2(var8, var23, var12 + var25));
               var3.add(var27);
               rrTn_1 var28 = new rrTn_1(new rjU_2(var10, var23, var12 + var25));
               var3.add(var28);
               rrTn_1 var29 = new rrTn_1(new rjU_2(var8 + var25, var23, var12));
               var3.add(var29);
               rrTn_1 var30 = new rrTn_1(new rjU_2(var8 + var25, var23, var14));
               var3.add(var30);
            }

            rrTn_1 var32 = new rrTn_1(new rjU_2(var10, var23, var14));
            var3.add(var32);
         }
      }

      ArrayList var31 = new ArrayList();
      boolean var24 = this.native_();
      boolean var33 = var24 && !var3.stream().anyMatch(var3x -> var3x.class_(var4, var1, var1xx -> !this.class_(var1xx) ? true : byte_[14]))
         ? byte_[9]
         : byte_[8];

      for (rrTA var34 : var3) {
         rjU_2 var35 = var34.rr();
         if (!var24 || var34.class_(var4, var1, var1x -> !this.class_(var1x) ? true : byte_[12]) || !var33) {
            rfo_3 var36 = rhj_3.class_((cb_3)import_.class_[57], var1, var4, var35, (double)var22);
            if (var36 != null) {
               var31.add(var34);
            }
         }
      }

      return var31.isEmpty() ? var3 : var31;
   }

   public void class_(iB_2 var1) {
      this.goto_();
      this.continue_().long_().class_(var1, (rrTT)this.break_[0]);
   }

   public void class_(q_1 var1) {
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         AttackAura var2 = this.continue_();
         this.class_(var2, var2.continue_(), var2.long_());
      }
   }

   public boolean class_(xc_3 var1) {
      return false;
   }

   public void class_(rrTj_1 var1, rrTI var2) {
      this.goto_();
      if (this.continue_().B()) {
         ((rrTT)this.break_[0]).class_(var1, var2);
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{80, -91, 77, 17, 77, -123, 126, -74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public double class_(rrTA var1, List<rrTA> var2, PX var3, PX var4) {
      double var5 = 0.0;
      var5 += PJ.break_(var3.throws_(), var4.throws_());
      return var5 + PJ.class_(var3.protected_(), var4.protected_());
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6105436487107228796L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -249422440;
   }

   public float class_(rjU_2 var1, rjU_2 var2) {
      double var3 = var2.break_ - var1.break_;
      double var5 = var2.protected_ - var1.protected_;
      return (float)(Math.atan2(var5, var3) * 180.0 / Math.PI - 90.0);
   }

   public Pair<rrTA, rrTA> class_(an_3 var1, PX var2) {
      ((List)rrTT.break_[1]).clear();
      List var3 = this.class_(var1, var1.rN());
      ((List)rrTT.break_[1]).addAll(var3);
      Object var4 = new rrTn_1(var1.new_(1.0F));
      PX var5 = var2.byte_();
      double var6 = Double.MAX_VALUE;

      for (rrTA var9 : var3) {
         PX var10 = PJ.class_(var9);
         double var11 = this.class_(var9, var3, var5, var10);
         if (var11 < var6) {
            var6 = var11;
            var4 = var9;
         }
      }

      return Pair.of(var4, var4);
   }

   public void class_() {
      this.goto_();
      ((rrTT)this.break_[0]).final_();
   }

   public boolean class_(PX var1) {
      return true;
   }

   public float break_(rjU_2 var1, rjU_2 var2) {
      double var3 = var2.break_ - var1.break_;
      double var5 = var2.byte_ - var1.byte_;
      double var7 = var2.protected_ - var1.protected_;
      return (float)(-Math.atan2(var5, Math.sqrt(var3 * var3 + var7 * var7)) * 180.0 / Math.PI);
   }

   public boolean break_(PX var1) {
      return true;
   }

   public boolean break_() {
      this.goto_();
      return (Boolean)this.break_[1];
   }

   public void throws_() {
   }

   public rrTH finally_() {
      return (var0, var1, var2) -> {
         float var3 = rfU_2.catch_(var1 - var0);
         if (var3 > var2) {
            return var0 + var2;
         } else {
            return var3 < -var2 ? var0 - var2 : var1;
         }
      };
   }

   public rrTI extends_() {
      this.goto_();
      return ((rrTT)this.break_[0]).implements_();
   }

   private void goto_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         this.break_[1] = false;
      }
   }

   public rrTq_1 case_() {
      return null;
   }

   private static void else_() {
      protected_ = new byte[]{50, 2};
   }

   public rrTC implements_() {
      this.goto_();
      return ((rrTT)this.break_[0]).protected_();
   }

   public PX new_() {
      this.goto_();
      return new PX(((rrTT)this.break_[0]).private_(), ((rrTT)this.break_[0]).super_());
   }

   public rrTH package_() {
      return this.finally_();
   }

   private static void return_() {
      case_ = new float[]{2.0F, 1.0F, 1.0F, 0.08F, 0.0F, 0.0F};
   }

   private static void while_() {
      catch_ = new short[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 57, 6, 1, 1, 57, 57, 1, 1};
   }

   private static void public_() {
      Object[] var0 = new Object[]{new Random()};
      class_ = var0;
   }

   public abstract rrTf_1 protected_();

   public PX private_() {
      this.goto_();
      return ((rrTT)this.break_[0]).byte_();
   }

   public rrTj_1 final_() {
      return null;
   }

   public void volatile_() {
      this.goto_();
      ((rrTT)this.break_[0]).finally_();
   }

   private static void synchronized_() {
      byte_ = new boolean[]{false, false, true, false, true, false, true, true, true, false, true, true, false, true, false, false, true, false, true};
   }

   public boolean native_() {
      return true;
   }

   @Override
   public boolean aK_() {
      this.class_();
      return super.aK_();
   }
}
