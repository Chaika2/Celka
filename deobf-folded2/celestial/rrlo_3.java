package celestial;

import com.google.common.collect.ComparisonChain;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;

public class rrlo_3 extends rrTF<ChestStealer> implements rrnF_2 {
   private static boolean[] id_break;
   private static String[] id_byte;
   private static byte[] id_protected;
   private static float[] id_case;
   private static short[] id_catch;
   public Object[] id_class;

   public rrlK_2 id_int() {
      this.id_try();
      return (rrlK_2)this.id_class[1];
   }

   public rrlo_3(ChestStealer var1) {
      super(var1);
      this.id_try();
      rrTT var6 = new rrTT(this);
      this.id_class[0] = var6;
      HashMap var7 = new HashMap();
      this.id_class[2] = var7;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_break = new boolean[]{
         true,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         false
      };
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1382124757;
   }

   private rrlK_2 id_class(Collection<rrlK_2> var1) {
      if (var1.isEmpty()) {
         return null;
      } else {
         rrlK_2 var2 = this.id_int();
         if (var2 != null && var1.contains(var2)) {
            return var2;
         } else {
            ArrayList var3 = new ArrayList(var1);
            var3.sort(
               (var0, var1x) -> {
                  rHu_1 var2x = var0.id_throws();
                  rHu_1 var3x = var1x.id_throws();
                  return ComparisonChain.start()
                     .compare(var0.id_break(), var1x.id_break())
                     .compare(((cb_3)id_import.id_class[57]).id_break(var2x.id_char()), ((cb_3)id_import.id_class[57]).id_break(var3x.id_char()))
                     .result();
               }
            );
            return (rrlK_2)var3.get(0);
         }
      }
   }

   private boolean id_class(rfH_2 var1) {
      return ((gm_3)id_import.id_class[56]).id_byte(var1).id_break() == xu_3.re ? true : id_break[23];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5547309422469480340L;
   }

   @EventTarget
   public void id_class(rrLM var1) {
      this.id_continue().id_byte(false);
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_try();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (!this.id_public()) {
            this.id_continue().id_byte(true);
            return;
         }

         rrNV var2 = ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).id_throws().id_switch();
         if (var2 != null) {
            return;
         }

         Ps_1 var3 = C_throws.id_byte().id_throw();

         for (ryO_2 var5 : ((gm_3)id_import.id_class[56]).id_case) {
            if (var5 instanceof rHu_1) {
               rHu_1 var6 = (rHu_1)var5;
               rrlK_2 var7 = (rrlK_2)((Map)this.id_class[2]).get(var6.id_char());
               if (var7 == null) {
                  rrlK_2 var8 = new rrlK_2(var6);
                  if (this.id_class(var3, var8.id_case())) {
                     ((Map)this.id_class[2]).put(var6.id_char(), var8);
                  }
               }
            }
         }

         if (!((Map)this.id_class[2]).isEmpty()) {
            Iterator var23 = ((Map)this.id_class[2]).entrySet().iterator();

            while (var23.hasNext()) {
               Entry var25 = (Entry)var23.next();
               rrlK_2 var27 = (rrlK_2)var25.getValue();
               rfH_2 var29 = var27.id_case();
               if (!this.id_class(var29)) {
                  if (var27.equals(this.id_int())) {
                     this.id_new();
                  }

                  var23.remove();
               } else if (!this.id_class(var3, var27.id_case())) {
                  var23.remove();
               }
            }
         }

