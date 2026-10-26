package celestial;

public class rmh_3 implements rmO_2 {
   private static final rgP_2 class_ = new rgN_2("Ignoring status request");
   private final rnW_2 break_;
   private final rud_3 byte_;

   public rmh_3(rnW_2 var1, rud_3 var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void class_(rmJ_2 var1) {
      switch (var1.break_()) {
         case LOGIN:
            this.byte_.class_(ruv_3.LOGIN);
            if (var1.byte_() != rqu_3.class_().getProtocolVersion()) {
               rgn_3 var2;
               if (var1.byte_() < 754) {
                  var2 = new rgn_3("multiplayer.disconnect.outdated_client", rqu_3.class_().getName());
               } else {
                  var2 = new rgn_3("multiplayer.disconnect.incompatible", rqu_3.class_().getName());
               }

               this.byte_.class_(new rmF_2(var2));
               this.byte_.class_(var2);
            } else {
               this.byte_.class_(new rmW_2(this.break_, this.byte_));
            }
            break;
         case STATUS:
            if (this.break_.u()) {
               this.byte_.class_(ruv_3.STATUS);
               this.byte_.class_(new rLP(this.break_, this.byte_));
            } else {
               this.byte_.class_(class_);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + var1.break_());
      }
   }

   @Override
   public rud_3 class_() {
      return this.byte_;
   }

   @Override
   public void class_(rgP_2 var1, rgP_2 var2) {
   }
}
