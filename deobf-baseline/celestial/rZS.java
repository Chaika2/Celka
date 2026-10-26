package celestial;

import java.io.IOException;

public class rZS implements ruS_2<rmH_2> {
   private double id_class;
   private double id_break;
   private double id_byte;
   private float id_protected;
   private float id_throws;

   public double id_byte() {
      return this.id_break;
   }

   public rZS() {
   }

   public rZS(an_3 var1) {
      this.id_class = var1.rx();
      this.id_break = var1.re();
      this.id_byte = var1.BO();
      this.id_protected = (Float)var1.id_throws[15];
      this.id_throws = (Float)var1.id_throws[16];
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readDouble();
      this.id_break = var1.readDouble();
      this.id_byte = var1.readDouble();
      this.id_protected = var1.readFloat();
      this.id_throws = var1.readFloat();
   }

   public double id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeDouble(this.id_class);
      var1.writeDouble(this.id_break);
      var1.writeDouble(this.id_byte);
      var1.writeFloat(this.id_protected);
      var1.writeFloat(this.id_throws);
   }

   public float id_throws() {
      return this.id_protected;
   }

   public float id_case() {
      return this.id_throws;
   }

   public double id_protected() {
      return this.id_byte;
   }
}
