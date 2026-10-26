package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFZ extends rrFl_1<rrqr_3> {
   private static short[] break_;
   private static String[] protected_;
   private static boolean[] throws_;
   private static byte[] case_;
   public Object[] class_;
   private static float[] catch_;

   @Override
   public Collection<rrqr_3> byte_() {
      return ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().o().new_();
   }

   public rrFZ(HudWidget var1) {
      this.case_();
      this.class_[0] = var1;
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
         .private_()
         .o()
         .new_()
         .add(new rrFv_1(this, new rgN_2("Preview Staff"), rrfu_3.class_().break_(rVa_1.class_("#ffd700"), rVa_1.class_("#ffddaf")).class_("Status").break_()));
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2117276552;
   }

   public boolean class_() {
      this.case_();
      return (Boolean)this.class_[1];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1721222230318065820L;
   }

   public float class_(rrqr_3 var1) {
      String var2 = var1.protected_().getString() + var1.private_();
      return ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).finally_().break_(var2) + 15.0F;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-13, -30, -105, 17, -81, -52, 120, -105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void class_(Ml_1 var1, float var2, float var3) {
      this.case_();
      float var4 = ((HudWidget)this.class_[0]).long_();
      StaffViewer var5 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().o();
      rrZO var6 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).finally_();
      this.break_(18.0F);
      float var7 = this.finally_();
      float var8 = this.protected_();
      var6.class_(MinecraftAccessor.strictfp_);

      for (rrqr_3 var10 : var5.super_()) {
         AnimValue var11 = var10.break_();
         var10.class_(var10.catch_());
         if (var11.case_()) {
            float var12 = var11.byte_();
            float var13 = var11.continue_();
            float var14 = var8 * 0.8F * var13;
            float var15 = var2 + 3.0F;
            float var16 = var3 + var7 - var14;
            int var17 = (int)(255.0F * var12 * var4);
            var6.break_(var1, var10.protected_(), (double)var15, (double)var16, rrZF.d_, var17);
            var6.break_(
               var1,
               var10.byte_(),
               (double)(var15 + ((HudWidget)this.class_[0]).implements_() - var6.break_(var10.private_()) - 5.0F),
               (double)var16,
               rrZF.d_,
               var17
            );
            float var18 = var8 * var12;
            var7 += var18;
            this.class_(var18);
         }
      }

      var6.byte_(MinecraftAccessor.strictfp_);
   }

   private static void break_() {
      case_ = new byte[]{2};
   }

   @Override
   public void throws_() {
      this.case_();
      super.throws_();
      Collection var1 = this.byte_();
      Boolean var10 = false;
      this.class_[1] = var10;
      if (!var1.isEmpty()) {
         Iterator var2 = var1.iterator();

         while (var2.hasNext()) {
            rrqr_3 var3 = (rrqr_3)var2.next();
            if (var3 instanceof rrqP_2) {
               rrqP_2 var4 = (rrqP_2)var3;
               if (var3.break_().catch_()) {
                  var2.remove();
               } else {
                  if (var3.catch_()) {
                     Boolean var11 = true;
                     this.class_[1] = var11;
                  }

                  rrqs_3 var5 = var4.finally_();
                  var5.protected_();
                  if (var5.byte_() == (rrqS_2)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[4]) {
                     var3.class_(false);
                  }
               }
            }
         }
      }
   }

   private static void catch_() {
      protected_ = new String[]{new String("Preview Staff"), new String("#ffd700"), new String("#ffddaf"), new String("Status")};
   }

   private static void extends_() {
      throws_ = new boolean[]{false, true, false, true, false};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
         var1[1] = false;
      }
   }

   private static void implements_() {
      catch_ = new float[]{18.0F, 0.8F, 3.0F, 255.0F, 5.0F, 15.0F, 10.0F};
   }

   @Override
   public float protected_() {
      return 10.0F;
   }

   private static void private_() {
      break_ = new short[]{0, 0, 0, 0, 0, 0, 1, 1, 4, 0, 0, 1};
   }
}
