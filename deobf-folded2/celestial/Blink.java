package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;

public class Blink extends Module {
   private static byte[] id_byte;
   private static boolean[] id_protected;
   private static String[] id_throws;
   private static double[] id_catch;
   public Object[] id_break;
   private static short[] id_private;
   private static float[] id_implements;

   public Blink() {
      super("Blink", "Замедляет пакеты отправляемые\nна сервер", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
      this.id_else();
      ArrayDeque var5 = new ArrayDeque();
      this.id_break[0] = var5;
      rrfw_3 var6 = new rrfw_3();
      this.id_break[1] = var6;
      rrIQ var7 = new rrIQ("Режим замедления", "Normal", "Normal", "Delay");
      this.id_break[3] = var7;
      rrIm_1 var8 = new rrIm_1("Длительность", 0.5F, 0.1F, 5.0F, 0.1F).id_class(() -> {
         this.id_else();
         return ((rrIQ)this.id_break[3]).id_byte().equals("Delay");
      });
      this.id_break[4] = var8;
      rrIk_1 var9 = new rrIk_1("Отображать настоящую\nпозицию", true);
      this.id_break[5] = var9;
      this.id_class(new Setting[]{(rrIQ)this.id_break[3], (rrIm_1)this.id_break[4], (rrIk_1)this.id_break[5]});
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_throws = new String[]{
         new String("Blink"),
         new String("Замедляет пакеты отправляемые\nна сервер"),
         new String("Режим замедления"),
         new String("Normal"),
         new String("Normal"),
         new String("Delay"),
         new String("Длительность"),
         new String("Отображать настоящую\nпозицию"),
         new String("S"),
         new String("Delay"),
         new String("Delay")
      };
   }

   @EventTarget
   public void id_class(RenderEvent var1) {
      this.id_else();
      if (((rrIk_1)this.id_break[5]).id_class() && (rjU_2)this.id_break[2] != null && ((Qw_1)id_import.id_class[20]).id_volatile() != VZ.FIRST_PERSON) {
         Ml_1 var2 = var1.id_class();
         rfl_3 var3 = ((cb_3)id_import.id_class[57]).a_(((cb_3)id_import.id_class[57]).Pb()).id_class((rjU_2)this.id_break[2]);
         double var4 = id_void.id_case();
         double var6 = id_void.id_catch();
         double var8 = id_void.id_private();
         var2.id_class();
         GL11.glEnable(2848);
         RenderSystem.disableDepthTest();
         RenderSystem.disableTexture();
         RenderSystem.disableLighting();
         RenderSystem.depthMask(false);
         RenderSystem.disableAlphaTest();
         RenderSystem.blendFunc(770, 771);
         RenderSystem.enableBlend();
         RenderSystem.lineWidth(1.5F);
         id_strictfp.id_class(1, ju_3.id_this);
         yX_2.id_class(var2, id_strictfp, var3.id_protected(-var4, -var6, -var8), 1.0F, 1.0F, 1.0F, 1.0F);
         id_default.id_break();
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.enableTexture();
         RenderSystem.enableDepthTest();
         RenderSystem.enableAlphaTest();
         GL11.glDisable(2848);
         rrfa_3.id_class();
         var2.id_break();
      }
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_else();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]
         && ((rrIQ)this.id_break[3]).id_byte().equals("Delay")
         && ((rrfw_3)this.id_break[1]).id_class((double)(((rrIm_1)this.id_break[4]).id_byte() * 1000.0F))) {
         this.id_continue();
      }
   }

   @EventTarget
   public void id_class(rrAl_1 var1) {
      this.id_else();
      rjU_2 var6 = new rjU_2(var1.id_break(), var1.id_extends(), var1.id_catch());
      this.id_break[2] = var6;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8300829112054583095L;
   }

   @EventTarget
   public void id_class(rrFj_1 var1) {
      this.id_continue();
   }

   @EventTarget
   public void id_class(rrLZ var1) {
      this.id_else();
      ruS_2 var2 = var1.id_class();
      if (var2 != null
         && !(var2 instanceof rmT_2)
         && !(var2 instanceof rmV_2)
         && !(var2 instanceof rZr_1)
         && !(var2 instanceof rZL)
         && !(var2 instanceof rmJ_2)
         && !(var2 instanceof rLS)
         && !(var2 instanceof rmu_3)
         && !(var2 instanceof rmI_2)
         && !var2.getClass().getSimpleName().startsWith("S")) {
         ((Queue)this.id_break[0]).add(var2);
         var1.id_class(true);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2133812722;
   }

   @Override
   public void id_class(boolean var1) {
      this.id_else();
      super.id_class(var1);
      if ((cb_3)id_import.id_class[57] != null) {
         rjU_2 var6 = ((cb_3)id_import.id_class[57]).Ps();
         this.id_break[2] = var6;
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{119, 2, -31, -86, -36, 91, -85, -26}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_continue();
   }

   private static void id_goto() {
      id_byte = new byte[]{2, 3, 2, 6};
   }

   private void id_continue() {
      this.id_else();
      ((rrfw_3)this.id_break[1]).id_class();

      while (!((Queue)this.id_break[0]).isEmpty()) {
         ruS_2 var1 = (ruS_2)((Queue)this.id_break[0]).poll();
         if (var1 instanceof rZO var2 && var2.id_byte()) {
            rjU_2 var7 = new rjU_2(var2.id_class(0.0), var2.id_break(0.0), var2.id_byte(0.0));
            this.id_break[2] = var7;
         }

         ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_break(var1);
      }
   }

   private void id_else() {
      if (this.id_break == null) {
         this.id_break = new Object[6];
      }
   }

   private static void id_new() {
      id_protected = new boolean[]{false, true, true, false, true, true, false, true, true};
   }

   private static void id_return() {
      id_implements = new float[]{0.5F, 0.1F, 5.0F, 0.1F, 1000.0F, 1.5F, 1.0F, 1.0F, 1.0F, 1.0F};
   }

   private static void id_while() {
      id_private = new short[]{3, 0, 1, 3, 4, 5, 3, 4, 5, 0, 2, 0, 3, 1, 4, 5, 2, 20, 57, 57, 2, 2848, 770, 771, 2848, 57, 57, 2, 1, 0, 0, 2, 57, 0, 3};
   }

   private static void id_public() {
      id_catch = new double[3];
   }
}
