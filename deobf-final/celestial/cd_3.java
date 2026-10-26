package celestial;

import java.util.UUID;

public class cd_3 extends rRG {
   protected float class_;
   protected long break_;

   public cd_3(rFv_1 var1) {
      super(var1.break_(), var1.protected_(), var1.case_(), var1.catch_());
      this.class_ = var1.throws_();
      this.protected_ = var1.throws_();
      this.break_ = rqR_2.break_();
      this.class_(var1.private_());
      this.break_(var1.implements_());
      this.byte_(var1.finally_());
   }

   public cd_3(UUID var1, rgP_2 var2, rRb_1 var3, rRM var4, float var5, boolean var6, boolean var7, boolean var8) {
      super(var1, var2, var3, var4);
      this.class_ = var5;
      this.protected_ = var5;
      this.break_ = rqR_2.break_();
      this.class_(var6);
      this.break_(var7);
      this.byte_(var8);
   }

   @Override
   public float class_() {
      long var1 = rqR_2.break_() - this.break_;
      float var3 = rfU_2.class_((float)var1 / 100.0F, 0.0F, 1.0F);
      return rfU_2.catch_(var3, this.protected_, this.class_);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void class_(rFv_1 var1) {
      switch (var1.byte_()) {
         case UPDATE_NAME:
            this.class_(var1.protected_());
            break;
         case UPDATE_PCT:
            this.class_(var1.throws_());
            break;
         case UPDATE_STYLE:
            this.class_(var1.case_());
            this.class_(var1.catch_());
            break;
         case UPDATE_PROPERTIES:
            this.class_(var1.private_());
            this.break_(var1.implements_());
      }
   }

   @Override
   public void class_(float var1) {
      this.protected_ = this.class_();
      this.class_ = var1;
      this.break_ = rqR_2.break_();
   }
}
