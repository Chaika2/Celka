package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtV_2 extends rrtw_3 {
   private static float[] id_native;
   private static boolean[] id_volatile;
   private static byte[] id_final;
   private static short[] id_package;
   private static double[] id_int;
   private static String[] id_new;
   public Object[] id_throws;

   private static void id_char() {
      id_int = new double[]{0.0, 10.0};
   }

   public rrtV_2(rrtN_2 var1, rrIQ var2, float var3, float var4, float var5, float var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.id_try();
      ArrayList var13 = new ArrayList();
      this.id_throws[1] = var13;
      this.id_throws[id_package[1]] = var2;

      for (String var8 : ((rrIQ)this.id_throws[id_package[2]]).id_class()) {
         ((List)this.id_throws[1]).add(new rrwS_2((rrIQ)this.id_throws[id_package[4]], var8));
      }

      ((rrIQ)this.id_throws[id_package[5]]).id_class(id_new[0], (var1x, var2x) -> {
         this.id_try();
         this.id_class((List<rrwS_2>)this.id_throws[1]);
      });
   }

   static {
      ntfClinit();
   }

   private static void id_interface() {
      id_native = new float[]{255.0F, 4.0F, 4.5F, 1.0F, 180.0F, 180.0F, 3.0F, 2.0F, 3.0F, 10.0F};
   }

   @Override
   public boolean id_class(rrtu_3 var1, rrtI_2 var2, float var3, float var4, int var5, int var6, int var7) {
      this.id_try();
      if (!this.id_return().id_case()) {
         return id_volatile[0];
      } else {
         for (rrwS_2 var9 : (List)this.id_throws[1]) {
            if (var7 == 0 && var9.id_class().id_break((float)var5, (float)var6) && !var9.id_break()) {
               ((rrIQ)this.id_throws[id_package[12]]).id_class(var9.id_byte(), id_volatile[1]);
               this.id_class((List<rrwS_2>)this.id_throws[1]);
               this.id_class(id_volatile[2]);
               return true;
            }
         }

         return id_volatile[4];
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5898667359588185514L;
   }

   private void id_class(List<rrwS_2> var1) {
      rrwS_2 var2 = null;

      for (rrwS_2 var4 : var1) {
         if (var4.id_break()) {
            var2 = var4;
            break;
         }
      }

      Collections.swap(var1, id_volatile[5], var1.indexOf(var2));
   }

   @Override
   public void id_class(Ml_1 var1, rrtI_2 var2, int var3, int var4) {
      this.id_try();
      float var5 = var2.id_break();
      float var6 = var2.id_byte();
      float var7 = var2.id_throws();
      float var8 = var2.id_class();
      AnimValue var9 = this.id_return();
      float var10 = var9.id_byte();
      int var11 = (int)(255.0F * var10);
      id_class(var1, this, var5, var6, var7, var8);
      rrtF_2.id_class(var1, this, var5 + var7 - 4.0F, var6 + 4.5F, 1.0F, 180.0F + var10 * 180.0F, rrZF.d_, 255);
      float var12 = 3.0F;

      for (rrwS_2 var14 : (List)this.id_throws[1]) {
         float var15 = var5 + 2.0F;
         float var16 = var6 + var12;
         boolean var17 = var14.id_break();
         if (var17 || var9.id_case()) {
            rrZO var18 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_package[8]]).id_finally();
            var14.id_class(new rruv_1(var5, var16 - 3.0F, var7, (float)(var18.id_class() + 6)));
            int var19 = var17 ? 255 : var11;
            rrtF_2.id_protected(
               var1,
               this,
               ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_package[10]]).id_finally(),
               var14.id_byte(),
               var15,
               var16,
               rrZF.d_,
               var19
            );
            var12 += 10.0F * var10;
         }
      }
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -854956554;
   }

   private static void id_instanceof() {
      id_volatile = new boolean[]{false, false, false, true, false, false};
   }

   private static void id_throw() {
      id_package = new short[]{1, 0, 0, 1, 0, 0, 255, 1, 0, 255, 0, 1, 0, 1, 1, 1, 0, 1};
   }

   private void id_try() {
      if (this.id_throws == null) {
         this.id_throws = new Object[2];
         Object[] var1 = this.id_throws;
      }
   }

   private static void id_while() {
      id_final = new byte[]{6, 2};
   }

   @Override
   public float id_public() {
      this.id_try();
      return (float)(
         ((List)this.id_throws[1])
               .stream()
               .mapToDouble(
                  var0 -> (double)((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_package[16]]).id_finally().id_break(var0.id_byte())
               )
               .max()
               .orElse(id_int[0])
            + 10.0
      );
   }

   public static String id_protected(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-24, 43, 68, 30, 32, 27, 95, 31}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public List<? extends rrtn_3> id_protected() {
      this.id_try();
      return (List<? extends rrtn_3>)this.id_throws[1];
   }

   private static void id_abstract() {
      id_new = new String[]{new String("swap_modes")};
   }
}
