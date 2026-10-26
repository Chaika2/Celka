package celestial;

import java.io.IOException;
import java.util.UUID;

public class rFh_1 implements ruS_2<At_1> {
   private int id_class;
   private UUID id_break;
   private int id_byte;
   private double id_protected;
   private double id_throws;
   private double id_case;
   private int id_catch;
   private int id_private;
   private int id_implements;
   private byte id_finally;
   private byte id_extends;
   private byte id_native;

   public UUID id_byte() {
      return this.id_break;
   }

   public rFh_1() {
   }

   public rFh_1(iB_2 var1) {
      this.id_class = var1.V();
      this.id_break = var1.ro();
      this.id_byte = rVL.id_transient.id_class(var1.BC());
      this.id_protected = var1.rx();
      this.id_throws = var1.re();
      this.id_case = var1.BO();
      this.id_finally = (byte)((int)((Float)var1.id_throws[15] * 256.0F / 360.0F));
      this.id_extends = (byte)((int)((Float)var1.id_throws[16] * 256.0F / 360.0F));
      this.id_native = (byte)((int)((Float)var1.id_private[25] * 256.0F / 360.0F));
      double var2 = 3.9;
      rjU_2 var4 = var1.rv();
      double var5 = rfU_2.id_class(var4.id_break, -3.9, 3.9);
      double var7 = rfU_2.id_class(var4.id_byte, -3.9, 3.9);
      double var9 = rfU_2.id_class(var4.id_protected, -3.9, 3.9);
      this.id_catch = (int)(var5 * 8000.0);
      this.id_private = (int)(var7 * 8000.0);
      this.id_implements = (int)(var9 * 8000.0);
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_case();
      this.id_break = var1.id_private();
      this.id_byte = var1.id_case();
      this.id_protected = var1.readDouble();
      this.id_throws = var1.readDouble();
      this.id_case = var1.readDouble();
      this.id_finally = var1.readByte();
      this.id_extends = var1.readByte();
      this.id_native = var1.readByte();
      this.id_catch = var1.readShort();
      this.id_private = var1.readShort();
      this.id_implements = var1.readShort();
   }

   public int id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class);
      var1.id_class(this.id_break);
      var1.id_protected(this.id_byte);
      var1.writeDouble(this.id_protected);
      var1.writeDouble(this.id_throws);
      var1.writeDouble(this.id_case);
      var1.writeByte(this.id_finally);
      var1.writeByte(this.id_extends);
      var1.writeByte(this.id_native);
      var1.writeShort(this.id_catch);
      var1.writeShort(this.id_private);
      var1.writeShort(this.id_implements);
   }

   public double id_throws() {
      return this.id_protected;
   }

   public int id_finally() {
      return this.id_implements;
   }

   public double id_catch() {
      return this.id_case;
   }

   public byte id_extends() {
      return this.id_finally;
   }

   public double id_case() {
      return this.id_throws;
   }

   public int id_implements() {
      return this.id_private;
   }

   public int id_protected() {
      return this.id_byte;
   }

   public int id_private() {
      return this.id_catch;
   }

   public byte id_volatile() {
      return this.id_native;
   }

   public byte id_native() {
      return this.id_extends;
   }
}
