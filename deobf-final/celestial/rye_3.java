package celestial;

public class rye_3 {
   public static final rye_3 class_ = new rye_3("inFire").native_().package_();
   public static final rye_3 break_ = new rye_3("lightningBolt");
   public static final rye_3 byte_ = new rye_3("onFire").native_().package_();
   public static final rye_3 protected_ = new rye_3("lava").package_();
   public static final rye_3 throws_ = new rye_3("hotFloor").package_();
   public static final rye_3 case_ = new rye_3("inWall").native_();
   public static final rye_3 catch_ = new rye_3("cramming").native_();
   public static final rye_3 private_ = new rye_3("drown").native_();
   public static final rye_3 implements_ = new rye_3("starve").native_().final_();
   public static final rye_3 finally_ = new rye_3("cactus");
   public static final rye_3 extends_ = new rye_3("fall").native_();
   public static final rye_3 native_ = new rye_3("flyIntoWall").native_();
   public static final rye_3 volatile_ = new rye_3("outOfWorld").native_().volatile_();
   public static final rye_3 final_ = new rye_3("generic").native_();
   public static final rye_3 package_ = new rye_3("magic").native_().else_();
   public static final rye_3 int_ = new rye_3("wither").native_();
   public static final rye_3 new_ = new rye_3("anvil");
   public static final rye_3 continue_ = new rye_3("fallingBlock");
   public static final rye_3 super_ = new rye_3("dragonBreath").native_();
   public static final rye_3 this_ = new rye_3("dryout");
   public static final rye_3 else_ = new rye_3("sweetBerryBush");
   private boolean return_;
   private boolean public_;
   private boolean goto_;
   private float while_ = 0.1F;
   private boolean try_;
   private boolean instanceof_;
   private boolean throw_;
   private boolean interface_;
   private boolean char_;
   public final String synchronized_;

   public rye_3 byte_() {
      this.instanceof_ = true;
      return this;
   }

   public static rye_3 byte_(iB_2 var0) {
      return new rpX_2("mob", var0);
   }

   public static rye_3 byte_(an_3 var0, an_3 var1) {
      return new rpw_3("indirectMagic", var0, var1).native_().else_();
   }

   public boolean int_() {
      return this.try_;
   }

   protected rye_3(String var1) {
      this.synchronized_ = var1;
   }

   @Override
   public String toString() {
      return "DamageSource (" + this.synchronized_ + ")";
   }

   public boolean this_() {
      return this.interface_;
   }

   public static rye_3 class_(rhm_3 var0, an_3 var1) {
      return new rpw_3("arrow", var0, var1).byte_();
   }

   public static rye_3 class_() {
      return new ryC_2();
   }

   public static rye_3 class_(an_3 var0, iB_2 var1) {
      return new rpw_3("mob", var0, var1);
   }

   public rgP_2 class_(iB_2 var1) {
      iB_2 var2 = var1.Sh();
      String var3 = "death.attack." + this.synchronized_;
      String var4 = var3 + ".player";
      return var2 != null ? new rgn_3(var4, var1.L_(), var2.L_()) : new rgn_3(var3, var1.L_());
   }

   public static rye_3 class_(rhd_3 var0) {
      return new rpX_2("player", var0);
   }

   public static rye_3 class_(rhy_3 var0, an_3 var1) {
      return new rpw_3("fireworks", var0, var1).throws_();
   }

   public static rye_3 class_(rhv_3 var0, an_3 var1) {
      return var1 == null ? new rpw_3("onFire", var0, var0).package_().byte_() : new rpw_3("fireball", var0, var1).package_().byte_();
   }

   public static rye_3 class_(rhU_2 var0, an_3 var1) {
      return new rpw_3("witherSkull", var0, var1).byte_();
   }

   public static rye_3 class_(rRW var0) {
      return protected_(var0 != null ? var0.protected_() : null);
   }

   public static rye_3 class_(an_3 var0) {
      return new rpX_2("thorns", var0).public_().else_();
   }

   public static rye_3 class_(an_3 var0, an_3 var1) {
      return new rpw_3("trident", var0, var1).byte_();
   }

   public static rye_3 break_(iB_2 var0) {
      return new rpX_2("sting", var0);
   }

   public boolean break_() {
      return this.instanceof_;
   }

   public static rye_3 break_(an_3 var0, an_3 var1) {
      return new rpw_3("thrown", var0, var1).byte_();
   }

   public rye_3 throws_() {
      this.char_ = true;
      return this;
   }

   public an_3 finally_() {
      return this.extends_();
   }

   public float catch_() {
      return this.while_;
   }

   public an_3 extends_() {
      return null;
   }

   public boolean case_() {
      return this.return_;
   }

   public rye_3 continue_() {
      this.throw_ = true;
      return this;
   }

   public rye_3 else_() {
      this.interface_ = true;
      return this;
   }

   public boolean implements_() {
      return this.goto_;
   }

   public String new_() {
      return this.synchronized_;
   }

   protected rye_3 package_() {
      this.try_ = true;
      return this;
   }

   public rjU_2 return_() {
      return null;
   }

   public boolean super_() {
      return this.throw_;
   }

   public static rye_3 protected_(iB_2 var0) {
      return var0 != null ? new rpX_2("explosion.player", var0).continue_().throws_() : new rye_3("explosion").continue_().throws_();
   }

   public boolean protected_() {
      return this.char_;
   }

   public boolean private_() {
      return this.public_;
   }

   protected rye_3 final_() {
      this.goto_ = true;
      this.while_ = 0.0F;
      return this;
   }

   protected rye_3 volatile_() {
      this.public_ = true;
      return this;
   }

   public boolean synchronized_() {
      an_3 var1 = this.extends_();
      return var1 instanceof rhd_3 && ((rhx_3)((rhd_3)var1).implements_[18]).protected_;
   }

   protected rye_3 native_() {
      this.return_ = true;
      this.while_ = 0.0F;
      return this;
   }
}
