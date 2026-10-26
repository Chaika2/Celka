package celestial;

class xf_3 implements rJZ {
   xf_3(xI_2 var1, rHu_1 var2, rHu_1 var3, rXu_1 var4) {
      this.id_class = var2;
      this.id_break = var3;
      this.id_byte = var4;
   }

   @Override
   public rgP_2 L_() {
      if (this.id_class.Bk()) {
         return this.id_class.L_();
      } else {
         return (rgP_2)(this.id_break.Bk() ? this.id_break.L_() : new rgn_3("container.chestDouble"));
      }
   }

   @Override
   public rJr_1 createMenu(int var1, rhz_3 var2, rhd_3 var3) {
      if (this.id_class.id_throws(var3) && this.id_break.id_throws(var3)) {
         this.id_class.id_protected(var2.id_throws);
         this.id_break.id_protected(var2.id_throws);
         return rXe_1.id_break(var1, var2, this.id_byte);
      } else {
         return null;
      }
   }
}
