package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public enum rxL_2 implements rpH_2 {
   WHITE(0, "white", 16383998, QS.id_finally, 15790320, 16777215),
   ORANGE(1, "orange", 16351261, QS.id_new, 15435844, 16738335),
   MAGENTA(2, "magenta", 13061821, QS.id_continue, 12801229, 16711935),
   LIGHT_BLUE(3, "light_blue", 3847130, QS.id_super, 6719955, 10141901),
   YELLOW(4, "yellow", 16701501, QS.id_this, 14602026, 16776960),
   LIME(5, "lime", 8439583, QS.id_else, 4312372, 12582656),
   PINK(6, "pink", 15961002, QS.id_synchronized, 14188952, 16738740),
   GRAY(7, "gray", 4673362, QS.id_return, 4408131, 8421504),
   LIGHT_GRAY(8, "light_gray", 10329495, QS.id_public, 11250603, 13882323),
   CYAN(9, "cyan", 1481884, QS.id_goto, 2651799, 65535),
   PURPLE(10, "purple", 8991416, QS.id_while, 8073150, 10494192),
   BLUE(11, "blue", 3949738, QS.id_try, 2437522, 255),
   BROWN(12, "brown", 8606770, QS.id_instanceof, 5320730, 9127187),
   GREEN(13, "green", 6192150, QS.id_throw, 3887386, 65280),
   RED(14, "red", 11546150, QS.id_interface, 11743532, 16711680),
   BLACK(15, "black", 1908001, QS.id_char, 1973019, 0);

   public static final rxL_2[] VALUES = Arrays.stream(values()).sorted(Comparator.comparingInt(rxL_2::id_break)).toArray(rxL_2[]::new);
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

   public String id_byte() {
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
      this.tag = (rrGI<rdb_3>)rrxr_3.Pm.id_class(new rqO_2("forge", "dyes/" + var4));
      this.colorComponentValues = new float[]{(float)var9 / 255.0F, (float)var10 / 255.0F, (float)var11 / 255.0F};
      this.fireworkColor = var7;
   }

   @Override
   public String toString() {
      return this.translationKey;
   }

   public static rxL_2 id_class(String var0, rxL_2 var1) {
      for (rxL_2 var5 : values()) {
         if (var5.translationKey.equals(var0)) {
            return var5;
         }
      }

      return var1;
   }

   public static rxL_2 id_class(rdn_3 var0) {
      if (var0.id_break() instanceof rxA_2) {
         return ((rxA_2)var0.id_break()).id_byte();
      } else {
         for (rxL_2 var4 : VALUES) {
            if (var0.id_break().id_class(var4.id_implements())) {
               return var4;
            }
         }

         return null;
      }
   }

   @Override
   public String id_class() {
      return this.translationKey;
   }

   public void id_class(float[] var1) {
      this.colorComponentValues = var1;
   }

   public static rxL_2 id_class(int var0) {
      if (var0 < 0 || var0 >= VALUES.length) {
         var0 = 0;
      }

      return VALUES[var0];
   }

   public static rxL_2 id_break(int var0) {
      return (rxL_2)BY_FIREWORK_COLOR.get(var0);
   }

   public int id_break() {
      return this.id;
   }

   public QS id_throws() {
      return this.mapColor;
   }

   public int id_catch() {
      return this.textColor;
   }

   public int id_case() {
      return this.fireworkColor;
   }

   public rrGI<rdb_3> id_implements() {
      return this.tag;
   }

   public float[] id_protected() {
      return this.colorComponentValues;
   }

   public int id_private() {
      return this.colorValue;
   }
}
