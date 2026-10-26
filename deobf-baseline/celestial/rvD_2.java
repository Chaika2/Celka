package celestial;

import java.io.IOException;
import java.util.Set;

public class rvD_2 implements ruS_2<At_1> {
   private double id_class;
   private double id_break;
   private double id_byte;
   private float id_protected;
   private float id_throws;
   private Set<rvU_2> id_case;
   private int id_catch;

   public double id_byte() {
      return this.id_break;
   }

   public rvD_2() {
   }

   public rvD_2(double var1, double var3, double var5, float var7, float var8, Set<rvU_2> var9, int var10) {
      this.id_class = var1;
      this.id_break = var3;
      this.id_byte = var5;
      this.id_protected = var7;
      this.id_throws = var8;
      this.id_case = var9;
      this.id_catch = var10;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readDouble();
      this.id_break = var1.readDouble();
      this.id_byte = var1.readDouble();
      this.id_protected = var1.readFloat();
      this.id_throws = var1.readFloat();
      this.id_case = rvU_2.id_class(var1.readUnsignedByte());
      this.id_catch = var1.id_case();
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
      var1.writeByte(rvU_2.id_class(this.id_case));
      var1.id_protected(this.id_catch);
   }

   public float id_throws() {
      return this.id_protected;
   }

   public int id_catch() {
      return this.id_catch;
   }

   public float id_case() {
      return this.id_throws;
   }

   public double id_protected() {
      return this.id_byte;
   }

   public Set<rvU_2> id_private() {
      return this.id_case;
   }
}
