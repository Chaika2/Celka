package celestial;

import java.io.IOException;
import java.util.UUID;

public class rFJ implements ruS_2<At_1> {
   private int id_class;
   private UUID id_break;
   private double id_byte;
   private double id_protected;
   private double id_throws;
   private int id_case;
   private int id_catch;
   private int id_private;
   private int id_implements;
   private int id_finally;
   private aI_2<?> id_extends;
   private int id_native;

   public UUID id_byte() {
      return this.id_break;
   }

   public rFJ(an_3 var1, aI_2<?> var2, int var3, rfH_2 var4) {
      this(
         var1.V(),
         var1.ro(),
         (double)var4.b_(),
         (double)var4.c_(),
         (double)var4.d_(),
         (Float)var1.id_throws[16],
         (Float)var1.id_throws[15],
         var2,
         var3,
         var1.rv()
      );
   }

   public rFJ(an_3 var1, int var2) {
      this(var1.V(), var1.ro(), var1.rx(), var1.re(), var1.BO(), (Float)var1.id_throws[16], (Float)var1.id_throws[15], var1.BC(), var2, var1.rv());
   }

   public rFJ() {
   }

   public rFJ(int var1, UUID var2, double var3, double var5, double var7, float var9, float var10, aI_2<?> var11, int var12, rjU_2 var13) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var5;
      this.id_throws = var7;
      this.id_implements = rfU_2.id_protected(var9 * 256.0F / 360.0F);
      this.id_finally = rfU_2.id_protected(var10 * 256.0F / 360.0F);
      this.id_extends = var11;
      this.id_native = var12;
      this.id_case = (int)(rfU_2.id_class(var13.id_break, -3.9, 3.9) * 8000.0);
      this.id_catch = (int)(rfU_2.id_class(var13.id_byte, -3.9, 3.9) * 8000.0);
      this.id_private = (int)(rfU_2.id_class(var13.id_protected, -3.9, 3.9) * 8000.0);
   }

   public rFJ(an_3 var1) {
      this(var1, 0);
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_case();
      this.id_break = var1.id_private();
      this.id_extends = rVL.id_transient.id_class(var1.id_case());
      this.id_byte = var1.readDouble();
      this.id_protected = var1.readDouble();
      this.id_throws = var1.readDouble();
      this.id_implements = var1.readByte();
      this.id_finally = var1.readByte();
      this.id_native = var1.readInt();
      this.id_case = var1.readShort();
      this.id_catch = var1.readShort();
      this.id_private = var1.readShort();
   }

   public int id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class);
      var1.id_class(this.id_break);
      var1.id_protected(rVL.id_transient.id_class(this.id_extends));
      var1.writeDouble(this.id_byte);
      var1.writeDouble(this.id_protected);
      var1.writeDouble(this.id_throws);
      var1.writeByte(this.id_implements);
      var1.writeByte(this.id_finally);
      var1.writeInt(this.id_native);
      var1.writeShort(this.id_case);
      var1.writeShort(this.id_catch);
      var1.writeShort(this.id_private);
   }

   public double id_throws() {
      return this.id_protected;
   }

   public int id_finally() {
      return this.id_implements;
   }

   public double id_catch() {
      return (double)this.id_case / 8000.0;
   }

   public int id_extends() {
      return this.id_finally;
   }

   public double id_case() {
      return this.id_throws;
   }

   public double id_implements() {
      return (double)this.id_private / 8000.0;
   }

   public double id_protected() {
      return this.id_byte;
   }

   public double id_private() {
      return (double)this.id_catch / 8000.0;
   }

   public int id_volatile() {
      return this.id_native;
   }

   public aI_2<?> id_native() {
      return this.id_extends;
   }
}
