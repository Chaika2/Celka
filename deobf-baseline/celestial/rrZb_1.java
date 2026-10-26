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
import java.util.Objects;
import java.util.stream.IntStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZb_1 implements MinecraftAccessor {
   private static short[] id_break;
   private static boolean[] id_byte;
   private static float[] id_protected;
   private static byte[] id_throws;
   public Object[] id_class;

   public rrZx_1 id_byte() {
      return (rrZx_1)this.id_class[id_break[81]];
   }

   public rrZb_1(Font var1, rrZx_1 var2, boolean var3, boolean var4, boolean var5) {
      this(var1, var2, var3, var4);
      Boolean var10 = var5;
      this.id_class[id_break[13]] = var10;
   }

   public rrZb_1(Font var1, rrZx_1 var2, boolean var3, boolean var4) {
      this.id_case();
      Integer var9 = Integer.valueOf(id_break[0]);
      this.id_class[id_break[1]] = var9;
      Int2ObjectOpenHashMap var10 = new Int2ObjectOpenHashMap(id_break[2]);
      this.id_class[id_break[3]] = var10;
      Integer var11 = Integer.valueOf(id_throws[0]);
      this.id_class[id_break[4]] = var11;
      Integer var12 = Integer.valueOf(id_byte[0]);
      this.id_class[id_break[5]] = var12;
      this.id_class[id_break[6]] = var2;
      this.id_class[id_break[7]] = var1;
      Boolean var15 = var3;
      this.id_class[id_break[8]] = var15;
      Boolean var16 = var4;
      this.id_class[id_break[9]] = var16;
      fk_3 var17 = this.id_class(var1, var3, var4);
      this.id_class[id_break[10]] = var17;
      rrZM var18 = (rrZM)((Int2ObjectOpenHashMap)this.id_class[id_break[11]]).getOrDefault(id_throws[1], new rrZM());
      this.id_class[id_break[12]] = var18;
   }

   static {
      ntfClinit();
   }

   public void id_class(
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
      rjV_2 var15 = var1.id_byte().id_class();
      Objects.requireNonNull(this);
      float var16 = var7 / id_protected[0];
      float var17 = var8 / (float)((Integer)this.id_class[id_break[66]]).intValue();
      Objects.requireNonNull(this);
      float var18 = var9 / id_protected[1];
      float var19 = var10 / (float)((Integer)this.id_class[id_break[67]]).intValue();
      var2.id_class(var15, var3, var4 + var6, id_protected[2]).id_class(var16, var17 + var19).id_class(var11, var12, var13, var14).id_class();
      var2.id_class(var15, var3 + var5, var4 + var6, id_protected[3]).id_class(var16 + var18, var17 + var19).id_class(var11, var12, var13, var14).id_class();
      var2.id_class(var15, var3 + var5, var4, id_protected[4]).id_class(var16 + var18, var17).id_class(var11, var12, var13, var14).id_class();
      var2.id_class(var15, var3, var4, id_protected[5]).id_class(var16, var17).id_class(var11, var12, var13, var14).id_class();
   }

   private static String id_class(Font var0, rrZx_1 var1) {
      int var2 = var1.id_break();
      StringBuilder var3 = new StringBuilder(var2);
      var1.id_class()
         .stream()
         .flatMapToInt(var0x -> IntStream.rangeClosed(var0x.id_break(), var0x.id_class()))
         .distinct()
         .sorted()
         .filter(var0::canDisplay)
         .forEach(var3::appendCodePoint);
      return var3.toString();
   }

   public void id_class(Ml_1 var1, char var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      rrZM var9 = (rrZM)((Int2ObjectOpenHashMap)this.id_class[id_break[42]]).getOrDefault(var2, (rrZM)this.id_class[id_break[43]]);
      if (var9 != null) {
         this.id_class(
            var1,
            id_strictfp,
            var3,
            var4,
            (float)((Integer)var9.id_class[id_break[44]]).intValue(),
            (float)((Integer)var9.id_class[id_break[45]]).intValue(),
            (float)((Integer)var9.id_class[id_break[46]]).intValue(),
            (float)((Integer)var9.id_class[id_break[47]]).intValue(),
            (float)((Integer)var9.id_class[id_break[48]]).intValue(),
            (float)((Integer)var9.id_class[id_break[49]]).intValue(),
            var5,
            var6,
            var7,
            var8
         );
      }
   }

   public void id_class(Ml_1 var1, char var2, float var3, float var4, int var5) throws ArrayIndexOutOfBoundsException {
      rrZM var6 = (rrZM)((Int2ObjectOpenHashMap)this.id_class[id_break[58]]).getOrDefault(var2, (rrZM)this.id_class[id_break[59]]);
      this.id_class(
         var1,
         var3,
         var4,
         (float)((Integer)var6.id_class[id_break[60]]).intValue(),
         (float)((Integer)var6.id_class[id_break[61]]).intValue(),
         (float)((Integer)var6.id_class[id_break[62]]).intValue(),
         (float)((Integer)var6.id_class[id_break[63]]).intValue(),
         (float)((Integer)var6.id_class[id_break[64]]).intValue(),
         (float)((Integer)var6.id_class[id_break[65]]).intValue(),
         var5
      );
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1372545742;
   }

   public static Font id_class(String var0, float var1) {
      try {
         Font var2 = Font.createFont(id_byte[1], id_import.F().id_class(new rqO_2("celestial/fonts/" + var0 + ".ttf")).id_break());
         return var2.deriveFont(var1);
      } catch (Exception var3) {
         var3.printStackTrace();
         return null;
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 429277962285956913L;
   }

   public void id_class(Font var1) {
      this.id_class[id_break[75]] = var1;
      fk_3 var7 = this.id_class(var1, (Boolean)this.id_class[id_break[76]], (Boolean)this.id_class[id_break[77]]);
      this.id_class[id_break[78]] = var7;
   }

   public int id_class() {
      return (Integer)this.id_class[id_break[70]];
   }

   public void id_class(Ml_1 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      rjV_2 var11 = var1.id_byte().id_class();
      Objects.requireNonNull(this);
      float var12 = var6 / id_protected[6];
      float var13 = var7 / (float)((Integer)this.id_class[id_break[68]]).intValue();
      Objects.requireNonNull(this);
      float var14 = var8 / id_protected[7];
      float var15 = var9 / (float)((Integer)this.id_class[id_break[69]]).intValue();
      id_strictfp.id_class(var11, var2, var3 + var5, id_protected[8]).id_class(var12, var13 + var15).id_class(var10).id_class();
      id_strictfp.id_class(var11, var2 + var4, var3 + var5, id_protected[9]).id_class(var12 + var14, var13 + var15).id_class(var10).id_class();
      id_strictfp.id_class(var11, var2 + var4, var3, id_protected[10]).id_class(var12 + var14, var13).id_class(var10).id_class();
      id_strictfp.id_class(var11, var2, var3, id_protected[11]).id_class(var12, var13).id_class(var10).id_class();
   }

   public fk_3 id_class(Font var1, boolean var2, boolean var3) {
      return rrjr_3.id_class(this.id_break(var1, var2, var3), (Boolean)this.id_class[id_break[14]], id_byte[2], id_byte[3], id_byte[4]);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{4, -124, -77, -60, 66, 111, 122, 120}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(
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
      this.id_class(var1, MinecraftAccessor.id_strictfp, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
   }

   public void id_class(Ml_1 var1, lD_2 var2, char var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      rrZM var10 = (rrZM)((Int2ObjectOpenHashMap)this.id_class[id_break[50]]).getOrDefault(var3, (rrZM)this.id_class[id_break[51]]);
      if (var10 != null) {
         this.id_class(
            var1,
            var2,
            var4,
            var5,
            (float)((Integer)var10.id_class[id_break[52]]).intValue(),
            (float)((Integer)var10.id_class[id_break[53]]).intValue(),
            (float)((Integer)var10.id_class[id_break[54]]).intValue(),
            (float)((Integer)var10.id_class[id_break[55]]).intValue(),
            (float)((Integer)var10.id_class[id_break[56]]).intValue(),
            (float)((Integer)var10.id_class[id_break[57]]).intValue(),
            var6,
            var7,
            var8,
            var9
         );
      }
   }

   public BufferedImage id_break(Font var1, boolean var2, boolean var3) {
      Objects.requireNonNull(this);
      short var10002 = id_break[15];
      Objects.requireNonNull(this);
      BufferedImage var4 = new BufferedImage(var10002, id_break[16], id_throws[2]);
      Graphics2D var5 = (Graphics2D)var4.getGraphics();
      var5.setFont(var1);
      var5.setColor(new Color(id_break[17], id_break[18], id_break[19], id_byte[5]));
      byte var10001 = id_byte[6];
      byte var29 = id_byte[7];
      Objects.requireNonNull(this);
      short var10003 = id_break[20];
      Objects.requireNonNull(this);
      var5.fillRect(var10001, var29, var10003, id_break[21]);
      var5.setColor(Color.WHITE);
      var5.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, var3 ? RenderingHints.VALUE_FRACTIONALMETRICS_ON : RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
      var5.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, var2 ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
      var5.setRenderingHint(RenderingHints.KEY_ANTIALIASING, var2 ? RenderingHints.VALUE_ANTIALIAS_ON : RenderingHints.VALUE_ANTIALIAS_OFF);
      FontMetrics var6 = var5.getFontMetrics();
      int var7 = id_byte[8];
      int var8 = id_byte[9];
      int var9 = id_byte[10];
      String var10 = id_class(var1, (rrZx_1)this.id_class[id_break[22]]);

      for (int var11 = id_byte[11]; var11 < var10.length(); var11++) {
         char var12 = var10.charAt(var11);
         rrZM var13 = new rrZM();
         String var14 = String.valueOf(var12);
         Rectangle2D var15 = var6.getStringBounds(var14, var5);
         Rectangle var16 = var15.getBounds();
         Integer var21 = var16.width + id_throws[3];
         var13.id_class[id_break[23]] = var21;
         Integer var22 = var16.height;
         var13.id_class[id_break[24]] = var22;
         int var10000 = var8 + (Integer)var13.id_class[id_break[25]];
         Objects.requireNonNull(this);
         if (var10000 >= id_break[26]) {
            var8 = id_byte[12];
            var9 += var7;
            var7 = id_byte[13];
         }

         if ((Integer)var13.id_class[id_break[27]] > var7) {
            var7 = (Integer)var13.id_class[id_break[28]];
         }

         Integer var23 = var8;
         var13.id_class[id_break[29]] = var23;
         Integer var24 = var9;
         var13.id_class[id_break[30]] = var24;
         if ((Integer)var13.id_class[id_break[31]] > (Integer)this.id_class[id_break[32]]) {
            Integer var25 = (Integer)var13.id_class[id_break[33]];
            this.id_class[id_break[34]] = var25;
         }

         Integer var26 = ((Integer)this.id_class[id_break[35]] - id_throws[4]) / id_throws[5];
         this.id_class[id_break[36]] = var26;
         ((Int2ObjectOpenHashMap)this.id_class[id_break[37]]).put(var12, var13);
         var5.drawString(var14, var8 + id_throws[6], var9 + var6.getAscent());
         var8 += var13.id_class[id_break[38]];
      }

      var5.dispose();
      var10001 = id_byte[14];
      var29 = id_byte[15];
      Objects.requireNonNull(this);
      var10003 = id_break[39];
      int var10006 = rrfQ_2.id_class(var9 + (Integer)this.id_class[id_break[40]]);
      Integer var27 = var10006;
      this.id_class[id_break[41]] = var27;
      return var4.getSubimage(var10001, var29, var10003, var10006);
   }

   public float id_break(String var1) {
      float var2 = id_protected[12];
      char[] var3 = var1.toCharArray();
      int var4 = var3.length;

      for (int var5 = id_byte[16]; var5 < var4; var5++) {
         char var6 = var3[var5];
         rrZM var7 = (rrZM)((Int2ObjectOpenHashMap)this.id_class[id_break[71]]).getOrDefault(var6, (rrZM)this.id_class[id_break[72]]);
         var2 += (float)(var7.id_class[id_break[73]] - id_throws[7] + this.id_class[id_break[74]]);
      }

      return var2 / id_protected[13];
   }

   public boolean id_break() {
      return (Boolean)this.id_class[id_break[80]];
   }

   private static void id_throws() {
      id_protected = new float[]{512.0F, 512.0F, 0.0F, 0.0F, 0.0F, 0.0F, 512.0F, 512.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F};
   }

   private static void id_catch() {
      id_byte = new boolean[]{
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

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[id_throws[8]];
         Object[] var1 = this.id_class;
         var1[id_byte[17]] = Integer.valueOf(id_break[82]);
         var1[id_throws[9]] = id_byte[18];
         var1[id_throws[10]] = id_byte[19];
         var1[id_throws[11]] = Integer.valueOf(id_byte[20]);
         var1[id_throws[12]] = Integer.valueOf(id_byte[21]);
         var1[id_throws[13]] = Integer.valueOf(id_byte[22]);
         var1[id_throws[14]] = id_byte[23];
      }
   }

   private static void id_implements() {
      id_break = new short[]{
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

   public fk_3 id_protected() {
      return (fk_3)this.id_class[id_break[79]];
   }

   private static void id_private() {
      id_throws = new byte[]{-1, 63, 2, 8, 8, 2, 2, 8, 12, 5, 6, 7, 8, 9, 11};
   }
}
