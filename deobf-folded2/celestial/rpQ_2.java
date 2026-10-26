package celestial;

public class rpQ_2 {
   private int id_class = this.id_protected();
   private float id_break = 5.0F;
   private float id_byte;
   private int id_protected;

   public float id_byte() {
      return this.id_break;
   }

   public void id_class(int var1) {
      this.id_class = var1;
   }

   public void id_class(float var1) {
      this.id_byte = Math.min(this.id_byte + var1, 40.0F);
   }

   public int id_class() {
      return this.id_class;
   }

   public void id_class(rhd_3 var1) {
      rRO var2 = ((rYB)var1.id_throws[7]).id_abstract();
      if (this.id_byte > 4.0F) {
         this.id_byte -= 4.0F;
         if (this.id_break > 0.0F) {
            this.id_break = Math.max(this.id_break - 1.0F, 0.0F);
         } else if (var2 != rRO.PEACEFUL) {
            this.id_class = Math.max(this.id_class - 1, 0);
         }
      }

      boolean var3 = ((rYB)var1.id_throws[7]).B().id_break(rRu_1.id_implements);
      if (var3 && this.id_break > 0.0F && var1.sA() && this.id_class >= this.id_protected()) {
         this.id_protected++;
         if (this.id_protected >= 10) {
            float var4 = Math.min(this.id_break, 6.0F);
            var1.id_protected(var4 / 6.0F);
            this.id_class(var4);
            this.id_protected = 0;
         }
      } else if (var3 && this.id_class >= 18 && var1.sA()) {
         this.id_protected++;
         if (this.id_protected >= 80) {
            var1.id_protected(1.0F);
            this.id_class(6.0F);
            this.id_protected = 0;
         }
      } else if (this.id_class <= 0) {
         this.id_protected++;
         if (this.id_protected >= 80) {
            if (var1.Ss() > 10.0F || var2 == rRO.HARD || var1.Ss() > 1.0F && var2 == rRO.NORMAL) {
               var1.id_break(rye_3.id_implements, 1.0F);
            }

            this.id_protected = 0;
         }
      } else {
         this.id_protected = 0;
      }
   }

   public void id_class(int var1, float var2) {
      this.id_class = Math.min(var1 + this.id_class, this.id_protected());
      this.id_break = Math.min(this.id_break + (float)var1 * var2 * 2.0F, (float)this.id_class);
   }

   public void id_class(rcd_3 var1) {
      if (var1.id_byte("foodLevel", 99)) {
         this.id_class = var1.id_private("foodLevel");
         this.id_protected = var1.id_private("foodTickTimer");
         this.id_break = var1.id_finally("foodSaturationLevel");
         this.id_byte = var1.id_finally("foodExhaustionLevel");
      }
   }

   public void id_class(rdb_3 var1, rdn_3 var2) {
      if (var1.id_super()) {
         rxK_2 var3 = var1.id_this();
         this.id_class(var3.id_class(), var3.id_break());
      }
   }

   public void id_break(float var1) {
      this.id_break = var1;
   }

   public void id_break(rcd_3 var1) {
      var1.id_break("foodLevel", this.id_class);
      var1.id_break("foodTickTimer", this.id_protected);
      var1.id_class("foodSaturationLevel", this.id_break);
      var1.id_class("foodExhaustionLevel", this.id_byte);
   }

   public boolean id_break() {
      return this.id_class < this.id_protected();
   }

   public int id_protected() {
      return 20;
   }
}
