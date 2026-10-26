package celestial;

import java.io.IOException;

public class rvN_2 implements ruS_2<At_1> {
   private int id_class;
   private double id_break;
   private double id_byte;
   private double id_protected;
   private byte id_throws;
   private byte id_case;
   private boolean id_catch;

   public double id_byte() {
      return this.id_break;
   }

   public rvN_2() {
   }

   public rvN_2(an_3 var1) {
      this.id_class = var1.V();
      this.id_break = var1.rx();
      this.id_byte = var1.re();
      this.id_protected = var1.BO();
      this.id_throws = (byte)((int)((Float)var1.id_throws[15] * 256.0F / 360.0F));
      this.id_case = (byte)((int)((Float)var1.id_throws[16] * 256.0F / 360.0F));
      this.id_catch = var1.BL();
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
      this.id_throws = var1.readByte();
      this.id_case = var1.readByte();
      this.id_catch = var1.readBoolean();
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
      var1.writeByte(this.id_throws);
      var1.writeByte(this.id_case);
      var1.writeBoolean(this.id_catch);
   }

   public double id_throws() {
      return this.id_protected;
   }

   public byte id_catch() {
      return this.id_case;
   }

   public byte id_case() {
      return this.id_throws;
   }

   public double id_protected() {
      return this.id_byte;
   }

   public boolean id_private() {
      return this.id_catch;
   }
}
