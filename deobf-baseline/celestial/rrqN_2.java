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
   private static boolean[] id_class;
   public Object[] id_break;
   private static float[] id_byte;
   private static short[] id_protected;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-47, -20, -80, 5, -106, 113, 52, 28}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_byte() {
      id_class = new boolean[]{false, true, true, true};
   }

   public rrqN_2(XRay<?> var1) {
      super(var1);
      this.id_case();
      CopyOnWriteArraySet var6 = new CopyOnWriteArraySet();
      this.id_break[id_protected[0]] = var6;
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void id_class(RenderEvent var1) {
      yt_3 var2 = ((yX_2)id_import.id_class[id_protected[1]]).id_static();
      Ml_1 var3 = var1.id_class();
      double var4 = id_void.id_case();
      double var6 = id_void.id_catch();
      double var8 = id_void.id_private();
      var3.id_class();
      GL11.glEnable(id_protected[2]);
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableBlend();
      RenderSystem.lineWidth(id_byte[0]);
      RenderSystem.disableTexture();
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(id_class[0]);
      id_strictfp.id_class(id_class[1], ju_3.id_this);

      for (rrqc_3 var11 : this.id_final()) {
         rrqz_3 var12 = var11.id_class();
         if (var12.id_byte().equals(rrjc_3.id_protected(var11.id_break()))) {
            rja_3 var13 = var11.id_byte();
            int var14 = var13.b_();
            int var15 = var13.c_();
            int var16 = var13.d_();
            rfH_2 var17 = new rfH_2(var13);
            rfl_3 var18 = rrjc_3.id_class(var12.id_byte().id_continue(), var17).id_protected((double)var14, (double)var15, (double)var16);
            if (var2.id_class(var18)) {
               rrfD_2.id_class(var3, var18.id_protected(-var4, -var6, -var8), var12.id_class());
            }
         }
      }

      id_default.id_break();
      RenderSystem.enableTexture();
      RenderSystem.enableDepthTest();
      RenderSystem.depthMask(id_class[2]);
      RenderSystem.disableBlend();
      GL11.glDisable(id_protected[3]);
      var3.id_break();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1326233543;
   }

   @EventTarget
   public void id_class(rrAM var1) {
      this.id_native();
   }

   public void id_class(rrqc_3 var1) {
      this.id_case();
      ((Set)this.id_break[id_protected[5]]).add(var1);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5901301473351520517L;
   }

   private static void id_class() {
      id_protected = new short[]{0, 8, 2848, 2848, 0, 0, 0, 0, 0, 0};
   }

   @Override
   public void id_break(rrqz_3 var1, boolean var2) {
      this.id_case();
      if (var2) {
         ((Set)this.id_break[id_protected[8]]).removeIf(var1x -> var1x.id_class().equals(var1));
      }
   }

   private void id_case() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
      }
   }

   @Override
   public void id_package() {
      this.id_case();
      ((Set)this.id_break[id_protected[6]]).clear();
   }

   private static void id_protected() {
      id_byte = new float[]{1.5F};
   }

   public Set<rrqc_3> id_final() {
      this.id_case();
      return (Set<rrqc_3>)this.id_break[id_protected[9]];
   }

   public void id_native() {
      this.id_case();
      ((Set)this.id_break[id_protected[4]]).clear();
   }

   @Override
   public boolean aK_() {
      this.id_native();
      return super.aK_();
   }

   @Override
   public void g_() {
      this.id_case();
      ((Set)this.id_break[id_protected[7]]).clear();
   }
}
