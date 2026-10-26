package celestial;

import java.util.List;

public record rrTP() implements rrTu_1 {
   public float id_class;
   public List<rdn_3> id_break;
   public IJ[] id_byte;
   public int id_protected;
   public float id_throws;
   public float[] id_case;
   public float id_catch;
   public rgP_2 id_private;

   @Override
   public rgP_2 id_byte() {
      return this.id_private;
   }

   rrTP(List<rdn_3> var1, float var2, float var3, float[] var4, float var5, int var6, rgP_2 var7, IJ[] var8) {
      this.id_break = var1;
      this.id_class = var2;
      this.id_throws = var3;
      this.id_case = var4;
      this.id_catch = var5;
      this.id_protected = var6;
      this.id_private = var7;
      this.id_byte = var8;
   }

   @Override
   public float id_class() {
      return this.id_catch;
   }

   @Override
   public float id_break() {
      return this.id_throws;
   }

   @Override
   public float[] id_throws() {
      return this.id_case;
   }

   @Override
   public IJ[] id_catch() {
      return this.id_byte;
   }

   public int id_case() {
      return this.id_protected;
   }

   @Override
   public List<rdn_3> id_protected() {
      return this.id_break;
   }

   @Override
   public float id_private() {
      return this.id_class;
   }
}
