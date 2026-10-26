package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.nio.charset.StandardCharsets;
import java.util.stream.IntStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZb_1 implements MinecraftAccessor {
   private static short[] break_;
   private static boolean[] byte_;
   private static float[] protected_;
   private static byte[] throws_;
   public Object[] class_;

   public rrZx_1 byte_() {
      return (rrZx_1)this.class_[3];
   }

   public rrZb_1(Font var1, rrZx_1 var2, boolean var3, boolean var4, boolean var5) {
      this(var1, var2, var3, var4);
      Boolean var10 = var5;
      this.class_[11] = var10;
   }

   public rrZb_1(Font var1, rrZx_1 var2, boolean var3, boolean var4) {
      this.case_();
      Integer var9 = 512;
      this.class_[0] = var9;
      Int2ObjectOpenHashMap var10 = new Int2ObjectOpenHashMap(128);
      this.class_[1] = var10;
      Integer var11 = -1;
      this.class_[7] = var11;
      Integer var12 = 0;
      this.class_[8] = var12;
      this.class_[3] = var2;
      this.class_[4] = var1;
      Boolean var15 = var3;
      this.class_[5] = var15;
      Boolean var16 = var4;
      this.class_[6] = var16;
      fk_3 var17 = this.class_(var1, var3, var4);
      this.class_[10] = var17;
      rrZM var18 = (rrZM)((Int2ObjectOpenHashMap)this.class_[1]).getOrDefault(63, new rrZM());
      this.class_[2] = var18;
   }

   static {
      ntfClinit();
   }

   public void class_(
      Ml_1 var1,
      lD_2 var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14
   ) {
      rjV_2 var15 = var1.byte_().class_();
      float var16 = var7 / 512.0F;
      float var17 = var8 / (float)((Integer)this.class_[9]).intValue();
      float var18 = var9 / 512.0F;
      float var19 = var10 / (float)((Integer)this.class_[9]).intValue();
      var2.class_(var15, var3, var4 + var6, 0.0F).class_(var16, var17 + var19).class_(var11, var12, var13, var14).class_();
      var2.class_(var15, var3 + var5, var4 + var6, 0.0F).class_(var16 + var18, var17 + var19).class_(var11, var12, var13, var14).class_();
      var2.class_(var15, var3 + var5, var4, 0.0F).class_(var16 + var18, var17).class_(var11, var12, var13, var14).class_();
      var2.class_(var15, var3, var4, 0.0F).class_(var16, var17).class_(var11, var12, var13, var14).class_();
   }

   private static String class_(Font var0, rrZx_1 var1) {
      int var2 = var1.break_();
      StringBuilder var3 = new StringBuilder(var2);
      var1.class_()
         .stream()
         .flatMapToInt(var0x -> IntStream.rangeClosed(var0x.break_(), var0x.class_()))
         .distinct()
         .sorted()
         .filter(var0::canDisplay)
         .forEach(var3::appendCodePoint);
      return var3.toString();
   }

   public void class_(Ml_1 var1, char var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      rrZM var9 = (rrZM)((Int2ObjectOpenHashMap)this.class_[1]).getOrDefault(var2, (rrZM)this.class_[2]);
      if (var9 != null) {
         this.class_(
            var1,
            strictfp_,
            var3,
            var4,
            (float)((Integer)var9.class_[2]).intValue(),
            (float)((Integer)var9.class_[3]).intValue(),
            (float)((Integer)var9.class_[0]).intValue(),
            (float)((Integer)var9.class_[1]).intValue(),
            (float)((Integer)var9.class_[2]).intValue(),
            (float)((Integer)var9.class_[3]).intValue(),
            var5,
            var6,
            var7,
            var8
         );
      }
   }

   public void class_(Ml_1 var1, char var2, float var3, float var4, int var5) throws ArrayIndexOutOfBoundsException {
      rrZM var6 = (rrZM)((Int2ObjectOpenHashMap)this.class_[1]).getOrDefault(var2, (rrZM)this.class_[2]);
      this.class_(
         var1,
         var3,
         var4,
         (float)((Integer)var6.class_[2]).intValue(),
         (float)((Integer)var6.class_[3]).intValue(),
         (float)((Integer)var6.class_[0]).intValue(),
         (float)((Integer)var6.class_[1]).intValue(),
         (float)((Integer)var6.class_[2]).intValue(),
         (float)((Integer)var6.class_[3]).intValue(),
         var5
      );
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1372545742;
   }

   public static Font class_(String var0, float var1) {
      try {
         Font var2 = Font.createFont(byte_[1], import_.F().class_(new rqO_2("celestial/fonts/" + var0 + ".ttf")).break_());
         return var2.deriveFont(var1);
      } catch (Exception var3) {
         var3.printStackTrace();
         return null;
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 429277962285956913L;
   }

   public void class_(Font var1) {
      this.class_[4] = var1;
      fk_3 var7 = this.class_(var1, (Boolean)this.class_[5], (Boolean)this.class_[6]);
      this.class_[10] = var7;
   }

   public int class_() {
      return (Integer)this.class_[7];
   }

   public void class_(Ml_1 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      rjV_2 var11 = var1.byte_().class_();
      float var12 = var6 / 512.0F;
      float var13 = var7 / (float)((Integer)this.class_[9]).intValue();
      float var14 = var8 / 512.0F;
      float var15 = var9 / (float)((Integer)this.class_[9]).intValue();
      strictfp_.class_(var11, var2, var3 + var5, 0.0F).class_(var12, var13 + var15).class_(var10).class_();
      strictfp_.class_(var11, var2 + var4, var3 + var5, 0.0F).class_(var12 + var14, var13 + var15).class_(var10).class_();
      strictfp_.class_(var11, var2 + var4, var3, 0.0F).class_(var12 + var14, var13).class_(var10).class_();
      strictfp_.class_(var11, var2, var3, 0.0F).class_(var12, var13).class_(var10).class_();
   }

   public fk_3 class_(Font var1, boolean var2, boolean var3) {
      return rrjr_3.class_(this.break_(var1, var2, var3), (Boolean)this.class_[11], false, false, false);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{4, -124, -77, -60, 66, 111, 122, 120}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(
      Ml_1 var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13
   ) {
      this.class_(var1, MinecraftAccessor.strictfp_, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
   }

   public void class_(Ml_1 var1, lD_2 var2, char var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      rrZM var10 = (rrZM)((Int2ObjectOpenHashMap)this.class_[1]).getOrDefault(var3, (rrZM)this.class_[2]);
      if (var10 != null) {
         this.class_(
            var1,
            var2,
            var4,
            var5,
            (float)((Integer)var10.class_[2]).intValue(),
            (float)((Integer)var10.class_[3]).intValue(),
            (float)((Integer)var10.class_[0]).intValue(),
            (float)((Integer)var10.class_[1]).intValue(),
            (float)((Integer)var10.class_[2]).intValue(),
            (float)((Integer)var10.class_[3]).intValue(),
            var6,
            var7,
            var8,
            var9
         );
      }
   }

   public BufferedImage break_(Font var1, boolean var2, boolean var3) {
      BufferedImage var4 = new BufferedImage(512, 512, 2);
      Graphics2D var5 = (Graphics2D)var4.getGraphics();
      var5.setFont(var1);
      var5.setColor(new Color(255, 255, 255, 0));
      var5.fillRect(0, 0, 512, 512);
      var5.setColor(Color.WHITE);
      var5.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, var3 ? RenderingHints.VALUE_FRACTIONALMETRICS_ON : RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
      var5.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, var2 ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
      var5.setRenderingHint(RenderingHints.KEY_ANTIALIASING, var2 ? RenderingHints.VALUE_ANTIALIAS_ON : RenderingHints.VALUE_ANTIALIAS_OFF);
      FontMetrics var6 = var5.getFontMetrics();
      int var7 = 0;
      int var8 = 0;
      int var9 = 1;
      String var10 = class_(var1, (rrZx_1)this.class_[3]);

      for (int var11 = 0; var11 < var10.length(); var11++) {
         char var12 = var10.charAt(var11);
         rrZM var13 = new rrZM();
         String var14 = String.valueOf(var12);
         Rectangle2D var15 = var6.getStringBounds(var14, var5);
         Rectangle var16 = var15.getBounds();
         Integer var21 = var16.width + 8;
         var13.class_[2] = var21;
         Integer var22 = var16.height;
         var13.class_[3] = var22;
         if (var8 + (Integer)var13.class_[2] >= 512) {
            var8 = 0;
            var9 += var7;
            var7 = 0;
         }

         if ((Integer)var13.class_[3] > var7) {
            var7 = (Integer)var13.class_[3];
         }

         Integer var23 = var8;
         var13.class_[0] = var23;
         Integer var24 = var9;
         var13.class_[1] = var24;
         if ((Integer)var13.class_[3] > (Integer)this.class_[7]) {
            Integer var25 = (Integer)var13.class_[3];
            this.class_[7] = var25;
         }

         Integer var26 = ((Integer)this.class_[7] - 8) / 2;
         this.class_[7] = var26;
         ((Int2ObjectOpenHashMap)this.class_[1]).put(var12, var13);
         var5.drawString(var14, var8 + 2, var9 + var6.getAscent());
         var8 += var13.class_[2];
      }

      var5.dispose();
      int var10006 = rrfQ_2.class_(var9 + (Integer)this.class_[7]);
      Integer var27 = var10006;
      this.class_[9] = var27;
      return var4.getSubimage(0, 0, 512, var10006);
   }

   public float break_(String var1) {
      float var2 = 0.0F;

      for (char var6 : var1.toCharArray()) {
         rrZM var7 = (rrZM)((Int2ObjectOpenHashMap)this.class_[1]).getOrDefault(var6, (rrZM)this.class_[2]);
         var2 += (float)(var7.class_[2] - 8 + this.class_[8]);
      }

      return var2 / 2.0F;
   }

   public boolean break_() {
      return (Boolean)this.class_[11];
   }

   private static void throws_() {
      protected_ = new float[]{512.0F, 512.0F, 0.0F, 0.0F, 0.0F, 0.0F, 512.0F, 512.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F};
   }

   private static void catch_() {
      byte_ = new boolean[]{
         false,
         false,
         false,
         false,
         false,
         false,
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
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false
      };
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[12];
         Object[] var1 = this.class_;
         var1[0] = 512;
         var1[5] = false;
         var1[6] = false;
         var1[7] = 0;
         var1[8] = 0;
         var1[9] = 0;
         var1[11] = false;
      }
   }

   private static void implements_() {
      break_ = new short[]{
         512,
         0,
         128,
         1,
         7,
         8,
         3,
         4,
         5,
         6,
         10,
         1,
         2,
         11,
         11,
         512,
         512,
         255,
         255,
         255,
         512,
         512,
         3,
         2,
         3,
         2,
         512,
         3,
         3,
         0,
         1,
         3,
         7,
         3,
         7,
         7,
         7,
         1,
         2,
         512,
         7,
         9,
         1,
         2,
         2,
         3,
         0,
         1,
         2,
         3,
         1,
         2,
         2,
         3,
         0,
         1,
         2,
         3,
         1,
         2,
         2,
         3,
         0,
         1,
         2,
         3,
         9,
         9,
         9,
         9,
         7,
         1,
         2,
         2,
         8,
         4,
         5,
         6,
         10,
         10,
         11,
         3,
         512
      };
   }

   public fk_3 protected_() {
      return (fk_3)this.class_[10];
   }

   private static void private_() {
      throws_ = new byte[]{-1, 63, 2, 8, 8, 2, 2, 8, 12, 5, 6, 7, 8, 9, 11};
   }
}
