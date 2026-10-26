package celestial;

public class rmh_3 implements rmO_2 {
   private static final rgP_2 id_class = new rgN_2("Ignoring status request");
   private final rnW_2 id_break;
   private final rud_3 id_byte;

   public rmh_3(rnW_2 var1, rud_3 var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   @Override
   public void id_class(rmJ_2 var1) {
      switch (var1.id_break()) {
         case LOGIN:
            this.id_byte.id_class(ruv_3.LOGIN);
            if (var1.id_byte() != rqu_3.id_class().getProtocolVersion()) {
               rgn_3 var2;
               if (var1.id_byte() < 754) {
                  var2 = new rgn_3("multiplayer.disconnect.outdated_client", rqu_3.id_class().getName());
               } else {
                  var2 = new rgn_3("multiplayer.disconnect.incompatible", rqu_3.id_class().getName());
               }

               this.id_byte.id_class(new rmF_2(var2));
               this.id_byte.id_class(var2);
            } else {
               this.id_byte.id_class(new rmW_2(this.id_break, this.id_byte));
            }
            break;
         case STATUS:
            if (this.id_break.u()) {
               this.id_byte.id_class(ruv_3.STATUS);
               this.id_byte.id_class(new rLP(this.id_break, this.id_byte));
            } else {
               this.id_byte.id_class(id_class);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + var1.id_break());
      }
   }

   @Override
   public rud_3 id_class() {
      return this.id_byte;
   }

   @Override
   public void id_class(rgP_2 var1, rgP_2 var2) {
   }
}
