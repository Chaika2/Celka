package celestial;

public enum rrGh_1 {
   PLAYER(false),
   FRAME(true),
   RED_MARKER(false),
   BLUE_MARKER(false),
   TARGET_X(true),
   TARGET_POINT(true),
   PLAYER_OFF_MAP(false),
   PLAYER_OFF_LIMITS(false),
   MANSION(true, 5393476),
   MONUMENT(true, 3830373),
   BANNER_WHITE(true),
   BANNER_ORANGE(true),
   BANNER_MAGENTA(true),
   BANNER_LIGHT_BLUE(true),
   BANNER_YELLOW(true),
   BANNER_LIME(true),
   BANNER_PINK(true),
   BANNER_GRAY(true),
   BANNER_LIGHT_GRAY(true),
   BANNER_CYAN(true),
   BANNER_PURPLE(true),
   BANNER_BLUE(true),
   BANNER_BROWN(true),
   BANNER_GREEN(true),
   BANNER_RED(true),
   BANNER_BLACK(true),
   RED_X(true);

   private final byte icon = (byte)this.ordinal();
   private final boolean renderedOnFrame;
   private final int mapColor;

   public boolean byte_() {
      return this.mapColor >= 0;
   }

   private rrGh_1(boolean var3) {
      this(var3, -1);
   }

   private rrGh_1(boolean var3, int var4) {
      this.renderedOnFrame = var3;
      this.mapColor = var4;
   }

   public static rrGh_1 class_(byte var0) {
      return values()[rfU_2.class_(var0, 0, values().length - 1)];
   }

   public byte class_() {
      return this.icon;
   }

   public boolean break_() {
      return this.renderedOnFrame;
   }

   public int protected_() {
      return this.mapColor;
   }
}
