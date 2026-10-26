package celestial;

import java.io.DataOutput;
import java.io.IOException;

public class rcu_3 extends rcK_2 {
   public static final rcu_3 id_class = new rcu_3(0.0F);
   public static final rcv_3<rcu_3> id_break = new rcm_3();
   private final float id_byte;

   private rcu_3(float var1) {
      this.id_byte = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof rcu_3 && this.id_byte == ((rcu_3)var1).id_byte;
   }

   @Override
   public String toString() {
      return this.id_byte + "f";
   }

   @Override
   public int hashCode() {
      return Float.floatToIntBits(this.id_byte);
   }

   public static rcu_3 id_class(float var0) {
      return var0 == 0.0F ? id_class : new rcu_3(var0);
   }

   @Override
   public void id_class(DataOutput var1) throws IOException {
      var1.writeFloat(this.id_byte);
   }

   @Override
   public rgP_2 id_class(String var1, int var2) {
      rVi_1 var3 = new rgN_2("f").id_class(id_catch);
      return new rgN_2(String.valueOf(this.id_byte)).id_class(var3).id_class(id_case);
   }

   @Override
   public byte id_class() {
      return 5;
   }

   @Override
   public rcv_3<rcu_3> id_break() {
      return id_break;
   }

   @Override
   public long id_throws() {
      return (long)this.id_byte;
   }

   @Override
   public float id_finally() {
      return this.id_byte;
   }

   @Override
   public short id_catch() {
      return (short)(rfU_2.id_protected(this.id_byte) & 65535);
   }

   @Override
   public Number id_extends() {
      return this.id_byte;
   }

   @Override
   public int id_case() {
      return rfU_2.id_protected(this.id_byte);
   }

   @Override
   public double id_implements() {
      return (double)this.id_byte;
   }

   public rcu_3 id_protected() {
      return this;
   }

   @Override
   public byte id_private() {
      return (byte)(rfU_2.id_protected(this.id_byte) & 0xFF);
   }
}
