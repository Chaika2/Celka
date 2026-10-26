package celestial;

import java.io.File;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvJ extends rrZN implements rrZF, rrZL {
   private static String[] super_;
   public Object[] new_;
   public static Object[] continue_;
   private static short[] this_;
   private static float[] else_;
   private static byte[] synchronized_;
   private static boolean[] return_;

   private static void char_() {
      Object[] var0 = new Object[1];
      continue_ = var0;
   }

   @Override
   public void byte_(int var1, int var2, int var3) {
      this.interface_();
      super.byte_(var1, var2, var3);
      ((rrZt_1)this.new_[3]).byte_(var1, var2, var3);
      this.native_().byte_(var1, var2, var3);
      ((rrZy_1)this.new_[4]).byte_(var1, var2, var3);
   }

   private void byte_(ClickGuiScreen var1, rrtu_3 var2) {
      this.interface_();
      Runnable var3 = () -> ((vm_3)import_.class_[73]).goto_();
      Runnable var4 = () -> rqR_2.implements_().class_(new File(((File)import_.class_[24]).getAbsoluteFile() + "/celestial/"));
      Runnable var5 = () -> {
         float var2x = rfU_2.class_((float)var1.abstract_() - ((ClickGuiTheme)continue_[0]).implements_() - 10.0F, 5.0F, const_.volatile_() - 5.0F);
         float var3x = rfU_2.class_((float)var1.finally_(), 5.0F, (float)const_.native_() - ((ClickGuiTheme)continue_[0]).double_() - 5.0F);
         ((ClickGuiTheme)continue_[0]).class_(var2x, var3x);
         ((ClickGuiTheme)continue_[0]).class_(var2);
      };
      ((rruL)this.new_[1])
         .class_(
            new rruF(
                  new rrZC(
                        () -> "Выйти",
                        ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).throws_(),
                        () -> d_,
                        () -> new rjK_2(18.0F, 6.0F),
                        () -> implements_,
                        () -> new rjK_2((float)var1.abstract_() + 5.0F, (float)(var1.finally_() + 300) - 20.0F),
                        () -> new rjK_2(16.0F, 16.0F),
                        () -> d_
                     )
                     .<rrun_1>class_((rrul_1)rrul_1.staticFields9897caebb88b3588975198b6a548d1f7[1])
                     .class_(0.2F)
               )
               .class_(var3),
            new rruF(
                  new rrun_1(
                        () -> package_,
                        () -> new rjK_2((float)(var1.abstract_() + 363) - 35.0F, (float)var1.finally_() + 10.5F),
                        () -> new rjK_2(12.0F, 12.0F),
                        () -> d_
                     )
                     .<rrun_1>class_((rrul_1)rrul_1.staticFields9897caebb88b3588975198b6a548d1f7[1])
                     .class_(0.2F)
               )
               .class_(var4),
            new rruF(
                  new rrun_1(
                        () -> final_,
                        () -> new rjK_2((float)(var1.abstract_() + 363) - 19.0F, (float)var1.finally_() + 9.5F),
                        () -> new rjK_2(12.0F, 12.0F),
                        () -> d_
                     )
                     .<rrun_1>class_((rrul_1)rrul_1.staticFields9897caebb88b3588975198b6a548d1f7[1])
                     .class_(0.2F)
               )
               .class_(() -> !((ClickGuiTheme)continue_[0]).aq_() ? true : return_[15])
               .class_(var5)
         );
   }

   private void byte_(Ml_1 var1, float var2, float var3, int var4, int var5) {
      float var6 = 0.5F;
      rrfD_2.protected_(var1, var2 + 100.0F, var3 - 1.0F, 0.5F, (float)(var5 + 2), i_);
      rrfD_2.protected_(var1, var2 + 100.0F, var3 + 30.0F + 4.0F, (float)(var4 - 100 + 1), 0.5F, i_);
   }

   public rrvJ(ClickGuiScreen var1, rrtu_3 var2) {
      this.interface_();
      rruL var7 = new rruL();
      this.new_[1] = var7;
      this.new_[0] = var1;
      rrZt_1 var9 = new rrZt_1(this, 100);
      this.new_[3] = var9;
      rrZy_1 var10 = new rrZy_1(this);
      this.new_[4] = var10;
      this.class_(var1, var2);
      rrZm_1 var11 = new rrZm_1(this, var2, 100);
      this.new_[2] = var11;
      this.byte_(var1, var2);
   }

   static {
      ntfClinit();
   }

   private void interface_() {
      if (this.new_ == null) {
         this.new_ = new Object[5];
         Object[] var1 = this.new_;
      }
   }

   @Override
   public void class_(rrFK var1) {
      this.interface_();
      super.class_(var1);
      ((rrZt_1)this.new_[3]).class_(var1);
      ((rrZy_1)this.new_[4]).class_(var1);
      this.extends_().break_().forEach(var1x -> var1x.class_(var1));
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1642942189209148675L;
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, double var4, boolean var6) {
      this.interface_();
      ((rrZt_1)this.new_[3]).class_(var1, (Integer)rrvk_1.class_[0], (Integer)rrvk_1.class_[1], var4, var6);
      return this.native_().class_(var1, (Integer)rrvk_1.class_[0], (Integer)rrvk_1.class_[1], var4, var6);
   }

   public static void class_(Ml_1 var0, float var1, float var2, int var3, int var4) {
      rrfi_3.break_();
      rrfD_2.protected_(var0, var1, var2 + 30.0F + 5.0F, (float)var3, (float)(var4 - 30 - 5), -1);
      rrfi_3.class_(1);
   }

   private void class_(Ml_1 var1, float var2, float var3, int var4, int var5, int var6, int var7) {
      ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).byte_().byte_(var1, "Celestial", var2 + 35.0F, var3 + 12.0F, d_);
      if (ClickGuiTheme.class_()) {
         rrfD_2.byte_(var1, var2 + 5.0F, var3 + 4.0F, 25.0F, 25.0F, 4.0F, var4, var5, var6, var7);
      }

      rrfD_2.break_(var1, var2 + 5.0F, var3 + 4.0F, 25.0F, 25.0F, 4.0F, 4.0F, 4.0F, 4.0F, var4, var5, var6, var7);
      rrfD_2.class_(var1, volatile_, var2 + 5.5F, var3 + 4.5F, 24.0F, 24.0F, d_);
   }

   @Override
   public void class_(Category var1, Category var2) {
      this.interface_();
      super.class_(var1, var2);
      ((ClickGuiScreen)this.new_[0]).float_();
      this.extends_().break_().forEach(var2x -> var2x.class_(var1, var2));
      ((rrZy_1)this.new_[4]).class_(var1, var2);
      ((rrZy_1)this.new_[4]).extends_().byte_("");
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      this.interface_();
      return !((rrZt_1)this.new_[3]).class_(var1, var2, var3) && !this.native_().class_(var1, var2, var3) && !((rrZy_1)this.new_[4]).class_(var1, var2, var3)
         ? return_[9]
         : return_[8];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 207580004;
   }

   public rrZN class_(Category var1) {
      return this.extends_().class_(var1);
   }

   public static void class_(Ml_1 var0, rrZH var1, float var2, float var3, float var4, float var5, float var6) {
      byte var7 = 10;
      int var8 = (int)(255.0F * Math.min(var1.case_() / (float)(-var7), 1.0F));
      int var9 = (int)(255.0F * Math.min((var1.throws_() - var1.case_()) / (float)(-var7), 1.0F));
      rrfD_2.byte_(var0, var2, var3, var5, var6, q_, ColorHelper.break_(n_, var8));
      rrfD_2.byte_(var0, var2, var4, var5, var6, ColorHelper.break_(n_, var9), q_);
   }

   @Override
   public boolean class_(char var1, int var2) {
      this.interface_();
      return !((rrZy_1)this.new_[4]).class_(var1, var2) && !this.native_().class_(var1, var2) ? return_[7] : return_[6];
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.interface_();
      ((rrZy_1)this.new_[4]).class_(var1, (Integer)rrvk_1.class_[0], (Integer)rrvk_1.class_[1], var4, var5);
      ((rrZt_1)this.new_[3]).class_(var1, (Integer)rrvk_1.class_[0], (Integer)rrvk_1.class_[1], var4, var5);
      ((rruL)this.new_[1]).class_(var1, (Integer)rrvk_1.class_[0], (Integer)rrvk_1.class_[1], var4, true);
      rrZN var6 = this.native_();
      if (!var6.class_(var1, (Integer)rrvk_1.class_[0], (Integer)rrvk_1.class_[1], var4, var5)) {
         for (rrZN var8 : this.extends_().break_()) {
            if (var8 != var6) {
               var8.throws_();
            }
         }
      }

      return return_[5];
   }

   private void class_(Ml_1 var1, rrtu_3 var2, float var3, float var4, boolean var5) {
      this.interface_();
      ((rrZy_1)this.new_[4]).class_(var1, var2, var3 + 100.0F + 7.0F, var4, 215.0F, 15.0F, (Integer)rrvk_1.class_[0], (Integer)rrvk_1.class_[1], var5);
      ((rruL)this.new_[1]).class_(var1, var2, (Integer)rrvk_1.class_[0], (Integer)rrvk_1.class_[1], true, false);
   }

   private void class_(ClickGuiScreen var1, rrtu_3 var2) {
      ClickGuiTheme var7;
      ClickGuiTheme var10001 = var7 = new ClickGuiTheme(
         var1,
         () -> rfU_2.class_((float)var1.abstract_() - ((ClickGuiTheme)continue_[0]).implements_() - 10.0F, 5.0F, const_.volatile_() - 5.0F),
         () -> (float)var1.finally_()
      );
      continue_[0] = var7;
      var2.break_(var10001);
   }

   @Override
   public boolean class_(Ml_1 var1, rrtu_3 var2, float var3, float var4, float var5, float var6, int var7, int var8, boolean var9) {
      this.interface_();
      short var10 = 363;
      short var11 = 300;
      int var12 = ColorHelper.class_(0.0F);
      int var13 = ColorHelper.class_(90.0F);
      int var14 = ColorHelper.class_(270.0F);
      int var15 = ColorHelper.class_(180.0F);
      this.break_(var1, var3, var4, var10, var11);
      if (((ClickGuiScreen)this.new_[0]).long_()) {
         return false;
      } else {
         this.class_(var1, var3, var4, var12, var13, var14, var15);
         ((rrZt_1)this.new_[3]).class_(var1, var2, var3, var4, 100.0F, (float)var11, (Integer)rrvk_1.class_[0], (Integer)rrvk_1.class_[1], var9);
         this.class_(var1, var2, var3, var4 + 9.0F, var9);
         this.native_().class_(var1, var2, var3, var4, (float)var10, (float)var11, (Integer)rrvk_1.class_[0], (Integer)rrvk_1.class_[1], var9);
         this.byte_(var1, var3, var4, var10, var11);
         return true;
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{81, 66, 75, 40, -128, 86, 39, 112}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void break_(int var1, int var2, int var3) {
      this.interface_();
      ((rrZt_1)this.new_[3]).break_((Integer)rrvk_1.class_[0], (Integer)rrvk_1.class_[1], var3);
      this.native_().break_((Integer)rrvk_1.class_[0], (Integer)rrvk_1.class_[1], var3);
      ((rrZy_1)this.new_[4]).break_((Integer)rrvk_1.class_[0], (Integer)rrvk_1.class_[1], var3);
   }

   private void break_(Ml_1 var1, float var2, float var3, int var4, int var5) {
      rrfD_2.class_(var1, var2, var3, (float)var4, (float)var5, 8.0F, 8.0F, 8.0F, 8.0F, n_);
   }

   public rrZy_1 finally_() {
      this.interface_();
      return (rrZy_1)this.new_[4];
   }

   @Override
   public void catch_() {
      this.interface_();
      super.catch_();
      ((rrZt_1)this.new_[3]).catch_();
      ((rrZy_1)this.new_[4]).catch_();
      this.extends_().break_().forEach(rrZN::catch_);
   }

   public rrZm_1 extends_() {
      this.interface_();
      return (rrZm_1)this.new_[2];
   }

   private static void new_() {
      this_ = new short[]{
         1,
         0,
         3,
         4,
         2,
         0,
         1,
         0,
         1,
         1,
         1,
         363,
         300,
         0,
         3,
         0,
         1,
         0,
         1,
         4,
         0,
         1,
         3,
         0,
         1,
         1,
         0,
         1,
         0,
         1,
         4,
         3,
         0,
         1,
         0,
         1,
         3,
         0,
         1,
         0,
         1,
         4,
         0,
         1,
         3,
         4,
         3,
         4,
         3,
         4,
         3,
         4,
         0,
         4,
         4,
         3,
         4,
         3,
         4,
         0,
         4,
         0,
         1,
         1,
         0,
         1,
         5,
         0,
         2,
         4,
         0,
         363,
         363,
         300,
         0,
         0,
         0,
         0,
         24,
         73,
         0
      };
   }

   private static void package_() {
      super_ = new String[]{new String(""), new String("Celestial"), new String("Выйти")};
   }

   private static void try_() {
      else_ = new float[]{
         0.2F,
         0.2F,
         0.2F,
         0.0F,
         90.0F,
         270.0F,
         180.0F,
         100.0F,
         9.0F,
         8.0F,
         8.0F,
         8.0F,
         8.0F,
         35.0F,
         12.0F,
         5.0F,
         4.0F,
         25.0F,
         25.0F,
         4.0F,
         5.0F,
         4.0F,
         25.0F,
         25.0F,
         4.0F,
         4.0F,
         4.0F,
         4.0F,
         5.5F,
         4.5F,
         24.0F,
         24.0F,
         0.5F,
         100.0F,
         1.0F,
         0.5F,
         100.0F,
         30.0F,
         4.0F,
         0.5F,
         100.0F,
         7.0F,
         215.0F,
         15.0F,
         30.0F,
         5.0F,
         255.0F,
         1.0F,
         255.0F,
         1.0F,
         12.0F,
         12.0F,
         19.0F,
         9.5F,
         12.0F,
         12.0F,
         35.0F,
         10.5F,
         16.0F,
         16.0F,
         5.0F,
         20.0F,
         18.0F,
         6.0F,
         10.0F,
         5.0F,
         5.0F,
         5.0F,
         5.0F,
         10.0F,
         5.0F,
         5.0F
      };
   }

   private static void public_() {
      return_ = new boolean[]{false, true, false, true, true, true, true, false, true, false, true, true, false, true, true, false, true};
   }

   @Override
   public void protected_() {
      this.interface_();
      super.protected_();
      ((rrZt_1)this.new_[3]).protected_();
      ((rrZy_1)this.new_[4]).protected_();
      this.extends_().break_().forEach(rrZN::protected_);
   }

   @Override
   public void private_() {
      this.interface_();
      super.private_();
      ((rrZt_1)this.new_[3]).private_();
      ((rrZy_1)this.new_[4]).private_();
      this.extends_().break_().forEach(rrZN::private_);
   }

   public static void final_() {
      rrfi_3.class_();
   }

   public ClickGuiScreen volatile_() {
      this.interface_();
      return (ClickGuiScreen)this.new_[0];
   }

   private static void synchronized_() {
      synchronized_ = new byte[]{100, 100, 3, 2, 2, 100, 30, 5, -1, 10, 5};
   }

   public rrZN native_() {
      return this.class_((Category)rrZt_1.byte_[5]);
   }

   @Override
   public rdn_3 ag_() {
      return this.native_().ag_();
   }
}
