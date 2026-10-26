package celestial;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFm_1 extends rrFl_1<rrTB> {
   private static float[] id_break;
   private static boolean[] id_protected;
   private static byte[] id_throws;
   public Object[] id_class;
   private static short[] id_case;

   @Override
   public Collection<rrTB> id_byte() {
      return ((rrTs_1)rrTs_1.staticFields535ba6477b2d307ba91b4de7d306c5df[id_case[10]]).id_class();
   }

   public rrFm_1(rrFu_1 var1) {
      this.id_implements();
      Map var6 = ((rrTs_1)rrTs_1.staticFields535ba6477b2d307ba91b4de7d306c5df[id_case[0]]).id_break();
      this.id_class[1] = var6;
      this.id_class[id_case[2]] = var1;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -78534862;
   }

   public float id_class(rrTB var1) {
      String var2 = var1.id_throws() + var1.id_case();
      return ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_case[12]]).id_class().id_break(var2) + 20.0F;
   }

   @Override
   public void id_class(Ml_1 var1, float var2, float var3) {
      this.id_implements();
      rrZO var4 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_case[3]]).id_class();
      this.id_break(18.0F);
      float var5 = this.id_finally();
      float var6 = this.id_protected();
      int var7 = (int)(255.0F * ((rrFu_1)this.id_class[id_case[4]]).id_long());
      int var8 = ColorHelper.id_break(rrZF.d_, var7);
      rrfD_2.id_protected((lD_2)rrfD_2.id_class[7]);
      var4.id_class(MinecraftAccessor.id_strictfp);

      for (rrTB var11 : ((rrTs_1)rrTs_1.staticFields535ba6477b2d307ba91b4de7d306c5df[id_case[6]]).id_class()) {
         String var12 = var11.id_case();
         float var13 = var2 + 3.0F;
         float var14 = var3 + var5;
         var4.id_break(var1, MinecraftAccessor.id_strictfp, var11.id_throws(), (double)(var13 + 7.0F), (double)var14, var8, id_protected[0], id_protected[1]);
         var4.id_break(
            var1,
            MinecraftAccessor.id_strictfp,
            var12,
            (double)(var13 + ((rrFu_1)this.id_class[id_case[7]]).id_implements() - var4.id_break(var12) - 5.0F),
            (double)var14,
            var8,
            id_protected[2],
            id_protected[3]
         );
         rrfD_2.id_class(var1, (lD_2)rrfD_2.id_class[7], var13 + 2.0F, var14 + 1.5F, 5.0F, ColorHelper.id_break(var11.id_break(), var7), 1.0F);
         var5 += var6;
         this.id_class(var6);
      }

      rrfD_2.id_break((lD_2)rrfD_2.id_class[7]);
      var4.id_byte(MinecraftAccessor.id_strictfp);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5180515657812772426L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{107, 31, 57, -94, -119, -40, -79, 58}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrFu_1 id_class() {
      this.id_implements();
      return (rrFu_1)this.id_class[id_case[13]];
   }

   public Map<rrTS, List<rrTB>> id_break() {
      this.id_implements();
      return (Map<rrTS, List<rrTB>>)this.id_class[1];
   }

   @Override
   public void id_throws() {
      super.id_throws();

      for (rrTB var3 : this.id_byte()) {
         rrTE[] var4 = var3.id_catch();
         LocalDateTime var5 = LocalDateTime.now((ZoneId)rrTG.id_class[id_case[11]]);
         LocalDateTime var6 = rrTG.id_class(var4, var5);
         var3.id_class(var6);
         var3.id_class(rrTG.id_break(var5, var6));
         var3.id_class(ColorHelper.id_break(ColorHelper.id_break(Color.GREEN.getRGB(), Color.RED.getRGB(), var3.id_byte()), 0.5F));
         var3.id_break(rrTG.id_class(var5, var6));
      }
   }

   private static void id_catch() {
      id_case = new short[]{0, 1, 0, 0, 0, 7, 0, 0, 7, 7, 0, 0, 0, 0, 1};
   }

   private static void id_extends() {
      id_throws = new byte[]{2};
   }

   private static void id_case() {
      id_break = new float[]{18.0F, 255.0F, 3.0F, 7.0F, 5.0F, 2.0F, 1.5F, 5.0F, 1.0F, 0.5F, 20.0F, 10.0F};
   }

   private void id_implements() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   @Override
   public float id_protected() {
      return 10.0F;
   }

   private static void id_private() {
      id_protected = new boolean[4];
   }
}
