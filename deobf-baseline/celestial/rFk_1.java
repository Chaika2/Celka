package celestial;

import java.io.IOException;
import java.util.UUID;

public class rFk_1 implements ruS_2<At_1> {
   private int id_class;
   private UUID id_break;
   private double id_byte;
   private double id_protected;
   private double id_throws;
   private byte id_case;
   private byte id_catch;

   public UUID id_byte() {
      return this.id_break;
   }

   public rFk_1() {
   }

   public rFk_1(rhd_3 var1) {
      this.id_class = var1.V();
      this.id_break = var1.sv().getId();
      this.id_byte = var1.rx();
      this.id_protected = var1.re();
      this.id_throws = var1.BO();
      this.id_case = (byte)((int)((Float)var1.id_throws[15] * 256.0F / 360.0F));
      this.id_catch = (byte)((int)((Float)var1.id_throws[16] * 256.0F / 360.0F));
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_case();
      this.id_break = var1.id_private();
      this.id_byte = var1.readDouble();
      this.id_protected = var1.readDouble();
      this.id_throws = var1.readDouble();
      this.id_case = var1.readByte();
      this.id_catch = var1.readByte();
   }

   public int id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class);
      var1.id_class(this.id_break);
      var1.writeDouble(this.id_byte);
      var1.writeDouble(this.id_protected);
      var1.writeDouble(this.id_throws);
      var1.writeByte(this.id_case);
      var1.writeByte(this.id_catch);
   }

   public double id_throws() {
      return this.id_protected;
   }

   public byte id_catch() {
      return this.id_case;
   }

   public double id_case() {
      return this.id_throws;
   }

   public double id_protected() {
      return this.id_byte;
   }

   public byte id_private() {
      return this.id_catch;
   }
}