         Collection var24 = ((Map)this.id_class[2]).values();
         this.id_class(this.id_class(var24));
         rrlK_2 var26 = this.id_int();
         ((rrTT)this.id_class[0]).id_final();
         Boolean var19 = false;
         this.id_class[3] = var19;
         if (var26 != null && var3 != null) {
            Optional var28 = PJ.id_class(var3, var26.id_case(), var0 -> var0.id_break() == xu_3.re ? true : id_break[34]);
            var28.ifPresent(var1x -> {
               this.id_try();
               ((rrTT)this.id_class[0]).id_class(var1x::id_class, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]);
            });
            Boolean var20 = true;
            this.id_class[3] = var20;
            vm_3 var9 = (vm_3)id_import.id_class[73];
            if (var9 instanceof Fc_1 var30) {
               ((rqr_3)((cb_3)id_import.id_class[57]).id_break[17]).id_finally = true;
               rJr_1 var32 = var30.G_();
               List var10 = var32.id_class(var0 -> {
                  if (!var0.id_break()) {
                     return false;
                  } else {
                     return var0.id_protected >= 9 && var0.id_protected <= 35 ? id_break[32] : id_break[31];
                  }
               });

               for (rJY var12 : var10) {
                  ((Ax_1)id_import.id_class[55]).id_class(var32.id_case, var12.id_protected, 0, rXa_1.QUICK_MOVE, false);
               }

               int var10002 = (Integer)this.id_class[4] + 1;
               Integer var21 = var10002;
               this.id_class[4] = var21;
               if (var10002 > 1 && var24.size() > 1 && var10.isEmpty()) {
                  this.id_new();
                  Integer var22 = 0;
                  this.id_class[4] = var22;
               }
            } else if (!var26.id_byte()
               && !((cb_3)id_import.id_class[57]).sL()
               && var28.isPresent()
               && ((Px_1)var28.get()).id_break() instanceof rff_3 var31
               && this.id_class(var31.id_class())) {
               boolean var34 = ((cb_3)id_import.id_class[57]).id_boolean();
               if (var34) {
                  ((rqr_3)((cb_3)id_import.id_class[57]).id_break[17]).id_implements = false;
                  ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_class(new rmD_2((cb_3)id_import.id_class[57], rmU_2.RELEASE_SHIFT_KEY));
               }

               for (rpm_3 var13 : rpm_3.values()) {
                  if (var13 != rpm_3.MAIN_HAND || !((cb_3)id_import.id_class[57]).id_protected(var13).id_continue().id_byte().contains("[❄]")) {
                     ryZ_2 var14 = ((Ax_1)id_import.id_class[55]).id_class((cb_3)id_import.id_class[57], (gm_3)id_import.id_class[56], var13, var31);
                     if (var14.id_class()) {
                        if (var14.id_break()) {
                           ((cb_3)id_import.id_class[57]).id_class(var13, false);
                        }
                        break;
                     }

                     if (var14 == ryZ_2.FAIL) {
                        break;
                     }
                  }
               }

               var26.id_class(rqR_2.id_break());
               var26.id_class(true);
               if (var34) {
                  ((rqr_3)((cb_3)id_import.id_class[57]).id_break[17]).id_implements = true;
                  ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_class(new rmD_2((cb_3)id_import.id_class[57], rmU_2.PRESS_SHIFT_KEY));
               }
            }
         }
      }
   }

   @EventTarget
   public void id_class(RenderEvent var1) {
      this.id_try();
      Ml_1 var2 = var1.id_class();

      for (rrlK_2 var4 : ((Map)this.id_class[2]).values()) {
         rfH_2 var5 = var4.id_case();
         rfl_3 var6 = rrjc_3.id_class(var4.id_class(), var5).id_protected((double)var5.b_(), (double)var5.c_(), (double)var5.d_());
         if (((yX_2)id_import.id_class[8]).id_static().id_class(var6)) {
            double var7 = id_void.id_case();
            double var9 = id_void.id_catch();
            double var11 = id_void.id_private();
            var2.id_class();
            GL11.glEnable(2848);
            RenderSystem.defaultBlendFunc();
            RenderSystem.enableBlend();
            RenderSystem.lineWidth(1.5F);
            RenderSystem.disableTexture();
            RenderSystem.disableDepthTest();
            RenderSystem.depthMask(false);
            id_strictfp.id_class(1, ju_3.id_this);
            rrfD_2.id_class(var2, var6.id_protected(-var7, -var9, -var11), var4 == (rrlK_2)this.id_class[1] ? Color.RED.getRGB() : Color.YELLOW.getRGB());
            id_default.id_break();
            RenderSystem.enableTexture();
            RenderSystem.enableDepthTest();
            RenderSystem.depthMask(true);
            RenderSystem.disableBlend();
            GL11.glDisable(2848);
            var2.id_break();
         }
      }
   }

   @EventTarget
   public void id_class(rrFo_1 var1) {
      rrlK_2 var2 = this.id_int();
      if (var2 != null) {
         var2.id_class(false);
      }
   }

   private boolean id_class(Ps_1 var1, rfH_2 var2) {
      return var1 == null ? false : PJ.id_class(var1, var2, var0 -> var0.id_break() == xu_3.re ? true : id_break[29]).isPresent();
   }

   public void id_class(rrlK_2 var1) {
      this.id_try();
      if (var1 == null && (rrlK_2)this.id_class[1] != null) {
         ((rrTT)this.id_class[0]).id_finally();
      }

      this.id_class[1] = var1;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-8, 123, -89, -37, 17, -94, 62, 108}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public float id_break() {
      return -1.0F;
   }

   @Override
   public rrTp_1 id_catch() {
      return (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[0];
   }

   private static void id_goto() {
      id_catch = new short[]{
         0,
         2,
         0,
         0,
         56,
         2,
         2,
         2,
         2,
         2,
         0,
         3,
         3,
         73,
         57,
         17,
         55,
         4,
         4,
         4,
         57,
         57,
         57,
         17,
         57,
         0,
         57,
         57,
         55,
         57,
         56,
         57,
         57,
         17,
         57,
         0,
         57,
         2,
         8,
         2848,
         1,
         2848,
         56,
         3,
         73,
         57,
         3,
         1,
         0,
         1,
         3,
         2,
         0,
         19,
         0,
         3000,
         0,
         1,
         2,
         3,
         57,
         57,
         0,
         0
      };
   }

   private static void id_else() {
      id_case = new float[]{1.5F, -1.0F, -1.0F};
   }

   private void id_new() {
      this.id_try();
      if ((Boolean)this.id_class[3]) {
         if ((vm_3)id_import.id_class[73] != null) {
            ((cb_3)id_import.id_class[57]).id_strictfp();
         }

         this.id_class(null);
         Boolean var5 = false;
         this.id_class[3] = var5;
      }
   }

   public boolean id_package() {
      this.id_try();
      return (Boolean)this.id_class[3];
   }

   private static void id_return() {
      id_protected = new byte[]{9, 35, 5, 3, 4};
   }

   private void id_try() {
      if (this.id_class == null) {
         this.id_class = new Object[5];
         this.id_class[3] = false;
         this.id_class[4] = 0;
      }
   }

   private void id_while() {
      this.id_try();
      this.id_class(null);
      Boolean var5 = false;
      this.id_class[3] = var5;
      ((Map)this.id_class[2]).clear();
      ((rrTT)this.id_class[0]).id_final();
   }

   private boolean id_public() {
      return ((cq_3)id_import.id_class[19]).id_extends().id_class("Экспресс - ");
   }

   @Override
   public float id_private() {
      return -1.0F;
   }

   public Map<rfH_2, rrlK_2> id_final() {
      this.id_try();
      return (Map<rfH_2, rrlK_2>)this.id_class[2];
   }

   private static void id_synchronized() {
      id_byte = new String[]{new String("[❄]"), new String("Экспресс - "), new String("Работает только на событии \"Новогодний Экспресс\"")};
   }

   @Override
   public boolean aI_() {
      if (!this.id_public()) {
         String var1 = "Работает только на событии \"Новогодний Экспресс\"";
         rrfu_3.id_byte(rrfu_3.id_class(this.id_continue()) + var1);
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtx_3(this.id_continue().id_final(), var1, 3000));
         this.id_continue().id_byte(false);
         return false;
      } else {
         return super.aI_();
      }
   }

   @Override
   public boolean aK_() {
      this.id_while();
      return super.aK_();
   }
}
