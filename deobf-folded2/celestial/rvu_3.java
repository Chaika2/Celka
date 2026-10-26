package celestial;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;

public class rvu_3 implements ruS_2<At_1> {
   private double id_class;
   private double id_break;
   private double id_byte;
   private float id_protected;
   private List<rfH_2> id_throws;
   private float id_case;
   private float id_catch;
   private float id_private;

   public float id_byte() {
      return this.id_catch;
   }

   public void id_byte(float var1) {
      this.id_private = var1;
   }

   public rvu_3() {
   }

   public rvu_3(double var1, double var3, double var5, float var7, List<rfH_2> var8, rjU_2 var9) {
      this.id_class = var1;
      this.id_break = var3;
      this.id_byte = var5;
      this.id_protected = var7;
      this.id_throws = Lists.newArrayList(var8);
      if (var9 != null) {
         this.id_case = (float)var9.id_break;
         this.id_catch = (float)var9.id_byte;
         this.id_private = (float)var9.id_protected;
      }
   }

   public void id_class(float var1) {
      this.id_case = var1;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = (double)var1.readFloat();
      this.id_break = (double)var1.readFloat();
      this.id_byte = (double)var1.readFloat();
      this.id_protected = var1.readFloat();
      int var2 = var1.readInt();
      this.id_throws = Lists.newArrayListWithCapacity(var2);
      int var3 = rfU_2.id_byte(this.id_class);
      int var4 = rfU_2.id_byte(this.id_break);
      int var5 = rfU_2.id_byte(this.id_byte);

      for (int var6 = 0; var6 < var2; var6++) {
         int var7 = var1.readByte() + var3;
         int var8 = var1.readByte() + var4;
         int var9 = var1.readByte() + var5;
         this.id_throws.add(new rfH_2(var7, var8, var9));
      }

      this.id_case = var1.readFloat();
      this.id_catch = var1.readFloat();
      this.id_private = var1.readFloat();
   }

   public void id_break(float var1) {
      this.id_catch = var1;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeFloat((float)this.id_class);
      var1.writeFloat((float)this.id_break);
      var1.writeFloat((float)this.id_byte);
      var1.writeFloat(this.id_protected);
      var1.writeInt(this.id_throws.size());
      int var2 = rfU_2.id_byte(this.id_class);
      int var3 = rfU_2.id_byte(this.id_break);
      int var4 = rfU_2.id_byte(this.id_byte);

      for (rfH_2 var6 : this.id_throws) {
         int var7 = var6.b_() - var2;
         int var8 = var6.c_() - var3;
         int var9 = var6.d_() - var4;
         var1.writeByte(var7);
         var1.writeByte(var8);
         var1.writeByte(var9);
      }

      var1.writeFloat(this.id_case);
      var1.writeFloat(this.id_catch);
      var1.writeFloat(this.id_private);
   }

   public float id_break() {
      return this.id_case;
   }

   public double id_throws() {
      return this.id_class;
   }

   public double id_catch() {
      return this.id_byte;
   }

   public double id_case() {
      return this.id_break;
   }

   public List<rfH_2> id_implements() {
      return this.id_throws;
   }

   public float id_protected() {
      return this.id_private;
   }

   public float id_private() {
      return this.id_protected;
   }
}
