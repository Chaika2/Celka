package celestial;

import java.io.IOException;

public class rZY implements ruS_2<At_1> {
   public static final rZo_1 id_class = new rZo_1(0);
   public static final rZo_1 id_break = new rZo_1(1);
   public static final rZo_1 id_byte = new rZo_1(2);
   public static final rZo_1 id_protected = new rZo_1(3);
   public static final rZo_1 id_throws = new rZo_1(4);
   public static final rZo_1 id_case = new rZo_1(5);
   public static final rZo_1 id_catch = new rZo_1(6);
   public static final rZo_1 id_private = new rZo_1(7);
   public static final rZo_1 id_implements = new rZo_1(8);
   public static final rZo_1 id_finally = new rZo_1(9);
   public static final rZo_1 id_extends = new rZo_1(10);
   public static final rZo_1 id_native = new rZo_1(11);
   private rZo_1 id_volatile;
   private float id_final;

   public float id_byte() {
      return this.id_final;
   }

   public rZY() {
   }

   public rZY(rZo_1 var1, float var2) {
      this.id_volatile = var1;
      this.id_final = var2;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_volatile = (rZo_1)rZo_1.id_class.get(var1.readUnsignedByte());
      this.id_final = var1.readFloat();
   }

   public rZo_1 id_break() {
      return this.id_volatile;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeByte(this.id_volatile.id_break);
      var1.writeFloat(this.id_final);
   }
}
