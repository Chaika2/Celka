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
      super(id_throws[0], id_throws[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_private[0]]);
      this.id_else();
      ArrayDeque var5 = new ArrayDeque();
      this.id_break[id_private[1]] = var5;
      rrfw_3 var6 = new rrfw_3();
      this.id_break[id_private[2]] = var6;
      String var10003 = id_throws[2];
      String var10004 = id_throws[3];
      String[] var10005 = new String[id_byte[0]];
      var10005[id_protected[0]] = id_throws[4];
      var10005[id_protected[1]] = id_throws[5];
      rrIQ var7 = new rrIQ(var10003, var10004, var10005);
      this.id_break[id_private[3]] = var7;
      rrIm_1 var8 = new rrIm_1(id_throws[6], id_implements[0], id_implements[1], id_implements[2], id_implements[3]).id_class(() -> {
         this.id_else();
         return ((rrIQ)this.id_break[id_private[34]]).id_byte().equals(id_throws[10]);
      });
      this.id_break[id_private[4]] = var8;
      rrIk_1 var9 = new rrIk_1(id_throws[7], id_protected[2]);
      this.id_break[id_private[5]] = var9;
      Setting[] var10001 = new Setting[id_byte[1]];
      var10001[id_protected[3]] = (rrIQ)this.id_break[id_private[6]];
      var10001[id_protected[4]] = (rrIm_1)this.id_break[id_private[7]];
      var10001[id_byte[2]] = (rrIk_1)this.id_break[id_private[8]];
      this.id_class(var10001);
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
      if (((rrIk_1)this.id_break[id_private[15]]).id_class()
         && (rjU_2)this.id_break[id_private[16]] != null
         && ((Qw_1)id_import.id_class[id_private[17]]).id_volatile() != VZ.FIRST_PERSON) {
         Ml_1 var2 = var1.id_class();
         rfl_3 var3 = ((cb_3)id_import.id_class[id_private[18]])
            .a_(((cb_3)id_import.id_class[id_private[19]]).Pb())
            .id_class((rjU_2)this.id_break[id_private[20]]);
         double var4 = id_void.id_case();
         double var6 = id_void.id_catch();
         double var8 = id_void.id_private();
         var2.id_class();
         GL11.glEnable(id_private[21]);
         RenderSystem.disableDepthTest();
         RenderSystem.disableTexture();
         RenderSystem.disableLighting();
         RenderSystem.depthMask(id_protected[6]);
         RenderSystem.disableAlphaTest();
         RenderSystem.blendFunc(id_private[22], id_private[23]);
         RenderSystem.enableBlend();
         RenderSystem.lineWidth(id_implements[5]);
         id_strictfp.id_class(id_protected[7], ju_3.id_this);
         yX_2.id_class(var2, id_strictfp, var3.id_protected(-var4, -var6, -var8), id_implements[6], id_implements[7], id_implements[8], id_implements[9]);
         id_default.id_break();
         RenderSystem.disableBlend();
         RenderSystem.depthMask(id_protected[8]);
         RenderSystem.enableTexture();
         RenderSystem.enableDepthTest();
         RenderSystem.enableAlphaTest();
         GL11.glDisable(id_private[24]);
         rrfa_3.id_class();
         var2.id_break();
      }
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_else();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_private[11]]
         && ((rrIQ)this.id_break[id_private[12]]).id_byte().equals(id_throws[9])
         && ((rrfw_3)this.id_break[id_private[13]]).id_class((double)(((rrIm_1)this.id_break[id_private[14]]).id_byte() * id_implements[4]))) {
         this.id_continue();
      }
   }

   @EventTarget
   public void id_class(rrAl_1 var1) {
      this.id_else();
      rjU_2 var6 = new rjU_2(var1.id_break(), var1.id_extends(), var1.id_catch());
      this.id_break[id_private[10]] = var6;
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
         && !var2.getClass().getSimpleName().startsWith(id_throws[8])) {
         ((Queue)this.id_break[id_private[9]]).add(var2);
         var1.id_class(id_protected[5]);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2133812722;
   }

   @Override
   public void id_class(boolean var1) {
      this.id_else();
      super.id_class(var1);
      if ((cb_3)id_import.id_class[id_private[25]] != null) {
         rjU_2 var6 = ((cb_3)id_import.id_class[id_private[26]]).Ps();
         this.id_break[id_private[27]] = var6;
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
      ((rrfw_3)this.id_break[id_private[28]]).id_class();

      while (!((Queue)this.id_break[id_private[29]]).isEmpty()) {
         ruS_2 var1 = (ruS_2)((Queue)this.id_break[id_private[30]]).poll();
         if (var1 instanceof rZO var2 && var2.id_byte()) {
            rjU_2 var7 = new rjU_2(var2.id_class(id_catch[0]), var2.id_break(id_catch[1]), var2.id_byte(id_catch[2]));
            this.id_break[id_private[31]] = var7;
         }

         ((Aq_1)((cb_3)id_import.id_class[id_private[32]]).id_break[id_private[33]]).id_break(var1);
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
