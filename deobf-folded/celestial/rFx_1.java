package celestial;

import java.io.IOException;
import java.util.UUID;

public class rFx_1 implements ruS_2<At_1> {
   private int id_class;
   private UUID id_break;
   private rfH_2 id_byte;
   private rpr_3 id_protected;
   private int id_throws;

   public UUID id_byte() {
      return this.id_break;
   }

   public rFx_1() {
   }

   public rFx_1(rsO_2 var1) {
      this.id_class = var1.V();
      this.id_break = var1.ro();
      this.id_byte = var1.id_implements();
      this.id_protected = var1.Pg();
      this.id_throws = rVL.P.id_class(var1.id_catch);
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_case();
      this.id_break = var1.id_private();
      this.id_throws = var1.id_case();
      this.id_byte = var1.id_byte();
      this.id_protected = rpr_3.id_break(var1.readUnsignedByte());
   }

   public int id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class);
      var1.id_class(this.id_break);
      var1.id_protected(this.id_throws);
      var1.id_class(this.id_byte);
      var1.writeByte(this.id_protected.id_protected());
   }

   public rpr_3 id_throws() {
      return this.id_protected;
   }

   public rsh_3 id_case() {
      return rVL.P.id_class(this.id_throws);
   }

   public rfH_2 id_protected() {
      return this.id_byte;
   }
}
