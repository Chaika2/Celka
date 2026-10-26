package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public enum rxL_2 implements rpH_2 {
   WHITE(0, "white", 16383998, QS.finally_, 15790320, 16777215),
   ORANGE(1, "orange", 16351261, QS.new_, 15435844, 16738335),
   MAGENTA(2, "magenta", 13061821, QS.continue_, 12801229, 16711935),
   LIGHT_BLUE(3, "light_blue", 3847130, QS.super_, 6719955, 10141901),
   YELLOW(4, "yellow", 16701501, QS.this_, 14602026, 16776960),
   LIME(5, "lime", 8439583, QS.else_, 4312372, 12582656),
   PINK(6, "pink", 15961002, QS.synchronized_, 14188952, 16738740),
   GRAY(7, "gray", 4673362, QS.return_, 4408131, 8421504),
   LIGHT_GRAY(8, "light_gray", 10329495, QS.public_, 11250603, 13882323),
   CYAN(9, "cyan", 1481884, QS.goto_, 2651799, 65535),
   PURPLE(10, "purple", 8991416, QS.while_, 8073150, 10494192),
   BLUE(11, "blue", 3949738, QS.try_, 2437522, 255),
   BROWN(12, "brown", 8606770, QS.instanceof_, 5320730, 9127187),
   GREEN(13, "green", 6192150, QS.throw_, 3887386, 65280),
   RED(14, "red", 11546150, QS.interface_, 11743532, 16711680),
   BLACK(15, "black", 1908001, QS.char_, 1973019, 0);

   public static final rxL_2[] VALUES = Arrays.stream(values()).sorted(Comparator.comparingInt(rxL_2::break_)).toArray(rxL_2[]::new);
   private static final Int2ObjectOpenHashMap<rxL_2> BY_FIREWORK_COLOR = new Int2ObjectOpenHashMap(
      Arrays.stream(values()).collect(Collectors.toMap(var0 -> var0.fireworkColor, var0 -> (rxL_2)var0))
   );
   private final int id;
   private final String translationKey;
   private final QS mapColor;
   private final int colorValue;
   private final int swappedColorValue;
   private float[] colorComponentValues;
   private final int fireworkColor;
   private final rrGI<rdb_3> tag;
   private final int textColor;

   public String byte_() {
      return this.translationKey;
   }

   private rxL_2(int var3, String var4, int var5, QS var6, int var7, int var8) {
      this.id = var3;
      this.translationKey = var4;
      this.colorValue = var5;
      this.mapColor = var6;
      this.textColor = var8;
      int var9 = (var5 & 0xFF0000) >> 16;
      int var10 = (var5 & 0xFF00) >> 8;
      int var11 = (var5 & 0xFF) >> 0;
      this.swappedColorValue = var11 << 16 | var10 << 8 | var9 << 0;
      this.tag = (rrGI<rdb_3>)rrxr_3.Pm.class_(new rqO_2("forge", "dyes/" + var4));
      this.colorComponentValues = new float[]{(float)var9 / 255.0F, (float)var10 / 255.0F, (float)var11 / 255.0F};
      this.fireworkColor = var7;
   }

   @Override
   public String toString() {
      return this.translationKey;
   }

   public static rxL_2 class_(String var0, rxL_2 var1) {
      for (rxL_2 var5 : values()) {
         if (var5.translationKey.equals(var0)) {
            return var5;
         }
      }

      return var1;
   }

   public static rxL_2 class_(rdn_3 var0) {
      if (var0.break_() instanceof rxA_2) {
         return ((rxA_2)var0.break_()).byte_();
      } else {
         for (rxL_2 var4 : VALUES) {
            if (var0.break_().class_(var4.implements_())) {
               return var4;
            }
         }

         return null;
      }
   }

   @Override
   public String class_() {
      return this.translationKey;
   }

   public void class_(float[] var1) {
      this.colorComponentValues = var1;
   }

   public static rxL_2 class_(int var0) {
      if (var0 < 0 || var0 >= VALUES.length) {
         var0 = 0;
      }

      return VALUES[var0];
   }

   public static rxL_2 break_(int var0) {
      return (rxL_2)BY_FIREWORK_COLOR.get(var0);
   }

   public int break_() {
      return this.id;
   }

   public QS throws_() {
      return this.mapColor;
   }

   public int catch_() {
      return this.textColor;
   }

   public int case_() {
      return this.fireworkColor;
   }

   public rrGI<rdb_3> implements_() {
      return this.tag;
   }

   public float[] protected_() {
      return this.colorComponentValues;
   }

   public int private_() {
      return this.colorValue;
   }
}
