package celestial;

import java.io.IOException;
import java.util.UUID;

public class rFv_1 implements ruS_2<At_1> {
   private UUID id_class;
   private rFL id_break;
   private rgP_2 id_byte;
   private float id_protected;
   private rRb_1 id_throws;
   private rRM id_case;
   private boolean id_catch;
   private boolean id_private;
   private boolean id_implements;

   public rFL id_byte() {
      return this.id_break;
   }

   public rFv_1() {
   }

   public rFv_1(rFL var1, rRG var2) {
      this.id_break = var1;
      this.id_class = var2.id_private();
      this.id_byte = var2.id_implements();
      this.id_protected = var2.id_class();
      this.id_throws = var2.id_finally();
      this.id_case = var2.id_extends();
      this.id_catch = var2.id_native();
      this.id_private = var2.id_volatile();
      this.id_implements = var2.id_final();
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   private void id_class(int var1) {
      this.id_catch = (var1 & 1) > 0;
      this.id_private = (var1 & 2) > 0;
      this.id_implements = (var1 & 4) > 0;
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_private();
      this.id_break = var1.id_class(rFL.class);
      switch (this.id_break) {
         case ADD:
            this.id_byte = var1.id_throws();
            this.id_protected = var1.readFloat();
            this.id_throws = var1.id_class(rRb_1.class);
            this.id_case = var1.id_class(rRM.class);
            this.id_class(var1.readUnsignedByte());
         case REMOVE:
         default:
            break;
         case UPDATE_PCT:
            this.id_protected = var1.readFloat();
            break;
         case UPDATE_NAME:
            this.id_byte = var1.id_throws();
            break;
         case UPDATE_STYLE:
            this.id_throws = var1.id_class(rRb_1.class);
            this.id_case = var1.id_class(rRM.class);
            break;
         case UPDATE_PROPERTIES:
            this.id_class(var1.readUnsignedByte());
      }
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class);
      var1.id_class(this.id_break);
      switch (this.id_break) {
         case ADD:
            var1.id_class(this.id_byte);
            var1.writeFloat(this.id_protected);
            var1.id_class(this.id_throws);
            var1.id_class(this.id_case);
            var1.writeByte(this.id_extends());
         case REMOVE:
         default:
            break;
         case UPDATE_PCT:
            var1.writeFloat(this.id_protected);
            break;
         case UPDATE_NAME:
            var1.id_class(this.id_byte);
            break;
         case UPDATE_STYLE:
            var1.id_class(this.id_throws);
            var1.id_class(this.id_case);
            break;
         case UPDATE_PROPERTIES:
            var1.writeByte(this.id_extends());
      }
   }

   public UUID id_break() {
      return this.id_class;
   }

   public float id_throws() {
      return this.id_protected;
   }

   public boolean id_finally() {
      return this.id_implements;
   }

   public rRM id_catch() {
      return this.id_case;
   }

   private int id_extends() {
      byte var1 = 0;
      if (this.id_catch) {
         var1 |= 1;
      }

      if (this.id_private) {
         var1 |= 2;
      }

      if (this.id_implements) {
         var1 |= 4;
      }

      return var1;
   }

   public rRb_1 id_case() {
      return this.id_throws;
   }

   public boolean id_implements() {
      return this.id_private;
   }

   public rgP_2 id_protected() {
      return this.id_byte;
   }

   public boolean id_private() {
      return this.id_catch;
   }
}
