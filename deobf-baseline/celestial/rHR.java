package celestial;

public class rHR extends ryO_2 implements rJZ, rXc_1 {
   private final rXu_1 id_class = new rHY(this);
   private final rpF_2 id_break = new rHo_1(this);
   rdn_3 id_byte = rdn_3.id_break;
   int id_protected;
   private int id_throws;

   public rHR() {
      super(ryW_2.id_throw);
   }

   @Override
   public void id_class(xc_3 var1, rcd_3 var2) {
      super.id_class(var1, var2);
      if (var2.id_byte("Book", 10)) {
         this.id_byte = this.id_break(rdn_3.id_class(var2.id_int("Book")), (rhd_3)null);
      } else {
         this.id_byte = rdn_3.id_break;
      }

      this.id_throws = rkZ_2.id_catch(this.id_byte);
      this.id_protected = rfU_2.id_class(var2.id_private("Page"), 0, this.id_throws - 1);
   }

   public void id_class(rdn_3 var1, rhd_3 var2) {
      this.id_byte = this.id_break(var1, var2);
      this.id_protected = 0;
      this.id_throws = rkZ_2.id_catch(this.id_byte);
      this.id_break();
   }

   void id_class(int var1) {
      int var2 = rfU_2.id_class(var1, 0, this.id_throws - 1);
      if (var2 != this.id_protected) {
         this.id_protected = var2;
         this.id_break();
         kv_3.id_class(this.id_while(), this.id_char(), this.id_abstract());
      }
   }

   private gy_3 id_class(rhd_3 var1) {
      String var2;
      Object var3;
      if (var1 == null) {
         var2 = "Lectern";
         var3 = new rgN_2("Lectern");
      } else {
         var2 = var1.g().getString();
         var3 = var1.L_();
      }

      rjU_2 var4 = rjU_2.id_class((rja_3)this.id_native);
      return new gy_3(gV_2.id_byte, var4, rjK_2.id_class, (rrEm_1)this.id_extends, 2, var2, (rgP_2)var3, this.id_extends.id_const(), var1);
   }

   public void id_class(rdn_3 var1) {
      this.id_class(var1, (rhd_3)null);
   }

   @Override
   public rcd_3 id_class(rcd_3 var1) {
      super.id_class(var1);
      if (!this.id_throws().id_class()) {
         var1.id_class("Book", this.id_throws().id_break(new rcd_3()));
         var1.id_break("Page", this.id_protected);
      }

      return var1;
   }

   private rdn_3 id_break(rdn_3 var1, rhd_3 var2) {
      if (this.id_extends instanceof rrEm_1 && var1.id_break() == rdy_3.dr) {
         rkZ_2.id_class(var1, this.id_class(var2), var2);
      }

      return var1;
   }

   public rdn_3 id_throws() {
      return this.id_byte;
   }

   public int id_finally() {
      float var1 = this.id_throws > 1 ? (float)this.id_private() / ((float)this.id_throws - 1.0F) : 1.0F;
      return rfU_2.id_protected(var1 * 14.0F) + (this.id_catch() ? 1 : 0);
   }

   public boolean id_catch() {
      rdb_3 var1 = this.id_byte.id_break();
      return var1 == rdy_3.xi || var1 == rdy_3.dr;
   }

   void id_extends() {
      this.id_protected = 0;
      this.id_throws = 0;
      kv_3.id_class(this.id_while(), this.id_char(), this.id_abstract(), false);
   }

   @Override
   public void id_public() {
      this.id_class(rdn_3.id_break);
   }

   public int id_private() {
      return this.id_protected;
   }

   @Override
   public boolean ac_() {
      return true;
   }

   @Override
   public rgP_2 L_() {
      return new rgn_3("container.lectern");
   }

   @Override
   public rJr_1 createMenu(int var1, rhz_3 var2, rhd_3 var3) {
      return new rJv_1(var1, this.id_class, this.id_break);
   }
}
