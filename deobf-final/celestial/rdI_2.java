package celestial;

public class rdI_2 {
   private final rdn_3 class_;
   private final rdn_3 break_;
   private final rdn_3 byte_;
   private int protected_;
   private final int throws_;
   private boolean case_ = true;
   private int catch_;
   private int private_;
   private float implements_;
   private int finally_ = 1;

   private boolean byte_(rdn_3 var1, rdn_3 var2) {
      if (var2.class_() && var1.class_()) {
         return true;
      } else {
         rdn_3 var3 = var1.implements_();
         if (var3.break_().extends_()) {
            var3.break_(var3.catch_());
         }

         return rdn_3.byte_(var3, var2) && (!var2.final_() || var3.final_() && rco_3.class_(var2.package_(), var3.package_(), false));
      }
   }

   public rdn_3 byte_() {
      return this.break_;
   }

   public boolean int_() {
      return this.protected_ >= this.throws_;
   }

   public rdI_2(rdn_3 var1, rdn_3 var2, rdn_3 var3, int var4, int var5, int var6, float var7, int var8) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.finally_ = var6;
      this.implements_ = var7;
      this.private_ = var8;
   }

   public rdI_2(rcd_3 var1) {
      this.class_ = rdn_3.class_(var1.int_("buy"));
      this.break_ = rdn_3.class_(var1.int_("buyB"));
      this.byte_ = rdn_3.class_(var1.int_("sell"));
      this.protected_ = var1.private_("uses");
      if (var1.byte_("maxUses", 99)) {
         this.throws_ = var1.private_("maxUses");
      } else {
         this.throws_ = 4;
      }

      if (var1.byte_("rewardExp", 1)) {
         this.case_ = var1.new_("rewardExp");
      }

      if (var1.byte_("xp", 3)) {
         this.finally_ = var1.private_("xp");
      }

      if (var1.byte_("priceMultiplier", 5)) {
         this.implements_ = var1.finally_("priceMultiplier");
      }

      this.catch_ = var1.private_("specialPrice");
      this.private_ = var1.private_("demand");
   }

   public rdI_2(rdn_3 var1, rdn_3 var2, int var3, int var4, float var5) {
      this(var1, rdn_3.break_, var2, var3, var4, var5);
   }

   public rdI_2(rdn_3 var1, rdn_3 var2, rdn_3 var3, int var4, int var5, int var6, float var7) {
      this(var1, var2, var3, var4, var5, var6, var7, 0);
   }

   public rdI_2(rdn_3 var1, rdn_3 var2, rdn_3 var3, int var4, int var5, float var6) {
      this(var1, var2, var3, 0, var4, var5, var6);
   }

   public rcd_3 this_() {
      rcd_3 var1 = new rcd_3();
      var1.class_("buy", this.class_.break_(new rcd_3()));
      var1.class_("sell", this.byte_.break_(new rcd_3()));
      var1.class_("buyB", this.break_.break_(new rcd_3()));
      var1.break_("uses", this.protected_);
      var1.break_("maxUses", this.throws_);
      var1.class_("rewardExp", this.case_);
      var1.break_("xp", this.finally_);
      var1.class_("priceMultiplier", this.implements_);
      var1.break_("specialPrice", this.catch_);
      var1.break_("demand", this.private_);
      return var1;
   }

   public void class_(int var1) {
      this.catch_ += var1;
   }

   public boolean class_(rdn_3 var1, rdn_3 var2) {
      return this.byte_(var1, this.break_()) && var1.char_() >= this.break_().char_() && this.byte_(var2, this.break_) && var2.char_() >= this.break_.char_();
   }

   public rdn_3 class_() {
      return this.class_;
   }

   public void break_(int var1) {
      this.catch_ = var1;
   }

   public boolean break_(rdn_3 var1, rdn_3 var2) {
      if (!this.class_(var1, var2)) {
         return false;
      } else {
         var1.catch_(this.break_().char_());
         if (!this.byte_().class_()) {
            var2.catch_(this.byte_().char_());
         }

         return true;
      }
   }

   public rdn_3 break_() {
      int var1 = this.class_.char_();
      rdn_3 var2 = this.class_.implements_();
      int var3 = Math.max(0, rfU_2.protected_((float)(var1 * this.private_) * this.implements_));
      var2.throws_(rfU_2.class_(var1 + var3 + this.catch_, 1, this.class_.break_().implements_()));
      return var2;
   }

   public void throws_() {
      this.private_ = this.private_ + this.protected_ - (this.throws_ - this.protected_);
   }

   public void finally_() {
      this.protected_++;
   }

   public int catch_() {
      return this.protected_;
   }

   public int extends_() {
      return this.private_;
   }

   public rdn_3 case_() {
      return this.byte_.implements_();
   }

   public boolean continue_() {
      return this.protected_ > 0;
   }

   public int implements_() {
      return this.throws_;
   }

   public void new_() {
      this.protected_ = this.throws_;
   }

   public int package_() {
      return this.finally_;
   }

   public boolean super_() {
      return this.case_;
   }

   public rdn_3 protected_() {
      return this.byte_;
   }

   public void private_() {
      this.protected_ = 0;
   }

   public float final_() {
      return this.implements_;
   }

   public int volatile_() {
      return this.catch_;
   }

   public void native_() {
      this.catch_ = 0;
   }
}
