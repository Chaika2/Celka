package celestial;

import java.io.DataOutput;
import java.io.IOException;

public class rcz_3 extends rcK_2 {
   public static final rcz_3 id_class = new rcz_3(0.0);
   public static final rcv_3<rcz_3> id_break = new rcQ_2();
   private final double id_byte;

   private rcz_3(double var1) {
      this.id_byte = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof rcz_3 && this.id_byte == ((rcz_3)var1).id_byte;
   }

   @Override
   public String toString() {
      return this.id_byte + "d";
   }

   @Override
   public int hashCode() {
      long var1 = Double.doubleToLongBits(this.id_byte);
      return (int)(var1 ^ var1 >>> 32);
   }

   public static rcz_3 id_class(double var0) {
      return var0 == 0.0 ? id_class : new rcz_3(var0);
   }

   @Override
   public void id_class(DataOutput var1) throws IOException {
      var1.writeDouble(this.id_byte);
   }

   @Override
   public rgP_2 id_class(String var1, int var2) {
      rVi_1 var3 = new rgN_2("d").id_class(id_catch);
      return new rgN_2(String.valueOf(this.id_byte)).id_class(var3).id_class(id_case);
   }

   @Override
   public byte id_class() {
      return 6;
   }

   @Override
   public rcv_3<rcz_3> id_break() {
      return id_break;
   }

   @Override
   public long id_throws() {
      return (long)Math.floor(this.id_byte);
   }

   @Override
   public float id_finally() {
      return (float)this.id_byte;
   }

   @Override
   public short id_catch() {
      return (short)(rfU_2.id_byte(this.id_byte) & 65535);
   }

   @Override
   public Number id_extends() {
      return this.id_byte;
   }

   @Override
   public int id_case() {
      return rfU_2.id_byte(this.id_byte);
   }

   @Override
   public double id_implements() {
      return this.id_byte;
   }

   public rcz_3 id_protected() {
      return this;
   }

   @Override
   public byte id_private() {
      return (byte)(rfU_2.id_byte(this.id_byte) & 0xFF);
   }
}
