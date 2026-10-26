package celestial;

import java.io.IOException;

public class rZa_1 implements ruS_2<At_1> {
   public rvr_3 class_;
   public int break_;
   public int byte_;
   public int protected_;
   public rgP_2 throws_;

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public rZa_1(ryR_2 var1, rvr_3 var2, rgP_2 var3) {
      this.class_ = var2;
      iB_2 var4 = var1.byte_();
      switch (var2) {
         case END_COMBAT:
            this.protected_ = var1.protected_();
            this.byte_ = var4 == null ? -1 : var4.V();
            break;
         case ENTITY_DIED:
            this.break_ = var1.case_().V();
            this.byte_ = var4 == null ? -1 : var4.V();
            this.throws_ = var3;
      }
   }

   public rZa_1(ryR_2 var1, rvr_3 var2) {
      this(var1, var2, rgN_2.byte_);
   }

   public rZa_1() {
   }

   @Override
   public boolean class_() {
      return this.class_ == rvr_3.ENTITY_DIED;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.class_(rvr_3.class);
      if (this.class_ == rvr_3.END_COMBAT) {
         this.protected_ = var1.case_();
         this.byte_ = var1.readInt();
      } else if (this.class_ == rvr_3.ENTITY_DIED) {
         this.break_ = var1.case_();
         this.byte_ = var1.readInt();
         this.throws_ = var1.throws_();
      }
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
      if (this.class_ == rvr_3.END_COMBAT) {
         var1.protected_(this.protected_);
         var1.writeInt(this.byte_);
      } else if (this.class_ == rvr_3.ENTITY_DIED) {
         var1.protected_(this.break_);
         var1.writeInt(this.byte_);
         var1.class_(this.throws_);
      }
   }
}
