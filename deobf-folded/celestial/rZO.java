package celestial;

import java.io.IOException;

public class rZO implements ruS_2<rmH_2> {
   protected double id_class;
   protected double id_break;
   protected double id_byte;
   protected float id_protected;
   protected float id_throws;
   protected boolean id_case;
   protected boolean id_catch;
   protected boolean id_private;

   public double id_byte(double var1) {
      return this.id_catch ? this.id_byte : var1;
   }

   public boolean id_byte() {
      return this.id_catch;
   }

   public rZO() {
   }

   public rZO(boolean var1) {
      this.id_case = var1;
   }

   public float id_class(float var1) {
      return this.id_private ? this.id_protected : var1;
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_case = var1.readUnsignedByte() != 0;
   }

   public double id_class(double var1) {
      return this.id_catch ? this.id_class : var1;
   }

   public double id_break(double var1) {
      return this.id_catch ? this.id_break : var1;
   }

   public boolean id_break() {
      return this.id_case;
   }

   public float id_break(float var1) {
      return this.id_private ? this.id_throws : var1;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeByte(this.id_case ? 1 : 0);
   }
}
