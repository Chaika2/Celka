package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtO_2 implements MinecraftAccessor {
   private static byte[] byte_;
   public Object[] class_;
   private static boolean[] protected_;
   private static short[] throws_;
   public static Object[] break_;
   private static long[] case_;
   private static float[] catch_;

   public boolean byte_() {
      return !this.synchronized_() && !((rrNM)this.class_[0]).case_() ? true : protected_[3];
   }

   public long int_() {
      return (Long)this.class_[7];
   }

   public rrtO_2(rrtX_2 var1, rVi_1 var2, rVi_1 var3, int var4) {
      this.public_();
      rrNM var9 = new rrNM((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[2], 0.3F);
      this.class_[0] = var9;
      AnimValue var10 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[2], 0.3F, false);
      this.class_[1] = var10;
      rrZO var11 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).case_();
      this.class_[5] = var11;
      rrZO var12 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).class_();
      this.class_[6] = var12;
      Boolean var13 = true;
      this.class_[9] = var13;
      this.class_[2] = var1;
      this.class_[3] = var2;
      this.class_[4] = var3;
      Integer var17 = var4;
      this.class_[8] = var17;
      Long var18 = rqR_2.break_();
      this.class_[7] = var18;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      byte_ = new byte[]{5, 16, 10, 7, 8, 9};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8890936727509582996L;
   }

   public void class_(boolean var1) {
      Boolean var6 = var1;
      this.class_[9] = var6;
   }

   public void class_(Ml_1 var1, float var2, float var3, float var4, float var5) {
      ((rrNM)this.class_[0]).class_(this.synchronized_());
      ((AnimValue)this.class_[1]).break_((float)((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).break_().indexOf(this));
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 191644962;
   }

   public boolean class_() {
      return (Boolean)this.class_[9];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-6, 73, 85, -48, 114, 38, 126, 111}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void break_() {
   }

   public rqA_2 throws_() {
      return rqn_3.zJ;
   }

   public float finally_() {
      return 25.0F;
   }

   public rrZO catch_() {
      return (rrZO)this.class_[5];
   }

   public float extends_() {
      float var1 = const_.volatile_();
      float var2 = this.native_();
      float var3 = this.package_();
      return var1 + -(var2 + 5.0F) * var3;
   }

   private static void goto_() {
      Object[] var0 = new Object[]{0.0F};
      break_ = var0;
   }

   public int case_() {
      return (int)(Math.min(this.package_(), 1.0F) * 255.0F);
   }

   public AnimValue continue_() {
      return (AnimValue)this.class_[1];
   }

   private static void else_() {
      throws_ = new short[]{2, 0, 2, 1, 0, 5, 0, 6, 9, 2, 3, 4, 8, 7, 0, 1, 0, 0, 7, 8, 1, 56, 0, 5, 3, 6, 4, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
   }

   public rrZO implements_() {
      return (rrZO)this.class_[6];
   }

   private static void instanceof_() {
      case_ = new long[1];
   }

   public rVi_1 new_() {
      return (rVi_1)this.class_[4];
   }

   public float package_() {
      return this.protected_().byte_();
   }

   private float return_() {
      byte var1 = 5;
      if ((gm_3)import_.class_[56] == null) {
         return (float)var1;
      } else {
         Hud var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().w();
         return var2.new_() + var2.while_() + (float)var1;
      }
   }

   public float super_() {
      float var1 = const_.final_() - this.finally_();
      float var2 = this.finally_() + 7.0F;
      float var3 = ((AnimValue)this.class_[1]).byte_();
      return var1 - this.return_() - var2 * var3;
   }

   private static void try_() {
      protected_ = new boolean[]{false, true, true, false, true, false, false, false, true, false};
   }

   private static void while_() {
      catch_ = new float[]{0.3F, 0.3F, 5.0F, 7.0F, 25.0F, 10.0F, 1.0F, 255.0F, 7.0F};
   }

   private void public_() {
      if (this.class_ == null) {
         this.class_ = new Object[10];
         Object[] var1 = this.class_;
         var1[7] = 0L;
         var1[8] = 0;
         var1[9] = false;
      }
   }

   public rrNM protected_() {
      return (rrNM)this.class_[0];
   }

   public int private_() {
      return (Integer)this.class_[8];
   }

   public rrtX_2 final_() {
      return (rrtX_2)this.class_[2];
   }

   public rVi_1 volatile_() {
      return (rVi_1)this.class_[3];
   }

   private boolean synchronized_() {
      return rqR_2.break_() - this.class_[7] < (long)((Integer)this.class_[8]).intValue() ? true : protected_[5];
   }

   public float native_() {
      byte var1 = 16;
      return 10.0F
         + Math.max(
            ((rrZO)this.class_[5]).break_(((rVi_1)this.class_[3]).byte_()) + (float)var1, ((rrZO)this.class_[6]).break_(((rVi_1)this.class_[4]).byte_())
         );
   }
}
