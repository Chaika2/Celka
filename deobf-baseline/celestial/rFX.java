package celestial;

import java.io.IOException;
import org.apache.commons.lang3.Validate;

public class rFX implements ruS_2<At_1> {
   private rqA_2 id_class;
   private rqL_2 id_break;
   private int id_byte;
   private float id_protected;
   private float id_throws;

   public rqL_2 id_byte() {
      return this.id_break;
   }

   public rFX() {
   }

   public rFX(rqA_2 var1, rqL_2 var2, an_3 var3, float var4, float var5) {
      Validate.notNull(var1, "sound", new Object[0]);
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3.V();
      this.id_protected = var4;
      this.id_throws = var5;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = rVL.id_short.id_class(var1.id_case());
      this.id_break = var1.id_class(rqL_2.class);
      this.id_byte = var1.id_case();
      this.id_protected = var1.readFloat();
      this.id_throws = var1.readFloat();
   }

   public rqA_2 id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(rVL.id_short.id_class(this.id_class));
      var1.id_class(this.id_break);
      var1.id_protected(this.id_byte);
      var1.writeFloat(this.id_protected);
      var1.writeFloat(this.id_throws);
   }

   public float id_throws() {
      return this.id_protected;
   }

   public float id_case() {
      return this.id_throws;
   }

   public int id_protected() {
      return this.id_byte;
   }
}
