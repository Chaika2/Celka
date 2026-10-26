package celestial;

class xf_3 implements rJZ {
   xf_3(xI_2 var1, rHu_1 var2, rHu_1 var3, rXu_1 var4) {
      this.class_ = var2;
      this.break_ = var3;
      this.byte_ = var4;
   }

   @Override
   public rgP_2 L_() {
      if (this.class_.Bk()) {
         return this.class_.L_();
      } else {
         return (rgP_2)(this.break_.Bk() ? this.break_.L_() : new rgn_3("container.chestDouble"));
      }
   }

   @Override
   public rJr_1 createMenu(int var1, rhz_3 var2, rhd_3 var3) {
      if (this.class_.throws_(var3) && this.break_.throws_(var3)) {
         this.class_.protected_(var2.throws_);
         this.break_.protected_(var2.throws_);
         return rXe_1.break_(var1, var2, this.byte_);
      } else {
         return null;
      }
   }
}
