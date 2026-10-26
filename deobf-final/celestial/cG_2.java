package celestial;

import com.google.common.hash.Hashing;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class cG_2 extends rhd_3 implements rrce_3 {
   private static boolean[] break_;
   private static double[] finally_;
   private static short[] extends_;
   private static String[] native_;
   private static float[] volatile_;
   private static byte[] final_;
   public Object[] class_;

   private static void boolean_() {
      finally_ = new double[]{1.0, 2.0};
   }

   @Override
   public void byte_() {
      if (this.catch_()) {
         this.class_(this);
      }

      super.byte_();
   }

   public rqO_2 int_() {
      this.long_();
      return (rqO_2)this.class_[6];
   }

   private void long_() {
      if (this.class_ == null) {
         this.class_ = new Object[14];
         Object[] var1 = this.class_;
         var1[2] = 0.0F;
         var1[3] = 0.0F;
         var1[4] = 0.0F;
         var1[7] = false;
         var1[11] = 0.0F;
         var1[12] = 0.0F;
         var1[13] = 0.0F;
      }
   }

   private static void float_() {
      volatile_ = new float[]{1.0F, 1.1F, 0.0F, 1.0F, 20.0F, 1.0F, 1.0F, 1.0F, 0.15F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   public cG_2(gm_3 var1, GameProfile var2) {
      super(var1, var1.this_(), var1.else_(), var2);
      this.long_();
      Object var7 = null;
      this.class_[6] = var7;
      Boolean var8 = false;
      this.class_[7] = var8;
      this.class_[5] = var1;
      String var10 = var2.getName();
      this.class_[8] = var10;
      if ((String)this.class_[8] != null && !((String)this.class_[8]).isEmpty()) {
         String var11 = rql_3.class_((String)this.class_[8]);
         this.class_[8] = var11;
      }
   }

   static {
      ntfClinit();
   }

   public static fd_3 class_(rqO_2 var0, String var1) {
      fY_2 var2 = QY.instanceof_().A();
      Object var3 = var2.break_(var0);
      if (var3 == null) {
         var3 = new fd_3(
            (File)null,
            String.format("http://skins.minecraft.net/MinecraftSkins/%s.png", rql_3.class_(var1)),
            jH_2.class_(extends_(var1)),
            true,
            (Runnable)null
         );
         var2.class_(var0, (ff_3)var3);
      }

      return (fd_3)var3;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 292525767;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8132444906704134603L;
   }

   @Override
   public void class_(rruO var1) {
      this.long_();
      this.class_[0] = var1;
   }

   public static rqO_2 class_(String var0) {
      return new rqO_2("skins/" + Hashing.sha1().hashUnencodedChars(rql_3.class_(var0)));
   }

   public void class_(boolean var1) {
      this.long_();
      Boolean var6 = var1;
      this.class_[7] = var6;
   }

   public void class_(rqO_2 var1) {
      this.long_();
      this.class_[6] = var1;
   }

   private static void short_() {
      break_ = new boolean[]{false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, false, true, true, false, false};
   }

   public String break_() {
      Aw_1 var1 = this.continue_();
      return var1 == null ? jH_2.break_(this.ro()) : var1.throws_();
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{85, -78, -125, 96, 13, 77, -76, -89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public rruO throws_() {
      this.long_();
      return (rruO)this.class_[0];
   }

   public boolean finally_() {
      Aw_1 var1 = this.continue_();
      return var1 != null && var1.protected_() ? true : break_[8];
   }

   public boolean catch_() {
      return this.case_() == (rqO_2)rhd_3.protected_[8] ? true : break_[18];
   }

   @Override
   public String extends_() {
      this.long_();
      return (String)this.class_[8];
   }

   public rqO_2 case_() {
      this.long_();
      if (!rrbb_3.e()) {
         return null;
      } else if (this == (cb_3)QY.instanceof_().class_[57] || ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).class_(this)) {
         return (rqO_2)rhd_3.protected_[8];
      } else if ((rqO_2)this.class_[6] != null) {
         return (rqO_2)this.class_[6];
      } else {
         Aw_1 var1 = this.continue_();
         return var1 == null ? null : var1.catch_();
      }
   }

   public Aw_1 continue_() {
      this.long_();
      if ((Aw_1)this.class_[1] == null) {
         Aw_1 var5 = QY.instanceof_().void_().class_(this.ro());
         this.class_[1] = var5;
      }

      return (Aw_1)this.class_[1];
   }

   private static void else_() {
      extends_ = new short[]{6, 7, 5, 8, 8, 8, 8, 8, 1, 1, 1, 57, 0, 8, 6, 6, 18, 18, 18, 20, 8, 6, 6, 6, 7, 7, 7, 8, 0, 0};
   }

   @Override
   public boolean implements_() {
      Aw_1 var1 = QY.instanceof_().void_().class_(this.sv().getId());
      return var1 != null && var1.break_() == rRl_1.CREATIVE ? true : break_[4];
   }

   public float new_() {
      float var1 = 1.0F;
      if (((rhx_3)this.implements_[18]).break_) {
         var1 *= 1.1F;
      }

      var1 = (float)((double)var1 * ((this.class_(iQ_2.protected_) / (double)((rhx_3)this.implements_[18]).break_() + 1.0) / 2.0));
      if (((rhx_3)this.implements_[18]).break_() == 0.0F || Float.isNaN(var1) || Float.isInfinite(var1)) {
         var1 = volatile_[3];
      }

      if (this.return_() && this.sX().break_() instanceof rxQ_2) {
         int var2 = this.SU();
         float var3 = (float)var2 / 20.0F;
         if (var3 > 1.0F) {
            var3 = 1.0F;
         } else {
            var3 *= var3;
         }

         var1 *= 1.0F - var3 * 0.15F;
      }

      return rfU_2.catch_(((Qw_1)QY.instanceof_().class_[20]).e, 1.0F, var1);
   }

   public boolean package_() {
      this.long_();
      rqO_2 var1 = this.case_();
      if (this.catch_()) {
         return false;
      } else if (var1 == null) {
         return false;
      } else {
         return var1 == (rqO_2)this.class_[6] ? (Boolean)this.class_[7] : break_[16];
      }
   }

   public boolean super_() {
      return this.continue_() != null ? true : break_[6];
   }

   private static void static_() {
      final_ = new byte[]{14, 2, 3, 4, 7, 11, 12, 13};
   }

   private static void public_() {
      native_ = new String[]{new String("http://skins.minecraft.net/MinecraftSkins/%s.png")};
   }

   public boolean protected_() {
      return this.continue_() != null ? true : break_[10];
   }

   public boolean private_() {
      this.long_();
      return (Boolean)this.class_[7];
   }

   public rqO_2 final_() {
      Aw_1 var1 = this.continue_();
      return var1 == null ? jH_2.class_(this.ro()) : var1.case_();
   }

   public rqO_2 volatile_() {
      Aw_1 var1 = this.continue_();
      return var1 == null ? null : var1.private_();
   }

   @Override
   public boolean native_() {
      Aw_1 var1 = QY.instanceof_().void_().class_(this.sv().getId());
      return var1 != null && var1.break_() == rRl_1.SPECTATOR ? true : break_[2];
   }
}
