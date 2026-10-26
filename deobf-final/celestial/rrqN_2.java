package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;

public abstract class rrqN_2 extends rrTF<XRay<?>> implements rrqd_3 {
   private static boolean[] class_;
   public Object[] break_;
   private static float[] byte_;
   private static short[] protected_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-47, -20, -80, 5, -106, 113, 52, 28}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void byte_() {
      class_ = new boolean[]{false, true, true, true};
   }

   public rrqN_2(XRay<?> var1) {
      super(var1);
      this.case_();
      CopyOnWriteArraySet var6 = new CopyOnWriteArraySet();
      this.break_[0] = var6;
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void class_(RenderEvent var1) {
      yt_3 var2 = ((yX_2)import_.class_[8]).static_();
      Ml_1 var3 = var1.class_();
      double var4 = void_.case_();
      double var6 = void_.catch_();
      double var8 = void_.private_();
      var3.class_();
      GL11.glEnable(2848);
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableBlend();
      RenderSystem.lineWidth(1.5F);
      RenderSystem.disableTexture();
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      strictfp_.class_(1, ju_3.this_);

      for (rrqc_3 var11 : this.final_()) {
         rrqz_3 var12 = var11.class_();
         if (var12.byte_().equals(rrjc_3.protected_(var11.break_()))) {
            rja_3 var13 = var11.byte_();
            int var14 = var13.b_();
            int var15 = var13.c_();
            int var16 = var13.d_();
            rfH_2 var17 = new rfH_2(var13);
            rfl_3 var18 = rrjc_3.class_(var12.byte_().continue_(), var17).protected_((double)var14, (double)var15, (double)var16);
            if (var2.class_(var18)) {
               rrfD_2.class_(var3, var18.protected_(-var4, -var6, -var8), var12.class_());
            }
         }
      }

      default_.break_();
      RenderSystem.enableTexture();
      RenderSystem.enableDepthTest();
      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      GL11.glDisable(2848);
      var3.break_();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1326233543;
   }

   @EventTarget
   public void class_(rrAM var1) {
      this.native_();
   }

   public void class_(rrqc_3 var1) {
      this.case_();
      ((Set)this.break_[0]).add(var1);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5901301473351520517L;
   }

   private static void class_() {
      protected_ = new short[]{0, 8, 2848, 2848, 0, 0, 0, 0, 0, 0};
   }

   @Override
   public void break_(rrqz_3 var1, boolean var2) {
      this.case_();
      if (var2) {
         ((Set)this.break_[0]).removeIf(var1x -> var1x.class_().equals(var1));
      }
   }

   private void case_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
      }
   }

   @Override
   public void package_() {
      this.case_();
      ((Set)this.break_[0]).clear();
   }

   private static void protected_() {
      byte_ = new float[]{1.5F};
   }

   public Set<rrqc_3> final_() {
      this.case_();
      return (Set<rrqc_3>)this.break_[0];
   }

   public void native_() {
      this.case_();
      ((Set)this.break_[0]).clear();
   }

   @Override
   public boolean aK_() {
      this.native_();
      return super.aK_();
   }

   @Override
   public void g_() {
      this.case_();
      ((Set)this.break_[0]).clear();
   }
}
