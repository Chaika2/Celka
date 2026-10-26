package celestial;

public abstract class rdX_2 {
   public static final rdX_2[] class_ = new rdX_2[12];
   public static final rdX_2 break_ = new rdJ_2(0, "buildingBlocks").break_("building_blocks");
   public static final rdX_2 byte_ = new rdW_2(1, "decorations");
   public static final rdX_2 protected_ = new rdz_3(2, "redstone");
   public static final rdX_2 throws_ = new rdQ_2(3, "transportation");
   public static final rdX_2 case_ = new rdN_2(6, "misc");
   public static final rdX_2 catch_ = new rdc_3(5, "search").class_("item_search.png");
   public static final rdX_2 private_ = new rdu_3(7, "food");
   public static final rdX_2 implements_ = new rdm_3(8, "tools").class_(new eC_2[]{eC_2.VANISHABLE, eC_2.DIGGER, eC_2.FISHING_ROD, eC_2.BREAKABLE});
   public static final rdX_2 finally_ = new rdZ_2(9, "combat")
      .class_(
         new eC_2[]{
            eC_2.VANISHABLE,
            eC_2.ARMOR,
            eC_2.ARMOR_FEET,
            eC_2.ARMOR_HEAD,
            eC_2.ARMOR_LEGS,
            eC_2.ARMOR_CHEST,
            eC_2.BOW,
            eC_2.WEAPON,
            eC_2.WEARABLE,
            eC_2.BREAKABLE,
            eC_2.TRIDENT,
            eC_2.CROSSBOW
         }
      );
   public static final rdX_2 extends_ = new rdx_3(10, "brewing");
   public static final rdX_2 native_ = case_;
   public static final rdX_2 volatile_ = new rdd_3(4, "hotbar");
   public static final rdX_2 final_ = new rdk_3(11, "inventory").class_("inventory.png").finally_().private_();
   private final int package_;
   private final String int_;
   private final rgP_2 new_;
   private String continue_;
   private String super_ = "items.png";
   private boolean this_ = true;
   private boolean else_ = true;
   private eC_2[] synchronized_ = new eC_2[0];
   private rdn_3 return_;

   public rgP_2 byte_() {
      return this.new_;
   }

   public rdX_2(int var1, String var2) {
      this.package_ = var1;
      this.int_ = var2;
      this.new_ = new rgn_3("itemGroup." + var2);
      this.return_ = rdn_3.break_;
      class_[var1] = this;
   }

   public rdX_2 class_(eC_2... var1) {
      this.synchronized_ = var1;
      return this;
   }

   public boolean class_(eC_2 var1) {
      if (var1 != null) {
         for (eC_2 var5 : this.synchronized_) {
            if (var5 == var1) {
               return true;
            }
         }
      }

      return false;
   }

   public int class_() {
      return this.package_;
   }

   public void class_(rqs_3<rdn_3> var1) {
      for (rdb_3 var3 : rVL.for_) {
         var3.class_(this, var1);
      }
   }

   public rdX_2 class_(String var1) {
      this.super_ = var1;
      return this;
   }

   public rdX_2 break_(String var1) {
      this.continue_ = var1;
      return this;
   }

   public String break_() {
      return this.continue_ == null ? this.int_ : this.continue_;
   }

   public abstract rdn_3 throws_();

   public rdX_2 finally_() {
      this.this_ = false;
      return this;
   }

   public boolean catch_() {
      return this.else_;
   }

   public int extends_() {
      return this.package_ % 6;
   }

   public String case_() {
      return this.super_;
   }

   public boolean implements_() {
      return this.this_;
   }

   public rdn_3 protected_() {
      if (this.return_.class_()) {
         this.return_ = this.throws_();
      }

      return this.return_;
   }

   public rdX_2 private_() {
      this.else_ = false;
      return this;
   }

   public eC_2[] final_() {
      return this.synchronized_;
   }

   public boolean volatile_() {
      return this.extends_() == 5;
   }

   public boolean native_() {
      return this.package_ < 6;
   }
}
