package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class FreeCamera extends Module {
   private static short[] id_byte;
   private static String[] id_protected;
   private static double[] id_throws;
   private static float[] id_catch;
   private static boolean[] id_private;
   public Object[] id_break;
   private static byte[] id_implements;

   public FreeCamera() {
      super(id_protected[0], id_protected[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_byte[0]]);
      this.id_return();
      rrIm_1 var5 = new rrIm_1(id_protected[2], id_catch[0], id_catch[1], id_catch[2], id_catch[3]);
      this.id_break[id_byte[1]] = var5;
      rrIk_1 var6 = new rrIk_1(id_protected[3], id_private[0]);
      this.id_break[id_byte[2]] = var6;
      rjU_2 var7 = rjU_2.id_class;
      this.id_break[id_byte[3]] = var7;
      rjU_2 var8 = rjU_2.id_class;
      this.id_break[id_byte[4]] = var8;
      rrlU_2 var9 = (rrlU_2)rrlU_2.id_break[id_byte[5]];
      this.id_break[id_byte[6]] = var9;
      Setting[] var10001 = new Setting[id_implements[0]];
      var10001[id_private[1]] = (rrIk_1)this.id_break[id_byte[7]];
      var10001[id_private[2]] = (rrIm_1)this.id_break[id_byte[8]];
      this.id_class(var10001);
      rrle_3 var10 = new rrle_3(this);
      this.id_break[id_byte[9]] = var10;
   }

   static {
      ntfClinit();
   }

   public boolean id_this() {
      return this.aJ_() && ((gm_3)id_import.id_class[id_byte[76]]).E() == rYB.id_protected ? id_private[17] : id_private[16];
   }

   private static void id_interface() {
      id_byte = new short[]{
         3,
         1,
         2,
         3,
         4,
         0,
         5,
         2,
         1,
         0,
         0,
         16,
         0,
         5,
         0,
         57,
         10,
         2,
         4,
         3,
         1,
         57,
         57,
         15,
         20,
         4,
         4,
         20,
         4,
         4,
         20,
         4,
         4,
         20,
         4,
         4,
         20,
         4,
         4,
         20,
         4,
         4,
         3,
         4,
         16,
         5,
         5,
         6,
         6,
         57,
         57,
         57,
         57,
         57,
         15,
         57,
         16,
         57,
         5,
         57,
         3,
         3,
         4,
         20,
         20,
         6,
         3,
         4,
         0,
         5,
         6,
         20,
         6,
         6,
         0,
         5,
         56,
         56,
         8,
         8
      };
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1417185782388117196L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1762245422;
   }

   @EventTarget
   public void id_class(rrAX var1) {
      this.id_return();
      if (this.id_continue()) {
         var1.id_class(new PX(((rrlU_2)this.id_break[id_byte[45]]).id_throws(), ((rrlU_2)this.id_break[id_byte[46]]).id_case()));
      }
   }

   @EventTarget
   public void id_class(rrAO var1) {
      if (this.id_continue()) {
         var1.id_class(id_private[10]);
      }
   }

   @EventTarget
   public void id_class(rrAz_1 var1) {
      an_3 var2 = id_import.id_catch();
      float var3 = var1.id_case();
      double var4 = var1.id_protected();
      ly_3 var6 = ((Hh_1)id_import.id_class[id_byte[44]]).id_finally();
      rjU_2 var7 = var6.id_break();
      rjG_2 var8 = var2.id_class(var7, var2.id_class(var6.id_throws(), var6.id_protected(), var3), var4, id_private[8]);
      var1.id_class(var8);
      var1.id_class(new PX(var6.id_throws(), var6.id_protected()));
      var1.id_class(var7);
      var1.id_class(var2.rN().id_throws(var2.Ps()).id_protected(var7));
   }

   @EventTarget
   public void id_class(rrFK var1) {
      this.id_byte(id_private[13]);
   }

   @EventTarget
   public void id_class(rrLw_1 var1) {
      this.id_return();
      if ((VZ)this.id_break[id_byte[47]] != null && var1.id_break() != (VZ)this.id_break[id_byte[48]]) {
         var1.id_class(id_private[11]);
      }
   }

   @EventTarget
   public void id_class(rrLt_1 var1) {
      this.id_return();
      var1.id_class((rjU_2)this.id_break[id_byte[42]]);
      var1.id_break((rjU_2)this.id_break[id_byte[43]]);
      var1.id_class(id_private[7]);
   }

   @EventTarget
   public void id_class(rrAM var1) {
      this.id_byte(id_private[12]);
   }

   private rjU_2 id_class(rjU_2 var1, int var2) {
      return var1.id_byte(new rjU_2(id_throws[6], id_throws[7], id_throws[8])).id_protected().id_class((double)var2);
   }

   @EventTarget
   public void id_class(rrAh_1 var1) {
      if (this.id_continue()) {
         var1.id_class(id_private[9]);
      }
   }

   @Override
   public void id_class(boolean var1) {
      this.id_return();
      super.id_class(var1);
      if ((cb_3)id_import.id_class[id_byte[49]] != null) {
         rrlU_2 var7 = new rrlU_2(
            ((cb_3)id_import.id_class[id_byte[50]]).rx(),
            ((cb_3)id_import.id_class[id_byte[51]]).re(),
            ((cb_3)id_import.id_class[id_byte[52]]).BO(),
            (Float)((cb_3)id_import.id_class[id_byte[53]]).id_throws[id_byte[54]],
            (Float)((cb_3)id_import.id_class[id_byte[55]]).id_throws[id_byte[56]],
            ((cb_3)id_import.id_class[id_byte[57]]).BL()
         );
         this.id_break[id_byte[58]] = var7;
         rjU_2 var8 = ((cb_3)id_import.id_class[id_byte[59]]).Ps();
         this.id_break[id_byte[60]] = var8;
         rjU_2 var9 = (rjU_2)this.id_break[id_byte[61]];
         this.id_break[id_byte[62]] = var9;
         VZ var2 = ((Qw_1)id_import.id_class[id_byte[63]]).id_volatile();
         ((Qw_1)id_import.id_class[id_byte[64]]).id_class(VZ.THIRD_PERSON_BACK);
         this.id_break[id_byte[65]] = var2;
         RenderSystem.recordRenderCall(() -> ((yX_2)id_import.id_class[id_byte[79]]).id_throws());
      }

      this.id_super().aI_();
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_return();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[14]]) {
         if ((Integer)((cb_3)id_import.id_class[id_byte[15]]).id_private[id_byte[16]] > 0 && ((rrIk_1)this.id_break[id_byte[17]]).id_class()) {
            this.id_byte(id_private[5]);
         }

         rjU_2 var9 = (rjU_2)this.id_break[id_byte[18]];
         this.id_break[id_byte[19]] = var9;
         float var2 = ((rrIm_1)this.id_break[id_byte[20]]).id_byte();
         rjU_2 var3 = ((cb_3)id_import.id_class[id_byte[21]])
            .id_byte(id_catch[7], (Float)((cb_3)id_import.id_class[id_byte[22]]).id_throws[id_byte[23]])
            .id_class((double)var2);
         rjU_2 var4 = new rjU_2(id_throws[0], id_throws[1], id_throws[2]).id_class((double)var2);
         if (((Qw_1)id_import.id_class[id_byte[24]]).h.id_protected()) {
            rjU_2 var10 = ((rjU_2)this.id_break[id_byte[25]]).id_throws(var3);
            this.id_break[id_byte[26]] = var10;
         }

         if (((Qw_1)id_import.id_class[id_byte[27]]).J.id_protected()) {
            rjU_2 var11 = ((rjU_2)this.id_break[id_byte[28]]).id_protected(var3);
            this.id_break[id_byte[29]] = var11;
         }

         if (((Qw_1)id_import.id_class[id_byte[30]]).X.id_protected()) {
            rjU_2 var12 = ((rjU_2)this.id_break[id_byte[31]]).id_throws(this.id_class(var3, id_implements[2]).id_class((double)var2));
            this.id_break[id_byte[32]] = var12;
         }

         if (((Qw_1)id_import.id_class[id_byte[33]]).x.id_protected()) {
            rjU_2 var13 = ((rjU_2)this.id_break[id_byte[34]]).id_throws(this.id_class(var3, id_private[6]).id_class((double)var2));
            this.id_break[id_byte[35]] = var13;
         }

         if (((Qw_1)id_import.id_class[id_byte[36]]).d.id_protected()) {
            rjU_2 var14 = ((rjU_2)this.id_break[id_byte[37]]).id_throws(new rjU_2(id_throws[3], id_throws[4], id_throws[5]).id_class((double)var2));
            this.id_break[id_byte[38]] = var14;
         } else if (((Qw_1)id_import.id_class[id_byte[39]]).k.id_protected()) {
            rjU_2 var15 = ((rjU_2)this.id_break[id_byte[40]]).id_protected(var4);
            this.id_break[id_byte[41]] = var15;
         }
      }
   }

   @EventTarget
   public void id_class(rrnB_2 var1) {
      this.id_return();
      Ml_1 var2 = var1.id_class();
      rrZO var3 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_byte[10]]).id_class();
      ly_3 var4 = ((Hh_1)id_import.id_class[id_byte[11]]).id_finally();
      rjU_2 var5 = var4.id_break();
      float var6 = (float)id_const.id_new() / id_catch[4];
      float var7 = (float)id_const.id_continue() / id_catch[5] + id_catch[6];
      if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[12]]).id_private().id_throws().id_new()) {
         var3.id_class(
            var2,
            "Camera Pos: " + rgF_2.GRAY + (int)var5.id_class() + " " + (int)var5.id_break() + " " + (int)var5.id_byte(),
            var6,
            var7,
            rrZF.d_,
            id_private[3]
         );
         var7 += (float)(var3.id_class() + id_implements[1]);
      }

      var3.id_class(
         var2, "vclip: " + rgF_2.GRAY + (int)((double)var4.id_byte().c_() - ((rrlU_2)this.id_break[id_byte[13]]).id_byte()), var6, var7, rrZF.d_, id_private[4]
      );
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{92, 123, 67, 89, -62, 25, -28, -63}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_return();
      super.id_throws(var1);
      rjU_2 var6 = rjU_2.id_class;
      this.id_break[id_byte[66]] = var6;
      rjU_2 var7 = rjU_2.id_class;
      this.id_break[id_byte[67]] = var7;
      rrlU_2 var8 = (rrlU_2)rrlU_2.id_break[id_byte[68]];
      this.id_break[id_byte[69]] = var8;
      if ((VZ)this.id_break[id_byte[70]] != null) {
         ((Qw_1)id_import.id_class[id_byte[71]]).id_class((VZ)this.id_break[id_byte[72]]);
         Object var9 = null;
         this.id_break[id_byte[73]] = var9;
      }

      RenderSystem.recordRenderCall(() -> ((yX_2)id_import.id_class[id_byte[78]]).id_throws());
      this.id_super().aK_();
   }

   private static void id_goto() {
      id_throws = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0};
   }

   public boolean id_continue() {
      return rrfZ_2.id_protected() ? id_private[14] : id_private[15];
   }

   public boolean id_else() {
      return this.aJ_() && ((gm_3)id_import.id_class[id_byte[77]]).E() == rYB.id_protected ? id_private[18] : id_private[19];
   }

   public rrlU_2 id_new() {
      this.id_return();
      return (rrlU_2)this.id_break[id_byte[75]];
   }

   private void id_return() {
      if (this.id_break == null) {
         this.id_break = new Object[7];
      }
   }

   public rrTF<FreeCamera> id_super() {
      this.id_return();
      return (rrTF<FreeCamera>)this.id_break[id_byte[74]];
   }

   private static void id_throw() {
      id_implements = new byte[]{2, 5, -1, 7};
   }

   private static void id_try() {
      id_catch = new float[]{1.5F, 0.5F, 5.0F, 0.1F, 4.0F, 4.0F, 13.0F, 0.0F};
   }

   private static void id_while() {
      id_protected = new String[]{
         new String("Free Camera"), new String("Позволяет летать в режиме\nнаблюдателя"), new String("Скорость"), new String("Выключать при дамаге")
      };
   }

   private static void id_public() {
      id_private = new boolean[]{
         false, false, true, false, false, true, true, true, false, true, true, true, false, false, false, true, true, false, true, false
      };
   }
}
