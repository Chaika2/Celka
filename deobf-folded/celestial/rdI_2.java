package celestial;

public class rdI_2 {
   private final rdn_3 id_class;
   private final rdn_3 id_break;
   private final rdn_3 id_byte;
   private int id_protected;
   private final int id_throws;
   private boolean id_case = true;
   private int id_catch;
   private int id_private;
   private float id_implements;
   private int id_finally = 1;

   private boolean id_byte(rdn_3 var1, rdn_3 var2) {
      if (var2.id_class() && var1.id_class()) {
         return true;
      } else {
         rdn_3 var3 = var1.id_implements();
         if (var3.id_break().id_extends()) {
            var3.id_break(var3.id_catch());
         }

         return rdn_3.id_byte(var3, var2) && (!var2.id_final() || var3.id_final() && rco_3.id_class(var2.id_package(), var3.id_package(), false));
      }
   }

   public rdn_3 id_byte() {
      return this.id_break;
   }

   public boolean id_int() {
      return this.id_protected >= this.id_throws;
   }

   public rdI_2(rdn_3 var1, rdn_3 var2, rdn_3 var3, int var4, int var5, int var6, float var7, int var8) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_finally = var6;
      this.id_implements = var7;
      this.id_private = var8;
   }

   public rdI_2(rcd_3 var1) {
      this.id_class = rdn_3.id_class(var1.id_int("buy"));
      this.id_break = rdn_3.id_class(var1.id_int("buyB"));
      this.id_byte = rdn_3.id_class(var1.id_int("sell"));
      this.id_protected = var1.id_private("uses");
      if (var1.id_byte("maxUses", 99)) {
         this.id_throws = var1.id_private("maxUses");
      } else {
         this.id_throws = 4;
      }

      if (var1.id_byte("rewardExp", 1)) {
         this.id_case = var1.id_new("rewardExp");
      }

      if (var1.id_byte("xp", 3)) {
         this.id_finally = var1.id_private("xp");
      }

      if (var1.id_byte("priceMultiplier", 5)) {
         this.id_implements = var1.id_finally("priceMultiplier");
      }

      this.id_catch = var1.id_private("specialPrice");
      this.id_private = var1.id_private("demand");
   }

   public rdI_2(rdn_3 var1, rdn_3 var2, int var3, int var4, float var5) {
      this(var1, rdn_3.id_break, var2, var3, var4, var5);
   }

   public rdI_2(rdn_3 var1, rdn_3 var2, rdn_3 var3, int var4, int var5, int var6, float var7) {
      this(var1, var2, var3, var4, var5, var6, var7, 0);
   }

   public rdI_2(rdn_3 var1, rdn_3 var2, rdn_3 var3, int var4, int var5, float var6) {
      this(var1, var2, var3, 0, var4, var5, var6);
   }

   public rcd_3 id_this() {
      rcd_3 var1 = new rcd_3();
      var1.id_class("buy", this.id_class.id_break(new rcd_3()));
      var1.id_class("sell", this.id_byte.id_break(new rcd_3()));
      var1.id_class("buyB", this.id_break.id_break(new rcd_3()));
      var1.id_break("uses", this.id_protected);
      var1.id_break("maxUses", this.id_throws);
      var1.id_class("rewardExp", this.id_case);
      var1.id_break("xp", this.id_finally);
      var1.id_class("priceMultiplier", this.id_implements);
      var1.id_break("specialPrice", this.id_catch);
      var1.id_break("demand", this.id_private);
      return var1;
   }

   public void id_class(int var1) {
      this.id_catch += var1;
   }

   public boolean id_class(rdn_3 var1, rdn_3 var2) {
      return this.id_byte(var1, this.id_break())
         && var1.id_char() >= this.id_break().id_char()
         && this.id_byte(var2, this.id_break)
         && var2.id_char() >= this.id_break.id_char();
   }

   public rdn_3 id_class() {
      return this.id_class;
   }

   public void id_break(int var1) {
      this.id_catch = var1;
   }

   public boolean id_break(rdn_3 var1, rdn_3 var2) {
      if (!this.id_class(var1, var2)) {
         return false;
      } else {
         var1.id_catch(this.id_break().id_char());
         if (!this.id_byte().id_class()) {
            var2.id_catch(this.id_byte().id_char());
         }

         return true;
      }
   }

   public rdn_3 id_break() {
      int var1 = this.id_class.id_char();
      rdn_3 var2 = this.id_class.id_implements();
      int var3 = Math.max(0, rfU_2.id_protected((float)(var1 * this.id_private) * this.id_implements));
      var2.id_throws(rfU_2.id_class(var1 + var3 + this.id_catch, 1, this.id_class.id_break().id_implements()));
      return var2;
   }

   public void id_throws() {
      this.id_private = this.id_private + this.id_protected - (this.id_throws - this.id_protected);
   }

   public void id_finally() {
      this.id_protected++;
   }

   public int id_catch() {
      return this.id_protected;
   }

   public int id_extends() {
      return this.id_private;
   }

   public rdn_3 id_case() {
      return this.id_byte.id_implements();
   }

   public boolean id_continue() {
      return this.id_protected > 0;
   }

   public int id_implements() {
      return this.id_throws;
   }

   public void id_new() {
      this.id_protected = this.id_throws;
   }

   public int id_package() {
      return this.id_finally;
   }

   public boolean id_super() {
      return this.id_case;
   }

   public rdn_3 id_protected() {
      return this.id_byte;
   }

   public void id_private() {
      this.id_protected = 0;
   }

   public float id_final() {
      return this.id_implements;
   }

   public int id_volatile() {
      return this.id_catch;
   }

   public void id_native() {
      this.id_catch = 0;
   }
}
