package celestial;

import java.io.IOException;

public class rFO implements ruS_2<At_1> {
   private int id_class;
   private double id_break;
   private double id_byte;
   private double id_protected;
   private int id_throws;

   public double id_byte() {
      return this.id_break;
   }

   public rFO() {
   }

   public rFO(rsP_2 var1) {
      this.id_class = var1.V();
      this.id_break = var1.rx();
      this.id_byte = var1.re();
      this.id_protected = var1.BO();
      this.id_throws = var1.id_protected();
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_case();
      this.id_break = var1.readDouble();
      this.id_byte = var1.readDouble();
      this.id_protected = var1.readDouble();
      this.id_throws = var1.readShort();
   }

   public int id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class);
      var1.writeDouble(this.id_break);
      var1.writeDouble(this.id_byte);
      var1.writeDouble(this.id_protected);
      var1.writeShort(this.id_throws);
   }

   public double id_throws() {
      return this.id_protected;
   }

   public int id_case() {
      return this.id_throws;
   }

   public double id_protected() {
      return this.id_byte;
   }
}
