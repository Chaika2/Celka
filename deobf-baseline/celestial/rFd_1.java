package celestial;

import java.io.IOException;

public class rFd_1 implements ruS_2<At_1> {
   private double id_class;
   private double id_break;
   private double id_byte;
   private float id_protected;
   private float id_throws;
   private float id_case;
   private float id_catch;
   private int id_private;
   private boolean id_implements;
   private rLx_1 id_finally;

   public double id_byte() {
      return this.id_class;
   }

   public rFd_1() {
   }

   public <T extends rLx_1> rFd_1(T var1, boolean var2, double var3, double var5, double var7, float var9, float var10, float var11, float var12, int var13) {
      this.id_finally = var1;
      this.id_implements = var2;
      this.id_class = var3;
      this.id_break = var5;
      this.id_byte = var7;
      this.id_protected = var9;
      this.id_throws = var10;
      this.id_case = var11;
      this.id_catch = var12;
      this.id_private = var13;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      Object var2 = rVL.id_switch.id_class(var1.readInt());
      if (var2 == null) {
         var2 = rLQ.id_byte;
      }

      this.id_implements = var1.readBoolean();
      this.id_class = var1.readDouble();
      this.id_break = var1.readDouble();
      this.id_byte = var1.readDouble();
      this.id_protected = var1.readFloat();
      this.id_throws = var1.readFloat();
      this.id_case = var1.readFloat();
      this.id_catch = var1.readFloat();
      this.id_private = var1.readInt();
      this.id_finally = this.id_class(var1, (rLz_1<rLx_1>)var2);
   }

   private <T extends rLx_1> T id_class(ruu_3 var1, rLz_1<T> var2) {
      return (T)var2.id_case().id_break(var2, var1);
   }

   public boolean id_break() {
      return this.id_implements;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeInt(rVL.id_switch.id_class(this.id_finally.id_protected()));
      var1.writeBoolean(this.id_implements);
      var1.writeDouble(this.id_class);
      var1.writeDouble(this.id_break);
      var1.writeDouble(this.id_byte);
      var1.writeFloat(this.id_protected);
      var1.writeFloat(this.id_throws);
      var1.writeFloat(this.id_case);
      var1.writeFloat(this.id_catch);
      var1.writeInt(this.id_private);
      this.id_finally.id_class(var1);
   }

   public double id_throws() {
      return this.id_byte;
   }

   public int id_finally() {
      return this.id_private;
   }

   public float id_catch() {
      return this.id_throws;
   }

   public rLx_1 id_extends() {
      return this.id_finally;
   }

   public float id_case() {
      return this.id_protected;
   }

   public float id_implements() {
      return this.id_catch;
   }

   public double id_protected() {
      return this.id_break;
   }

   public float id_private() {
      return this.id_case;
   }
}
