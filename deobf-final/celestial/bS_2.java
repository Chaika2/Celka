package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;

public class bS_2 extends bb_3 implements MinecraftAccessor {
   public Object[] class_;
   private static boolean[] break_;
   private static String[] protected_;
   private static short[] throws_;
   private static float[] case_;
   private static byte[] catch_;

   public bS_2(C_class var1, bM_2 var2) {
      super(var1, var2);
      this.implements_();
      ConcurrentHashMap var7 = new ConcurrentHashMap();
      this.class_[0] = var7;
      HashMap var8 = new HashMap();
      this.class_[1] = var8;
      HashMap var9 = new HashMap();
      this.class_[2] = var9;
      bs_3 var10 = (var1x, var2x) -> {
         this.implements_();
         xd_3 var3 = var2x.break_();
         if (var3 instanceof JI) {
            return ((rrIk_1)((Map)this.class_[2]).get((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[0])).class_();
         } else if (var3 instanceof Wp_1) {
            return ((rrIk_1)((Map)this.class_[2]).get((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[1])).class_();
         } else if (var3 instanceof Ji_1) {
            return ((rrIk_1)((Map)this.class_[2]).get((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[2])).class_();
         } else if (var3 instanceof dv_3) {
            return ((rrIk_1)((Map)this.class_[2]).get((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[3])).class_();
         } else if (var3 instanceof xs_3) {
            return ((rrIk_1)((Map)this.class_[2]).get((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[4])).class_();
         } else {
            return var3 instanceof JV ? ((rrIk_1)((Map)this.class_[2]).get((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[5])).class_() : break_[7];
         }
      };
      this.class_[3] = var10;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2676388593306701240L;
   }

   @Override
   public void class_(q_1 var1) {
      this.implements_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (((Map)this.class_[0]).isEmpty()) {
            return;
         }

         Ps_1 var2 = this.byte_().throw_();
         rYB var3 = var2.case_();
         ((Map)this.class_[0]).entrySet().removeIf(var2x -> {
            this.implements_();
            rfH_2 var3x = (rfH_2)var2x.getKey();
            xd_3 var4 = (xd_3)var2x.getValue();
            if (var3.byte_(var3x).break_() == var4) {
               ((Map)this.class_[1]).put(var3x, var4);
               return false;
            } else if (((Map)this.class_[1]).containsKey(var3x)) {
               ((Map)this.class_[1]).remove(var3x);
               return true;
            } else {
               return break_[6];
            }
         });
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{123, 83, 25, -35, 113, 69, 51, 117}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void class_(rrLu_1 var1) {
      ruS_2 var2 = var1.class_();
      if (var2 instanceof rvC_2 var3) {
         var3.class_((var1x, var2x) -> this.break_(var1x, var2x));
      } else if (var2 instanceof rZR var4) {
         this.break_(var4.byte_(), var4.break_());
      }
   }

   public void class_(Map<bE_2, rrIk_1> var1) {
      this.implements_();
      ((Map)this.class_[2]).clear();
      ((Map)this.class_[2]).putAll(var1);
   }

   @Override
   public void class_() {
      this.implements_();
      super.class_();
      ((Map)this.class_[0]).clear();
      ((Map)this.class_[1]).clear();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 81493762;
   }

   @Override
   public void class_(T var1) {
      this.implements_();
      if (!((Map)this.class_[0]).isEmpty()) {
         Ps_1 var2 = this.byte_().throw_();
         QY var3 = var2.throws_();
         yt_3 var4 = ((yX_2)var3.class_[8]).static_();
         rYB var5 = var2.case_();
         Ml_1 var6 = var1.byte_();
         float var7 = var1.break_();
         var6.class_();
         GL11.glEnable(2848);
         RenderSystem.defaultBlendFunc();
         RenderSystem.enableBlend();
         RenderSystem.lineWidth(1.5F);
         RenderSystem.disableTexture();
         RenderSystem.disableDepthTest();
         RenderSystem.depthMask(false);
         strictfp_.class_(1, ju_3.this_);
         double var8 = void_.case_();
         double var10 = void_.catch_();
         double var12 = void_.private_();

         for (Entry var15 : ((Map)this.class_[0]).entrySet()) {
            rfH_2 var16 = (rfH_2)var15.getKey();
            xd_3 var17 = (xd_3)var15.getValue();
            double var18 = (double)var16.b_();
            double var20 = (double)var16.c_();
            double var22 = (double)var16.d_();
            ryO_2 var25 = var5.class_(var16);
            rfl_3 var24;
            if (var25 != null) {
               xc_3 var26 = var25.abstract_();
               rjC_2 var27 = rrjc_3.class_(var25, var16, var26, var7);
               if (var27 == null) {
                  continue;
               }

               var24 = var27.class_().protected_(var18, var20, var22);
            } else {
               var24 = rrjc_3.class_(var17.continue_(), var16).protected_(var18, var20, var22);
            }

            if (var4.class_(var24)) {
               rrfD_2.class_(var6, var24.protected_(-var8, -var10, -var12), -1);
            }
         }

         default_.break_();
         RenderSystem.enableTexture();
         RenderSystem.enableDepthTest();
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
         GL11.glDisable(2848);
         var6.break_();
      }
   }

   private void break_(rfH_2 var1, xc_3 var2) {
      this.implements_();
      if (!var2.catch_()) {
         xd_3 var3 = var2.break_();
         if (((bs_3)this.class_[3]).test(var1, var2) && ((Map)this.class_[0]).putIfAbsent(var1.int_(), var3) == null) {
            rVi_1 var4 = new rgN_2("")
               .class_(rgF_2.GRAY)
               .break_("Найден блок '")
               .class_(new rgN_2(jI_2.class_("ru_ru", var3.volatile_())).class_(rgF_2.RED))
               .break_("'");
            this.class_(var4);
         }
      }
   }

   private static void throws_() {
      throws_ = new short[]{0, 1, 2, 3, 0, 8, 2848, 0, 2848, 0, 0, 0, 0, 1, 2, 2, 3, 0, 1, 1, 1, 2, 0, 2, 1, 2, 2, 2, 3, 2, 4, 2, 5};
   }

   private static void finally_() {
      protected_ = new String[]{new String(""), new String("Найден блок '"), new String("ru_ru"), new String("'")};
   }

   private static void catch_() {
      catch_ = new byte[]{-1, 4};
   }

   private static void case_() {
      case_ = new float[]{1.5F};
   }

   private void implements_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
      }
   }

   private static void private_() {
      break_ = new boolean[]{false, true, true, false, false, true, false, false};
   }
}
