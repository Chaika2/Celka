package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvO extends rrtN_2 {
   private static float[] break_;
   public Object[] class_;
   private static boolean[] byte_;
   private static short[] protected_;
   private static String[] native_;
   private static int[] volatile_;

   @Override
   public String byte_() {
      this.super_();
      return ((rrZi_1)this.class_[0]).private_().final_();
   }

   public rrvO(rrZi_1 var1, Supplier<Float> var2, Supplier<Float> var3) {
      super(var2, var3, () -> 140.0F, () -> 14.0F);
      this.super_();
      this.class_[0] = var1;
      Module var4 = var1.private_();
      if (!(var4 instanceof rrnv_3)) {
         rrIF var5 = new rrIF("Бинд", var4.package_()).break_(var4::package_).class_((var1x, var2x) -> {
            if (!var4.package_().equals(var1x)) {
               var4.class_(var1x, !var2x ? true : byte_[6]);
            }
         });
         this.class_(var5);
         if (var4 instanceof rrnZ_2) {
            rrIk_1 var6 = new rrIk_1("Выкл. при флаге", var4.implements_()).class_("disable_on_flag", (var1x, var2x) -> {
               if (!(Boolean)var2x.getRight()) {
                  var4.class_(!var4.implements_() ? true : byte_[3], byte_[4]);
               }
            });
            this.class_(var6);
         }
      }

      this.switch_();
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      protected_ = new short[2];
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      super.class_(var1, var2, var3, var4, var5);
      float var6 = this.default_();
      float var7 = this.abstract_();
      this.interface_().class_(var1, () -> {
         if (!var5) {
            rrfD_2.class_(var1, rrZL.protected_, var6 + 1.5F, var7 + 1.5F, 10.0F, 10.0F, -657931);
         }
      }, var2, var3, var4, false, var5);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1001926494;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-1, -62, 22, 37, 89, 59, -79, 60}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8955731288560624786L;
   }

   private static void class_() {
      byte_ = new boolean[]{false, true, true, false, true, true, false, true};
   }

   @Override
   public String catch_() {
      return "ModuleMiscSettingPopUp";
   }

   private static void continue_() {
      volatile_ = new int[]{-657931};
   }

   private static void package_() {
      break_ = new float[]{1.5F, 1.5F, 10.0F, 10.0F, 14.0F, 140.0F};
   }

   private static void return_() {
      native_ = new String[]{new String("Бинд"), new String("Выкл. при флаге"), new String("disable_on_flag"), new String("ModuleMiscSettingPopUp")};
   }

   private void super_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   @Override
   public boolean protected_() {
      return true;
   }
}
