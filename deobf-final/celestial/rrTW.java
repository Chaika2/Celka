package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTW extends Fu_1<rJr_1> {
   private static boolean[] case_;
   private static float[] catch_;
   private static short[] private_;
   public Object[] class_;
   private static String[] implements_;
   private static byte[] finally_;
   public static Object[] throws_;

   private static void char_() {
      catch_ = new float[]{1.0F};
   }

   public rrTW(vm_3 var1, rJr_1 var2, rJr_1 var3, rgP_2 var4, float[] var5) {
      super(var3, null, var4);
      this.final_();
      if (var5 != null && var5.length == 3) {
         this.class_[0] = var1;
         this.class_[1] = var2;
         this.class_[2] = var5;
         this.synchronized_ = 176;
         this.return_ = 78;
      } else {
         throw new IllegalArgumentException("ShulkerColors must be an array of three float values representing RGB colors.");
      }
   }

   static {
      ntfClinit();
   }

   private static void interface_() {
      case_ = new boolean[]{false, true, false, false, false, true, false, false, true};
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      this.final_();
      if ((var1 == 256 || ((Qw_1)this.volatile_.class_[20]).z.class_(var1, var2)) && (vm_3)this.class_[0] != null) {
         this.volatile_.break_((vm_3)this.class_[0]);
         if ((rJr_1)this.class_[1] != null && (cb_3)this.volatile_.class_[57] != null) {
            cb_3 var10000 = (cb_3)this.volatile_.class_[57];
            rJr_1 var8 = (rJr_1)this.class_[1];
            var10000.implements_[4] = var8;
         }

         return case_[5];
      } else {
         return case_[6];
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8746467889157739660L;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      super.class_(var1, var2, var3, var4);
      this.break_(var1, var2, var3);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-11, 72, 107, -44, -52, 82, -127, 4}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void class_(Ml_1 var1, float var2, int var3, int var4) {
      this.final_();
      float[] var5 = (float[])this.class_[2];
      RenderSystem.color4f(var5[0], var5[1], var5[2], 1.0F);
      this.volatile_.A().class_((rqO_2)throws_[0]);
      int var6 = this.char_;
      int var7 = this.abstract_;
      this.break_(var1, var6, var7, 0, 0, this.synchronized_, this.return_);
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      return false;
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -812665479;
   }

   private static void finally_() {
      implements_ = new String[]{
         new String("ShulkerColors must be an array of three float values representing RGB colors."),
         new String("celestial/images/shulker_preview/container_with_title.png")
      };
   }

   private static void package_() {
      Object[] var0 = new Object[]{new rqO_2("celestial/images/shulker_preview/container_with_title.png")};
      throws_ = var0;
   }

   private static void abstract_() {
      private_ = new short[]{0, 1, 2, 176, 2, 0, 256, 20, 0, 0, 1, 57, 57, 1, 4};
   }

   private void final_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
      }
   }

   private static void native_() {
      finally_ = new byte[]{3, 78, 2, 3};
   }
}
