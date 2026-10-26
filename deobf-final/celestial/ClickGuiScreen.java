package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ClickGuiScreen extends vm_3 implements Zg_1, rrZF, rrZv_1, rrvE {
   private static short[] else_;
   private static String[] synchronized_;
   private static boolean[] return_;
   private static byte[] public_;
   public static Object[] class_;
   private static float[] goto_;
   public Object[] throws_;

   public void char_() {
      this.default_();
      Integer var5 = const_.extends_() / 4 - 181;
      this.throws_[4] = var5;
      Integer var6 = const_.native_() / 4 - 150;
      this.throws_[5] = var6;
   }

   @Override
   public void byte_(boolean var1) {
      this.default_();
      Boolean var6 = var1;
      this.throws_[3] = var6;
   }

   @Override
   public rdn_3 byte_() {
      this.default_();
      return ((rrvJ)this.throws_[0]).ag_();
   }

   public void int_() {
      this.continue_();
      import_.break_(this);
   }

   public boolean long_() {
      this.default_();
      return (Boolean)this.throws_[3];
   }

   public void float_() {
      rrIJ var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).catch_();
      var1.catch_();
   }

   public ClickGuiScreen() {
      super(rgP_2.byte_("ClickGUI"));
      this.default_();
      rrNM var5 = new rrNM((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[2], 0.3F);
      this.throws_[2] = var5;
      class_[0] = this;
      rrvJ var7 = new rrvJ(this, (rrtu_3)class_[1]);
      this.throws_[0] = var7;
      rrvS var8 = new rrvS(this);
      this.throws_[1] = var8;
   }

   static {
      ntfClinit();
   }

   public rrvJ interface_() {
      this.default_();
      return (rrvJ)this.throws_[0];
   }

   public void class_(rrFK var1) {
      this.default_();
      ((rrvJ)this.throws_[0]).class_(var1);
   }

   @Override
   public boolean class_(double var1, double var3, int var5) {
      this.default_();
      ((rrvJ)this.throws_[0]).break_((Integer)rrvk_1.class_[0], (Integer)rrvk_1.class_[1], var5);
      ((rrvS)this.throws_[1]).class_(var5);
      ((rrtu_3)class_[1]).class_((int)var1, (int)var3, var5);
      return super.class_(var1, var3, var5);
   }

   @Override
   public boolean class_(double var1, double var3, double var5) {
      this.default_();
      ((rrvJ)this.throws_[0]).class_((rrtu_3)class_[1], (Integer)rrvk_1.class_[0], (Integer)rrvk_1.class_[1], var5, (Boolean)this.throws_[3]);
      ((rrtu_3)class_[1]).class_((rrtu_3)class_[1], (Integer)rrvk_1.class_[0], (Integer)rrvk_1.class_[1], var5, true, (Boolean)this.throws_[3]);
      return super.class_(var1, var3, var5);
   }

   public boolean class_(int var1, int var2) {
      this.default_();
      return var1 >= this.throws_[4] && var1 <= this.throws_[4] + 100 && var2 >= this.throws_[5] && var2 <= this.throws_[5] + 30 ? true : return_[13];
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      this.default_();
      ((rrvJ)this.throws_[0]).class_(var1, var2, var3);
      ((rrtu_3)class_[1]).byte_(var1, var2, var3);
      boolean var4 = super.class_(var1, var2, var3);
      ((rrvJ)this.throws_[0]).byte_(var1, var2, var3);
      ((rrtu_3)class_[1]).break_(var1, var2, var3);
      return var4;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4178018201638223632L;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.default_();
      if (ClickGuiTheme.throws_() || !(Boolean)this.throws_[3]) {
         if (!(Boolean)this.throws_[3]) {
            ((rrNM)this.throws_[2]).class_(!this.public_() ? true : return_[1]);
         }

         rrvk_1.class_(
            var1,
            () -> rrfD_2.protected_(var1, 0.0F, 0.0F, (float)const_.new_(), (float)const_.continue_(), -1),
            (float)Math.max(1, (int)(10.0F * ((rrNM)this.throws_[2]).byte_()))
         );
         var1.class_();
         rrQo_1.class_(
            var1, (float)((Integer)this.throws_[4]).intValue(), (float)((Integer)this.throws_[5]).intValue(), 363.0F, 300.0F, ((rrNM)this.throws_[2]).byte_()
         );
         ((rrvS)this.throws_[1]).class_((Integer)rrvk_1.class_[0], (Integer)rrvk_1.class_[1]);
         ((rrvJ)this.throws_[0])
            .class_(
               var1,
               (rrtu_3)class_[1],
               (float)((Integer)this.throws_[4]).intValue(),
               (float)((Integer)this.throws_[5]).intValue(),
               363.0F,
               300.0F,
               (Integer)rrvk_1.class_[0],
               (Integer)rrvk_1.class_[1],
               true
            );
         ((rrtu_3)class_[1]).class_(var1, (Integer)rrvk_1.class_[0], (Integer)rrvk_1.class_[1], (Boolean)this.throws_[3]);
         var1.break_();
         super.class_(var1, var2, var3, var4);
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-27, 4, -36, 95, 92, -4, -105, -86}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(float var1, float var2) {
      this.default_();
      Integer var7 = (int)var1;
      this.throws_[4] = var7;
      Integer var8 = (int)var2;
      this.throws_[5] = var8;
   }

   @Override
   public boolean class_(char var1, int var2) {
      this.default_();
      ((rrvJ)this.throws_[0]).class_(var1, var2);
      ((rrtu_3)class_[1]).class_(var1, var2);
      return super.class_(var1, var2);
   }

   private void default_() {
      if (this.throws_ == null) {
         this.throws_ = new Object[6];
         Object[] var1 = this.throws_;
         var1[3] = false;
         var1[4] = 0;
         var1[5] = 0;
      }
   }

   private static void short_() {
      return_ = new boolean[]{
         true, false, true, true, true, true, false, true, false, false, false, false, true, false, true, false, true, false, false, false
      };
   }

   private static void void_() {
      goto_ = new float[]{0.3F, 10.0F, 363.0F, 300.0F, 363.0F, 300.0F, 0.0F, 0.0F};
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      this.default_();
      ((rrvJ)this.throws_[0]).class_((rrtu_3)class_[1], (Integer)rrvk_1.class_[0], (Integer)rrvk_1.class_[1], var5, true);
      ((rrvS)this.throws_[1]).class_((rrtu_3)class_[1], (Integer)rrvk_1.class_[0], (Integer)rrvk_1.class_[1], var5, true);
      ((rrtu_3)class_[1]).class_((Integer)rrvk_1.class_[0], (Integer)rrvk_1.class_[1], var5, false, (Boolean)this.throws_[3]);
      return super.break_(var1, var3, var5);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1680184854;
   }

   public int finally_() {
      this.default_();
      return (Integer)this.throws_[5];
   }

   private static void const_() {
      Object[] var0 = new Object[]{null, new rrtu_3(), new rqO_2("shaders/post/desaturate.json")};
      class_ = var0;
   }

   private static void import_() {
      public_ = new byte[]{100, 30, 4, 4, -1, 2, 6, 3, 4, 5, 3};
   }

   @Override
   public rrNG package_() {
      this.default_();
      return (rrNM)this.throws_[2];
   }

   @Override
   public void try_() {
      this.default_();
      super.try_();
      ((rrtu_3)class_[1]).catch_();
      ((rrvS)this.throws_[1]).class_(false);
   }

   private static void static_() {
      synchronized_ = new String[]{new String("ClickGUI"), new String("shaders/post/desaturate.json")};
   }

   @Override
   public void private_() {
      this.default_();
      super.private_();
      ((rrvJ)this.throws_[0]).protected_();
      ((rrtu_3)class_[1]).private_();
   }

   public int abstract_() {
      this.default_();
      return (Integer)this.throws_[4];
   }

   @Override
   public boolean final_() {
      return this.public_() && !this.package_().case_() ? true : return_[15];
   }

   public rrvS native_() {
      this.default_();
      return (rrvS)this.throws_[1];
   }

   private static void strictfp_() {
      else_ = new short[]{
         2,
         2,
         0,
         1,
         0,
         1,
         1,
         0,
         3,
         3,
         2,
         2,
         4,
         5,
         2,
         1,
         0,
         1,
         0,
         1,
         4,
         5,
         0,
         1,
         1,
         0,
         1,
         3,
         0,
         1,
         0,
         1,
         1,
         1,
         0,
         1,
         1,
         0,
         1,
         3,
         0,
         1,
         0,
         1,
         3,
         1,
         1,
         0,
         1,
         3,
         0,
         1,
         0,
         1,
         0,
         0,
         1,
         1,
         1,
         0,
         1,
         0,
         1,
         2,
         1,
         1,
         1,
         0,
         1,
         0,
         0,
         4,
         4,
         5,
         5,
         4,
         5,
         181,
         4,
         150,
         5,
         0,
         2,
         0,
         0,
         1,
         3,
         3,
         4,
         5
      };
   }

   @Override
   public boolean E_() {
      return ((rrvd_1)rrvd_1.staticFieldsf24d96aa22ff35f08b8eb2172b2f28e7[0]).break_() ? false : super.E_();
   }

   @Override
   public void v_() {
      this.default_();
      super.v_();
      this.char_();
      ((rrtu_3)class_[1]).break_();
      ((rrvJ)this.throws_[0]).catch_();
      this.float_();
   }

   @Override
   public boolean z_() {
      return false;
   }

   @Override
   public void w_() {
      this.default_();
      super.w_();
      ((rrvJ)this.throws_[0]).private_();
      ((rrtu_3)class_[1]).catch_();
      ((rrNM)this.throws_[2]).break_();
      ((rrvS)this.throws_[1]).class_(false);
   }
}
