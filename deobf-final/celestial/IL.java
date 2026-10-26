package celestial;

public class IL {
   public static final IL class_ = new IL(new rje_3(), new rje_3(), new rje_3(1.0F, 1.0F, 1.0F));
   public final rje_3 break_;
   public final rje_3 byte_;
   public final rje_3 protected_;

   public IL(rje_3 var1, rje_3 var2, rje_3 var3) {
      this.break_ = var1.throws_();
      this.byte_ = var2.throws_();
      this.protected_ = var3.throws_();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (this.getClass() != var1.getClass()) {
         return false;
      } else {
         IL var2 = (IL)var1;
         return this.break_.equals(var2.break_) && this.protected_.equals(var2.protected_) && this.byte_.equals(var2.byte_);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.break_.hashCode();
      var1 = 31 * var1 + this.byte_.hashCode();
      return 31 * var1 + this.protected_.hashCode();
   }

   public void class_(boolean var1, Ml_1 var2) {
      if (this != class_) {
         float var3 = this.break_.class_();
         float var4 = this.break_.break_();
         float var5 = this.break_.byte_();
         if (var1) {
            var4 = -var4;
            var5 = -var5;
         }

         int var6 = var1 ? -1 : 1;
         var2.class_((double)((float)var6 * this.byte_.class_()), (double)this.byte_.break_(), (double)this.byte_.byte_());
         var2.class_(new rjY_2(var3, var4, var5, true));
         var2.class_(this.protected_.class_(), this.protected_.break_(), this.protected_.byte_());
      }
   }
}
