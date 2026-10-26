package celestial;

import java.util.UUID;

public class cd_3 extends rRG {
   protected float id_class;
   protected long id_break;

   public cd_3(rFv_1 var1) {
      super(var1.id_break(), var1.id_protected(), var1.id_case(), var1.id_catch());
      this.id_class = var1.id_throws();
      this.id_protected = var1.id_throws();
      this.id_break = rqR_2.id_break();
      this.id_class(var1.id_private());
      this.id_break(var1.id_implements());
      this.id_byte(var1.id_finally());
   }

   public cd_3(UUID var1, rgP_2 var2, rRb_1 var3, rRM var4, float var5, boolean var6, boolean var7, boolean var8) {
      super(var1, var2, var3, var4);
      this.id_class = var5;
      this.id_protected = var5;
      this.id_break = rqR_2.id_break();
      this.id_class(var6);
      this.id_break(var7);
      this.id_byte(var8);
   }

   @Override
   public float id_class() {
      long var1 = rqR_2.id_break() - this.id_break;
      float var3 = rfU_2.id_class((float)var1 / 100.0F, 0.0F, 1.0F);
      return rfU_2.id_catch(var3, this.id_protected, this.id_class);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void id_class(rFv_1 var1) {
      switch (var1.id_byte()) {
         case UPDATE_NAME:
            this.id_class(var1.id_protected());
            break;
         case UPDATE_PCT:
            this.id_class(var1.id_throws());
            break;
         case UPDATE_STYLE:
            this.id_class(var1.id_case());
            this.id_class(var1.id_catch());
            break;
         case UPDATE_PROPERTIES:
            this.id_class(var1.id_private());
            this.id_break(var1.id_implements());
      }
   }

   @Override
   public void id_class(float var1) {
      this.id_protected = this.id_class();
      this.id_class = var1;
      this.id_break = rqR_2.id_break();
   }
}
