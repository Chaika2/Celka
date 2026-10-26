package celestial;

public final class UX {
   public static final UX class_ = class_("all");
   public static final UX break_ = class_("texture", class_);
   public static final UX byte_ = class_("particle", break_);
   public static final UX protected_ = class_("end", class_);
   public static final UX throws_ = class_("bottom", protected_);
   public static final UX case_ = class_("top", protected_);
   public static final UX catch_ = class_("front", class_);
   public static final UX private_ = class_("back", class_);
   public static final UX implements_ = class_("side", class_);
   public static final UX finally_ = class_("north", implements_);
   public static final UX extends_ = class_("south", implements_);
   public static final UX native_ = class_("east", implements_);
   public static final UX volatile_ = class_("west", implements_);
   public static final UX final_ = class_("up");
   public static final UX package_ = class_("down");
   public static final UX int_ = class_("cross");
   public static final UX new_ = class_("plant");
   public static final UX continue_ = class_("wall", class_);
   public static final UX super_ = class_("rail");
   public static final UX this_ = class_("wool");
   public static final UX else_ = class_("pattern");
   public static final UX synchronized_ = class_("pane");
   public static final UX return_ = class_("edge");
   public static final UX public_ = class_("fan");
   public static final UX goto_ = class_("stem");
   public static final UX while_ = class_("upperstem");
   public static final UX try_ = class_("crop");
   public static final UX instanceof_ = class_("dirt");
   public static final UX throw_ = class_("fire");
   public static final UX interface_ = class_("lantern");
   public static final UX char_ = class_("platform");
   public static final UX abstract_ = class_("unsticky");
   public static final UX long_ = class_("torch");
   public static final UX float_ = class_("layer0");
   public static final UX void_ = class_("lit_log");
   private final String static_;
   private final UX import_;

   private UX(String var1, UX var2) {
      this.static_ = var1;
      this.import_ = var2;
   }

   @Override
   public String toString() {
      return "#" + this.static_;
   }

   private static UX class_(String var0) {
      return new UX(var0, (UX)null);
   }

   public String class_() {
      return this.static_;
   }

   private static UX class_(String var0, UX var1) {
      return new UX(var0, var1);
   }

   public UX break_() {
      return this.import_;
   }
}
